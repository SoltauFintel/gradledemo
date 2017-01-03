# Gradle Beispiel 6: Multi-Project-Build

Dies ist eine JAR-Bibliothek, die separat von multi und multi2 gebaut und releaset wird. multi und multi2 kann multilib also nur verwenden,
wenn multilib explizit gebaut und veröffentlicht worden ist.

Die Eclipse-Dateien wurden nicht eingecheckt. Durch Ausführung von Target "eclipse" der Ant-Datei build.xml werden die Eclipse-Dateien erstellt.
