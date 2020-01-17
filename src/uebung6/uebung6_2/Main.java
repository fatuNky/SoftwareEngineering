package uebung6.uebung6_2;

import java.lang.reflect.Field;

public class Main {


    public static void main(String[] args) throws IllegalAccessException {

        City kn = new City();
        kn.setName("Konstanz");
        kn.setState("BW");
        kn.setZipCode("78464");

        Address address = new Address();
        address.setCity(kn);
        address.setHouseNumber(21);
        address.setStreet("Seestraße");

        Student max = new Student();
        max.setName("Max Mustermann");
        max.setAddress(address);


        printObjectsAttributes(max);
    }


    private static void printObjectsAttributes(Object unknownObject) throws IllegalAccessException {

        Field[] attributes = unknownObject.getClass().getDeclaredFields();

        System.out.println("> " + unknownObject.getClass().getSimpleName());

        for (Field field : attributes) {
            field.setAccessible(true);
            ForeignKey annotation = field.getAnnotation(ForeignKey.class);

            if (annotation != null) {
                printObjectsAttributes(field.get(unknownObject));
            }
            if (annotation == null) {
                System.out.println("   >" + field.getName() + ": " + field.get(unknownObject));
            }
        }
    }
}
