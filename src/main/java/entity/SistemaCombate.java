package entity;
import java.util.ArrayList;
import java.util.List;

public class SistemaCombate {
    private List<ObserverEntidade> entidades = new ArrayList<>();

    public void addObserver(ObserverEntidade observer) {
        entidades.add(observer);
    }

    public void removeObserver(ObserverEntidade observer) {
        entidades.remove(observer);
    }

    public void comunicar(String evento, Entidade e) {
        for (ObserverEntidade entidade : entidades) {
            entidade.executar(evento, e);
        }
    }

    public void acionarFuga() {
        comunicar("fuga", null);
    }

    public void acionarStatus() {
        comunicar("status", null);
    }

    public void acionarAtaqueCombinado(Entidade entidade){
        comunicar("ataqueCombinado", entidade);
    }

}