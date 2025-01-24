package com.actividadAutoma.Itsqmet.controlador;

import com.actividadAutoma.Itsqmet.Entidad;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class Entidad_controller {
    @GetMapping("/Formulario")
    public String mostrarFormulario(Model model) {
        Entidad entidad = new Entidad();
        model.addAttribute("entidad", entidad);
        return "formulario/Formulario";
    }

    // Procesa el formulario enviado.
    @PostMapping("/enviar")
    public String enviarFormulario(@Valid @ModelAttribute Entidad entidad, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formulario/Formulario";
        } else {
            model.addAttribute("entidad", entidad);
            return "formulario/Registro-Exitoso";
        }
    }
}
