package io.grpc.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import vi.l;

/* loaded from: classes3.dex */
public class l1 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final d f18962a;

    /* renamed from: c, reason: collision with root package name */
    private o2 f18964c;

    /* renamed from: h, reason: collision with root package name */
    private final p2 f18969h;

    /* renamed from: i, reason: collision with root package name */
    private final h2 f18970i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18971j;

    /* renamed from: k, reason: collision with root package name */
    private int f18972k;

    /* renamed from: m, reason: collision with root package name */
    private long f18974m;

    /* renamed from: b, reason: collision with root package name */
    private int f18963b = -1;

    /* renamed from: d, reason: collision with root package name */
    private vi.n f18965d = l.b.f29160a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18966e = true;

    /* renamed from: f, reason: collision with root package name */
    private final c f18967f = new c();

    /* renamed from: g, reason: collision with root package name */
    private final ByteBuffer f18968g = ByteBuffer.allocate(5);

    /* renamed from: l, reason: collision with root package name */
    private int f18973l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class b extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final List<o2> f18975a;

        /* renamed from: b, reason: collision with root package name */
        private o2 f18976b;

        private b() {
            this.f18975a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            Iterator<o2> it = this.f18975a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += it.next().k();
            }
            return i10;
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            o2 o2Var = this.f18976b;
            if (o2Var == null || o2Var.a() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
            } else {
                this.f18976b.b((byte) i10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.f18976b == null) {
                o2 a10 = l1.this.f18969h.a(i11);
                this.f18976b = a10;
                this.f18975a.add(a10);
            }
            while (i11 > 0) {
                int min = Math.min(i11, this.f18976b.a());
                if (min == 0) {
                    o2 a11 = l1.this.f18969h.a(Math.max(i11, this.f18976b.k() * 2));
                    this.f18976b = a11;
                    this.f18975a.add(a11);
                } else {
                    this.f18976b.write(bArr, i10, min);
                    i10 += min;
                    i11 -= min;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            l1.this.n(bArr, i10, i11);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void p(o2 o2Var, boolean z10, boolean z11, int i10);
    }

    public l1(d dVar, p2 p2Var, h2 h2Var) {
        this.f18962a = (d) eb.o.p(dVar, "sink");
        this.f18969h = (p2) eb.o.p(p2Var, "bufferAllocator");
        this.f18970i = (h2) eb.o.p(h2Var, "statsTraceCtx");
    }

    private void e(boolean z10, boolean z11) {
        o2 o2Var = this.f18964c;
        this.f18964c = null;
        this.f18962a.p(o2Var, z10, z11, this.f18972k);
        this.f18972k = 0;
    }

    private int g(InputStream inputStream) {
        if ((inputStream instanceof vi.o0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void h() {
        o2 o2Var = this.f18964c;
        if (o2Var != null) {
            o2Var.release();
            this.f18964c = null;
        }
    }

    private void j() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void k(b bVar, boolean z10) {
        int k10 = bVar.k();
        this.f18968g.clear();
        this.f18968g.put(z10 ? (byte) 1 : (byte) 0).putInt(k10);
        o2 a10 = this.f18969h.a(5);
        a10.write(this.f18968g.array(), 0, this.f18968g.position());
        if (k10 == 0) {
            this.f18964c = a10;
            return;
        }
        this.f18962a.p(a10, false, false, this.f18972k - 1);
        this.f18972k = 1;
        List list = bVar.f18975a;
        for (int i10 = 0; i10 < list.size() - 1; i10++) {
            this.f18962a.p((o2) list.get(i10), false, false, 0);
        }
        this.f18964c = (o2) list.get(list.size() - 1);
        this.f18974m = k10;
    }

    private int l(InputStream inputStream, int i10) {
        b bVar = new b();
        OutputStream c10 = this.f18965d.c(bVar);
        try {
            int o10 = o(inputStream, c10);
            c10.close();
            int i11 = this.f18963b;
            if (i11 >= 0 && o10 > i11) {
                throw vi.g1.f29109o.r(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(o10), Integer.valueOf(this.f18963b))).d();
            }
            k(bVar, true);
            return o10;
        } catch (Throwable th2) {
            c10.close();
            throw th2;
        }
    }

    private int m(InputStream inputStream, int i10) {
        int i11 = this.f18963b;
        if (i11 >= 0 && i10 > i11) {
            throw vi.g1.f29109o.r(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f18963b))).d();
        }
        this.f18968g.clear();
        this.f18968g.put((byte) 0).putInt(i10);
        if (this.f18964c == null) {
            this.f18964c = this.f18969h.a(this.f18968g.position() + i10);
        }
        n(this.f18968g.array(), 0, this.f18968g.position());
        return o(inputStream, this.f18967f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            o2 o2Var = this.f18964c;
            if (o2Var != null && o2Var.a() == 0) {
                e(false, false);
            }
            if (this.f18964c == null) {
                this.f18964c = this.f18969h.a(i11);
            }
            int min = Math.min(i11, this.f18964c.a());
            this.f18964c.write(bArr, i10, min);
            i10 += min;
            i11 -= min;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int o(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof vi.w) {
            return ((vi.w) inputStream).a(outputStream);
        }
        long b10 = fb.b.b(inputStream, outputStream);
        eb.o.j(b10 <= 2147483647L, "Message size overflow: %s", b10);
        return (int) b10;
    }

    private int p(InputStream inputStream, int i10) {
        if (i10 != -1) {
            this.f18974m = i10;
            return m(inputStream, i10);
        }
        b bVar = new b();
        int o10 = o(inputStream, bVar);
        int i11 = this.f18963b;
        if (i11 >= 0 && o10 > i11) {
            throw vi.g1.f29109o.r(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(o10), Integer.valueOf(this.f18963b))).d();
        }
        k(bVar, false);
        return o10;
    }

    @Override // io.grpc.internal.o0
    public void b(InputStream inputStream) {
        j();
        this.f18972k++;
        int i10 = this.f18973l + 1;
        this.f18973l = i10;
        this.f18974m = 0L;
        this.f18970i.i(i10);
        boolean z10 = this.f18966e && this.f18965d != l.b.f29160a;
        try {
            int g10 = g(inputStream);
            int p10 = (g10 == 0 || !z10) ? p(inputStream, g10) : l(inputStream, g10);
            if (g10 != -1 && p10 != g10) {
                throw vi.g1.f29114t.r(String.format("Message length inaccurate %s != %s", Integer.valueOf(p10), Integer.valueOf(g10))).d();
            }
            long j10 = p10;
            this.f18970i.k(j10);
            this.f18970i.l(this.f18974m);
            this.f18970i.j(this.f18973l, this.f18974m, j10);
        } catch (IOException e10) {
            throw vi.g1.f29114t.r("Failed to frame message").q(e10).d();
        } catch (RuntimeException e11) {
            throw vi.g1.f29114t.r("Failed to frame message").q(e11).d();
        }
    }

    @Override // io.grpc.internal.o0
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f18971j = true;
        o2 o2Var = this.f18964c;
        if (o2Var != null && o2Var.k() == 0) {
            h();
        }
        e(true, true);
    }

    @Override // io.grpc.internal.o0
    public void f(int i10) {
        eb.o.v(this.f18963b == -1, "max size already set");
        this.f18963b = i10;
    }

    @Override // io.grpc.internal.o0
    public void flush() {
        o2 o2Var = this.f18964c;
        if (o2Var == null || o2Var.k() <= 0) {
            return;
        }
        e(false, true);
    }

    @Override // io.grpc.internal.o0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public l1 a(vi.n nVar) {
        this.f18965d = (vi.n) eb.o.p(nVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // io.grpc.internal.o0
    public boolean isClosed() {
        return this.f18971j;
    }
}
