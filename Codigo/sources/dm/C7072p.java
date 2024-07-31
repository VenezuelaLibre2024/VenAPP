package dm;

import java.io.OutputStream;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dm.p */
/* loaded from: classes3.dex */
public final class C7072p implements InterfaceC7078v {

    /* renamed from: a */
    private final OutputStream f15672a;

    /* renamed from: b */
    private final C7081y f15673b;

    public C7072p(OutputStream out, C7081y timeout) {
        C9322n.m27781e(out, "out");
        C9322n.m27781e(timeout, "timeout");
        this.f15672a = out;
        this.f15673b = timeout;
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: K0 */
    public void mo19710K0(C7056b source, long j10) {
        C9322n.m27781e(source, "source");
        C7059c0.m20745b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f15673b.mo20791f();
            C7075s c7075s = source.f15638a;
            C9322n.m27778b(c7075s);
            int min = (int) Math.min(j10, c7075s.f15683c - c7075s.f15682b);
            this.f15672a.write(c7075s.f15681a, c7075s.f15682b, min);
            c7075s.f15682b += min;
            long j11 = min;
            j10 -= j11;
            source.m20727j0(source.size() - j11);
            if (c7075s.f15682b == c7075s.f15683c) {
                source.f15638a = c7075s.m20836b();
                C7076t.m20842b(c7075s);
            }
        }
    }

    @Override // dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15672a.close();
    }

    @Override // dm.InterfaceC7078v, java.io.Flushable
    public void flush() {
        this.f15672a.flush();
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: m */
    public C7081y mo20683m() {
        return this.f15673b;
    }

    public String toString() {
        return "sink(" + this.f15672a + ')';
    }
}
