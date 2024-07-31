package k0;

import java.util.Arrays;
import k0.b;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f20146n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f20147a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f20148b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f20149c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f20150d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f20151e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f20152f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f20153g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f20154h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f20155i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f20156j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f20157k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f20158l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f20159m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, c cVar) {
        this.f20158l = bVar;
        this.f20159m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f20133c % this.f20149c;
        int[] iArr2 = this.f20150d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f20151e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f20151e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f20152f[i10] = iVar.f20133c;
        this.f20153g[i10] = f10;
        this.f20154h[i10] = -1;
        this.f20155i[i10] = -1;
        iVar.b(this.f20158l);
        iVar.f20143x++;
        this.f20156j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f20148b; i10++) {
            if (this.f20152f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f20148b * 2;
        this.f20152f = Arrays.copyOf(this.f20152f, i10);
        this.f20153g = Arrays.copyOf(this.f20153g, i10);
        this.f20154h = Arrays.copyOf(this.f20154h, i10);
        this.f20155i = Arrays.copyOf(this.f20155i, i10);
        this.f20151e = Arrays.copyOf(this.f20151e, i10);
        for (int i11 = this.f20148b; i11 < i10; i11++) {
            this.f20152f[i11] = -1;
            this.f20151e[i11] = -1;
        }
        this.f20148b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f20154h[n10] = i10;
            int[] iArr = this.f20155i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f20154h[n10] = -1;
            if (this.f20156j > 0) {
                this.f20155i[n10] = this.f20157k;
                this.f20157k = n10;
            } else {
                this.f20155i[n10] = -1;
            }
        }
        int i11 = this.f20155i[n10];
        if (i11 != -1) {
            this.f20154h[i11] = n10;
        }
        l(iVar, n10);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f20133c;
        int i12 = i11 % this.f20149c;
        int[] iArr2 = this.f20150d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f20152f[i13] == i11) {
            int[] iArr3 = this.f20151e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f20151e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f20152f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f20152f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // k0.b.a
    public i a(int i10) {
        int i11 = this.f20156j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f20157k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f20159m.f20092d[this.f20152f[i12]];
            }
            i12 = this.f20155i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // k0.b.a
    public void b() {
        int i10 = this.f20156j;
        int i11 = this.f20157k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f20153g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f20155i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // k0.b.a
    public void c(i iVar, float f10, boolean z10) {
        float f11 = f20146n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                e(iVar, f10);
                return;
            }
            float[] fArr = this.f20153g;
            float f12 = fArr[p10] + f10;
            fArr[p10] = f12;
            float f13 = f20146n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[p10] = 0.0f;
            f(iVar, z10);
        }
    }

    @Override // k0.b.a
    public void clear() {
        int i10 = this.f20156j;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                a10.l(this.f20158l);
            }
        }
        for (int i12 = 0; i12 < this.f20148b; i12++) {
            this.f20152f[i12] = -1;
            this.f20151e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f20149c; i13++) {
            this.f20150d[i13] = -1;
        }
        this.f20156j = 0;
        this.f20157k = -1;
    }

    @Override // k0.b.a
    public float d(b bVar, boolean z10) {
        float j10 = j(bVar.f20083a);
        f(bVar.f20083a, z10);
        j jVar = (j) bVar.f20087e;
        int h10 = jVar.h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < h10) {
            int i12 = jVar.f20152f[i11];
            if (i12 != -1) {
                c(this.f20159m.f20092d[i12], jVar.f20153g[i11] * j10, z10);
                i10++;
            }
            i11++;
        }
        return j10;
    }

    @Override // k0.b.a
    public void e(i iVar, float f10) {
        float f11 = f20146n;
        if (f10 > (-f11) && f10 < f11) {
            f(iVar, true);
            return;
        }
        if (this.f20156j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f20157k = 0;
            return;
        }
        int p10 = p(iVar);
        if (p10 != -1) {
            this.f20153g[p10] = f10;
            return;
        }
        if (this.f20156j + 1 >= this.f20148b) {
            o();
        }
        int i10 = this.f20156j;
        int i11 = this.f20157k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f20152f[i11];
            int i15 = iVar.f20133c;
            if (i14 == i15) {
                this.f20153g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f20155i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // k0.b.a
    public float f(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f20153g[p10];
        if (this.f20157k == p10) {
            this.f20157k = this.f20155i[p10];
        }
        this.f20152f[p10] = -1;
        int[] iArr = this.f20154h;
        int i10 = iArr[p10];
        if (i10 != -1) {
            int[] iArr2 = this.f20155i;
            iArr2[i10] = iArr2[p10];
        }
        int i11 = this.f20155i[p10];
        if (i11 != -1) {
            iArr[i11] = iArr[p10];
        }
        this.f20156j--;
        iVar.f20143x--;
        if (z10) {
            iVar.l(this.f20158l);
        }
        return f10;
    }

    @Override // k0.b.a
    public boolean g(i iVar) {
        return p(iVar) != -1;
    }

    @Override // k0.b.a
    public int h() {
        return this.f20156j;
    }

    @Override // k0.b.a
    public float i(int i10) {
        int i11 = this.f20156j;
        int i12 = this.f20157k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f20153g[i12];
            }
            i12 = this.f20155i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // k0.b.a
    public float j(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f20153g[p10];
        }
        return 0.0f;
    }

    @Override // k0.b.a
    public void k(float f10) {
        int i10 = this.f20156j;
        int i11 = this.f20157k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f20153g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f20155i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f20156j != 0 && iVar != null) {
            int i10 = iVar.f20133c;
            int i11 = this.f20150d[i10 % this.f20149c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f20152f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f20151e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f20152f[i11] != i10);
            if (i11 != -1 && this.f20152f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb2;
        String str = hashCode() + " { ";
        int i10 = this.f20156j;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                String str2 = str + a10 + " = " + i(i11) + " ";
                int p10 = p(a10);
                String str3 = str2 + "[p: ";
                if (this.f20154h[p10] != -1) {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(this.f20159m.f20092d[this.f20152f[this.f20154h[p10]]]);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append("none");
                }
                String str4 = sb2.toString() + ", n: ";
                str = (this.f20155i[p10] != -1 ? str4 + this.f20159m.f20092d[this.f20152f[this.f20155i[p10]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
