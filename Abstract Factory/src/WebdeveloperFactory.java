public class WebdeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Webdeveloper();
    }
}
