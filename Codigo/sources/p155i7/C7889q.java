package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collections;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11145e;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11179x;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.q */
/* loaded from: classes.dex */
public final class C7889q implements InterfaceC7885m {

    /* renamed from: a */
    private final C7869d0 f19109a;

    /* renamed from: b */
    private String f19110b;

    /* renamed from: c */
    private InterfaceC12609b0 f19111c;

    /* renamed from: d */
    private a f19112d;

    /* renamed from: e */
    private boolean f19113e;

    /* renamed from: l */
    private long f19120l;

    /* renamed from: f */
    private final boolean[] f19114f = new boolean[3];

    /* renamed from: g */
    private final C7893u f19115g = new C7893u(32, RecognitionOptions.ITF);

    /* renamed from: h */
    private final C7893u f19116h = new C7893u(33, RecognitionOptions.ITF);

    /* renamed from: i */
    private final C7893u f19117i = new C7893u(34, RecognitionOptions.ITF);

    /* renamed from: j */
    private final C7893u f19118j = new C7893u(39, RecognitionOptions.ITF);

    /* renamed from: k */
    private final C7893u f19119k = new C7893u(40, RecognitionOptions.ITF);

    /* renamed from: m */
    private long f19121m = -9223372036854775807L;

    /* renamed from: n */
    private final C11146e0 f19122n = new C11146e0();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC12609b0 f19123a;

        /* renamed from: b */
        private long f19124b;

        /* renamed from: c */
        private boolean f19125c;

        /* renamed from: d */
        private int f19126d;

        /* renamed from: e */
        private long f19127e;

        /* renamed from: f */
        private boolean f19128f;

        /* renamed from: g */
        private boolean f19129g;

        /* renamed from: h */
        private boolean f19130h;

        /* renamed from: i */
        private boolean f19131i;

        /* renamed from: j */
        private boolean f19132j;

        /* renamed from: k */
        private long f19133k;

        /* renamed from: l */
        private long f19134l;

        /* renamed from: m */
        private boolean f19135m;

        public a(InterfaceC12609b0 interfaceC12609b0) {
            this.f19123a = interfaceC12609b0;
        }

        /* renamed from: b */
        private static boolean m24315b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        /* renamed from: c */
        private static boolean m24316c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        /* renamed from: d */
        private void m24317d(int i10) {
            long j10 = this.f19134l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f19135m;
            this.f19123a.mo331b(j10, z10 ? 1 : 0, (int) (this.f19124b - this.f19133k), i10, null);
        }

        /* renamed from: a */
        public void m24318a(long j10, int i10, boolean z10) {
            if (this.f19132j && this.f19129g) {
                this.f19135m = this.f19125c;
                this.f19132j = false;
            } else if (this.f19130h || this.f19129g) {
                if (z10 && this.f19131i) {
                    m24317d(i10 + ((int) (j10 - this.f19124b)));
                }
                this.f19133k = this.f19124b;
                this.f19134l = this.f19127e;
                this.f19135m = this.f19125c;
                this.f19131i = true;
            }
        }

