# Projet Bataille navale

## Commande pour lancer le programme
mvn clean install exec:java
A la racine du dossier bataille navale

## Archives
Cette archive contient dans le dossier src/main/java/ensta la liste des fichiers utilisés et le package ships pour les bateaux.
Il y'a deux fichiers de test: TestBoard.java et TestGame.java et un fichier Game.java pour la boucle principale.
Lors de la dernière éxécution, le programme n'a pas retourné de résultat à cause des fonctions save() et loadFile() qui malgré qu'elles soient juste traitées en bonus empêchent le code de compiler. 
Malgré cela toutes les autres classes sont pleinement fonctionnelles.

## Exercice 1
L'encapsulation de la classe Board se fait par la mise en privé de l'attribut Nom de la classe Board. Les grilles ayant beoin d'être publiques. 

## Exercice 2
Pour représenter au mieux l'information sur l'orientation, on a décidé de créer une classe énumération qui correspond aux différentes orientations.
En ce qui concerne les fichiers, il s'agit de creer des packages pour les fichiers qui traitent de même sujet comme le package **ships** qui contient les fichiers des bateaux.

## Exercice 3
En ce qui concerne les indices, la considération a été faite de sorte les indices des tableaux vont de 0 à taille-1 comme normalement en Java. Mais, l'utilisateur pour sa part voit un tableau indicé de 1 à taille. Donc le programme a été fait de sorte que l'utilisateur entre des valeurs entre 1 et taille et ces valeurs sont converties dans les tableaux et les fonctions pour correspondre à la considération 0 à taille-1.
La fonction putship de Board lance une exception et doit être encadrée par un try... catch à chaque appel.

## Exercice 7
Le type de liste la plus approprié pour les bateaux est la ArrayList.




