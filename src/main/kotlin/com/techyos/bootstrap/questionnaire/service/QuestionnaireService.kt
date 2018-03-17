package com.techyos.bootstrap.questionnaire.service

import com.techyos.bootstrap.questionnaire.data.Questionnaire
import com.techyos.bootstrap.questionnaire.data.QuestionnaireRepo
import org.springframework.stereotype.Service

@Service
class QuestionnaireService(val repo: QuestionnaireRepo) {

    fun findAll() = repo.findAll()

    fun resetTestData() {
        repo.deleteAll()

        repo.insert(Questionnaire(name = "quest1", description = "this is the first"))
        repo.insert(Questionnaire(name = "quest2", description = "this is the second"))
        repo.insert(Questionnaire(name = "quest3", description = "this is the third"))

    }

}