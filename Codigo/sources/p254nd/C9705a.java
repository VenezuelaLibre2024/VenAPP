package p254nd;

import p294pc.C10135d0;

/* renamed from: nd.a */
/* loaded from: classes.dex */
public class C9705a<T> {

    /* renamed from: a */
    private final Class<T> f23873a;

    /* renamed from: b */
    private final T f23874b;

    public C9705a(Class<T> cls, T t10) {
        this.f23873a = (Class) C10135d0.m30303b(cls);
        this.f23874b = (T) C10135d0.m30303b(t10);
    }

    /* renamed from: a */
    public T m29095a() {
        return this.f23874b;
    }

    /* renamed from: b */
    public Class<T> m29096b() {
        return this.f23873a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f23873a, this.f23874b);
    }
}
