def call(String repoUrl, String branch = 'main') {

    stage('Clone') {

        git(
            url: repoUrl,
            branch: branch
        )

        echo "Clone code successful"
    }
}
