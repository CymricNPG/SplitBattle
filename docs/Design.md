# Design

## Module

### Modul: Shared

Beinhaltend alle Datenstrukturen, Algorithmen und die Spielelogik

# Modul: Server

Beinhaltet alle "Shared"-Schnittstellen für einen Client-Server Betrieb. Enthält keine Spielelogik!

### Modul: Graphics

Alles, was zur grafischen Darstellung mit LibGDX notwendig ist.

### Diagramm

```mermaid
%%{init: {'theme': 'neutral' } }%%
C4Container
    System(server, "Server")
    System(shared, "Shared")
    System(desktop, "Desktop")
    System(graphics, "Graphics")
    System(android, "Android")
    Rel(server, shared, "Uses")
    Rel(graphics, shared, "Uses")
    Rel(desktop, graphics, "Uses")
    Rel(android, graphics, "Uses")
```

## Services

```mermaid
C4Container
    System(terrain, "TerrainService")
    System(entity, "EntityService")
    Rel(entity, terrain, "Uses")
```
