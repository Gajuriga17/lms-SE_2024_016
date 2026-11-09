public class Student {
    private String name;
    private int age;
    private double GPA;

    public Student(String name,int age,double GPA){
        this.name=name;
        this.age=age;
        this.GPA=GPA;
    }
    public  void display(){
        System.out.println("name"+ name);
        System.out.println("age"+ age);
        System.out.println("GPA"+ GPA);
    }
    public void checkresults(){
        if(GPA>2.0){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
