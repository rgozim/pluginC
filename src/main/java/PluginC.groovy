

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginC implements Plugin<Project> {

    private Project project

    @Override
    void apply(Project project) {
        this.project = project
    }

}