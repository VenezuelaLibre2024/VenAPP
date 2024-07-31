package j6;

/* loaded from: classes.dex */
public final class c<T> implements b<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final c<Object> f19762b = new c<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f19763a;

    private c(T t10) {
        this.f19763a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // bk.a
    public T get() {
        return this.f19763a;
    }
}
