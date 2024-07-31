package p095f3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: f3.c */
/* loaded from: classes.dex */
class C7292c implements Closeable {

    /* renamed from: a */
    private final InputStream f16367a;

    /* renamed from: b */
    private final Charset f16368b;

    /* renamed from: c */
    private byte[] f16369c;

    /* renamed from: d */
    private int f16370d;

    /* renamed from: e */
    private int f16371e;

    /* renamed from: f3.c$a */
    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, C7292c.this.f16368b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C7292c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C7293d.f16373a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f16367a = inputStream;
        this.f16368b = charset;
        this.f16369c = new byte[i10];
    }

    public C7292c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m21865b() {
        InputStream inputStream = this.f16367a;
        byte[] bArr = this.f16369c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f16370d = 0;
        this.f16371e = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f16367a) {
            if (this.f16369c != null) {
                this.f16369c = null;
                this.f16367a.close();
            }
        }
    }

    /* renamed from: e */
    public boolean m21866e() {
        return this.f16371e == -1;
    }

    /* renamed from: f */
    public String m21867f() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f16367a) {
            if (this.f16369c == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f16370d >= this.f16371e) {
                m21865b();
            }
            for (int i12 = this.f16370d; i12 != this.f16371e; i12++) {
                byte[] bArr2 = this.f16369c;
                if (bArr2[i12] == 10) {
                    int i13 = this.f16370d;
                    if (i12 != i13) {
                        i11 = i12 - 1;
                        if (bArr2[i11] == 13) {
                            String str = new String(bArr2, i13, i11 - i13, this.f16368b.name());
                            this.f16370d = i12 + 1;
                            return str;
                        }
                    }
                    i11 = i12;
                    String str2 = new String(bArr2, i13, i11 - i13, this.f16368b.name());
                    this.f16370d = i12 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f16371e - this.f16370d) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f16369c;
                int i14 = this.f16370d;
                aVar.write(bArr3, i14, this.f16371e - i14);
                this.f16371e = -1;
                m21865b();
                i10 = this.f16370d;
                while (i10 != this.f16371e) {
                    bArr = this.f16369c;
                    if (bArr[i10] == 10) {
                        break loop1;
                    }
                    i10++;
                }
            }
            int i15 = this.f16370d;
            if (i10 != i15) {
                aVar.write(bArr, i15, i10 - i15);
            }
            this.f16370d = i10 + 1;
            return aVar.toString();
        }
    }
}
