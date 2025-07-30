
package com.mycompany.redbacktree;

public class RN {
    
    No raiz;
    
    //retorna o no raiz da arvore
    public No getRaiz() {
        return raiz;
        
    }
    
    //inserir no
    public No inserir(No no, int valor){
        
        if(no == null){
            No novoNo = new No();
            novoNo.setValor(valor):
            novoNo.setCor('R');
            
            if (raiz == null) {
                novoNo.setCor('N');
                raiz = novoNo;
            }
            return novoNo;
            
        } else {
            if(valor >= no.getValor()){
                No filho = inserir(no.getFilhoDireito(), valor);
                if(filho != nul){
                    filho.setPai(no);
                    no.setFilhoDireito(filho);
                    corrigirCor(flho);
                    
                }
            } else{
                No filho = inserir(no.getFilhoEsquerdo(), valor);
                if (filho != null){
                    filho.setPai(no);
                    no.setFilhoEsquerdo(filho);
                    corrigirCor(filho);
                }
            }
        }
        return null;
    }
    
    //rotação simples esquerda em no
    public No rotacaoSimplesEsquerda(No no){
        No novoNo = no.getFilhoDireito();
        no.setFilhoDireito(novoNo.getFilhoEsquerdo());
        if (novoNo.getFilhoEsquerdo() != null){
            novoNo.getFilhoEsquerdo().setPai(no);
        }
        novoNo.setPai(no.getPai());
        if(no.getPai()!= null){
            if(no == no.getPai().getFilhoEsquerdo()){
                no.getPai().setFilhoEsquerdo(novoNo);
            } else{
                no.getPai().setFilhoDireito(novoNo);
            }
        } else {
            raiz = novoNo;
        }
        novoNo.setFilhoEsquerdo(no);
        no.setPai(novoNo);
        return novoNo;
        
    }
    
    //rotação simples direita em no
    public No rotacaoSimplesDireita(No no) {
        No novoNo = no.getFilhoEsquerdo();
        no.setFilhoEsquerdo(novoNo.getFilhoDireito());
        if (novoNo.getFilhoDireito() != null){
            novoNo.getFilhoDireito().setPai(no);
        }
        novoNo.setPai(no.getPai());
        if(no.getPai() != null){
            if(no == no.getPai().getFilhoDireito()){
                no.getPai().setFilhoDireito(novoNo);
            } else {
                no.getPai().setFilhoEsquerdo(novoNo);
            }
        } else {
            raiz = novoNo;
        }
        novoNo.setFilhoDireito(no);
        no.setPai(novoNo);
        return novoNo;
    }
    
    
    //corrigir cor caso inserção
    public void corrigirCor(No filho){
        //cor do pai é vermelha
        if (filho.getPai().getCor() == 'R');{
            //pai a esquerda
            if(filho.getPai() == filho.getPai().getPai().getFilhoEsquerdo()){
                //se o tio existe 
                //if (filho.getPai().getPai().getFilhoDireito()!= null{
                //se o tio a direita existe e se for vermelho CASO 2
                if (filho.getPai().getPai().getFilhoDireito() != null
                        && filho.getPai().getPai().getFilhoDireito().getCor == 'R')
            }
        }
    }
}
