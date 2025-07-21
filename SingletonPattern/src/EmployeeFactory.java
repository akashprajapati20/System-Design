public class EmployeeFactory {


    public static Employee getEmployee(String empSTR){
        if(empSTR.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        } else if (empSTR.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new Webdeveloper();
        }else{
            return null;
        }
    }
}
