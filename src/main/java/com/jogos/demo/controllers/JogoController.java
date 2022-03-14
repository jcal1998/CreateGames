package com.jogos.demo.controllers;

import com.jogos.demo.models.Jogo;
import com.jogos.demo.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class JogoController {
    @Autowired
    private JogoService jogoService; //instanciar a service

//    public JogoController(JogoService jogoService) {
//        this.jogoService = jogoService;
//    }

    @PostMapping("/create")
    public Jogo add(@RequestBody Jogo jogo){
        return jogoService.addJogo(jogo);
    }

    @GetMapping("/list")
    public List<Jogo> get(){
        return jogoService.listarJogos();
    }

    @GetMapping("/search/{year}")
    public List<Jogo> getListJogos(@PathVariable int year){
        return jogoService.getOne(year);
    }
//    public List<Jogo> getListJogos(@PathParam("y") int year){
//        return jogoService.getOne(year);
//    }
}
