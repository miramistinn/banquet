package com.example.cursach.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/")
@AllArgsConstructor
public class TestController {

    @GetMapping("/welcome")
    public String welcome() { return "This is unprotected page"; }

    @GetMapping("/users")
    @PreAuthorize("hasAuthority('user')")
    public String pageForUser() {
        return "This is page for only users";

    }
    @GetMapping("/admins")
    @PreAuthorize("hasAuthority('admin  ')")
    public String pageForAdmins() {
        return "This is page for only admins";
    }
    @GetMapping("/all")
    public String pageForAll () {
        return "This is page for all employees";
    }
}
