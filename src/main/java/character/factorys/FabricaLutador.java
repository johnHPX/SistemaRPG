package character.factorys;

import entity.Personagem;

public class FabricaLutador implements FabricaPersonagem{
    @Override
    public Personagem criar(Class<? extends Personagem> p) {
        return null;
    }
}
