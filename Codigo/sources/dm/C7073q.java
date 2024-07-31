package dm;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.q */
/* loaded from: classes3.dex */
public final class C7073q implements InterfaceC7058c {

    /* renamed from: a */
    public final InterfaceC7078v f15674a;

    /* renamed from: b */
    public final C7056b f15675b;

    /* renamed from: c */
    public boolean f15676c;

    public C7073q(InterfaceC7078v sink) {
        C9322n.m27781e(sink, "sink");
        this.f15674a = sink;
        this.f15675b = new C7056b();
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: E0 */
    public long mo20693E0(InterfaceC7080x source) {
        C9322n.m27781e(source, "source");
        long j10 = 0;
        while (true) {
            long mo20686s1 = source.mo20686s1(this.f15675b, 8192L);
            if (mo20686s1 == -1) {
                return j10;
            }
            j10 += mo20686s1;
            m20829a();
        }
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: K0 */
    public void mo19710K0(C7056b source, long j10) {
        C9322n.m27781e(source, "source");
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.mo19710K0(source, j10);
        m20829a();
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: T */
    public InterfaceC7058c mo20705T(String string) {
        C9322n.m27781e(string, "string");
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.mo20705T(string);
        return m20829a();
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: Z0 */
    public InterfaceC7058c mo20711Z0(long j10) {
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.mo20711Z0(j10);
        return m20829a();
    }

    /* renamed from: a */
    public InterfaceC7058c m20829a() {
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        long m20721g = this.f15675b.m20721g();
        if (m20721g > 0) {
            this.f15674a.mo19710K0(this.f15675b, m20721g);
        }
        return this;
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: b0 */
    public InterfaceC7058c mo20715b0(C7061e byteString) {
        C9322n.m27781e(byteString, "byteString");
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.mo20715b0(byteString);
        return m20829a();
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: c */
    public C7056b mo20717c() {
        return this.f15675b;
    }

    @Override // dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f15676c) {
            return;
        }
        try {
            if (this.f15675b.size() > 0) {
                InterfaceC7078v interfaceC7078v = this.f15674a;
                C7056b c7056b = this.f15675b;
                interfaceC7078v.mo19710K0(c7056b, c7056b.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f15674a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f15676c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // dm.InterfaceC7058c, dm.InterfaceC7078v, java.io.Flushable
    public void flush() {
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f15675b.size() > 0) {
            InterfaceC7078v interfaceC7078v = this.f15674a;
            C7056b c7056b = this.f15675b;
            interfaceC7078v.mo19710K0(c7056b, c7056b.size());
        }
        this.f15674a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f15676c;
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: m */
    public C7081y mo20683m() {
        return this.f15674a.mo20683m();
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: s0 */
    public InterfaceC7058c mo20736s0(long j10) {
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.mo20736s0(j10);
        return m20829a();
    }

    public String toString() {
        return "buffer(" + this.f15674a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        C9322n.m27781e(source, "source");
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f15675b.write(source);
        m20829a();
        return write;
    }

    @Override // dm.InterfaceC7058c
    public InterfaceC7058c write(byte[] source) {
        C9322n.m27781e(source, "source");
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.write(source);
        return m20829a();
    }

    @Override // dm.InterfaceC7058c
    public InterfaceC7058c write(byte[] source, int i10, int i11) {
        C9322n.m27781e(source, "source");
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.write(source, i10, i11);
        return m20829a();
    }

    @Override // dm.InterfaceC7058c
    public InterfaceC7058c writeByte(int i10) {
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.writeByte(i10);
        return m20829a();
    }

    @Override // dm.InterfaceC7058c
    public InterfaceC7058c writeInt(int i10) {
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.writeInt(i10);
        return m20829a();
    }

    @Override // dm.InterfaceC7058c
    public InterfaceC7058c writeShort(int i10) {
        if (!(!this.f15676c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f15675b.writeShort(i10);
        return m20829a();
    }
}
