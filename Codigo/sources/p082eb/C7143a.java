package p082eb;

/* renamed from: eb.a */
/* loaded from: classes2.dex */
final class C7143a<T> extends AbstractC7156l<T> {

    /* renamed from: a */
    static final C7143a<Object> f16008a = new C7143a<>();
    private static final long serialVersionUID = 0;

    private C7143a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T> AbstractC7156l<T> m21241e() {
        return f16008a;
    }

    private Object readResolve() {
        return f16008a;
    }

    @Override // p082eb.AbstractC7156l
    /* renamed from: b */
    public T mo21242b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p082eb.AbstractC7156l
    /* renamed from: c */
    public boolean mo21243c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
