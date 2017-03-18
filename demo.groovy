multibranchPipelineJob('example_groovy') {
    branchSources {
        git {
            remote('https://github.com/harishdvg/GroovyExample.git')
            credentialsId('github-ci')
            includes('JENKINS-*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
