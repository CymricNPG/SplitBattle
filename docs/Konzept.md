# Konzept

## Vision und Dokumentationsstand

Ein von Battle Isle inspiriertes rundenbasiertes Strategiespiel für zwei Spieler. Taktisches Vorausdenken, Positionierung und das Zusammenspiel von Einheiten stehen im Mittelpunkt. Beide Spieler planen gleichzeitig unterschiedliche Zugteile.

Zielgruppe sind Strategie-Nostalgiker, Strategiespieler und kompetitive Spieler. Zielplattformen sind Windows Desktop und Android. Vorgesehen sind menschliche Gegner und Einzelspieler gegen KI.

Die Dokumentation beschreibt Anforderungen, keinen Implementierungsnachweis. Bestätigte Entscheidungen, frühere Ideen und offene Fragen werden unterschieden.

| Dokument | Inhalt |
|---|---|
| [Spielregeln](Spielregeln.md) | Fachlicher Ablauf und Standardregeln mit Beispielen |
| [Anforderungen](Anforderungen.md) | IDs, Prioritäten und Akzeptanzkriterien |
| [Glossar](Glossar.md) | Verbindliche Bedeutung der Begriffe |
| [Design](Design.md) | Architektur und technische Leitlinien |
| [Planung](Planung.md) | Meilensteine und Abnahmekriterien |
| [Entscheidungen](Entscheidungen.md) | Entscheidungen, ersetzte Aussagen und offene Fragen |

## Spielkern und Standardkonfiguration

Ein Turn umfasst die gleichzeitige verdeckte Planung beider Spieler und die anschließende Auswertung. Ein Spieler plant Bewegungen, der andere Aktionen. Eigene Befehle sind bis zum eigenen Turnabschluss änderbar. Nur die Planung erfolgt parallel. Nach Abschluss beider Spieler werden alle Angriffe in Eingabereihenfolge einschließlich jeweils sofortiger optionaler Gegenwehr ausgeführt. Schaden wirkt unmittelbar. Erst danach folgen Bewegungen überlebender Einheiten in ihrer Eingabereihenfolge; während aller Gefechte bleiben Positionen unverändert. Anschließend wechseln die Rollen. Zwei Turns bilden eine Runde.

Der Standardregelsatz sieht Folgendes vor:

- Fabriken erzeugen Baufortschritt am jeweils einzigen aktiven Produktionsauftrag; weitere Aufträge warten. Es gibt keinen separaten Produktionsressourcenvorrat und keine Übertragung von Restleistung. Einheiten werden zu Beginn einer eigenen Bewegungsphase fertig und dürfen erst in der darauffolgenden eigenen Bewegungsphase ausrücken.
- Baueinheiten errichten Stützpunkte und Infrastruktur mit Baupunkten. Bei null Baupunkten bleiben sie erhalten. Basen reparieren Einheiten und füllen Baupunkte auf. Vor Bauabschluss erhält der Gegner eine vollständige Angriffsgelegenheit.
- Standardinfanterie beginnt Eroberung durch Beenden ihrer Bewegung auf dem Gebäude und bleibt bis zur Übernahme außerhalb des Inventars angreifbar. Nach vollständiger gegnerischer Angriffsgelegenheit und Überleben wechseln Gebäude und Inventar nach den Bewegungen vor der Siegprüfung den Besitzer; Produktionsfortschritt und Vorräte gehen verloren.
- Eroberung des gegnerischen Hauptquartiers oder Vernichtung aller gegnerischen Einheiten führt zum Sieg. Zusätzliche Gebiets- und Missionsziele sind konfigurierbar.

Fähigkeiten sind Eigenschaften von Objektdefinitionen. Die Bezeichnung „Infanterie“ ist keine fest codierte Voraussetzung für Eroberung. Ein anders konfigurierter Einheitentyp kann dieselbe Fähigkeit erhalten.

## Spielwelt

Aus dem initialen Entwurf werden als Zielbild übernommen:

- Hexagonkarten bis 100 × 100 Felder, vorgefertigt oder später aus einem Seed generiert.
- Gelände wie Meer, Küste, Ebene, Wald und Berge; Abstrakte Höhenstufen; die Zuordnung zum ursprünglichen Wertebereich −100 bis 100 ist noch offen. Gebäude sind Spielobjekte und nicht bloß Geländearten.
- Land-, See- und Lufteinheiten, etwa Infanterie, Panzer, Artillerie, Schiffe, Transporter, Bomber und Jäger.
- Bewegung abhängig von Gelände und Eigenschaften; Durchqueren eigener Einheiten erlaubt, regulär eine Einheit pro Feld. Gebäude und Transporter können über ihre Eigenschaften mehrere Einheiten aufnehmen.
- Die ganze Karte mit Gelände und Strukturen ist bekannt. Nicht sichtbare Felder sind ausgegraut und zeigen keine Einheiten oder zuletzt bekannten Einheitenpositionen. Bewegungen bleiben auf sichtbaren Feldern und decken während der Ausführung nichts auf; Sicht wird erst zum nächsten Turn aus den neuen Positionen berechnet.
- Zufallsbasierter Kampf mit reproduzierbaren Ergebnissen. Gelände, Erfahrung, Moral und angrenzende Einheiten sind bisher vorgeschlagene Einflussgrößen, keine fertige Kampfformel.

