package p361t6;

import p363t8.C11137a;
import p363t8.InterfaceC11176u;
import p376u6.C11391m3;
import p397v7.InterfaceC11734v0;
import p414w6.C12082g;

/* renamed from: t6.l */
/* loaded from: classes.dex */
public abstract class AbstractC11061l implements InterfaceC11090q3, InterfaceC11095r3 {

    /* renamed from: a */
    private final int f28510a;

    /* renamed from: c */
    private C11100s3 f28512c;

    /* renamed from: d */
    private int f28513d;

    /* renamed from: e */
    private C11391m3 f28514e;

    /* renamed from: f */
    private int f28515f;

    /* renamed from: r */
    private InterfaceC11734v0 f28516r;

    /* renamed from: s */
    private C11108u1[] f28517s;

    /* renamed from: t */
    private long f28518t;

    /* renamed from: u */
    private long f28519u;

    /* renamed from: w */
    private boolean f28521w;

    /* renamed from: x */
    private boolean f28522x;

    /* renamed from: b */
    private final C11113v1 f28511b = new C11113v1();

    /* renamed from: v */
    private long f28520v = Long.MIN_VALUE;

    public AbstractC11061l(int i10) {
        this.f28510a = i10;
    }

    /* renamed from: W */
    private void m34228W(long j10, boolean z10) {
        this.f28521w = false;
        this.f28519u = j10;
        this.f28520v = j10;
        mo22832Q(j10, z10);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: A */
    public final void mo34229A(C11108u1[] c11108u1Arr, InterfaceC11734v0 interfaceC11734v0, long j10, long j11) {
        C11137a.m34605g(!this.f28521w);
        this.f28516r = interfaceC11734v0;
        if (this.f28520v == Long.MIN_VALUE) {
            this.f28520v = j10;
        }
        this.f28517s = c11108u1Arr;
        this.f28518t = j11;
        mo22833U(c11108u1Arr, j10, j11);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: B */
    public final void mo34230B(C11100s3 c11100s3, C11108u1[] c11108u1Arr, InterfaceC11734v0 interfaceC11734v0, long j10, boolean z10, boolean z11, long j11, long j12) {
        C11137a.m34605g(this.f28515f == 0);
        this.f28512c = c11100s3;
        this.f28515f = 1;
        mo27347P(z10, z11);
        mo34229A(c11108u1Arr, interfaceC11734v0, j11, j12);
        m34228W(j10, z10);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: C */
    public final long mo34231C() {
        return this.f28520v;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: D */
    public final void mo34232D(long j10) {
        m34228W(j10, false);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: E */
    public InterfaceC11176u mo34233E() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public final C11121x m34234G(Throwable th2, C11108u1 c11108u1, int i10) {
        return m34235H(th2, c11108u1, false, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final C11121x m34235H(Throwable th2, C11108u1 c11108u1, boolean z10, int i10) {
        int i11;
        if (c11108u1 != null && !this.f28522x) {
            this.f28522x = true;
            try {
                i11 = InterfaceC11095r3.m34454F(mo22834a(c11108u1));
            } catch (C11121x unused) {
            } finally {
                this.f28522x = false;
            }
            return C11121x.m34567g(th2, getName(), m34238K(), c11108u1, i11, z10, i10);
        }
        i11 = 4;
        return C11121x.m34567g(th2, getName(), m34238K(), c11108u1, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final C11100s3 m34236I() {
        return (C11100s3) C11137a.m34603e(this.f28512c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final C11113v1 m34237J() {
        this.f28511b.m34563a();
        return this.f28511b;
    }

    /* renamed from: K */
    protected final int m34238K() {
        return this.f28513d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public final C11391m3 m34239L() {
        return (C11391m3) C11137a.m34603e(this.f28514e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public final C11108u1[] m34240M() {
        return (C11108u1[]) C11137a.m34603e(this.f28517s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean m34241N() {
        return mo34247i() ? this.f28521w : ((InterfaceC11734v0) C11137a.m34603e(this.f28516r)).mo264d();
    }

    /* renamed from: O */
    protected abstract void mo22831O();

    /* renamed from: P */
    protected void mo27347P(boolean z10, boolean z11) {
    }

    /* renamed from: Q */
    protected abstract void mo22832Q(long j10, boolean z10);

    /* renamed from: R */
    protected void mo27349R() {
    }

    /* renamed from: S */
    protected void mo27351S() {
    }

    /* renamed from: T */
    protected void mo27353T() {
    }

    /* renamed from: U */
    protected abstract void mo22833U(C11108u1[] c11108u1Arr, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public final int m34242V(C11113v1 c11113v1, C12082g c12082g, int i10) {
        int mo267q = ((InterfaceC11734v0) C11137a.m34603e(this.f28516r)).mo267q(c11113v1, c12082g, i10);
        if (mo267q == -4) {
            if (c12082g.m38794s()) {
                this.f28520v = Long.MIN_VALUE;
                return this.f28521w ? -4 : -3;
            }
            long j10 = c12082g.f32144e + this.f28518t;
            c12082g.f32144e = j10;
            this.f28520v = Math.max(this.f28520v, j10);
        } else if (mo267q == -5) {
            C11108u1 c11108u1 = (C11108u1) C11137a.m34603e(c11113v1.f28853b);
            if (c11108u1.f28767A != Long.MAX_VALUE) {
                c11113v1.f28853b = c11108u1.m34488c().m34556k0(c11108u1.f28767A + this.f28518t).m34526G();
            }
        }
        return mo267q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public int m34243X(long j10) {
        return ((InterfaceC11734v0) C11137a.m34603e(this.f28516r)).mo266p(j10 - this.f28518t);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: f */
    public final void mo34244f() {
        C11137a.m34605g(this.f28515f == 1);
        this.f28511b.m34563a();
        this.f28515f = 0;
        this.f28516r = null;
        this.f28517s = null;
        this.f28521w = false;
        mo22831O();
    }

    @Override // p361t6.InterfaceC11090q3, p361t6.InterfaceC11095r3
    /* renamed from: g */
    public final int mo34245g() {
        return this.f28510a;
    }

    @Override // p361t6.InterfaceC11090q3
    public final int getState() {
        return this.f28515f;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: h */
    public final InterfaceC11734v0 mo34246h() {
        return this.f28516r;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: i */
    public final boolean mo34247i() {
        return this.f28520v == Long.MIN_VALUE;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: k */
    public final void mo34248k() {
        this.f28521w = true;
    }

    @Override // p361t6.C11070m3.b
    /* renamed from: p */
    public void mo33992p(int i10, Object obj) {
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: q */
    public final void mo34249q() {
        ((InterfaceC11734v0) C11137a.m34603e(this.f28516r)).mo262a();
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: r */
    public final boolean mo34250r() {
        return this.f28521w;
    }

    @Override // p361t6.InterfaceC11090q3
    public final void reset() {
        C11137a.m34605g(this.f28515f == 0);
        this.f28511b.m34563a();
        mo27349R();
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: s */
    public final void mo34251s(int i10, C11391m3 c11391m3) {
        this.f28513d = i10;
        this.f28514e = c11391m3;
    }

    @Override // p361t6.InterfaceC11090q3
    public final void start() {
        C11137a.m34605g(this.f28515f == 1);
        this.f28515f = 2;
        mo27351S();
    }

    @Override // p361t6.InterfaceC11090q3
    public final void stop() {
        C11137a.m34605g(this.f28515f == 2);
        this.f28515f = 1;
        mo27353T();
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: u */
    public final InterfaceC11095r3 mo34252u() {
        return this;
    }

    /* renamed from: y */
    public int mo27379y() {
        return 0;
    }
}
