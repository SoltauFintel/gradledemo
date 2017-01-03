# Gradle Beispiel 4: WAR

    apply plugin: 'jetty' // war

... baut eine Java-Webanwendung (WAR), die mittels CowSay eine Meldung im Web ausgibt. Als Servletcontainer wird Jetty verwendet.

**Start:** DOS-Box öffnen und "gradlew jRW" eingeben. Danach im Browser http://localhost:8080/gradlewebapp aufrufen.
Jetty kann in der DOS-Box mit Strg+C abgebrochen werden.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausführung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien erstellt.
