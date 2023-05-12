package rafael.alcocer.caldera.model;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;
    
    public String myName() {
        return "NAME";
    }
    
    public String createAddress() {
        return "Address";
    }
    
    public void results() {
        System.out.println("Results");
    }
}
