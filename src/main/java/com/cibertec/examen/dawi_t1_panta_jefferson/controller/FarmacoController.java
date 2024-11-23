package com.cibertec.examen.dawi_t1_panta_jefferson.controller;

import com.cibertec.examen.dawi_t1_panta_jefferson.model.Farmaco;
import com.cibertec.examen.dawi_t1_panta_jefferson.service.IFarmacoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/farmaco")
@RequiredArgsConstructor
public class FarmacoController {
    private final IFarmacoService service;
    @GetMapping
    public String index(Model model) {
        model.addAttribute("farmacos", service.getAllFarmacos());
        return "farmaco/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("farmaco", new Farmaco());
        return "farmaco/create";
    }
    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("farmaco", service.getFarmacoById(id));
        return "farmaco/edit";
    }

    @PostMapping("/save")
    public String save( @ModelAttribute("farmaco") Farmaco farmaco) {
        service.saveFarmaco(farmaco);
        return "redirect:/farmaco";
    }
}
