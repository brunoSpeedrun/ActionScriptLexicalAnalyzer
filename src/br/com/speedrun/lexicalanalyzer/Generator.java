package br.com.speedrun.lexicalanalyzer;

import java.io.File;
import java.nio.file.Paths;

class Generator {

    public static void main(String[] args) {

        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/src/br/com/speedrun/lexicalanalyzer/";

        String file = rootPath + subPath + "action_script.lex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}
