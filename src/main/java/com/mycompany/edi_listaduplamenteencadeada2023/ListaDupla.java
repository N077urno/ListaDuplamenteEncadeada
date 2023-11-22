/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edi_listaduplamenteencadeada2023;

/**
 *
 * @author nando
 */
public class ListaDupla {
    Celula primeira; //referência para a primeira célula da lista
    Celula ultima;  //referência para a última célula da lista
    int totalDeElementos = 0; //conta o total de células na lista
    
    boolean posicaoOcupada(int pos){  //verifica se uma posição da lista está ocupada
        return((pos>=0)&&(pos<this.totalDeElementos));//retorna verdadeiro se a posição está entre 0 e o tal de células da lista
        
    }
    
    Celula pegaCelula(int pos){ //retorna uma célula de acordo com a posição na lista
        if(!this.posicaoOcupada(pos)){ //verifica se a posição da célula existe na lista
           System.out.println("Erro: posição não existe"); //Tratamento de código de erro 
           return null; //retorna nulo
        }else{ //a posição da célula existe dentro da lista
            Celula atual = this.primeira;   //referência para a primeira posição da lista
                                            //atual vai indicar qual é a célula atual referênciada
            for(int i=0;i<pos;i++){         //laço de repetição para atualizar a referência atual
                atual = atual.getProxima(); //enquanto não chegar na posição da célula, passar para a próxima célula
            }
            return(atual);  //retorna a célula na posição passada por parâmetro
        } 
        
    }
    
    Object pega(int pos){ //pega um dado de uma célula numa determinada posição
        return(this.pegaCelula(pos).getElemento()); //retorna o dado da célula na posição definida em pos
        
    }
    
    void AdicionaNoComeco(Object elemento){ //adiciona uma célula no começo da lista
        if(this.totalDeElementos==0){   //verifica se a lista está vazia
            Celula nova = new Celula(elemento); //cria uma nova célula e insere o dado na célula
                                                //como a lista está vazia, as referências a anterior e próxima são nulas
            this.primeira = nova;   //a referência para o inicio da lista (primeira) aponta para a nova célula
            this.ultima = nova;     //a referência para o final da lista (ultima) aponta para a nova célula
            
        }else{  //a lista não está vazia, logo já existem outras células dentro da lista
            Celula nova = new Celula(this.primeira,elemento);   //cria uma nova célula, aponta para a próxima célula e insere o dado na célula
                                                                //Ao criar a nova célula, faz com a referência para a próxima célula
                                                                //aponte para aonde a referência "primeira" esteja apontando
            this.primeira.setAnterior(nova);    //configura a referência anterior para a nova célula
            this.primeira = nova;   //atualiza a referência de início da lista para a nova célula
            
        }
        this.totalDeElementos++;    //incrementa o total de elementos
    }
    
    void adiciona(Object elemento){ //adiciona uma célula ao final da lista e insere o dado na célula
        if(this.totalDeElementos==0){   //verifica se a lista está vazia
            this.AdicionaNoComeco(elemento);    //se a lista estiver vazia, chama o método para asicionar no começo da lista
            
        }else{  //se a lista não estiver vazia, será inserido uma nova célula ao final da lista
            Celula nova = new Celula(elemento); //cria uma nova célula e insere o dado na célula
                                                //como a célula será inserida ao final da lista, não há próximo elemento
            this.ultima.setProxima(nova);   //Configura o novo final da lista, o próximo a partir da referência ultimo para a nova célula
            nova.setAnterior(this.ultima);  //configura a referência anterior da nova célula para aonde ultima está apontando
            this.ultima = nova; //atualiza o final da lista, ultima passa a apontar para a nova célula
            this.totalDeElementos++;    //incrementa o total de elementos da lista
            
        }
        
    }
    
    void adiciona(int pos, Object elemento){    //insere uma célula numa posição específica da lista e insere o dado na célula
        if(pos==0){ //a célula vai ser inserida no inicio da lista
            this.AdicionaNoComeco(elemento);    //chama o método para inserir no começo da lista
            
        }else if(pos==this.totalDeElementos){//a nova célula vai ser inserida no final da lista
            this.adiciona(elemento);    //chama o método para inserir no final da lista
            
        }else{  //a celula vai ser inserida numa posição que não é nem no inicio e nem no fim da lista
            Celula ant = this.pegaCelula(pos-1);   //"ant" é uma referência para uma célula da lista
                                                   //caminha com a referência (ant) do início da lista até a célula que está na posição anterior
            Celula prox = ant.getProxima(); //"prox" é uma refencia para uma célula
                                            //prox vai apontar para a referência apontada por ant->proxima
            Celula nova = new Celula(ant.getProxima(),elemento);   //cria uma nova célula e insere o dado na célula
                                                                   //configura a referência próxima da nova célula para aonde aponta ant->proxima
            nova.setAnterior(ant); //configura a referência anterior da nova célula para aonde ant está apontando
            ant.setProxima(nova);   //configura a referência ant->proxima para a pontar para a nova célula
            prox.setAnterior(nova); //configura a referência prox->anterior para a nova cálula
            this.totalDeElementos++; //incrementa o total de elementos
            
        }
    }
    
    void removerDoComeco(){ //remove cálulas do começo da lista
        if(!this.posicaoOcupada(0)){//verifica se a lista está vazia
            System.out.println("Erro: posição não existe"); //Tratamento de código de erro 
           
            
        }else{  //existe pelo menos uma célula na lista
            this.primeira.anterior = null;  //retira a referência apontada por anterior (passa a apontar para nulo)
            this.primeira = this.primeira.getProxima(); //Atualiza o inicio da lista, agora ela começa na posição para aonde proxima aponta
            this.totalDeElementos--;    //decrementa o total de elementos
        }
        if(this.totalDeElementos==0){   //verifica se a lista ficou vazia após a remoção
            this.ultima = null; //faz a referência para a ultima célula apontar para nulo
            
        }
    }
        
