package w6;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f29653a;

    public final void m(int i10) {
        this.f29653a = i10 | this.f29653a;
    }

    public void n() {
        this.f29653a = 0;
    }

    public final void o(int i10) {
        this.f29653a = (~i10) & this.f29653a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p(int i10) {
        return (this.f29653a & i10) == i10;
    }

    public final boolean q() {
        return p(268435456);
    }

    public final boolean r() {
        return p(Integer.MIN_VALUE);
    }

    public final boolean s() {
        return p(4);
    }

    public final boolean t() {
        return p(134217728);
    }

    public final boolean u() {
        return p(1);
    }

    public final boolean v() {
        return p(536870912);
    }

    public final void w(int i10) {
        this.f29653a = i10;
    }
}
