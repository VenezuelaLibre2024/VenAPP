package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f12370a;

    private g() {
        this.f12370a = null;
    }

    private g(T t10) {
        if (t10 == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.f12370a = t10;
    }

    public static <T> g<T> a() {
        return new g<>();
    }

    public static <T> g<T> b(T t10) {
        return t10 == null ? a() : e(t10);
    }

    public static <T> g<T> e(T t10) {
        return new g<>(t10);
    }

    public T c() {
        T t10 = this.f12370a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f12370a != null;
    }
}
