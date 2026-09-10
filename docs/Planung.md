# Planung

Grundlagen: [Anforderungen](Anforderungen.md), [Entscheidungen](Entscheidungen.md), [Glossar](Glossar.md). Die folgenden Aufgaben sind geplant, sofern nicht ausdrücklich erledigt markiert. Vor jeder Iteration werden die betroffenen offenen Fragen entschieden und die Stories konkretisiert. P1-Anforderungen gehören zum ersten spielbaren Meilenstein.

## Vorhandene Grundlage

- [x] Gradle-Projekt aufsetzen (Status aus dem bisherigen Plan übernommen).
- [ ] Übernahme geeigneter Quellen aus EmpireX und ABattle prüfen; keine ungeprüfte Kopierpflicht.
- [ ] Architekturgrenzen und konkrete Plugin-Verträge aus dem Design ableiten.

## M1: Definitionen, Eigenschaften und Szenariogrundlage

- [ ] Definition, Instanz, Parameter, Regelsatz und Plugin abbilden (MOD-01 bis MOD-04).
- [ ] Bewegung, Angriff, Sicht, Aufnahme, Eroberung, Bau, Reparatur und Produktion als benötigte Fähigkeiten detaillieren.
- [ ] Plugin-Abhängigkeiten und Konfigurationsvalidierung festlegen (O-08, O-09).
- [ ] Hexkarte und Szenario-Speicherung bereitstellen; Format vorab entscheiden.

Abnahme: Eine zusätzliche Einheitendefinition kombiniert vorhandene Eigenschaften ohne neue Typabfragen im Regelcode. Eine Plugin-Eigenschaft lässt sich erkennen und validieren.

## M2: Karte und integrierter Editor

- [ ] Kartenanzeige, Zoom, Scrollen, Auswahl und Objektinformationen umsetzen.
- [ ] Desktop-Editor aus dem Hauptmenü öffnen; Technikentscheidung O-10 vorher treffen.
- [ ] Gelände und Definitionen bearbeiten, Objekte platzieren und Spielern zuordnen.
- [ ] Verfügbare Siegbedingungen konfigurieren, Szenarien prüfen, speichern und laden.
- [ ] Plugin-Eigenschaften im Editor bearbeiten (ED-01 bis ED-04).

Abnahme: Ein neu angelegtes Szenario einschließlich angepasster Einheitendefinition ist nach erneutem Laden fachlich gleichwertig. Probespielen wird in M4 vollständig abgenommen.

## M3: Vollständige Regeln und Turnauswertung

- [ ] Verdeckte Planung, Befehlsänderung, gemeinsamer Auswertungsbeginn und Rollenwechsel umsetzen (TURN-01 bis TURN-04).
- [ ] Angriffe samt sofortiger Gegenwehr, Verlusten und Entfernung in Eingabereihenfolge umsetzen, erst danach Bewegungen in Eingabereihenfolge (TURN-05, COMBAT-01 bis COMBAT-03); verbleibende Details O-05 zuvor klären.
- [ ] Eroberung samt eingelagerten Einheiten und Stützpunktbau umsetzen (CAP-01, BUILD-01).
- [ ] Produktionspunkte, Warteschlangen und verzögertes Ausrücken umsetzen (ECO-01 bis ECO-03).
- [ ] Standardsiege und konfigurierbare Ziele umsetzen (WIN-01, WIN-02).
- [ ] Bewegungs-, Aufnahme-, Sicht- und Deckungsregeln umsetzen (WORLD-01, WORLD-02, MOVE-01, MOVE-02, TRANS-01 bis TRANS-05, TERRAIN-01, TERRAIN-02); feste Sichtfläche, Fahr-/Ladebudget und Passagierzustand prüfen, verbleibende Details O-07, O-15 und O-16 klären.
- [ ] O-01 bis O-07 für diesen Umfang entscheiden und reproduzierbare Auswertung prüfen (DET-01).

Abnahme: Die Beispiele in [Spielregeln](Spielregeln.md) und zugehörigen Akzeptanzkriterien funktionieren. Vereinfachte Entwicklungsabläufe mit nur Bewegung gelten nicht als fertige Spielregeln.

## M4: Erster spielbarer Meilenstein – lokales Duell und Editor

- [ ] Zwei Desktopfenster für dieselbe Partie bereitstellen (PLAY-01).
- [ ] Spielstart, Befehlsanzeige, Ergebnisdarstellung, Hilfe und Hauptmenü integrieren; Bedienung und Lokalisierbarkeit prüfen (UI-01, QUAL-01).
- [ ] Editor-Probespiel und Rückkehr in den Editor vervollständigen.
- [ ] Kleines Szenario mit wenigen Landeinheiten, Hauptquartieren, Fabriken und Baueinheiten für die Abnahme erstellen; Werte und Startrollen gemäß O-11 festlegen.
- [ ] Automatisches Speichern, Fehlerfall und Laden von Szenario beziehungsweise Spielstand absichern (SAVE-01, SAVE-02).

Abnahme: Zwei Menschen können ein im Editor erstelltes Szenario laden und bis zu einem regelgerechten Sieg spielen. Angepasste Eroberungsfähigkeit, Gebäudebau, Produktion und Übernahme eingelagerter Einheiten sind vorführbar. Alle P1-Kriterien sind geprüft. Zwei Fenster bieten keine physische Geheimhaltung am gemeinsamen Bildschirm.

## Weitere Meilensteine

| Stufe | Inhalt und Abnahmeziel |
|---|---|
| M5 Netzwerk | Zwei Rechner spielen über einen Host; Server validiert über Shared. Verbindung, Wiederverbindung und Zeitlimits vorher spezifizieren (NET-01, O-13). |
| M6 Einzelspieler | Einfache KI mit denselben Befehlsregeln; vollständige Partie und Historie. Messverfahren für das Leistungsziel festlegen (AI-01, AI-02, HIST-01, O-12). |
| M7 Android | Kompatible Szenarien mit Touchbedienung spielen; kein Editor erforderlich (AND-01). |
| M8 Inhalte und Komfort | Zufallskarten, Karten bis 100 × 100 Felder, weitere Gelände- und Einheitentypen, Audio, Tutorial, UI-Verbesserungen und Balancing priorisieren (GEN-01, SCALE-01). |
| Späterer Produktbetrieb | Online-Hosting, Elo, mögliche Nakama-Integration und Monetarisierung separat entscheiden. |

Forschung und Unterhalt bleiben unpriorisierte Ideen. Erweiterbarkeit wird bereits in M1 angelegt und nicht erst nach dem ersten spielbaren Meilenstein ergänzt.
