# Gradle Beispiel 2: Dependencies und Application Plugin

    apply plugin: 'application'
    // ...
    
    dependencies {
	   compile 'com.github.ricksbrown:cowsay:1.+'
	   
	   testCompile 'junit:junit:4.12'
    }

... baut eine einfache, startbare Java-Anwendung (JAR), die mittels CowSay eine Meldung auf der Console ausgibt.
Die Meldungsausgabe wird mittels JUnit Tests abgesichert.

Die Eclipse-Dateien wurden nicht eingecheckt.
Nach dem Git Clone in der Git Repositories View das Projekt im Working Tree anwählen und als General Project importieren.
Anschließend das Target "eclipse" der Ant-Datei build.xml ausführen. Dadurch werden die Eclipse-Dateien erstellt.
Nach dem Aktualisieren des Projekts im Package Explorer ist das Projekt in Eclipse einsatzbereit.
Bei den weiteren Beispielprojekten ist die Vorgehensweise genauso.
