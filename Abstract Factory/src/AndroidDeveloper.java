public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println(40000);
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("Android developer");
        return "Android developer";
    }
}
