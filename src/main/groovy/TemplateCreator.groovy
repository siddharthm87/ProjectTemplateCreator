class TemplateCreator {

    def createTemplate(String[] args) {
        LanguageFactory languageFactory = new LanguageFactory();

        def cli = new CliBuilder(usage: 'groovy TemplateCreator.groovy [Options]')
        cli.l(args: 1, argName: 'language', "e.g. java", required: true)
        cli.bt(args: 1, argName: 'buildTool', "e.g. gradle/ant/maven etc", required: true)
        cli.df(args: 1, argName: 'dependencyFramework', "e.g. ", required: true)
        cli.ide(args: 1, argName: 'tst', "type ('pdf', 'deck' or 'both')", required: false)
        def option = cli.parse(args)
        if (option.l) {
            languageFactory.createTemplate(option.l)
        }

        if (option.bt) {
            println("build tool")
        }

        if (option.df) {
            println("dependency framework")
        }

        if (option.ide) {
            println("ide is intellij")
        }
    }
}
