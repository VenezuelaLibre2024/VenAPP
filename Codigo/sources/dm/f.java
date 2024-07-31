package dm;

/* loaded from: classes3.dex */
public abstract class f implements v {

    /* renamed from: a, reason: collision with root package name */
    private final v f14296a;

    public f(v delegate) {
        kotlin.jvm.internal.n.e(delegate, "delegate");
        this.f14296a = delegate;
    }

    @Override // dm.v
    public void K0(b source, long j10) {
        kotlin.jvm.internal.n.e(source, "source");
        this.f14296a.K0(source, j10);
    }

    @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14296a.close();
    }

    @Override // dm.v, java.io.Flushable
    public void flush() {
        this.f14296a.flush();
    }

    @Override // dm.v
    public y m() {
        return this.f14296a.m();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f14296a + ')';
    }
}
