package k0;

import java.util.ArrayList;
import k0.d;
import k0.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e */
    public a f20087e;

    /* renamed from: a */
    i f20083a = null;

    /* renamed from: b */
    float f20084b = 0.0f;

    /* renamed from: c */
    boolean f20085c = false;

    /* renamed from: d */
    ArrayList<i> f20086d = new ArrayList<>();

    /* renamed from: f */
    boolean f20088f = false;

    /* loaded from: classes.dex */
    public interface a {
        i a(int i10);

        void b();

        void c(i iVar, float f10, boolean z10);

        void clear();

        float d(b bVar, boolean z10);

        void e(i iVar, float f10);

        float f(i iVar, boolean z10);

        boolean g(i iVar);

        int h();

        float i(int i10);

        float j(i iVar);

        void k(float f10);
    }

    public b() {
    }

    public b(c cVar) {
        this.f20087e = new k0.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f20143x <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int h10 = this.f20087e.h();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < h10; i10++) {
            float i11 = this.f20087e.i(i10);
            if (i11 < 0.0f) {
                i a10 = this.f20087e.a(i10);
                if ((zArr == null || !zArr[a10.f20133c]) && a10 != iVar && (((aVar = a10.f20140u) == i.a.SLACK || aVar == i.a.ERROR) && i11 < f10)) {
                    f10 = i11;
                    iVar2 = a10;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f20137r) {
            return;
        }
        this.f20084b += iVar.f20136f * this.f20087e.j(iVar);
        this.f20087e.f(iVar, z10);
        if (z10) {
            iVar.l(this);
        }
        if (d.f20095t && this.f20087e.h() == 0) {
            this.f20088f = true;
            dVar.f20101a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f20084b += bVar.f20084b * this.f20087e.d(bVar, z10);
        if (z10) {
            bVar.f20083a.l(this);
        }
        if (d.f20095t && this.f20083a != null && this.f20087e.h() == 0) {
            this.f20088f = true;
            dVar.f20101a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f20144y) {
            return;
        }
        float j10 = this.f20087e.j(iVar);
        this.f20084b += iVar.A * j10;
        this.f20087e.f(iVar, z10);
        if (z10) {
            iVar.l(this);
        }
        this.f20087e.c(dVar.f20114n.f20092d[iVar.f20145z], j10, z10);
        if (d.f20095t && this.f20087e.h() == 0) {
            this.f20088f = true;
            dVar.f20101a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f20107g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int h10 = this.f20087e.h();
            for (int i10 = 0; i10 < h10; i10++) {
                i a10 = this.f20087e.a(i10);
                if (a10.f20134d != -1 || a10.f20137r || a10.f20144y) {
                    this.f20086d.add(a10);
                }
            }
            int size = this.f20086d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f20086d.get(i11);
                    if (iVar.f20137r) {
                        A(dVar, iVar, true);
                    } else if (iVar.f20144y) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f20107g[iVar.f20134d], true);
                    }
                }
                this.f20086d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f20095t && this.f20083a != null && this.f20087e.h() == 0) {
            this.f20088f = true;
            dVar.f20101a = true;
        }
    }

    @Override // k0.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // k0.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f20083a = null;
            this.f20087e.clear();
            for (int i10 = 0; i10 < bVar.f20087e.h(); i10++) {
                this.f20087e.c(bVar.f20087e.a(i10), bVar.f20087e.i(i10), true);
            }
        }
    }

    @Override // k0.d.a
    public void c(i iVar) {
        int i10 = iVar.f20135e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f20087e.e(iVar, f10);
    }

    @Override // k0.d.a
    public void clear() {
        this.f20087e.clear();
        this.f20083a = null;
        this.f20084b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f20087e.e(dVar.o(i10, "ep"), 1.0f);
        this.f20087e.e(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f20087e.e(iVar, i10);
        return this;
    }

    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f20087e.h() == 0) {
            this.f20088f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int h10 = this.f20087e.h();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < h10; i10++) {
            float i11 = this.f20087e.i(i10);
            i a10 = this.f20087e.a(i10);
            if (a10.f20140u == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > i11) {
                    z10 = u(a10, dVar);
                    f10 = i11;
                    iVar = a10;
                } else if (!z10 && u(a10, dVar)) {
                    f10 = i11;
                    iVar = a10;
                    z10 = true;
                }
            } else if (iVar == null && i11 < 0.0f) {
                if (iVar2 == null || f11 > i11) {
                    z11 = u(a10, dVar);
                    f11 = i11;
                    iVar2 = a10;
                } else if (!z11 && u(a10, dVar)) {
                    f11 = i11;
                    iVar2 = a10;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // k0.d.a
    public i getKey() {
        return this.f20083a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        float f11;
        int i12;
        if (iVar2 == iVar3) {
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar4, 1.0f);
            this.f20087e.e(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar2, -1.0f);
            this.f20087e.e(iVar3, -1.0f);
            this.f20087e.e(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i12 = (-i10) + i11;
                f11 = i12;
            }
            return this;
        }
        if (f10 <= 0.0f) {
            this.f20087e.e(iVar, -1.0f);
            this.f20087e.e(iVar2, 1.0f);
            f11 = i10;
        } else {
            if (f10 < 1.0f) {
                float f12 = 1.0f - f10;
                this.f20087e.e(iVar, f12 * 1.0f);
                this.f20087e.e(iVar2, f12 * (-1.0f));
                this.f20087e.e(iVar3, (-1.0f) * f10);
                this.f20087e.e(iVar4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    f11 = ((-i10) * f12) + (i11 * f10);
                }
                return this;
            }
            this.f20087e.e(iVar4, -1.0f);
            this.f20087e.e(iVar3, 1.0f);
            i12 = -i11;
            f11 = i12;
        }
        this.f20084b = f11;
        return this;
    }

    public b i(i iVar, int i10) {
        this.f20083a = iVar;
        float f10 = i10;
        iVar.f20136f = f10;
        this.f20084b = f10;
        this.f20088f = true;
        return this;
    }

    @Override // k0.d.a
    public boolean isEmpty() {
        return this.f20083a == null && this.f20084b == 0.0f && this.f20087e.h() == 0;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f20087e.e(iVar, -1.0f);
        this.f20087e.e(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f20087e.e(iVar, -1.0f);
        this.f20087e.e(iVar2, 1.0f);
        this.f20087e.e(iVar3, f10);
        this.f20087e.e(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f20084b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar2, -1.0f);
            this.f20087e.e(iVar4, 1.0f);
            this.f20087e.e(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f20087e.e(iVar3, 1.0f);
            this.f20087e.e(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar2, -1.0f);
            this.f20087e.e(iVar4, f13);
            this.f20087e.e(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        a aVar;
        float f10;
        if (i10 < 0) {
            this.f20084b = i10 * (-1);
            aVar = this.f20087e;
            f10 = 1.0f;
        } else {
            this.f20084b = i10;
            aVar = this.f20087e;
            f10 = -1.0f;
        }
        aVar.e(iVar, f10);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20084b = i10;
        }
        if (z10) {
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar2, -1.0f);
        } else {
            this.f20087e.e(iVar, -1.0f);
            this.f20087e.e(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20084b = i10;
        }
        if (z10) {
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar2, -1.0f);
            this.f20087e.e(iVar3, -1.0f);
        } else {
            this.f20087e.e(iVar, -1.0f);
            this.f20087e.e(iVar2, 1.0f);
            this.f20087e.e(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20084b = i10;
        }
        if (z10) {
            this.f20087e.e(iVar, 1.0f);
            this.f20087e.e(iVar2, -1.0f);
            this.f20087e.e(iVar3, 1.0f);
        } else {
            this.f20087e.e(iVar, -1.0f);
            this.f20087e.e(iVar2, 1.0f);
            this.f20087e.e(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f20087e.e(iVar3, 0.5f);
        this.f20087e.e(iVar4, 0.5f);
        this.f20087e.e(iVar, -0.5f);
        this.f20087e.e(iVar2, -0.5f);
        this.f20084b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.f20084b;
        if (f10 < 0.0f) {
            this.f20084b = f10 * (-1.0f);
            this.f20087e.b();
        }
    }

    public boolean s() {
        i iVar = this.f20083a;
        return iVar != null && (iVar.f20140u == i.a.UNRESTRICTED || this.f20084b >= 0.0f);
    }

    public boolean t(i iVar) {
        return this.f20087e.g(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public void x(i iVar) {
        i iVar2 = this.f20083a;
        if (iVar2 != null) {
            this.f20087e.e(iVar2, -1.0f);
            this.f20083a.f20134d = -1;
            this.f20083a = null;
        }
        float f10 = this.f20087e.f(iVar, true) * (-1.0f);
        this.f20083a = iVar;
        if (f10 == 1.0f) {
            return;
        }
        this.f20084b /= f10;
        this.f20087e.k(f10);
    }

    public void y() {
        this.f20083a = null;
        this.f20087e.clear();
        this.f20084b = 0.0f;
        this.f20088f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            r10 = this;
            k0.i r0 = r10.f20083a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            k0.i r1 = r10.f20083a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f20084b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f20084b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L53
        L52:
            r1 = r3
        L53:
            k0.b$a r5 = r10.f20087e
            int r5 = r5.h()
        L59:
            if (r3 >= r5) goto Ld1
            k0.b$a r6 = r10.f20087e
            k0.i r6 = r6.a(r3)
            if (r6 != 0) goto L64
            goto Lce
        L64:
            k0.b$a r7 = r10.f20087e
            float r7 = r7.i(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lce
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Laa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La2
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L9a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Laa
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Laa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc3
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        Lce:
            int r3 = r3 + 1
            goto L59
        Ld1:
            if (r1 != 0) goto Le4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.z():java.lang.String");
    }
}
