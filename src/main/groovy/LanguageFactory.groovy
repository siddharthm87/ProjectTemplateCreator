class LanguageFactory {

    Set supportedLanguages = ["java"]

    def createTemplate(String language) {
        if (supportedLanguages.contains(language)) {
            def input = System.console().readLine('where do you want to create the files')
            println("you have entered " + input)
               //validate input
               //create files for java
               //Boolean fileCreated = new File("HelloWorld.java").createNewFile()
            def srcStream = new File('java_template.txt').newDataInputStream()
            def dstStream = new File('HelloWorld.java').newDataOutputStream()
            dstStream << srcStream
            srcStream.close()
            dstStream.close()
        } else {
            throw new RuntimeException("Language " + language + " is not supported")
        }
    }

}
