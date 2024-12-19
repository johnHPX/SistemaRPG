package enemy.factorys;

import entity.Inimigo;

public interface FabricaInimigo {
    Inimigo criar(Class e, String apelido);
}
