public class Inventory
{
    private Weapon[] weapons;
    private int count; 

   
    public Inventory(int capacity) {
        weapons = new Weapon[capacity];
        count = 0;
    }

    public void addWeapon(Weapon w) 
    {
        if (count < weapons.length) 
        {
            weapons[count] = w;
            count++;
        } else 
        {
            System.out.println("Full inventory ! You can't pick the " + w.getName() + " up !");
        }
    }

    public int getCount() 
    {
        return count;
    }

    public double totalWeight() 
    {
        double total = 0.0;
        for (int i = 0; i < count; i++) 
        {
            total += weapons[i].getWeight();
        }
        return total;
    }

    
    public String toString() 
    {
        String result = "";
        for (int i = 0; i < count; i++) 
        {
            result += weapons[i] + "\n";
        }
        return result;
    }
}
