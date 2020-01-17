package uebung6.uebung6_2;


public class Student {

    private String name;

    @ForeignKey(clazz = Address.class)
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
