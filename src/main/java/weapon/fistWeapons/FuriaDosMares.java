package weapon.fistWeapons;

public class FuriaDosMares implements FistWeapon{
    @Override
    public void golpe() {
        System.out.println("Golpe com "+this.getClass().getName());
    }
}
