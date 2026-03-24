# Test Results

## Testirani slučajevi

4+5 → rezultat: 9 → OK

10+5*4 → rezultat: 30 → OK

10+5*4+3 → rezultat: 33 → OK

## Pronađeni problemi

5/0 → rezultat: Infinity → nedostaje validacija dijeljenja sa nulom

"" → aplikacija puca (charAt(0))

5++3 → neispravan izraz

+5+3 → radi, ali nije standardan unos

## Zaključak

Kalkulator radi osnovne operacije, ali nema validaciju unosa i ima problema sa rubnim slučajevima.
