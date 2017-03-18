multibranchPipelineJob('example_groovy') {
    branchSources {
        git {
            remote('https://github.com/harishdvg/GroovyExample.git')
            
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
