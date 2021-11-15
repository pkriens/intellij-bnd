package com.github.pkriens.intellijbnd.services

import com.intellij.openapi.project.Project
import com.github.pkriens.intellijbnd.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
