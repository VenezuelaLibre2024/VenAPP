package p019b1;

import java.nio.ByteBuffer;

/* renamed from: b1.c */
/* loaded from: classes.dex */
public class C1607c {

    /* renamed from: a */
    protected int f6867a;

    /* renamed from: b */
    protected ByteBuffer f6868b;

    /* renamed from: c */
    private int f6869c;

    /* renamed from: d */
    private int f6870d;

    /* renamed from: e */
    AbstractC1608d f6871e = AbstractC1608d.m8950a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m8945a(int i10) {
        return i10 + this.f6868b.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m8946b(int i10) {
        if (i10 < this.f6870d) {
            return this.f6868b.getShort(this.f6869c + i10);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m8947c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f6868b = byteBuffer;
        if (byteBuffer != null) {
            this.f6867a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f6869c = i11;
            s10 = this.f6868b.getShort(i11);
        } else {
            s10 = 0;
            this.f6867a = 0;
            this.f6869c = 0;
        }
        this.f6870d = s10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public int m8948d(int i10) {
        int i11 = i10 + this.f6867a;
        return i11 + this.f6868b.getInt(i11) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m8949e(int i10) {
        int i11 = i10 + this.f6867a;
        return this.f6868b.getInt(i11 + this.f6868b.getInt(i11));
    }
}
