package MVC;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeModel model = new EmployeeData().GetEmployeeData();
        
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.printEmployeeInfo();
        

    }


    

}
