# Übungsblatt 2 – Anforderungen

Software Engineering 1, Wintersemester 2026/2027 · Fallstudie: Fundbüro-Anwendung

## Aufgabe 1 – Funktionale Anforderungen

| **ID** | **Version** | **Status** | **Feature**                   | **Priorität** | **Anforderungsname**                       | **Beschreibung**                                                                                                                                                                                                                                                                                                                                                                                                                                                              | **Quelle**        |
|--------|-------------|------------|-------------------------------|---------------|--------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------|
| F-010  | 1           | Entwurf    | Fundmeldung                   | Muss          | Fund oder Verlust melden                   | Nach Auswahl von „Fund melden“ muss das System angemeldeten Findern die Möglichkeit bieten, einen Fund mit Fundort (vorgeschlagener Standort, manuell änderbar), Foto und Stichworten zu erfassen und abzusenden.                                                                                                                                                                                                                                                             | US1, UC1, S1      |
| F-020  | 1           | Entwurf    | Fundmeldung                   | Muss          | Übergabeart wählen                         | Nach Erfassung der Fundangaben muss das System dem Finder die Möglichkeit bieten, zwischen den Übergabearten „Abgabebox“ und „persönliche Übergabe“ zu wählen.                                                                                                                                                                                                                                                                                                                | US3, UC1, S1      |
| F-030  | 1           | Entwurf    | Matching und Benachrichtigung | Muss          | Fund mit Verlustmeldungen abgleichen       | Nach Absenden einer Fundmeldung muss das System die Meldung mit den aktiven Verlustmeldungen abgleichen und bei einem Treffer Finder und Verlierer benachrichtigen. -\> 90% der Verlustmeldung und der Finderbeschreibung passen überein                                                                                                                                                                                                                                      | US5, UC1, S1      |
| F-040  | 1           | Entwurf    | Anonyme Kommunikation         | Muss          | Anonym chatten                             | Nach einem Treffer muss das System Finder und Besitzerin die Möglichkeit bieten, in einem anonymen Chat zu kommunizieren, ohne dass Telefonnummer oder Adresse der Gegenseite angezeigt werden. Nur in-app-Kommunikation ist erlaubt.                                                                                                                                                                                                                                                                               | US2, UC1, S1      |
| F-050  | 1           | Entwurf    | Eigentumsnachweis             | Muss          | Eigentum nachweisen                        | Nach Eröffnung des Chats muss das System der Besitzerin die Möglichkeit bieten, einen Eigentumsnachweis -\> Foto oder genaue Beschreibung einzureichen, und die Übergabe erst nach erfolgreicher Prüfung des Nachweises freigeben. -\> 90% der Verlustmeldung und der Finderbeschreibung passen überein nach Beantwortung der 3 Zusatzfragen                                                                                                                                  | US6, UC1, S1      |
| F-060  | 1           | Entwurf    | Übergabe über Abgabebox       | Muss          | Ablage bestätigen und Abholung abschließen | Nach Vereinbarung einer Übergabe über die Abgabebox muss das System dem Finder die Möglichkeit bieten, die Ablage in der App zu bestätigen. Nach der Abholung durch die Besitzerin muss das System den Status des Fundes auf „abgeholt“ setzen und den Finder benachrichtigen. -\> Findbüre hat eine 24/7 Box die immer zugänglich ist mit einem speziellen Code der bei einem Match der Suchende bekommt, Code max. 24h gültig, sonst muss ein neuer Code angefordert werden. Der Suchende erhält den Abholcode; der Suchende darf die Box öffnen; der Statuswechsel „abgeholt“ wird ausgelöst, sobald die Box geöffnet wird und das System den tatsächlichen Abholvorgang als abgeschlossen erkennt. | US3, US7, UC1, S1 |

Quellen: US = User Story (Aufgabe 5), UC1 = Anwendungsfall „Fund melden und über Abgabebox zurückgeben“ (Aufgabe 7), S1 = Szenario „Fund unterwegs melden und über Abgabebox zurückgeben“ (Aufgabe 4).

