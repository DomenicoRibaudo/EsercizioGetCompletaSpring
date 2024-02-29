package com.develhope.demoesercizioGetCompleta;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class ControllerSalutaUser {

   @GetMapping("/ciao/{provincia}")
    public User saluta(@PathVariable String provincia, @RequestParam String nome ){
       String stringaSaluto = "Ciao " + nome + " com'è il tempo in " + provincia + "?";
       User user = new User(nome, provincia, stringaSaluto);
       return user;
   }

}
