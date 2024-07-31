package sg;

import dg.d;
import dg.h;
import java.util.Map;
import mg.e;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final mg.c f25605a = new mg.c(mg.a.f21493o);

    private void a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[i14 / i15];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f25605a.a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (e unused) {
            throw d.a();
        }
    }

    public kg.e b(kg.b bVar, Map<dg.e, ?> map) {
        int i10;
        byte[] a10 = new a(bVar).a();
        a(a10, 0, 10, 10, 0);
        int i11 = a10[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            a(a10, 20, 84, 40, 1);
            a(a10, 20, 84, 40, 2);
            i10 = 94;
        } else {
            if (i11 != 5) {
                throw h.a();
            }
            a(a10, 20, 68, 56, 1);
            a(a10, 20, 68, 56, 2);
            i10 = 78;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(a10, 0, bArr, 0, 10);
        System.arraycopy(a10, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, i11);
    }
}
