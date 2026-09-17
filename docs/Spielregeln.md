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
7. Fällige Eroberungen schließen nach den Bewegungen ab; danach werden die Siegbedingungen geprüft.
8. Bei fortgesetzter Partie folgen Produktionsfortschritt, Bauabschlüsse und Stützpunktaufträge. Anschließend wechseln die Rollen. Zwei Turns bilden eine Runde, in der jeder Spieler einmal Bewegung und einmal Aktion erhält.

„Aktionsphase“ umfasst Angriffe und weitere nach dem Regelsatz zulässige Aktionen. Bauaufträge werden in der Bewegungsphase erteilt. Produktionsfortschritt sowie Stützpunktaufträge folgen nach der erfolglosen Siegprüfung im Turn der Bewegungsphase ihres Besitzers.

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

## Bewegung, Sicht und Transport

Maßgeblich ist [Bewegung und Transport](Spielregeln/Bewegung_und_Transport.md). Die gesamte Karte mit Gelände und Strukturen ist bekannt; außerhalb der aktuellen Sicht ist sie ausgegraut und zeigt keine Einheiten, auch keine zuletzt bekannten Positionen. Jeder Bewegungsweg bleibt innerhalb der Sichtfläche dieses Turns. Neue Positionen erzeugen erst zum nächsten Turn neue Sicht.

Eigene Einheiten sind durchquerbar, normale Haltefelder müssen frei und passierbar sein. Bei einer Blockade hält die Einheit am letzten zulässigen freien Feld vor dem Hindernis, ohne automatische Umgehung.

Transporter können Fahrten und Ladeaktionen in Eingabereihenfolge verketten. Ein- und Ausladen auf benachbarten Feldern kostet jeweils den Transporter 1 Bewegungspunkt. Ein- oder Ausladen beendet die eigene Bewegung des Passagiers, verhindert aber nicht dessen anschließende Beförderung und Ausladung im selben Turn. Nach dem Ausladen bleibt er stehen. Transportpassagiere sind nach außen inaktiv; bei Zerstörung ihres Transporters werden sie ebenfalls zerstört.

## Eigenschaften statt Typabfragen

Objektdefinitionen kombinieren Eigenschaften und Parameter. Die Laufzeit prüft die daraus entstehenden Fähigkeiten. Im Standard besitzt Infanterie die Eroberungsfähigkeit. Der Name oder die Darstellung der Einheit entscheidet nicht darüber.

Beispiel: Eine benutzerdefinierte Panzereinheit mit Eroberungsfähigkeit kann ein für diese Fähigkeit zulässiges Gebäude erobern. Eine Infanteriedefinition ohne diese Fähigkeit kann es nicht. Das gilt unabhängig vom Namen oder verwendeten Bild.

Plugins können neue Eigenschaftstypen und ihr Verhalten bereitstellen. Welche Kombinationen zulässig sind, wird anhand ihrer deklarierten Voraussetzungen geprüft; Konfliktregeln werden noch präzisiert (O-08).

## Gebäude, Bau und Eroberung

Die [Gebäuderegeln](Spielregeln/Gebaeude.md) definieren unbegrenzte Aufnahme im Standard, Bewegungskosten wie Straßen und Angriffe aus dem Inventar ohne gezielte Angreifbarkeit oder Gegenwehr der Insassen. Dies unterscheidet sich von Transportpassagieren.

Eine eroberungsfähige Einheit beendet ihre Bewegung auf dem Gebäude und bleibt außerhalb des Inventars angreifbar. Vor Übernahme muss der Gegner eine vollständige Angriffsgelegenheit erhalten. Bei erfolgreicher Übernahme wechseln Gebäude und sämtliche eingelagerten Einheiten den Besitzer; der Eroberer wird aufgenommen. Produktionsfortschritt und vorhandene Vorräte gehen verloren. Die Warteschlangenbehandlung bleibt offen.

