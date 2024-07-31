package gl;

/* renamed from: gl.c */
/* loaded from: classes3.dex */
public final class C7591c extends C7594f {

    /* renamed from: t */
    public static final C7591c f17956t = new C7591c();

    private C7591c() {
        super(C7600l.f17969c, C7600l.f17970d, C7600l.f17971e, C7600l.f17967a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p494zk.AbstractC13064h0
    public String toString() {
        return "Dispatchers.Default";
    }
}
