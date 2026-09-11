# Wechselwirkungen

[Katalogübersicht](README.md) · [Eigenschaften](Eigenschaften.md) · [Allgemeine Spielregeln](../Spielregeln.md)

## Geltung und Zusammensetzung

**Bestätigte Regeln** beschreiben den vereinbarten Ablauf. **Vorschläge – ungetestet** sind Ausgangswerte für Spieltests, keine freigegebenen Balancewerte. **Offene Details** werden nicht durch stillschweigende Standardwerte ersetzt.

| Wechselwirkung | Beteiligte Eigenschaften | Ergebnis |
|---|---|---|
| Bewegung | Bewegungsprofil × Passierbarkeit und Bewegungskosten | Zulässiger Weg und Punktebedarf |
| Aufklärung | Sichtweite × Gelände, Hindernisse und Höhe | Sichtfläche für den nächsten Turn; während des Turns fest |
| Angriff | Waffenprofil × Zielprofil | Grundwirkung gegen das Ziel |
| Schutz | Deckung × Zielprofil | Verminderung des Schadens |
| Verluste | Aktuelle Verbandsstärke × Angriffswirkung | Verringerte Kampfkraft |
| Gegenwehr | Ausdrückliche Gegenwehrfähigkeit × Angriffssituation | Sofortige begrenzte Reaktion |

Die Verknüpfung erfolgt über Eigenschaften und Profile, nicht über Einheitennamen. Ein weiteres Radfahrzeug verwendet die bestehenden Bewegungsregeln für Rad; ein weiteres ungeschütztes Ziel verwendet die entsprechenden Deckungswerte.

## Verbindlicher Turnablauf

`(Spieler 1: Bewegungen planen || Spieler 2: Angriffe planen) → Spieler 2: alle Angriffe ausführen → Spieler 1: alle Bewegungen ausführen → Rollen wechseln`

Dabei bezeichnet `||` ausschließlich die parallele Planung. Kein eingegebener Befehl wird bereits während der Planung ausgeführt.

1. Beide Spieler legen ihre Befehle verdeckt fest. Eigene Befehle bleiben bis zum eigenen Abschluss änderbar.
2. Nach Abschluss beider Spieler wird die Angriffsliste in Eingabereihenfolge abgearbeitet.
3. Nach jedem Angriff wird Schaden sofort angewendet. Eine zerstörte Einheit wird unmittelbar entfernt.
4. Beim ersten Angriff auf eine entsprechend befähigte, überlebende Einheit folgt gegebenenfalls sofort deren Gegenwehr. Ihr Schaden und mögliche Zerstörungen werden ebenfalls sofort angewendet, bevor der nächste Angriff beginnt.
5. Während sämtlicher Gefechte stehen die Einheiten an ihren bisherigen Positionen. Es gibt keine Bewegung zwischen zwei Angriffen.
6. Erst nach der vollständigen Angriffsliste wird die Bewegungsliste in Eingabereihenfolge ausgeführt. Zerstörte Einheiten führen keinen Bewegungsbefehl mehr aus.
7. Danach wechseln die Rollen. Zwei Turns bilden eine Runde.

Bereits zerstörte Ziele können nicht erneut beschädigt werden; zerstörte Angreifer können keine späteren Befehle mehr ausführen. Automatische Ersatzzielwahl ist damit nicht beschlossen. Die Behandlung sonstiger ungültig gewordener Befehle bleibt offen.

Die Regel zur Änderung eigener Befehle bleibt bestehen. Ob Änderungen die Listenposition beeinflussen, ist nicht entschieden. Siegprüfung findet zwischen den Turns vor Fertigstellungen statt. Produktionsfertigstellung erfolgt zu Beginn eigener Bewegungsphase, Ausrücken erst in der darauffolgenden. Bau- und Eroberungsabschluss setzen eine vollständige gegnerische Angriffsgelegenheit voraus; ihre genaue Einordnung und Reparatur bleiben offen. Siehe [Bau und Produktion](Bau_und_Produktion.md).

## Bewegung, Aufnahme und feste Sichtfläche

