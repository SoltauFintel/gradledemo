# Gradle Beispiel 6: Multi-Project-Build 

    settings.gradle

... enthält die untergeordneten Projekte.

    allprojects { ...

... definiert Gradle Einstellungen für alle Projekte.

Das Projekt multi nutzt multi2 als untergeordnetes Projekt und multilib als unabhängige Bibliothek. Bei der Programmierung in Eclipse sind
multi2-Änderungen sofort sichtbar. multilib-Änderungen werden erst durch Veröffentlichung (gradlew build uploadArchives) sichtbar.
Beim Build werden die multi- und multi2-Sourcen und die angegebene multilib-JAR-Datei verwendet.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausführung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien vom multi-Projekt
und allen in settings.gradle angegeben untergeordneten Projekten erstellt.
