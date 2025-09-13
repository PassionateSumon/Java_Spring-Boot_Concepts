interface Animal {
    private void sound() {
        System.out.println("Sound private..");
    }; 
    
    default void checkSound() {
        sound();
        System.out.println("Sound checked..");
    }

    static void show(String name) {
        System.out.println("Hey " + name);
    }
}

class Demo implements Animal {
    
}

class Student {
    private String name;

    Student setName(String name) {
        this.name = name;
        return this;
    }

    void displayName() {
        System.out.println("Name: " + this.name);
    }
}

public class ExampleThisKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sumon").displayName();

        Demo d = new Demo();
        d.checkSound();
    }
}
