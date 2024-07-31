package og;

import dg.h;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final kg.b f22541a;

    /* renamed from: b, reason: collision with root package name */
    private final kg.b f22542b;

    /* renamed from: c, reason: collision with root package name */
    private final e f22543c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(kg.b bVar) {
        int j10 = bVar.j();
        if (j10 < 8 || j10 > 144 || (j10 & 1) != 0) {
            throw h.a();
        }
        this.f22543c = j(bVar);
        kg.b a10 = a(bVar);
        this.f22541a = a10;
        this.f22542b = new kg.b(a10.m(), a10.j());
    }

    private kg.b a(kg.b bVar) {
        int f10 = this.f22543c.f();
        int e10 = this.f22543c.e();
        if (bVar.j() != f10) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int c10 = this.f22543c.c();
        int b10 = this.f22543c.b();
        int i10 = f10 / c10;
        int i11 = e10 / b10;
        kg.b bVar2 = new kg.b(i11 * b10, i10 * c10);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * c10;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * b10;
                for (int i16 = 0; i16 < c10; i16++) {
                    int i17 = ((c10 + 2) * i12) + 1 + i16;
                    int i18 = i13 + i16;
                    for (int i19 = 0; i19 < b10; i19++) {
                        if (bVar.g(((b10 + 2) * i14) + 1 + i19, i17)) {
                            bVar2.r(i15 + i19, i18);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    private int d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        if (h(i12, 1, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i12, 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 1;
        if (h(0, i17, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(1, i17, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(2, i17, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return h(3, i17, i10, i11) ? i20 | 1 : i20;
    }

    private int e(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 4, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 3, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i11 - 1;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        return h(1, i18, i10, i11) ? i19 | 1 : i19;
    }

    private int f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        if (h(i12, i14, i10, i11)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i11 - 3;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i11 - 2;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(0, i14, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(1, i16, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(1, i18, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(1, i14, i10, i11) ? i22 | 1 : i22;
    }

    private int g(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i11 - 1;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (h(1, i16, i10, i11)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(2, i16, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return h(3, i16, i10, i11) ? i19 | 1 : i19;
    }

    private boolean h(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        if (i10 >= i12) {
            i10 -= i12;
        }
        this.f22542b.r(i11, i10);
        return this.f22541a.g(i11, i10);
    }

    private int i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (h(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (h(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (h(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return h(i10, i11, i12, i13) ? i24 | 1 : i24;
    }

    private static e j(kg.b bVar) {
        return e.h(bVar.j(), bVar.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e b() {
        return this.f22543c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] c() {
        byte[] bArr = new byte[this.f22543c.g()];
        int j10 = this.f22541a.j();
        int m10 = this.f22541a.m();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 4;
        while (true) {
            if (i12 == j10 && i10 == 0 && !z10) {
                bArr[i11] = (byte) d(j10, m10);
                i12 -= 2;
                i10 += 2;
                i11++;
                z10 = true;
            } else {
                int i13 = j10 - 2;
                if (i12 == i13 && i10 == 0 && (m10 & 3) != 0 && !z11) {
                    bArr[i11] = (byte) e(j10, m10);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z11 = true;
                } else if (i12 == j10 + 4 && i10 == 2 && (m10 & 7) == 0 && !z12) {
                    bArr[i11] = (byte) f(j10, m10);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z12 = true;
                } else if (i12 == i13 && i10 == 0 && (m10 & 7) == 4 && !z13) {
                    bArr[i11] = (byte) g(j10, m10);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z13 = true;
                } else {
                    do {
                        if (i12 < j10 && i10 >= 0 && !this.f22542b.g(i10, i12)) {
                            bArr[i11] = (byte) i(i12, i10, j10, m10);
                            i11++;
                        }
                        i12 -= 2;
                        i10 += 2;
                        if (i12 < 0) {
                            break;
                        }
                    } while (i10 < m10);
                    int i14 = i12 + 1;
                    int i15 = i10 + 3;
                    do {
                        if (i14 >= 0 && i15 < m10 && !this.f22542b.g(i15, i14)) {
                            bArr[i11] = (byte) i(i14, i15, j10, m10);
                            i11++;
                        }
                        i14 += 2;
                        i15 -= 2;
                        if (i14 >= j10) {
                            break;
                        }
                    } while (i15 >= 0);
                    i12 = i14 + 3;
                    i10 = i15 + 1;
                }
            }
            if (i12 >= j10 && i10 >= m10) {
                break;
            }
        }
        if (i11 == this.f22543c.g()) {
            return bArr;
        }
        throw h.a();
    }
}
