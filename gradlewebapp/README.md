# Gradle Beispiel 4: WAR

    apply plugin: 'war'
    apply from: 'https://raw.github.com/akhikhl/gretty/master/pluginScripts/gretty.plugin'

... baut eine Java-Webanwendung (WAR), die mittels CowSay eine Meldung im Web ausgibt. Als Servletcontainer wird Jetty verwendet.

**Start:** DOS-Box �ffnen und "run" eingeben. Danach im Browser http://localhost:8080/gradlewebapp aufrufen.
Jetty wird in der DOS-Box mit der Enter-Taste beendet.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausf�hrung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien erstellt.

Hot Deployment funktioniert.

[Gretty Doku](http://akhikhl.github.io/gretty-doc)