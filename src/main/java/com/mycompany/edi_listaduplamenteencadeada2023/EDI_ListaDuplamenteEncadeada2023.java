/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.edi_listaduplamenteencadeada2023;

/**
 *
 * @author nando
 */
public class EDI_ListaDuplamenteEncadeada2023 {

    public static void main(String[] args) {
        String teste;
        ListaDupla listadp = new ListaDupla();  //instancio o objeto "listadp" que é uma lista duplamente encadeada
        
        System.out.println(listadp.imprimir()); //imprime a lista que está vazia
        
        System.out.println("--------");
        
        listadp.adiciona("Homer"); //insere Homer na lista
        
        System.out.println(listadp.imprimir()); //imprime a lista com o Homer
        
        listadp.adiciona("Marge"); //insere Marge na lista
        
        System.out.println(listadp.imprimir()); //imprime a lista com o Homer e Marge
        
        listadp.esvaziaLista(); //esfazia a lista 
        
        System.out.println(listadp.imprimir()); //imprime a lista que está vazia
        
        listadp.adiciona("Homer");  //Insere Homer na lista
        
        listadp.AdicionaNoComeco("Bart"); //insere Bart no começo da lista
        
        listadp.adiciona(1, "Moll");    //insere Moll na posição 1
        
        System.out.println(listadp.imprimir()); //imprime a lista (Bart,Moll,Homer)
        
        listadp.esvaziaLista(); //esvazia a lista
        
        listadp.adiciona("Homer"); // insere homer na lista
        
        listadp.adiciona("Bart");   //insere bart na lista
        
        listadp.AdicionaNoComeco("Lisa");   //insere lisa no começo da lista
        
        System.out.println(listadp.imprimir()); //imprime a lista (Lisa,Homer,Bart)
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.esvaziaLista(); //esvazia a lista
        
        listadp.adiciona("Homer");  //insere homer na lista
        
        listadp.adiciona("Maggie"); //insere maggie na lista
        
        listadp.adiciona(0, "Bart");    //insere bart na posição 0
        
        listadp.adiciona(1, "Marge");   //insere margie na posição 1
        
        System.out.println(listadp.imprimir()); //imprime a lista 
        
        System.out.println(listadp.contem("Lisa")); //verifica se Lisa está na lista
        
        System.out.println(listadp.contem("Bart")); //verifica se bart está na lista
        
        listadp.esvaziaLista();     //esvazia a lista
        
        listadp.adiciona("Homer");  //insere homer na lista
        
        listadp.adiciona("Bart");   //insere bart na lista
        
        System.out.println(listadp.imprimir()); //imprime a lista 
        
        System.out.println(listadp.contem("Margie")); //verifica se Margie está na lista
        
        System.out.println(listadp.contem("Homer")); //verifica se Homer está na lista
        
        System.out.println(listadp.contem("Bart")); //verifica se Bart está na lista
        
        System.out.println(listadp.contem("Maggie")); //verifica se Maggie está na lista
        
        System.out.println(listadp.imprimir()); //imprime a lista 
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.esvaziaLista(); //esvazia a lista
        
        listadp.AdicionaNoComeco("Homer");  //insere Homer no início da lista
        
        listadp.AdicionaNoComeco("Bart");   //insere bart no início da lista
        
        listadp.adiciona("Marge");  //insere marge na lista
        
        listadp.adiciona(1,"Maggie");   //insere maggie na posição 1
        
        listadp.AdicionaNoComeco("Ned Flanders");   //adiciona Ned Flanders no começo da lista
        
        listadp.adiciona("Sr. Burns");  //adiciona Sr. Burns na lista
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.removeDoFim();
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        listadp.remove(1);
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        System.out.println(listadp.contem("Marge")); //verifica se marge está na lista
        
        System.out.println(listadp.contem("Homer")); //verifica se homer está na lista
        
        System.out.println(listadp.contem("Bart")); //verifica se Bart está na lista
        
        System.out.println(listadp.contem("Maggie")); //verifica se Maggie está na lista
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.removerDoComeco();
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.removeDoFim();
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.removeDoFim();
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.removeDoFim();
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        listadp.removeDoFim();
        
        System.out.println(listadp.imprimir()); //imprime a lista
        
        System.out.println(listadp.tamanho());  //imprime o tamanho da lista
        
        
    }
}
