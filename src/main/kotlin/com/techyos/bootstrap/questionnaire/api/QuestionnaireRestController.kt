package com.techyos.bootstrap.questionnaire.api

import com.techyos.bootstrap.questionnaire.data.Questionnaire
import com.techyos.bootstrap.questionnaire.service.QuestionnaireService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class QuestionnaireRestController(val service: QuestionnaireService) {

    @GetMapping("/api/questionnaires")
    fun findAll(): List<Questionnaire>? = service.findAll()

}