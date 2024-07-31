package bh;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b[] f6495a;

    /* renamed from: b, reason: collision with root package name */
    private int f6496b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6497c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6498d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f6495a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f6495a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f6498d = i11 * 17;
        this.f6497c = i10;
        this.f6496b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a() {
        return this.f6495a[this.f6496b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f6497c * i11, this.f6498d * i10);
        int i12 = this.f6497c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f6495a[i13 / i11].b(i10);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f6496b++;
    }
}
