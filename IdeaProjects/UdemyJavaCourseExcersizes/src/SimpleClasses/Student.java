package SimpleClasses;
//This is for course number 110. Student challenge
public class Student {

    public int go=0;
    public String name="";
    public String course="";
    public int m1=0,m2=0,m3=0;

    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return (m1+m2+m3)/3;
    }
    public String grade(){
        return average() >60 ? "A":"B";
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student s = new Student();
        s.go=6;
        s.name="fatma";
        s.course="math";
        s.m1=100;
        s.m2=95;
        s.m3=90;
        System.out.println("total is "+s.total());
        System.out.println("average is "+s.average());
        System.out.println("grade is "+s.grade());

    }
}