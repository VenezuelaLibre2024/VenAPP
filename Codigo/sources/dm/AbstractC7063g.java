package dm;

import kotlin.jvm.internal.C9322n;

/* renamed from: dm.g */
/* loaded from: classes3.dex */
public abstract class AbstractC7063g implements InterfaceC7080x {

    /* renamed from: a */
    private final InterfaceC7080x f15655a;

    public AbstractC7063g(InterfaceC7080x delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f15655a = delegate;
    }

    /* renamed from: a */
    public final InterfaceC7080x m20785a() {
        return this.f15655a;
    }

    @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15655a.close();
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: m */
    public C7081y mo20685m() {
        return this.f15655a.mo20685m();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f15655a + ')';
    }
}
