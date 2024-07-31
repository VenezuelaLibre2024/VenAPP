package p302q3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p193k3.InterfaceC9139b;

/* renamed from: q3.z */
/* loaded from: classes.dex */
public class C10260z extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f25464a;

    /* renamed from: b */
    private int f25465b;

    /* renamed from: c */
    private int f25466c;

    /* renamed from: d */
    private int f25467d;

    /* renamed from: e */
    private int f25468e;

    /* renamed from: f */
    private final InterfaceC9139b f25469f;

    /* renamed from: q3.z$a */
    /* loaded from: classes.dex */
    static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public C10260z(InputStream inputStream, InterfaceC9139b interfaceC9139b) {
        this(inputStream, interfaceC9139b, 65536);
    }

    C10260z(InputStream inputStream, InterfaceC9139b interfaceC9139b, int i10) {
        super(inputStream);
        this.f25467d = -1;
        this.f25469f = interfaceC9139b;
        this.f25464a = (byte[]) interfaceC9139b.mo26943c(i10, byte[].class);
    }

    /* renamed from: a */
    private int m30715a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f25467d;
        if (i10 != -1) {
            int i11 = this.f25468e - i10;
            int i12 = this.f25466c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f25465b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f25469f.mo26943c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f25464a = bArr2;
                    this.f25469f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f25468e - this.f25467d;
                this.f25468e = i13;
                this.f25467d = 0;
                this.f25465b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f25468e;
                if (read > 0) {
                    i14 += read;
                }
                this.f25465b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f25467d = -1;
            this.f25468e = 0;
            this.f25465b = read2;
        }
        return read2;
    }

    /* renamed from: f */
    private static IOException m30716f() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f25464a == null || inputStream == null) {
            throw m30716f();
        }
        return (this.f25465b - this.f25468e) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void m30717b() {
        this.f25466c = this.f25464a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25464a != null) {
            this.f25469f.put(this.f25464a);
            this.f25464a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: e */
    public synchronized void m30718e() {
        if (this.f25464a != null) {
            this.f25469f.put(this.f25464a);
            this.f25464a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f25466c = Math.max(this.f25466c, i10);
        this.f25467d = this.f25468e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f25464a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m30716f();
        }
        if (this.f25468e >= this.f25465b && m30715a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f25464a && (bArr = this.f25464a) == null) {
            throw m30716f();
        }
        int i10 = this.f25465b;
        int i11 = this.f25468e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f25468e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f25464a;
        if (bArr2 == null) {
            throw m30716f();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m30716f();
        }
        int i14 = this.f25468e;
        int i15 = this.f25465b;
        if (i14 < i15) {
            int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f25468e += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f25467d == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (m30715a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f25464a && (bArr2 = this.f25464a) == null) {
                    throw m30716f();
                }
                int i17 = this.f25465b;
                int i18 = this.f25468e;
                i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f25468e += i13;
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
        if (this.f25464a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f25467d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f25468e + " markLimit: " + this.f25466c);
        }
        this.f25468e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f25464a;
        if (bArr == null) {
            throw m30716f();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m30716f();
        }
        int i10 = this.f25465b;
        int i11 = this.f25468e;
        if (i10 - i11 >= j10) {
            this.f25468e = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f25468e = i10;
        if (this.f25467d == -1 || j10 > this.f25466c) {
            long skip = inputStream.skip(j10 - j11);
            if (skip > 0) {
                this.f25467d = -1;
            }
            return j11 + skip;
        }
        if (m30715a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f25465b;
        int i13 = this.f25468e;
        if (i12 - i13 >= j10 - j11) {
            this.f25468e = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f25468e = i12;
        return j12;
    }
}
