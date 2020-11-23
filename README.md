# GuiBibliotek

## Introduction

Dette er et gui bibletotek til [processing](https://processing.org/ ). I Mappen [GuiBibliotekExmepel/GuiBibliotek](https://github.com/DangelTheMangel/GuiBibliotek/tree/main/GuiBibliotekExmepel/GuiBibliotek) er der et exempel med selve klasserne som der er i jar filen uden bilitoteket og i mappen [GuiBibliotek/GuiBileotekt Exempel hvor der bruges Bib](https://github.com/DangelTheMangel/GuiBibliotek/tree/main/GuiBileotekt%20Exempel%20hvor%20der%20bruges%20Bib/test%20jat%20fil) er der hvor der er et exempel på sleve Bilioteket der bliver brugt. Til extra opgaven er der mappen [GuiBibliotek/med Gui handler klasse](https://github.com/DangelTheMangel/GuiBibliotek/tree/main/GuiBibliotek/med%20Gui%20handler%20klasse) og sleve jar filen er på [GuiBibliotek](https://github.com/DangelTheMangel/GuiBibliotek/tree/main/Gui%20bibliotek)

## Code Samples
### Konstruere knap
``` Java
//Den måde man konstruere knappen er
Button buttonTerning6 = new Button(XKordinat, YKordinat, X Størrelse, Y Størrelse, Hvad der skal stå på knaooen ,PApllet);

```
### Ændre knaps funktion
``` Java
// Den måde du giver en kanp en funktion er at 
    
> knap.addAction(new Action() {
                                     public void execute() {

                                         /* Din Funktion her*/
    
                                         }
                                 }

```
### Så knappen kan klikkes
``` Java
 // for at gøre så når du klikekr på kanppen at der sker noget skal du i mousePressed()
knap.click(PApllet.mouseX,PApllet.mouseY);

```






## Installation

I Intillij skal du gå ind ProjektStrukter/Libaris og tryk på + knappen find jar filen som lægger inden i denne her og tilføj den
