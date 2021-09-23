multibranchPipelineJob('test-04') {
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
