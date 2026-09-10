# Spielregeln

Begriffe: [Glossar](Glossar.md). Verbindliche Entscheidungen: [Entscheidungen](Entscheidungen.md). Prüfbare Anforderungen: [Anforderungen](Anforderungen.md).

Der [Katalog der Spielobjekte und Eigenschaften](Spielregeln/README.md) enthält Einheiten, Gelände und Gebäude. [Wechselwirkungen](Spielregeln/Wechselwirkungen.md) konkretisiert den verbindlichen Ablauf sowie Sicht, Deckung und Gegenwehr; ungetestete Zahlen sind dort gekennzeichnet.

## Geltung

Dieses Dokument beschreibt den bestätigten Spielkern und den Standardregelsatz. Objektfähigkeiten und Parameter sind konfigurierbar. Noch offene Detailregeln werden ausdrücklich benannt; Beispiele setzen keine nicht entschiedenen Regeln voraus.

## Planung, Turn und Runde

1. Zu Beginn eines Turns erhält ein Spieler die Bewegungsphase und der andere die Aktionsphase.
2. Beide planen gleichzeitig. Gegenseitige Befehle bleiben verdeckt. Jeder sieht den für ihn sichtbaren Zustand zum Turnbeginn sowie seine eigene Planung.
3. Alle eigenen Befehle können bis zum eigenen Turnabschluss geändert oder entfernt werden. Der Abschluss macht sie verbindlich; während des Wartens auf den Gegner werden sie nicht mehr bearbeitet.
4. Erst wenn beide abgeschlossen haben, beginnt die Auswertung. Nur die Planung erfolgt parallel; währenddessen wird kein Befehl ausgeführt.
5. Alle Angriffe werden in Eingabereihenfolge ausgeführt. Nach jedem Angriff wirkt Schaden sofort; zerstörte Einheiten werden unmittelbar entfernt. Gegebenenfalls folgt sofort Gegenwehr, bevor der nächste Angriff beginnt.
6. Erst nach sämtlichen Angriffen werden die Bewegungen in ihrer Eingabereihenfolge ausgeführt. Während der Gefechte bleiben alle Positionen unverändert; zerstörte Einheiten bewegen sich nicht mehr.
7. Nach der Auswertung wechseln die Rollen. Zwei Turns bilden eine Runde, in der jeder Spieler einmal Bewegung und einmal Aktion erhält.

„Aktionsphase“ umfasst Angriffe und weitere nach dem Regelsatz zulässige Aktionen. Welche Phasen Bau-, Reparatur- und Produktionsbefehle erlauben, ist noch offen (O-01). Auch die exakte Einordnung dieser Vorgänge und der Siegprüfung ist noch nicht festgelegt.

### Beispiel: Zwei Turns

| Abschnitt | Spieler A | Spieler B |
|---|---|---|
| Turn 1, Planung | Bewegungen planen | Angriffe planen |
| Turn 1, Auswertung | Gemeinsame Auswertung: Kampf vor Bewegung | Gemeinsame Auswertung |
| Turn 2, Planung | Angriffe planen | Bewegungen planen |
| Turn 2, Auswertung | Gemeinsame Auswertung: Kampf vor Bewegung | Gemeinsame Auswertung |

Nach Turn 2 ist eine Runde abgeschlossen. Die Wahl des Spielers mit der ersten Bewegungsphase ist noch offen (O-11).

### Beispiel: Angegriffener Rückzug

A plant, Panzer P von Feld X nach Y zu bewegen. B plant einen zulässigen Angriff auf P. Beide bestätigen ihre Planung. Wird P bei der Kampfauswertung zerstört, bleibt sein Bewegungsbefehl unausgeführt. Überlebt P, wird seine geplante Bewegung anschließend nach den Bewegungsregeln geprüft und ausgeführt, sofern sie weiterhin zulässig ist. Kampfformel und Behandlung sonstiger ungültig gewordener Befehle sind offen (O-05, O-07).

## Eigenschaften statt Typabfragen

Objektdefinitionen kombinieren Eigenschaften und Parameter. Die Laufzeit prüft die daraus entstehenden Fähigkeiten. Im Standard besitzt Infanterie die Eroberungsfähigkeit. Der Name oder die Darstellung der Einheit entscheidet nicht darüber.

Beispiel: Eine benutzerdefinierte Panzereinheit mit Eroberungsfähigkeit kann ein für diese Fähigkeit zulässiges Gebäude erobern. Eine Infanteriedefinition ohne diese Fähigkeit kann es nicht. Das gilt unabhängig vom Namen oder verwendeten Bild.

