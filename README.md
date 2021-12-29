 Spring web :
 	il s'agit d'un  framework web 
 	Spring MVC vous permet de créer des beans spéciaux @Controller ou @RestController 
 	pour gérer les requêtes HTTP entrantes.
 	
 Spring Data JPA :
 	Java Persistence API  est une technologie standard
  	qui vous permet de "mapper" des objets sur des bases de données relationnelles.
  	
  Thymeleaf :
  	L'objectif principal de Thymeleaf est d'apporter d'élégants modèles  à votre flux de développement, du HTML qui 
  	s'affiche correctement dans les navigateurs et  fonctionnent également comme des prototypes statiques, permettant ainsi une meilleure collaboration au sein des équipes de développement. 
  	
  	
  H2 :
  	H2 est un système de gestion de base de données relationnelle écrit en Java. 
  	Il peut être intégré à des applications Java ou 
  	H2 prend en charge un sous-ensemble de la norme SQL.
	H2 fournit également une console web pour maintenir la base de données.
  
  Devtools :
  	L'objectif de ce module est  d'optimiser le temps de développement 
  	lors du travail sur les applications Spring Boot.


  
  
  la class controller
  Les contrôleurs Spring Web MVC sont dont là pour nous
   permettre de gérer les requêtes HTTP entrantes tout en nous apportant 
   des facilités de développement pour le binding de données, la validation, 
   la gestion du modèle…
   
  Etape 13
  	1. Avec quelle partie du code avons-nous param´etr´e l’url d’appel /greeting ?
  		 @GetMapping("/greeting")
  	2. Avec quelle partie du code avons-nous choisi le fichier HTML `a afficher ?
  		return "greeting";
  	3. Comment envoyons-nous le nom `a qui nous disons bonjour avec le second lien ?
  		 model.addAttribute("nomTemplate", nameGET); (dans controller)
  		<p th:text="'Bonjour ' + ${nomTemplate} + ' !'" /> (dans greeting)
  		avec http://localhost:9000/greeting?nameGET=ENSIM
  	
  Etape 17
	  Apres avoir creer la classe Adresse.java et relancé l'application on constate la creation dune table Address dans la
	  base de données, les colonnes de cette table coresspondent aux attributs de la-dite classe.
  Etape 20
  	Oui on voit tout le contenu du fichier data.sql
  
  Etape 23	
  	L'annotation @Autowired vous évite de devoir effectuer le câblage vous-même dans le fichier XML (ou tout autre moyen)
  	et trouve pour vous ce qui doit être injecté où et le fait pour vous.
  
   Etape 30
    Pour rajouter bootstrap au projet: 
    - Je suis premierement aller sur le site officiel de bootsrap
    - Ensuite j'ai copier le  stylesheet <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	 et je l'ai collé dans le partie <head> du document html
	- Puis j'ai  copier le script correspondant et je l'ai collé juste avant la fin de la balise <body> 
  	
  	
  	explication spring
	  - pour afficher une page il faut juste une classe controller et un fichier html qui se trouvera dans le dossier template
	  	dans le controller il faut rajouter une annotation controller
	  	creer une methode qui retourne le fichier html souhaite
	  	la methode sera annoté avec un getmapping("/nom_fichier")
	  
	  - 
	  	