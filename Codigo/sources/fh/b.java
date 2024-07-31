package fh;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f15190a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15191b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15192c;

    public b(int i10, int i11) {
        this.f15190a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f15191b = i10;
        this.f15192c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f15190a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f15190a[i11][i10];
    }

    public byte[][] c() {
        return this.f15190a;
    }

    public int d() {
        return this.f15192c;
    }

    public int e() {
        return this.f15191b;
    }

    public void f(int i10, int i11, int i12) {
        this.f15190a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f15190a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f15191b * 2 * this.f15192c) + 2);
        for (int i10 = 0; i10 < this.f15192c; i10++) {
            byte[] bArr = this.f15190a[i10];
            for (int i11 = 0; i11 < this.f15191b; i11++) {
                byte b10 = bArr[i11];
                sb2.append(b10 != 0 ? b10 != 1 ? "  " : " 1" : " 0");
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
