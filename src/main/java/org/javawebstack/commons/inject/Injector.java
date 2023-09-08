package org.javawebstack.commons.inject;

public interface Injector {

    <T> T getInstance(Class<T> type);
    <T> T inject(T object);

}
