package designPattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Text implements TextObserver, TextSubject {
    private String value;
    private List<TextObserver> textObservers =new ArrayList<>();

    public Text withValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
        this.notifySubjects(value);
    }

    @Override
    public void update(String value) {
        this.value = value;
    }

    @Override
    public void attachSubject(TextObserver textObserver) {
        this.textObservers.add(textObserver);
    }

    @Override
    public void detachSubject(TextObserver textObserver) {
        this.textObservers.remove(textObserver);
    }

    @Override
    public void notifySubjects(String value) {
        for (TextObserver textObserver : this.textObservers) {
            textObserver.update(value);
        }
    }
}
