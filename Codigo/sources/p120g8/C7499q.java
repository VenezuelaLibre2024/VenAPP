package p120g8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.AbstractC5907w;
import p361t6.AbstractC11061l;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p361t6.InterfaceC11095r3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;

/* renamed from: g8.q */
/* loaded from: classes.dex */
public final class C7499q extends AbstractC11061l implements Handler.Callback {

    /* renamed from: A */
    private final InterfaceC7494l f17719A;

    /* renamed from: B */
    private final C11113v1 f17720B;

    /* renamed from: C */
    private boolean f17721C;

    /* renamed from: D */
    private boolean f17722D;

    /* renamed from: E */
    private boolean f17723E;

    /* renamed from: F */
    private int f17724F;

    /* renamed from: G */
    private C11108u1 f17725G;

    /* renamed from: H */
    private InterfaceC7492j f17726H;

    /* renamed from: I */
    private C7496n f17727I;

    /* renamed from: J */
    private AbstractC7497o f17728J;

    /* renamed from: K */
    private AbstractC7497o f17729K;

    /* renamed from: L */
    private int f17730L;

    /* renamed from: M */
    private long f17731M;

    /* renamed from: N */
    private long f17732N;

    /* renamed from: O */
    private long f17733O;

    /* renamed from: y */
    private final Handler f17734y;

    /* renamed from: z */
    private final InterfaceC7498p f17735z;

    public C7499q(InterfaceC7498p interfaceC7498p, Looper looper) {
        this(interfaceC7498p, looper, InterfaceC7494l.f17704a);
    }

    public C7499q(InterfaceC7498p interfaceC7498p, Looper looper, InterfaceC7494l interfaceC7494l) {
        super(3);
        this.f17735z = (InterfaceC7498p) C11137a.m34603e(interfaceC7498p);
        this.f17734y = looper == null ? null : C11172r0.m34952v(looper, this);
        this.f17719A = interfaceC7494l;
        this.f17720B = new C11113v1();
        this.f17731M = -9223372036854775807L;
        this.f17732N = -9223372036854775807L;
        this.f17733O = -9223372036854775807L;
    }

    /* renamed from: Y */
    private void m22820Y() {
        m22830j0(new C7488f(AbstractC5907w.m15081v(), m22823b0(this.f17733O)));
    }

    /* renamed from: Z */
    private long m22821Z(long j10) {
        int mo22798b = this.f17728J.mo22798b(j10);
        if (mo22798b == 0 || this.f17728J.mo22801l() == 0) {
            return this.f17728J.f32150b;
        }
        if (mo22798b != -1) {
            return this.f17728J.mo22800i(mo22798b - 1);
        }
        return this.f17728J.mo22800i(r2.mo22801l() - 1);
    }

    /* renamed from: a0 */
    private long m22822a0() {
        if (this.f17730L == -1) {
            return Long.MAX_VALUE;
        }
        C11137a.m34603e(this.f17728J);
        if (this.f17730L >= this.f17728J.mo22801l()) {
            return Long.MAX_VALUE;
        }
        return this.f17728J.mo22800i(this.f17730L);
    }

    /* renamed from: b0 */
    private long m22823b0(long j10) {
        C11137a.m34605g(j10 != -9223372036854775807L);
        C11137a.m34605g(this.f17732N != -9223372036854775807L);
        return j10 - this.f17732N;
    }

