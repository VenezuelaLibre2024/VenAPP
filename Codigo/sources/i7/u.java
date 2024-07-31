package i7;

import java.util.Arrays;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final int f17514a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17515b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17516c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f17517d;

    /* renamed from: e, reason: collision with root package name */
    public int f17518e;

    public u(int i10, int i11) {
        this.f17514a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f17517d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f17515b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f17517d;
            int length = bArr2.length;
            int i13 = this.f17518e;
            if (length < i13 + i12) {
                this.f17517d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f17517d, this.f17518e, i12);
            this.f17518e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f17515b) {
            return false;
        }
        this.f17518e -= i10;
        this.f17515b = false;
        this.f17516c = true;
        return true;
    }

    public boolean c() {
        return this.f17516c;
    }

    public void d() {
        this.f17515b = false;
        this.f17516c = false;
    }

    public void e(int i10) {
        t8.a.g(!this.f17515b);
        boolean z10 = i10 == this.f17514a;
        this.f17515b = z10;
        if (z10) {
            this.f17518e = 3;
            this.f17516c = false;
        }
    }
}
