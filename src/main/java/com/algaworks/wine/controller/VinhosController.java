package com.algaworks.wine.controller;

import com.algaworks.wine.repository.Vinhos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class VinhosController {
    @Autowired
    private Vinhos vinhos; 

    @RequestMapping
    public ModelAndView pesquisa() {
        ModelAndView mv = new ModelAndView("/vinhos/ListagemVinhos");
         mv.addObject("vinhos", vinhos.findAll());
        return mv;
    }

    @RequestMapping("/novo")
    public String novo() {
        return "/vinhos/CadastroProduto";
    }

}
