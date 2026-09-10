# Entscheidungen

Begriffe: [Glossar](Glossar.md). Grundlage sind der ursprüngliche Entwurf und die im Konzeptgespräch bestätigten Festlegungen. Stand: 2026-09-10. IDs bleiben bei späteren Änderungen stabil.

## Bestätigte Entscheidungen

| ID | Entscheidung | Begründung und Auswirkung |
|---|---|---|
| E-01 | Taktisches Vorausdenken ist der Spielkern. | Positionierung und Zusammenspiel der Einheiten bestimmen die Priorisierung. |
| E-02 | Gleichzeitige Planung unterschiedlicher Zugteile; Kampf vor Bewegung; Rollenwechsel nach jedem Turn. | Übernimmt den gewünschten Battle-Isle-artigen Ablauf. Zwei Turns bilden eine Runde. |
| E-03 | Befehle verdeckt; alle eigenen Befehle bis zum eigenen Abschluss änderbar. | Erlaubt Planungskorrekturen ohne Offenlegung gegenüber dem Gegner. |
| E-04 | Fabriken erzeugen Produktionspunkte pro Runde. | Gewünschte regelmäßige Wirtschaft; Kristalltransport ist nicht Teil des bestätigten Standardmodells. |
| E-05 | Baueinheiten errichten Stützpunkte. | Baubarkeit ist eine konfigurierbare Fähigkeit. |
| E-06 | Standardinfanterie erobert Gebäude samt eingelagerten Einheiten. | Fähigkeiten stammen aus Definitionen; kein exklusiver Typcheck auf Infanterie. |
| E-07 | Produktionswarteschlangen mit mehrründiger Bauzeit; Ausrücken in der nächsten eigenen Bewegungsphase. | Herstellung und Einsatzzeitpunkt sind getrennt. |
| E-08 | Standardsiege: gegnerisches Hauptquartier erobern oder alle gegnerischen Einheiten vernichten; zusätzliche Ziele konfigurierbar. | Unterstützt Standardduell und unterschiedliche Szenarien. |
| E-09 | Erstes spielbares Ziel: lokales Duell mit zwei Desktopfenstern. | Vollständige Partie vor Netzwerk- und KI-Ausbau prüfen. |
| E-10 | Spielobjekte aus Eigenschaften zusammensetzen. | Möglichst breite Konfiguration ohne fest codierte Einheitenrollen. |
| E-11 | Plugins liefern neue Eigenschaften und deren Verhalten; keine Skriptsprache. | Neue Mechaniken werden programmiert, vorhandene im Editor kombiniert. |
| E-12 | Integrierter Editor auf Desktop, bereits beim ersten spielbaren Meilenstein. | Karte und Definitionen bearbeiten, Spieler und Ziele festlegen, speichern, laden und probespielen. Android benötigt keinen Editor. |
| E-13 | Szenario und Spielstand fachlich unterscheiden. | Eine Startvorlage ist nicht derselbe Zustand wie eine laufende Partie. |
| E-14 | Nur Planung parallel; alle Angriffe, dann alle Bewegungen jeweils in Eingabereihenfolge. | Statische Positionen während der Gefechte; keine verzahnte Bewegung. |
| E-15 | Schaden sofort; zerstörte Einheiten werden entfernt. Optionale Gegenwehr sofort nach dem ersten Angriff, höchstens einmal pro Turn, nur bei Überleben mit verbleibender Stärke und geringerem Schaden. | Spätere Angriffe berücksichtigen die vorherigen Verluste; ohne ausdrückliche Fähigkeit keine Gegenwehr. |
| E-16 | Waldrand samt Einheit sichtbar, dahinter Sichtblockade; Straße erhält Walddeckung. | Sichtbarkeit, Deckung und Bewegung bleiben getrennte Eigenschaften. |
| E-17 | Indirektes Feuer verwendet gemeinsame aktuelle Aufklärung und halbiert die Deckungswirkung. | 40 % Schutz werden 20 %; nicht Halbierung des gesamten Schadens. |
| E-18 | Abstrakte Höhenstufen und Zufall bis ±10 %. | Konkrete Höhenstufen und Zufallsverfahren noch offen. |
| E-19 | Einheiten repräsentieren Verbände; Verluste senken Angriffskraft. | Proportionale Formel, Deckungszahlen und Gegenwehrfaktor 0,5 bleiben ungetestete Vorschläge. |

## Ersetzte oder eingeordnete Aussagen

| Frühere Aussage | Aktuelle Behandlung |
|---|---|
| Auswertung am Ende der Runde | Auswertung nach jedem Turn; eine Runde enthält zwei Turns (E-02). |
| Nur letzte Aktion rücknehmbar | Alle eigenen Befehle bis zum eigenen Abschluss änderbar (E-03). |
| Jede Stadt erzeugt Produktion | Fabriken erzeugen Produktionspunkte; weitere Produzenten benötigen passende Eigenschaften (E-04, E-10). |
| Jede Einheit kann durch Betreten erobern | Eroberungsfähigkeit erforderlich; Auslösezeitpunkt bleibt offen (E-06, O-04). |
| Keine Städte mehr bedeutet Game Over | Keine pauschale Regel; bestätigte Standardsiege und konfigurierbare Ziele gelten (E-08). |
| Plugins erst nach dem MVP | Eigenschaftsmodell und grundlegende Plugin-Erweiterung früh entwickeln (E-10, E-11). |
| Editor nur Desktop, JavaFX | Desktop bestätigt, Integration erforderlich; UI-Technik noch prüfen (E-12, O-10). |
| Spielstand ist Szenario | Verwandte, aber getrennte fachliche Begriffe (E-13). |
| Ausschließlich Movement als minimale Gameloop | Nur möglicher Entwicklungsschritt, keine endgültige Spielregel. |

