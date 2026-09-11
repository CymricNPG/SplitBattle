# Bewegung und Transport

[Katalogübersicht](README.md) · [Eigenschaften](Eigenschaften.md) · [Wechselwirkungen](Wechselwirkungen.md) · [Allgemeine Spielregeln](../Spielregeln.md)

## Geltung

Die folgenden Regeln sind im Konzeptgespräch bestätigt. Sie beschreiben den ersten Regelsatz und verwenden wiederverwendbare Eigenschaften statt Abfragen nach Einheitennamen. Konkrete Transportkapazitäten sind noch offen; bisher vorgeschlagene Bewegungspunkte bleiben ungetestete Werte. Es wird kein Implementierungsstand behauptet.

## Sicht und Bewegungsraum

- Die gesamte Karte mit Gelände und Strukturen wie Gebäuden und Straßen ist bekannt.
- Nicht aktuell sichtbare Felder werden ausgegraut. Dort werden keine Einheiten angezeigt, auch keine zuletzt bekannten Einheitenpositionen. Die frühere Darstellung solcher Positionen entfällt.
- Jeder Abschnitt eines Bewegungswegs muss durch die für diesen Turn sichtbaren Felder führen. Ein sichtbares Ziel allein reicht nicht.
- Die Sichtfläche bleibt während eines Turns fest. Bewegung deckt keine weiteren Felder auf und schafft keine zusätzlichen Bewegungsziele für spätere Befehle desselben Turns.
- Erst für die Planung des nächsten Turns wird die Sicht aus den neuen Positionen berechnet. Sichtweite, Gelände und Höhen bestimmen sie nach den Sichtregeln.
- Die Kenntnis eines Gebäudes außerhalb der Sicht definiert noch keine Einsicht in dessen Insassen oder andere Detailinformationen.

## Wege, Haltefelder und Reihenfolge

Bewegungsprofil und Bewegungskosten bestimmen zulässige Wege und deren Punktebedarf. Eigene Einheiten dürfen durchquert werden. Ein normales Haltefeld muss frei und für das Bewegungsprofil passierbar sein; die Aufnahme in Gebäude und Transporter ist eine gesonderte Regel.

Bei einem blockierten Weg stoppt die Einheit auf dem letzten zulässigen freien Haltefeld vor dem Hindernis. Gibt es auf dem Weg kein solches Feld, bleibt sie am Ausgangsort. Sie sucht keine automatische Umgehung. Ein durchquerbares, von einer eigenen Einheit belegtes Feld ist kein zulässiges Haltefeld.

Alle Bewegungs- und Ladebefehle werden erst nach sämtlichen Angriffen und ihren unmittelbaren Gegenwehrreaktionen ausgeführt, in der Eingabereihenfolge des bewegenden Spielers. Zerstörte Einheiten führen keine Befehle mehr aus.

Bei der Planung ergeben sich erwartete Positionen, Belegungen und freie Transportplätze aus den vorhergehenden eigenen Befehlen. Diese Planung ist eine Vorschau, keine vorgezogene Ausführung. Kampfverluste können ihre Voraussetzungen verändern; die Behandlung davon abhängiger Folgebefehle bleibt teilweise offen.

## Wiederverwendbare Bausteine

| Baustein | Bedeutung |
|---|---|
| Bewegung | Bewegungsprofil und Bewegungspunktebudget |
| Aufnahme | Kapazität und erlaubte Aufnahmeprofile; auch für Gebäude verwendbar |
| Aufnahmeprofil | Merkmal einer möglichen Passagiereinheit; bestimmt die Zulässigkeit unabhängig vom Namen |
| Transportbedarf | Benötigte Kapazität; im ersten Infanterietransporter ein Platz je Verband |
| Transport | Beförderung aufgenommener Einheiten und Ladeaktionen |

Aufnahmeprofil, Bewegungsprofil und Zielprofil sind verschiedene Begriffe. Beispielsweise muss die Erlaubnis zum Transport nicht aus der Fußbewegung abgeleitet werden. Die genaue technische Aufteilung dieser Bausteine ist kein festgelegtes API-Schema.

## Erster Transporter

- Er nimmt Einheiten mit dem Aufnahmeprofil **Infanterie** auf. Die Standardinfanterie erhält dieses Profil; eine andere entsprechend konfigurierte Definition kann ebenfalls aufgenommen werden.
- Jeder Verband dieses Profils belegt einen Platz, unabhängig von seiner aktuellen Verbandsstärke.
- Transportkapazität und Bewegungsrate sind unabhängige Parameter. Eine Bewegungsrate von 6 legt weder 6 Plätze noch eine andere Kapazität fest.
- Einladen erfolgt von einem benachbarten Hexfeld.
- Ausladen erfolgt auf ein benachbartes sichtbares, freies und für den Passagier passierbares Feld.
- Jede Einladeaktion und jede Ausladeaktion kostet den **Transporter einen Bewegungspunkt** aus demselben Budget wie seine Fahrt.
- Fahren, Einladen und Ausladen dürfen in beliebiger Reihenfolge innerhalb des Budgets geplant werden. Zwischen den Befehlen kann sich die Position des Transporters ändern.
- Transporter dürfen im ersten Regelsatz nicht in andere Transporter geladen werden. Ihre Unterbringung in Gebäuden ist erlaubt; automatische Entladung wird in den Gebäuderegeln behandelt.

