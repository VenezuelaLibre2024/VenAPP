package p190k0;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: k0.i */
/* loaded from: classes.dex */
public class C9107i implements Comparable<C9107i> {

    /* renamed from: C */
    private static int f21910C = 1;

    /* renamed from: a */
    public boolean f21913a;

    /* renamed from: b */
    private String f21914b;

    /* renamed from: f */
    public float f21918f;

    /* renamed from: u */
    a f21922u;

    /* renamed from: c */
    public int f21915c = -1;

    /* renamed from: d */
    int f21916d = -1;

    /* renamed from: e */
    public int f21917e = 0;

    /* renamed from: r */
    public boolean f21919r = false;

    /* renamed from: s */
    float[] f21920s = new float[9];

    /* renamed from: t */
    float[] f21921t = new float[9];

    /* renamed from: v */
    C9100b[] f21923v = new C9100b[16];

    /* renamed from: w */
    int f21924w = 0;

    /* renamed from: x */
    public int f21925x = 0;

    /* renamed from: y */
    boolean f21926y = false;

    /* renamed from: z */
    int f21927z = -1;

    /* renamed from: A */
    float f21911A = 0.0f;

    /* renamed from: B */
    HashSet<C9100b> f21912B = null;

    /* renamed from: k0.i$a */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C9107i(a aVar, String str) {
        this.f21922u = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m26810i() {
        f21910C++;
    }

    /* renamed from: b */
    public final void m26811b(C9100b c9100b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f21924w;
            if (i10 >= i11) {
                C9100b[] c9100bArr = this.f21923v;
                if (i11 >= c9100bArr.length) {
                    this.f21923v = (C9100b[]) Arrays.copyOf(c9100bArr, c9100bArr.length * 2);
                }
                C9100b[] c9100bArr2 = this.f21923v;
                int i12 = this.f21924w;
                c9100bArr2[i12] = c9100b;
                this.f21924w = i12 + 1;
                return;
            }
            if (this.f21923v[i10] == c9100b) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(C9107i c9107i) {
        return this.f21915c - c9107i.f21915c;
    }

    /* renamed from: l */
    public final void m26813l(C9100b c9100b) {
        int i10 = this.f21924w;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f21923v[i11] == c9100b) {
                while (i11 < i10 - 1) {
                    C9100b[] c9100bArr = this.f21923v;
                    int i12 = i11 + 1;
                    c9100bArr[i11] = c9100bArr[i12];
                    i11 = i12;
                }
                this.f21924w--;
                return;
            }
            i11++;
        }
    }

    /* renamed from: m */
    public void m26814m() {
        this.f21914b = null;
        this.f21922u = a.UNKNOWN;
        this.f21917e = 0;
        this.f21915c = -1;
        this.f21916d = -1;
        this.f21918f = 0.0f;
        this.f21919r = false;
        this.f21926y = false;
        this.f21927z = -1;
        this.f21911A = 0.0f;
        int i10 = this.f21924w;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21923v[i11] = null;
        }
        this.f21924w = 0;
        this.f21925x = 0;
        this.f21913a = false;
        Arrays.fill(this.f21921t, 0.0f);
    }

    /* renamed from: n */
    public void m26815n(C9102d c9102d, float f10) {
        this.f21918f = f10;
        this.f21919r = true;
        this.f21926y = false;
        this.f21927z = -1;
        this.f21911A = 0.0f;
        int i10 = this.f21924w;
        this.f21916d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21923v[i11].m26740A(c9102d, this, false);
        }
        this.f21924w = 0;
    }

    /* renamed from: o */
    public void m26816o(a aVar, String str) {
        this.f21922u = aVar;
    }

    /* renamed from: p */
    public final void m26817p(C9102d c9102d, C9100b c9100b) {
        int i10 = this.f21924w;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21923v[i11].mo26741B(c9102d, c9100b, false);
        }
        this.f21924w = 0;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f21914b != null) {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f21914b);
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f21915c);
        }
        return sb2.toString();
    }
}
