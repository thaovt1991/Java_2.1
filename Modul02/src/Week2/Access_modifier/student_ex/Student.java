package Week2.Access_modifier.student_ex;

public class Student {
    private  String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return this.name ;
    }
    public String getClasses() {
        return this.classes ;
    }
    protected   void setName(String name){
        this.name = name ;
    }
    protected void setClasses(String classes){
        this.classes = classes ;
    }
    @Override
    public String toString(){
     return "Name 's student : "+ this.name + "\nClass : " + this.classes ;
    }

}
