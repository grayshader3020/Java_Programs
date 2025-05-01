package Construcutor_Overloading;

public class GoogleForm{
    String name;
    long phoneNumber;
    long telephoneNumber;
    char gender;
    String bloodGroup;
    String email;
    String dob;

    GoogleForm(){

    }
    GoogleForm(String name,char gender, String dob)
    {
        this.name=name;
        this.gender=gender;
        this.dob=dob;

    }
    GoogleForm(String name, long phoneNumber,char gender, String dob)
    {
        this.name=name;
        this.gender=gender;
        this.dob=dob;

        //extra
        this.phoneNumber=phoneNumber;
    }
    GoogleForm(String name,long phoneNumber,char gender, String dob,String bloodGroup)
    {
        this.name=name;
        this.gender=gender;
        this.dob=dob;
        //extra
        this.phoneNumber=phoneNumber;
        this.bloodGroup=bloodGroup;
    }
    GoogleForm(String name,long phoneNumber,char gender, String dob,String bloodGroup,String email)
    {
        this.name=name;
        this.gender=gender;
        this.dob=dob;
        //extra
        this.phoneNumber=phoneNumber;
        this.bloodGroup=bloodGroup;
        this.email=email;
    }

    public void displayForm()
    {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("DOB: "+dob);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Email: "+email);
        System.out.println("Blood Group: "+bloodGroup);
    }
}
