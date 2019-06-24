configFiles {
    customConfig {
        id('example1')
        name('Example from directory FILES')
        comment('')
        content(this.readFileFromWorkspace('files/example1.pipeline'))
    }
}

