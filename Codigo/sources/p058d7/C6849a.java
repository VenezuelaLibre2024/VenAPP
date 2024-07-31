package p058d7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import p119g7.C7475k;
import p216l7.C9400a;
import p328r7.C10632b;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* renamed from: d7.a */
/* loaded from: classes.dex */
public final class C6849a implements InterfaceC12621k {

    /* renamed from: b */
    private InterfaceC12623m f15157b;

    /* renamed from: c */
    private int f15158c;

    /* renamed from: d */
    private int f15159d;

    /* renamed from: e */
    private int f15160e;

    /* renamed from: g */
    private C10632b f15162g;

    /* renamed from: h */
    private InterfaceC12622l f15163h;

    /* renamed from: i */
    private C6851c f15164i;

    /* renamed from: j */
    private C7475k f15165j;

    /* renamed from: a */
    private final C11146e0 f15156a = new C11146e0(6);

    /* renamed from: f */
    private long f15161f = -1;

    /* renamed from: c */
    private void m19796c(InterfaceC12622l interfaceC12622l) {
        this.f15156a.m34673Q(2);
        interfaceC12622l.mo41540q(this.f15156a.m34682e(), 0, 2);
        interfaceC12622l.mo41536k(this.f15156a.m34670N() - 2);
    }

    /* renamed from: d */
    private void m19797d() {
        m19799h(new C9400a.b[0]);
        ((InterfaceC12623m) C11137a.m34603e(this.f15157b)).mo324q();
        this.f15157b.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
        this.f15158c = 6;
    }

    /* renamed from: g */
    private static C10632b m19798g(String str, long j10) {
        C6850b m19809a;
        if (j10 == -1 || (m19809a = C6853e.m19809a(str)) == null) {
            return null;
        }
        return m19809a.m19806a(j10);
    }

    /* renamed from: h */
    private void m19799h(C9400a.b... bVarArr) {
        ((InterfaceC12623m) C11137a.m34603e(this.f15157b)).mo308d(RecognitionOptions.UPC_E, 4).mo332c(new C11108u1.b().m34532M("image/jpeg").m34545Z(new C9400a(bVarArr)).m34526G());
    }

    /* renamed from: i */
    private int m19800i(InterfaceC12622l interfaceC12622l) {
        this.f15156a.m34673Q(2);
        interfaceC12622l.mo41540q(this.f15156a.m34682e(), 0, 2);
        return this.f15156a.m34670N();
    }

    /* renamed from: j */
    private void m19801j(InterfaceC12622l interfaceC12622l) {
        int i10;
        this.f15156a.m34673Q(2);
        interfaceC12622l.readFully(this.f15156a.m34682e(), 0, 2);
        int m34670N = this.f15156a.m34670N();
        this.f15159d = m34670N;
        if (m34670N == 65498) {
            if (this.f15161f == -1) {
                m19797d();
                return;
            }
            i10 = 4;
        } else if ((m34670N >= 65488 && m34670N <= 65497) || m34670N == 65281) {
            return;
        } else {
            i10 = 1;
        }
        this.f15158c = i10;
    }

    /* renamed from: k */
    private void m19802k(InterfaceC12622l interfaceC12622l) {
        String m34658B;
        if (this.f15159d == 65505) {
            C11146e0 c11146e0 = new C11146e0(this.f15160e);
            interfaceC12622l.readFully(c11146e0.m34682e(), 0, this.f15160e);
            if (this.f15162g == null && "http://ns.adobe.com/xap/1.0/".equals(c11146e0.m34658B()) && (m34658B = c11146e0.m34658B()) != null) {
                C10632b m19798g = m19798g(m34658B, interfaceC12622l.getLength());
                this.f15162g = m19798g;
                if (m19798g != null) {
                    this.f15161f = m19798g.f26866d;
                }
            }
        } else {
            interfaceC12622l.mo41538n(this.f15160e);
        }
        this.f15158c = 0;
    }

    /* renamed from: l */
    private void m19803l(InterfaceC12622l interfaceC12622l) {
        this.f15156a.m34673Q(2);
        interfaceC12622l.readFully(this.f15156a.m34682e(), 0, 2);
        this.f15160e = this.f15156a.m34670N() - 2;
        this.f15158c = 2;
    }

    /* renamed from: m */
    private void m19804m(InterfaceC12622l interfaceC12622l) {
        if (interfaceC12622l.mo41533d(this.f15156a.m34682e(), 0, 1, true)) {
            interfaceC12622l.mo41534f();
            if (this.f15165j == null) {
                this.f15165j = new C7475k();
            }
            C6851c c6851c = new C6851c(interfaceC12622l, this.f15161f);
            this.f15164i = c6851c;
            if (this.f15165j.mo123e(c6851c)) {
                this.f15165j.mo122b(new C6852d(this.f15161f, (InterfaceC12623m) C11137a.m34603e(this.f15157b)));
                m19805n();
                return;
            }
        }
        m19797d();
    }

    /* renamed from: n */
    private void m19805n() {
        m19799h((C9400a.b) C11137a.m34603e(this.f15162g));
        this.f15158c = 5;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        if (j10 == 0) {
            this.f15158c = 0;
            this.f15165j = null;
        } else if (this.f15158c == 5) {
            ((C7475k) C11137a.m34603e(this.f15165j)).mo121a(j10, j11);
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f15157b = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        if (m19800i(interfaceC12622l) != 65496) {
            return false;
        }
        int m19800i = m19800i(interfaceC12622l);
        this.f15159d = m19800i;
        if (m19800i == 65504) {
            m19796c(interfaceC12622l);
            this.f15159d = m19800i(interfaceC12622l);
        }
        if (this.f15159d != 65505) {
            return false;
        }
        interfaceC12622l.mo41536k(2);
        this.f15156a.m34673Q(6);
        interfaceC12622l.mo41540q(this.f15156a.m34682e(), 0, 6);
        return this.f15156a.m34666J() == 1165519206 && this.f15156a.m34670N() == 0;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int i10 = this.f15158c;
        if (i10 == 0) {
            m19801j(interfaceC12622l);
            return 0;
        }
        if (i10 == 1) {
            m19803l(interfaceC12622l);
            return 0;
        }
        if (i10 == 2) {
            m19802k(interfaceC12622l);
            return 0;
        }
        if (i10 == 4) {
            long position = interfaceC12622l.getPosition();
            long j10 = this.f15161f;
            if (position != j10) {
                c12635y.f34331a = j10;
                return 1;
            }
            m19804m(interfaceC12622l);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f15164i == null || interfaceC12622l != this.f15163h) {
            this.f15163h = interfaceC12622l;
            this.f15164i = new C6851c(interfaceC12622l, this.f15161f);
        }
        int mo124f = ((C7475k) C11137a.m34603e(this.f15165j)).mo124f(this.f15164i, c12635y);
        if (mo124f == 1) {
            c12635y.f34331a += this.f15161f;
        }
        return mo124f;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
        C7475k c7475k = this.f15165j;
        if (c7475k != null) {
            c7475k.release();
        }
    }
}