Diese Ladekosten werden nicht automatisch auf stationäre Gebäude übertragen. Gebäude verwenden Aufnahme, erhalten dadurch aber kein Bewegungsbudget. Ihr Betreten und Verlassen kostet normale Bewegung wie auf Straßen; siehe [Gebäude](Gebaeude.md).

## Passagiere in Transportern

- Eine eigene Bewegung zum Ladeort verbraucht Bewegungspunkte des Passagiers.
- Ein- oder Ausladen beendet seine eigene Bewegung für diesen Turn. Spätere eigene Bewegungsbefehle dieses Passagiers dürfen nicht mehr ausgeführt werden.
- Ladeaktionen sind Befehle des Transporters. Er darf einen Verband im selben Turn einladen, befördern und wieder ausladen, obwohl dessen eigene Bewegung bereits beendet ist.
- Nach dem Ausladen bleibt der Passagier stehen. Mitfahren erneuert kein eigenes Bewegungsbudget.
- Aufgenommene Einheiten greifen nicht an, leisten keine Gegenwehr, erobern nicht und tragen keine eigene Sicht bei.
- Während des laufenden Turns bleibt die bereits berechnete Sichtfläche fest. Bei der Sichtberechnung für den nächsten Turn tragen noch aufgenommene Passagiere keine Sicht bei; ausgeladene Einheiten tragen dann wieder ihre eigene Sicht bei.
- Ab dem nächsten Turn gelten für ausgeladene Einheiten wieder ihre Fähigkeiten gemäß der jeweiligen Phase. Es entsteht kein rückwirkender Angriff im bereits abgeschlossenen Angriffsteil.

## Zerstörung

Wird ein Transporter zerstört, werden alle **zu diesem Zeitpunkt aufgenommenen** Einheiten ebenfalls zerstört. Sie werden zusammen mit dem Transporter entfernt und führen keine weiteren Befehle aus.

Eine erst für später geplante Aufnahme macht eine benachbarte Einheit noch nicht zum Insassen. Sie wird daher durch die Zerstörung dieses Transporters nicht mitzerstört. Ein für einen bereits aufgenommenen Passagier geplanter Ausladebefehl rettet ihn nicht vor der vorherigen Kampfauswertung.

## Fachliche Prüfszenarien

Die Beispiele sind Kriterien für spätere Tests; es wurden keine Spieltests ausgeführt. Beispielwege setzen sichtbare, zulässige Felder, passende Nachbarschaft und freie Kapazität voraus.

| Situation | Erwartetes Ergebnis |
|---|---|
| Transporter mit 6 Punkten: 2 fahren, einladen, 2 fahren, ausladen | 2 + 1 + 2 + 1 = 6 Punkte verbraucht; Passagier bleibt am Ausladeort stehen. |
| Passagier nähert sich vor dem Einladen | Annäherung kostet eigene Punkte; Einladen kostet den Transporter 1 Punkt und beendet die eigene Bewegung des Passagiers. |
| Ein weiterer eigener Bewegungsbefehl des Passagiers folgt nach dem Ausladen | Dieser darf nicht ausgeführt werden. |
| Späher fährt an den bisherigen Sichtrand | Keine zusätzliche Sicht und keine neuen Bewegungsziele für andere Einheiten im selben Turn. |
| Ein Weg führt über ein unsichtbares Feld zu einem sichtbaren Ziel | Der Weg darf nicht geplant werden. |
| Nächster Turn beginnt | Sicht wird aus den neuen Positionen berechnet. Außerhalb davon erscheinen Gelände und Strukturen ausgegraut, Einheiten werden ausgeblendet. |
| Weg endet an einem Hindernis hinter einer eigenen Einheit | Halt auf dem letzten freien zulässigen Feld davor, nicht auf dem belegten Feld; keine Umgehung. |
| Transporter wird vor der Bewegung zerstört | Bereits aufgenommene Insassen werden zerstört. Eine erst zur Aufnahme vorgesehene benachbarte Einheit wird dadurch nicht mitzerstört. |
| Einheit ohne Aufnahmeprofil Infanterie soll einsteigen | Der erste Transporter nimmt sie nicht auf, auch wenn ihr Anzeigename „Infanterie“ lautet. |
| Ein Transporter soll in einen anderen geladen werden | Im ersten Regelsatz unzulässig. |

## Verbleibende Details

- Konkrete Transportkapazität.
- Kosten fehlgeschlagener Ladebefehle und Behandlung abhängiger Folgebefehle nach einem Fehlschlag.
- Aufnahmeprofile von Gebäuden, automatisches Entladen und Weiterbewegung; normale Bewegungskosten beim Betreten und Verlassen sind wie bei Straßen festgelegt.
- Allgemeine Anzahl gewöhnlicher Bewegungsbefehle pro Einheit; hierfür wird keine zusätzliche Entscheidung aus den Transportketten abgeleitet.
- Listenposition nach Änderung eines geplanten Befehls.

Diese Punkte bleiben in O-07 und O-16 in [Entscheidungen](../Entscheidungen.md) nachvollziehbar. Sichtgeometrie und konkrete Höhenwirkung werden weiterhin separat präzisiert.
