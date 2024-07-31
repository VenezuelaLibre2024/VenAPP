package p174j6;

/* renamed from: j6.c */
/* loaded from: classes.dex */
public final class C8990c<T> implements InterfaceC8989b<T> {

    /* renamed from: b */
    private static final C8990c<Object> f21541b = new C8990c<>(null);

    /* renamed from: a */
    private final T f21542a;

    private C8990c(T t10) {
        this.f21542a = t10;
    }

    /* renamed from: a */
    public static <T> InterfaceC8989b<T> m26383a(T t10) {
        return new C8990c(C8991d.m26386c(t10, "instance cannot be null"));
    }

    @Override // p029bk.InterfaceC1806a
    public T get() {
        return this.f21542a;
    }
}