## Aufgabe 2 – Nichtfunktionale Anforderungen

| **ID**       | **Ver.** | **Quelle**                                  | **Geltungsbereich**            | **Anforderungsname**                     | **Anforderungsbeschreibung**                                                                                                                                                                                                                                                                                             |
|--------------|----------|---------------------------------------------|--------------------------------|------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ReqFUND-N010 | 1        | US1, UC1, S1                                | Fundmeldung                    | Benutzerfreundlichkeit                   | Mindestens 8 von 10 Testpersonen ohne Vorerfahrung mit der App müssen eine Fundmeldung (Standort bestätigen, Foto, Stichworte, Übergabeart wählen, Absenden) ohne Hilfe innerhalb von 5 Minuten abschließen können.                                                                                                      |
| ReqFUND-N020 | 1        | US2, UC1                                    | Anonymer Chat, gesamtes System | Datenschutz                              | Das System darf Telefonnummer, E-Mail-Adresse, Klarnamen und Adresse einer Person weder in Chat-Nachrichten noch in Benachrichtigungen oder Schnittstellenantworten an die Gegenseite ausliefern. In einem Test mit mindestens 20 Chat-Verläufen dürfen in 0 Fällen solche Daten sichtbar sein.                          |
| ReqFUND-N030 | 1        | US5, UC1, S1                                | Matching und Benachrichtigung  | Antwortzeit                              | Bei 1.000 aktiven Verlustmeldungen muss in mindestens 95 % der Fälle die Benachrichtigung über einen Treffer innerhalb von 60 Sekunden nach Absenden der Fundmeldung zugestellt werden.                                                                                                                                  |
| ReqFUND-N040 | 1        | US7, UC1                                    | Gesamtsystem                   | Verfügbarkeit                            | Die produktiven Online-Dienste (Backend, Chat, Abgabebox-Anbindung) müssen eine monatliche Verfügbarkeit von mindestens 99,5 % erreichen, damit der Fund auch außerhalb üblicher Öffnungszeiten abgeholt werden kann.                                                                                                    |
| ReqFUND-N050 | 1        | US1, UC1 (Ausnahme: kein Internet oder GPS) | Fundmeldung                    | Zuverlässigkeit bei fehlender Verbindung | Bei fehlender Internetverbindung muss die App eine vollständig erfasste Fundmeldung lokal speichern und innerhalb von 30 Sekunden nach Wiederherstellung der Verbindung automatisch senden. In 20 Testläufen darf keine Meldung verloren gehen.                                                                          |
| ReqFUND-N060 | 1        | UC1 (Beteiligte Systeme)                    | Gesamtsystem                   | Wartbarkeit                              | Externe Dienste (Matching-Service, Push- und Chat-Dienst, Abgabebox-System) müssen über definierte Schnittstellen angebunden sein. Der Austausch eines externen Dienstes darf höchstens 5 Personentage dauern und keine Änderung der Fachlogik erfordern; die Testabdeckung der Fachlogik muss mindestens 70 % betragen. |

## Aufgabe 3 - Versehen Sie Ihre Anforderungen mit Akzeptanzkriterien

**Funktionale Anforderungen**

**F-030: Fund mit Verlustmeldungen abgleichen**

| Nach Absenden einer Fundmeldung muss das System die Meldungen mit den aktiven Verlustmeldungen abgleichen und bei einem Treffer Finder und Suchenden benachrichtigen. |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|

**Akzeptanzkriterien**

1.  Eine aktive Verlustmeldung („schwarzer Geldbeutel aus Leder“ Aufenthaltsort München: Neuperlach) und einer neue Fundmeldung („schwarzer Lederbeutel“, Fundort München: Neuperlach) stimmen zu mindestens 90% überein: Das System erkennt einen Treffer.

