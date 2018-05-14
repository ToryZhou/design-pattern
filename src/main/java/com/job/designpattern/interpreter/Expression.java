package com.job.designpattern.interpreter;

public abstract class Expression {

    public void interpret(PlayContext context) {
        if (context.getText().length() == 0) {
        } else {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.valueOf(context.getText().substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            execute(playKey, playValue);
        }
    }

    public abstract void execute(String key, double value);
}
