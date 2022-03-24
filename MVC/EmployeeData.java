package MVC;

public class EmployeeData {

    private static EmployeeModel employeeModel = new EmployeeModel();
    
    public EmployeeModel GetEmployeeData()
    {
        employeeModel.setEmployeeName("shafey");
        employeeModel.setEmployeeID("123");

        return employeeModel;
    }
    
}
