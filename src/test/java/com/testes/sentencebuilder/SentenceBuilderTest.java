package com.testes.sentencebuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SentenceBuilderTest {

    SentenceBuilder sentenceBuilder = new SentenceBuilder();

    @Test
    public void testConcatenateEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> {
            sentenceBuilder.concatenate("batata", "");
        });

    }

    @Test
    public void testConcatenateEmptyStr() {
        assertThrows(IllegalStateException.class, () -> {
            sentenceBuilder.concatenate("");
        });

    }
}