2.  Bei einem Treffer erhalten Finder und Suchender jeweils eine Benachrichtigung in der App, die auf einen anonymen Chat verweist.

3.  Beträgt die Übereinstimmung weniger al 90%, wird kein Treffer gemeldet und niemand wird benachrichtigt. Die Fundmeldung bleibt aktiv und wird später mit eingehenden Verlustmeldung erneut abgeglichen.

4.  Bereits abgeschlossene Verlustmeldungen (Fund abgeholt) werden beim Abgleichen nicht berücksichtigt.

**F-050: Eigentum nachweisen**

| Nach Eröffnung des Chats muss das System dem Besitzer die Möglichkeit bieten, einen Eigentumsnachweis (Foto oder genaue Beschreibung) einzureichen, und die Übergabe erst nach erfolgreicher Prüfung des Nachweises freigeben. |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

**Akzeptanzkriterien**

1.  Der Besitzer kann im Chat ein Foto oder eine genaue Beschreibung des Gegenstands als Nachweis einreichen.

2.  Das System stellt drei Zusatzfragen zu Merkmalen, die in der Fundmeldung nicht öffentlich sichtbar sind. Stimmen Nachweis und Fundbeschreibung nach Beantwortung der Fragen zu mindestens 95% überein, wird die Übergabe freigegeben.

3.  Liegt die Übereinstimmung unter 90%, bleibt die Übergabe gesperrt und die Besitzerin erhält die Meldung, dass der Nachweis nicht ausgereicht hat.

4.  Solange der Nachweis nicht erfolgreich geprüft wurde, sind weder Übergabeort noch Abholcode für den Besitzer aufrufbar.

**F-060: Ablage bestätigen und Abholung abschließen**

| Nach Vereinbarung einer Übergabe Über die Abgabebox muss das System dem Finder die Möglichkeit bieten, die Ablage in der App zu bestätigen. Nach der Abholung durch den Besitzer muss das System den Status des Fundes auf „abgeholt“ setzen und den Finder benachrichtigen. |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

**Akzeptanzkriterien**

1.  Der Finder bestätigt die Ablage in der App: Der Status des Fundes wechselt auf „abgelegt“ und die Besitzerin erhält ihren Abholcode.

2.  Die Box öffnet sich mit dem gültigen Code jederzeit (24/7). Der Code ist höchsten 24 Stunden gültig.

3.  Nach Ablauf der 24 Stunden öffnet sich die Box mit dem alten code nicht mehr. Der Besitzer kann einen neuen Code anfordern.

4.  Nach der Abholung setzt das System den Status auf „abgeholt“ und benachrichtig den Finde.

**Nichtfunktionale Anforderungen**

**ReqFund-N030: Antwortzeit (Matching und Benachrichtigung)**

| Bei 1.000 aktiven Verlustmeldungen muss mindesten 95% der Fälle die Benachrichtigung über einen Treffer innerhalb von 60 Sekunden nach Absenden der Fundmeldung zugestellt werde. |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

**Akzeptanzkriterien**

1.  Testbedingung: Im System sind 1.00 aktive Test-Verlustmeldungen hinterlegt. Es werden 100 Fundmeldungen mit passendem Treffer nacheinander abgesendet. Gemessen wird die Zeit vom Absenden bis zur Zustellung der Benachrichtigung.

2.  Mindestens 95 der 100 Benachrichtigungen werden innerhalb von 60 Sekunden zugestellt.

3.  Der Test wird dreimal unter identische Bedingung durchgeführt. In jedem Durchlauf muss das Ziel erreicht werden.

**ReqFund-N060: Wartbarkeit (Austauschbarkeit externer Dienste)**

| Externe Dienste (Matching – Service, Push- und Chat-Dienst, Abgabebox-System) müssen über definierte Schnittstellen angebunden sein. Der Austausch eines externen Dienstes darf höchstens 5 Personentage dauern und keine Änderung der Fachlogik erfordern; die Testabdeckung der Fachlogik muss mindestens 70% beantragen. |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

