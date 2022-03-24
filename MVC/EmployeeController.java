package MVC;

public class EmployeeController {

    private EmployeeModel employeeModel;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeModel model, EmployeeView view)
    {
        this.employeeModel = model;
        this.employeeView = view;
    }

    public void setEmployeeName(String name)
    {
        employeeModel.setEmployeeName(name);
    }

    public void setEmployeeID(String id)
    {
        employeeModel.setEmployeeID(id);
    }

    public String getEmployeeName()
    {
        return employeeModel.getEmployeeName();
    }

    public String getEmployeeID()
    {
        return employeeModel.getEmployeeID();
    }

    public void printEmployeeInfo()
    {
        employeeView.viewEmployee(getEmployeeName(), getEmployeeID());
    }


    
}