Die [Bewegungs- und Transportregeln](Bewegung_und_Transport.md) ergänzen diesen Ablauf. Wege bleiben vollständig auf den zu Turnbeginn sichtbaren Feldern. Bei Blockaden endet Bewegung am letzten zulässigen freien Haltefeld, ohne automatische Umgehung. Fahrten und Ladeaktionen des Transporters teilen ein Budget; Laden kostet jeweils 1 Punkt des Transporters und beendet die eigene Bewegung des Passagiers. Die Transportkette Einladen, Fahren, Ausladen bleibt im selben Turn möglich.

Die ganze Karte mit Gelände und Strukturen ist bekannt, außerhalb der Sicht ausgegraut und ohne Einheiten oder zuletzt bekannte Einheitenpositionen. Die Sichtfläche bleibt während der Ausführung fest; sie wird erst für den nächsten Turn aus neuen Positionen berechnet. Ein- und Ausladen erzeugen keine sofortige Sichtänderung. Transportpassagiere tragen bei der Neuberechnung keine Sicht bei; Gebäudeinsassen sind bezüglich Sicht noch offen. Sichtbarkeit eines Feldes gewährt keine Anzeige einer darin nicht mehr existierenden Einheit.

## Gegenwehr und Verluste

**Bestätigt:** Gegenwehr benötigt eine ausdrücklich zugewiesene Fähigkeit und ist standardmäßig deaktiviert. Sie gehört zum ersten Angriff auf die Einheit und ist höchstens einmal pro Turn möglich. Ein regulärer Angriff allein verleiht keine Gegenwehrfähigkeit.

Der Angriff trifft zuerst. Wird der Verteidiger zerstört, gibt es keine Gegenwehr. Überlebt er, verwendet seine unmittelbare Reaktion die danach verbleibende Stärke. Gegenwehr verursacht weniger Schaden als ein regulärer Angriff.

**Offen:** Die Reichweiten- und Zielprüfung für Gegenwehr ist noch festzulegen. Statische Positionen garantieren keine gegenseitig gleiche Waffenreichweite. Für einen ersten Angriff außerhalb der Gegenwehrreichweite wird weder ein Verfall noch ein Aufsparen der Gelegenheit festgelegt. Auch die Zuweisung zu Starteinheiten bleibt offen.

## Schadenswirkung

**Bestätigt:** Verluste reduzieren Angriffskraft. Der Zufall verändert die Angriffswirkung um höchstens ±10 %; gleiche Ausgangslage, Regeln, Seeds und Befehle müssen reproduzierbare Ergebnisse liefern.

**Vorschlag – ungetestet:**

`Schaden = Grundwirkung gegen Zielprofil × Stärkeanteil × Zufallsfaktor × Deckungsfaktor × Gegenwehrfaktor`

| Faktor | Vorschlag / Festlegung |
|---|---|
| Grundwirkung | Waffenwirkung gegen das Zielprofil; konkrete Werte offen |
| Stärkeanteil | Aktuelle Stärke / maximale Stärke; proportionale Skalierung als Vorschlag |
| Zufallsfaktor | Zwischen 0,9 und 1,1 gemäß bestätigter Bandbreite; Verteilung und Ziehverfahren offen |
| Deckungsfaktor | 1 minus wirksame Deckung als Dezimalzahl |
| Gegenwehrfaktor | 1 beim regulären Angriff; 0,5 bei Gegenwehr als ungetesteter Vorschlag |

Rundung, minimale Schadenswerte und konkrete Grundwirkungen bleiben offen. Die Formel ist noch kein vollständiger Kampfalgorithmus.

## Sicht und Höhe

**Bestätigt:** Sichtweite und Sichtlinie werden getrennt berücksichtigt. Der erste Waldrand einschließlich dortiger Einheiten ist sichtbar, sofern Reichweite und übrige Sichtbedingungen passen. Wald dahinter blockiert die Sicht. Sichtbarkeit bedeutet nicht, dass die Einheit ihre Deckung verliert.

Höhen werden als abstrakte Stufen behandelt. Stufengrenzen, Zuordnung zum bisherigen Höhenbereich −100 bis 100, Beobachtungs- und Hindernishöhen sowie genaue geometrische Sichtprüfung sind offen. Insbesondere wird noch keine allgemeine Regel beschlossen, mit der ein Hügel jeden Wald überblicken kann.

**Bestätigt für indirektes Feuer:** Artillerie kann ohne eigene freie Sichtlinie ein Ziel angreifen, das eine eigene Einheit aktuell aufklärt. Blinder Beschuss ist nicht Teil dieser Festlegung. Weitere Zielprüfungen während der Auswertung bleiben zu präzisieren.