Detailfragen werden vor der betreffenden Umsetzung entschieden, siehe [Entscheidungen](Entscheidungen.md).

## Modularität und Szenarien

Spielobjekte werden aus mehreren Eigenschaften mit Parametern zusammengesetzt. Bestehende Eigenschaften lassen sich ohne Programmierung kombinieren. Plugins ergänzen neue Eigenschaftstypen samt Verhalten sowie Inhalte und Darstellungen. Eine Skriptsprache ist nicht vorgesehen.

Ein Szenario enthält Karte, Startaufstellung, Objektdefinitionen, Regelsatz, Ziele, Grafikreferenzen und benötigte Plugins. Ein Spielstand enthält dagegen den aktuellen Zustand einer Partie und deren Szenariogrundlage. Beide Begriffe sind nicht gleichbedeutend.

## Integrierter Szenario-Editor

Der Editor ist Teil der Desktop-Anwendung und über das Hauptmenü erreichbar. Bereits der erste spielbare Meilenstein erlaubt:

- Karte und Gelände bearbeiten.
- Objektdefinitionen aus vorhandenen Eigenschaften zusammenstellen und parametrisieren.
- Objekte platzieren und Spielern zuordnen.
- Spieler und verfügbare Siegbedingungen konfigurieren.
- Szenarien prüfen, speichern, laden und probespielen.
- Durch Plugins ergänzte Eigenschaften bearbeiten.

Android spielt kompatible Szenarien, benötigt aber keinen Editor. Der Editor verwendet JavaFX für Rahmen, Dialoge und Kartenansicht innerhalb derselben Desktop-Anwendung; LibGDX wird nicht in JavaFX eingebettet. Spielansicht und Android bleiben LibGDX-basiert, während Fachlogik, Szenarioformate und Assets geteilt werden.

## Bedienung und Qualität

Desktop: Maus und Tastatur, Shortcuts, Zoom und Scrollen, Auswahl von Feldern und Objekten, Anzeige zulässiger Befehle, Infopanels und Ereignisprotokoll. Lesbare Icons und Farben, Hilfe und durchgängige Internationalisierung bleiben Ziele. Android benötigt angepasste Touchbedienung.

Das Spiel soll nach jedem ausgewerteten Turn automatisch speichern, ohne bei einem abgebrochenen Speichervorgang den letzten gültigen Spielstand zu verlieren. Gleiche Ausgangslage, Regeln, Seeds und Befehle sollen dieselben Ergebnisse liefern. Für Einzelspieler sind Historie und das Laden älterer Spielstände vorgesehen.

Das ursprüngliche Leistungsziel bleibt eine KI-Planung unter fünf Sekunden bei 100 Einheiten; Referenzhardware und Messverfahren sind offen.

## Ausbaustufen und erhaltene Ideen

Der erste spielbare Meilenstein ist ein vollständiges lokales Duell in zwei Desktopfenstern mit integriertem Editor. Weitere Stufen umfassen Netzwerkspiel, KI, Android, Zufallskarten, weitere Inhalte und Balancing.

Weitere Ideen aus dem initialen Entwurf bleiben erhalten, sind aber noch keine ausimplementierbaren Anforderungen:

- Serverautoritatives Online-Spiel, serverseitige Spielstände, konfigurierbare Zeitlimits und Elo-Wertung.
- Lokaler Host mit Broadcast-Erkennung; ein bisher unpräzise beschriebenes Hosting „über Google“; Nakama als bisheriges langfristiges Ziel.
- KI-Varianten über Plugins, zunächst mit dem Ziel, gegnerische Basen zu erobern.
- Forschung und optionaler Unterhalt als mögliche Erweiterungen.
- Tutorial-Szenarien über Ereignisse und Hooks; Plugins können Texte, Grafikreaktionen und zusätzliche Screens ergänzen.
- Konfigurierbare einheitenspezifische Geräusche für Auswahl, Bewegung und Kampf.
- Monetarisierungsidee: monatliches Kontingent kostenloser Mehrspielerpartien und kostenpflichtiger erweiterter Zugang. Umfang und Geschäftsmodell sind offen.


Gebäude haben im Standard unbegrenzte Aufnahme und Bewegungskosten wie Straßen. Bewaffnete Gebäudeinsassen dürfen angreifen, sind nicht gezielt angreifbar und leisten keine Gegenwehr. Die Siegprüfung erfolgt zwischen den Turns nach fälligen Eroberungen und vor den übrigen Turngrenzschritten. Detailregeln: [Gebäude](Spielregeln/Gebaeude.md) und [Bau und Produktion](Spielregeln/Bau_und_Produktion.md).
