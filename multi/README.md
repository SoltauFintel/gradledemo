# Gradle Beispiel 6: Multi-Project-Build 

    settings.gradle

... enth�lt die untergeordneten Projekte.

    allprojects { ...

... definiert Gradle Einstellungen f�r alle Projekte.

Das Projekt multi nutzt multi2 als untergeordnetes Projekt und multilib als unabh�ngige Bibliothek. Bei der Programmierung in Eclipse sind
multi2-�nderungen sofort sichtbar. multilib-�nderungen werden erst durch Ver�ffentlichung (gradlew build uploadArchives) sichtbar.
Beim Build werden die multi- und multi2-Sourcen und die angegebene multilib-JAR-Datei verwendet.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausf�hrung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien vom multi-Projekt
und allen in settings.gradle angegeben untergeordneten Projekten erstellt.
