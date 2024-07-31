package dm;

import kotlin.jvm.internal.C9322n;

/* renamed from: dm.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7062f implements InterfaceC7078v {

    /* renamed from: a */
    private final InterfaceC7078v f15654a;

    public AbstractC7062f(InterfaceC7078v delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f15654a = delegate;
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: K0 */
    public void mo19710K0(C7056b source, long j10) {
        C9322n.m27781e(source, "source");
        this.f15654a.mo19710K0(source, j10);
    }

    @Override // dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15654a.close();
    }

    @Override // dm.InterfaceC7078v, java.io.Flushable
    public void flush() {
        this.f15654a.flush();
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: m */
    public C7081y mo20683m() {
        return this.f15654a.mo20683m();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f15654a + ')';
    }
}
