# Two Sum - Solution en Java

Ce dépôt contient une solution au célèbre problème **Two Sum** en Java, où l'objectif est de trouver deux indices dans un tableau tel que leurs valeurs additionnées égalent une cible donnée.

## Description du problème

Étant donné un tableau d'entiers `nums` et un entier `cible`, il faut retourner les indices des deux nombres tels que leur somme est égale à la cible.

- Chaque entrée a exactement une solution.
- Vous ne pouvez pas utiliser le même élément deux fois.
- Les indices peuvent être retournés dans n'importe quel ordre.

### Exemple

#### Entrée

```text
nums = [2, 7, 11, 15], cible = 9
```

### Sortie

```text
[0, 1]
```

### Explications

- nums[0] + nums[1] = 2 + 7 = 9, donc les indices [0, 1] sont retournés.

## Solution proposée

### Approche

- Utilisation d'une table de hachage (HashMap) pour stocker les nombres du tableau et leurs indices.

- Parcourir le tableau une seule fois.
- Vérifier pour chaque élément si son complément (cible - valeur actuelle) est déjà dans la table de hachage.
- Si trouvé, retourner les indices ; sinon, ajouter le nombre actuel à la table.

## Exemples d'utilisation

### Exemple 1

```text
Entrée : nums = [2, 7, 11, 15], cible = 9
Sortie : [0, 1]
```

### Exemple 2

```text
Entrée : nums = [3, 2, 4], cible = 6
Sortie : [1, 2]
```

### Exemple 3

```text
Entrée : nums = [3, 3], cible = 6
Sortie : [0, 1]
```

## Ressources

[Problème Two Sum sur LeetCode](https://leetcode.com/problems/two-sum)

## Suivi de progression

Ce dépôt fait partie de ma progression personnelle dans l'apprentissage des algorithmes et des structures de données. N'hésitez pas à me laisser des commentaires ou des suggestions !
