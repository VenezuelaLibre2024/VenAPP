package dm;

/* loaded from: classes3.dex */
public abstract class g implements x {

    /* renamed from: a, reason: collision with root package name */
    private final x f14297a;

    public g(x delegate) {
        kotlin.jvm.internal.n.e(delegate, "delegate");
        this.f14297a = delegate;
    }

    public final x a() {
        return this.f14297a;
    }

    @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14297a.close();
    }

    @Override // dm.x
    public y m() {
        return this.f14297a.m();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f14297a + ')';
    }
}
