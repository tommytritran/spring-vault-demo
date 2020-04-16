package dev.tom.springvault.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultController {

    @Value("${username}")
    private String username;
    @GetMapping("/vault")
    public String vault(){
        return "This value is stored in vault: " + username;
    }
}
