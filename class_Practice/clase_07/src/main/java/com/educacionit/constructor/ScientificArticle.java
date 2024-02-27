package com.educacionit.constructor;
 /*
    Enunciado: clase Articulo Científico.
    Realizar un programa en java que permita modelar un articulo científico. Los artículos científicos contienen los siguientes metadatos: nombre,autor,palabras claves,
    nombre de la publicacion, año y resumen.
    Se defininen 3 constructores:
    1- El primero inicializa un articulo científico con solo su título y autor.
    2- El segundo constructor, un arículo científico con su nombre, autor, palabras claves, nombre de la publicacion,año y resumen.Debe invocar al primer constructor.
    3- El tercer constructor, un arículo científico con su nombre, autor, palabras claves, nombre de la publicacion,año y resumen.Debe invocar al segundo constructor.
    Se requiere un método que imprima los atributos de un artículo en pantalla.Realizar un método main que utilice el tercer constructor para instanciar un artículo científico
    e imprima los valores de sus atributos en pantalla.
     */
public class ScientificArticle {

   private String title;
   private String author;
   private String keyWords;
   private String name;
   private int yearOfPublish;
   private String summary;
   
   public ScientificArticle(){}
   public ScientificArticle(String title,String authorName){
      this.title = title;
      this.author = authorName;
   }
   public ScientificArticle(String title,String autorName,String name, String keyWords, int yearOfPublish, String summary){
      this(title, autorName); /// nombre de las variables que recibe.
      this.name = name;
      this.keyWords = keyWords;
      this.yearOfPublish = yearOfPublish;
      this.summary = summary;
   }
   public String getTitle() {
      return title;
   }
   public String getAuthor() {
      return author;
   }
   public String getKeyWords() {
      return keyWords;
   }
   public String getName() {
      return name;
   }
   public int getYearOfPublish() {
      return yearOfPublish;
   }
   public String getSummary() {
      return summary;
   }
  
   


}
