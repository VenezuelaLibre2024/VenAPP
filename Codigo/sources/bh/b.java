package bh;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f6499a;

    /* renamed from: b, reason: collision with root package name */
    private int f6500b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10) {
        this.f6499a = new byte[i10];
    }

    private void c(int i10, boolean z10) {
        this.f6499a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f6500b;
            this.f6500b = i12 + 1;
            c(i12, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b(int i10) {
        int length = this.f6499a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f6499a[i11 / i10];
        }
        return bArr;
    }
}
