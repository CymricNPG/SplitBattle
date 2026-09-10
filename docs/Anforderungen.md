# Anforderungen

Grundlagen: [Konzept](Konzept.md), [Spielregeln](Spielregeln.md), [Glossar](Glossar.md). Entscheidungen und offene Fragen werden in [Entscheidungen](Entscheidungen.md) geführt.

## Status und Priorisierung

Alle Anforderungen sind geplant, nicht als implementiert nachgewiesen. P1 ist für den ersten spielbaren Meilenstein erforderlich; P2 bezeichnet den weiteren Ausbau. „Detailklärung erforderlich“ kennzeichnet Anforderungen, deren Akzeptanz vor Implementierung ergänzt werden muss. IDs bleiben dauerhaft stabil. Die Kriterien sind fachliche Prüfszenarien, keine bereits ausgeführten Softwaretests.

## Spielablauf

| ID | Prio | Anforderung | Akzeptanzkriterium |
|---|---|---|---|
| PLAY-01 | P1 | Zwei Menschen spielen dieselbe lokale Partie in zwei getrennten Desktopfenstern. | Beide Fenster zeigen den Zustand derselben Partie aus ihrer jeweiligen Spielersicht; eine Partie kann bis zum Sieg abgeschlossen werden. |
| TURN-01 | P1 | Beide Spieler planen gleichzeitig unterschiedliche Zugteile. | A kann in seiner Bewegungsphase Bewegungen planen, B in seiner Aktionsphase Angriffe; nach Auswertung sind die Rollen vertauscht. Nach zwei Turns hat jeder beide Rollen erhalten. |
| TURN-02 | P1 | Gegnerische Befehle bleiben während der Planung verdeckt. | Eine Änderung durch A erscheint in B weder als Befehlsanzeige noch als vorzeitige Änderung des Weltzustands. B sieht den für ihn sichtbaren Turnanfangszustand. |
| TURN-03 | P1 | Alle eigenen Befehle bleiben bis zum eigenen Abschluss änderbar. | A ändert oder entfernt auch einen früheren Befehl nach Eingabe weiterer Befehle. Nach eigenem Abschluss ist das nicht mehr möglich. |
| TURN-04 | P1 | Auswertung erst nach beiderseitigem Abschluss; Kampf vor Bewegung. | Nach Abschluss nur eines Spielers bleibt der Zustand unausgewertet. Wird eine zur Bewegung vorgesehene Einheit im anschließenden Kampf zerstört, wird sie nicht bewegt. |
| TURN-05 | P1 | Alle Angriffe werden in Eingabereihenfolge vollständig vor allen Bewegungen ausgeführt. Bewegungen folgen ebenfalls der Eingabereihenfolge. | Bei Angriffsliste A, B und Bewegungsliste X, Y lautet die Auswertung A einschließlich Gegenwehr, B einschließlich Gegenwehr, X, Y. Während der gesamten Planung und zwischen Gefechten wird keine Einheit bewegt. |
| COMBAT-01 | P1 | Schäden wirken sofort; zerstörte Einheiten werden unmittelbar entfernt. | Ein durch A zerstörter Verteidiger reagiert nicht und bewegt sich später nicht. Ein späterer Angriff beschädigt das bereits entfernte Ziel nicht erneut. |
| COMBAT-02 | P1 | Gegenwehr erfordert die ausdrücklich zugewiesene Fähigkeit, erfolgt beim ersten Angriff höchstens einmal je Turn und verursacht geringeren Schaden. | Ohne Fähigkeit keine Gegenwehr. Ein befähigter, überlebender Verteidiger antwortet sofort mit seiner verbleibenden Stärke vor dem nächsten Angriff; beim zweiten Angriff keine weitere Reaktion. Für dieses Beispiel sind alle Zielbedingungen erfüllt; Reichweitenprüfung bleibt O-05. |
| COMBAT-03 | P1 | Zufällige Schwankungen der Angriffswirkung liegen innerhalb ±10 %. | Der Zufallsfaktor bleibt zwischen 0,9 und 1,1; identische Seeds und Eingaben reproduzieren Ergebnisse. Verteilung und endgültige Formel gemäß O-05. |
| TERRAIN-01 | P1 | Waldrand ist sichtbar, dahinter blockiert Wald Sicht; Straßen erhalten Walddeckung. | Bei gleicher Höhe, ausreichender Sichtweite und ohne weitere Aufklärung ist die erste Waldeinheit sichtbar, die dahinter nicht. Wald mit Straße gewährt denselben Schutz wie ohne Straße. Sichtgeometrie gemäß O-07. |
| TERRAIN-02 | P1 | Indirektes Feuer nutzt gemeinsame aktuelle Aufklärung und halbiert die Deckungswirkung. | Ein aufgeklärtes Ziel kann ohne eigene freie Sichtlinie angegriffen werden. Bei Testdeckung 40 % wirken gegen indirektes Feuer 20 %; die Testzahl selbst ist kein verbindlicher Balancewert. |
| CAP-01 | P1 | Eroberungsfähigkeit bestimmt zulässige Eroberungen; eingelagerte Einheiten wechseln mit dem Gebäude den Besitzer. | Eine entsprechend konfigurierte Panzereinheit kann ein zulässiges Gebäude erobern; Infanterie ohne diese Fähigkeit nicht. Bei erfolgreicher Eroberung einer Fabrik mit zwei eingelagerten Einheiten gehören danach alle drei Objekte dem Eroberer. Detailklärung O-04. |
| BUILD-01 | P1 | Einheiten mit passender Baufähigkeit können Stützpunkte errichten. | Unter den noch festzulegenden Bauvoraussetzungen errichtet eine Baueinheit einen definierten Stützpunkt; ohne Baufähigkeit steht der Befehl nicht zur Verfügung. Detailklärung O-01, O-03. |
| ECO-01 | P1 | Fabriken erzeugen die konfigurierte Menge Produktionspunkte pro Runde. | Eine Fabrik mit Ertrag X erzeugt über eine vollständige Runde genau X, nicht X je Turn. Empfänger und Buchungszeitpunkt werden gemäß O-02 ergänzt. |
| ECO-02 | P1 | Produktionsaufträge werden in einer Warteschlange mit konfigurierbarer, auch mehrründiger Bauzeit verwaltet. | Bei erfüllten Ressourcenbedingungen ist ein Auftrag mit Bauzeit N vor N festgelegten Fortschrittsschritten nicht fertig und nach N fertig. Kosten, Fortschritt und Warteschlangenregeln erfordern O-02. |
| ECO-03 | P1 | Fertige Einheiten können in der nächsten eigenen Bewegungsphase nach Fertigstellung ausrücken. | Keine nachträgliche Bewegung im bereits geplanten Turn; Ausrücken wird erst für die folgende eigene Bewegungsplanung angeboten. |
| WIN-01 | P1 | Hauptquartiereroberung oder vollständige Vernichtung des Gegners führt im Standard zum Sieg. | Zwei getrennte Szenarien belegen je einen Siegweg. Verlust einer gewöhnlichen Fabrik allein löst keinen Sieg aus. Prüfzeitpunkt und Sonderfälle erfordern O-06. |
| WIN-02 | P1 | Gebiets- und Missionsziele sind konfigurierbar. | Ein Szenario speichert und lädt ein ausgewähltes Ziel mit seinen Parametern; erfüllte und nicht erfüllte Ziele werden entsprechend ausgewertet. Verfügbare Zielarten und Verknüpfung werden mit O-06 konkretisiert. |

