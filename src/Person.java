public abstract class Person {

    private String name;
    private int age;
    private int height;
    private int weight;


    public Person(String name, int age, int height, int weight) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public void info() {
        System.out.println("Person: " + name + ", " + age + " years old, height: " + height + " cm");
    }


    public abstract void die ();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else if (age < 0) {
            System.err.print("Error. " + getName() + "'s age was entered negative. ");
            System.out.println("Please, enter some positive number for age");
        } else {
            System.err.print("Error. " + getName() + "'s age was entered incorrectly. ");
            System.out.println("Please, enter some positive number for age");
        }
    }

    public void setHeight(int height) {
        if (height >= 45) {
            this.height = height;;
        } else if (height < 0) {
            System.err.print("Error. " + getName() + "'s height was entered negative. ");
            System.out.println("Please, enter some positive number for height");
        } else if (height >= 0 && height < 45) {
            System.err.print("Error. Perhaps " + getName() + "'s height was entered incorrectly. ");
            System.out.println("Height is so small. The normal height cannot be less than 45 cm. Are you sure that the height is " + height + "cm?");
        }        else {
            System.err.print("Error. " + getName() + "'s height was entered incorrectly. ");
            System.out.println("Please, enter some positive number for height");
        }
    }

    public void setWeight(int weight) {
        if (weight >= 2) {
            this.weight = weight;
        } else if (weight < 0) {
            System.err.print("Error. " + getName() + "'s weight was entered negative. ");
            System.out.println("Please, enter some positive number for weight");
        } else if (height >= 0 && height < 2) {
            System.err.print("Error. Perhaps " + getName() + "'s weight was entered incorrectly. ");
            System.out.println("Height is so small. The normal height cannot be less than 2 kg. Are you sure that the height is " + weight + "kg?");
        } else {
            System.err.print("Error. " + getName() + "'s weight was entered incorrectly. ");
            System.out.println("Please, enter some positive number for weight");
        }
    }
}