Plugins können neue Eigenschaftstypen und ihr Verhalten bereitstellen. Welche Kombinationen zulässig sind, wird anhand ihrer deklarierten Voraussetzungen geprüft; Konfliktregeln werden noch präzisiert (O-08).

## Gebäude, Bau und Eroberung

- Fabriken verfügen im Standard über die Erzeugung von Produktionspunkten und die Herstellung von Einheiten.
- Stützpunkte können im Standard Einheiten reparieren, Einheiten aufnehmen und erobert werden.
- Baueinheiten erhalten die Fähigkeit, Stützpunkte zu errichten. Erlaubte Bauwerke werden durch ihre Definition bestimmt.
- Bei erfolgreicher Eroberung wechseln das Gebäude und die darin eingelagerten Einheiten zum erobernden Spieler.
- Kosten, Bauzeit, Bauplatzregeln, Kapazitäten und genauer Auslösezeitpunkt einer Eroberung sind noch offen (O-03, O-04).

Beispiel: In einer gegnerischen Fabrik befinden sich zwei Einheiten. Eine Einheit mit passender Eroberungsfähigkeit erobert die Fabrik erfolgreich. Danach gehören Fabrik und beide eingelagerten Einheiten dem Eroberer. Die Behandlung laufender Produktionsaufträge ist damit noch nicht entschieden (O-04).

## Produktionspunkte und Warteschlangen

Fabriken erzeugen einen konfigurierten Betrag an Produktionspunkten pro Runde. Produktionsaufträge stehen in einer geordneten Warteschlange und haben konfigurierbare Bauzeiten, die mehrere Runden umfassen können.

Eine fertiggestellte Einheit befindet sich im produzierenden Gebäude und kann in der nächsten eigenen Bewegungsphase nach Fertigstellung ausrücken. Sie erhält keine Bewegung rückwirkend für einen bereits geplanten Turn.

Beispiel: Wird eine Einheit nach einer bereits abgeschlossenen Bewegungsplanung fertiggestellt, kann sie für diese Planung keinen nachträglichen Bewegungsbefehl erhalten. Erst die folgende eigene Bewegungsphase erlaubt das Ausrücken.

Noch offen sind der genaue Fortschrittszeitpunkt, das Zusammenspiel von Kosten und Bauzeit, Ressourcenpools, Warteschlangenparallelität sowie Abbruch und Kapazitätsengpässe (O-02). Aus „pro Runde“ darf nicht versehentlich „pro Turn“ werden.

## Siegbedingungen

Im Standard führt die Eroberung des gegnerischen Hauptquartiers oder die Vernichtung aller gegnerischen Einheiten zum Sieg. Zusätzliche Gebietsziele, etwa Kontrolle eines konfigurierten Anteils, und Missionsziele sind konfigurierbar.

Der Verlust aller gewöhnlichen Städte oder Fabriken ist keine zusätzliche automatische Niederlageregel. Die genaue Verknüpfung optionaler Ziele, Gleichstände, der Prüfzeitpunkt sowie Sonderfälle ohne Hauptquartier oder Einheiten sind offen (O-06).

## Weitere Regeln aus dem Ausgangsentwurf

- Regulär eine Einheit pro Hexfeld; Aufnahme in Gebäude und Transporter über deren Eigenschaften.
- Bewegung durch eigene Einheiten erlaubt; Kosten und Erreichbarkeit hängen von Einheit und Gelände ab.
- Sichtweiten bestimmen die aktuelle Sicht. Bereits beobachtete Informationen können als zuletzt bekannt dargestellt werden.
- Kampf nutzt Zufall, soll aber bei gleicher Ausgangslage, gleichen Regeln, Seeds und Befehlen reproduzierbar sein.

Gegenwehr ist eine ausdrückliche Fähigkeit, standardmäßig deaktiviert und höchstens einmal pro Turn beim ersten Angriff möglich. Nur ein überlebender Verteidiger antwortet sofort mit seiner verbleibenden Stärke und geringerem Schaden. Die Reihenfolge mehrerer Angriffe ist die Eingabereihenfolge. Gegenwehr-Zielprüfung, endgültige Schadensformel, blockierte Wege, Transportabläufe und Aktualisierung zuletzt bekannter Positionen bleiben offen (O-05, O-07). Diese Themen sind nicht allein durch den Verweis auf Battle Isle spezifiziert.
