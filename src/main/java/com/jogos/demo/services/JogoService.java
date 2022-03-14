package com.jogos.demo.services;

import com.jogos.demo.models.Jogo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JogoService {
    private List<Jogo> jogos = new ArrayList<Jogo>();

    public Jogo addJogo (Jogo jogo) {
        jogos.add(jogo);
        return jogo;
    }

    public List<Jogo> listarJogos () {
        return jogos;
    }

    public List<Jogo> getOne (int year){
        List<Jogo> jogoList = new ArrayList<>();
        for (Jogo jogo: jogos) {
            if (jogo.getYear() == year){
                jogoList.add(jogo);
            }
        }

        return jogoList;
    }
}
