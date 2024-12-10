package spell;

public class Gelo implements Feitico{
    @Override
    public void lancar() {
        System.out.println("Laçou feitiço de "+this.getClass().getName());
    }
}
