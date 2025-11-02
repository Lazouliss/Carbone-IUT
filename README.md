# CarboneIUT

CarboneIUT est une application Java qui permet de calculer l'empreinte carbone hebdomadaire d'un utilisateur. Ce projet a été développé dans le cadre d'un cours portant sur le suivi de version et les tests unitaires.

## Structure du Projet

Le projet est organisé en plusieurs dossiers :

- `src/` : Contient le code source de l'application
  - `Model/` : Contient la logique métier
    - `Bilan.java` : Gestion des calculs du bilan carbone
    - `Data.java` : Gestion des données
  - `Presentation/` : Contient les contrôleurs de l'application
    - `ControllerButtons.java` : Gestion des événements des boutons
    - `Presentation.java` : Gestion de la présentation
    - `UIMain.java` : Point d'entrée de l'application
  - `View/` : Contient les interfaces utilisateur
    - `PanelEmpreinteNumerique.java` : Panel pour l'empreinte numérique
    - `PanelFood.java` : Panel pour l'alimentation
    - `PanelTransport.java` : Panel pour les transports
    - `PanelWelcome.java` : Panel d'accueil
    - `PanelThanks.java` : Panel de remerciement
- `tests/` : Contient les tests unitaires
  - `Model/` : Tests des classes du modèle
- `bin/` : Contient les fichiers compilés
- `Reponses/` : Contient les réponses aux TPs

## Comment lancer l'application

Pour lancer l'application, vous devez :

1. Avoir Java installé sur votre machine (JDK 8 ou supérieur)
2. Compiler le projet :
    
    - Bash
   ```bash
   mkdir -p bin
   javac -d bin -cp "lib/*" $(find src -name "*.java")
   ```

   - Powershell
   ```powershell
   # Créer les dossiers nécessaires
   New-Item -ItemType Directory -Force -Path bin
   
   # Compiler avec JUnit dans le classpath
   Get-ChildItem -Path ".\src" -Filter "*.java" -Recurse | ForEach-Object { $_.FullName } | javac -d bin -cp "lib/*"
   ```
3. Lancer l'application :
   ```bash
   java -cp bin Presentation.UIMain
   ```

L'application s'ouvrira dans une fenêtre avec une interface permettant de calculer votre empreinte carbone hebdomadaire (pour un étudiant de l'IUT d'Orsay).