        /* renamed from: e */
        public void m24319e(byte[] bArr, int i10, int i11) {
            if (this.f19128f) {
                int i12 = this.f19126d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f19126d = i12 + (i11 - i10);
                } else {
                    this.f19129g = (bArr[i13] & 128) != 0;
                    this.f19128f = false;
                }
            }
        }

        /* renamed from: f */
        public void m24320f() {
            this.f19128f = false;
            this.f19129g = false;
            this.f19130h = false;
            this.f19131i = false;
            this.f19132j = false;
        }

        /* renamed from: g */
        public void m24321g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f19129g = false;
            this.f19130h = false;
            this.f19127e = j11;
            this.f19126d = 0;
            this.f19124b = j10;
            if (!m24316c(i11)) {
                if (this.f19131i && !this.f19132j) {
                    if (z10) {
                        m24317d(i10);
                    }
                    this.f19131i = false;
                }
                if (m24315b(i11)) {
                    this.f19130h = !this.f19132j;
                    this.f19132j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f19125c = z11;
            this.f19128f = z11 || i11 <= 9;
        }
    }

    public C7889q(C7869d0 c7869d0) {
        this.f19109a = c7869d0;
    }

    /* renamed from: a */
    private void m24310a() {
        C11137a.m34607i(this.f19111c);
        C11172r0.m34928j(this.f19112d);
    }

    /* renamed from: g */
    private void m24311g(long j10, int i10, int i11, long j11) {
        this.f19112d.m24318a(j10, i10, this.f19113e);
        if (!this.f19113e) {
            this.f19115g.m24334b(i11);
            this.f19116h.m24334b(i11);
            this.f19117i.m24334b(i11);
            if (this.f19115g.m24335c() && this.f19116h.m24335c() && this.f19117i.m24335c()) {
                this.f19111c.mo332c(m24313i(this.f19110b, this.f19115g, this.f19116h, this.f19117i));
                this.f19113e = true;
            }
        }
        if (this.f19118j.m24334b(i11)) {
            C7893u c7893u = this.f19118j;
            this.f19122n.m34675S(this.f19118j.f19178d, C11179x.m35030q(c7893u.f19178d, c7893u.f19179e));
            this.f19122n.m34678V(5);
            this.f19109a.m24194a(j11, this.f19122n);
        }
        if (this.f19119k.m24334b(i11)) {
            C7893u c7893u2 = this.f19119k;
            this.f19122n.m34675S(this.f19119k.f19178d, C11179x.m35030q(c7893u2.f19178d, c7893u2.f19179e));
            this.f19122n.m34678V(5);
            this.f19109a.m24194a(j11, this.f19122n);
        }
    }

    /* renamed from: h */
    private void m24312h(byte[] bArr, int i10, int i11) {
        this.f19112d.m24319e(bArr, i10, i11);
        if (!this.f19113e) {
            this.f19115g.m24333a(bArr, i10, i11);
            this.f19116h.m24333a(bArr, i10, i11);
            this.f19117i.m24333a(bArr, i10, i11);
        }
        this.f19118j.m24333a(bArr, i10, i11);
        this.f19119k.m24333a(bArr, i10, i11);
    }

    /* renamed from: i */
    private static C11108u1 m24313i(String str, C7893u c7893u, C7893u c7893u2, C7893u c7893u3) {
        int i10 = c7893u.f19179e;
        byte[] bArr = new byte[c7893u2.f19179e + i10 + c7893u3.f19179e];
        System.arraycopy(c7893u.f19178d, 0, bArr, 0, i10);
        System.arraycopy(c7893u2.f19178d, 0, bArr, c7893u.f19179e, c7893u2.f19179e);
        System.arraycopy(c7893u3.f19178d, 0, bArr, c7893u.f19179e + c7893u2.f19179e, c7893u3.f19179e);
        C11179x.a m35021h = C11179x.m35021h(c7893u2.f19178d, 3, c7893u2.f19179e);
        return new C11108u1.b().m34540U(str).m34552g0("video/hevc").m34530K(C11145e.m34646c(m35021h.f29073a, m35021h.f29074b, m35021h.f29075c, m35021h.f29076d, m35021h.f29077e, m35021h.f29078f)).m34559n0(m35021h.f29080h).m34538S(m35021h.f29081i).m34548c0(m35021h.f29082j).m34541V(Collections.singletonList(bArr)).m34526G();
    }

    /* renamed from: j */
    private void m24314j(long j10, int i10, int i11, long j11) {
        this.f19112d.m24321g(j10, i10, i11, j11, this.f19113e);
        if (!this.f19113e) {
            this.f19115g.m24337e(i11);
            this.f19116h.m24337e(i11);
            this.f19117i.m24337e(i11);
        }
        this.f19118j.m24337e(i11);
        this.f19119k.m24337e(i11);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        m24310a();
        while (c11146e0.m34679a() > 0) {
            int m34683f = c11146e0.m34683f();
            int m34684g = c11146e0.m34684g();
            byte[] m34682e = c11146e0.m34682e();
            this.f19120l += c11146e0.m34679a();
            this.f19111c.m41511a(c11146e0, c11146e0.m34679a());
            while (m34683f < m34684g) {
                int m35016c = C11179x.m35016c(m34682e, m34683f, m34684g, this.f19114f);
                if (m35016c == m34684g) {
                    m24312h(m34682e, m34683f, m34684g);
                    return;
                }
                int m35018e = C11179x.m35018e(m34682e, m35016c);
                int i10 = m35016c - m34683f;
                if (i10 > 0) {
                    m24312h(m34682e, m34683f, m35016c);
                }
                int i11 = m34684g - m35016c;
                long j10 = this.f19120l - i11;
                m24311g(j10, i11, i10 < 0 ? -i10 : 0, this.f19121m);
                m24314j(j10, i11, m35018e, this.f19121m);
                m34683f = m35016c + 3;
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f19120l = 0L;
        this.f19121m = -9223372036854775807L;
        C11179x.m35014a(this.f19114f);
        this.f19115g.m24336d();
        this.f19116h.m24336d();
        this.f19117i.m24336d();
        this.f19118j.m24336d();
        this.f19119k.m24336d();
        a aVar = this.f19112d;
        if (aVar != null) {
            aVar.m24320f();
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f19110b = dVar.m24264b();
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 2);
        this.f19111c = mo308d;
        this.f19112d = new a(mo308d);
        this.f19109a.m24195b(interfaceC12623m, dVar);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f19121m = j10;
        }
    }
}
