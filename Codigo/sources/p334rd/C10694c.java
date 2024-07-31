package p334rd;

/* renamed from: rd.c */
/* loaded from: classes.dex */
public final class C10694c<T> implements InterfaceC10693b<T> {

    /* renamed from: b */
    private static final C10694c<Object> f27054b = new C10694c<>(null);

    /* renamed from: a */
    private final T f27055a;

    private C10694c(T t10) {
        this.f27055a = t10;
    }

    /* renamed from: a */
    public static <T> InterfaceC10693b<T> m32559a(T t10) {
        return new C10694c(C10695d.m32562c(t10, "instance cannot be null"));
    }

    @Override // p029bk.InterfaceC1806a
    public T get() {
        return this.f27055a;
    }
}
