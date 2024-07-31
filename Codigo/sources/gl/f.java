package gl;

import zk.m1;

/* loaded from: classes3.dex */
public class f extends m1 {

    /* renamed from: d, reason: collision with root package name */
    private final int f16321d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16322e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16323f;

    /* renamed from: r, reason: collision with root package name */
    private final String f16324r;

    /* renamed from: s, reason: collision with root package name */
    private a f16325s = I0();

    public f(int i10, int i11, long j10, String str) {
        this.f16321d = i10;
        this.f16322e = i11;
        this.f16323f = j10;
        this.f16324r = str;
    }

    private final a I0() {
        return new a(this.f16321d, this.f16322e, this.f16323f, this.f16324r);
    }

    @Override // zk.h0
    public void D0(gk.f fVar, Runnable runnable) {
        a.j(this.f16325s, runnable, null, false, 6, null);
    }

    public final void J0(Runnable runnable, i iVar, boolean z10) {
        this.f16325s.i(runnable, iVar, z10);
    }
}
