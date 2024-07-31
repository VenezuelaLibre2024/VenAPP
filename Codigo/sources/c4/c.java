package c4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final long f6835a;

    /* renamed from: b, reason: collision with root package name */
    private int f6836b;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f6835a = j10;
    }

    private int a(int i10) {
        if (i10 >= 0) {
            this.f6836b += i10;
        } else if (this.f6835a - this.f6836b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f6835a + ", but read: " + this.f6836b);
        }
        return i10;
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f6835a - this.f6836b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
