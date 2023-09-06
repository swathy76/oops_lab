import java.util.Scanner;
 class person
 {
    String Name;
    String Gender;
    String Address;
    int Age;
    person(String name,String gender,String address, int age) 
	{
        this.Name = name;
        this.Gender = gender;
        this.Address = address;
        this.Age = age;
    }
}

class Employee extends person
{
 int Empid;
 String C_name;
 String Quali;
 long Salary;
 
 Employee(String name,String gender,String address, int age,int empid, String c_name, String quali,long salary)
 {
     super(name,gender,address,age);
     this.Empid= empid;
     this.C_name=c_name;
     this.Quali=quali;
     this.Salary=salary;
 }
}

 public class Teacher extends Employee
 {
     String Subject;
     String Department;
     String Teacherid;
    Teacher(String name,String gender,String address, int age,int empid, String c_name, String quali,long salary, String subject, String department, String teacherid)
	{
        super(name,gender,address,age,empid,c_name,quali,salary);
        this.Subject=subject;
        this.Department=department;
        this.Teacherid=teacherid;
    } 

    void display()
	{
        System.out.print("\nName: "+Name);
        System.out.print("\nGender: "+Gender);
        System.out.print("\nAddress: "+Address);
        System.out.print("\nAge: "+Age);
        System.out.print("\nEmployee id: "+Empid);
        System.out.print("\nCompany Name: "+C_name);
        System.out.print("\nQualification: "+Quali);
        System.out.print("\nSalary: "+Salary);
        System.out.print("\nSubject: "+Subject);
        System.out.print("\nDepartment: "+Department);
        System.out.print("\nTeacher id: "+Teacherid);

     }
     public static void main(String[] args) 
	 {
        System.out.println("\nEnter the No. of Teachers");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Teacher arr[]=new Teacher[num];
        System.out.println("\n Enter the Teacher Details\n");
        int x = 0,j=0;
        Scanner sc =new Scanner(System.in);
        for(int i =0;i<num;i++)
        {
            x = i +1;
            System.out.print("\n\n"+x+").");
            System.out.print("\n Name: ");
            String a =sc.next();
            System.out.print("\n Gender: ");
            String b =sc.next();
            System.out.print("\n Address: ");
            String c =sc.next();
            System.out.print("\n Age: ");
            int d =sc.nextInt();
            System.out.print("\n Employee id: ");
            int e =sc.nextInt();
            System.out.print("\n Company name: ");
            String f =sc.next();
            System.out.print("\n Qualification: ");
            String g =sc.next();
            System.out.print("\n Salary: ");
            long h =sc.nextLong();
            System.out.print("\n Subject: ");
            String k =sc.next();
            System.out.print("\n Department: ");
            String l =sc.next();
            System.out.print("\n Teacher Id: ");
            String n =sc.next();
            arr[i]=new Teacher(a,b,c,d,e,f,g,h,k,l,n);
        }
        sc.close();
        System.out.println("\n********Informations of all the Teachers************");
        for(int i=0;i<num;i++){
            j=i+1;
            System.out.println("\n\n"+j+").");
            arr[i].display();
            
     }
     sc1.close();
     }
    
 }