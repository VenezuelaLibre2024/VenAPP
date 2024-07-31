package ue;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import se.h;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a */
    private final InputStream f27654a;

    /* renamed from: b */
    private final h f27655b;

    /* renamed from: c */
    private final l f27656c;

    /* renamed from: e */
    private long f27658e;

    /* renamed from: d */
    private long f27657d = -1;

    /* renamed from: f */
    private long f27659f = -1;

    public a(InputStream inputStream, h hVar, l lVar) {
        this.f27656c = lVar;
        this.f27654a = inputStream;
        this.f27655b = hVar;
        this.f27658e = hVar.e();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f27654a.available();
        } catch (IOException e10) {
            this.f27655b.v(this.f27656c.c());
            d.d(this.f27655b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long c10 = this.f27656c.c();
        if (this.f27659f == -1) {
            this.f27659f = c10;
        }
        try {
            this.f27654a.close();
            long j10 = this.f27657d;
            if (j10 != -1) {
                this.f27655b.t(j10);
            }
            long j11 = this.f27658e;
            if (j11 != -1) {
                this.f27655b.w(j11);
            }
            this.f27655b.v(this.f27659f);
            this.f27655b.b();
        } catch (IOException e10) {
            this.f27655b.v(this.f27656c.c());
            d.d(this.f27655b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f27654a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f27654a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f27654a.read();
            long c10 = this.f27656c.c();
            if (this.f27658e == -1) {
                this.f27658e = c10;
            }
            if (read == -1 && this.f27659f == -1) {
                this.f27659f = c10;
                this.f27655b.v(c10);
                this.f27655b.b();
            } else {
                long j10 = this.f27657d + 1;
                this.f27657d = j10;
                this.f27655b.t(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f27655b.v(this.f27656c.c());
            d.d(this.f27655b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f27654a.read(bArr);
            long c10 = this.f27656c.c();
            if (this.f27658e == -1) {
                this.f27658e = c10;
            }
            if (read == -1 && this.f27659f == -1) {
                this.f27659f = c10;
                this.f27655b.v(c10);
                this.f27655b.b();
            } else {
                long j10 = this.f27657d + read;
                this.f27657d = j10;
                this.f27655b.t(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f27655b.v(this.f27656c.c());
            d.d(this.f27655b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            int read = this.f27654a.read(bArr, i10, i11);
            long c10 = this.f27656c.c();
            if (this.f27658e == -1) {
                this.f27658e = c10;
            }
            if (read == -1 && this.f27659f == -1) {
                this.f27659f = c10;
                this.f27655b.v(c10);
                this.f27655b.b();
            } else {
                long j10 = this.f27657d + read;
                this.f27657d = j10;
                this.f27655b.t(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f27655b.v(this.f27656c.c());
            d.d(this.f27655b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        try {
            this.f27654a.reset();
        } catch (IOException e10) {
            this.f27655b.v(this.f27656c.c());
            d.d(this.f27655b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            long skip = this.f27654a.skip(j10);
            long c10 = this.f27656c.c();
            if (this.f27658e == -1) {
                this.f27658e = c10;
            }
            if (skip == -1 && this.f27659f == -1) {
                this.f27659f = c10;
                this.f27655b.v(c10);
            } else {
                long j11 = this.f27657d + skip;
                this.f27657d = j11;
                this.f27655b.t(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f27655b.v(this.f27656c.c());
            d.d(this.f27655b);
            throw e10;
        }
    }
}
