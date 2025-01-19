package org.example.neovault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class NeoVaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeoVaultApplication.class, args);
    }

    public String home() {
        return "index";
    }

}
