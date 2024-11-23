package com.cibertec.examen.dawi_t1_panta_jefferson.controller;

import com.cibertec.examen.dawi_t1_panta_jefferson.model.Consumo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RestauranteController {

    @GetMapping("/restaurante")
    public String restaurante(Model model) {
        model.addAttribute("consumo", new Consumo());
        return "restaurante/formRestaurante";
    }

    @PostMapping("/calcularMontoTotal")
    public String calcularMontoTotal(Model model,
                                     @ModelAttribute("consumo")Consumo consumo){

        double montoM = consumo.getMonto();
        double propina = 0;
        double resultado = 0;
        if(montoM <50 ){
            propina = montoM*0.10;
        }else{
            propina = montoM*0.15;
        }
        resultado = montoM + propina;
        model.addAttribute("resultado", "La propina debe ser: "
                + String.format("%.2f",propina) +" y el valor total a pagar es: S/"+String.format("%.2f",resultado));

        return "restaurante/formRestaurante";
    }
}
