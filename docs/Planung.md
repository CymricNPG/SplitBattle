
# Planung

- Vor der Umsetzung eines Plugins wird dieses entsprechend detailliert.
- Vor dem Start der Iteration werden alle Stories genau definiert.

## Iteration: Projektstruktur anlegen
- [x] Gradle Projekt aufsetzen
- [ ] Sourcefiles aus EmpireX kopieren
- [ ] Sourcefiles aus ABattle kopieren
- [ ] Architektur: Komponenten festlegen

## Iteration: Karten- und Datenbasis

Ziel: Eine Karte anzeigen, Tiles intern repräsentieren.

Stories:

- [ ] Datenstrukturen für Karte erzeugen (Grid + Geländearten). Schnittstellen anlegen
- [ ] Zufallsgenerator für einfache Karten.
- [ ] Kartenanzeige (2D, einfache Tiles).
- [ ] Auswahl von Tiles mit Maus.
- [ ] Darstellung eines Infobereichs für das ausgewählte Tile

# Iteration: Minimale Gameloop

Das Spiel startet im Movement-Turn, wenn der Spieler einen Turn beendet, kommt sofort der nächste Movement-Turn.

# Iteration: Einheiten & Bewegung

Ziel: Einheiten platzieren und bewegen.

Stories:

- [ ] Datenmodell für Einheiten (Typ, Position, Bewegungspunkte).
- [ ] Einheiten auf Karte anzeigen.
- [ ] Einheit auswählen
- [ ] Zielkachel anklicken
- [ ] Bewegung ausführen (ohne Kampf)

# Iteration: Städte & Produktion

Ziel: Städte, Produktion, einfache Ressourcen.

Stories:

- Städte im Modell + Anzeige.
- Jede Stadt erzeugt X Produktion pro Runde.
- Produktionswarteschlange: Einheit auswählen, nach N Runden fertig.
- Einheiten erscheinen in der Stadt bei Fertigstellung (Movement-Turn).

# Iteration: Spielelogik
- Umsetzung der kompletten Game-Loop, aber kein Wechsel der Spieler

# Iteration: Kampf & Siegbedingungen

Ziel: Basis-Kampfsystem und Spielende, Zustand: ResolveConflicts

Stories:

- Kampfregeln: Wenn Einheit eine gegnerische Einheit angreift, wende Kampfalgorithmus an.
- Eroberung von Städten: Einheit betritt gegnerische Stadt → Besitzerwechsel.
- Siegbedingung: Wenn ein Spieler keine Städte mehr hat → Game Over.
- Bewegung/Aktion wird nicht ausgeführt wenn Einheit zerstört wurde

# Iteration: Zwei-Spieler

Ziel: Es können zwei Spieler teilnehmen und die Gameloop ist komplett implementiert.

# MVP
Es existiert eine erste spielbare Version. Es werden für beide Spieler zwei Fenster geöffnet und man kann an einem Computer/Desktop
eine komplettes Spiel durchspielen.

# Iteration: UI (Spielstart etc)
- siehe UI Ablauf

# Save/Load

# Iteration: Plugins umsetzen

# Iteration: Server/Client

# MVP
Es ist möglich ein Multi-Player spiel zu starten und zu spielen. Dazu werden zwei Instanzen gestartet und über eine einfache Netzwerkkommunikation
werden die Spieldaten ausgetauscht.

# Audio

# Iteration: KI (einfach)

# Iteration: Android-Version UI verbessern

# Iteration: UI-Verbesserungen, Optimierungen

# Iteration: Mehr Einheitentypen, mehr Gelände, Balancing
