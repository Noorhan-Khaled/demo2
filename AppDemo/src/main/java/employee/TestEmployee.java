package employee;

public class TestEmployee {

    public static void main(String[] args) {
        int n=10;
        Employee[] employee=new Employee[n];
        for (int i = 1; i <= employee.length; i++) {
            employee[i] = new Employee();
            System.out.println(employee[i].getEmployeeId()+" name_"+employee[i].getName()+" "+employee[i].getSalary()+100);
        }


    }
}
