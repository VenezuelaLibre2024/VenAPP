package zk;

/* loaded from: classes3.dex */
public final class t extends y1 implements s {

    /* renamed from: e, reason: collision with root package name */
    public final u f32930e;

    public t(u uVar) {
        this.f32930e = uVar;
    }

    @Override // zk.s
    public w1 getParent() {
        return w();
    }

    @Override // zk.s
    public boolean h(Throwable th2) {
        return w().F(th2);
    }

    @Override // ok.l
    public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
        v(th2);
        return ck.v.f7137a;
    }

    @Override // zk.c0
    public void v(Throwable th2) {
        this.f32930e.c0(w());
    }
}
