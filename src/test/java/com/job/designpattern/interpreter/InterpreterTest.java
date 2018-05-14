package com.job.designpattern.interpreter;

import org.junit.Assert;
import org.junit.Test;

public class InterpreterTest {

    @Test
    public void test() {
        PlayContext context = new PlayContext();

        PlayData playData = PlayData.getInstance();
        playData.setPlay("Shanghai");
        String text = "T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
        context.setText(text);
        Expression expression = null;
        while (context.getText().length() > 0) {
            String str = context.getText().substring(0, 1);
            switch (str) {
                case "O":
                    expression = new Scale();
                    break;
                case "T":
                    expression = new Speed();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                    expression = new Note();
                    break;
            }
            assert expression != null;
            expression.interpret(context);
        }
        Assert.assertEquals("Shanghai medium mediant 3 5 6 3 5 2 3 5 6 alt 1 mediant 6 5 1 3 2", playData.getPlay());
    }
}
