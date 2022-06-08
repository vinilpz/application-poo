package revisãopoo.test;

import revisãopoo.domain.Carro;

public class RevisãoPoo {

    public static void main(String[] args) {
        Carro carro01 = new Carro(
                3, "Preto", 80.0, 1000, 4, 4,
                "Fiat", "Mobi", 2022
        );
        
        carro01.corrida(22.22);
        carro01.corrida(10);
    }

}
