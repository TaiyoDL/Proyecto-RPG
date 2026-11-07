# Proyecto-RPG

RPG por turnos en **consola**, desarrollado en **Java**, con exploración de un mapa, combates, tienda y **guardado/carga de partida en una base de datos SQLite**.

> **Estado:** versión beta (Beta Test 4.0). Se puede explorar, combatir, comprar y guardar la partida; sigue en desarrollo.

## ¿De qué trata?

Controlas a un grupo de personajes que se mueve por un mapa de casillas. Cada casilla puede ser un espacio libre, una pared, un arbusto, un salto, una tienda, un picnic de curación o un combate contra un jefe. Al ganar combates obtienes dinero y experiencia, y los personajes suben de nivel.

## Qué incluye

- **Mapa** de 36×18 casillas, con eventos distintos por casilla.
- **Combate por turnos** ordenado por velocidad, con jefes y personajes del grupo.
- **Cuatro tipos de ataque:** daño directo, curativo, curativo porcentual y de estado (modifica estadísticas).
- **Combinaciones** entre dos personajes (de daño o de bendición).
- **Niveles y experiencia**, **tienda**, **dinero** y **objetos curativos**.
- **Guardado y carga de partida** con SQLite, con una base de datos limpia de partida nueva y otra para la partida guardada.
- Menú de inventario: personajes, objetos, cartera, guardar y salir.

## Datos del juego

La base de datos inicial contiene 20 personajes, 60 ataques (28 de daño, 16 de estado, 9 curativos y 7 porcentuales), 5 objetos y 3 combinaciones.

| Tabla | Contenido |
|---|---|
| `personaje` | Estadísticas, nivel, experiencia, rol (PJ/BOSS) y estado (vivo/muerto) |
| `ataque` | Ataques de cada personaje, usos restantes y tipo |
| `objeto` | Objetos con precio, cantidad y curación |
| `combinacion` | Combinaciones entre personajes, usos y efecto |

## Cómo está construido

| Aspecto | Solución |
|---|---|
| Lenguaje | Java |
| Persistencia | JDBC con SQLite (`sqlite-jdbc`), consultas con `PreparedStatement` |
| Herencia | `Ataque` → `Ataque_pegar`, `Ataque_Curativo`, `Ataque_CurativoPorcentual`, `Ataque_Estado` |
| | `Evento` → `Libre`, `Pared`, `Arbusto`, `Salto`, `Tienda`, `Picnic`, `Player` |
| | `Combinacion` → `CombinacionDanio`, `CombinacionBendicion` |
| | `Objeto` → `Objeto_Curativo` |
| Enumerados | `Rol`, `Estado`, `Stat` |
| Datos | Carga desde SQLite a colecciones en memoria (`Datos`) |

## Estructura del código

```text
ProbandoRandom.java   Punto de entrada (main)
Mapa.java / Evento    Mapa y eventos de cada casilla
Pelea.java            Combate por turnos y orden por velocidad
Personaje.java        Personajes, estadísticas y niveles
Ataque*.java          Tipos de ataque
Combinacion*.java     Combinaciones entre personajes
Tienda.java / Objeto* Tienda y objetos
Partida.java          Guardado y carga de partida
Conexion.java         Conexión con SQLite
Menu.java             Menú de inventario
BD/                   Base de datos inicial y de partida (SQLite)
lib/                  Driver JDBC
```

## Cómo ejecutarlo

Requisitos: JDK instalado y los `.jar` de la carpeta `lib/` en el classpath. Ejecuta desde la carpeta del proyecto, porque la base de datos se busca con la ruta relativa `BD/`.

```bash
javac -cp "lib/*" *.java
java -cp ".:lib/*" ProbandoRandom      # en Windows: ".;lib/*"
```

## Lo que he practicado

- Programación orientada a objetos con jerarquías de clases y polimorfismo.
- Diseño de una base de datos relacional y consultas `SELECT` / `UPDATE` desde Java con JDBC.
- Separación entre datos iniciales y datos de partida guardada.
- Lógica de juego: orden de turnos, niveles, tienda y tipos de efectos.
- Control de versiones con Git (10 commits entre abril y julio de 2026).

## Pendiente / ideas

- Renombrar la clase de entrada (`ProbandoRandom`) a algo más descriptivo.
- Más mapas, personajes y objetos.
- Pruebas de los casos límite del combate.
