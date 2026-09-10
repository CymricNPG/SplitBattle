# Eigenschaften

[Katalogübersicht und Status](README.md) · [Glossar](../Glossar.md)

## Prinzip

**Bestätigt:** Spielobjekte werden aus Eigenschaften zusammengesetzt. Fähigkeiten hängen an der Definition und nicht am Namen eines Einheitentyps. Plugins ergänzen neue Eigenschaftstypen samt Verhalten; vorhandene Eigenschaften werden ohne neue Regelprogrammierung kombiniert.

Die folgende Aufteilung ist ein **fachlicher Vorschlag**, kein festgelegtes API- oder Speicherformat. Definitionen tragen Parameter, Instanzen ihren aktuellen Zustand. Nicht jedes Spielobjekt muss jede Eigenschaft besitzen.

## Eigenschaften für Einheiten und Gebäude

| Eigenschaft / Baustein | Parameter der Definition | Zustand einer Instanz / Verwendung |
|---|---|---|
| Besitzerzuordnung | Regeln zur Besitzerzuordnung noch offen | Aktueller Besitzer von Einheit oder Gebäude |
| Position | Regeln für Platzierung und Aufnahme noch offen | Ort auf der Karte beziehungsweise Zuordnung zu einem aufnehmenden Objekt |
| Verbandsstärke | Maximale Stärke; genaue Skalierung der Angriffskraft offen | Aktuelle Stärke einer Einheit; Verluste verringern die Angriffskraft |
| Bewegung | Bewegungsprofil und Punktebudget | Bewegung einer Einheit; Profil unabhängig von Bewaffnung und Zielprofil |
| Zielprofil | Ungeschützt, leicht gepanzert oder schwer gepanzert als vorgeschlagenes Startset | Grundlage für die Wirksamkeit von Waffen; keine Kampfformel vorgegeben |
| Sicht | Sichtweite | Berechnung zum nächsten Turn aus neuen Positionen; Sichtfläche während des Turns fest, aufgenommene Insassen tragen bei der Neuberechnung nicht bei |
| Angriff | Mindest- und Maximalreichweite, Wirksamkeit je Zielprofil | Regulärer Angriff; konkrete Schadenswerte noch offen |
| Indirektes Feuer | Nutzung gemeinsamer aktueller Aufklärung | Erlaubt Angriff ohne eigene freie Sichtlinie; benötigt Angriffsfähigkeit |
| Gegenwehr | Reaktionslimit und Schadensfaktor | Verbleibende Reaktionen; nur ausdrücklich ausgestattete Einheiten reagieren |
| Aufnahme | Kapazität und erlaubte Aufnahmeprofile | Enthaltene Einheiten; gemeinsam für Gebäude und Transporter nutzbar |
| Aufnahmeprofil | Beispielsweise Infanterie | Bestimmt Aufnahmefähigkeit unabhängig von Name, Bewegungs- und Zielprofil |
| Transportbedarf | Ein Platz je Verband im ersten Infanterietransporter | Belegt Aufnahmeplätze unabhängig von aktueller Verbandsstärke |
| Transport | Im ersten Regelsatz 1 Bewegungspunkt je Ein- oder Ausladen aus dem Budget des Transporters | Fahrt und Laden verkettbar; Insassen ohne Außenaktionen, bei Zerstörung mitzerstört; keine verschachtelten Transporter |
| Eroberung | Zulässige Eroberungsziele | Ermöglicht regelgerechten Besitzerwechsel |
| Bau | Errichtbare Objektdefinitionen; Kosten und Dauer offen | Bauvorgang, soweit nach späterer Regeldefinition erforderlich |
| Reparatur | Zulässige Ziele, Umfang, Kosten und Dauer offen | Wiederherstellung beschädigter Einheiten |
| Ressourcenerzeugung | Ressourcenart und Ertrag je Runde | Fabriken erzeugen Produktionspunkte; Buchungsregeln offen |
| Produktion | Herstellbare Definitionen, Kosten und Bauzeiten | Produktionswarteschlange mit Aufträgen und Baufortschritt |

