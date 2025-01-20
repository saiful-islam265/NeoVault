package org.example.neovault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    // Endpoint to fetch users by name
    @GetMapping("/users")
    public String getUsersByName(Model model) {
        List<Users> users = userRepo.findByName("Zia");

        model.addAttribute("users", users);

        // Return the name of the HTML view (users.html)
        return "users";
    }
}
