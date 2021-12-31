Étape 5 description succincte des dépendances 

Spring web :
 Il s'agit d'un  framework Spring MVC(Model View Controller) qui permet de créer des beans spéciaux( @Controller ou @RestController) pour gérer les requêtes HTTP entrantes.
 	
 Spring Data JPA : 
 JPA(Java Persistence API)  est une technologie standard qui  permet de "mapper" des objets Java vers des bases de données relationnelles.

Hibernate :
Hibernate est l'un des Framework ORM (object-related model) Java les plus populaires. Hibernate est une implémentation standard de la spécification JPA, avec quelques fonctionnalités supplémentaires spécifiques à Hibernate.
	
  Thymeleaf :
Thymeleaf est un moteur de modèles Java pour le traitement et la création de HTML, XML, JavaScript, CSS et du texte.
  	
  H2 :
La base de données H2 est une base de données légère et open-source. Elle peut être configurée pour fonctionner comme une base de données en mémoire, mais elle peut aussi être persistante, c'est-à-dire que ses données seront stockées sur disque. H2 prend en charge un sous-ensemble de la norme SQL et fournit également une console web pour maintenir la base de données.
  
  Devtools :
Ce module sert à optimiser le temps de développement lors du travail sur les applications Spring Boot. Il gère entre autres: le Redémarrage automatique et le Rechargement en direct
des pages.
   
  Etape 13

 On  paramètre l’url d’appel /greeting avec * @GetMapping("/greeting") *

On  affiche le fichier HTML greeting.html grâce à  * return "greeting" *

Pour envoyer le nom a qui nous disons bonjour avec le second lien  on procède de   la manière suivante:
	
 la valeur de nameGET est rentré à la main dans le navigateur : http://localhost:9000/greeting?nameGET=ENSIM
 
le nom est envoyé grâce à :
model . addAttribute (" nomTemplate ", nameGET ) ;

Il est affiché dans greetings.html :
<p th:text="'Bonjour ' + ${nomTemplate} + ' !'" /> (dans greeting)
  		  	
 Etape 17

Après avoir créé la classe Adresse.java et relancé l'application on constate la création d'une table Address dans la base de données, les colonnes de cette table correspondent aux attributs de la-dite classe.

Étape 20

  Oui on voit tout le contenu du fichier data.sql
  
Etape 23

L'annotation @Autowired nous épargne de devoir faire le câblage par nous-même, il trouve pour nous ce qui doit être injecté et où il doit être injecté.
  
 Etape 30

    Pour ajouter bootstrap au projet: 
    - Je suis allé sur le site officiel de bootstrap
    - Ensuite j'ai copier les sources css et javascript et je l'ai collé dans la partie <head>( le css)  et <body>( le Javascript) de mon fichier html
	  	
-Application Meteo
Etape 6

<b>Faut-il une clé API pour appeler MeteoConcept ?</b><br>
-J'ai utilisé non pas l’API meteo Concept mais plutôt <b>WeatherStack</b><br>
-Pour utiliser cette API j’ai effectivement eu besoin d’une clé<br>

<b>Quelle URL appeler ?</b><br>
-"http://api.weatherstack.com/current?access_key=" + weatherStackApi_KEY + "&query=" + adresse;<br>

<b>Quelle méthode HTTP utiliser ? ?</b><br>
	-La méthode utilisée est le GET<br>

<b>Comment passer les paramètres d`appels ? </b><br>
	-On compte deux paramètres pour cet API : la Clé et l’Adresse<br>
	-Les paramètres sont passées comme chaine de caractère dans l’url
	http://api.weatherstack.com/current?<b>access_key=" + weatherStackApi_KEY</b> + "&<b>query=" + adresse</b>;

<b> la valeur de la temperature se trouve dans current->temperature voir exemple ci dessous</b>

query=51 allee du gamay , 34080 montpellier France

http://api.weatherstack.com/current?access_key=fdf8a371822fd868f8806e703adacd4e&query=51 allee du gamay , 34080 montpellier France

reponse 
{
    "request": {
        "type": "City",
        "query": "Montpellier, France",
        "language": "en",
        "unit": "m"
    },
    "location": {
        "name": "Montpellier",
        "country": "France",
        "region": "Poitou-Charentes",
        "lat": "45.633",
        "lon": "-0.750",
        "timezone_id": "Europe/Paris",
        "localtime": "2021-12-31 20:08",
        "localtime_epoch": 1640981280,
        "utc_offset": "1.0"
    },
    "current": {
        "observation_time": "07:08 PM",
        "temperature": 12,
        "weather_code": 122,
        "weather_icons": [
            "https://assets.weatherstack.com/images/wsymbols01_png_64/wsymbol_0004_black_low_cloud.png"
        ],
        "weather_descriptions": [
            "Overcast"
        ],
        "wind_speed": 12,
        "wind_degree": 109,
        "wind_dir": "ESE",
        "pressure": 1025,
        "precip": 0,
        "humidity": 79,
        "cloudcover": 100,
        "feelslike": 11,
        "uv_index": 1,
        "visibility": 10,
        "is_day": "no"
    }
}




