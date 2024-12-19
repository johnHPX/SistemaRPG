package character.factorys;

import entity.Personagem;

public interface FabricaPersonagem {
    Personagem criar(Class p);
}
