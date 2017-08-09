package br.com.fiap.notepadsaas.controller;

import br.com.fiap.notepadsaas.model.Nota;
import br.com.fiap.notepadsaas.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by danilopereira on 08/08/17.
 */
@RestController
public class NotaController {

    @Autowired
    private NotaRepository notaRepository;

    @GetMapping(value = "/")
    public List<Nota> findAll(){
        return notaRepository.findAll();
    }

    @PostMapping(value = "/")
    public void save(@RequestBody Nota nota){
        notaRepository.save(nota);
    }
}
