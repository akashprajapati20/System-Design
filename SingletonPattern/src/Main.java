//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Samosa s= Samosa.getSamosa();

       Employee e1= EmployeeFactory.getEmployee("WEB developer");
       e1.salary();
    }
}