## Bewegung und Transport

Grundlage: [Bewegung und Transport](Spielregeln/Bewegung_und_Transport.md). Beispiele setzen zulässige sichtbare Wege, passende Nachbarschaft und freie Kapazität voraus.

| ID | Prio | Anforderung | Akzeptanzkriterium |
|---|---|---|---|
| MOVE-01 | P1 | Jeder Weg bleibt vollständig innerhalb der festen Sichtfläche dieses Turns. | Ein Weg über ein unsichtbares Feld zu einem sichtbaren Ziel wird nicht zugelassen. Ein vorfahrender Späher erweitert die zulässigen Wege im selben Turn nicht. |
| MOVE-02 | P1 | Bei Blockaden endet Bewegung am letzten zulässigen freien Haltefeld; keine Umgehung. | Ein davor von einer eigenen Einheit belegtes Feld wird durchquert, aber nicht als Halt verwendet. Ohne freies Haltefeld auf dem Weg bleibt die Einheit am Ausgangsort. |
| TRANS-01 | P1 | Aufnahmeprofile und Transportbedarf bestimmen die Zulässigkeit, unabhängig vom Einheitennamen. | Eine Definition mit Aufnahmeprofil Infanterie belegt beim ersten Transporter einen Platz. Eine gleichnamige Definition ohne dieses Profil wird nicht aufgenommen. Ein Transporter darf nicht in einen anderen geladen werden. |
| TRANS-02 | P1 | Ein- und Ausladen kosten jeweils den Transporter 1 Bewegungspunkt aus seinem gemeinsamen Fahrbudget; Kapazität ist ein eigener Parameter. | 2 Punkte fahren, einladen, 2 Punkte fahren, ausladen verbrauchen 6 Punkte. Ein- und Ausladen erfolgen benachbart; Ausladeziel sichtbar, frei und für den Passagier passierbar. |
| TRANS-03 | P1 | Laden beendet eigene Bewegung des Passagiers, nicht weitere Beförderung oder Ausladung durch den Transporter. | Ein Verband kann sich auf eigene Kosten nähern, eingeladen, mitgenommen und im selben Turn ausgeladen werden. Danach führt er keinen eigenen Bewegungsbefehl mehr aus. |
| TRANS-04 | P1 | Insassen greifen nicht an, leisten keine Gegenwehr, erobern nicht und liefern keine eigene Sicht. | Ein noch aufgenommener Passagier erweitert bei der Neuberechnung keine Sicht; ein ausgeladener erst zum nächsten Turn. Die feste Sichtfläche wird durch Laden im laufenden Turn nicht verändert. |
| TRANS-05 | P1 | Zerstörung des Transporters zerstört dessen tatsächliche Insassen. | Transporter und Insassen werden vor ihren geplanten Bewegungen entfernt. Eine nur zur späteren Aufnahme vorgesehene benachbarte Einheit wird dadurch nicht zerstört. |

