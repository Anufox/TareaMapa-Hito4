
package com.est.demo.Controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.est.demo.model.Estudiante;

@RestController
public class EstudianteController {

    private static Map<String, Estudiante> estudiantes = new HashMap<>();

    static {
        Estudiante estudiante1 = new Estudiante("Pepe", "Perales", 22, "1124", "Ingenieria de Sistemas");
        Estudiante estudiante2 = new Estudiante("Jhon", "Peres", 32, "1234", "Ingenieria de Sistemas");
        Estudiante estudiante3 = new Estudiante("Luca", "Dres", 22, "1774", "Ingenieria de Sistemas");

        estudiantes.put(estudiante1.getCodigo(), estudiante1);
        estudiantes.put(estudiante2.getCodigo(), estudiante2);
        estudiantes.put(estudiante3.getCodigo(), estudiante3);
    }

    @GetMapping("/estudiantes")
    public ResponseEntity<Object> getEstudiantes() {
        return new ResponseEntity<>(estudiantes.values(), HttpStatus.OK);
    }

    @PostMapping("/estudiantes")
    public ResponseEntity<Object> registrarEstudiante(@RequestBody Estudiante est) {
        estudiantes.put(est.getCodigo(), est);
        return new ResponseEntity<>("El estudiante se creo correctamente: " + est.getCodigo(), HttpStatus.OK);
    }
}
