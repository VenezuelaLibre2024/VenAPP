package eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a<T> extends l<T> {

    /* renamed from: a */
    static final a<Object> f14585a = new a<>();
    private static final long serialVersionUID = 0;

    private a() {
    }

    public static <T> l<T> e() {
        return f14585a;
    }

    private Object readResolve() {
        return f14585a;
    }

    @Override // eb.l
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // eb.l
    public boolean c() {
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
