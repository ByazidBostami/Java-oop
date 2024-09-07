public class MagicItem {
    public String name;
    public int energyLevel;
    public String[] items;

   
    public MagicItem() {
        this.energyLevel = 0;
        this.items = new String[3];
    }

    
    public void newCharacter(String name) {
        this.name = name;
    }

    
    public void findItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println(name + " found a " + item);
                return;
            }
        }
        System.out.println("All item slots occupied.");
    }

    
    public void useItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) {
                items[i] = null;
                int energyBoost = 0;
                switch (item) {
                    case "Potion":
                        energyBoost = 50;
                        break;
                    case "Elixir":
                        energyBoost = 100;
                        break;
                    case "Amulet":
                        energyBoost = 200;
                        break;
                }
                energyLevel += energyBoost;
                System.out.println(name + " used a " + item);
                System.out.println("Energy Level after using item: " + energyLevel);
                return;
            }
        }
        System.out.println("Item not in inventory.");
    }

    
    public void displayInfo() {
        System.out.println("Character Name: " + name);
        System.out.println("Energy Level: " + energyLevel);
        for (int i = 0; i < items.length; i++) {
            System.out.println("Item " + (i + 1) + ": " + items[i]);
        }
    }
}
