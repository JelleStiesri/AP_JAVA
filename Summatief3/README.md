# 3. Dijkstra's algoritme

De basis van mijn algoritme is het algoritme van Baeldung (https://www.baeldung.com/java-dijkstra)
Ik heb het algoritme overgenomen en verder omgebouw / uitgebreid.

Ik zal hieronder een lijstje geven van dingen die ik toegevoegd/ aangepast hebt, en als het nodig is waarom.

# **`Lijstje`**
- Class 'Node', werking spreekt voor zich binnen het dijkstra algoritme

- Functie 'getLowestDistance()' vervangen door een Priority Queue.
In veel versies van het Dijkstra algoritme worden priority queues gebruikt om het pad met de laagste kosten 
vooraan in de list te hebben.

- De class 'PrioNode', deze is er ter ongersteuning van de Priority Queue. 
Verdere uitleg staat bij die class zelf.

- De compareTo interface. Deze gebruik in in PrioNode om te kijken welk pad er tot nu toe het 
korste is, en zet deze vervolgens vooraan in de priority queue. Dit is nodig
omdat de afstand en de Node (waar de stap begint) in een HashMap horen, maar dit niet kan in een Priority Queue

- Ik heb van Vlucht, Rit en Treinrit 1 class gemaakt, genaamd 'Type'.
Dit heb ik gedaan omdat er geen verschillende functionaliteit in de soorten stappen zit (behalve factor).
Deze factor is een getal waarmee de distance word vermenigvuldigd. Voor vliegen is dit 2 (dus 100 Km = 50 Euro), Voor Treinrit is dit 1.2/3 (100 Km = 60 Minuten) 
Door dit in 1 class te maken houd ik dit compact en is het makkelijk om een nieuw vervoerstype aan te maken.

####Gegeven UML
Een stap kan 1 reis hebben en een reis kan 1 of meerdere stappen hebben. Ik gebruik Comparable niet bij reis maar bij Dijkstra. 
Waarschijnlijk niet helemaal wat er bedoeld werdt maar ik laat wel zien dat ik het goed kan implementeren en weet hoe het werkt.

Ik heb Rit, Treinrit en Vlucht niet als 3 apparte Classes maar als 1 'Type', Ik heb dit hierboven onderbouwd.

Het geheel werkt zoals het hoort. De snelste route word gemaakt en deze word daarna in stappen in reis gezet.

####Testen
(Het ontwerp voor de Main staat netjes uitgewerkt in de Repo)

Ik heb voor alle Classes & Functies waarvoor ik het nodig achte testen gemaakt

Paar bijzonderheden:
- Ik test in Reis of een reis wel goed gemaakt word & of hij null return als de reis geen stappen heeft (want een reis moet 1 of mee stappen hebben)

- Dijkstra heeft maar 1 test. er is maar 1 ding wat je kan testen, of het geheel goet werkt, en dat doe ik dan ook. 
Bijna alle functies in dijkstra worden al in een andere test behandeld. 


BRON DIJKSTRA ALGORITME
https://www.baeldung.com/java-dijkstra (algoritme)
https://stackoverflow.com/questions/29872664/add-key-and-value-into-an-priority-queue-and-sort-by-key-in-java/29873362 (PrioQueue)