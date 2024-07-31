package gl;

/* loaded from: classes3.dex */
public final class c extends f {

    /* renamed from: t, reason: collision with root package name */
    public static final c f16319t = new c();

    private c() {
        super(l.f16332c, l.f16333d, l.f16334e, l.f16330a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // zk.h0
    public String toString() {
        return "Dispatchers.Default";
    }
}
