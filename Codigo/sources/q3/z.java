package q3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class z extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private volatile byte[] f23496a;

    /* renamed from: b, reason: collision with root package name */
    private int f23497b;

    /* renamed from: c, reason: collision with root package name */
    private int f23498c;

    /* renamed from: d, reason: collision with root package name */
    private int f23499d;

    /* renamed from: e, reason: collision with root package name */
    private int f23500e;

    /* renamed from: f, reason: collision with root package name */
    private final k3.b f23501f;

    /* loaded from: classes.dex */
    static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public z(InputStream inputStream, k3.b bVar) {
        this(inputStream, bVar, 65536);
    }

    z(InputStream inputStream, k3.b bVar, int i10) {
        super(inputStream);
        this.f23499d = -1;
        this.f23501f = bVar;
        this.f23496a = (byte[]) bVar.c(i10, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f23499d;
        if (i10 != -1) {
            int i11 = this.f23500e - i10;
            int i12 = this.f23498c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f23497b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f23501f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f23496a = bArr2;
                    this.f23501f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f23500e - this.f23499d;
                this.f23500e = i13;
                this.f23499d = 0;
                this.f23497b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f23500e;
                if (read > 0) {
                    i14 += read;
                }
                this.f23497b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f23499d = -1;
            this.f23500e = 0;
            this.f23497b = read2;
        }
        return read2;
    }

    private static IOException f() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f23496a == null || inputStream == null) {
            throw f();
        }
        return (this.f23497b - this.f23500e) + inputStream.available();
    }

    public synchronized void b() {
        this.f23498c = this.f23496a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f23496a != null) {
            this.f23501f.put(this.f23496a);
            this.f23496a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        if (this.f23496a != null) {
            this.f23501f.put(this.f23496a);
            this.f23496a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f23498c = Math.max(this.f23498c, i10);
        this.f23499d = this.f23500e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f23496a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw f();
        }
        if (this.f23500e >= this.f23497b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f23496a && (bArr = this.f23496a) == null) {
            throw f();
        }
        int i10 = this.f23497b;
        int i11 = this.f23500e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f23500e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f23496a;
        if (bArr2 == null) {
            throw f();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw f();
        }
        int i14 = this.f23500e;
        int i15 = this.f23497b;
        if (i14 < i15) {
            int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f23500e += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f23499d == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f23496a && (bArr2 = this.f23496a) == null) {
                    throw f();
                }
                int i17 = this.f23497b;
                int i18 = this.f23500e;
                i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f23500e += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f23496a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f23499d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f23500e + " markLimit: " + this.f23498c);
        }
        this.f23500e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f23496a;
        if (bArr == null) {
            throw f();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw f();
        }
        int i10 = this.f23497b;
        int i11 = this.f23500e;
        if (i10 - i11 >= j10) {
            this.f23500e = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f23500e = i10;
        if (this.f23499d == -1 || j10 > this.f23498c) {
            long skip = inputStream.skip(j10 - j11);
            if (skip > 0) {
                this.f23499d = -1;
            }
            return j11 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f23497b;
        int i13 = this.f23500e;
        if (i12 - i13 >= j10 - j11) {
            this.f23500e = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f23500e = i12;
        return j12;
    }
}
