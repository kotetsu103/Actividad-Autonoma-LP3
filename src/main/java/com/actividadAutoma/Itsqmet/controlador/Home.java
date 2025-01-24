package com.actividadAutoma.Itsqmet.controlador;

import com.actividadAutoma.Itsqmet.Entidad;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class Home {
    @GetMapping("/")
    public String mostrarIndex() {
        return "index";
    }

    @GetMapping("/formulario/Formulario")
    public String mostrarFormulario(Model model) {
        return "formulario/Formulario";
    }
}
