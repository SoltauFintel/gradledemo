# Gradle Beispiel 7: Auslieferung 

In diesem Multi-Project wird ein Task "auslieferung" definiert, der den Stand in ein Repository hochl�dt,
in Git tagt und den Auslieferungsordner zusammenstellt. Die Auslieferung wird auf der Kommandozeile gestartet mit:

     gradlew clean check uA auslieferung -Pversion=2.0.0

Es ist die gew�nschte Version anzugeben. Auch m�glich: 2.0.0-SNAPSHOT

Die Reihenfolge soll dann sein:

1. clean
2. Abh�ngigkeiten bauen (reli2 jar)
3. Tests
4. dist
5. uploadArchives
6. build
7. auslieferung (ggf. vorher mit git tag)

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausf�hrung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien vom reli-Projekt
und allen in settings.gradle angegeben untergeordneten Projekten erstellt.
