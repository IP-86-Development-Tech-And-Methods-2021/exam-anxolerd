import java.util.Date;

public class HelloExam{
  private Date date;

  public static void main(String[] args){
    HelloExam greeter = new HelloExam();
    greeter.greet();
  }

  HelloExam() {
    this.date = new Date();
  }

  public void greet() {
    System.out.println("Hello Exam!");
    System.out.println("Today is " + this.date);
  }
}
