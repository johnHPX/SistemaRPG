package spell;

public class Trovao implements Feitico{
    @Override
    public void lancar() {
        System.out.println("Laçou feitiço de "+this.getClass().getName());
    }
}
