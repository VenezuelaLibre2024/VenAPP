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
import p363t8.C11179x;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.o */
/* loaded from: classes.dex */
public final class C7887o implements InterfaceC7885m {

    /* renamed from: l */
    private static final float[] f19034l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C7883k0 f19035a;

    /* renamed from: b */
    private final C11146e0 f19036b;

    /* renamed from: e */
    private final C7893u f19039e;

    /* renamed from: f */
    private b f19040f;

    /* renamed from: g */
    private long f19041g;

    /* renamed from: h */
    private String f19042h;

    /* renamed from: i */
    private InterfaceC12609b0 f19043i;

    /* renamed from: j */
    private boolean f19044j;

    /* renamed from: c */
    private final boolean[] f19037c = new boolean[4];

    /* renamed from: d */
    private final a f19038d = new a(RecognitionOptions.ITF);

    /* renamed from: k */
    private long f19045k = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7.o$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f */
        private static final byte[] f19046f = {0, 0, 1};

        /* renamed from: a */
        private boolean f19047a;

        /* renamed from: b */
        private int f19048b;

        /* renamed from: c */
        public int f19049c;

        /* renamed from: d */
        public int f19050d;

        /* renamed from: e */
        public byte[] f19051e;

        public a(int i10) {
            this.f19051e = new byte[i10];
        }

        /* renamed from: a */
        public void m24285a(byte[] bArr, int i10, int i11) {
            if (this.f19047a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f19051e;
                int length = bArr2.length;
                int i13 = this.f19049c;
                if (length < i13 + i12) {
                    this.f19051e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f19051e, this.f19049c, i12);
                this.f19049c += i12;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        
            if (r9 != 181) goto L27;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m24286b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f19048b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L3f
                r7 = 3
                if (r0 == r4) goto L37
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L53
            L1d:
                int r9 = r8.f19049c
                int r9 = r9 - r10
                r8.f19049c = r9
                r8.f19047a = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L32
                goto L41
            L32:
                int r9 = r8.f19049c
                r8.f19050d = r9
                goto L48
            L37:
                r10 = 31
                if (r9 <= r10) goto L3c
                goto L41
            L3c:
                r8.f19048b = r7
                goto L53
            L3f:
                if (r9 == r3) goto L48
            L41:
                p363t8.C11173s.m34970i(r6, r5)
                r8.m24287c()
                goto L53
            L48:
                r8.f19048b = r4
                goto L53
            L4b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L53
                r8.f19048b = r2
                r8.f19047a = r2
            L53:
                byte[] r9 = p155i7.C7887o.a.f19046f
                int r10 = r9.length
                r8.m24285a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p155i7.C7887o.a.m24286b(int, int):boolean");
        }

        /* renamed from: c */
        public void m24287c() {
            this.f19047a = false;
            this.f19049c = 0;
            this.f19048b = 0;
        }
    }

    /* renamed from: i7.o$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        private final InterfaceC12609b0 f19052a;

        /* renamed from: b */
        private boolean f19053b;

        /* renamed from: c */
        private boolean f19054c;

        /* renamed from: d */
        private boolean f19055d;

        /* renamed from: e */
        private int f19056e;

        /* renamed from: f */
        private int f19057f;

        /* renamed from: g */
        private long f19058g;

        /* renamed from: h */
        private long f19059h;

        public b(InterfaceC12609b0 interfaceC12609b0) {
            this.f19052a = interfaceC12609b0;
        }

