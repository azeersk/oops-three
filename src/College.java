public class College {
    private int Id;
    private String Name;
    private String Stream;
    private int Year;
    private int Age;

    public int GetId(){
        return Id;
    }
    public String GetName(){
        return Name;
    }
    public String GetStream(){
        return Stream;
    }
    public int GetYear(){
        return Year;
    }
    public int GetAge(){
        return Age;
    }


    public void SetId(int id){
        Id = id;
    }
    public void SetName(String name){
        Name = name;
    }
    public void SetStream(String stream){
        Stream = stream;
    }
    public void SetYear(int year){
        Year = year;
    }
    public void SetAge(int age){
        Age = age;
    }
}

class Student{
    public static void main(String[] args) {
        College college = new College();
        college.SetId(11805521);
        college.SetName("Shaik Azeer Saheb");
        college.SetStream("Computer Science and Engineering");
        college.SetYear(4);
        college.SetAge(20);
        System.out.println("Id: "+college.GetId());
        System.out.println("Name: "+college.GetName());
        System.out.println("Stream: "+college.GetStream());
        System.out.println("Year: "+college.GetYear()+"rth Year");
        System.out.println("Age: "+college.GetAge()+" Years old");
    }
}