package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Collections;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p396v6.C11631a;
import p459y6.C12620j;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.i */
/* loaded from: classes.dex */
public final class C7878i implements InterfaceC7885m {

    /* renamed from: v */
    private static final byte[] f18957v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f18958a;

    /* renamed from: b */
    private final C11144d0 f18959b;

    /* renamed from: c */
    private final C11146e0 f18960c;

    /* renamed from: d */
    private final String f18961d;

    /* renamed from: e */
    private String f18962e;

    /* renamed from: f */
    private InterfaceC12609b0 f18963f;

    /* renamed from: g */
    private InterfaceC12609b0 f18964g;

    /* renamed from: h */
    private int f18965h;

    /* renamed from: i */
    private int f18966i;

    /* renamed from: j */
    private int f18967j;

    /* renamed from: k */
    private boolean f18968k;

    /* renamed from: l */
    private boolean f18969l;

    /* renamed from: m */
    private int f18970m;

    /* renamed from: n */
    private int f18971n;

    /* renamed from: o */
    private int f18972o;

    /* renamed from: p */
    private boolean f18973p;

    /* renamed from: q */
    private long f18974q;

    /* renamed from: r */
    private int f18975r;

    /* renamed from: s */
    private long f18976s;

    /* renamed from: t */
    private InterfaceC12609b0 f18977t;

    /* renamed from: u */
    private long f18978u;

    public C7878i(boolean z10) {
        this(z10, null);
    }

    public C7878i(boolean z10, String str) {
        this.f18959b = new C11144d0(new byte[7]);
        this.f18960c = new C11146e0(Arrays.copyOf(f18957v, 10));
        m24254s();
        this.f18970m = -1;
        this.f18971n = -1;
        this.f18974q = -9223372036854775807L;
        this.f18976s = -9223372036854775807L;
        this.f18958a = z10;
        this.f18961d = str;
    }

    /* renamed from: a */
    private void m24242a() {
        C11137a.m34603e(this.f18963f);
        C11172r0.m34928j(this.f18977t);
        C11172r0.m34928j(this.f18964g);
    }

    /* renamed from: g */
    private void m24243g(C11146e0 c11146e0) {
        if (c11146e0.m34679a() == 0) {
            return;
        }
        this.f18959b.f28941a[0] = c11146e0.m34682e()[c11146e0.m34683f()];
        this.f18959b.m34640p(2);
        int m34632h = this.f18959b.m34632h(4);
        int i10 = this.f18971n;
        if (i10 != -1 && m34632h != i10) {
            m24252q();
            return;
        }
        if (!this.f18969l) {
            this.f18969l = true;
            this.f18970m = this.f18972o;
            this.f18971n = m34632h;
        }
        m24255t();
    }

