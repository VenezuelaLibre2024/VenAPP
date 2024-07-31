package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* renamed from: com.google.firebase.perf.util.g */
/* loaded from: classes.dex */
public final class C6333g<T> {

    /* renamed from: a */
    private final T f13602a;

    private C6333g() {
        this.f13602a = null;
    }

    private C6333g(T t10) {
        if (t10 == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.f13602a = t10;
    }

    /* renamed from: a */
    public static <T> C6333g<T> m17519a() {
        return new C6333g<>();
    }

    /* renamed from: b */
    public static <T> C6333g<T> m17520b(T t10) {
        return t10 == null ? m17519a() : m17521e(t10);
    }

    /* renamed from: e */
    public static <T> C6333g<T> m17521e(T t10) {
        return new C6333g<>(t10);
    }

    /* renamed from: c */
    public T m17522c() {
        T t10 = this.f13602a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: d */
    public boolean m17523d() {
        return this.f13602a != null;
    }
}
