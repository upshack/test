job('test') {
    logRotator(30, -1, 1, -1)
}

job('test') {
    logRotator {
        numToKeep(5)
        artifactNumToKeep(1)
    }
}
