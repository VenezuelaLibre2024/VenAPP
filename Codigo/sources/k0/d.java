package k0;

import java.util.Arrays;
import java.util.HashMap;
import k0.i;
import n0.d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: r */
    public static boolean f20093r = false;

    /* renamed from: s */
    public static boolean f20094s = true;

    /* renamed from: t */
    public static boolean f20095t = true;

    /* renamed from: u */
    public static boolean f20096u = true;

    /* renamed from: v */
    public static boolean f20097v = false;

    /* renamed from: w */
    private static int f20098w = 1000;

    /* renamed from: x */
    public static long f20099x;

    /* renamed from: y */
    public static long f20100y;

    /* renamed from: d */
    private a f20104d;

    /* renamed from: g */
    k0.b[] f20107g;

    /* renamed from: n */
    final c f20114n;

    /* renamed from: q */
    private a f20117q;

    /* renamed from: a */
    public boolean f20101a = false;

    /* renamed from: b */
    int f20102b = 0;

    /* renamed from: c */
    private HashMap<String, i> f20103c = null;

    /* renamed from: e */
    private int f20105e = 32;

    /* renamed from: f */
    private int f20106f = 32;

    /* renamed from: h */
    public boolean f20108h = false;

    /* renamed from: i */
    public boolean f20109i = false;

    /* renamed from: j */
    private boolean[] f20110j = new boolean[32];

    /* renamed from: k */
    int f20111k = 1;

    /* renamed from: l */
    int f20112l = 0;

    /* renamed from: m */
    private int f20113m = 32;

    /* renamed from: o */
    private i[] f20115o = new i[f20098w];

    /* renamed from: p */
    private int f20116p = 0;

    /* loaded from: classes.dex */
    public interface a {
        i a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public class b extends k0.b {
        public b(c cVar) {
            this.f20087e = new j(this, cVar);
        }
    }

    public d() {
        this.f20107g = null;
        this.f20107g = new k0.b[32];
        C();
        c cVar = new c();
        this.f20114n = cVar;
        this.f20104d = new h(cVar);
        this.f20117q = f20097v ? new b(cVar) : new k0.b(cVar);
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f20111k; i10++) {
            this.f20110j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f20111k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f20110j[aVar.getKey().f20133c] = true;
            }
            i a10 = aVar.a(this, this.f20110j);
            if (a10 != null) {
                boolean[] zArr = this.f20110j;
                int i12 = a10.f20133c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f20112l; i14++) {
                    k0.b bVar = this.f20107g[i14];
                    if (bVar.f20083a.f20140u != i.a.UNRESTRICTED && !bVar.f20088f && bVar.t(a10)) {
                        float j10 = bVar.f20087e.j(a10);
                        if (j10 < 0.0f) {
                            float f11 = (-bVar.f20084b) / j10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    k0.b bVar2 = this.f20107g[i13];
                    bVar2.f20083a.f20134d = -1;
                    bVar2.x(a10);
                    i iVar = bVar2.f20083a;
                    iVar.f20134d = i13;
                    iVar.p(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f20097v) {
            while (i10 < this.f20112l) {
                k0.b bVar = this.f20107g[i10];
                if (bVar != null) {
                    this.f20114n.f20089a.a(bVar);
                }
                this.f20107g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f20112l) {
            k0.b bVar2 = this.f20107g[i10];
            if (bVar2 != null) {
                this.f20114n.f20090b.a(bVar2);
            }
            this.f20107g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i b10 = this.f20114n.f20091c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
        } else {
            b10.m();
        }
        b10.o(aVar, str);
        int i10 = this.f20116p;
        int i11 = f20098w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f20098w = i12;
            this.f20115o = (i[]) Arrays.copyOf(this.f20115o, i12);
        }
        i[] iVarArr = this.f20115o;
        int i13 = this.f20116p;
        this.f20116p = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private final void l(k0.b bVar) {
        int i10;
        if (f20095t && bVar.f20088f) {
            bVar.f20083a.n(this, bVar.f20084b);
        } else {
            k0.b[] bVarArr = this.f20107g;
            int i11 = this.f20112l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f20083a;
            iVar.f20134d = i11;
            this.f20112l = i11 + 1;
            iVar.p(this, bVar);
        }
        if (f20095t && this.f20101a) {
            int i12 = 0;
            while (i12 < this.f20112l) {
                if (this.f20107g[i12] == null) {
                    System.out.println("WTF");
                }
                k0.b bVar2 = this.f20107g[i12];
                if (bVar2 != null && bVar2.f20088f) {
                    bVar2.f20083a.n(this, bVar2.f20084b);
                    (f20097v ? this.f20114n.f20089a : this.f20114n.f20090b).a(bVar2);
                    this.f20107g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f20112l;
                        if (i13 >= i10) {
                            break;
                        }
                        k0.b[] bVarArr2 = this.f20107g;
                        int i15 = i13 - 1;
                        k0.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f20083a;
                        if (iVar2.f20134d == i13) {
                            iVar2.f20134d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f20107g[i14] = null;
                    }
                    this.f20112l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f20101a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f20112l; i10++) {
            k0.b bVar = this.f20107g[i10];
            bVar.f20083a.f20136f = bVar.f20084b;
        }
    }

    public static k0.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f20112l) {
                z10 = false;
                break;
            }
            k0.b bVar = this.f20107g[i10];
            if (bVar.f20083a.f20140u != i.a.UNRESTRICTED && bVar.f20084b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            float f10 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f20112l; i15++) {
                k0.b bVar2 = this.f20107g[i15];
                if (bVar2.f20083a.f20140u != i.a.UNRESTRICTED && !bVar2.f20088f && bVar2.f20084b < 0.0f) {
                    int i16 = 9;
                    if (f20096u) {
                        int h10 = bVar2.f20087e.h();
                        int i17 = 0;
                        while (i17 < h10) {
                            i a10 = bVar2.f20087e.a(i17);
                            float j10 = bVar2.f20087e.j(a10);
                            if (j10 > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f11 = a10.f20138s[i18] / j10;
                                    if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                        i13 = a10.f20133c;
                                        i14 = i18;
                                        i12 = i15;
                                        f10 = f11;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f20111k; i19++) {
                            i iVar = this.f20114n.f20092d[i19];
                            float j11 = bVar2.f20087e.j(iVar);
                            if (j11 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f12 = iVar.f20138s[i20] / j11;
                                    if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i12 = i15;
                                        i14 = i20;
                                        f10 = f12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                k0.b bVar3 = this.f20107g[i12];
                bVar3.f20083a.f20134d = -1;
                bVar3.x(this.f20114n.f20092d[i13]);
                i iVar2 = bVar3.f20083a;
                iVar2.f20134d = i12;
                iVar2.p(this, bVar3);
            } else {
                z11 = true;
            }
            if (i11 > this.f20111k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f20105e * 2;
        this.f20105e = i10;
        this.f20107g = (k0.b[]) Arrays.copyOf(this.f20107g, i10);
        c cVar = this.f20114n;
        cVar.f20092d = (i[]) Arrays.copyOf(cVar.f20092d, this.f20105e);
        int i11 = this.f20105e;
        this.f20110j = new boolean[i11];
        this.f20106f = i11;
        this.f20113m = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f20114n;
            i[] iVarArr = cVar.f20092d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.m();
            }
            i10++;
        }
        cVar.f20091c.c(this.f20115o, this.f20116p);
        this.f20116p = 0;
        Arrays.fill(this.f20114n.f20092d, (Object) null);
        HashMap<String, i> hashMap = this.f20103c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f20102b = 0;
        this.f20104d.clear();
        this.f20111k = 1;
        for (int i11 = 0; i11 < this.f20112l; i11++) {
            k0.b bVar = this.f20107g[i11];
            if (bVar != null) {
                bVar.f20085c = false;
            }
        }
        C();
        this.f20112l = 0;
        this.f20117q = f20097v ? new b(this.f20114n) : new k0.b(this.f20114n);
    }

    public void b(n0.e eVar, n0.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar.m(bVar4));
        i q14 = q(eVar2.m(bVar));
        i q15 = q(eVar2.m(bVar2));
        i q16 = q(eVar2.m(bVar3));
        i q17 = q(eVar2.m(bVar4));
        k0.b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        k0.b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        k0.b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(k0.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f20112l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f20113m
            if (r0 >= r2) goto L12
            int r0 = r5.f20111k
            int r0 = r0 + r1
            int r2 = r5.f20106f
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            boolean r0 = r6.f20088f
            r2 = 0
            if (r0 != 0) goto L81
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L78
            k0.i r0 = r5.p()
            r6.f20083a = r0
            int r3 = r5.f20112l
            r5.l(r6)
            int r4 = r5.f20112l
            int r3 = r3 + r1
            if (r4 != r3) goto L78
            k0.d$a r2 = r5.f20117q
            r2.b(r6)
            k0.d$a r2 = r5.f20117q
            r5.B(r2, r1)
            int r2 = r0.f20134d
            r3 = -1
            if (r2 != r3) goto L79
            k0.i r2 = r6.f20083a
            if (r2 != r0) goto L59
            k0.i r0 = r6.v(r0)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f20088f
            if (r0 != 0) goto L62
            k0.i r0 = r6.f20083a
            r0.p(r5, r6)
        L62:
            boolean r0 = k0.d.f20097v
            if (r0 == 0) goto L6b
            k0.c r0 = r5.f20114n
            k0.f<k0.b> r0 = r0.f20089a
            goto L6f
        L6b:
            k0.c r0 = r5.f20114n
            k0.f<k0.b> r0 = r0.f20090b
        L6f:
            r0.a(r6)
            int r0 = r5.f20112l
            int r0 = r0 - r1
            r5.f20112l = r0
            goto L79
        L78:
            r1 = r2
        L79:
            boolean r0 = r6.s()
            if (r0 != 0) goto L80
            return
        L80:
            r2 = r1
        L81:
            if (r2 != 0) goto L86
            r5.l(r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.d.d(k0.b):void");
    }

    public k0.b e(i iVar, i iVar2, int i10, int i11) {
        if (f20094s && i11 == 8 && iVar2.f20137r && iVar.f20134d == -1) {
            iVar.n(this, iVar2.f20136f + i10);
            return null;
        }
        k0.b r10 = r();
        r10.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(i iVar, int i10) {
        k0.b r10;
        if (f20094s && iVar.f20134d == -1) {
            float f10 = i10;
            iVar.n(this, f10);
            for (int i11 = 0; i11 < this.f20102b + 1; i11++) {
                i iVar2 = this.f20114n.f20092d[i11];
                if (iVar2 != null && iVar2.f20144y && iVar2.f20145z == iVar.f20133c) {
                    iVar2.n(this, iVar2.A + f10);
                }
            }
            return;
        }
        int i12 = iVar.f20134d;
        if (i12 != -1) {
            k0.b bVar = this.f20107g[i12];
            if (!bVar.f20088f) {
                if (bVar.f20087e.h() == 0) {
                    bVar.f20088f = true;
                } else {
                    r10 = r();
                    r10.m(iVar, i10);
                }
            }
            bVar.f20084b = i10;
            return;
        }
        r10 = r();
        r10.i(iVar, i10);
        d(r10);
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        k0.b r10 = r();
        i t10 = t();
        t10.f20135e = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        k0.b r10 = r();
        i t10 = t();
        t10.f20135e = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f20087e.j(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        k0.b r10 = r();
        i t10 = t();
        t10.f20135e = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        k0.b r10 = r();
        i t10 = t();
        t10.f20135e = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f20087e.j(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        k0.b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    void m(k0.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f20111k + 1 >= this.f20106f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f20102b + 1;
        this.f20102b = i11;
        this.f20111k++;
        a10.f20133c = i11;
        a10.f20135e = i10;
        this.f20114n.f20092d[i11] = a10;
        this.f20104d.c(a10);
        return a10;
    }

    public i p() {
        if (this.f20111k + 1 >= this.f20106f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f20102b + 1;
        this.f20102b = i10;
        this.f20111k++;
        a10.f20133c = i10;
        this.f20114n.f20092d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f20111k + 1 >= this.f20106f) {
            y();
        }
        if (obj instanceof n0.d) {
            n0.d dVar = (n0.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f20114n);
                iVar = dVar.h();
            }
            int i10 = iVar.f20133c;
            if (i10 == -1 || i10 > this.f20102b || this.f20114n.f20092d[i10] == null) {
                if (i10 != -1) {
                    iVar.m();
                }
                int i11 = this.f20102b + 1;
                this.f20102b = i11;
                this.f20111k++;
                iVar.f20133c = i11;
                iVar.f20140u = i.a.UNRESTRICTED;
                this.f20114n.f20092d[i11] = iVar;
            }
        }
        return iVar;
    }

    public k0.b r() {
        k0.b b10;
        if (f20097v) {
            b10 = this.f20114n.f20089a.b();
            if (b10 == null) {
                b10 = new b(this.f20114n);
                f20100y++;
            }
            b10.y();
        } else {
            b10 = this.f20114n.f20090b.b();
            if (b10 == null) {
                b10 = new k0.b(this.f20114n);
                f20099x++;
            }
            b10.y();
        }
        i.i();
        return b10;
    }

    public i t() {
        if (this.f20111k + 1 >= this.f20106f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f20102b + 1;
        this.f20102b = i10;
        this.f20111k++;
        a10.f20133c = i10;
        this.f20114n.f20092d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f20114n;
    }

    public int x(Object obj) {
        i h10 = ((n0.d) obj).h();
        if (h10 != null) {
            return (int) (h10.f20136f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f20104d.isEmpty()) {
            n();
            return;
        }
        if (this.f20108h || this.f20109i) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f20112l) {
                    z10 = true;
                    break;
                } else if (!this.f20107g[i10].f20088f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                n();
                return;
            }
        }
        A(this.f20104d);
    }
}
