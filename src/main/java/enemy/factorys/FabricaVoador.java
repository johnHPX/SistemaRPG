package enemy.factorys;

import enemy.enemies.BatEye;
import enemy.enemies.FireKeese;
import entity.Inimigo;

public class FabricaVoador implements FabricaInimigo {
    @Override
    public Inimigo criar(Class e, String apelido) {
        if (e.equals(BatEye.class))
            return new BatEye(apelido);
        else if(e.equals(FireKeese.class))
            return new FireKeese(apelido);

        return null;
    }
}
