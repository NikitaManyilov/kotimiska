public class Cat {
    public String name;
    public int apetit;
    public boolean satiety;
    public Cat(String name, int apetit, boolean satiety) {
        this.name = name;
        this.apetit = apetit;
        this.satiety = satiety;
    }
    public void eat(Bowl p) {
        p.decreaseFood(apetit);
    }
}