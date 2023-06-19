package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.Service.UserService;
import web.model.User;

@RequestMapping(value = "/users")
@Controller
public class UsersController {
    private UserService us;

    @GetMapping(value = "/index")
    public String index(ModelMap model) {
        model.addAttribute("users", us.getListUser());
        return "index";
    }

    @DeleteMapping(value = "/{id}")
    public String remove(@PathVariable("id") Long id) {
        us.removeUser(us.getUserById(id));
        return "redirect:/users/index";
    }

    @PostMapping
    public String add(@ModelAttribute("user") User user) {
        us.addUser(user);
        return "redirect:/users/index";
    }
    @GetMapping(value = "/add")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "add";
    }

    @GetMapping(value = "/{id}/edit")
    public String edit(ModelMap model, @PathVariable("id") Long id) {
        model.addAttribute("user", us.getUserById(id));
        return "update";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") Long id){
        us.updateUser(id, user);
        return "redirect:/users/index";
    }
    @Autowired
    public void setUs(UserService us) {
        this.us = us;
    }
}
