/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edi_listaduplamenteencadeada2023;

/**
 *
 * @author nando
 */
public class Celula {
    Celula proxima;     //referência a próxima célula
    Celula anterior;    //referência a Célula anterior
    Object Elemento;    //Dado armazenado dentro da célula
    
    Celula(Celula prox, Object ele){ //Constrói uma célula, aponta para a próxima célula e insere o dado
        this.proxima = prox;    //referencia a próxima célula
        this.anterior = null;   //referencia a célula anterior é nula
        this.Elemento = ele;    //insere o dado na célula
    }
    
    Celula(Object ele){ //Constrói uma célula e insere um dado 
        this.proxima = null;    //referência para a próxima célula é nula
        this.anterior = null;   //referência a célula anterior é nula
        this.Elemento = ele;    //insere um elemento na célula
    }
    
    void setProxima(Celula prox){//Configura quem será a próxima célula
        this.proxima = prox;    //referencia a próxima célula que foi passada no parâmetro
        
    }
    
    void setAnterior(Celula ant){//Configura quem será a célula anterior
        this.anterior = ant;    //referencia a célula anterior que foi passada no parâmetro
        
    }
    
    Celula getProxima(){    //pega quem é a proxima célula
        return(this.proxima); //retorna a próxima célula
    }
    
    Celula getAnterior(){   //pega quem é a célula anterior
        return(this.anterior); //retorna a célula anterior
        
    }
    
    Object getElemento(){   //pega o dado presente na célula
        return(this.Elemento); //retorna o elemento da célula
        
    }
}
