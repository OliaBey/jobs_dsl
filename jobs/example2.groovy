configFiles {
    customConfig {
        id('example2')
        name('Example from directory JOBS')
        comment('')
        content(this.readFileFromWorkspace('jobs/example2.pipeline'))
    }
}

