package nd;

import pc.d0;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f21940a;

    /* renamed from: b, reason: collision with root package name */
    private final T f21941b;

    public a(Class<T> cls, T t10) {
        this.f21940a = (Class) d0.b(cls);
        this.f21941b = (T) d0.b(t10);
    }

    public T a() {
        return this.f21941b;
    }

    public Class<T> b() {
        return this.f21940a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f21940a, this.f21941b);
    }
}
