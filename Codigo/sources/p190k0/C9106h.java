package p190k0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Comparator;
import p190k0.C9100b;

/* renamed from: k0.h */
/* loaded from: classes.dex */
public class C9106h extends C9100b {

    /* renamed from: g */
    private int f21900g;

    /* renamed from: h */
    private C9107i[] f21901h;

    /* renamed from: i */
    private C9107i[] f21902i;

    /* renamed from: j */
    private int f21903j;

    /* renamed from: k */
    b f21904k;

    /* renamed from: l */
    C9101c f21905l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.h$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<C9107i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C9107i c9107i, C9107i c9107i2) {
            return c9107i.f21915c - c9107i2.f21915c;
        }
    }

    /* renamed from: k0.h$b */
    /* loaded from: classes.dex */
    class b {

        /* renamed from: a */
        C9107i f21907a;

        /* renamed from: b */
        C9106h f21908b;

        public b(C9106h c9106h) {
            this.f21908b = c9106h;
        }

        /* renamed from: a */
        public boolean m26805a(C9107i c9107i, float f10) {
            boolean z10 = true;
            if (!this.f21907a.f21913a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = c9107i.f21921t[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f21907a.f21921t[i10] = f12;
                    } else {
                        this.f21907a.f21921t[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f21907a.f21921t;
                float f13 = fArr[i11] + (c9107i.f21921t[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f21907a.f21921t[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                C9106h.this.m26803G(this.f21907a);
            }
            return false;
        }

        /* renamed from: b */
        public void m26806b(C9107i c9107i) {
            this.f21907a = c9107i;
        }

        /* renamed from: c */
        public final boolean m26807c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f21907a.f21921t[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m26808d(C9107i c9107i) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = c9107i.f21921t[i10];
                float f11 = this.f21907a.f21921t[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m26809e() {
            Arrays.fill(this.f21907a.f21921t, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f21907a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f21907a.f21921t[i10] + " ";
                }
            }
            return str + "] " + this.f21907a;
        }
    }

    public C9106h(C9101c c9101c) {
        super(c9101c);
        this.f21900g = RecognitionOptions.ITF;
        this.f21901h = new C9107i[RecognitionOptions.ITF];
        this.f21902i = new C9107i[RecognitionOptions.ITF];
        this.f21903j = 0;
        this.f21904k = new b(this);
        this.f21905l = c9101c;
    }

    /* renamed from: F */
    private final void m26802F(C9107i c9107i) {
        int i10;
        int i11 = this.f21903j + 1;
        C9107i[] c9107iArr = this.f21901h;
        if (i11 > c9107iArr.length) {
            C9107i[] c9107iArr2 = (C9107i[]) Arrays.copyOf(c9107iArr, c9107iArr.length * 2);
            this.f21901h = c9107iArr2;
            this.f21902i = (C9107i[]) Arrays.copyOf(c9107iArr2, c9107iArr2.length * 2);
        }
        C9107i[] c9107iArr3 = this.f21901h;
        int i12 = this.f21903j;
        c9107iArr3[i12] = c9107i;
        int i13 = i12 + 1;
        this.f21903j = i13;
        if (i13 > 1 && c9107iArr3[i13 - 1].f21915c > c9107i.f21915c) {
            int i14 = 0;
            while (true) {
                i10 = this.f21903j;
                if (i14 >= i10) {
                    break;
                }
                this.f21902i[i14] = this.f21901h[i14];
                i14++;
            }
            Arrays.sort(this.f21902i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f21903j; i15++) {
                this.f21901h[i15] = this.f21902i[i15];
            }
        }
        c9107i.f21913a = true;
        c9107i.m26811b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m26803G(C9107i c9107i) {
        int i10 = 0;
        while (i10 < this.f21903j) {
            if (this.f21901h[i10] == c9107i) {
                while (true) {
                    int i11 = this.f21903j;
                    if (i10 >= i11 - 1) {
                        this.f21903j = i11 - 1;
                        c9107i.f21913a = false;
                        return;
                    } else {
                        C9107i[] c9107iArr = this.f21901h;
                        int i12 = i10 + 1;
                        c9107iArr[i10] = c9107iArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p190k0.C9100b
    /* renamed from: B */
    public void mo26741B(C9102d c9102d, C9100b c9100b, boolean z10) {
        C9107i c9107i = c9100b.f21862a;
        if (c9107i == null) {
            return;
        }
        C9100b.a aVar = c9100b.f21866e;
        int mo26734h = aVar.mo26734h();
        for (int i10 = 0; i10 < mo26734h; i10++) {
            C9107i mo26727a = aVar.mo26727a(i10);
            float mo26735i = aVar.mo26735i(i10);
            this.f21904k.m26806b(mo26727a);
            if (this.f21904k.m26805a(c9107i, mo26735i)) {
                m26802F(mo26727a);
            }
            this.f21863b += c9100b.f21863b * mo26735i;
        }
        m26803G(c9107i);
    }

    @Override // p190k0.C9100b, p190k0.C9102d.a
    /* renamed from: a */
    public C9107i mo26744a(C9102d c9102d, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f21903j; i11++) {
            C9107i c9107i = this.f21901h[i11];
            if (!zArr[c9107i.f21915c]) {
                this.f21904k.m26806b(c9107i);
                b bVar = this.f21904k;
                if (i10 == -1) {
                    if (!bVar.m26807c()) {
                    }
                    i10 = i11;
                } else {
                    if (!bVar.m26808d(this.f21901h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f21901h[i10];
    }

    @Override // p190k0.C9100b, p190k0.C9102d.a
    /* renamed from: c */
    public void mo26746c(C9107i c9107i) {
        this.f21904k.m26806b(c9107i);
        this.f21904k.m26809e();
        c9107i.f21921t[c9107i.f21917e] = 1.0f;
        m26802F(c9107i);
    }

    @Override // p190k0.C9100b, p190k0.C9102d.a
    public void clear() {
        this.f21903j = 0;
        this.f21863b = 0.0f;
    }

    @Override // p190k0.C9100b, p190k0.C9102d.a
    public boolean isEmpty() {
        return this.f21903j == 0;
    }

    @Override // p190k0.C9100b
    public String toString() {
        String str = " goal -> (" + this.f21863b + ") : ";
        for (int i10 = 0; i10 < this.f21903j; i10++) {
            this.f21904k.m26806b(this.f21901h[i10]);
            str = str + this.f21904k + " ";
        }
        return str;
    }
}