## Deckung, Straßen und indirektes Feuer

**Bestätigt:** Eine Straße im Wald erhält dessen Deckung. Indirektes Feuer halbiert die Deckungswirkung, nicht den gesamten Schaden. Aus 40 % Schadensreduktion werden 20 %; die entsprechenden Deckungsfaktoren sind 0,6 und 0,8.

**Vorschläge – ungetestet:**

| Grundgelände | Ungeschützt | Leicht gepanzert | Schwer gepanzert |
|---|---:|---:|---:|
| Ebene | 0 % | 0 % | 0 % |
| Wald | 40 % | 20 % | 10 % |
| Sumpf | 10 % | 0 % | 0 % |
| Fels | 30 % | 10 % | 0 % |
| Wasser | 0 % | 0 % | 0 % |

Deckung erlaubt kein Betreten eines unpassierbaren Feldes. Die Passierbarkeit wird unabhängig anhand des Bewegungsprofils geprüft. Straßenkosten, Brückenwirkung, Höhenwirkung sowie Kombination mehrerer Schutzquellen bleiben offen. Die bestehende Bewegungskostentabelle in [Gelände](Gelaende.md) bleibt unverändert ein Vorschlag.

## Fachliche Prüfszenarien

Diese Szenarien dienen der späteren Abnahme; es wurden noch keine Spieltests ausgeführt.

| Fall | Erwartetes Ergebnis |
|---|---|
| A greift V an, danach B; V ist zur Gegenwehr befähigt und alle Zielbedingungen sind erfüllt | Angriff A → Schaden an V → sofortige Gegenwehr V → deren Schaden → Angriff B. Keine zweite Gegenwehr von V. Erst danach beginnt die Bewegungsliste. |
| Erster Angriff zerstört V, für V ist eine Bewegung geplant | V wird sofort entfernt; keine Gegenwehr, keine spätere Bewegung. |
| Erster Angriff schwächt V, V überlebt | Gegenwehr verwendet die verbleibende Stärke; bei proportionalem Formelvorschlag sinkt ihre Wirkung entsprechend. |
| V besitzt Angriff, aber keine Gegenwehrfähigkeit | V antwortet nicht automatisch. |
| Mehrere Bewegungen sind eingegeben | Sie werden erst nach allen Angriffen in ihrer Eingabereihenfolge ausgeführt, nicht mit Gefechten verzahnt. |
| Späterer Angriff hat ein bereits zerstörtes Ziel | Das entfernte Ziel erhält keinen weiteren Schaden. |
| Ungeschützte Einheit im Wald mit Straße | Dieselbe Deckung wie im Wald ohne Straße: vorgeschlagen 40 %. |
| Indirektes Feuer auf dieses Waldziel | Wirksame Deckung vorgeschlagen 20 %. Bei hypothetischer Wirkung 100 vor Deckung ergeben sich 80 statt 60 bei direktem Feuer; andere Faktoren gleich 1. |
| Einheit am Waldrand; zweite Einheit dahinter, gleiche Höhe, keine andere Aufklärung | Erste Einheit bei ausreichender Reichweite sichtbar, zweite durch Wald verdeckt. |

## Verbleibende Entscheidungen

Gegenwehr-Zielprüfung, endgültige Formel und Balancewerte, Höhenstufen und Sichtgeometrie, Straßen- und Brückenkosten, Bauplatzbedingungen sowie Fehlerkosten und abhängige Folgebefehle bleiben offen. Blockadestopp, Sichtaktualisierung und grundlegende Transportabläufe sind im verlinkten Kapitel festgelegt. Siehe O-05, O-07, O-15 und O-16 in [Entscheidungen](../Entscheidungen.md).


## Gebäudeinventar

Die [Gebäuderegeln](Gebaeude.md) erlauben Angriffe eingelagerter bewaffneter Einheiten, aber keine gezielten Angriffe auf diese und keine Gegenwehr. Diese Kombination gilt nicht für Transportpassagiere. Ein erobernder Verband bleibt bis zur Übernahme außerhalb des Inventars angreifbar. Reichweitenursprung, Zielaufklärung und mögliche Gebäudezerstörung bleiben O-18.
