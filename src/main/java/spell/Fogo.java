package spell;

public class Fogo implements Feitico{
    @Override
    public void lancar() {
        System.out.println("Laçou feitiço de "+this.getClass().getName());
    }
}
