package com.techyos.bootstrap.questionnaire.web

import com.techyos.bootstrap.questionnaire.service.QuestionnaireService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class QuestionnaireController(val service: QuestionnaireService) {

    @RequestMapping("/")
    fun list() = ModelAndView("/home").apply {
        addObject("questionnaires", service.findAll())
    }

    @RequestMapping("/resetTestData")
    fun reset(): String {
        service.resetTestData()
        return "redirect:/"
    }

}