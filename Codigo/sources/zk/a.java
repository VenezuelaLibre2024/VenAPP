package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
public abstract class a<T> extends d2 implements Continuation<T>, k0 {

    /* renamed from: c, reason: collision with root package name */
    private final gk.f f32835c;

    public a(gk.f fVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            b0((w1) fVar.b(w1.f32940q));
        }
        this.f32835c = fVar.U(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zk.d2
    public String D() {
        return o0.a(this) + " was cancelled";
    }

    protected void N0(Object obj) {
        t(obj);
    }

    protected void O0(Throwable th2, boolean z10) {
    }

    protected void P0(T t10) {
    }

    public final <R> void Q0(m0 m0Var, R r10, ok.p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        m0Var.h(pVar, r10, this);
    }

    @Override // zk.d2, zk.w1
    public boolean a() {
        return super.a();
    }

    @Override // zk.d2
    public final void a0(Throwable th2) {
        j0.a(this.f32835c, th2);
    }

    @Override // gk.Continuation
    public final gk.f getContext() {
        return this.f32835c;
    }

    @Override // zk.k0
    public gk.f h() {
        return this.f32835c;
    }

    @Override // zk.d2
    public String p0() {
        String b10 = g0.b(this.f32835c);
        if (b10 == null) {
            return super.p0();
        }
        return '\"' + b10 + "\":" + super.p0();
    }

    @Override // gk.Continuation
    public final void resumeWith(Object obj) {
        Object n02 = n0(e0.d(obj, null, 1, null));
        if (n02 == e2.f32874b) {
            return;
        }
        N0(n02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zk.d2
    protected final void u0(Object obj) {
        if (!(obj instanceof a0)) {
            P0(obj);
        } else {
            a0 a0Var = (a0) obj;
            O0(a0Var.f32837a, a0Var.a());
        }
    }
}
