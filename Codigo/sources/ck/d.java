package ck;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class d<T> implements h<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final T f7116a;

    public d(T t10) {
        this.f7116a = t10;
    }

    @Override // ck.h
    public T getValue() {
        return this.f7116a;
    }

    @Override // ck.h
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
