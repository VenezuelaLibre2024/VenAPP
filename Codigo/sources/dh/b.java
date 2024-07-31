package dh;

import dh.j;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f14161a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14162b;

    private b(int i10, byte[] bArr) {
        this.f14161a = i10;
        this.f14162b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length != jVar.h()) {
            throw new IllegalArgumentException();
        }
        j.b f10 = jVar.f(fVar);
        j.a[] a10 = f10.a();
        int i10 = 0;
        for (j.a aVar : a10) {
            i10 += aVar.a();
        }
        b[] bVarArr = new b[i10];
        int i11 = 0;
        for (j.a aVar2 : a10) {
            int i12 = 0;
            while (i12 < aVar2.a()) {
                int b10 = aVar2.b();
                bVarArr[i11] = new b(b10, new byte[f10.b() + b10]);
                i12++;
                i11++;
            }
        }
        int length = bVarArr[0].f14162b.length;
        int i13 = i10 - 1;
        while (i13 >= 0 && bVarArr[i13].f14162b.length != length) {
            i13--;
        }
        int i14 = i13 + 1;
        int b11 = length - f10.b();
        int i15 = 0;
        for (int i16 = 0; i16 < b11; i16++) {
            int i17 = 0;
            while (i17 < i11) {
                bVarArr[i17].f14162b[i16] = bArr[i15];
                i17++;
                i15++;
            }
        }
        int i18 = i14;
        while (i18 < i11) {
            bVarArr[i18].f14162b[b11] = bArr[i15];
            i18++;
            i15++;
        }
        int length2 = bVarArr[0].f14162b.length;
        while (b11 < length2) {
            int i19 = 0;
            while (i19 < i11) {
                bVarArr[i19].f14162b[i19 < i14 ? b11 : b11 + 1] = bArr[i15];
                i19++;
                i15++;
            }
            b11++;
        }
        return bVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] a() {
        return this.f14162b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f14161a;
    }
}
