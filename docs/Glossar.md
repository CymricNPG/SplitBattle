# Glossar

Verbindliche Begriffe für [Konzept](Konzept.md), [Spielregeln](Spielregeln.md), [Anforderungen](Anforderungen.md), [Design](Design.md) und [Planung](Planung.md). Englische Begriffe aus dem Ausgangsentwurf werden hier zugeordnet. „Zug“ wird wegen seiner Mehrdeutigkeit nicht als eigenständiger Regelbegriff verwendet.

| Begriff | Bedeutung |
|---|---|
| Partie | Konkreter Spielverlauf zwischen zwei Spielern auf Grundlage eines Szenarios. |
| Runde (Round) | Zwei aufeinanderfolgende Turns; jeder Spieler erhält einmal Bewegung und einmal Aktion. |
| Turn | Gemeinsamer Abschnitt aus gleichzeitiger Planung und anschließender Auswertung. |
| Bewegungsphase (Movement) | Zugteil eines Spielers zum Planen von Bewegungen. |
| Aktionsphase (Action, bisher Attack) | Zugteil des anderen Spielers zum Planen von Angriffen und weiteren zugelassenen Aktionen. |
| Planungsphase | Zeitraum zur Eingabe und Änderung eigener Befehle vor dem eigenen Turnabschluss. |
| Turnabschluss | Verbindliche Bestätigung der eigenen Planung. Die Auswertung wartet auf beide Spieler. |
| Befehl | Geplante Anweisung an ein Spielobjekt; noch keine ausgeführte Zustandsänderung. |
| Aktion | Nach dem Regelsatz zugelassene Tätigkeit eines Spielobjekts, etwa Angriff oder Bau. Nicht gleichbedeutend mit Turn. |
| Auswertung | Regelgeleitete Verarbeitung bestätigter Befehle und fälliger Spielvorgänge. |
| Spielobjekt | Bestandteil der Spielwelt, etwa Einheit, Gebäude oder Geländefeld. |
| Objektdefinition | Wiederverwendbare Beschreibung eines Spielobjekttyps aus Eigenschaften und Parametern. |
| Einheitendefinition | Objektdefinition für einen Einheitentyp. |
| Instanz | Konkretes Spielobjekt innerhalb einer Partie mit seinem aktuellen Zustand. |
| Instanzzustand | Veränderliche Daten einer Instanz, beispielsweise Besitzer, Position oder Schaden. |
| Eigenschaft | Modularer Bestandteil einer Definition, der Daten oder Fähigkeiten beschreibt. |
| Eigenschaftstyp | Wiederverwendbare Art einer Eigenschaft mit ihrer Bedeutung, ihren Parametern und gegebenenfalls Verhalten. |
| Eigenschaftskonfiguration | Konkrete Auswahl und Parametrisierung eines Eigenschaftstyps innerhalb einer Definition. |
| Fähigkeit | Durch Eigenschaften ermöglichtes Verhalten, beispielsweise Erobern oder Reparieren. |
| Parameter | Konfigurierbarer Wert einer Eigenschaft oder Regel, etwa Sichtweite oder Bauzeit. |
| Plugin | Erweiterungsmodul, das beispielsweise Eigenschaftstypen, Verhalten oder Inhalte bereitstellt. |
| Regelsatz | Zusammenstellung der für eine Partie geltenden Regeln und Einstellungen. |
| Standardregelsatz | Mitgelieferte Ausgangskonfiguration des Spiels; keine unveränderliche Typzuordnung. |
| Szenario | Spielvorlage aus Karte, Startaufstellung, Definitionen, Regeln, Zielen und benötigten Plugins. |
| Szenario-Editor | Integrierter Desktopbereich zum Erstellen, Bearbeiten, Prüfen und Probespielen von Szenarien. |
| Spielstand | Gesicherter Zustand einer laufenden Partie einschließlich ihrer Szenariogrundlage. |
| Hexfeld (Tile) | Sechseckiges Kartenfeld mit Gelände- und Höheninformationen. |
| Einheit | Spielobjekt mit militärischer, transportierender, bauender oder anderer durch Eigenschaften bestimmter Rolle. |
| Gebäude | Standortgebundenes Spielobjekt, beispielsweise Hauptquartier, Fabrik oder Stützpunkt. |
| Stadt | Begriff des Ausgangsentwurfs für einen Ort beziehungsweise ein Gebäude; keine automatisch festgelegte Produktionsfähigkeit. |
| Hauptquartier | Gebäude, dessen Eroberung im Standardregelsatz den Sieg ermöglicht. |
| Fabrik | Im Standardregelsatz Gebäude mit Erzeugung von Produktionspunkten und Herstellung von Einheiten. |
| Stützpunkt (Basis) | Im Standardregelsatz errichtbares und eroberbares Gebäude zur Aufnahme und Reparatur von Einheiten. |
| Baueinheit | Einheit mit einer Fähigkeit zum Errichten definierter Bauwerke. |
| Eroberung | Regelgerechter Besitzerwechsel eines Gebäudes; im Standard einschließlich eingelagerter Einheiten. |
| Eingelagerte Einheit | Einheit im Aufnahmebereich eines Gebäudes, statt auf einem eigenen freien Kartenfeld. |
| Transporter | Einheit mit einer Eigenschaft zur Aufnahme und Beförderung anderer Einheiten. |
| Stacking | Mehrere Einheiten auf demselben regulären Kartenfeld; im bisherigen Standard nicht erlaubt. |
| Produktionspunkte | Regelmäßig erzeugte Ressource für die Herstellung von Einheiten; bisher auch Industriepunkte genannt. |
| Produktionsauftrag | Auftrag zur Herstellung eines definierten Einheitentyps. |
| Produktionswarteschlange | Geordnete Liste von Herstellungsaufträgen mit Baufortschritt. |
| Bauzeit | Konfigurierte Dauer eines Herstellungs- oder Bauvorgangs; genaue Fortschrittsregeln sind noch offen. |
| Ausrücken | Verlassen eines Gebäudes durch eine Einheit im Rahmen ihrer Bewegung. |
| Sichtweite | Eigenschaftsparameter, der zur Bestimmung aktuell sichtbarer Felder beiträgt. |
| Fog of War | Spielerabhängige Sicht auf die Welt mit zuletzt bekannten Informationen. |
| Seed | Ausgangswert für reproduzierbare Zufallsberechnungen. |
| Reproduzierbarkeit | Gleiche Ausgangslage, Regeln, Seeds und Befehle liefern dasselbe Ergebnis. |
| Siegbedingung | Regel, deren Erfüllung nach den vereinbarten Auswertungsregeln einen Sieg bewirkt. |
| Gebietsziel | Ziel zur Kontrolle definierter Gebiete oder eines konfigurierten Anteils. |
| Missionsziel | Szenariospezifisches Ziel; konkrete verfügbare Zielarten werden noch definiert. |
| KI | Computergegner, der über dieselben fachlichen Befehlsregeln wie ein Mensch spielt. |
| Serverautoritativ | Die maßgebliche Spielinstanz validiert Befehle und bestimmt den verbindlichen Spielzustand. |
| Ereignis (Event) | Meldung über eine Interaktion oder einen eingetretenen Vorgang. |
| Hook | Vorgesehener Anknüpfungspunkt für Erweiterungen, etwa Tutorialreaktionen auf Ereignisse. |
| Screen | Navigierbarer Bereich der Oberfläche, etwa Hauptmenü oder Editor. |
| Internationalisierung (i18n) | Vorbereitung von Texten und Darstellung für mehrere Sprachen und Regionen. |
| Elo-Wertung | Wertung zur vergleichenden Einschätzung der Spielstärke; konkrete Berechnung ist noch offen. |
| MVP | Erster spielbarer Meilenstein: vollständiges lokales Duell mit integriertem Desktop-Editor. |
| Akzeptanzkriterium | Beobachtbare Bedingung, anhand derer eine Anforderung als erfüllt beurteilt wird. |
| ADR | Dokumentierte Architekturentscheidung mit Begründung; fachliche Entscheidungen werden ebenfalls im Entscheidungsregister geführt. |
| Onion-Architektur | Architektur mit fachlichem Kern, auf den äußere technische Schichten zugreifen. |
| Shared / Server / Graphics / Desktop / Android | Projektmodule mit den in Design beschriebenen Verantwortlichkeiten. |
