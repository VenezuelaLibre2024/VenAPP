package b1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f6005a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f6006b;

    /* renamed from: c, reason: collision with root package name */
    private int f6007c;

    /* renamed from: d, reason: collision with root package name */
    private int f6008d;

    /* renamed from: e, reason: collision with root package name */
    d f6009e = d.a();

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f6006b.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f6008d) {
            return this.f6006b.getShort(this.f6007c + i10);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f6006b = byteBuffer;
        if (byteBuffer != null) {
            this.f6005a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f6007c = i11;
            s10 = this.f6006b.getShort(i11);
        } else {
            s10 = 0;
            this.f6005a = 0;
            this.f6007c = 0;
        }
        this.f6008d = s10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f6005a;
        return i11 + this.f6006b.getInt(i11) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f6005a;
        return this.f6006b.getInt(i11 + this.f6006b.getInt(i11));
    }
}
