package p383ue;

import com.google.firebase.perf.util.C6338l;
import java.io.IOException;
import java.io.InputStream;
import se.C10909h;

/* renamed from: ue.a */
/* loaded from: classes.dex */
public final class C11548a extends InputStream {

    /* renamed from: a */
    private final InputStream f29977a;

    /* renamed from: b */
    private final C10909h f29978b;

    /* renamed from: c */
    private final C6338l f29979c;

    /* renamed from: e */
    private long f29981e;

    /* renamed from: d */
    private long f29980d = -1;

    /* renamed from: f */
    private long f29982f = -1;

    public C11548a(InputStream inputStream, C10909h c10909h, C6338l c6338l) {
        this.f29979c = c6338l;
        this.f29977a = inputStream;
        this.f29978b = c10909h;
        this.f29981e = c10909h.m33296e();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f29977a.available();
        } catch (IOException e10) {
            this.f29978b.m33309v(this.f29979c.m17532c());
            C11551d.m36206d(this.f29978b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long m17532c = this.f29979c.m17532c();
        if (this.f29982f == -1) {
            this.f29982f = m17532c;
        }
        try {
            this.f29977a.close();
            long j10 = this.f29980d;
            if (j10 != -1) {
                this.f29978b.m33307t(j10);
            }
            long j11 = this.f29981e;
            if (j11 != -1) {
                this.f29978b.m33310w(j11);
            }
            this.f29978b.m33309v(this.f29982f);
            this.f29978b.m33294b();
        } catch (IOException e10) {
            this.f29978b.m33309v(this.f29979c.m17532c());
            C11551d.m36206d(this.f29978b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f29977a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f29977a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f29977a.read();
            long m17532c = this.f29979c.m17532c();
            if (this.f29981e == -1) {
                this.f29981e = m17532c;
            }
            if (read == -1 && this.f29982f == -1) {
                this.f29982f = m17532c;
                this.f29978b.m33309v(m17532c);
                this.f29978b.m33294b();
            } else {
                long j10 = this.f29980d + 1;
                this.f29980d = j10;
                this.f29978b.m33307t(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f29978b.m33309v(this.f29979c.m17532c());
            C11551d.m36206d(this.f29978b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f29977a.read(bArr);
            long m17532c = this.f29979c.m17532c();
            if (this.f29981e == -1) {
                this.f29981e = m17532c;
            }
            if (read == -1 && this.f29982f == -1) {
                this.f29982f = m17532c;
                this.f29978b.m33309v(m17532c);
                this.f29978b.m33294b();
            } else {
                long j10 = this.f29980d + read;
                this.f29980d = j10;
                this.f29978b.m33307t(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f29978b.m33309v(this.f29979c.m17532c());
            C11551d.m36206d(this.f29978b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            int read = this.f29977a.read(bArr, i10, i11);
            long m17532c = this.f29979c.m17532c();
            if (this.f29981e == -1) {
                this.f29981e = m17532c;
            }
            if (read == -1 && this.f29982f == -1) {
                this.f29982f = m17532c;
                this.f29978b.m33309v(m17532c);
                this.f29978b.m33294b();
            } else {
                long j10 = this.f29980d + read;
                this.f29980d = j10;
                this.f29978b.m33307t(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f29978b.m33309v(this.f29979c.m17532c());
            C11551d.m36206d(this.f29978b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        try {
            this.f29977a.reset();
        } catch (IOException e10) {
            this.f29978b.m33309v(this.f29979c.m17532c());
            C11551d.m36206d(this.f29978b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            long skip = this.f29977a.skip(j10);
            long m17532c = this.f29979c.m17532c();
            if (this.f29981e == -1) {
                this.f29981e = m17532c;
            }
            if (skip == -1 && this.f29982f == -1) {
                this.f29982f = m17532c;
                this.f29978b.m33309v(m17532c);
            } else {
                long j11 = this.f29980d + skip;
                this.f29980d = j11;
                this.f29978b.m33307t(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f29978b.m33309v(this.f29979c.m17532c());
            C11551d.m36206d(this.f29978b);
            throw e10;
        }
    }
}
