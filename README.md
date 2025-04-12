# DSA
# CURS 1:
**De ce Java?**
 Java este un limbaj versatil care poate fi folosit pentru a rezolva o gamă largă de probleme algoritmice.
 Performanță: Robustetea și runtime-ul optimizat al limbajului Java îl fac o alegere excelentă pentru rezolvarea problemelor algoritmice.
 Bibliotecă standard bogată: Java vine cu o bibliotecă standard cuprinzătoare care include structuri de date (de exemplu, ArrayList, HashMap), clase utilitare și API-uri puternice pentru manipularea șirurilor de caractere, input/output și operații matematice.
 Reutilizarea codului: Paradigma de programare orientată pe obiect din Java promovează reutilizarea codului prin utilizarea claselor și interfețelor.
 ##*Introducere Java:*
 Programare Orientată pe Obiect: Java este un limbaj de programare orientat pe obiect, ceea ce înseamnă că se concentrează pe crearea de obiecte care încapsulează date și comportament. Această abordare promovează organizarea codului, reutilizarea și modularitatea, facilitând dezvoltarea sistemelor software complexe.
 Independență față de Platformă: Java este independent de platformă, ceea ce înseamnă că poate rula pe orice sistem de operare sau platformă care are instalată o Mașină Virtuală Java (JVM). Această capabilitate „scrie o dată, rulează oriunde” le permite dezvoltatorilor să scrie cod pe o platformă și să îl ruleze pe mai multe platforme fără modificări.
 Robust și Securizat: Java este conceput pentru a fi robust și securizat, ceea ce îl face o alegere populară pentru construirea aplicațiilor de nivel enterprise. Include funcționalități precum gestionarea automată a memoriei (colectarea gunoiului), tratarea excepțiilor și verificarea strictă a tipurilor, care îmbunătățesc stabilitatea și fiabilitatea aplicațiilor Java.
 ##*Numere întregi*
int: număr întreg în intervalul de la -2³¹ până la 2³¹ - 1 (32 de biți)
→ Folosit frecvent în programe!
short: număr întreg în intervalul de la -2¹⁵ până la 2¹⁵ - 1 (16 biți)
long: număr întreg în intervalul de la -2⁶³ până la 2⁶³ - 1 (64 de biți)
##*Caractere și Șiruri de caractere*
char: simbol alfanumeric, precum cele de pe tastatură.
De obicei atribuim valori variabilelor de tip char (altceva, mai rar).
String: secvență de caractere; cel mai frecvent concatenăm șiruri de caractere.
Notă: String nu este un tip încorporat (built-in), face parte din pachetul java.lang.
float: numere în virgulă mobilă pe 32 de biți, cu precizie simplă.
double: numere în virgulă mobilă pe 64 de biți, cu precizie dublă.
##*Variabile*
Variabile de instanță (câmpuri non-statice) – obiectele își stochează starea individuală în „câmpuri non-statice”, adică în câmpuri declarate fără cuvântul cheie static.
Variabile de clasă (câmpuri statice) – o variabilă de clasă este orice câmp declarat cu modificatorul static; acest lucru spune compilatorului că există o singură copie a acestei variabile, indiferent de câte ori este instanțiată clasa.
Variabile locale – la fel cum un obiect își stochează starea în câmpuri, o metodă își stochează adesea starea temporară în variabile locale.
Parametri – parametrii sunt variabilele care apar în declarația unei metode.