    void removeDoFim(){ //remove uma célula do final da lista
        if(!this.posicaoOcupada(0)){//verifica se a lista está vazia
            System.out.println("Erro: posição não existe"); //Tratamento de código de erro 
           
            
        }else{
            if(this.totalDeElementos==1){   //Existe somente uma célula na lista
                this.removerDoComeco(); //chama o método para remover do começo da lista
           
            }else{
                Celula penultima = this.ultima.getAnterior();   //a referência "penultima" aponta para a célula anterior a ultima (ultima->anterior)
                penultima.setProxima(null); //configura a referência "penultima->proxima" para nulo
                this.ultima = penultima;    //atualiza o final da lista fazendo a referência "ultima" apontar para o final da lista
                this.totalDeElementos--;    //decrementa o total de elementos da lista
            }
        }
        
    }
    
    void remove(int pos){   //remove uma célula de uma posição qualquer da lista
        if(!this.posicaoOcupada(0)){//verifica se a lista está vazia
            System.out.println("Erro: posição não existe"); //Tratamento de código de erro 
           
            
        }else{  //existe pelo menos um elemento da lista
            if(pos==0){ //se a posição for a posição 0
                this.removerDoComeco(); //chama o método para remover do começo
                
            }else if(pos==this.totalDeElementos-1){//verifica se a célula a ser removida é a última célula da lista
                this.removeDoFim(); //chama o método para remover do fim da lista
            }else{  //remove de uma posição que não é nem o inicio e nem o final da lista
                Celula ant = this.pegaCelula(pos-1);    //ant é uma referência para uma célula
                                                        //ant vai caminhando na lista até chegar na posição anterior aonde será removido a célula
                Celula atual = ant.getProxima();    //atual é uma referência para uma célula na lista
                                                    //atual vai referenciar para aonde aponta "ant->proxima"
                Celula prox = atual.getProxima();   //prox é uma referência para uma célula
                                                    //prox vai referenciar para aonde aponta "atual->proxima"
                ant.setProxima(prox);   //configura "ant->proxima" para apontar aonde "prox" está apontando
                prox.setAnterior(ant);  //configura "prox->anterior" para apontar aonde "ant" está apontando
                this.totalDeElementos--;    //
            }
        }
        
    }
    
    boolean contem(Object elemento){    //verifica se um elemento está presente na lista
        Celula atual = this.primeira;   //atual é uma referência para celula
                                        //atual aponta para o início da lista, para aonde a referência "primeira" está apontando
        while(atual!=null){ //a referência "atual" vai percorrer todas as células da lista a partir do início da lista
                            //caso "atual" chegue em null, significa que a referência chegou ao final da lista
            if(atual.getElemento().equals(elemento)){   //verifica se o dado presente na célula apontada pela referência atual
                                                        //é igual ao valor do dado que se está pesquisando
                return(true);   //retorna verdadeiro pois encontrou o dado numa célula da lista                                        
            }
            
            atual = atual.getProxima(); //caso o valor do dado não seja igual ao apontado pela referência atual (atual->elemento != elemento)
                                        //a referência atual deve ser atualizada para a aproxima célula apontada por atual->proximo
        }
        
        return(false);  //o método retornará false se percorrer todas as células e em nenhuma delas a referência atual (atual->elemento == elemento)
                        //isso significa que elemento não está presente na lista
        
    }
    
    int tamanho(){  //método para apresentar o total de células na lista
        return(this.totalDeElementos); //retorna o total de células presentes na lista
    }
    
    void esvaziaLista(){    //método para esvaziar a lista
        this.primeira = null;   //torna a referência para o início da lista nulo
        this.ultima = null; //torna a referência para o final da lista nulo
                            //como tanto a referência para o início da lista quanto para o final da lista não levam mais a lista
                            //a lista ficará inacessível e será removida da memória pelo garbage collector em algum momento
        this.totalDeElementos = 0;  //indica que o total de células presentes na lista é 0;                            
        
    }
    
    String imprimir(){  //método para imprimir os dados presentes nas células da lista
        if(this.totalDeElementos==0){   //verifica se o total de células na lista é 0
            return("[]");   //retorna "[]" que indica que a lista está vazia
            
        }else{  //caso tenha pelo menos uma célula na lista, ela contera uma dado (elemento)
            StringBuilder builder = new StringBuilder("["); //Instancia o objeto "builder" para construir uma string
                                                            //com todos os elementos presentes nas células da lista
            Celula atual = this.primeira;   //a referência atual aponta para uma célula
                                            //atual aponta para o início da lista apontada por primeira (atual = primeira)
            for(int i=0;i<this.totalDeElementos-1;i++){ //atual vai percorrer toda a lista, célula por célula para imprimir os dados presentes em cada célula
                                                        //até o penúltimo elemento da lista
                builder.append(atual.getElemento());    //lê um dado (elemento) da célula atual para qual atual está apontando
                                                        //concatena esse elemento ao objeto builder
                                                        //da primeira célula até a penúltima;
                builder.append(",");    //acrescenta o separador "," para distinguir cada dado (elemento) presente na lista
                atual = atual.getProxima(); //atualiza a referência atual para a próxima célula da lista (atual = atual->proxima)
                                            //assim atual vai apontar para aonde "atual->proxima" está apontando
            }
            
            builder.append(atual.getElemento());    //concatena ao objeto builder o último elemento da lista
            builder.append("]");    //concatena ao objeto builder o terminador "]" para indicar que a lista acabou
            return(builder.toString()); //retorna a string com todos os elementos da lista
                                            
        }
    }
}


