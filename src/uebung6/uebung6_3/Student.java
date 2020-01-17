package uebung6.uebung6_3;



@Entity("soe_student")
public class Student {

    @ID
    private int studentID;

    @Column(generationType = Column.GenerationType.SnakeCase)
    private String name;

    @Column(generationType= Column.GenerationType.SnakeCase)
    private String surName; // -> sur_name

    @Column(generationType= Column.GenerationType.CamelCase)
    private int age; // -> age

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
