package p190k0;

import java.util.Arrays;
import p190k0.C9100b;

/* renamed from: k0.j */
/* loaded from: classes.dex */
public class C9108j implements C9100b.a {

    /* renamed from: n */
    private static float f21928n = 0.001f;

    /* renamed from: a */
    private final int f21929a = -1;

    /* renamed from: b */
    private int f21930b = 16;

    /* renamed from: c */
    private int f21931c = 16;

    /* renamed from: d */
    int[] f21932d = new int[16];

    /* renamed from: e */
    int[] f21933e = new int[16];

    /* renamed from: f */
    int[] f21934f = new int[16];

    /* renamed from: g */
    float[] f21935g = new float[16];

    /* renamed from: h */
    int[] f21936h = new int[16];

    /* renamed from: i */
    int[] f21937i = new int[16];

    /* renamed from: j */
    int f21938j = 0;

    /* renamed from: k */
    int f21939k = -1;

    /* renamed from: l */
    private final C9100b f21940l;

    /* renamed from: m */
    protected final C9101c f21941m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9108j(C9100b c9100b, C9101c c9101c) {
        this.f21940l = c9100b;
        this.f21941m = c9101c;
        clear();
    }

    /* renamed from: l */
    private void m26818l(C9107i c9107i, int i10) {
        int[] iArr;
        int i11 = c9107i.f21915c % this.f21931c;
        int[] iArr2 = this.f21932d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f21933e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f21933e[i10] = -1;
    }

    /* renamed from: m */
    private void m26819m(int i10, C9107i c9107i, float f10) {
        this.f21934f[i10] = c9107i.f21915c;
        this.f21935g[i10] = f10;
        this.f21936h[i10] = -1;
        this.f21937i[i10] = -1;
        c9107i.m26811b(this.f21940l);
        c9107i.f21925x++;
        this.f21938j++;
    }