## Offene Fragen

Offen bedeutet nicht verworfen. Antworten werden vor Umsetzung des betreffenden Verhaltens als neue oder ergänzte Entscheidungen dokumentiert.

| ID | Frage / Entscheidungsbedarf | Vor welcher Umsetzung? |
|---|---|---|
| O-01 | Welche Phasen erlauben Bau, Reparatur und Produktionsaufträge? In welcher Reihenfolge erfolgen diese, Eroberung und Siegprüfung relativ zu Kampf und Bewegung? | Vollständige Turnauswertung |
| O-02 | Produktionspunkte lokal je Gebäude oder gemeinsamer Pool? Wann entstehen Punkte und Baufortschritt? Wie wirken Kosten, Bauzeit, parallele Aufträge, Abbruch, Engpässe und fehlende Ressourcen? | Wirtschaft und Produktion |
| O-03 | Baukosten, Bauzeit, zulässige Bauplätze, Gebäudegröße, Kapazität und Verbrauch beziehungsweise Wiederverwendung der Baueinheit? | Stützpunktbau |
| O-04 | Wann wird erobert, welche Zielbedingungen gelten und was geschieht mit Warteschlangen, Ressourcen, laufenden Reparaturen und verschachtelten Transportinhalten? | Eroberung |
| O-05 | Teilweise geklärt durch E-14, E-15, E-17 bis E-19: Reihenfolge, unmittelbare Verluste, Gegenwehrzeitpunkt und Zufallsbandbreite stehen fest. Offen: endgültige Formel, Rundung, Grundwerte, Zielbindung, Gegenwehr-Zielprüfung und Zuweisung, Zufallsverfahren. | Kampf |
| O-06 | Wie werden optionale Siegziele verknüpft und geprüft? Umgang mit Gleichstand, gleichzeitig erfüllten Zielen, fehlenden Hauptquartieren und eingelagerten Einheiten bei Vernichtung? | Siegbedingungen |
| O-07 | Bewegungsreihenfolge und Waldrandsicht sind geklärt (E-14, E-16). Offen: Blockaden, sonstige ungültig gewordene Befehle, Transport, Sichtgeometrie, Aktualisierung und Veraltung bekannter Positionen; Listenposition nach Befehlsänderung nicht entschieden. | Bewegung und Fog of War |
| O-08 | Eigenschaftsabhängigkeiten, Konflikte, Mehrfachvorkommen, gemeinsame Parameter und Konfigurationsgrenzen? Welche Regeln sind Kerninvarianten? | Eigenschaftsmodell |
| O-09 | Plugin-Vertrag, Editoranbindung, Versionen, Szenarioformat, Spielstandformat, Migrationen und Plattformkompatibilität? | Plugins und Speichern/Laden |
| O-10 | Wie wird der Desktop-Editor technisch integriert? JavaFX bleibt ein Kandidat, keine bestätigte Vorgabe. | Editoroberfläche |
| O-11 | Startrollen, kleine Abnahmekarte, Einheitenwerte und gewünschte Partiedauer? | Erstes spielbares Duell |
| O-12 | Referenzhardware und Messverfahren für KI unter fünf Sekunden bei 100 Einheiten? Umfang der vollständigen Historie? | KI und Einzelspieler |
| O-13 | Netzwerkprotokoll, Wiederverbindung, Zeitlimits, Hosting-Stufen, Nakama-Ziel und Elo? | Netzwerkspiel |
| O-14 | Priorität und Umfang von Forschung, Unterhalt, Tutorial, Audio und Monetarisierung? | Jeweilige Erweiterung |
| O-15 | Konkrete Höhenstufen und Zuordnung zum bisherigen Wertebereich, Höhenwirkung, Straßen- und Brückenkosten, Deckungskombinationen und endgültige Deckungswerte? | Geländewechselwirkungen |

## Einordnung gegenüber Battle Isle 1

Der gemeinsame Planungsablauf unterschiedlicher Zugteile und der mögliche Verlust einer Einheit vor ihrer Bewegung entsprechen bereits dem Vorbild. Bewusste Festlegungen sind insbesondere regelmäßige Produktionspunkte, frei änderbare eigene Planung und die breite Zusammensetzung von Spielobjekten. Der historische Vergleich ersetzt keine eigenen Regeln.

Referenz aus dem Konzeptgespräch: [Battle-Isle-Handbuch, Transkription bei Lemon Amiga](https://www.lemonamiga.com/doc/battle-isle/163). Vergleich bezieht sich auf das erste Battle Isle von 1991.
