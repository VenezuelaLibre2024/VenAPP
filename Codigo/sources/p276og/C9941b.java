package p276og;

import p276og.C9944e;

/* renamed from: og.b */
/* loaded from: classes2.dex */
final class C9941b {

    /* renamed from: a */
    private final int f24477a;

    /* renamed from: b */
    private final byte[] f24478b;

    private C9941b(int i10, byte[] bArr) {
        this.f24477a = i10;
        this.f24478b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C9941b[] m29705b(byte[] bArr, C9944e c9944e) {
        C9944e.c m29724d = c9944e.m29724d();
        C9944e.b[] m29731a = m29724d.m29731a();
        int i10 = 0;
        for (C9944e.b bVar : m29731a) {
            i10 += bVar.m29729a();
        }
        C9941b[] c9941bArr = new C9941b[i10];
        int i11 = 0;
        for (C9944e.b bVar2 : m29731a) {
            int i12 = 0;
            while (i12 < bVar2.m29729a()) {
                int m29730b = bVar2.m29730b();
                c9941bArr[i11] = new C9941b(m29730b, new byte[m29724d.m29732b() + m29730b]);
                i12++;
                i11++;
            }
        }
        int length = c9941bArr[0].f24478b.length - m29724d.m29732b();
        int i13 = length - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                c9941bArr[i16].f24478b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        boolean z10 = c9944e.m29728i() == 24;
        int i17 = z10 ? 8 : i11;
        int i18 = 0;
        while (i18 < i17) {
            c9941bArr[i18].f24478b[i13] = bArr[i14];
            i18++;
            i14++;
        }
        int length2 = c9941bArr[0].f24478b.length;
        while (length < length2) {
            int i19 = 0;
            while (i19 < i11) {
                int i20 = z10 ? (i19 + 8) % i11 : i19;
                c9941bArr[i20].f24478b[(!z10 || i20 <= 7) ? length : length - 1] = bArr[i14];
                i19++;
                i14++;
            }
            length++;
        }
        if (i14 == bArr.length) {
            return c9941bArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m29706a() {
        return this.f24478b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m29707c() {
        return this.f24477a;
    }
}
