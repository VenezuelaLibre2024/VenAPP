package gl;

import p124gk.InterfaceC7587f;
import p494zk.AbstractC13085m1;

/* renamed from: gl.f */
/* loaded from: classes3.dex */
public class C7594f extends AbstractC13085m1 {

    /* renamed from: d */
    private final int f17958d;

    /* renamed from: e */
    private final int f17959e;

    /* renamed from: f */
    private final long f17960f;

    /* renamed from: r */
    private final String f17961r;

    /* renamed from: s */
    private ExecutorC7589a f17962s = m23091I0();

    public C7594f(int i10, int i11, long j10, String str) {
        this.f17958d = i10;
        this.f17959e = i11;
        this.f17960f = j10;
        this.f17961r = str;
    }

    /* renamed from: I0 */
    private final ExecutorC7589a m23091I0() {
        return new ExecutorC7589a(this.f17958d, this.f17959e, this.f17960f, this.f17961r);
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: D0 */
    public void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        ExecutorC7589a.m23056j(this.f17962s, runnable, null, false, 6, null);
    }

    /* renamed from: J0 */
    public final void m23092J0(Runnable runnable, InterfaceC7597i interfaceC7597i, boolean z10) {
        this.f17962s.m23063i(runnable, interfaceC7597i, z10);
    }
}
