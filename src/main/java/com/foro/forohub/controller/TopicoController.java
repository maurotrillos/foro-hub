package com.foro.forohub.controller;

import com.foro.forohub.topico.DatosTopicos;
import com.foro.forohub.topico.Topico;
import com.foro.forohub.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosTopicos datosTopicos){
        topicoRepository.save(new Topico(datosTopicos));
    }
    @GetMapping
    public List<Topico> listadoTopico(){
        return topicoRepository.findAll();
    }



}
