package k0;

import java.util.Arrays;
import k0.b;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f20071l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f20073b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f20074c;

    /* renamed from: a, reason: collision with root package name */
    int f20072a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f20075d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f20076e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f20077f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f20078g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f20079h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f20080i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f20081j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20082k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f20073b = bVar;
        this.f20074c = cVar;
    }

    @Override // k0.b.a
    public i a(int i10) {
        int i11 = this.f20080i;
        for (int i12 = 0; i11 != -1 && i12 < this.f20072a; i12++) {
            if (i12 == i10) {
                return this.f20074c.f20092d[this.f20077f[i11]];
            }
            i11 = this.f20078g[i11];
        }
        return null;
    }

    @Override // k0.b.a
    public void b() {
        int i10 = this.f20080i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20072a; i11++) {
            float[] fArr = this.f20079h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f20078g[i10];
        }
    }

    @Override // k0.b.a
    public void c(i iVar, float f10, boolean z10) {
        float f11 = f20071l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f20080i;
            if (i10 == -1) {
                this.f20080i = 0;
                this.f20079h[0] = f10;
                this.f20077f[0] = iVar.f20133c;
                this.f20078g[0] = -1;
                iVar.f20143x++;
                iVar.b(this.f20073b);
                this.f20072a++;
                if (this.f20082k) {
                    return;
                }
                int i11 = this.f20081j + 1;
                this.f20081j = i11;
                int[] iArr = this.f20077f;
                if (i11 >= iArr.length) {
                    this.f20082k = true;
                    this.f20081j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f20072a; i13++) {
                int i14 = this.f20077f[i10];
                int i15 = iVar.f20133c;
                if (i14 == i15) {
                    float[] fArr = this.f20079h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f20071l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f20080i) {
                            this.f20080i = this.f20078g[i10];
                        } else {
                            int[] iArr2 = this.f20078g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.l(this.f20073b);
                        }
                        if (this.f20082k) {
                            this.f20081j = i10;
                        }
                        iVar.f20143x--;
                        this.f20072a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f20078g[i10];
            }
            int i16 = this.f20081j;
            int i17 = i16 + 1;
            if (this.f20082k) {
                int[] iArr3 = this.f20077f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f20077f;
            if (i16 >= iArr4.length && this.f20072a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f20077f;
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
            int[] iArr6 = this.f20077f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f20075d * 2;
                this.f20075d = i19;
                this.f20082k = false;
                this.f20081j = i16 - 1;
                this.f20079h = Arrays.copyOf(this.f20079h, i19);
                this.f20077f = Arrays.copyOf(this.f20077f, this.f20075d);
                this.f20078g = Arrays.copyOf(this.f20078g, this.f20075d);
            }
            this.f20077f[i16] = iVar.f20133c;
            this.f20079h[i16] = f10;
            int[] iArr7 = this.f20078g;
            if (i12 != -1) {
                iArr7[i16] = iArr7[i12];
                iArr7[i12] = i16;
            } else {
                iArr7[i16] = this.f20080i;
                this.f20080i = i16;
            }
            iVar.f20143x++;
            iVar.b(this.f20073b);
            this.f20072a++;
            if (!this.f20082k) {
                this.f20081j++;
            }
            int i20 = this.f20081j;
            int[] iArr8 = this.f20077f;
            if (i20 >= iArr8.length) {
                this.f20082k = true;
                this.f20081j = iArr8.length - 1;
            }
        }
    }

    @Override // k0.b.a
    public final void clear() {
        int i10 = this.f20080i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20072a; i11++) {
            i iVar = this.f20074c.f20092d[this.f20077f[i10]];
            if (iVar != null) {
                iVar.l(this.f20073b);
            }
            i10 = this.f20078g[i10];
        }
        this.f20080i = -1;
        this.f20081j = -1;
        this.f20082k = false;
        this.f20072a = 0;
    }

    @Override // k0.b.a
    public float d(b bVar, boolean z10) {
        float j10 = j(bVar.f20083a);
        f(bVar.f20083a, z10);
        b.a aVar = bVar.f20087e;
        int h10 = aVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            i a10 = aVar.a(i10);
            c(a10, aVar.j(a10) * j10, z10);
        }
        return j10;
    }

    @Override // k0.b.a
    public final void e(i iVar, float f10) {
        if (f10 == 0.0f) {
            f(iVar, true);
            return;
        }
        int i10 = this.f20080i;
        if (i10 == -1) {
            this.f20080i = 0;
            this.f20079h[0] = f10;
            this.f20077f[0] = iVar.f20133c;
            this.f20078g[0] = -1;
            iVar.f20143x++;
            iVar.b(this.f20073b);
            this.f20072a++;
            if (this.f20082k) {
                return;
            }
            int i11 = this.f20081j + 1;
            this.f20081j = i11;
            int[] iArr = this.f20077f;
            if (i11 >= iArr.length) {
                this.f20082k = true;
                this.f20081j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f20072a; i13++) {
            int i14 = this.f20077f[i10];
            int i15 = iVar.f20133c;
            if (i14 == i15) {
                this.f20079h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f20078g[i10];
        }
        int i16 = this.f20081j;
        int i17 = i16 + 1;
        if (this.f20082k) {
            int[] iArr2 = this.f20077f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f20077f;
        if (i16 >= iArr3.length && this.f20072a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f20077f;
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
        int[] iArr5 = this.f20077f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f20075d * 2;
            this.f20075d = i19;
            this.f20082k = false;
            this.f20081j = i16 - 1;
            this.f20079h = Arrays.copyOf(this.f20079h, i19);
            this.f20077f = Arrays.copyOf(this.f20077f, this.f20075d);
            this.f20078g = Arrays.copyOf(this.f20078g, this.f20075d);
        }
        this.f20077f[i16] = iVar.f20133c;
        this.f20079h[i16] = f10;
        int[] iArr6 = this.f20078g;
        if (i12 != -1) {
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            iArr6[i16] = this.f20080i;
            this.f20080i = i16;
        }
        iVar.f20143x++;
        iVar.b(this.f20073b);
        int i20 = this.f20072a + 1;
        this.f20072a = i20;
        if (!this.f20082k) {
            this.f20081j++;
        }
        int[] iArr7 = this.f20077f;
        if (i20 >= iArr7.length) {
            this.f20082k = true;
        }
        if (this.f20081j >= iArr7.length) {
            this.f20082k = true;
            this.f20081j = iArr7.length - 1;
        }
    }

    @Override // k0.b.a
    public final float f(i iVar, boolean z10) {
        if (this.f20076e == iVar) {
            this.f20076e = null;
        }
        int i10 = this.f20080i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f20072a) {
            if (this.f20077f[i10] == iVar.f20133c) {
                if (i10 == this.f20080i) {
                    this.f20080i = this.f20078g[i10];
                } else {
                    int[] iArr = this.f20078g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.l(this.f20073b);
                }
                iVar.f20143x--;
                this.f20072a--;
                this.f20077f[i10] = -1;
                if (this.f20082k) {
                    this.f20081j = i10;
                }
                return this.f20079h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f20078g[i10];
        }
        return 0.0f;
    }

    @Override // k0.b.a
    public boolean g(i iVar) {
        int i10 = this.f20080i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f20072a; i11++) {
            if (this.f20077f[i10] == iVar.f20133c) {
                return true;
            }
            i10 = this.f20078g[i10];
        }
        return false;
    }

    @Override // k0.b.a
    public int h() {
        return this.f20072a;
    }

    @Override // k0.b.a
    public float i(int i10) {
        int i11 = this.f20080i;
        for (int i12 = 0; i11 != -1 && i12 < this.f20072a; i12++) {
            if (i12 == i10) {
                return this.f20079h[i11];
            }
            i11 = this.f20078g[i11];
        }
        return 0.0f;
    }

    @Override // k0.b.a
    public final float j(i iVar) {
        int i10 = this.f20080i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20072a; i11++) {
            if (this.f20077f[i10] == iVar.f20133c) {
                return this.f20079h[i10];
            }
            i10 = this.f20078g[i10];
        }
        return 0.0f;
    }

    @Override // k0.b.a
    public void k(float f10) {
        int i10 = this.f20080i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20072a; i11++) {
            float[] fArr = this.f20079h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f20078g[i10];
        }
    }

    public String toString() {
        int i10 = this.f20080i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f20072a; i11++) {
            str = ((str + " -> ") + this.f20079h[i10] + " : ") + this.f20074c.f20092d[this.f20077f[i10]];
            i10 = this.f20078g[i10];
        }
        return str;
    }
}
