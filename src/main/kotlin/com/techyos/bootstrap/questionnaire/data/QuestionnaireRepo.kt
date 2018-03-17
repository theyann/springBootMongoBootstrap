package com.techyos.bootstrap.questionnaire.data

import com.techyos.bootstrap.questionnaire.data.Questionnaire
import org.springframework.data.mongodb.repository.MongoRepository

interface QuestionnaireRepo : MongoRepository<Questionnaire, Int> {

    fun findByName(name: String): Questionnaire

}