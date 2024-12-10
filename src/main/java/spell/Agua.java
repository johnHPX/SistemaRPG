package spell;

public class Agua implements Feitico{
    @Override
    public void lancar() {
        System.out.println("Laçou feitiço de "+this.getClass().getName());
    }
}
