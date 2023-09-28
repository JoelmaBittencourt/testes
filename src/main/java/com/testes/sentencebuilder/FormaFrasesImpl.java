package com.testes.sentencebuilder;

public class FormaFrasesImpl {

    public static void main(String[] args) {

        SentenceBuilder sentenceBuilder = new SentenceBuilder();

       String frases = sentenceBuilder.concatenate("batata", "boa");
        System.out.println(frases);


        String frasesThrow = sentenceBuilder.concatenate("batata", "");
        System.out.println(frases);
}
    }
