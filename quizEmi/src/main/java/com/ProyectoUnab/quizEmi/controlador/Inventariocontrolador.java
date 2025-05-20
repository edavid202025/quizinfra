package com.ProyectoUnab.quizEmi.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ProyectoUnab.quizEmi.entidades.Inventario;
import com.ProyectoUnab.quizEmi.repositorio.InventarioRepositorio;

@Controller
public class Inventariocontrolador {

    @Autowired
    private InventarioRepositorio inventarioRepositorio;

    @GetMapping({"/listaproductos"})
    public String listaInventario(Model model) {
        List<Inventario> listaDeInventario = inventarioRepositorio.findAll();
        model.addAttribute("listaInventario", listaDeInventario);
        return "tabla";
    }

    @GetMapping({"/formparainventario"})
    public String formularioInventario(Model model) {
        model.addAttribute("inventario", new Inventario());
        List<Inventario> listaDeInventario = inventarioRepositorio.findAll();
        model.addAttribute("listaInventario", listaDeInventario);
        return "formulario";
    }

    @PostMapping("/guardarelinventario")
    public String guardarInventario(Inventario inventario) {
        inventarioRepositorio.save(inventario);
        return "redirect:/listaproductos";
    }

    @GetMapping("/inventario/editar/{id}")
    public String modificarInventario(@PathVariable("id") String id, Model model) {
        Optional<Inventario> inventario = inventarioRepositorio.findById(id);
        if (inventario.isPresent()) {
            model.addAttribute("inventario", inventario.get());
            return "formulario";
        } else {
            return "redirect:/listaproductos";
        }
    }

    @GetMapping("/inventario/eliminar/{id}")
    public String eliminarInventario(@PathVariable("id") String id) {
        inventarioRepositorio.deleteById(id);
        return "redirect:/listaproductos";
    }
}
