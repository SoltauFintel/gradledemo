# Gradle Beispiel 2: Dependencies und Application Plugin

    apply plugin: 'application'
    // ...
    
    dependencies {
	   compile 'com.github.ricksbrown:cowsay:1.+'
	   
	   testCompile 'junit:junit:4.12'
    }

... baut eine einfache, startbare Java-Anwendung (JAR), die mittels CowSay eine Meldung auf der Console ausgibt.
Die Meldungsausgabe wird mittels JUnit Tests abgesichert.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausführung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien erstellt.
