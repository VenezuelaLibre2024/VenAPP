package k0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Comparator;
import k0.b;

/* loaded from: classes.dex */
public class h extends k0.b {

    /* renamed from: g, reason: collision with root package name */
    private int f20121g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f20122h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f20123i;

    /* renamed from: j, reason: collision with root package name */
    private int f20124j;

    /* renamed from: k, reason: collision with root package name */
    b f20125k;

    /* renamed from: l, reason: collision with root package name */
    c f20126l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f20133c - iVar2.f20133c;
        }
    }

    /* loaded from: classes.dex */
    class b {

        /* renamed from: a, reason: collision with root package name */
        i f20128a;

        /* renamed from: b, reason: collision with root package name */
        h f20129b;

        public b(h hVar) {
            this.f20129b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f20128a.f20131a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f20139t[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f20128a.f20139t[i10] = f12;
                    } else {
                        this.f20128a.f20139t[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f20128a.f20139t;
                float f13 = fArr[i11] + (iVar.f20139t[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f20128a.f20139t[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f20128a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f20128a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f20128a.f20139t[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f20139t[i10];
                float f11 = this.f20128a.f20139t[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f20128a.f20139t, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f20128a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f20128a.f20139t[i10] + " ";
                }
            }
            return str + "] " + this.f20128a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f20121g = RecognitionOptions.ITF;
        this.f20122h = new i[RecognitionOptions.ITF];
        this.f20123i = new i[RecognitionOptions.ITF];
        this.f20124j = 0;
        this.f20125k = new b(this);
        this.f20126l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f20124j + 1;
        i[] iVarArr = this.f20122h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f20122h = iVarArr2;
            this.f20123i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f20122h;
        int i12 = this.f20124j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f20124j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f20133c > iVar.f20133c) {
            int i14 = 0;
            while (true) {
                i10 = this.f20124j;
                if (i14 >= i10) {
                    break;
                }
                this.f20123i[i14] = this.f20122h[i14];
                i14++;
            }
            Arrays.sort(this.f20123i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f20124j; i15++) {
                this.f20122h[i15] = this.f20123i[i15];
            }
        }
        iVar.f20131a = true;
        iVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f20124j) {
            if (this.f20122h[i10] == iVar) {
                while (true) {
                    int i11 = this.f20124j;
                    if (i10 >= i11 - 1) {
                        this.f20124j = i11 - 1;
                        iVar.f20131a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f20122h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // k0.b
    public void B(d dVar, k0.b bVar, boolean z10) {
        i iVar = bVar.f20083a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f20087e;
        int h10 = aVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            i a10 = aVar.a(i10);
            float i11 = aVar.i(i10);
            this.f20125k.b(a10);
            if (this.f20125k.a(iVar, i11)) {
                F(a10);
            }
            this.f20084b += bVar.f20084b * i11;
        }
        G(iVar);
    }

    @Override // k0.b, k0.d.a
    public i a(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f20124j; i11++) {
            i iVar = this.f20122h[i11];
            if (!zArr[iVar.f20133c]) {
                this.f20125k.b(iVar);
                b bVar = this.f20125k;
                if (i10 == -1) {
                    if (!bVar.c()) {
                    }
                    i10 = i11;
                } else {
                    if (!bVar.d(this.f20122h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f20122h[i10];
    }

    @Override // k0.b, k0.d.a
    public void c(i iVar) {
        this.f20125k.b(iVar);
        this.f20125k.e();
        iVar.f20139t[iVar.f20135e] = 1.0f;
        F(iVar);
    }

    @Override // k0.b, k0.d.a
    public void clear() {
        this.f20124j = 0;
        this.f20084b = 0.0f;
    }

    @Override // k0.b, k0.d.a
    public boolean isEmpty() {
        return this.f20124j == 0;
    }

    @Override // k0.b
    public String toString() {
        String str = " goal -> (" + this.f20084b + ") : ";
        for (int i10 = 0; i10 < this.f20124j; i10++) {
            this.f20125k.b(this.f20122h[i10]);
            str = str + this.f20125k + " ";
        }
        return str;
    }
}
