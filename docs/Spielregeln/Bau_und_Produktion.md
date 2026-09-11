# Bau und Produktion

[Katalog](README.md) · [Gebäude](Gebaeude.md) · [Eigenschaften](Eigenschaften.md) · [Entscheidungen](../Entscheidungen.md)

Stand der fachlichen Festlegungen: 2026-09-12. Diese Regeln sind bestätigt; ausdrücklich als Beispiele bezeichnete Zahlen sind keine freigegebenen Balancewerte. Offene Zeitpunkte werden nicht als fertiger Ablauf dargestellt.

## Bauaufträge und Überlebensfrist

Einheiten mit Baufähigkeit können in ihrer Bewegungsphase einen Bauauftrag erteilen. Ihre Definition bestimmt die errichtbaren Gebäude und Infrastruktur. Vor Fertigstellung muss der Gegner eine vollständige Angriffsgelegenheit erhalten; die Baueinheit muss diese überleben. Ein bloßer Wechsel in den unmittelbar nächsten Turn erfüllt diese Bedingung nicht automatisch.

Beispiel: A beginnt nach den Angriffen von B zu bauen. Im folgenden Turn greift A an und B bewegt. Erst im darauffolgenden Angriffsteil von B erhält dieser wieder eine reguläre Angriffsgelegenheit. Der Bau darf nicht bereits vorher aufgrund des Rollenwechsels fertig sein.

Der genaue Abschlusszeitpunkt nach dieser Angriffsgelegenheit, relativ zu Bewegung und Siegprüfung, bleibt offen (O-01). Ebenso offen sind Bauplatz, Gebäudegröße, Bindung der Baueinheit an den Ort und Folgen eines Abbruchs oder ihrer Zerstörung (O-03).

## Baupunkte und Pioniere

Baupunkte sind der auffüllbare Bauvorrat einer Baueinheit, nicht ihre Verbandsstärke und nicht der Produktionsfortschritt einer Fabrik. Die Definition enthält maximale Baupunkte und Baukosten der erlaubten Bauwerke; die Instanz enthält den aktuellen Vorrat.

Straßen kosten weniger Baupunkte als Gebäude. Beispielwerte: sechs Baupunkte im Pionier, ein Punkt je Straßenstück und sechs Punkte je Stützpunkt. Diese Werte illustrieren das Verhältnis und bleiben ungetestet.

Ein Pionier mit null Baupunkten bleibt im Spiel. Er kann nur nicht mehr bauen, bis seine Baupunkte in einer geeigneten Basis ergänzt wurden. Seine übrigen Fähigkeiten entfallen dadurch nicht. Dies ersetzt den früheren Vorschlag, verbrauchte Pioniere zu entfernen.

Basen können Einheiten reparieren und Pionieren Baupunkte zurückgeben. Reparatur und Baupunkteauffüllung sind unterschiedliche Wirkungen, die aus wiederverwendbaren Eigenschaften entstehen. Kosten, Dauer, Umfang, erlaubte Phase und gleichzeitige Nutzung anderer Fähigkeiten bleiben offen (O-17). Auch der Abzug von Baupunkten bei Baubeginn oder Abschluss ist noch zu entscheiden.

## Produktion als Fortschritt

Eine Fabrik bearbeitet genau einen Auftrag gleichzeitig. Weitere Aufträge stehen in einer Warteschlange. Jede herstellbare Einheit hat Produktionskosten; die Fabrik besitzt eine Baugeschwindigkeit in Produktionspunkten pro Runde.

Produktionspunkte sind Fortschritt am aktiven Auftrag. Im Standard gibt es dafür keinen getrennten globalen oder lokalen Ressourcenvorrat. Die bisherige Ressourcenerzeugung wird entsprechend als Produktionsleistung eingeordnet.

`rechnerische Dauer in Runden = Produktionskosten / Baugeschwindigkeit`

Die Rundung bei nicht ganzzahliger Dauer, der Zeitpunkt der ersten Gutschrift und der Übergang zum nächsten Auftrag bleiben offen (O-02). Es wird keine zusätzliche frei wählbare Bauzeit neben Kosten und Geschwindigkeit vorausgesetzt.

- Ein neuer Auftrag beginnt mit null Fortschritt.
- Überschüssige Leistung eines abgeschlossenen Auftrags wird nicht auf den nächsten übertragen.
- Beim Abbruch geht sämtlicher bisheriger Fortschritt verloren; es gibt keine Rückerstattung.
- Bei Eroberung gehen Produktionsfortschritt und vorhandene Vorräte verloren. Ob wartende und aktive Aufträge gelöscht oder mit null Fortschritt übernommen werden, bleibt offen (O-04).

Die Regel zum Verlust vorhandener Vorräte führt keinen zusätzlichen Ressourcenvorrat für das Standardproduktionsmodell ein. Sie gilt für Vorräte, sofern diese durch andere Eigenschaften vorhanden sind; der genaue Umfang bleibt zu präzisieren.

## Fertigstellung und Einsatzbereitschaft

Produzierte Einheiten werden zu Beginn einer eigenen Bewegungsphase fertig. Sie können erst in der **darauffolgenden eigenen Bewegungsphase** ausrücken, nicht bereits in der Phase ihrer Fertigstellung.

Beispiel: Eine Einheit wird am Anfang der eigenen Bewegungsphase M fertig und steht im Inventar. In M kann sie nicht ausrücken; erst in der nächsten eigenen Bewegungsphase M+1 ist dies möglich. Ob sie in der dazwischenliegenden Aktionsphase bereits aus dem Gebäude angreifen darf, ist noch offen (O-18).

Die Siegprüfung erfolgt zwischen den Turns vor Fertigstellungen. Eine erst danach fertig werdende Einheit kann eine bereits festgestellte Niederlage nicht verhindern. Die genaue Einordnung von Bauabschluss und Eroberung gegenüber dieser Prüfung bleibt offen (O-01, O-06).

## Fachliche Prüfszenarien

| Fall | Erwartung |
|---|---|
| Bauauftrag nach gegnerischen Angriffen erteilt | Kein Abschluss vor der nächsten vollständigen gegnerischen Angriffsgelegenheit. |
| Pionier verbraucht seine letzten Baupunkte | Er bleibt erhalten, kann nicht weiter bauen und kann später aufgefüllt werden. |
| Pionier wird in geeigneter Basis aufgefüllt | Bauvorrat steigt gemäß noch festzulegenden Auffüllparametern; Verbandsstärke und Baupunkte werden getrennt behandelt. |
| Aktiver Produktionsauftrag wird abgebrochen | Sein Fortschritt geht verloren; neuer Auftrag startet bei null. |
| Auftrag wird mit überschüssiger Leistung abgeschlossen | Kein Überschuss wird dem nächsten Auftrag gutgeschrieben. |
| Mehrere Aufträge stehen in der Fabrik | Nur einer wird gleichzeitig bearbeitet. |
| Einheit wird zu Beginn von M fertig | Kein Ausrücken in M; Ausrücken erst in M+1. |
| Siegbedingung vor anstehender Produktion erfüllt | Siegprüfung wird nicht durch die spätere Fertigstellung rückwirkend aufgehoben. |

Diese Kriterien sind dokumentiert, noch nicht als Softwaretests ausgeführt.
