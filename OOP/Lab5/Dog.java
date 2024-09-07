public class Dog {
    public  String name;
    public String color;

    public Dog() {
        this.name = "A dog";
        this.color = "No color";
    }


    public void changeName(String name) {
        this.name = name;
    }


    public void changeColor(String color) {
        this.color = color;
        System.out.println(name + " is " + color);
    }

    
    public String bark() {
        if (color.equals("No color")) {
            return name + " is barking";
        } else if (name.equals("A dog")) {
            return color + " dog is barking";
        } else {
            return name + " the " + color + " dog is barking";
        }
    }
}
