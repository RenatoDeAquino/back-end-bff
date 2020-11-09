package com.example.bff.service

import com.example.bff.builder.ScreenBeagleBuilder
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
    fun createScreenBeagle() = ScreenBeagleBuilder
}