Kosten fehlgeschlagener Ladeaktionen, abhängige Folgebefehle, konkrete Kapazität und Gebäudeaufnahme bleiben O-16. Daraus wird keine zusätzliche Regel zur Anzahl gewöhnlicher Bewegungsbefehle abgeleitet.

## Eigenschaften und Plugins

| ID | Prio | Anforderung | Akzeptanzkriterium |
|---|---|---|---|
| MOD-01 | P1 | Spielobjekte werden aus Eigenschaften und Parametern definiert. | Ein neuer Einheitentyp kombiniert vorhandene Eigenschaften ohne Änderung der Kernlogik; Eroberung hängt nicht am Namen „Infanterie“. Das Modell ist auch auf Gebäude und Geländefelder anwendbar. |
| MOD-02 | P1 | Definition und Instanzzustand sind getrennt. | Zwei Instanzen derselben Definition können unterschiedliche Besitzer und Schäden besitzen; Änderung eines Instanzzustands verändert nicht die Definition oder die andere Instanz. |
| MOD-03 | P1 | Plugins ergänzen neue Eigenschaftstypen samt Verhalten und Editoranbindung. | Ein Beispielplugin ergänzt eine Eigenschaft, die im Editor parametrisiert und in einem Probespiel wirksam wird, ohne dass dafür typbezogene Kernlogik ergänzt werden muss. Vertrag gemäß O-08, O-09. |
| MOD-04 | P1 | Plugin-Abhängigkeiten und Eigenschaftskonfigurationen werden geprüft. | Fehlendes erforderliches Plugin und eine deklarierte unzulässige Kombination ergeben verständliche Diagnosen in Editor und beim Szenariostart; kein stillschweigendes Weglassen. Detailklärung O-08, O-09. |

Neue Verhaltensarten werden als Plugins programmiert. Eine Skriptsprache ist nicht Teil der Anforderungen. Noch offene Konfigurationsgrenzen werden nicht als bereits gelöste „Alles ist konfigurierbar“-Garantie behandelt.

## Integrierter Szenario-Editor

| ID | Prio | Anforderung | Akzeptanzkriterium |
|---|---|---|---|
| ED-01 | P1 | Der Desktop-Editor ist aus dem Hauptmenü der Anwendung erreichbar. | Öffnen des Editors und Rückkehr zum Hauptmenü erfolgen innerhalb der Anwendung. Eine separate Editoranwendung ist nicht erforderlich. |
| ED-02 | P1 | Karten, Definitionen, Platzierungen, Spieler und Ziele sind bearbeitbar. | Ein Autor erstellt Gelände, definiert eine Einheit aus Eigenschaften, platziert sie mit Besitzerzuordnung und wählt eine Siegbedingung. |
| ED-03 | P1 | Szenarien lassen sich prüfen, speichern, laden und probespielen. | Das mit ED-02 erstellte Szenario wird gespeichert, erneut geladen und mit denselben fachlichen Inhalten gestartet; aus dem Probespiel ist die Rückkehr zum Editor möglich. |
| ED-04 | P1 | Plugin-Eigenschaften sind im Editor bearbeitbar. | Die durch MOD-03 ergänzte Eigenschaft kann einer Definition hinzugefügt, parametrisiert, gespeichert und nach erneutem Laden unverändert bearbeitet werden. |

## Bedienung, Welt und Speicherung

