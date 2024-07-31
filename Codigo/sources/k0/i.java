package k0;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable<i> {
    private static int C = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20131a;

    /* renamed from: b, reason: collision with root package name */
    private String f20132b;

    /* renamed from: f, reason: collision with root package name */
    public float f20136f;

    /* renamed from: u, reason: collision with root package name */
    a f20140u;

    /* renamed from: c, reason: collision with root package name */
    public int f20133c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f20134d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f20135e = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20137r = false;

    /* renamed from: s, reason: collision with root package name */
    float[] f20138s = new float[9];

    /* renamed from: t, reason: collision with root package name */
    float[] f20139t = new float[9];

    /* renamed from: v, reason: collision with root package name */
    b[] f20141v = new b[16];

    /* renamed from: w, reason: collision with root package name */
    int f20142w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f20143x = 0;

    /* renamed from: y, reason: collision with root package name */
    boolean f20144y = false;

    /* renamed from: z, reason: collision with root package name */
    int f20145z = -1;
    float A = 0.0f;
    HashSet<b> B = null;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f20140u = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i() {
        C++;
    }

    public final void b(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f20142w;
            if (i10 >= i11) {
                b[] bVarArr = this.f20141v;
                if (i11 >= bVarArr.length) {
                    this.f20141v = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f20141v;
                int i12 = this.f20142w;
                bVarArr2[i12] = bVar;
                this.f20142w = i12 + 1;
                return;
            }
            if (this.f20141v[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f20133c - iVar.f20133c;
    }

    public final void l(b bVar) {
        int i10 = this.f20142w;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f20141v[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f20141v;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f20142w--;
                return;
            }
            i11++;
        }
    }

    public void m() {
        this.f20132b = null;
        this.f20140u = a.UNKNOWN;
        this.f20135e = 0;
        this.f20133c = -1;
        this.f20134d = -1;
        this.f20136f = 0.0f;
        this.f20137r = false;
        this.f20144y = false;
        this.f20145z = -1;
        this.A = 0.0f;
        int i10 = this.f20142w;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20141v[i11] = null;
        }
        this.f20142w = 0;
        this.f20143x = 0;
        this.f20131a = false;
        Arrays.fill(this.f20139t, 0.0f);
    }

    public void n(d dVar, float f10) {
        this.f20136f = f10;
        this.f20137r = true;
        this.f20144y = false;
        this.f20145z = -1;
        this.A = 0.0f;
        int i10 = this.f20142w;
        this.f20134d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20141v[i11].A(dVar, this, false);
        }
        this.f20142w = 0;
    }

    public void o(a aVar, String str) {
        this.f20140u = aVar;
    }

    public final void p(d dVar, b bVar) {
        int i10 = this.f20142w;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20141v[i11].B(dVar, bVar, false);
        }
        this.f20142w = 0;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f20132b != null) {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f20132b);
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f20133c);
        }
        return sb2.toString();
    }
}
