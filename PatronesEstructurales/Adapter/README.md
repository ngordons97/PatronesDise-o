## Patron de diseño ADAPTER

El objetivo es poder consumir información desde diferentes fuentes de origen y transformaslos a JSON, en este caso usamos 2 fuentes de origen un XML y CSV

**Ejecución consumo data diferentes fuentes**
```bash
java -jar target/uisrael-adapter.jar
---------------------------------------------------
CONSUME LISTADO DE PERSONAS POR DESDE ARCHIVO XML
[ {
  "nombre" : "Juan",
  "edad" : 30,
  "ciudad" : "Madrid"
}, {
  "nombre" : "Maria",
  "edad" : 25,
  "ciudad" : "Barcelona"
}, {
  "nombre" : "Carlos",
  "edad" : 35,
  "ciudad" : "Valencia"
}, {
  "nombre" : "Ana",
  "edad" : 28,
  "ciudad" : "Sevilla"
}, {
  "nombre" : "Luis",
  "edad" : 40,
  "ciudad" : "Bilbao"
}, {
  "nombre" : "Lucia",
  "edad" : 32,
  "ciudad" : "Zaragoza"
}, {
  "nombre" : "Miguel",
  "edad" : 29,
  "ciudad" : "Murcia"
}, {
  "nombre" : "Sofia",
  "edad" : 27,
  "ciudad" : "Granada"
}, {
  "nombre" : "Pablo",
  "edad" : 33,
  "ciudad" : "Malaga"
}, {
  "nombre" : "Laura",
  "edad" : 31,
  "ciudad" : "Alicante"
} ]

---------------------------------------------------
CONSUME LISTADO DE PERSONAS POR DESDE ARCHIVO CSV
[ {
  "ciudad" : "Madrid",
  "nombre" : "Juan",
  "edad" : "30"
}, {
  "ciudad" : "Barcelona",
  "nombre" : "Maria",
  "edad" : "25"
}, {
  "ciudad" : "Valencia",
  "nombre" : "Carlos",
  "edad" : "35"
}, {
  "ciudad" : "Sevilla",
  "nombre" : "Ana",
  "edad" : "28"
}, {
  "ciudad" : "Bilbao",
  "nombre" : "Luis",
  "edad" : "40"
}, {
  "ciudad" : "Zaragoza",
  "nombre" : "Lucia",
  "edad" : "32"
}, {
  "ciudad" : "Murcia",
  "nombre" : "Miguel",
  "edad" : "29"
}, {
  "ciudad" : "Granada",
  "nombre" : "Sofia",
  "edad" : "27"
}, {
  "ciudad" : "Malaga",
  "nombre" : "Pablo",
  "edad" : "33"
}, {
  "ciudad" : "Alicante",
  "nombre" : "Laura",
  "edad" : "31"
} ]
---------------------------------------------------

```