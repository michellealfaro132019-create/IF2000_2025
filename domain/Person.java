package domain;

public class Person{

//Atributes global 
private String name; 
private String lastName; 
private String id; 
private String phone; 
private int age; 
 
//Constructor
public Person(String name, String lastName,String id, String phone,int age ){
this.name=name; 
this.lastName=lastName; 
this.id=id; 
this.phone=phone; 
this.age=age; 
}

public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastName;
    }
    public void setLastname(String lastname) {
        lastName = lastname;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }   
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + getName() 
        + ", Lastname=" + getLastname()
        + ", id=" + getId()
        + ", phone=" + getPhone()
         + ", age=" + getAge();
    }
}