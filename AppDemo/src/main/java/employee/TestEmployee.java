package employee;

public class TestEmployee {

    public static void main(String[] args){
      //  int n=10;
        Employee[] employee=new Employee[10];
        for (int i = 1; i <= employee.length; i++) {
            employee[i]= new Employee(i,"name_"+i,i+100);
            System.out.println(employee[i].getEmployeeId()+" "+employee[i].getName()+" "+employee[i].getSalary());
        }


    }
}
