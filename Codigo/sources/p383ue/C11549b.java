package p383ue;

import com.google.firebase.perf.util.C6338l;
import java.io.IOException;
import java.io.OutputStream;
import se.C10909h;

/* renamed from: ue.b */
/* loaded from: classes.dex */
public final class C11549b extends OutputStream {

    /* renamed from: a */
    private final OutputStream f29983a;

    /* renamed from: b */
    private final C6338l f29984b;

    /* renamed from: c */
    C10909h f29985c;

    /* renamed from: d */
    long f29986d = -1;

    public C11549b(OutputStream outputStream, C10909h c10909h, C6338l c6338l) {
        this.f29983a = outputStream;
        this.f29985c = c10909h;
        this.f29984b = c6338l;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f29986d;
        if (j10 != -1) {
            this.f29985c.m33304p(j10);
        }
        this.f29985c.m33308u(this.f29984b.m17532c());
        try {
            this.f29983a.close();
        } catch (IOException e10) {
            this.f29985c.m33309v(this.f29984b.m17532c());
            C11551d.m36206d(this.f29985c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f29983a.flush();
        } catch (IOException e10) {
            this.f29985c.m33309v(this.f29984b.m17532c());
            C11551d.m36206d(this.f29985c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        try {
            this.f29983a.write(i10);
            long j10 = this.f29986d + 1;
            this.f29986d = j10;
            this.f29985c.m33304p(j10);
        } catch (IOException e10) {
            this.f29985c.m33309v(this.f29984b.m17532c());
            C11551d.m36206d(this.f29985c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f29983a.write(bArr);
            long length = this.f29986d + bArr.length;
            this.f29986d = length;
            this.f29985c.m33304p(length);
        } catch (IOException e10) {
            this.f29985c.m33309v(this.f29984b.m17532c());
            C11551d.m36206d(this.f29985c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        try {
            this.f29983a.write(bArr, i10, i11);
            long j10 = this.f29986d + i11;
            this.f29986d = j10;
            this.f29985c.m33304p(j10);
        } catch (IOException e10) {
            this.f29985c.m33309v(this.f29984b.m17532c());
            C11551d.m36206d(this.f29985c);
            throw e10;
        }
    }
}
