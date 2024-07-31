package p109fh;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: fh.b */
/* loaded from: classes2.dex */
public final class C7350b {

    /* renamed from: a */
    private final byte[][] f16613a;

    /* renamed from: b */
    private final int f16614b;

    /* renamed from: c */
    private final int f16615c;

    public C7350b(int i10, int i11) {
        this.f16613a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f16614b = i10;
        this.f16615c = i11;
    }

    /* renamed from: a */
    public void m22092a(byte b10) {
        for (byte[] bArr : this.f16613a) {
            Arrays.fill(bArr, b10);
        }
    }

    /* renamed from: b */
    public byte m22093b(int i10, int i11) {
        return this.f16613a[i11][i10];
    }

    /* renamed from: c */
    public byte[][] m22094c() {
        return this.f16613a;
    }

    /* renamed from: d */
    public int m22095d() {
        return this.f16615c;
    }

    /* renamed from: e */
    public int m22096e() {
        return this.f16614b;
    }

    /* renamed from: f */
    public void m22097f(int i10, int i11, int i12) {
        this.f16613a[i11][i10] = (byte) i12;
    }

    /* renamed from: g */
    public void m22098g(int i10, int i11, boolean z10) {
        this.f16613a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f16614b * 2 * this.f16615c) + 2);
        for (int i10 = 0; i10 < this.f16615c; i10++) {
            byte[] bArr = this.f16613a[i10];
            for (int i11 = 0; i11 < this.f16614b; i11++) {
                byte b10 = bArr[i11];
                sb2.append(b10 != 0 ? b10 != 1 ? "  " : " 1" : " 0");
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
