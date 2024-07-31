package bh;

/* renamed from: bh.b */
/* loaded from: classes2.dex */
final class C1783b {

    /* renamed from: a */
    private final byte[] f7421a;

    /* renamed from: b */
    private int f7422b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1783b(int i10) {
        this.f7421a = new byte[i10];
    }

    /* renamed from: c */
    private void m9509c(int i10, boolean z10) {
        this.f7421a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9510a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f7422b;
            this.f7422b = i12 + 1;
            m9509c(i12, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] m9511b(int i10) {
        int length = this.f7421a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f7421a[i11 / i10];
        }
        return bArr;
    }
}
