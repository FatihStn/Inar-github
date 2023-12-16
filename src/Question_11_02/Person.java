package Question_11_02;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    public Person(){
        this(" "," "," "," ");
    }
    public Person(String name,String address,String phoneNumber,String emailAddress){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;

    }
}
