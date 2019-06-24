pipelineJob('example2') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/example2.pipeline'))
            sandbox()
        }
    }
}
configFiles {
    customConfig {
        id('example2')
        name('Example from directory JOBS')
        comment('')
        content(this.readFileFromWorkspace('jobs/example2.pipeline'))
    }
}
