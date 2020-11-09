package com.example.bff.controller

import com.example.bff.service.ScreenBeagleService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
        private val screenBeagleService: ScreenBeagleService
) {
    @CrossOrigin("*")
    @GetMapping("/screen")
    fun getFirstScreen() = screenBeagleService.createScreenBeagle()
}