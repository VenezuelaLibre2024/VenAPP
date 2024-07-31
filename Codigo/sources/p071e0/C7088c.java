package p071e0;

import p051d0.C6807b;
import p051d0.C6810e;

/* renamed from: e0.c */
/* loaded from: classes.dex */
public class C7088c {

    /* renamed from: a */
    private final boolean f15705a;

    public C7088c() {
        this.f15705a = C6807b.m19692a(C6810e.class) != null;
    }

    /* renamed from: a */
    public int m20858a(byte[] bArr) {
        byte b10;
        if (!this.f15705a) {
            return bArr.length;
        }
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            int i11 = i10 + 2;
            int i12 = ((bArr[i11] & 255) << 8) | (bArr[i10 + 3] & 255);
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                while (true) {
                    int i13 = i11 + 2;
                    if (i13 > bArr.length) {
                        return bArr.length;
                    }
                    if (bArr[i11] == -1 && bArr[i11 + 1] == -39) {
                        return i13;
                    }
                    i11++;
                }
            } else {
                i10 += i12 + 2;
            }
        }
        return bArr.length;
    }
}
