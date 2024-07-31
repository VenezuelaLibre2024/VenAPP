package zk;

import gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g2 extends o2 {

    /* renamed from: d, reason: collision with root package name */
    private final Continuation<ck.v> f32892d;

    public g2(gk.f fVar, ok.p<? super k0, ? super Continuation<? super ck.v>, ? extends Object> pVar) {
        super(fVar, false);
        Continuation<ck.v> a10;
        a10 = hk.c.a(pVar, this, this);
        this.f32892d = a10;
    }

    @Override // zk.d2
    protected void w0() {
        fl.a.b(this.f32892d, this);
    }
}
