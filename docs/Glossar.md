# Glossar

Verbindliche Begriffe für [Konzept](Konzept.md), [Spielregeln](Spielregeln.md), [Anforderungen](Anforderungen.md), [Design](Design.md) und [Planung](Planung.md). Englische Begriffe aus dem Ausgangsentwurf werden hier zugeordnet. „Zug“ wird wegen seiner Mehrdeutigkeit nicht als eigenständiger Regelbegriff verwendet.

| Begriff                                        | Bedeutung                                                                                                                                                                                        |
|------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ADR                                            | Dokumentierte Architekturentscheidung mit Begründung; fachliche Entscheidungen werden ebenfalls im Entscheidungsregister geführt.                                                                |
| Aktion                                         | Nach dem Regelsatz zugelassene Tätigkeit eines Spielobjekts, etwa Angriff oder Bau. Nicht gleichbedeutend mit Turn.                                                                              |
| Aktionsphase (Action, bisher Attack)           | Zugteil des anderen Spielers zum Planen von Angriffen und weiteren zugelassenen Aktionen.                                                                                                        |
| Akzeptanzkriterium                             | Beobachtbare Bedingung, anhand derer eine Anforderung als erfüllt beurteilt wird.                                                                                                                |
| Ausrücken                                      | Verlassen eines Gebäudes durch eine Einheit im Rahmen ihrer Bewegung.                                                                                                                            |
| Auswertung                                     | Verarbeitung nach beiderseitigem Abschluss: zuerst sämtliche Angriffe samt sofortiger Gegenwehr, danach Bewegungen; beide Listen in Eingabereihenfolge. Einordnung weiterer Vorgänge noch offen. |
| Baueinheit                                     | Einheit mit einer Fähigkeit zum Errichten definierter Bauwerke.                                                                                                                                  |
| Bauzeit                                        | Konfigurierte Dauer eines Herstellungs- oder Bauvorgangs; genaue Fortschrittsregeln sind noch offen.                                                                                             |
| Befehl                                         | Geplante Anweisung an ein Spielobjekt; noch keine ausgeführte Zustandsänderung.                                                                                                                  |
| Bewegungsphase (Movement)                      | Zugteil eines Spielers zum Planen von Bewegungen.                                                                                                                                                |
| Deckung                                        | Zielprofilabhängige Schadensreduktion; unabhängig von Passierbarkeit und Sichtbarkeit.                                                                                                           |
| Eigenschaft                                    | Fachlicher Baustein eines Spielobjekts; im ECS durch einen Komponententyp und gegebenenfalls ein Komponenten-Template ausgedrückt.                                                               |
| Eigenschaftskonfiguration                      | Konkrete Auswahl und Parametrisierung eines Eigenschaftstyps; im ECS ein Komponenten-Template eines Prefabs.                                                                                     |
| Eigenschaftstyp                                | Wiederverwendbare Art einer Eigenschaft; im ECS ein Komponententyp mit Bedeutung, Parametern und gegebenenfalls zugehörigem Fachsystem.                                                           |
| Eingelagerte Einheit                           | Einheit im Aufnahmebereich eines Gebäudes, statt auf einem eigenen freien Kartenfeld.                                                                                                            |
| Entität (Entity)                               | Konkretes Spielobjekt in der ECS-Welt einer Partie. Ihre Komponentenmenge bestimmt, ob sie etwa Einheit, Gebäude oder Hexfeld ist.                                                                |
| Entitätsvorlage                                | Teil der Szenariostartaufstellung, der ein Prefab für die beim Partiestart zu erzeugende Entität auswählt.                                                                                       |
| ECS-Welt                                       | Maßgebliche Menge der Entitäten und ihrer Laufzeitkomponenten in einer Partie.                                                                                                                   |
| Einheit                                        | Spielobjekt mit militärischer, transportierender, bauender oder anderer durch Eigenschaften bestimmter Rolle.                                                                                    |
| Einheitendefinition                            | Objektdefinition für einen Einheitentyp; im ECS ein Prefab für Einheitenentitäten.                                                                                                              |
| Elo-Wertung                                    | Wertung zur vergleichenden Einschätzung der Spielstärke; konkrete Berechnung ist noch offen.                                                                                                     |
| Ereignis (Event)                               | Meldung über eine Interaktion oder einen eingetretenen Vorgang.                                                                                                                                  |
| Eroberung                                      | Regelgerechter Besitzerwechsel eines Gebäudes; im Standard einschließlich eingelagerter Einheiten.                                                                                               |
| Fabrik                                         | Im Standardregelsatz Gebäude mit Erzeugung von Produktionspunkten und Herstellung von Einheiten.                                                                                                 |
| Fog of War                                     | Vollständig bekannte Karte; unsichtbare Felder ausgegraut und ohne Einheiten oder deren zuletzt bekannte Positionen. Sichtfläche während eines Turns fest, Neuberechnung zum nächsten Turn.      |
| Fähigkeit                                      | Durch Eigenschaften ermöglichtes Verhalten, beispielsweise Erobern oder Reparieren.                                                                                                              |
| Gebietsziel                                    | Ziel zur Kontrolle definierter Gebiete oder eines konfigurierten Anteils.                                                                                                                        |
| Gebäude                                        | Standortgebundenes Spielobjekt, beispielsweise Hauptquartier, Fabrik oder Stützpunkt.                                                                                                            |
| Gegenwehr                                      | Ausdrücklich zugewiesene, abgeschwächte Reaktion eines überlebenden Verteidigers unmittelbar nach dem ersten Angriff, höchstens einmal je Turn.                                                  |
| Hauptquartier                                  | Gebäude, dessen Eroberung im Standardregelsatz den Sieg ermöglicht.                                                                                                                              |
| Hexfeld (Tile)                                 | Sechseckiges Kartenfeld mit Gelände- und Höheninformationen; im ECS eine Entität mit Hexfeld-, Terrain- und Höhenkomponente.                                                                    |
| Hook                                           | Vorgesehener Anknüpfungspunkt für Erweiterungen, etwa Tutorialreaktionen auf Ereignisse.                                                                                                         |
| Höhenstufe                                     | Abstrakte Erhebung unabhängig vom Grundgelände; konkrete Grenzen und Wirkungen noch offen.                                                                                                       |
| Indirektes Feuer                               | Angriff ohne eigene freie Sichtlinie auf ein aktuell durch eigene Einheiten aufgeklärtes Ziel; halbiert die Deckungswirkung.                                                                     |
| Instanz                                        | Konkretes Spielobjekt innerhalb einer Partie; im ECS eine Entität mit Laufzeitkomponenten.                                                                                                       |
| Instanzzustand                                 | Veränderliche Daten einer Instanz; im ECS durch Laufzeitkomponenten wie Besitzer, Position oder Schaden gehalten.                                                                                |
| Internationalisierung (i18n)                   | Vorbereitung von Texten und Darstellung für mehrere Sprachen und Regionen.                                                                                                                       |
| KI                                             | Computergegner, der über dieselben fachlichen Befehlsregeln wie ein Mensch spielt.                                                                                                               |
| Komponente                                     | Datenbaustein einer Entität. Komponenten sind entweder unveränderliche Templates in einem Prefab oder veränderliche Laufzeitkomponenten einer Partie.                                           |
| Komponenten-Template                           | Unveränderliche Parametrisierung eines Komponententyps in einem Prefab.                                                                                                                          |
| Komponententyp                                 | Wiederverwendbare Art einer Komponente, beispielsweise Bewegung, Sicht, Angriff oder Inventar.                                                                                                  |
| Laufzeitkomponente                             | Veränderlicher Komponentenanteil einer Entität in der ECS-Welt, beispielsweise Position, Besitzer oder Produktionsfortschritt.                                                                   |
| Missionsziel                                   | Szenariospezifisches Ziel; konkrete verfügbare Zielarten werden noch definiert.                                                                                                                  |
| MVP                                            | Erster spielbarer Meilenstein: vollständiges lokales Duell mit integriertem Desktop-Editor.                                                                                                      |
| Objektdefinition                               | Wiederverwendbare Beschreibung eines Spielobjekttyps aus Eigenschaften und Parametern; im ECS ein Prefab.                                                                                       |
| Onion-Architektur                              | Architektur mit fachlichem Kern, auf den äußere technische Schichten zugreifen.                                                                                                                  |
| Parameter                                      | Konfigurierbarer Wert einer Eigenschaft oder Regel, etwa Sichtweite oder Bauzeit.                                                                                                                |
| Partie                                         | Konkreter Spielverlauf zwischen zwei Spielern auf Grundlage eines Szenarios.                                                                                                                     |
| Planungsphase                                  | Zeitraum zur Eingabe und Änderung eigener Befehle vor dem eigenen Turnabschluss.                                                                                                                 |
| Prefab                                         | Unveränderliche ECS-Objektdefinition aus Komponenten-Templates, auf die Entitäten derselben fachlichen Art verweisen.                                                                            |
| Plugin                                         | Erweiterungsmodul, das beispielsweise Komponententypen, Fachsysteme, Verhalten oder Inhalte bereitstellt.                                                                                       |
| Produktionsauftrag                             | Auftrag zur Herstellung eines definierten Einheitentyps.                                                                                                                                         |
| Produktionspunkte | Fortschritt am aktiven Fabrikauftrag; im Standard kein separater Ressourcenvorrat. |
| Produktionswarteschlange                       | Geordnete Liste von Herstellungsaufträgen mit Baufortschritt.                                                                                                                                    |
| Regelsatz                                      | Zusammenstellung der für eine Partie geltenden Regeln und Einstellungen.                                                                                                                         |
| Reproduzierbarkeit                             | Gleiche Ausgangslage, Regeln, Seeds und Befehle liefern dasselbe Ergebnis.                                                                                                                       |
| Runde (Round)                                  | Zwei aufeinanderfolgende Turns; jeder Spieler erhält einmal Bewegung und einmal Aktion.                                                                                                          |
| Screen                                         | Navigierbarer Bereich der Oberfläche, etwa Hauptmenü oder Editor.                                                                                                                                |
| Seed                                           | Ausgangswert für reproduzierbare Zufallsberechnungen.                                                                                                                                            |
| Serverautoritativ                              | Die maßgebliche Spielinstanz validiert Befehle und bestimmt den verbindlichen Spielzustand.                                                                                                      |
| Shared / Server / Graphics / Desktop / Android | Projektmodule mit den in Design beschriebenen Verantwortlichkeiten.                                                                                                                              |
| Sichtweite                                     | Eigenschaftsparameter, der zur Bestimmung aktuell sichtbarer Felder beiträgt.                                                                                                                    |
| Siegbedingung                                  | Regel, deren Erfüllung nach den vereinbarten Auswertungsregeln einen Sieg bewirkt.                                                                                                               |
| Spielobjekt                                    | Bestandteil der Spielwelt, etwa Einheit, Gebäude oder Geländefeld; im ECS eine Entität.                                                                                                         |
| Spielstand                                     | Gesicherter Zustand einer laufenden Partie einschließlich ihrer Szenariogrundlage.                                                                                                               |
| Stacking                                       | Mehrere Einheiten auf demselben regulären Kartenfeld; im bisherigen Standard nicht erlaubt.                                                                                                      |
| Stadt                                          | Begriff des Ausgangsentwurfs für einen Ort beziehungsweise ein Gebäude; keine automatisch festgelegte Produktionsfähigkeit.                                                                      |
| Standardregelsatz                              | Mitgelieferte Ausgangskonfiguration des Spiels; keine unveränderliche Typzuordnung.                                                                                                              |
| Stützpunkt (Basis)                             | Im Standardregelsatz errichtbares und eroberbares Gebäude zur Aufnahme und Reparatur von Einheiten.                                                                                              |
| System (Fachsystem)                            | ECS-Baustein, der passende Entitäten und Komponenten abfragt und im Auftrag der Turn-Zustandsmaschine fachliche Regeln ausführt.                                                                 |
| Szenario                                       | Spielvorlage aus Karte, Startaufstellung, Definitionen, Regeln, Zielen und benötigten Plugins.                                                                                                   |
| Szenario-Editor                                | Integrierter Desktopbereich zum Erstellen, Bearbeiten, Prüfen und Probespielen von Szenarien.                                                                                                    |
| Transporter                                    | Einheit mit einer Eigenschaft zur Aufnahme und Beförderung anderer Einheiten.                                                                                                                    |
| Turn                                           | Gemeinsamer Abschnitt aus gleichzeitiger Planung und anschließender Auswertung.                                                                                                                  |
| Turnabschluss                                  | Verbindliche Bestätigung der eigenen Planung. Die Auswertung wartet auf beide Spieler.                                                                                                           |

