package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T uiObjectType);
    boolean equals(Object o);
}
