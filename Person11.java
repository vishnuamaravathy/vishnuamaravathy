
class Person11
{
 public static void main(String []args)
 {
    Teacher tch[]=new Teacher[2];
    tch[0]=new Teacher("Aju","male","karakonam",25,101,"Wipro","MCA",400000,"Computer Science","PG",50001);
    tch[1]=new Teacher("Anagha","female","kunnathukal",21,102,"Infosys","MSC",350000,"Data Structure","PG",50002);
    tch[0].display();
    tch[1].display();
 }
}
class person
{
  int age;
  String gender;
  String address;
  String personname;
  person(String name,String gen,String addr,int age)
  {
    this.personname=name;
    this.gender=gen;
    this.address=addr;
    this.age=age;
  }
  protected void display()
  {
    System.out.println("Name : "+personname);
    System.out.println("Gender : "+gender);
    System.out.println("Address : "+address);
    System.out.println("Age : "+age);
  }
    
}


class Employee extends person
{
  int EmpId;
  String CompanyName;
  String Qualification;
  int Salary;
  Employee(String nme,String ge,String ad,int ag,int Id,String CompName,String Qual,int Sal)
  {
    super(nme,ge,ad,ag);
    this.EmpId=Id;
    this.CompanyName=CompName;
    this.Qualification=Qual;
    this.Salary=Sal;
  }
  protected void display()
  {
    super.display();
    System.out.println("Employee Id : "+EmpId);
    System.out.println("CompanyName : "+CompanyName);
    System.out.println("Age : "+Qualification);
    System.out.println("Salary : "+Salary);
  }
}


class Teacher extends Employee
{
  String Subject;
  String Department;
  int TeacherId;
  Teacher(String nme,String ge,String ad,int ag,int Id,String CompName,String Qual,int Sal,String sub,String dep,int tchid)
  {
    super(nme,ge,ad,ag,Id,CompName,Qual,Sal);
    this.Subject=sub;
    this.Department=dep;
    this.TeacherId=tchid;
  }
  public void display()
  {
    System.out.println("..........................");
    super.display();
    System.out.println("Subject : "+Subject);
    System.out.println("Department : "+Department);
    System.out.println("Teacher Id : "+TeacherId);
    System.out.println("..........................");
  }
}    
