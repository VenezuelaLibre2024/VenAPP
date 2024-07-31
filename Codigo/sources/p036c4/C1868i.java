package p036c4;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: c4.i */
/* loaded from: classes.dex */
public class C1868i extends FilterInputStream {

    /* renamed from: a */
    private int f7800a;

    public C1868i(InputStream inputStream) {
        super(inputStream);
        this.f7800a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    private long m9944a(long j10) {
        int i10 = this.f7800a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    /* renamed from: b */
    private void m9945b(long j10) {
        int i10 = this.f7800a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f7800a = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f7800a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f7800a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m9944a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m9945b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int m9944a = (int) m9944a(i11);
        if (m9944a == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, m9944a);
        m9945b(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f7800a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long m9944a = m9944a(j10);
        if (m9944a == -1) {
            return 0L;
        }
        long skip = super.skip(m9944a);
        m9945b(skip);
        return skip;
    }
}
