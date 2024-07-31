package dm;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class q implements c {

    /* renamed from: a, reason: collision with root package name */
    public final v f14316a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14317b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14318c;

    public q(v sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        this.f14316a = sink;
        this.f14317b = new b();
    }

    @Override // dm.c
    public long E0(x source) {
        kotlin.jvm.internal.n.e(source, "source");
        long j10 = 0;
        while (true) {
            long s12 = source.s1(this.f14317b, 8192L);
            if (s12 == -1) {
                return j10;
            }
            j10 += s12;
            a();
        }
    }

    @Override // dm.v
    public void K0(b source, long j10) {
        kotlin.jvm.internal.n.e(source, "source");
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.K0(source, j10);
        a();
    }

    @Override // dm.c
    public c T(String string) {
        kotlin.jvm.internal.n.e(string, "string");
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.T(string);
        return a();
    }

    @Override // dm.c
    public c Z0(long j10) {
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.Z0(j10);
        return a();
    }

    public c a() {
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        long g10 = this.f14317b.g();
        if (g10 > 0) {
            this.f14316a.K0(this.f14317b, g10);
        }
        return this;
    }

    @Override // dm.c
    public c b0(e byteString) {
        kotlin.jvm.internal.n.e(byteString, "byteString");
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.b0(byteString);
        return a();
    }

    @Override // dm.c
    public b c() {
        return this.f14317b;
    }

    @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14318c) {
            return;
        }
        try {
            if (this.f14317b.size() > 0) {
                v vVar = this.f14316a;
                b bVar = this.f14317b;
                vVar.K0(bVar, bVar.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f14316a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f14318c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // dm.c, dm.v, java.io.Flushable
    public void flush() {
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f14317b.size() > 0) {
            v vVar = this.f14316a;
            b bVar = this.f14317b;
            vVar.K0(bVar, bVar.size());
        }
        this.f14316a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f14318c;
    }

    @Override // dm.v
    public y m() {
        return this.f14316a.m();
    }

    @Override // dm.c
    public c s0(long j10) {
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.s0(j10);
        return a();
    }

    public String toString() {
        return "buffer(" + this.f14316a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.n.e(source, "source");
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f14317b.write(source);
        a();
        return write;
    }

    @Override // dm.c
    public c write(byte[] source) {
        kotlin.jvm.internal.n.e(source, "source");
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.write(source);
        return a();
    }

    @Override // dm.c
    public c write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.n.e(source, "source");
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.write(source, i10, i11);
        return a();
    }

    @Override // dm.c
    public c writeByte(int i10) {
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.writeByte(i10);
        return a();
    }

    @Override // dm.c
    public c writeInt(int i10) {
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.writeInt(i10);
        return a();
    }

    @Override // dm.c
    public c writeShort(int i10) {
        if (!(!this.f14318c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f14317b.writeShort(i10);
        return a();
    }
}
