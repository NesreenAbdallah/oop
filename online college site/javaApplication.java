*/import java.util.Scanner;
public class OopTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        student std1=new student(19,"cairo","2nd","communication");
        student std2=new student(20,"cairo","2nd","Electronics");
        std1.setname("Ali");
        std2.setname("Mohamed");
        
        
        employee emp1=new employee(35,"ismailia",4500,"teaccher");
        employee emp2=new employee(40,"portsaid",3500,"teaccherassitant");
        emp1.setname("Khaled");
        emp2.setname("Adham");
        
        
        int ID;
        System.out.println("Enter your ID");
        ID=input.nextInt();
        switch(ID)
        {
            case 1:System.out.println("Name: "+std1.getname()+"\nAge: "+std1.getage()+"\nAddress: "+std1.getaddress()+"\nStudentLevel:"+std1.getstudentlevel()+"\nDepartment: "+std1.getdepartmnt());
                break;
            case 2:System.out.println("Name: "+std2.getname()+"\nAge: "+std2.getage()+"\nAddress: "+std2.getaddress()+"\nStudentLevel:"+std2.getstudentlevel()+"\nDepartment: "+std2.getdepartmnt());
                break;
            case 3:System.out.println("Name: "+emp1.getname()+"\nAge: "+emp1.getage()+"\nAddress: "+emp1.getaddress()+"\nSalary:"+emp1.getsalary()+"\njop: "+emp1.getjob());
                break;
             case 4:System.out.println("Name: "+emp2.getname()+"\nAge: "+emp2.getage()+"\nAddress: "+emp2.getaddress()+"\nSalary:"+emp2.getsalary()+"\njop: "+emp2.getjob());
                break;
             default:System.out.println("Wrong ID");
        }
 }
    }
    