| ID | Prio | Anforderung | Akzeptanzkriterium |
|---|---|---|---|
| UI-01 | P1 | Desktopbedienung bietet Maus, Tastatur, Auswahl, Zoom, Scrollen und zulässige Befehle. | Eine Partie ist mit Maus und Tastatur bedienbar; nach Auswahl sind zum Zugteil und zu den Fähigkeiten passende Befehle und Objektinformationen erkennbar. Konkrete Belegung vor M4 festlegen. |
| WORLD-01 | P1 | Die Welt verwendet Hexfelder; Bewegung und Aufnahme hängen von Eigenschaften ab. | Eigene Einheiten können gemäß Bewegungsregeln durchquert werden, reguläre Endpositionen werden nicht mehrfach belegt; definierte Gebäude- und Transportaufnahme ist möglich. Detailklärung O-07. |
| WORLD-02 | P1 | Ganze Karte und Strukturen bekannt; unsichtbare Felder ausgegraut und ohne Einheiten oder zuletzt bekannte Einheitenpositionen. Sichtfläche im Turn fest. | Ein Späher erzeugt während seiner Bewegung keine neuen sichtbaren Felder. Erst zur nächsten Planung wird Sicht aus den neuen Positionen berechnet; außerhalb davon werden keine Einheiten angezeigt. Sichtgeometrie bleibt O-07. |
| SAVE-01 | P1 | Nach jedem ausgewerteten Turn wird automatisch gesichert; letzter gültiger Spielstand bleibt bei Fehlern erhalten. | Nach erfolgreichem Speichern wird derselbe fachliche Zustand wieder geladen. Ein unterbrochener Folgespeichervorgang beschädigt den vorherigen gültigen Stand nicht. Format gemäß O-09. |
| SAVE-02 | P1 | Szenario und Spielstand sind getrennte fachliche Objekte. | Laden eines Szenarios beginnt mit dessen Startaufstellung; Laden eines Spielstands setzt den gesicherten Partiezustand fort. |
| DET-01 | P1 | Die Auswertung ist reproduzierbar. | Gleiche Ausgangslage, Regel- und Plugin-Versionen, Seeds und bestätigte Befehle führen bei wiederholter Auswertung zum gleichen fachlichen Ergebnis. Zufallsmodell gemäß O-05, O-09. |
| QUAL-01 | P1 | Hilfe, lesbare Darstellung und Internationalisierung werden durchgängig berücksichtigt. | Hilfe ist erreichbar und Spieltexte sind lokalisierbar. Konkrete Sprachabdeckung und Darstellungsprüfung werden vor M4 festgelegt. |
| SCALE-01 | P2 | Karten bis 100 × 100 Felder werden unterstützt. | Ein entsprechendes Szenario lässt sich laden, darstellen und bearbeiten; messbare Reaktionszeitgrenzen sind noch festzulegen. |

## Weiterer Ausbau

| ID | Prio | Anforderung / Ziel | Abnahme beziehungsweise notwendige Präzisierung |
|---|---|---|---|
| NET-01 | P2 | Netzwerkduell mit maßgeblicher Spielinstanz. | Zwei Rechner spielen eine vollständige Partie; O-13 für Verbindung, Validierung, Wiederverbindung und Zeitlimits klären. |
| AI-01 | P2 | Einzelspieler gegen eine einfache KI mit denselben Befehlsregeln. | Vollständige Partie; KI verfolgt gegnerische Basen als Ziele. Schwierigkeitsvarianten später über Plugins. |
| AI-02 | P2 | KI-Planung unter fünf Sekunden bei 100 Einheiten. | Referenzhardware, Kartengröße, Einheitenverteilung und Messverfahren gemäß O-12 festlegen; noch kein ausführbarer Benchmark. |
| HIST-01 | P2 | Einzelspielerhistorie und ältere Spielstände ladbar. | Früheren Partiezustand laden und fortsetzen; Granularität der vollständigen Historie gemäß O-12 klären. |
| AND-01 | P2 | Android spielt kompatible Szenarien mit Touchbedienung. | Auf Desktop erstelltes kompatibles Szenario lässt sich auf Android spielen; kein Android-Editor erforderlich. |
| GEN-01 | P2 | Zufallskarten aus Seeds. | Derselbe Seed und dieselben Generatorparameter erzeugen dieselbe Karte; Generatorregeln vor Umsetzung festlegen. |

Weitere Ideen zu Forschung, Unterhalt, Audio, Tutorial, Online-Wertung und Monetarisierung bleiben im [Konzept](Konzept.md) erhalten und werden erst nach Priorisierung zu detaillierten Anforderungen.
