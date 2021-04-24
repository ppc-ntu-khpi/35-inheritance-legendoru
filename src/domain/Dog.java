package domain;


 /**
 * The class Dog extends predator
 */ 
public class Dog extends Predator {

    private String kind;


/** 
 *
 * Dog constructor with all fields
 *
 * @param name  the name
 * @param kind  the kind
 * @param weight  the weight
 * @param age  the age
 */
    public Dog(String name, String kind, int weight, int age) { 

        this.name = name;
        this.kind = kind;
        this.weight = weight;
        this.age = age;
    }


/** 
 *
 * Dog default constructor
 *
 */
    public Dog() { 

        this("Jack", "Irish wolfhound", 60, 4);
    }
    

/** 
 *
 * Dog constructor with name
 *
 * @param name  the name
 */
    public Dog(String name) { 

        this(name, "Irish wolfhound", 60, 4);
    }


/** 
 *
 * Play
 *
 */
    public void play() { 

        System.out.println("Dog is palying...");
    }
    
    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Dog hunting...");
    }
    
    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString() + "\nKind:\t" + this.kind + "\n\nThis iS Dog!";
    }
    
    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Woof...");
    }
    
    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Dog eats meat...");
    }
}