## ECS-Laufzeitmodell

| Begriff | Bedeutung |
|---|---|
| Aufenthaltskomponente | Einzige veränderliche Zuordnung einer Entität zu einem Hexfeld oder Aufnahmeobjekt. Inventar, Kapazitätsbelegung und Feldbelegung werden daraus abgeleitet. |
| Besitzerkomponente | Aktueller Besitzer einer Einheit oder eines Gebäudes. |
| Stärkekomponente | Aktuelle Verbandsstärke einer Einheit. |
| Bewegungszustand | Verbleibendes Bewegungsbudget und Sperre nach Laden; wird zu Beginn der Bewegungsphase des Besitzers zurückgesetzt. |
| Gegenwehrzustand | Vermerkt die bereits verbrauchte Gegenwehr einer Einheit; wird zu Beginn jedes Turns zurückgesetzt. |
| Besetzungszustand | Vorläufige Bindung eines Eroberers an ein Zielgebäude bis zum Abbruch, zur Zerstörung oder zum erfolgreichen Besitzerwechsel. |
| Bauvorrat | Aktuelle Baupunkte einer Baueinheit, getrennt von Verbandsstärke und Produktionsfortschritt. |
| Bauauftragszustand | Laufender Bauauftrag einer Baueinheit einschließlich seiner noch erforderlichen Überlebensfrist. |
| Produktionszustand | Aktiver Fabrikauftrag, sein Fortschritt und die Produktionswarteschlange. |
| Einsatzbereitschaft | Sperre einer neu produzierten Einheit bis zur folgenden eigenen Bewegungsphase. |
| Stützpunktwarteschlange | Gemeinsame Warteschlange für Reparatur- und Baupunkteauffüllaufträge eines Stützpunkts. |
| Infrastrukturzustand | Dynamisch errichtete Infrastruktur eines Hexfelds, zusätzlich zum unveränderlichen Terrain-Prefab. |
| Weltressource | Veränderlicher, maßgeblicher Zustand der ECS-Welt ohne einzelne Eigentümerentität. |
| Turn-Zustandsmaschine | Weltressource für aktuelle Phase und Rollenverteilung; sie aktiviert Fachsysteme in bestätigter Reihenfolge. |
| Zufallszustand | Weltressource, die reproduzierbare Zufallsberechnungen einer Partie ermöglicht. |
| Sichtzustand | Weltressource mit der für den Turn festen Sichtfläche jedes Spielers. |
| Partieergebnis | Weltressource, die das Ende und Ergebnis einer Partie festhält. |

