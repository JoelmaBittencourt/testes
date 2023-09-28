package com.testes.sentencebuilder;


public class SentenceBuilder {

    public String concatenate(String str1, String str2) {
        if ( str2.isEmpty())
            throw new IllegalArgumentException("A segunda string não pode estar vazia.");

        return str1 + str2;
    }
    public String concatenate(String str1) {
        if (str1.isEmpty())
            throw new  IllegalStateException("Campo vazio.");

        return str1;
    }

}
