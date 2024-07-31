package p067dh;

import p067dh.C6971j;

/* renamed from: dh.b */
/* loaded from: classes2.dex */
final class C6963b {

    /* renamed from: a */
    private final int f15515a;

    /* renamed from: b */
    private final byte[] f15516b;

    private C6963b(int i10, byte[] bArr) {
        this.f15515a = i10;
        this.f15516b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6963b[] m20129b(byte[] bArr, C6971j c6971j, EnumC6967f enumC6967f) {
        if (bArr.length != c6971j.m20164h()) {
            throw new IllegalArgumentException();
        }
        C6971j.b m20163f = c6971j.m20163f(enumC6967f);
        C6971j.a[] m20168a = m20163f.m20168a();
        int i10 = 0;
        for (C6971j.a aVar : m20168a) {
            i10 += aVar.m20166a();
        }
        C6963b[] c6963bArr = new C6963b[i10];
        int i11 = 0;
        for (C6971j.a aVar2 : m20168a) {
            int i12 = 0;
            while (i12 < aVar2.m20166a()) {
                int m20167b = aVar2.m20167b();
                c6963bArr[i11] = new C6963b(m20167b, new byte[m20163f.m20169b() + m20167b]);
                i12++;
                i11++;
            }
        }
        int length = c6963bArr[0].f15516b.length;
        int i13 = i10 - 1;
        while (i13 >= 0 && c6963bArr[i13].f15516b.length != length) {
            i13--;
        }
        int i14 = i13 + 1;
        int m20169b = length - m20163f.m20169b();
        int i15 = 0;
        for (int i16 = 0; i16 < m20169b; i16++) {
            int i17 = 0;
            while (i17 < i11) {
                c6963bArr[i17].f15516b[i16] = bArr[i15];
                i17++;
                i15++;
            }
        }
        int i18 = i14;
        while (i18 < i11) {
            c6963bArr[i18].f15516b[m20169b] = bArr[i15];
            i18++;
            i15++;
        }
        int length2 = c6963bArr[0].f15516b.length;
        while (m20169b < length2) {
            int i19 = 0;
            while (i19 < i11) {
                c6963bArr[i19].f15516b[i19 < i14 ? m20169b : m20169b + 1] = bArr[i15];
                i19++;
                i15++;
            }
            m20169b++;
        }
        return c6963bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m20130a() {
        return this.f15516b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20131c() {
        return this.f15515a;
    }
}
