# Hizkuntza Modeloa - Hiru eta erdi

## NireTabla Klasea

NireTabla klasea hiru eta erdi jokoa inplementatzen du Java programazio-lengoaian. Hau da, hiru lerro eta hiru zutabe dituen taula batean jokatzen da. Klaseak metodo desberdinak ditu, eta hauek dira bere funtzio nagusiak:

### Hasierako Ezaugarriak

- `J1`, `J2`, eta `hutsa`: Ikurrak eta hutsaren ikurra definitzen dituzten konstanteak.
- `txanda`: Jokoen txanda zehazten duen boolean aldagaia.
- `taula`: Hiru lerro eta hiru zutabe dituen matrizea, jokoa gordetzeko erabiliko dena.

### Metodo Nagusiak

- `NireTabla()`: Eraikitzailea, klasea hasieratzen du.
- `bukaera()`: Jokoak amaitu den edo irabazlea dagoeneko bukatu den egiaztatzen du.
- `taulaBeteta()`: Taula beteta dagoen ala ez egiaztatzen du.
- `lerroanKoinzidentzia()`: Lerro batean koinzidentzia bat dagoen ala ez egiaztatzen du.
- `zutabeanKoinzidentzia()`: Zutabe batean koinzidentzia bat dagoen ala ez egiaztatzen du.
- `diagonalKoinzidentzia()`: Diagona batean koinzidentzia bat dagoen ala ez egiaztatzen du.
- `erakutsiIrabazlea()`: Irabazlea erakutsi, eta nork irabazi duen jakin.
- `txandaAldatu()`: Jokoen txanda aldatzen du.
- `betePos(int lerro, int zutabe)`: Matrizean posizio bati ikur bat sartzen du.
- `taulaErakutsi()`: Matrizea erakutsi.
- `txandaErakutsi()`: Uneko txanda erakutsi.
- `balidatuPos(int lerro, int zutabe)`: Sartutako posizioa balioztatu.
- `balioaPos(int lerro, int zutabe)`: Posizio batean marka bat dagoen ala ez adierazi.

### Erabilera

1. `NireTabla nireTaula = new NireTabla();`: NireTabla klasearen instantzia bat sortu.
2. `nireTaula.taulaErakutsi();`: Jokoaren taula erakutsi.
3. `nireTaula.txandaErakutsi();`: Uneko txanda erakutsi.
4. `nireTaula.betePos(1, 1);`: Matrizean posizio bati ikur bat sartu.
5. `nireTaula.bukaera();`: Jokoaren bukaera egiaztatu.

### Oharrak

- Programak euskaraz dago, hizkuntza erabilgarria aldatu nahi baldin bada, testuak aldatu beharko dira ere.
- Klasea erabiliz hiru eta erdi jokoa jokatu daiteke, erabilera argitaratu behar da.
- Beste funtzio eta metodo gehiago gehitu daitezke, hainbat aukera gehitzeko.

## Eskerrak

Programa hau NireTabla klasearen bitartez hiru eta erdi jokoa garatzeko erabil daiteke. Eskerrik asko gure erabilera hartu duzulako!
