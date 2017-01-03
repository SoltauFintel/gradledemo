# Gradle Beispiel 3: fat JAR

    task fatJar(type: Jar) {
    	with jar
    	from { configurations.compile.collect { it.isDirectory() ? it : zipTree(it) } }
    	manifest.attributes 'main-class': 'tw.HelloFatJar'
    }

... baut eine einfache, startbare Java-Anwendung (JAR), die mittels CowSay eine Meldung auf der Console ausgibt.
Die JAR-Datei enthält alle Dependencies. Anders als beim Application Plugin wird die fat JAR nicht mittels Batchdatei gestartet,
sondern kann direkt mit "java -jar ..." gestartet werden.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausführung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien erstellt.
