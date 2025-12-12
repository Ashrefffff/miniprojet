package com.example.API.controller;
import classes.Main;                      // <--- important
import com.example.API.model.Vol;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vols")
public class VolController {

    @GetMapping
    public List<Vol> getAllVols() {
        return Main.chargerVols("Vols.csv");
    }

    @GetMapping("/{code}")
    public Vol getVolByCode(@PathVariable String code) {
        return Main.chargerVols("Vols.csv").stream()
                .filter(v -> v.getNumeroVol().equals(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Vol introuvable: " + code));
    }
}