## Bewegung und Transport

| Begriff                    | Bedeutung                                                                                                                                                  |
|----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Aufnahme                   | Gemeinsame Fähigkeit von Gebäuden und Transportern, zulässige Einheiten bis zur definierten Kapazität aufzunehmen.                                         |
| Aufnahmeprofil             | Merkmal einer möglichen Passagiereinheit, das ihre Aufnahme unabhängig vom Einheitennamen erlaubt; etwa Infanterie.                                        |
| Transportbedarf            | Benötigte Aufnahmeplätze; beim ersten Infanterietransporter ein Platz je Verband.                                                                          |
| Transportkapazität         | Maximal verfügbare Aufnahmeplätze; unabhängig vom Bewegungspunktebudget.                                                                                   |
| Ladeaktion                 | Ein- oder Ausladen; kostet im ersten Transportregelsatz den Transporter jeweils 1 Bewegungspunkt.                                                          |
| Passagier / Insasse        | Tatsächlich aufgenommene Einheit; eine erst geplante Aufnahme zählt noch nicht.                                                                            |
| Bewegungssperre nach Laden | Nach Ein- oder Ausladen führt der Passagier im selben Turn keine eigene Bewegung mehr aus; Beförderung und Ausladen durch den Transporter bleiben möglich. |
| Sichtfläche                | Menge der für einen Spieler in diesem Turn sichtbaren Felder; wird erst für den nächsten Turn neu berechnet.                                               |
| Haltefeld                  | Freies, für die Einheit passierbares Feld, auf dem ihre Bewegung regulär enden darf.                                                                       |

## Bau und Produktion

| Begriff | Bedeutung |
|---|---|
| Baupunkte | Auffüllbarer Bauvorrat eines Pioniers; von Verbandsstärke und Fabrikfortschritt getrennt. Bei null bleibt der Pionier erhalten. |
| Pionier | Baueinheit mit Baupunkten; kann ihren Vorrat in geeigneten Basen auffüllen. |
| Baugeschwindigkeit | Produktionspunkte pro Runde, mit denen eine Fabrik ihren aktiven Auftrag bearbeitet. |
| Produktionsfortschritt | Bereits erbrachte Leistung am Auftrag; bei Abbruch verloren, kein Restübertrag. |
| Produktionskosten | Für die Herstellung eines Einheitentyps erforderlicher Gesamtfortschritt. |
| Gebäudeinventar | Unbegrenzt aufnehmender Bestand im Standard; Insassen können angreifen, sind nicht gezielt angreifbar und leisten keine Gegenwehr. |
| Gegnerische Angriffsgelegenheit | Vollständiger gegnerischer Angriffsteil nach Beginn von Besetzung oder Bau; ein bloßer Rollenwechsel reicht dafür nicht. |
