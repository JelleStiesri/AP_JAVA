# AP_JAVA
##Code:
- Let op! de ontwerpen voor de test functies in de Main staan los in de repo

**Node:**
De Class Node word voor de Text en kans-machine gebruikt. De Atributen 'Keys' zijn voor de Text-machine en 'Chances' voor de Kans-machine.

Deze atributen zijn allebei Arrays. Dit heb ik gedaan om het programma 'flexibel' te maken. Je kan de arrays zo lang maken als je wilt, zolang de lengtes van de keys/chances arrays maar overeen komt met de lengte van de 'options' Array 
(Hierin staan de nodes die als volgende worden gebruikt door de machine als deze optie word gekozen).

De index van de items in de Arrays bepalen welke items bij elkaar horen. Zelfde index = hoort bij elkaar.

- Text: Relatief simpel. Kijkt of de letter in keys voorkomt, zo ja: return option die bij die key hoort - zo nee: return null
- Kans: Kiest een random double tussen 0 en 1 (komma getal dus). Heeft een totaal som waar steeds de chance van de option bij op word geteld. Wanneer het random getal kleiner is dan de totaal soms is de huidige node in de for loop de volgende stap. 

**FSM**
In de code van FSM is er meer onderscheid tussen de 2 soorten machines, er zijn namelijk 2 aparte functies. De basis van deze functies is wel het zelfde.

- ChanceMachine(): Dit is de op kans gebaseerde machine. deze begint bij node 0 en roept vervolgens steeds de functie ReturnChanceNode aan, deze return een node gebaseerd op kans. Dit doet de machine totdat hij bij een eind-node komt.
- TextMachine(): Deze machine begint met een woord. Hij geeft elke letter omstebeurt aan de functie ReturnStringNode. Deze return een andere Node of null gebaseerd op de keys die zijn ingesteld voor die node.

Beide machines returnen een Array met daarin alle nodes die ze af zijn gegaan tijdens het uitvoeren.

##Tests:
Ik heb op verschillende manieren getest of de class 'Node' goed werkt:

- testToString (Test of de naam van de node goed word gereturnt)
- testIsFinalNode (Test of de boolean 'FinalNode' goed word geset en gereturnt)
- testReturnStringNode (Test of de functie 'ReturnStringNode' de juiste optie bij de juiste key return / null bij verkeerde key)
- testReturnChanceNode (Checkt of de juiste optie word gereturnt, de kans staat op 100% zodat altijd dezelfde optie moet worden gekozen)

Als laaste een wat 'experimentelere' test.
- testRandom (Deze test heeft een verhouding van 20% op 80 %  (dus 8/10 van de tijd moet hij voor optie 2 gaan). Ik run de functie 'ReturnChanceNode' 10000 keer. 
De test slaagt als hij 83% van de tijd optie 2 geeft (er zit dus een foutmarge van 1.5% naar boven en beneden)).

Deze test heb ik er puur in gedaan omdat ik hem interesant vond. Hij zal in extreem zeldzame test niet slagen, maar test toch of de random kies functie goed functioneerd.

De test functies voor FSM zitten er ook bij voor spek en bonen. Dit stond niet in de opdrachtomschrijving, maar vond het goed om met testen te oefenen.