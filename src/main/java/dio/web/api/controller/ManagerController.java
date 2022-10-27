package dio.web.api.controller;

import dio.web.api.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/managers")
@PreAuthorize("hasRole('MANAGERS')")
public class ManagerController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public String managers() {
        return "Authorized manager";
    }
}
