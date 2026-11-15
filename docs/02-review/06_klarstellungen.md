# Klarstellungen – Review der Anforderungen

## Prüfgrundlage

Gelesen wurden die im Arbeitsbereich benannten Anforderungen zu Fundbüro:
- `docs/01-anforderungen/vision-fundbuero.md`
- `docs/01-anforderungen/Uebungsblatt2_Fundbuero_SWE1.md`

Prüfungsziel: Konsistenz, Verständlichkeit, Eindeutigkeit und Überprüfbarkeit der vorhandenen Anforderungen, Stories und Akzeptanzkriterien. Es wurden keine neuen Anforderungen, Modelle oder Musterlösungen erzeugt.

## Vorläufige Befunde und offene Klärungsfragen

| ID | Quelle(n) | Befund | Klärungsfrage | Antwort/Entscheidung des Teams |
|---|---|---|---|---|
| F-030 / F-050 | `F-030` (Beschreibung), `F-050` (Beschreibung), `AK F-030.1-3`, `AK F-050.2` | Der Match- und Nachweisprozess verwendet unterschiedliche Übereinstimmungswerte: F-030 spricht von 90 %, F-050/AK 2 von 95 % nach Zusatzfragen. Die Anforderungen bleiben dadurch in ihrer Logik zunächst schwer unterscheidbar: Ist 90 % der allgemeine Treffer-Threshold, und 95 % nur für den Eigentumsnachweis, oder soll ein einheitlicher Schwellenwert gelten? | Soll der 90 %-Schwellwert nur für die Grundübereinstimmung eines Fundes mit einer Verlustmeldung gelten und der 95 %-Wert ausschließlich für den Eigentumsnachweis nach Zusatzfragen, oder sollen beide Schritte auf einen gemeinsamen Wert vereinheitlicht werden? | Das Team entscheidet: Beide Schritte verwenden denselben Schwellenwert von 90 %. |
| F-040 / Roadmap | `F-040`, `Roadmap` („Nie: Handynummer austauschen! ... nur über den Chat!“) | Die Anforderung „anonym chatten“ verbietet nur das Anzeigen von Telefonnummer oder Adresse der Gegenseite. Die Roadmap spricht aber explizit davon, dass Telefonnummern nie ausgetauscht werden dürfen. Die genaue Grenze zwischen „anonymem Chat“ und „Kontakt außerhalb der App“ bleibt offen. | Darf die Anwendung nur in-app-Kommunikation zulassen, oder ist es ausreichend, dass Telefonnummern und Adressen nicht sichtbar sind, während andere Kontaktwege außerhalb der App zwar technisch möglich, aber nicht Teil der App-Logik sind? | Das Team entscheidet: Nur in-app-Kommunikation ist erlaubt. |
| F-060 | `F-060`, `AK F-060.1-4`, `ReqFund-N040` | Die Übergabe über die Abgabebox ist formal beschrieben, aber der Ablauf um den Code und die Zuständigkeiten ist noch unklar: Wer bekommt den Code, wer darf die Box öffnen, und wann gilt der Fund als „abgeholt“? Die Akzeptanzkriterien nennen den Statuswechsel, aber nicht die Rolle des Besitzers bzw. Finders im Ablauf. | Wer erhält den Abholcode, wer kann die Abgabebox öffnen, und welche Person löst den Statuswechsel „abgeholt“ aus – der Finder, der Besitzer oder das System nach bestätigtem Abholen? | Das Team entscheidet: Der Suchende erhält den Abholcode; der Suchende darf die Box öffnen; der Statuswechsel „abgeholt“ wird ausgelöst, sobald die Box geöffnet wird und das System den tatsächlichen Abholvorgang als abgeschlossen erkennt. |

## Hinweise zum Review

- Die Anforderungen sind grundsätzlich nachvollziehbar und inhaltlich weitgehend konsistent, aber die beschriebenen Grenzwerte und Rollenmustern sind noch zu präzisieren.
- Die Open Points betreffen keine Vorgabe aus dem Lernrahmen, sondern die fachliche Entscheidung des Teams für die tatsächliche Produktlogik.
- Eine spätere Überarbeitung der Anforderungen soll die genannten Aspekte möglichst eindeutig und prüfbar formulieren, ohne einen fertigen Lösungsvorschlag zu liefern.
