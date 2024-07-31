package p025b7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import p216l7.C9400a;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p459y6.C12627q;
import p459y6.C12628r;
import p459y6.C12629s;
import p459y6.C12630t;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: b7.d */
/* loaded from: classes.dex */
public final class C1670d implements InterfaceC12621k {

    /* renamed from: o */
    public static final InterfaceC12626p f7065o = new InterfaceC12626p() { // from class: b7.c
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m9159j;
            m9159j = C1670d.m9159j();
            return m9159j;
        }
    };

    /* renamed from: a */
    private final byte[] f7066a;

    /* renamed from: b */
    private final C11146e0 f7067b;

    /* renamed from: c */
    private final boolean f7068c;

    /* renamed from: d */
    private final C12627q.a f7069d;

    /* renamed from: e */
    private InterfaceC12623m f7070e;

    /* renamed from: f */
    private InterfaceC12609b0 f7071f;

    /* renamed from: g */
    private int f7072g;

    /* renamed from: h */
    private C9400a f7073h;

    /* renamed from: i */
    private C12630t f7074i;

    /* renamed from: j */
    private int f7075j;

    /* renamed from: k */
    private int f7076k;

    /* renamed from: l */
    private C1668b f7077l;

    /* renamed from: m */
    private int f7078m;

    /* renamed from: n */
    private long f7079n;

    public C1670d() {
        this(0);
    }

    public C1670d(int i10) {
        this.f7066a = new byte[42];
        this.f7067b = new C11146e0(new byte[RecognitionOptions.TEZ_CODE], 0);
        this.f7068c = (i10 & 1) != 0;
        this.f7069d = new C12627q.a();
        this.f7072g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5.m34677U(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r4.f7069d.f34304a;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long m9155d(p363t8.C11146e0 r5, boolean r6) {
        /*
            r4 = this;
            y6.t r0 = r4.f7074i
            p363t8.C11137a.m34603e(r0)
            int r0 = r5.m34683f()
        L9:
            int r1 = r5.m34684g()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.m34677U(r0)
            y6.t r1 = r4.f7074i
            int r2 = r4.f7076k
            y6.q$a r3 = r4.f7069d
            boolean r1 = p459y6.C12627q.m41574d(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.m34677U(r0)
            y6.q$a r5 = r4.f7069d
            long r5 = r5.f34304a
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L60
        L2d:
            int r6 = r5.m34684g()
            int r1 = r4.f7075j
            int r6 = r6 - r1
            if (r0 > r6) goto L58
            r5.m34677U(r0)
            r6 = 0
            y6.t r1 = r4.f7074i     // Catch: java.lang.IndexOutOfBoundsException -> L45
            int r2 = r4.f7076k     // Catch: java.lang.IndexOutOfBoundsException -> L45
            y6.q$a r3 = r4.f7069d     // Catch: java.lang.IndexOutOfBoundsException -> L45
            boolean r1 = p459y6.C12627q.m41574d(r5, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45
            goto L46
        L45:
            r1 = r6
        L46:
            int r2 = r5.m34683f()
            int r3 = r5.m34684g()
            if (r2 <= r3) goto L51
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L55
            goto L20
        L55:
            int r0 = r0 + 1
            goto L2d
        L58:
            int r6 = r5.m34684g()
            r5.m34677U(r6)
            goto L63
        L60:
            r5.m34677U(r0)
        L63:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p025b7.C1670d.m9155d(t8.e0, boolean):long");
    }

    /* renamed from: g */
    private void m9156g(InterfaceC12622l interfaceC12622l) {
        this.f7076k = C12628r.m41582b(interfaceC12622l);
        ((InterfaceC12623m) C11172r0.m34928j(this.f7070e)).mo323p(m9157h(interfaceC12622l.getPosition(), interfaceC12622l.getLength()));
        this.f7072g = 5;
    }

    /* renamed from: h */
    private InterfaceC12636z m9157h(long j10, long j11) {
        C11137a.m34603e(this.f7074i);
        C12630t c12630t = this.f7074i;
        if (c12630t.f34318k != null) {
            return new C12629s(c12630t, j10);
        }
        if (j11 == -1 || c12630t.f34317j <= 0) {
            return new InterfaceC12636z.b(c12630t.m41598f());
        }
        C1668b c1668b = new C1668b(c12630t, this.f7076k, j10, j11);
        this.f7077l = c1668b;
        return c1668b.m41472b();
    }

    /* renamed from: i */
    private void m9158i(InterfaceC12622l interfaceC12622l) {
        byte[] bArr = this.f7066a;
        interfaceC12622l.mo41540q(bArr, 0, bArr.length);
        interfaceC12622l.mo41534f();
        this.f7072g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ InterfaceC12621k[] m9159j() {
        return new InterfaceC12621k[]{new C1670d()};
    }

    /* renamed from: k */
    private void m9160k() {
        ((InterfaceC12609b0) C11172r0.m34928j(this.f7071f)).mo331b((this.f7079n * 1000000) / ((C12630t) C11172r0.m34928j(this.f7074i)).f34312e, 1, this.f7078m, 0, null);
    }

    /* renamed from: l */
    private int m9161l(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        boolean z10;
        C11137a.m34603e(this.f7071f);
        C11137a.m34603e(this.f7074i);
        C1668b c1668b = this.f7077l;
        if (c1668b != null && c1668b.m41474d()) {
            return this.f7077l.m41473c(interfaceC12622l, c12635y);
        }
        if (this.f7079n == -1) {
            this.f7079n = C12627q.m41579i(interfaceC12622l, this.f7074i);
            return 0;
        }
        int m34684g = this.f7067b.m34684g();
        if (m34684g < 32768) {
            int read = interfaceC12622l.read(this.f7067b.m34682e(), m34684g, RecognitionOptions.TEZ_CODE - m34684g);
            z10 = read == -1;
            if (!z10) {
                this.f7067b.m34676T(m34684g + read);
            } else if (this.f7067b.m34679a() == 0) {
                m9160k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int m34683f = this.f7067b.m34683f();
        int i10 = this.f7078m;
        int i11 = this.f7075j;
        if (i10 < i11) {
            C11146e0 c11146e0 = this.f7067b;
            c11146e0.m34678V(Math.min(i11 - i10, c11146e0.m34679a()));
        }
        long m9155d = m9155d(this.f7067b, z10);
        int m34683f2 = this.f7067b.m34683f() - m34683f;
        this.f7067b.m34677U(m34683f);
        this.f7071f.m41511a(this.f7067b, m34683f2);
        this.f7078m += m34683f2;
        if (m9155d != -1) {
            m9160k();
            this.f7078m = 0;
            this.f7079n = m9155d;
        }
        if (this.f7067b.m34679a() < 16) {
            int m34679a = this.f7067b.m34679a();
            System.arraycopy(this.f7067b.m34682e(), this.f7067b.m34683f(), this.f7067b.m34682e(), 0, m34679a);
            this.f7067b.m34677U(0);
            this.f7067b.m34676T(m34679a);
        }
        return 0;
    }

    /* renamed from: m */
    private void m9162m(InterfaceC12622l interfaceC12622l) {
        this.f7073h = C12628r.m41584d(interfaceC12622l, !this.f7068c);
        this.f7072g = 1;
    }

    /* renamed from: n */
    private void m9163n(InterfaceC12622l interfaceC12622l) {
        C12628r.a aVar = new C12628r.a(this.f7074i);
        boolean z10 = false;
        while (!z10) {
            z10 = C12628r.m41585e(interfaceC12622l, aVar);
            this.f7074i = (C12630t) C11172r0.m34928j(aVar.f34305a);
        }
        C11137a.m34603e(this.f7074i);
        this.f7075j = Math.max(this.f7074i.f34310c, 6);
        ((InterfaceC12609b0) C11172r0.m34928j(this.f7071f)).mo332c(this.f7074i.m41599g(this.f7066a, this.f7073h));
        this.f7072g = 4;
    }

    /* renamed from: o */
    private void m9164o(InterfaceC12622l interfaceC12622l) {
        C12628r.m41589i(interfaceC12622l);
        this.f7072g = 3;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        if (j10 == 0) {
            this.f7072g = 0;
        } else {
            C1668b c1668b = this.f7077l;
            if (c1668b != null) {
                c1668b.m41478h(j11);
            }
        }
        this.f7079n = j11 != 0 ? -1L : 0L;
        this.f7078m = 0;
        this.f7067b.m34673Q(0);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f7070e = interfaceC12623m;
        this.f7071f = interfaceC12623m.mo308d(0, 1);
        interfaceC12623m.mo324q();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        C12628r.m41583c(interfaceC12622l, false);
        return C12628r.m41581a(interfaceC12622l);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int i10 = this.f7072g;
        if (i10 == 0) {
            m9162m(interfaceC12622l);
            return 0;
        }
        if (i10 == 1) {
            m9158i(interfaceC12622l);
            return 0;
        }
        if (i10 == 2) {
            m9164o(interfaceC12622l);
            return 0;
        }
        if (i10 == 3) {
            m9163n(interfaceC12622l);
            return 0;
        }
        if (i10 == 4) {
            m9156g(interfaceC12622l);
            return 0;
        }
        if (i10 == 5) {
            return m9161l(interfaceC12622l, c12635y);
        }
        throw new IllegalStateException();
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
