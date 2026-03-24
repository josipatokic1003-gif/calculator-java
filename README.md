# Static Code Analysis Report

## LOC
LOC (Lines of Code): 214

## Zapažanja

Calculator.java – 6 – koristi se globalna statička varijabla finalResult što može otežati testiranje i dovesti do neočekivanog ponašanja

Calculator.java – 18 – metoda ToString ne prati Java konvenciju imenovanja (treba biti toString)

Calculator.java – 19 – metoda ToString vraća nejasan i nestrukturiran string

Calculator.java – 24 – metoda Run samo prosljeđuje poziv drugoj metodi, što je nepotrebno

Calculator.java – 28 – metoda evaluateExpression je preduga i ima više odgovornosti

Calculator.java – 32 – nema provjere da li je expression prazan prije korištenja charAt(0)

Calculator.java – 32-34 – složen uslov sa više provjera smanjuje čitljivost koda

Calculator.java – 37 – kompleksan regex u split metodi otežava razumijevanje

Calculator.java – 52 – hvatanje generičkog Exception bez specifične obrade greške

Calculator.java – 74 – metoda Calculate je preduga i kompleksna

Calculator.java – 110-180 – dupliranje logike za različite operacije (sabiranje, oduzimanje, množenje, dijeljenje)

Calculator.java – 123 – nedostaje provjera dijeljenja sa nulom
