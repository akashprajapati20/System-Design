public class Webdeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println(50000);
        return 500000;
    }

    @Override
    public String name() {
        System.out.println("Web developer");
        return "Web developer";
    }
}