**Akzeptanzkriterien**

1.  Testfall: Der Push-Dienst wird durch einen anderen Dinest (oder einen Testersatz) ausgetauscht. Der dokumentierte Aufwand beträgt höchstens 5 Werktage.

2.  Beim Austausch ändern sich nur die Schnittstellen Anbindung und die Konfiguration. Der Code der Fachlogik bleibt unverändert (Prüfung über den Code-Vergleich).

3.  Die automatischen Tests der Fachlogik laufen nach dem Austausch ohne Anpassung erfolgreich durch.

4.  Ein Coverage-Werkzeug weist für die Fachlogik eine Testabdeckung von mindestens 70% aus.

## Aufgabe 4 - Fassen Sie Ihre User Stories in Features zusammen und priorisieren Sie die Features in einer Roadmap

**Feature 1: Fund- und Verlustmeldung**

**Funktionale Anforderungen:**

- F - 010: Fund oder Verlust melden

- F – 020: Übergabeart wählen:

**Nichtfunktionale Anforderungen, die nur dieses Feature betreffen:**

- ReqFund-N010: Benutzerfreundlichkeit (Meldung in unter 5 Minuten)

- ReqFund-N050: Zuverlässigkeit bei fehlender Verbindung (lokales Speichern, automatisches Senden)

**Feature 2: Matching und Benachrichtigung**

**Funktionale Anforderungen:**

- F - 030: Fund mit Verlustmeldungen abgleichen

**Nichtfunktionale Anforderungen, die nur dieses Feature betreffen:**

- ReqFund-N030: Antwortzeit (Benachrichtigung innerhalb von 60 Sekunden)

**Feature 3: Anonyme Kommunikation**

**Funktionale Anforderungen:**

- F - 040: Anonym chatten

**Nichtfunktionale Anforderungen, die nur dieses Feature betreffen:**

- Keine (de Datenschutz ReqFund-N020 gilt für das ganze System, siehe unten)

**Feature 4: Eigentumsnachweis**

**Funktionale Anforderungen:**

- F - 050: Eigentum nachweisen

**Nichtfunktionale Anforderungen, die nur dieses Feature betreffen:**

- Keine

**Feature 5: Übergabe über Abgabebox**

**Funktionale Anforderungen:**

- F - 060: Ablage bestätigen und Abholung abschließen

**Nichtfunktionale Anforderungen, die nur dieses Feature betreffen:**

- Keine

**Übergreifende Anforderungen, die das ganze System gelten und deshalb keinem einzelnen Feature zugeordnet werden:**

- ReqFund-N020: Datenschutz

- ReqFund-N040: Verfügbarkeit

- ReqFund-N060: Wartbarkeit

**Priorisierung der Roadmap:**

**Sofort**: Muss im ersten Release umgesetzt werden → *Fund- und Verlustmeldung, Matching und Benachrichtigung, Anonymer Chat, Eigentumsnachweis*

**Begründung:** Sind die Mindestanforderungen damit eine Übergabe stattfinden kann.

**Nächstes**: Soll in einem folgenden Release umgesetzt werden → Übergabe über Abgabebox

**Begründung:** Um den Prozess abzuschließen benötigt man die Übergabe nach dem die Basis steht.

**Später**: Ist sinnvoll, hat aber zunächst eine geringe Priorität → *(freiwillige Finderlohnabgabe über die App), respektvoller Umgang im Chat (bei Verstoß: Warnung popt auf! / persönliche Meldung bei Nutzung von vulgäre Sprachnutzung)*

**Begründung:** Optional, nicht wichtig damit der Prozess funktioniert.

Nie: Wird bewusst nicht in den geplanten Produktumfang aufgenommen → *Handynummer austauschen! (alles nur über den Chat!)*

**Begründung:** Wird aus Sicherheitstechnischen Gründen nicht erlaubt um mit der App einen Lock-In Effekt zu erzeugen.
