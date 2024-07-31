package p441xb;

import java.util.Arrays;
import p419wb.C12139k;

/* renamed from: xb.a */
/* loaded from: classes2.dex */
public final class C12413a {

    /* renamed from: a */
    private final byte[] f33295a;

    private C12413a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f33295a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    /* renamed from: a */
    public static C12413a m40067a(byte[] bArr) {
        if (bArr != null) {
            return m40068b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: b */
    public static C12413a m40068b(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            return new C12413a(bArr, i10, i11);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: c */
    public int m40069c() {
        return this.f33295a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12413a) {
            return Arrays.equals(((C12413a) obj).f33295a, this.f33295a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f33295a);
    }

    public String toString() {
        return "Bytes(" + C12139k.m38899b(this.f33295a) + ")";
    }
}
