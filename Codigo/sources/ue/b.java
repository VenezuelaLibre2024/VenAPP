package ue;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.OutputStream;
import se.h;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f27660a;

    /* renamed from: b, reason: collision with root package name */
    private final l f27661b;

    /* renamed from: c, reason: collision with root package name */
    h f27662c;

    /* renamed from: d, reason: collision with root package name */
    long f27663d = -1;

    public b(OutputStream outputStream, h hVar, l lVar) {
        this.f27660a = outputStream;
        this.f27662c = hVar;
        this.f27661b = lVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f27663d;
        if (j10 != -1) {
            this.f27662c.p(j10);
        }
        this.f27662c.u(this.f27661b.c());
        try {
            this.f27660a.close();
        } catch (IOException e10) {
            this.f27662c.v(this.f27661b.c());
            d.d(this.f27662c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f27660a.flush();
        } catch (IOException e10) {
            this.f27662c.v(this.f27661b.c());
            d.d(this.f27662c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        try {
            this.f27660a.write(i10);
            long j10 = this.f27663d + 1;
            this.f27663d = j10;
            this.f27662c.p(j10);
        } catch (IOException e10) {
            this.f27662c.v(this.f27661b.c());
            d.d(this.f27662c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f27660a.write(bArr);
            long length = this.f27663d + bArr.length;
            this.f27663d = length;
            this.f27662c.p(length);
        } catch (IOException e10) {
            this.f27662c.v(this.f27661b.c());
            d.d(this.f27662c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        try {
            this.f27660a.write(bArr, i10, i11);
            long j10 = this.f27663d + i11;
            this.f27663d = j10;
            this.f27662c.p(j10);
        } catch (IOException e10) {
            this.f27662c.v(this.f27661b.c());
            d.d(this.f27662c);
            throw e10;
        }
    }
}