        /* renamed from: a */
        public void m24288a(byte[] bArr, int i10, int i11) {
            if (this.f19054c) {
                int i12 = this.f19057f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f19057f = i12 + (i11 - i10);
                } else {
                    this.f19055d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f19054c = false;
                }
            }
        }

        /* renamed from: b */
        public void m24289b(long j10, int i10, boolean z10) {
            if (this.f19056e == 182 && z10 && this.f19053b) {
                long j11 = this.f19059h;
                if (j11 != -9223372036854775807L) {
                    this.f19052a.mo331b(j11, this.f19055d ? 1 : 0, (int) (j10 - this.f19058g), i10, null);
                }
            }
            if (this.f19056e != 179) {
                this.f19058g = j10;
            }
        }

        /* renamed from: c */
        public void m24290c(int i10, long j10) {
            this.f19056e = i10;
            this.f19055d = false;
            this.f19053b = i10 == 182 || i10 == 179;
            this.f19054c = i10 == 182;
            this.f19057f = 0;
            this.f19059h = j10;
        }

        /* renamed from: d */
        public void m24291d() {
            this.f19053b = false;
            this.f19054c = false;
            this.f19055d = false;
            this.f19056e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7887o(C7883k0 c7883k0) {
        C11146e0 c11146e0;
        this.f19035a = c7883k0;
        if (c7883k0 != null) {
            this.f19039e = new C7893u(178, RecognitionOptions.ITF);
            c11146e0 = new C11146e0();
        } else {
            c11146e0 = null;
            this.f19039e = null;
        }
        this.f19036b = c11146e0;
    }

    /* renamed from: a */
    private static C11108u1 m24284a(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f19051e, aVar.f19049c);
        C11144d0 c11144d0 = new C11144d0(copyOf);
        c11144d0.m34643s(i10);
        c11144d0.m34643s(4);
        c11144d0.m34641q();
        c11144d0.m34642r(8);
        if (c11144d0.m34631g()) {
            c11144d0.m34642r(4);
            c11144d0.m34642r(3);
        }
        int m34632h = c11144d0.m34632h(4);
        float f10 = 1.0f;
        if (m34632h == 15) {
            int m34632h2 = c11144d0.m34632h(8);
            int m34632h3 = c11144d0.m34632h(8);
            if (m34632h3 != 0) {
                f10 = m34632h2 / m34632h3;
            }
            C11173s.m34970i("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f19034l;
            if (m34632h < fArr.length) {
                f10 = fArr[m34632h];
            }
            C11173s.m34970i("H263Reader", "Invalid aspect ratio");
        }
        if (c11144d0.m34631g()) {
            c11144d0.m34642r(2);
            c11144d0.m34642r(1);
            if (c11144d0.m34631g()) {
                c11144d0.m34642r(15);
                c11144d0.m34641q();
                c11144d0.m34642r(15);
                c11144d0.m34641q();
                c11144d0.m34642r(15);
                c11144d0.m34641q();
                c11144d0.m34642r(3);
                c11144d0.m34642r(11);
                c11144d0.m34641q();
                c11144d0.m34642r(15);
                c11144d0.m34641q();
            }
        }
        if (c11144d0.m34632h(2) != 0) {
            C11173s.m34970i("H263Reader", "Unhandled video object layer shape");
        }
        c11144d0.m34641q();
        int m34632h4 = c11144d0.m34632h(16);
        c11144d0.m34641q();
        if (c11144d0.m34631g()) {
            if (m34632h4 == 0) {
                C11173s.m34970i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = m34632h4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c11144d0.m34642r(i11);
            }
        }
        c11144d0.m34641q();
        int m34632h5 = c11144d0.m34632h(13);
        c11144d0.m34641q();
        int m34632h6 = c11144d0.m34632h(13);
        c11144d0.m34641q();
        c11144d0.m34641q();
        return new C11108u1.b().m34540U(str).m34552g0("video/mp4v-es").m34559n0(m34632h5).m34538S(m34632h6).m34548c0(f10).m34541V(Collections.singletonList(copyOf)).m34526G();
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        C11137a.m34607i(this.f19040f);
        C11137a.m34607i(this.f19043i);
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        byte[] m34682e = c11146e0.m34682e();
        this.f19041g += c11146e0.m34679a();
        this.f19043i.m41511a(c11146e0, c11146e0.m34679a());
        while (true) {
            int m35016c = C11179x.m35016c(m34682e, m34683f, m34684g, this.f19037c);
            if (m35016c == m34684g) {
                break;
            }
            int i10 = m35016c + 3;
            int i11 = c11146e0.m34682e()[i10] & 255;
            int i12 = m35016c - m34683f;
            int i13 = 0;
            if (!this.f19044j) {
                if (i12 > 0) {
                    this.f19038d.m24285a(m34682e, m34683f, m35016c);
                }
                if (this.f19038d.m24286b(i11, i12 < 0 ? -i12 : 0)) {
                    InterfaceC12609b0 interfaceC12609b0 = this.f19043i;
                    a aVar = this.f19038d;
                    interfaceC12609b0.mo332c(m24284a(aVar, aVar.f19050d, (String) C11137a.m34603e(this.f19042h)));
                    this.f19044j = true;
                }
            }
            this.f19040f.m24288a(m34682e, m34683f, m35016c);
            C7893u c7893u = this.f19039e;
            if (c7893u != null) {
                if (i12 > 0) {
                    c7893u.m24333a(m34682e, m34683f, m35016c);
                } else {
                    i13 = -i12;
                }
                if (this.f19039e.m24334b(i13)) {
                    C7893u c7893u2 = this.f19039e;
                    ((C11146e0) C11172r0.m34928j(this.f19036b)).m34675S(this.f19039e.f19178d, C11179x.m35030q(c7893u2.f19178d, c7893u2.f19179e));
                    ((C7883k0) C11172r0.m34928j(this.f19035a)).m24277a(this.f19045k, this.f19036b);
                }
                if (i11 == 178 && c11146e0.m34682e()[m35016c + 2] == 1) {
                    this.f19039e.m24337e(i11);
                }
            }
            int i14 = m34684g - m35016c;
            this.f19040f.m24289b(this.f19041g - i14, i14, this.f19044j);
            this.f19040f.m24290c(i11, this.f19045k);
            m34683f = i10;
        }
        if (!this.f19044j) {
            this.f19038d.m24285a(m34682e, m34683f, m34684g);
        }
        this.f19040f.m24288a(m34682e, m34683f, m34684g);
        C7893u c7893u3 = this.f19039e;
        if (c7893u3 != null) {
            c7893u3.m24333a(m34682e, m34683f, m34684g);
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        C11179x.m35014a(this.f19037c);
        this.f19038d.m24287c();
        b bVar = this.f19040f;
        if (bVar != null) {
            bVar.m24291d();
        }
        C7893u c7893u = this.f19039e;
        if (c7893u != null) {
            c7893u.m24336d();
        }
        this.f19041g = 0L;
        this.f19045k = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f19042h = dVar.m24264b();
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 2);
        this.f19043i = mo308d;
        this.f19040f = new b(mo308d);
        C7883k0 c7883k0 = this.f19035a;
        if (c7883k0 != null) {
            c7883k0.m24278b(interfaceC12623m, dVar);
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f19045k = j10;
        }
    }
}