Bauaufträge werden in der Bewegungsphase erteilt und ziehen ihre Baupunkte sofort ab. Sie schließen nach überlebter gegnerischer Angriffsgelegenheit, Bewegungen und einer erfolglosen Siegprüfung ab; Abbruch, Bewegung oder Zerstörung des Pioniers lässt die Investition verfallen. Pioniere besitzen auffüllbare Baupunkte und bleiben bei null Punkten erhalten. Jeder Stützpunkt führt nach den Bewegungen seines Besitzers pro Runde höchstens einen Auftrag aus seiner gemeinsamen Reparatur- und Baupunkteauffüll-Warteschlange aus. Kosten, Umfang und Zielprofile bleiben offen.

## Produktionspunkte und Warteschlangen

[Bau und Produktion](Spielregeln/Bau_und_Produktion.md) präzisiert: Produktionspunkte sind Fortschritt am aktiven Auftrag, kein separater Ressourcenvorrat. Eine Fabrik bearbeitet jeweils einen Auftrag; weitere warten. Nach einer erfolglosen Siegprüfung im Turn der eigenen Bewegungsphase schreibt sie einmal je Runde Fortschritt gut. Produktionskosten geteilt durch Baugeschwindigkeit ergeben die rechnerische Dauer in Runden; nur die Rundung bleibt offen. Abbruch vernichtet Fortschritt, Restleistung wird nicht übertragen und der Folgeauftrag beginnt erst im nächsten Fortschrittsschritt.

Einheiten, deren Auftrag im vorherigen Fortschrittsschritt die Kosten erreicht hat, werden zu Beginn einer eigenen Bewegungsphase fertig und können erst in der darauffolgenden eigenen Bewegungsphase ausrücken. Die Siegprüfung zwischen den Turns erfolgt nach fälligen Eroberungen und vor weiteren Turngrenzschritten.

## Siegbedingungen

Im Standard führt die Eroberung des gegnerischen Hauptquartiers oder die Vernichtung aller gegnerischen Einheiten zum Sieg. Zusätzliche Gebietsziele, etwa Kontrolle eines konfigurierten Anteils, und Missionsziele sind konfigurierbar.

Der Verlust aller gewöhnlichen Städte oder Fabriken ist keine zusätzliche automatische Niederlageregel. Die Prüfung erfolgt zwischen den Turns nach fälligen Eroberungen und vor weiteren Turngrenzschritten. Die Verknüpfung optionaler Ziele, Gleichstände, Prüfung für beide oder nur einen Spieler sowie Sonderfälle ohne Hauptquartier oder Einheiten bleiben offen (O-06).

## Weitere Regeln aus dem Ausgangsentwurf

- Regulär eine Einheit pro Hexfeld; Aufnahme in Gebäude und Transporter über deren Eigenschaften.
- Bewegung durch eigene Einheiten erlaubt; Kosten und Erreichbarkeit hängen von Einheit und Gelände ab.
- Die Sichtfläche wird für jeden Turn neu berechnet und bleibt während seiner Ausführung fest. Die gesamte Karte ist bekannt; unsichtbare Einheiten werden ohne Positionshistorie ausgeblendet.
- Kampf nutzt Zufall, soll aber bei gleicher Ausgangslage, gleichen Regeln, Seeds und Befehlen reproduzierbar sein.

Gegenwehr ist eine ausdrückliche Fähigkeit, standardmäßig deaktiviert und höchstens einmal pro Turn beim ersten Angriff möglich. Nur ein überlebender Verteidiger antwortet sofort mit seiner verbleibenden Stärke und geringerem Schaden. Die Reihenfolge mehrerer Angriffe ist die Eingabereihenfolge. Gegenwehr-Zielprüfung, endgültige Schadensformel, Sichtgeometrie und Details fehlgeschlagener Transportbefehle bleiben offen (O-05, O-07, O-16). Bewegung und Transport sowie die Sichtaktualisierung sind im verlinkten Regelkapitel konkretisiert. Diese Themen sind nicht allein durch den Verweis auf Battle Isle spezifiziert.
