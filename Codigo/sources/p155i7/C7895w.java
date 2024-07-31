package p155i7;

import p155i7.InterfaceC7879i0;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11173s;
import p459y6.InterfaceC12623m;

/* renamed from: i7.w */
/* loaded from: classes.dex */
public final class C7895w implements InterfaceC7879i0 {

    /* renamed from: a */
    private final InterfaceC7885m f19183a;

    /* renamed from: b */
    private final C11144d0 f19184b = new C11144d0(new byte[10]);

    /* renamed from: c */
    private int f19185c = 0;

    /* renamed from: d */
    private int f19186d;

    /* renamed from: e */
    private C11164n0 f19187e;

    /* renamed from: f */
    private boolean f19188f;

    /* renamed from: g */
    private boolean f19189g;

    /* renamed from: h */
    private boolean f19190h;

    /* renamed from: i */
    private int f19191i;

    /* renamed from: j */
    private int f19192j;

    /* renamed from: k */
    private boolean f19193k;

    /* renamed from: l */
    private long f19194l;

    public C7895w(InterfaceC7885m interfaceC7885m) {
        this.f19183a = interfaceC7885m;
    }

    /* renamed from: d */
    private boolean m24339d(C11146e0 c11146e0, byte[] bArr, int i10) {
        int min = Math.min(c11146e0.m34679a(), i10 - this.f19186d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c11146e0.m34678V(min);
        } else {
            c11146e0.m34688l(bArr, this.f19186d, min);
        }
        int i11 = this.f19186d + min;
        this.f19186d = i11;
        return i11 == i10;
    }

    /* renamed from: e */
    private boolean m24340e() {
        this.f19184b.m34640p(0);
        int m34632h = this.f19184b.m34632h(24);
        if (m34632h != 1) {
            C11173s.m34970i("PesReader", "Unexpected start code prefix: " + m34632h);
            this.f19192j = -1;
            return false;
        }
        this.f19184b.m34642r(8);
        int m34632h2 = this.f19184b.m34632h(16);
        this.f19184b.m34642r(5);
        this.f19193k = this.f19184b.m34631g();
        this.f19184b.m34642r(2);
        this.f19188f = this.f19184b.m34631g();
        this.f19189g = this.f19184b.m34631g();
        this.f19184b.m34642r(6);
        int m34632h3 = this.f19184b.m34632h(8);
        this.f19191i = m34632h3;
        if (m34632h2 != 0) {
            int i10 = ((m34632h2 + 6) - 9) - m34632h3;
            this.f19192j = i10;
            if (i10 < 0) {
                C11173s.m34970i("PesReader", "Found negative packet payload size: " + this.f19192j);
            }
            return true;
        }
        this.f19192j = -1;
        return true;
    }

    /* renamed from: f */
    private void m24341f() {
        this.f19184b.m34640p(0);
        this.f19194l = -9223372036854775807L;
        if (this.f19188f) {
            this.f19184b.m34642r(4);
            this.f19184b.m34642r(1);
            this.f19184b.m34642r(1);
            long m34632h = (this.f19184b.m34632h(3) << 30) | (this.f19184b.m34632h(15) << 15) | this.f19184b.m34632h(15);
            this.f19184b.m34642r(1);
            if (!this.f19190h && this.f19189g) {
                this.f19184b.m34642r(4);
                this.f19184b.m34642r(1);
                this.f19184b.m34642r(1);
                this.f19184b.m34642r(1);
                this.f19187e.m34825b((this.f19184b.m34632h(3) << 30) | (this.f19184b.m34632h(15) << 15) | this.f19184b.m34632h(15));
                this.f19190h = true;
            }
            this.f19194l = this.f19187e.m34825b(m34632h);
        }
    }

    /* renamed from: g */
    private void m24342g(int i10) {
        this.f19185c = i10;
        this.f19186d = 0;
    }

    @Override // p155i7.InterfaceC7879i0
    /* renamed from: a */
    public void mo24191a(C11164n0 c11164n0, InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        this.f19187e = c11164n0;
        this.f19183a.mo24188d(interfaceC12623m, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:12:0x007c). Please report as a decompilation issue!!! */
    @Override // p155i7.InterfaceC7879i0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo24192b(p363t8.C11146e0 r8, int r9) {
        /*
            r7 = this;
            t8.n0 r0 = r7.f19187e
            p363t8.C11137a.m34607i(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L47
            int r0 = r7.f19185c
            if (r0 == 0) goto L44
            if (r0 == r4) goto L44
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L3f
            if (r0 != r2) goto L39
            int r0 = r7.f19192j
            if (r0 == r1) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f19192j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p363t8.C11173s.m34970i(r5, r0)
            goto L7c
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L3f:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            p363t8.C11173s.m34970i(r5, r0)
        L44:
            r7.m24342g(r4)
        L47:
            int r0 = r8.m34679a()
            if (r0 <= 0) goto Ld8
            int r0 = r7.f19185c
            if (r0 == 0) goto Lcf
            r5 = 0
            if (r0 == r4) goto Lb7
            if (r0 == r3) goto L88
            if (r0 != r2) goto L82
            int r0 = r8.m34679a()
            int r6 = r7.f19192j
            if (r6 != r1) goto L61
            goto L63
        L61:
            int r5 = r0 - r6
        L63:
            if (r5 <= 0) goto L6e
            int r0 = r0 - r5
            int r5 = r8.m34683f()
            int r5 = r5 + r0
            r8.m34676T(r5)
        L6e:
            i7.m r5 = r7.f19183a
            r5.mo24186b(r8)
            int r5 = r7.f19192j
            if (r5 == r1) goto L47
            int r5 = r5 - r0
            r7.f19192j = r5
            if (r5 != 0) goto L47
        L7c:
            i7.m r0 = r7.f19183a
            r0.mo24189e()
            goto L44
        L82:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L88:
            r0 = 10
            int r6 = r7.f19191i
            int r0 = java.lang.Math.min(r0, r6)
            t8.d0 r6 = r7.f19184b
            byte[] r6 = r6.f28941a
            boolean r0 = r7.m24339d(r8, r6, r0)
            if (r0 == 0) goto L47
            r0 = 0
            int r6 = r7.f19191i
            boolean r0 = r7.m24339d(r8, r0, r6)
            if (r0 == 0) goto L47
            r7.m24341f()
            boolean r0 = r7.f19193k
            if (r0 == 0) goto Lab
            r5 = 4
        Lab:
            r9 = r9 | r5
            i7.m r0 = r7.f19183a
            long r5 = r7.f19194l
            r0.mo24190f(r5, r9)
            r7.m24342g(r2)
            goto L47
        Lb7:
            t8.d0 r0 = r7.f19184b
            byte[] r0 = r0.f28941a
            r6 = 9
            boolean r0 = r7.m24339d(r8, r0, r6)
            if (r0 == 0) goto L47
            boolean r0 = r7.m24340e()
            if (r0 == 0) goto Lca
            r5 = r3
        Lca:
            r7.m24342g(r5)
            goto L47
        Lcf:
            int r0 = r8.m34679a()
            r8.m34678V(r0)
            goto L47
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155i7.C7895w.mo24192b(t8.e0, int):void");
    }

    @Override // p155i7.InterfaceC7879i0
    /* renamed from: c */
    public final void mo24193c() {
        this.f19185c = 0;
        this.f19186d = 0;
        this.f19190h = false;
        this.f19183a.mo24187c();
    }
}
