package com.portfolio.demo.security.dbinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.portfolio.demo.security.entity.Rol;
import com.portfolio.demo.security.enums.RoleName;
import com.portfolio.demo.security.service.RolService;

@Component
public class DatabaseInitializer implements CommandLineRunner {
    
    @Autowired
    private RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        createRoles();
    }

    private void createRoles() {
        for (RoleName rolName : RoleName.values()) {
            if (!rolService.getRolByName(rolName).isPresent()) {
                Rol rol = new Rol();
                rol.setRoleName(rolName);
                rolService.save(rol);
            }
        }
    }
}
