package uebung6.uebung6_1;

import java.lang.reflect.Field;


public class Main {


    public static void main(String[] args) {
        printObjectsAttributes(Student.class);
    }


    private static void printObjectsAttributes(Class clazz) {

        Field[] attributes = clazz.getDeclaredFields();

        System.out.print("> " + clazz.getSimpleName() + "\n");

        //recursivly getting the variables of other classes (foreign key)
        for (Field field : attributes) {
            System.out.println("   >" + field.getName());
            Class foreignKeyClass = field.getType();
            ForeignKey annotation = field.getAnnotation(ForeignKey.class);

            if (annotation != null) {
                printObjectsAttributes(foreignKeyClass);
            }
        }
    }

}
