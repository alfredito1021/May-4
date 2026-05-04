public class Weapon
{
    private String name;
    private int damage; 
    private double weight;

    public Weapon(String name, int damage, double weight)
    {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
    } 

    public String getName() { return name; }
    public int getDamage() { return damage; }
    public double getWeight() {return weight; }

    public String toString()
    {
       return "Weapon: " + name + "," + " Damage: " + damage + ", Weight: " + weight;
    }
   
}