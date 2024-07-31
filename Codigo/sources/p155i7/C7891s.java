package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collections;
import p155i7.InterfaceC7879i0;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p396v6.C11631a;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.s */
/* loaded from: classes.dex */
public final class C7891s implements InterfaceC7885m {

    /* renamed from: a */
    private final String f19142a;

    /* renamed from: b */
    private final C11146e0 f19143b;

    /* renamed from: c */
    private final C11144d0 f19144c;

    /* renamed from: d */
    private InterfaceC12609b0 f19145d;

    /* renamed from: e */
    private String f19146e;

    /* renamed from: f */
    private C11108u1 f19147f;

    /* renamed from: g */
    private int f19148g;

    /* renamed from: h */
    private int f19149h;

    /* renamed from: i */
    private int f19150i;

    /* renamed from: j */
    private int f19151j;

    /* renamed from: k */
    private long f19152k;

    /* renamed from: l */
    private boolean f19153l;

    /* renamed from: m */
    private int f19154m;

    /* renamed from: n */
    private int f19155n;

    /* renamed from: o */
    private int f19156o;

    /* renamed from: p */
    private boolean f19157p;

    /* renamed from: q */
    private long f19158q;

    /* renamed from: r */
    private int f19159r;

    /* renamed from: s */
    private long f19160s;

    /* renamed from: t */
    private int f19161t;

    /* renamed from: u */
    private String f19162u;

