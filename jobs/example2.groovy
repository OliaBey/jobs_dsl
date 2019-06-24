pipelineJob('example2') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/example2.pipeline'))
            sandbox()
        }
    }
}
