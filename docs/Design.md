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

## Komponenten

```mermaid
classDiagram
    GameMechanicPlugin <|-- CombatPlugin
    GameMechanicPlugin <|-- MovementPlugin
    GameMechanicPlugin <|-- EconomyPlugin
    GameMechanicPlugin <|-- MovementPlugin
    CombatPlugin --> UnitPlugin
    MovementPlugin --> UnitPlugin
    EconomyPlugin --> UnitPlugin
    CombatPlugin --> MapPlugin
    MovementPlugin --> MapPlugin
    VisualizationPlugin --> GameMechanicPlugin
    GamePlugin --> VisualizationPlugin
    GamePlugin --> GameMechanicPlugin
    GamePlugin --> MapPlugin

```

## UI Ablauf

```mermaid
flowchart LR
    Start((Start)) --> LoadingScreen
    LoadingScreen --> TitleScreen
    TitleScreen --> OptionsScreen
    OptionsScreen --> TitleScreen
    TitleScreen --> SinglePlayerScreen
    SinglePlayerScreen --> TitleScreen
    SinglePlayerScreen --> GameScreen
    TitleScreen --> ImpressumScreen
    ImpressumScreen --> TitleScreen
    TitleScreen --> HelpScreen
    HelpScreen --> TitleScreen
    GameScreen --> TitleScreen
    TitleScreen --> MultiPlayerScreen
    MultiPlayerScreen --> GameScreen
    MultiPlayerScreen --> MultiPlayerOptionsScreen
    MultiPlayerScreen --> TitleScreen
    MultiPlayerOptions --> WaitForPlayersScreen
    WaitForPlayersScreen --> TitleScreen
    WaitForPlayersScreen --> GameScreen

```

- Jeder Screen hat denselben Aufbau
- Jeder Screen hat eine eindeutige ID
- Der TitleScreen erlaubt die Erweiterung um neue Screens, die über Plugins reinkommen.

Das Design der Screens ist:

```mermaid
classDiagram
    ScreenSwitcher <|-- ScreenManager
    libgdx_Screen <|-- Screen
    Screen <|-- someScreen
    someScreen --> ScreenSwitcher
    class ScreenSwitcher {
        registerScreen(Screen)
        switchTo(nextScreen: ScreenId, parameters: Optional~~ScreenParameter~)
    }

    class ScreenManager {
        libgdx.Game
    }
```

### Game Ablauf

#### Game Loop

```mermaid
flowchart LR
    Start((Start)) --> WaitForGameInit
    WaitForGameInit --> GameLoop
    WaitForGameInit -. Player A .-> MoveUnits
    WaitForGameInit -. Player B .-> AttackUnits

    subgraph GameLoop
        MoveUnits -- Next Turn/TurnCheck --> AttackUnits
        AttackUnits -- Next Round/TurnCheck --> MoveUnits
    end

    GameLoop --> End((End))


```

#### Turn Loop

```mermaid
flowchart LR
    subgraph TurnCheck
        ResolveConflicts --> ResolvProduction
        ResolvProduction --> ResolveVictory
        ResolveVictory --> ShowTurnResult
        subgraph ShowTurnResult
            ReplayConflicts --> CheckVictory{Player has won?}
            CheckVictory -- Yes --> ShowVictory
            CheckVictory -- No --> ReplayProduction
            ShowVictory --> End((End))
        end
    end


```

# Ui
