public class Student{
    private String firstname;
    private String lastname;
    private String email;
    private String standing;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private int studentID;
    private static int scount;


    public Student(String firstname,String lastname,int studentID,String standing,String email,String address,String city, String state,int zipcode) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.standing=standing;
        this.address=address;
        this.studentID=studentID;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;

    }
    public Student() {
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.standing=standing;
        this.address=address;
        this.studentID=studentID;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;

    }
public void setValues(String firstname,String lastname,int studentID,String standing,String email,String address,String city, String state, int zipcode){
    this.firstname=firstname;
    this.lastname=lastname;
    this.email=email;
    this.standing=standing;
    this.address=address;
    this.studentID=studentID;
    this.city=city;
    this.state=state;
    this.zipcode=zipcode;
}
public String getFirstname(){
        return firstname;
}
public String getLastname(){
        return lastname;
}
public int getStudentID(){
        return studentID;
    }
    public String getStanding(){
        return standing;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZipcode(){
        return zipcode;
    }
    public static int incrementcount(){
        scount=scount+1;
        return (scount);
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){this.lastname=lastname;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setStanding(String standing){
        this.standing=standing;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setStudentID(int studentID){this.studentID=studentID;}
    public void setCity(String city){this.city=city;}
    public void setState(String state){this.state=state;}
    public void setZipcode(int zipcode){this.zipcode=zipcode;}
    public  void displayInfo(){
        System.out.println("Students Details, Department of ILT \t");
        System.out.println("The student's first name is :  \t"+firstname);
        System.out.println("The student's last name is : \t"+lastname);
        System.out.println("The student's ID is : \t"+studentID);
        System.out.println("The student's standing is : \t" +standing);
        System.out.println("The student's email ID is : \t"+email);
        System.out.println("The student's address is :\t "+address+", "+city+","+state+","+zipcode);
        System.out.println("Number of students : \t"+scount);

    }
}