    /* renamed from: n */
    private int m26820n() {
        for (int i10 = 0; i10 < this.f21930b; i10++) {
            if (this.f21934f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m26821o() {
        int i10 = this.f21930b * 2;
        this.f21934f = Arrays.copyOf(this.f21934f, i10);
        this.f21935g = Arrays.copyOf(this.f21935g, i10);
        this.f21936h = Arrays.copyOf(this.f21936h, i10);
        this.f21937i = Arrays.copyOf(this.f21937i, i10);
        this.f21933e = Arrays.copyOf(this.f21933e, i10);
        for (int i11 = this.f21930b; i11 < i10; i11++) {
            this.f21934f[i11] = -1;
            this.f21933e[i11] = -1;
        }
        this.f21930b = i10;
    }

    /* renamed from: q */
    private void m26822q(int i10, C9107i c9107i, float f10) {
        int m26820n = m26820n();
        m26819m(m26820n, c9107i, f10);
        if (i10 != -1) {
            this.f21936h[m26820n] = i10;
            int[] iArr = this.f21937i;
            iArr[m26820n] = iArr[i10];
            iArr[i10] = m26820n;
        } else {
            this.f21936h[m26820n] = -1;
            if (this.f21938j > 0) {
                this.f21937i[m26820n] = this.f21939k;
                this.f21939k = m26820n;
            } else {
                this.f21937i[m26820n] = -1;
            }
        }
        int i11 = this.f21937i[m26820n];
        if (i11 != -1) {
            this.f21936h[i11] = m26820n;
        }
        m26818l(c9107i, m26820n);
    }

    /* renamed from: r */
    private void m26823r(C9107i c9107i) {
        int[] iArr;
        int i10;
        int i11 = c9107i.f21915c;
        int i12 = i11 % this.f21931c;
        int[] iArr2 = this.f21932d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f21934f[i13] == i11) {
            int[] iArr3 = this.f21933e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f21933e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f21934f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f21934f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: a */
    public C9107i mo26727a(int i10) {
        int i11 = this.f21938j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f21939k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f21941m.f21871d[this.f21934f[i12]];
            }
            i12 = this.f21937i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: b */
    public void mo26728b() {
        int i10 = this.f21938j;
        int i11 = this.f21939k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f21935g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f21937i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // p190k0.C9100b.a
    /* renamed from: c */
    public void mo26729c(C9107i c9107i, float f10, boolean z10) {
        float f11 = f21928n;
        if (f10 <= (-f11) || f10 >= f11) {
            int m26824p = m26824p(c9107i);
            if (m26824p == -1) {
                mo26731e(c9107i, f10);
                return;
            }
            float[] fArr = this.f21935g;
            float f12 = fArr[m26824p] + f10;
            fArr[m26824p] = f12;
            float f13 = f21928n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[m26824p] = 0.0f;
            mo26732f(c9107i, z10);
        }
    }

    @Override // p190k0.C9100b.a
    public void clear() {
        int i10 = this.f21938j;
        for (int i11 = 0; i11 < i10; i11++) {
            C9107i mo26727a = mo26727a(i11);
            if (mo26727a != null) {
                mo26727a.m26813l(this.f21940l);
            }
        }
        for (int i12 = 0; i12 < this.f21930b; i12++) {
            this.f21934f[i12] = -1;
            this.f21933e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f21931c; i13++) {
            this.f21932d[i13] = -1;
        }
        this.f21938j = 0;
        this.f21939k = -1;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: d */
    public float mo26730d(C9100b c9100b, boolean z10) {
        float mo26736j = mo26736j(c9100b.f21862a);
        mo26732f(c9100b.f21862a, z10);
        C9108j c9108j = (C9108j) c9100b.f21866e;
        int mo26734h = c9108j.mo26734h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < mo26734h) {
            int i12 = c9108j.f21934f[i11];
            if (i12 != -1) {
                mo26729c(this.f21941m.f21871d[i12], c9108j.f21935g[i11] * mo26736j, z10);
                i10++;
            }
            i11++;
        }
        return mo26736j;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: e */
    public void mo26731e(C9107i c9107i, float f10) {
        float f11 = f21928n;
        if (f10 > (-f11) && f10 < f11) {
            mo26732f(c9107i, true);
            return;
        }
        if (this.f21938j == 0) {
            m26819m(0, c9107i, f10);
            m26818l(c9107i, 0);
            this.f21939k = 0;
            return;
        }
        int m26824p = m26824p(c9107i);
        if (m26824p != -1) {
            this.f21935g[m26824p] = f10;
            return;
        }
        if (this.f21938j + 1 >= this.f21930b) {
            m26821o();
        }
        int i10 = this.f21938j;
        int i11 = this.f21939k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f21934f[i11];
            int i15 = c9107i.f21915c;
            if (i14 == i15) {
                this.f21935g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f21937i[i11];
            if (i11 == -1) {
                break;
            }
        }
        m26822q(i12, c9107i, f10);
    }

    @Override // p190k0.C9100b.a
    /* renamed from: f */
    public float mo26732f(C9107i c9107i, boolean z10) {
        int m26824p = m26824p(c9107i);
        if (m26824p == -1) {
            return 0.0f;
        }
        m26823r(c9107i);
        float f10 = this.f21935g[m26824p];
        if (this.f21939k == m26824p) {
            this.f21939k = this.f21937i[m26824p];
        }
        this.f21934f[m26824p] = -1;
        int[] iArr = this.f21936h;
        int i10 = iArr[m26824p];
        if (i10 != -1) {
            int[] iArr2 = this.f21937i;
            iArr2[i10] = iArr2[m26824p];
        }
        int i11 = this.f21937i[m26824p];
        if (i11 != -1) {
            iArr[i11] = iArr[m26824p];
        }
        this.f21938j--;
        c9107i.f21925x--;
        if (z10) {
            c9107i.m26813l(this.f21940l);
        }
        return f10;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: g */
    public boolean mo26733g(C9107i c9107i) {
        return m26824p(c9107i) != -1;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: h */
    public int mo26734h() {
        return this.f21938j;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: i */
    public float mo26735i(int i10) {
        int i11 = this.f21938j;
        int i12 = this.f21939k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f21935g[i12];
            }
            i12 = this.f21937i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: j */
    public float mo26736j(C9107i c9107i) {
        int m26824p = m26824p(c9107i);
        if (m26824p != -1) {
            return this.f21935g[m26824p];
        }
        return 0.0f;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: k */
    public void mo26737k(float f10) {
        int i10 = this.f21938j;
        int i11 = this.f21939k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f21935g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f21937i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    /* renamed from: p */
    public int m26824p(C9107i c9107i) {
        if (this.f21938j != 0 && c9107i != null) {
            int i10 = c9107i.f21915c;
            int i11 = this.f21932d[i10 % this.f21931c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f21934f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f21933e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f21934f[i11] != i10);
            if (i11 != -1 && this.f21934f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb2;
        String str = hashCode() + " { ";
        int i10 = this.f21938j;
        for (int i11 = 0; i11 < i10; i11++) {
            C9107i mo26727a = mo26727a(i11);
            if (mo26727a != null) {
                String str2 = str + mo26727a + " = " + mo26735i(i11) + " ";
                int m26824p = m26824p(mo26727a);
                String str3 = str2 + "[p: ";
                if (this.f21936h[m26824p] != -1) {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(this.f21941m.f21871d[this.f21934f[this.f21936h[m26824p]]]);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append("none");
                }
                String str4 = sb2.toString() + ", n: ";
                str = (this.f21937i[m26824p] != -1 ? str4 + this.f21941m.f21871d[this.f21934f[this.f21937i[m26824p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