    /* renamed from: h */
    private boolean m24244h(C11146e0 c11146e0, int i10) {
        c11146e0.m34677U(i10 + 1);
        if (!m24258w(c11146e0, this.f18959b.f28941a, 1)) {
            return false;
        }
        this.f18959b.m34640p(4);
        int m34632h = this.f18959b.m34632h(1);
        int i11 = this.f18970m;
        if (i11 != -1 && m34632h != i11) {
            return false;
        }
        if (this.f18971n != -1) {
            if (!m24258w(c11146e0, this.f18959b.f28941a, 1)) {
                return true;
            }
            this.f18959b.m34640p(2);
            if (this.f18959b.m34632h(4) != this.f18971n) {
                return false;
            }
            c11146e0.m34677U(i10 + 2);
        }
        if (!m24258w(c11146e0, this.f18959b.f28941a, 4)) {
            return true;
        }
        this.f18959b.m34640p(14);
        int m34632h2 = this.f18959b.m34632h(13);
        if (m34632h2 < 7) {
            return false;
        }
        byte[] m34682e = c11146e0.m34682e();
        int m34684g = c11146e0.m34684g();
        int i12 = i10 + m34632h2;
        if (i12 >= m34684g) {
            return true;
        }
        byte b10 = m34682e[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == m34684g) {
                return true;
            }
            return m24247l((byte) -1, m34682e[i13]) && ((m34682e[i13] & 8) >> 3) == m34632h;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == m34684g) {
            return true;
        }
        if (m34682e[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == m34684g || m34682e[i15] == 51;
    }

    /* renamed from: i */
    private boolean m24245i(C11146e0 c11146e0, byte[] bArr, int i10) {
        int min = Math.min(c11146e0.m34679a(), i10 - this.f18966i);
        c11146e0.m34688l(bArr, this.f18966i, min);
        int i11 = this.f18966i + min;
        this.f18966i = i11;
        return i11 == i10;
    }

    /* renamed from: j */
    private void m24246j(C11146e0 c11146e0) {
        int i10;
        byte[] m34682e = c11146e0.m34682e();
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        while (m34683f < m34684g) {
            int i11 = m34683f + 1;
            int i12 = m34682e[m34683f] & 255;
            if (this.f18967j == 512 && m24247l((byte) -1, (byte) i12) && (this.f18969l || m24244h(c11146e0, i11 - 2))) {
                this.f18972o = (i12 & 8) >> 3;
                this.f18968k = (i12 & 1) == 0;
                if (this.f18969l) {
                    m24255t();
                } else {
                    m24253r();
                }
                c11146e0.m34677U(i11);
                return;
            }
            int i13 = this.f18967j;
            int i14 = i12 | i13;
            if (i14 != 329) {
                if (i14 == 511) {
                    this.f18967j = RecognitionOptions.UPC_A;
                } else if (i14 == 836) {
                    i10 = RecognitionOptions.UPC_E;
                } else if (i14 == 1075) {
                    m24256u();
                    c11146e0.m34677U(i11);
                    return;
                } else if (i13 != 256) {
                    this.f18967j = RecognitionOptions.QR_CODE;
                    i11--;
                }
                m34683f = i11;
            } else {
                i10 = 768;
            }
            this.f18967j = i10;
            m34683f = i11;
        }
        c11146e0.m34677U(m34683f);
    }

    /* renamed from: l */
    private boolean m24247l(byte b10, byte b11) {
        return m24248m(((b10 & 255) << 8) | (b11 & 255));
    }

    /* renamed from: m */
    public static boolean m24248m(int i10) {
        return (i10 & 65526) == 65520;
    }

    /* renamed from: n */
    private void m24249n() {
        this.f18959b.m34640p(0);
        if (this.f18973p) {
            this.f18959b.m34642r(10);
        } else {
            int m34632h = this.f18959b.m34632h(2) + 1;
            if (m34632h != 2) {
                C11173s.m34970i("AdtsReader", "Detected audio object type: " + m34632h + ", but assuming AAC LC.");
                m34632h = 2;
            }
            this.f18959b.m34642r(5);
            byte[] m36458b = C11631a.m36458b(m34632h, this.f18971n, this.f18959b.m34632h(3));
            C11631a.b m36462f = C11631a.m36462f(m36458b);
            C11108u1 m34526G = new C11108u1.b().m34540U(this.f18962e).m34552g0("audio/mp4a-latm").m34530K(m36462f.f30266c).m34529J(m36462f.f30265b).m34553h0(m36462f.f30264a).m34541V(Collections.singletonList(m36458b)).m34543X(this.f18961d).m34526G();
            this.f18974q = 1024000000 / m34526G.f28777K;
            this.f18963f.mo332c(m34526G);
            this.f18973p = true;
        }
        this.f18959b.m34642r(4);
        int m34632h2 = (this.f18959b.m34632h(13) - 2) - 5;
        if (this.f18968k) {
            m34632h2 -= 2;
        }
        m24257v(this.f18963f, this.f18974q, 0, m34632h2);
    }

    /* renamed from: o */
    private void m24250o() {
        this.f18964g.m41511a(this.f18960c, 10);
        this.f18960c.m34677U(6);
        m24257v(this.f18964g, 0L, 10, this.f18960c.m34663G() + 10);
    }

    /* renamed from: p */
    private void m24251p(C11146e0 c11146e0) {
        int min = Math.min(c11146e0.m34679a(), this.f18975r - this.f18966i);
        this.f18977t.m41511a(c11146e0, min);
        int i10 = this.f18966i + min;
        this.f18966i = i10;
        int i11 = this.f18975r;
        if (i10 == i11) {
            long j10 = this.f18976s;
            if (j10 != -9223372036854775807L) {
                this.f18977t.mo331b(j10, 1, i11, 0, null);
                this.f18976s += this.f18978u;
            }
            m24254s();
        }
    }

    /* renamed from: q */
    private void m24252q() {
        this.f18969l = false;
        m24254s();
    }

    /* renamed from: r */
    private void m24253r() {
        this.f18965h = 1;
        this.f18966i = 0;
    }

    /* renamed from: s */
    private void m24254s() {
        this.f18965h = 0;
        this.f18966i = 0;
        this.f18967j = RecognitionOptions.QR_CODE;
    }

    /* renamed from: t */
    private void m24255t() {
        this.f18965h = 3;
        this.f18966i = 0;
    }

    /* renamed from: u */
    private void m24256u() {
        this.f18965h = 2;
        this.f18966i = f18957v.length;
        this.f18975r = 0;
        this.f18960c.m34677U(0);
    }

    /* renamed from: v */
    private void m24257v(InterfaceC12609b0 interfaceC12609b0, long j10, int i10, int i11) {
        this.f18965h = 4;
        this.f18966i = i10;
        this.f18977t = interfaceC12609b0;
        this.f18978u = j10;
        this.f18975r = i11;
    }

    /* renamed from: w */
    private boolean m24258w(C11146e0 c11146e0, byte[] bArr, int i10) {
        if (c11146e0.m34679a() < i10) {
            return false;
        }
        c11146e0.m34688l(bArr, 0, i10);
        return true;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        m24242a();
        while (c11146e0.m34679a() > 0) {
            int i10 = this.f18965h;
            if (i10 == 0) {
                m24246j(c11146e0);
            } else if (i10 == 1) {
                m24243g(c11146e0);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (m24245i(c11146e0, this.f18959b.f28941a, this.f18968k ? 7 : 5)) {
                        m24249n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    m24251p(c11146e0);
                }
            } else if (m24245i(c11146e0, this.f18960c.m34682e(), 10)) {
                m24250o();
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f18976s = -9223372036854775807L;
        m24252q();
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f18962e = dVar.m24264b();
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 1);
        this.f18963f = mo308d;
        this.f18977t = mo308d;
        if (!this.f18958a) {
            this.f18964g = new C12620j();
            return;
        }
        dVar.m24263a();
        InterfaceC12609b0 mo308d2 = interfaceC12623m.mo308d(dVar.m24265c(), 5);
        this.f18964g = mo308d2;
        mo308d2.mo332c(new C11108u1.b().m34540U(dVar.m24264b()).m34552g0("application/id3").m34526G());
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f18976s = j10;
        }
    }

    /* renamed from: k */
    public long m24259k() {
        return this.f18974q;
    }
}
