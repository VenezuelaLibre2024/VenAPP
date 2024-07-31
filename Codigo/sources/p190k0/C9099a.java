package p190k0;

import java.util.Arrays;
import p190k0.C9100b;

/* renamed from: k0.a */
/* loaded from: classes.dex */
public class C9099a implements C9100b.a {

    /* renamed from: l */
    private static float f21850l = 0.001f;

    /* renamed from: b */
    private final C9100b f21852b;

    /* renamed from: c */
    protected final C9101c f21853c;

    /* renamed from: a */
    int f21851a = 0;

    /* renamed from: d */
    private int f21854d = 8;

    /* renamed from: e */
    private C9107i f21855e = null;

    /* renamed from: f */
    private int[] f21856f = new int[8];

    /* renamed from: g */
    private int[] f21857g = new int[8];

    /* renamed from: h */
    private float[] f21858h = new float[8];

    /* renamed from: i */
    private int f21859i = -1;

    /* renamed from: j */
    private int f21860j = -1;

    /* renamed from: k */
    private boolean f21861k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9099a(C9100b c9100b, C9101c c9101c) {
        this.f21852b = c9100b;
        this.f21853c = c9101c;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: a */
    public C9107i mo26727a(int i10) {
        int i11 = this.f21859i;
        for (int i12 = 0; i11 != -1 && i12 < this.f21851a; i12++) {
            if (i12 == i10) {
                return this.f21853c.f21871d[this.f21856f[i11]];
            }
            i11 = this.f21857g[i11];
        }
        return null;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: b */
    public void mo26728b() {
        int i10 = this.f21859i;
        for (int i11 = 0; i10 != -1 && i11 < this.f21851a; i11++) {
            float[] fArr = this.f21858h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f21857g[i10];
        }
    }

    @Override // p190k0.C9100b.a
    /* renamed from: c */
    public void mo26729c(C9107i c9107i, float f10, boolean z10) {
        float f11 = f21850l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f21859i;
            if (i10 == -1) {
                this.f21859i = 0;
                this.f21858h[0] = f10;
                this.f21856f[0] = c9107i.f21915c;
                this.f21857g[0] = -1;
                c9107i.f21925x++;
                c9107i.m26811b(this.f21852b);
                this.f21851a++;
                if (this.f21861k) {
                    return;
                }
                int i11 = this.f21860j + 1;
                this.f21860j = i11;
                int[] iArr = this.f21856f;
                if (i11 >= iArr.length) {
                    this.f21861k = true;
                    this.f21860j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f21851a; i13++) {
                int i14 = this.f21856f[i10];
                int i15 = c9107i.f21915c;
                if (i14 == i15) {
                    float[] fArr = this.f21858h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f21850l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f21859i) {
                            this.f21859i = this.f21857g[i10];
                        } else {
                            int[] iArr2 = this.f21857g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            c9107i.m26813l(this.f21852b);
                        }
                        if (this.f21861k) {
                            this.f21860j = i10;
                        }
                        c9107i.f21925x--;
                        this.f21851a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f21857g[i10];
            }
            int i16 = this.f21860j;
            int i17 = i16 + 1;
            if (this.f21861k) {
                int[] iArr3 = this.f21856f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f21856f;
            if (i16 >= iArr4.length && this.f21851a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f21856f;
                    if (i18 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    }
                    i18++;
                }
            }
            int[] iArr6 = this.f21856f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f21854d * 2;
                this.f21854d = i19;
                this.f21861k = false;
                this.f21860j = i16 - 1;
                this.f21858h = Arrays.copyOf(this.f21858h, i19);
                this.f21856f = Arrays.copyOf(this.f21856f, this.f21854d);
                this.f21857g = Arrays.copyOf(this.f21857g, this.f21854d);
            }
            this.f21856f[i16] = c9107i.f21915c;
            this.f21858h[i16] = f10;
            int[] iArr7 = this.f21857g;
            if (i12 != -1) {
                iArr7[i16] = iArr7[i12];
                iArr7[i12] = i16;
            } else {
                iArr7[i16] = this.f21859i;
                this.f21859i = i16;
            }
            c9107i.f21925x++;
            c9107i.m26811b(this.f21852b);
            this.f21851a++;
            if (!this.f21861k) {
                this.f21860j++;
            }
            int i20 = this.f21860j;
            int[] iArr8 = this.f21856f;
            if (i20 >= iArr8.length) {
                this.f21861k = true;
                this.f21860j = iArr8.length - 1;
            }
        }
    }

    @Override // p190k0.C9100b.a
    public final void clear() {
        int i10 = this.f21859i;
        for (int i11 = 0; i10 != -1 && i11 < this.f21851a; i11++) {
            C9107i c9107i = this.f21853c.f21871d[this.f21856f[i10]];
            if (c9107i != null) {
                c9107i.m26813l(this.f21852b);
            }
            i10 = this.f21857g[i10];
        }
        this.f21859i = -1;
        this.f21860j = -1;
        this.f21861k = false;
        this.f21851a = 0;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: d */
    public float mo26730d(C9100b c9100b, boolean z10) {
        float mo26736j = mo26736j(c9100b.f21862a);
        mo26732f(c9100b.f21862a, z10);
        C9100b.a aVar = c9100b.f21866e;
        int mo26734h = aVar.mo26734h();
        for (int i10 = 0; i10 < mo26734h; i10++) {
            C9107i mo26727a = aVar.mo26727a(i10);
            mo26729c(mo26727a, aVar.mo26736j(mo26727a) * mo26736j, z10);
        }
        return mo26736j;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: e */
    public final void mo26731e(C9107i c9107i, float f10) {
        if (f10 == 0.0f) {
            mo26732f(c9107i, true);
            return;
        }
        int i10 = this.f21859i;
        if (i10 == -1) {
            this.f21859i = 0;
            this.f21858h[0] = f10;
            this.f21856f[0] = c9107i.f21915c;
            this.f21857g[0] = -1;
            c9107i.f21925x++;
            c9107i.m26811b(this.f21852b);
            this.f21851a++;
            if (this.f21861k) {
                return;
            }
            int i11 = this.f21860j + 1;
            this.f21860j = i11;
            int[] iArr = this.f21856f;
            if (i11 >= iArr.length) {
                this.f21861k = true;
                this.f21860j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f21851a; i13++) {
            int i14 = this.f21856f[i10];
            int i15 = c9107i.f21915c;
            if (i14 == i15) {
                this.f21858h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f21857g[i10];
        }
        int i16 = this.f21860j;
        int i17 = i16 + 1;
        if (this.f21861k) {
            int[] iArr2 = this.f21856f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f21856f;
        if (i16 >= iArr3.length && this.f21851a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f21856f;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f21856f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f21854d * 2;
            this.f21854d = i19;
            this.f21861k = false;
            this.f21860j = i16 - 1;
            this.f21858h = Arrays.copyOf(this.f21858h, i19);
            this.f21856f = Arrays.copyOf(this.f21856f, this.f21854d);
            this.f21857g = Arrays.copyOf(this.f21857g, this.f21854d);
        }
        this.f21856f[i16] = c9107i.f21915c;
        this.f21858h[i16] = f10;
        int[] iArr6 = this.f21857g;
        if (i12 != -1) {
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            iArr6[i16] = this.f21859i;
            this.f21859i = i16;
        }
        c9107i.f21925x++;
        c9107i.m26811b(this.f21852b);
        int i20 = this.f21851a + 1;
        this.f21851a = i20;
        if (!this.f21861k) {
            this.f21860j++;
        }
        int[] iArr7 = this.f21856f;
        if (i20 >= iArr7.length) {
            this.f21861k = true;
        }
        if (this.f21860j >= iArr7.length) {
            this.f21861k = true;
            this.f21860j = iArr7.length - 1;
        }
    }

    @Override // p190k0.C9100b.a
    /* renamed from: f */
    public final float mo26732f(C9107i c9107i, boolean z10) {
        if (this.f21855e == c9107i) {
            this.f21855e = null;
        }
        int i10 = this.f21859i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f21851a) {
            if (this.f21856f[i10] == c9107i.f21915c) {
                if (i10 == this.f21859i) {
                    this.f21859i = this.f21857g[i10];
                } else {
                    int[] iArr = this.f21857g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c9107i.m26813l(this.f21852b);
                }
                c9107i.f21925x--;
                this.f21851a--;
                this.f21856f[i10] = -1;
                if (this.f21861k) {
                    this.f21860j = i10;
                }
                return this.f21858h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f21857g[i10];
        }
        return 0.0f;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: g */
    public boolean mo26733g(C9107i c9107i) {
        int i10 = this.f21859i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f21851a; i11++) {
            if (this.f21856f[i10] == c9107i.f21915c) {
                return true;
            }
            i10 = this.f21857g[i10];
        }
        return false;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: h */
    public int mo26734h() {
        return this.f21851a;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: i */
    public float mo26735i(int i10) {
        int i11 = this.f21859i;
        for (int i12 = 0; i11 != -1 && i12 < this.f21851a; i12++) {
            if (i12 == i10) {
                return this.f21858h[i11];
            }
            i11 = this.f21857g[i11];
        }
        return 0.0f;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: j */
    public final float mo26736j(C9107i c9107i) {
        int i10 = this.f21859i;
        for (int i11 = 0; i10 != -1 && i11 < this.f21851a; i11++) {
            if (this.f21856f[i10] == c9107i.f21915c) {
                return this.f21858h[i10];
            }
            i10 = this.f21857g[i10];
        }
        return 0.0f;
    }

    @Override // p190k0.C9100b.a
    /* renamed from: k */
    public void mo26737k(float f10) {
        int i10 = this.f21859i;
        for (int i11 = 0; i10 != -1 && i11 < this.f21851a; i11++) {
            float[] fArr = this.f21858h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f21857g[i10];
        }
    }

    public String toString() {
        int i10 = this.f21859i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f21851a; i11++) {
            str = ((str + " -> ") + this.f21858h[i10] + " : ") + this.f21853c.f21871d[this.f21856f[i10]];
            i10 = this.f21857g[i10];
        }
        return str;
    }
}
