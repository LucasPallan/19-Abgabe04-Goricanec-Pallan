# Software Configuration Management #

# Lab Report #

--------------------------


-----------------------
## Taskliste ##
- [X] Taskliste in Readme einfügen
- [X] Queue Vorlage in das Repository einspielen
- [X] Korrigieren des Source Codes
- [X] Erstellung Klassen- und Methodenkommentare mittels Javadoc
- [ ] Erstellung Junit Tests
- [ ] Anpassung pom.xml
- [ ] Log4j integrieren
- [ ] Maven Size Dokumentation erstellen
- [ ] Erstellung Markdown Lab Report
- [ ] Vollständigkeit der Abgabe überprüfen
- [ ] Abgabe PDF Version


## Bugfixing im Code ##

Konstruktor Übergabeparameter maxsize -> S wird großgeschrieben
String poll() Zeile 34; "== 0"-Abfrage muss auf "!= 0" geändert werden ("> 0" funktioniert auch)
String remove(); element bekommt einen Wert von der Poll Methode und wird sofort mit "" überschrieben -> "element = "";" entfernen

## Javadoc Kommentare ##
Mittels /** **/ werden Kommentare vor jeder Methode erstellt.
Wir versuchen gute, kurze, aussagekräftige Kommentare zu erstellen.

In Ecliipse gehen wir auf "Project Generate Java-Doc" um die Dokumentation zu generieren.
Dann befindet sich die Doku im "Doc"-Order

## JUint Tests ##










## pom.xml ##
Anpassung der Developer Informationen in der pom.xml. 
Plugins für Maven Site und Javadoc wurden hinzugefügt.
