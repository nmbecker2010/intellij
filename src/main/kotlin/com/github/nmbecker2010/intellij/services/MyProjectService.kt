package com.github.nmbecker2010.intellij.services

import com.intellij.openapi.project.Project
import com.github.nmbecker2010.intellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
