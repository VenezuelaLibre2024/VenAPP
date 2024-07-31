package p414w6;

/* renamed from: w6.a */
/* loaded from: classes.dex */
public abstract class AbstractC12076a {

    /* renamed from: a */
    private int f32116a;

    /* renamed from: m */
    public final void m38789m(int i10) {
        this.f32116a = i10 | this.f32116a;
    }

    /* renamed from: n */
    public void mo22818n() {
        this.f32116a = 0;
    }

    /* renamed from: o */
    public final void m38790o(int i10) {
        this.f32116a = (~i10) & this.f32116a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean m38791p(int i10) {
        return (this.f32116a & i10) == i10;
    }

    /* renamed from: q */
    public final boolean m38792q() {
        return m38791p(268435456);
    }

    /* renamed from: r */
    public final boolean m38793r() {
        return m38791p(Integer.MIN_VALUE);
    }

    /* renamed from: s */
    public final boolean m38794s() {
        return m38791p(4);
    }

    /* renamed from: t */
    public final boolean m38795t() {
        return m38791p(134217728);
    }

    /* renamed from: u */
    public final boolean m38796u() {
        return m38791p(1);
    }

    /* renamed from: v */
    public final boolean m38797v() {
        return m38791p(536870912);
    }

    /* renamed from: w */
    public final void m38798w(int i10) {
        this.f32116a = i10;
    }
}
