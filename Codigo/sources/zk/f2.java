package zk;

import gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f2<T> extends s0<T> {

    /* renamed from: d, reason: collision with root package name */
    private final Continuation<ck.v> f32883d;

    public f2(gk.f fVar, ok.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) {
        super(fVar, false);
        Continuation<ck.v> a10;
        a10 = hk.c.a(pVar, this, this);
        this.f32883d = a10;
    }

    @Override // zk.d2
    protected void w0() {
        fl.a.b(this.f32883d, this);
    }
}