Bewegungsprofil und Zielprofil sind getrennt: Ein Kettenfahrzeug kann leicht oder schwer gepanzert sein. Eine schwere Panzerung ist keine automatische Folge des Bewegungsprofils.

## Gegenwehr

| Aspekt | Festlegung | Status |
|---|---|---|
| Verfügbarkeit | Nur bei ausdrücklich zugewiesener Gegenwehrfähigkeit; Standard ist deaktiviert | Bestätigt |
| Häufigkeit im Startregelsatz | Höchstens eine Reaktion pro Turn | Bestätigt |
| Schaden | Geringer als bei einem regulären Angriff | Bestätigt |
| Erster Testwert | 50 % des normalen Schadens | Vorschlag – ungetestet |
| Zuweisung zu Starteinheiten | Noch keine Auswahl getroffen | Offen |
| Auslösung und Reihenfolge | Beim ersten Angriff; nach dessen Schaden sofortige Gegenwehr mit verbleibender Stärke, nur wenn der Verteidiger überlebt | Bestätigt |
| Gegenwehr-Zielprüfung | Reichweite und weitere Zulässigkeitsbedingungen; keine Verfallsregel vorweggenommen | Offen |

Der Reaktionszähler gilt pro Turn, nicht pro Runde. Die Abwesenheit der Eigenschaft erlaubt keine Gegenwehr, auch wenn die Einheit regulär angreifen kann. Die [Wechselwirkungen](Wechselwirkungen.md) enthalten die sofortige Schadensanwendung und den noch ungetesteten Formelvorschlag.

## Eigenschaften für Gelände

| Eigenschaft | Inhalt | Wiederverwendung |
|---|---|---|
| Passierbarkeit | Zugelassene Bewegungsprofile | Alle Grundgelände und Ergänzungen |
| Bewegungskosten | Kosten des Betretens je zugelassenem Profil | Gemeinsame Profile für alle Einheiten |
| Deckung | Schutzwirkung je Zielprofil; Testwerte in Wechselwirkungen | Gelände und gegebenenfalls spätere Ergänzungen |
| Sichtbehinderung | Wirkung auf Sichtlinien; genaue Regeln offen | Wald, Höhen und weitere Sichtbarrieren |
| Bebaubarkeit | Zulässige Bauwerke und Bedingungen; Details offen | Bauplatzprüfung für jede Baueinheit |
| Höhe | Abstrakte Höhenstufe unabhängig vom Grundgelände; Stufengrenzen offen | Beispielsweise Ebene oder Wald auf einem Hügel |

Die Kombination mehrerer Beiträge zu Kosten, Deckung oder Sicht bleibt teilweise offen. Bestätigt sind erhaltene Walddeckung auf Straßen und halbierte Deckungswirkung gegen indirektes Feuer; siehe [Wechselwirkungen](Wechselwirkungen.md). Eine Straße überschreibt daher noch nicht automatisch sämtliche Eigenschaften des Grundgeländes.

## Beispiele für Wiederverwendung

- Ein bewaffneter Transporter kombiniert Bewegung, Aufnahme, Transport und Angriff.
- Ein eroberungsfähiges Fahrzeug erhält Eroberung; eine Typabfrage auf „Infanterie“ ist nicht erforderlich.
- Eine Fabrik und ein Transporter verwenden Aufnahme mit unterschiedlichen Parametern.
- Artillerie kombiniert Angriff mit größerer Mindest- und Maximalreichweite sowie indirektem Feuer; eine monolithische Eigenschaft „Artillerie“ ist nicht nötig.
- Wald mit Höhe ergibt einen bewaldeten Hügel. Eine zusätzliche Straße wird separat ergänzt.


## Bewegung und Aufnahme im ersten Regelsatz

Die [Transportregeln](Bewegung_und_Transport.md) konkretisieren die Bausteine. Kapazität und Bewegungsrate sind unabhängig. Laden beendet die eigene Bewegung des Passagiers, nicht die Beförderung durch den Transporter. Die eigene Bewegungssperre des Passagiers und sein Aufenthaltsort sind Instanzzustand. Aufnahmeprofile und Kapazität sind Definitionsparameter. Gebäude verwenden denselben Aufnahmebaustein; ihre Lade- und Austrittskosten sind separat offen.
