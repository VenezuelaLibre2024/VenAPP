package bh;

import java.lang.reflect.Array;

/* renamed from: bh.a */
/* loaded from: classes2.dex */
public final class C1782a {

    /* renamed from: a */
    private final C1783b[] f7417a;

    /* renamed from: b */
    private int f7418b;

    /* renamed from: c */
    private final int f7419c;

    /* renamed from: d */
    private final int f7420d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1782a(int i10, int i11) {
        C1783b[] c1783bArr = new C1783b[i10];
        this.f7417a = c1783bArr;
        int length = c1783bArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f7417a[i12] = new C1783b(((i11 + 4) * 17) + 1);
        }
        this.f7420d = i11 * 17;
        this.f7419c = i10;
        this.f7418b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C1783b m9506a() {
        return this.f7417a[this.f7418b];
    }

    /* renamed from: b */
    public byte[][] m9507b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f7419c * i11, this.f7420d * i10);
        int i12 = this.f7419c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f7417a[i13 / i11].m9511b(i10);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m9508c() {
        this.f7418b++;
    }
}
