package com.educacionit.constructor;

public class Ejercicio_01 {
    public static void main(String[] args) {
        ScientificArticle article = new ScientificArticle("AI's as Brothers", "Gonzalo E. Cardin");
        String title = article.getTitle();
        String author = article.getAuthor();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
