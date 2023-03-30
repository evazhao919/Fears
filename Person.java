public class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;
     private final int age;
     private final String fear;
   

    public Person(String firstName,String middleName,String lastName,int age,String fear) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.fear = fear;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getmiddleName() {
        return middleName;
    }
    public String getlastName() {
        return lastName;
    }
    public int getage() {
        return age;
    }
    public String getfear() {
        return fear;
    }
    

    @Override
    public String toString() {
        return String.format(
            "Person firstName=%s middleName=%s lastName=%s age=%d fear=%s",
            this.firstName,this.middleName,this.lastName,this.age,this.fear
        );
        
        
    }
}