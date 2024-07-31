package zk;

/* loaded from: classes3.dex */
public abstract class c2 extends c0 implements c1, r1 {

    /* renamed from: d */
    public d2 f32846d;

    @Override // zk.r1
    public boolean a() {
        return true;
    }

    @Override // zk.r1
    public i2 c() {
        return null;
    }

    @Override // zk.c1
    public void dispose() {
        w().A0(this);
    }

    @Override // el.s
    public String toString() {
        return o0.a(this) + '@' + o0.b(this) + "[job@" + o0.b(w()) + ']';
    }

    public final d2 w() {
        d2 d2Var = this.f32846d;
        if (d2Var != null) {
            return d2Var;
        }
        kotlin.jvm.internal.n.p("job");
        return null;
    }

    public final void x(d2 d2Var) {
        this.f32846d = d2Var;
    }
}
