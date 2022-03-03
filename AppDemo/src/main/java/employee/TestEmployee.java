package employee;

public class TestEmployee {

    public static void main(String[] args){
      //  int n=10;
        Employee[] employee=new Employee[10];
        for (int i = 1; i <= employee.length; i++) {
            employee[i]= new Employee();
            employee[i].setEmployeeId(i);
            employee[i].setName("name_"+i);
            employee[i].setSalary(i*1000);
            System.out.println(employee[i].getEmployeeId()+" "+employee[i].getName()+" "+employee[i].getSalary());
        }


    }
}
