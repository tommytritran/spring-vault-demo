package dev.tom.springvault.Controller;


import dev.tom.springvault.Modell.User;
import dev.tom.springvault.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {

    private UserService service;

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable int id){
        return service.getUser(id);
    }

    @PostMapping("/")
    public User postUser(@RequestBody User user){
        return service.addUser(user);
    }
}
