# Gelände

[Katalogübersicht und Status](README.md) · [Eigenschaften](Eigenschaften.md) · [Einheiten](Einheiten.md)

## Aufbau

**Bestätigt:** Grundgelände, Höhe und Ergänzungen wie Straße und Brücke sind getrennt kombinierbar. Gelände und Höhen beeinflussen Sichtlinien. Ein bewaldeter Hügel benötigt keinen eigenen fest codierten Geländetyp.

Die fünf Grundgelände und ihre folgenden Bewegungskosten sind ein **Vorschlag – ungetestet**. Die Tabelle beschreibt Kosten beim Betreten eines Feldes ohne Ergänzungen. Höhenwirkung und Kombination mit Ergänzungen sind noch nicht festgelegt.

## Grundgelände

| Grundgelände | Fuß | Rad | Kette | Taktische Aufgabe |
|---|---:|---|---|---|
| Ebene | 1 | 1 | 1 | Schnelle Bewegung, wenig Schutz |
| Wald | 1 | Unpassierbar | 2 | Deckung und Sichtschutz |
| Sumpf | 2 | Unpassierbar | 3 | Langsamer Nebenweg |
| Fels | 2 | Unpassierbar | Unpassierbar | Zugang für Infanterie abseits der Fahrzeugwege |
| Wasser | Unpassierbar | Unpassierbar | Unpassierbar | Natürliche Trennung |

„Unpassierbar“ ist eine ausdrückliche Einschränkung, kein sehr hoher Kostenwert. Wasser ist hier für die drei vorgesehenen Landbewegungsprofile unpassierbar; damit werden keine späteren See- oder Luftprofile ausgeschlossen.

## Kombinierbare Bestandteile

| Bestandteil | Aufgabe | Noch offen |
|---|---|---|
| Höhe | Abstrakte Höhenstufen unabhängig vom Grundgelände | Stufengrenzen, Zuordnung zum ursprünglichen Bereich −100 bis 100 und genaue Wirkung |
| Straße | Ergänzung für Verkehrswege; Walddeckung bleibt erhalten | Kosten, betroffene Profile und erlaubte Kombinationen |
| Brücke | Ergänzung zur Überwindung von Wasser | Passierbarkeit, Kosten, zulässige Bauform und weitere Wechselwirkungen |

Die Ergänzungen verändern potenziell Passierbarkeit und Kosten. Eine konkrete Vorrang- oder Additionsregel ist noch nicht beschlossen.

## Wiederverwendbare Eigenschaften

Jede Geländedefinition verwendet passende Konfigurationen für Passierbarkeit, Bewegungskosten, Deckung, Sichtbehinderung und Bebaubarkeit. Höhe wird unabhängig ergänzt. Einheiten greifen über ihre Bewegungs- und Zielprofile auf diese Eigenschaften zu, nicht über ihre Typnamen.

Beispiel: Ein weiteres Radfahrzeug nutzt dasselbe Radprofil wie Spähfahrzeug und Transporter. Es benötigt keine eigene Geländetabelle.

## Wechselwirkungen

Die [Wechselwirkungen](Wechselwirkungen.md) definieren Waldrandsicht, erhaltene Walddeckung auf Straßen und halbierte Deckungswirkung gegen indirektes Feuer. Dort steht die Deckungstabelle als ungetesteter Vorschlag. Sichtgeometrie, Höhenblockaden, Straßen- und Brückenkosten sowie Bauplatzbedingungen bleiben offen.
