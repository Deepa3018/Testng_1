package logical_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
    salarycalculation  empBusinessLogic = new salarycalculation ();
    Employeedetails  employee = new Employeedetails ();

    @Test
    public void testCalculateAppriasal() {

        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(12000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(1000, appraisal, 0.0, "500");
    }

    // Test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {

        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(96000, salary, 0.0, "8000");
    }
}

