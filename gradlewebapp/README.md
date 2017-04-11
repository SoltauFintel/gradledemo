# Gradle Beispiel 4: WAR

    apply plugin: 'war'
    apply from: 'https://raw.github.com/akhikhl/gretty/master/pluginScripts/gretty-1.4.0.plugin'

... baut eine Java-Webanwendung (WAR), die eine CowSay-Meldung im Web ausgibt. Als Servletcontainer wird Jetty 9 verwendet. Alternativ
können folgende Servletcontainer verwendet werden: Jetty 7 - 9, Tomcat 7 - 8.

**Start:** DOS-Box öffnen und "run" eingeben. Danach im Browser http://localhost:8080/gradlewebapp aufrufen.
Jetty wird in der DOS-Box mit der Enter-Taste beendet.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausführung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien erstellt.

Hot Deployment funktioniert! :-)

[Gretty Doku](http://akhikhl.github.io/gretty-doc)
 || [Gretty auf github](https://github.com/akhikhl/gretty)
 || [Gretty Ankündigung auf jaxenter](https://jaxenter.de/gretty-1092)
 
Wichtig: Im Eclipse muss eine Debug Session gestartet sein. siehe http://stackoverflow.com/a/40158277/3478021
