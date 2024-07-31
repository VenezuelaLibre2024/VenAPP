package md;

import java.io.OutputStream;

/* renamed from: md.b */
/* loaded from: classes.dex */
final class C9567b extends OutputStream {

    /* renamed from: a */
    private long f23278a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m28454a() {
        return this.f23278a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f23278a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f23278a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f23278a += i11;
    }
}
