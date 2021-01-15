package designPattern.behavior.observer;

import designPattern.behavior.observer.TextObserver;

public interface TextSubject {
    void attachSubject(TextObserver textObserver);

    void detachSubject(TextObserver textObserver);

    void notifySubjects(String value);
}
