# Gradle Beispiel 5: Quality Check

    apply plugin: 'checkstyle'
    apply plugin: 'findbugs'
    apply plugin: 'pmd'
    apply plugin: 'jdepend'
    apply plugin: 'jacoco'

... f�hrt Quality Checks aus und generiert Reports.
F�r findeFixme, Checkstyle und JaCoCo muss Ant-Task "full build" verwendet werden. Der "full build" scheitert derzeit.

Au�erdem werden JAR-Dateien mit Sourcen und JavaDoc erzeugt.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausf�hrung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien erstellt.
