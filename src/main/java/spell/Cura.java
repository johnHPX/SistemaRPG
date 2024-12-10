package spell;

public class Cura implements Feitico{
    @Override
    public void lancar() {
        System.out.println("Laçou feitiço de "+this.getClass().getName());
    }
}