    /* renamed from: c0 */
    private void m22824c0(C7493k c7493k) {
        C11173s.m34965d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f17725G, c7493k);
        m22820Y();
        m22829h0();
    }

    /* renamed from: d0 */
    private void m22825d0() {
        this.f17723E = true;
        this.f17726H = this.f17719A.mo22813b((C11108u1) C11137a.m34603e(this.f17725G));
    }

    /* renamed from: e0 */
    private void m22826e0(C7488f c7488f) {
        this.f17735z.onCues(c7488f.f17692a);
        this.f17735z.onCues(c7488f);
    }

    /* renamed from: f0 */
    private void m22827f0() {
        this.f17727I = null;
        this.f17730L = -1;
        AbstractC7497o abstractC7497o = this.f17728J;
        if (abstractC7497o != null) {
            abstractC7497o.mo22797x();
            this.f17728J = null;
        }
        AbstractC7497o abstractC7497o2 = this.f17729K;
        if (abstractC7497o2 != null) {
            abstractC7497o2.mo22797x();
            this.f17729K = null;
        }
    }

    /* renamed from: g0 */
    private void m22828g0() {
        m22827f0();
        ((InterfaceC7492j) C11137a.m34603e(this.f17726H)).release();
        this.f17726H = null;
        this.f17724F = 0;
    }

    /* renamed from: h0 */
    private void m22829h0() {
        m22828g0();
        m22825d0();
    }

    /* renamed from: j0 */
    private void m22830j0(C7488f c7488f) {
        Handler handler = this.f17734y;
        if (handler != null) {
            handler.obtainMessage(0, c7488f).sendToTarget();
        } else {
            m22826e0(c7488f);
        }
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: O */
    protected void mo22831O() {
        this.f17725G = null;
        this.f17731M = -9223372036854775807L;
        m22820Y();
        this.f17732N = -9223372036854775807L;
        this.f17733O = -9223372036854775807L;
        m22828g0();
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: Q */
    protected void mo22832Q(long j10, boolean z10) {
        this.f17733O = j10;
        m22820Y();
        this.f17721C = false;
        this.f17722D = false;
        this.f17731M = -9223372036854775807L;
        if (this.f17724F != 0) {
            m22829h0();
        } else {
            m22827f0();
            ((InterfaceC7492j) C11137a.m34603e(this.f17726H)).flush();
        }
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: U */
    protected void mo22833U(C11108u1[] c11108u1Arr, long j10, long j11) {
        this.f17732N = j11;
        this.f17725G = c11108u1Arr[0];
        if (this.f17726H != null) {
            this.f17724F = 1;
        } else {
            m22825d0();
        }
    }

    @Override // p361t6.InterfaceC11095r3
    /* renamed from: a */
    public int mo22834a(C11108u1 c11108u1) {
        if (this.f17719A.mo22812a(c11108u1)) {
            return InterfaceC11095r3.m34459o(c11108u1.f28784R == 0 ? 4 : 2);
        }
        return InterfaceC11095r3.m34459o(C11178w.m35010r(c11108u1.f28797w) ? 1 : 0);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: d */
    public boolean mo22835d() {
        return true;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: e */
    public boolean mo22836e() {
        return this.f17722D;
    }

    @Override // p361t6.InterfaceC11090q3, p361t6.InterfaceC11095r3
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m22826e0((C7488f) message.obj);
        return true;
    }

    /* renamed from: i0 */
    public void m22837i0(long j10) {
        C11137a.m34605g(mo34250r());
        this.f17731M = j10;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: z */
    public void mo22838z(long j10, long j11) {
        boolean z10;
        this.f17733O = j10;
        if (mo34250r()) {
            long j12 = this.f17731M;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                m22827f0();
                this.f17722D = true;
            }
        }
        if (this.f17722D) {
            return;
        }
        if (this.f17729K == null) {
            ((InterfaceC7492j) C11137a.m34603e(this.f17726H)).mo22790a(j10);
            try {
                this.f17729K = ((InterfaceC7492j) C11137a.m34603e(this.f17726H)).mo22791b();
            } catch (C7493k e10) {
                m22824c0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f17728J != null) {
            long m22822a0 = m22822a0();
            z10 = false;
            while (m22822a0 <= j10) {
                this.f17730L++;
                m22822a0 = m22822a0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        AbstractC7497o abstractC7497o = this.f17729K;
        if (abstractC7497o != null) {
            if (abstractC7497o.m38794s()) {
                if (!z10 && m22822a0() == Long.MAX_VALUE) {
                    if (this.f17724F == 2) {
                        m22829h0();
                    } else {
                        m22827f0();
                        this.f17722D = true;
                    }
                }
            } else if (abstractC7497o.f32150b <= j10) {
                AbstractC7497o abstractC7497o2 = this.f17728J;
                if (abstractC7497o2 != null) {
                    abstractC7497o2.mo22797x();
                }
                this.f17730L = abstractC7497o.mo22798b(j10);
                this.f17728J = abstractC7497o;
                this.f17729K = null;
                z10 = true;
            }
        }
        if (z10) {
            C11137a.m34603e(this.f17728J);
            m22830j0(new C7488f(this.f17728J.mo22799h(j10), m22823b0(m22821Z(j10))));
        }
        if (this.f17724F == 2) {
            return;
        }
        while (!this.f17721C) {
            try {
                C7496n c7496n = this.f17727I;
                if (c7496n == null) {
                    c7496n = ((InterfaceC7492j) C11137a.m34603e(this.f17726H)).mo22793d();
                    if (c7496n == null) {
                        return;
                    } else {
                        this.f17727I = c7496n;
                    }
                }
                if (this.f17724F == 1) {
                    c7496n.m38798w(4);
                    ((InterfaceC7492j) C11137a.m34603e(this.f17726H)).mo22792c(c7496n);
                    this.f17727I = null;
                    this.f17724F = 2;
                    return;
                }
                int m34242V = m34242V(this.f17720B, c7496n, 0);
                if (m34242V == -4) {
                    if (c7496n.m38794s()) {
                        this.f17721C = true;
                        this.f17723E = false;
                    } else {
                        C11108u1 c11108u1 = this.f17720B.f28853b;
                        if (c11108u1 == null) {
                            return;
                        }
                        c7496n.f17716t = c11108u1.f28767A;
                        c7496n.m38812z();
                        this.f17723E &= !c7496n.m38796u();
                    }
                    if (!this.f17723E) {
                        ((InterfaceC7492j) C11137a.m34603e(this.f17726H)).mo22792c(c7496n);
                        this.f17727I = null;
                    }
                } else if (m34242V == -3) {
                    return;
                }
            } catch (C7493k e11) {
                m22824c0(e11);
                return;
            }
        }
    }
}
