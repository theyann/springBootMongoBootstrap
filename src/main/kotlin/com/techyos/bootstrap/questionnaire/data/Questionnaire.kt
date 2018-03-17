package com.techyos.bootstrap.questionnaire.data

import org.springframework.data.annotation.Id

data class Questionnaire(@Id var id: String? = null,
                         var name: String,
                         var description: String)
