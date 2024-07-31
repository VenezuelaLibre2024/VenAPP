package p036c4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c4.c */
/* loaded from: classes.dex */
public final class C1862c extends FilterInputStream {

    /* renamed from: a */
    private final long f7784a;

    /* renamed from: b */
    private int f7785b;

    private C1862c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f7784a = j10;
    }

    /* renamed from: a */
    private int m9924a(int i10) {
        if (i10 >= 0) {
            this.f7785b += i10;
        } else if (this.f7784a - this.f7785b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f7784a + ", but read: " + this.f7785b);
        }
        return i10;
    }

    /* renamed from: b */
    public static InputStream m9925b(InputStream inputStream, long j10) {
        return new C1862c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f7784a - this.f7785b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        m9924a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return m9924a(super.read(bArr, i10, i11));
    }
}