    public C7891s(String str) {
        this.f19142a = str;
        C11146e0 c11146e0 = new C11146e0(RecognitionOptions.UPC_E);
        this.f19143b = c11146e0;
        this.f19144c = new C11144d0(c11146e0.m34682e());
        this.f19152k = -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m24322a(C11144d0 c11144d0) {
        return c11144d0.m34632h((c11144d0.m34632h(2) + 1) * 8);
    }

    /* renamed from: g */
    private void m24323g(C11144d0 c11144d0) {
        if (!c11144d0.m34631g()) {
            this.f19153l = true;
            m24328l(c11144d0);
        } else if (!this.f19153l) {
            return;
        }
        if (this.f19154m != 0) {
            throw C11005b3.m33715a(null, null);
        }
        if (this.f19155n != 0) {
            throw C11005b3.m33715a(null, null);
        }
        m24327k(c11144d0, m24326j(c11144d0));
        if (this.f19157p) {
            c11144d0.m34642r((int) this.f19158q);
        }
    }

    /* renamed from: h */
    private int m24324h(C11144d0 c11144d0) {
        int m34626b = c11144d0.m34626b();
        C11631a.b m36461e = C11631a.m36461e(c11144d0, true);
        this.f19162u = m36461e.f30266c;
        this.f19159r = m36461e.f30264a;
        this.f19161t = m36461e.f30265b;
        return m34626b - c11144d0.m34626b();
    }

    /* renamed from: i */
    private void m24325i(C11144d0 c11144d0) {
        int i10;
        int m34632h = c11144d0.m34632h(3);
        this.f19156o = m34632h;
        if (m34632h == 0) {
            i10 = 8;
        } else {
            if (m34632h != 1) {
                if (m34632h == 3 || m34632h == 4 || m34632h == 5) {
                    c11144d0.m34642r(6);
                    return;
                } else {
                    if (m34632h != 6 && m34632h != 7) {
                        throw new IllegalStateException();
                    }
                    c11144d0.m34642r(1);
                    return;
                }
            }
            i10 = 9;
        }
        c11144d0.m34642r(i10);
    }

    /* renamed from: j */
    private int m24326j(C11144d0 c11144d0) {
        int m34632h;
        if (this.f19156o != 0) {
            throw C11005b3.m33715a(null, null);
        }
        int i10 = 0;
        do {
            m34632h = c11144d0.m34632h(8);
            i10 += m34632h;
        } while (m34632h == 255);
        return i10;
    }

    /* renamed from: k */
    private void m24327k(C11144d0 c11144d0, int i10) {
        int m34629e = c11144d0.m34629e();
        if ((m34629e & 7) == 0) {
            this.f19143b.m34677U(m34629e >> 3);
        } else {
            c11144d0.m34633i(this.f19143b.m34682e(), 0, i10 * 8);
            this.f19143b.m34677U(0);
        }
        this.f19145d.m41511a(this.f19143b, i10);
        long j10 = this.f19152k;
        if (j10 != -9223372036854775807L) {
            this.f19145d.mo331b(j10, 1, i10, 0, null);
            this.f19152k += this.f19160s;
        }
    }

    /* renamed from: l */
    private void m24328l(C11144d0 c11144d0) {
        boolean m34631g;
        int m34632h = c11144d0.m34632h(1);
        int m34632h2 = m34632h == 1 ? c11144d0.m34632h(1) : 0;
        this.f19154m = m34632h2;
        if (m34632h2 != 0) {
            throw C11005b3.m33715a(null, null);
        }
        if (m34632h == 1) {
            m24322a(c11144d0);
        }
        if (!c11144d0.m34631g()) {
            throw C11005b3.m33715a(null, null);
        }
        this.f19155n = c11144d0.m34632h(6);
        int m34632h3 = c11144d0.m34632h(4);
        int m34632h4 = c11144d0.m34632h(3);
        if (m34632h3 != 0 || m34632h4 != 0) {
            throw C11005b3.m33715a(null, null);
        }
        if (m34632h == 0) {
            int m34629e = c11144d0.m34629e();
            int m24324h = m24324h(c11144d0);
            c11144d0.m34640p(m34629e);
            byte[] bArr = new byte[(m24324h + 7) / 8];
            c11144d0.m34633i(bArr, 0, m24324h);
            C11108u1 m34526G = new C11108u1.b().m34540U(this.f19146e).m34552g0("audio/mp4a-latm").m34530K(this.f19162u).m34529J(this.f19161t).m34553h0(this.f19159r).m34541V(Collections.singletonList(bArr)).m34543X(this.f19142a).m34526G();
            if (!m34526G.equals(this.f19147f)) {
                this.f19147f = m34526G;
                this.f19160s = 1024000000 / m34526G.f28777K;
                this.f19145d.mo332c(m34526G);
            }
        } else {
            c11144d0.m34642r(((int) m24322a(c11144d0)) - m24324h(c11144d0));
        }
        m24325i(c11144d0);
        boolean m34631g2 = c11144d0.m34631g();
        this.f19157p = m34631g2;
        this.f19158q = 0L;
        if (m34631g2) {
            if (m34632h == 1) {
                this.f19158q = m24322a(c11144d0);
            }
            do {
                m34631g = c11144d0.m34631g();
                this.f19158q = (this.f19158q << 8) + c11144d0.m34632h(8);
            } while (m34631g);
        }
        if (c11144d0.m34631g()) {
            c11144d0.m34642r(8);
        }
    }

    /* renamed from: m */
    private void m24329m(int i10) {
        this.f19143b.m34673Q(i10);
        this.f19144c.m34638n(this.f19143b.m34682e());
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        C11137a.m34607i(this.f19145d);
        while (c11146e0.m34679a() > 0) {
            int i10 = this.f19148g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int m34664H = c11146e0.m34664H();
                    if ((m34664H & 224) == 224) {
                        this.f19151j = m34664H;
                        this.f19148g = 2;
                    } else if (m34664H != 86) {
                        this.f19148g = 0;
                    }
                } else if (i10 == 2) {
                    int m34664H2 = ((this.f19151j & (-225)) << 8) | c11146e0.m34664H();
                    this.f19150i = m34664H2;
                    if (m34664H2 > this.f19143b.m34682e().length) {
                        m24329m(this.f19150i);
                    }
                    this.f19149h = 0;
                    this.f19148g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c11146e0.m34679a(), this.f19150i - this.f19149h);
                    c11146e0.m34688l(this.f19144c.f28941a, this.f19149h, min);
                    int i11 = this.f19149h + min;
                    this.f19149h = i11;
                    if (i11 == this.f19150i) {
                        this.f19144c.m34640p(0);
                        m24323g(this.f19144c);
                        this.f19148g = 0;
                    }
                }
            } else if (c11146e0.m34664H() == 86) {
                this.f19148g = 1;
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f19148g = 0;
        this.f19152k = -9223372036854775807L;
        this.f19153l = false;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f19145d = interfaceC12623m.mo308d(dVar.m24265c(), 1);
        this.f19146e = dVar.m24264b();
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f19152k = j10;
        }
    }
}
