package uebung6.uebung6_3;

import java.lang.reflect.Field;


public class Main {

    public static void main(String[] args) {

        generateSQL(Student.class);
    }


    public static void generateSQL(Class unknownClass) {

        String sql = "CREATE TABLE " + unknownClass.getSimpleName() + " (";

        Field[] fields = unknownClass.getDeclaredFields();


        for (Field field : fields) {


            Column annotation = field.getAnnotation(Column.class);
            ID annotationID = field.getAnnotation(ID.class);


            if (annotationID!=null){
                sql+= field.getName() + " int PRIMARY KEY, ";
            }

            if (annotation != null) {

                if (annotation.generationType().equals(Column.GenerationType.lowerCase)) {
                    System.out.println(field.getName());

                    sql += field.getName().toLowerCase();
                } else if (annotation.generationType().equals(Column.GenerationType.SnakeCase)) {
                    String regex = "([a-z])([A-Z]+)";
                    String replacement = "$1_$2";

                    sql += field.getName().replaceAll(regex, replacement).toLowerCase();
                } else {
                    sql += field.getName();
                }

                Class type = field.getType();
                if (type.equals(String.class)) {
                    sql += " varchar(255)";
                } else if (type.equals(int.class)) {
                    sql += " int";
                }

                sql += ", ";
            }
        }

        sql = sql.trim().replaceAll(",$", "");
        sql += ");";

        System.out.println(sql);
    }

}
