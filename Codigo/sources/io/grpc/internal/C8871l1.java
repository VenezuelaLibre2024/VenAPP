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
import p082eb.C7159o;
import p103fb.C7324b;
import vi.C11915g1;
import vi.InterfaceC11928l;
import vi.InterfaceC11934n;
import vi.InterfaceC11937o0;
import vi.InterfaceC11952w;

/* renamed from: io.grpc.internal.l1 */
/* loaded from: classes3.dex */
public class C8871l1 implements InterfaceC8882o0 {

    /* renamed from: a */
    private final d f20709a;

    /* renamed from: c */
    private InterfaceC8884o2 f20711c;

    /* renamed from: h */
    private final InterfaceC8888p2 f20716h;

    /* renamed from: i */
    private final C8856h2 f20717i;

    /* renamed from: j */
    private boolean f20718j;

    /* renamed from: k */
    private int f20719k;

    /* renamed from: m */
    private long f20721m;

    /* renamed from: b */
    private int f20710b = -1;

    /* renamed from: d */
    private InterfaceC11934n f20712d = InterfaceC11928l.b.f31595a;

    /* renamed from: e */
    private boolean f20713e = true;

    /* renamed from: f */
    private final c f20714f = new c();

    /* renamed from: g */
    private final ByteBuffer f20715g = ByteBuffer.allocate(5);

    /* renamed from: l */
    private int f20720l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.l1$b */
    /* loaded from: classes3.dex */
    public final class b extends OutputStream {

        /* renamed from: a */
        private final List<InterfaceC8884o2> f20722a;

        /* renamed from: b */
        private InterfaceC8884o2 f20723b;

        private b() {
            this.f20722a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public int m25663k() {
            Iterator<InterfaceC8884o2> it = this.f20722a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += it.next().mo25706k();
            }
            return i10;
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            InterfaceC8884o2 interfaceC8884o2 = this.f20723b;
            if (interfaceC8884o2 == null || interfaceC8884o2.mo25704a() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
            } else {
                this.f20723b.mo25705b((byte) i10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.f20723b == null) {
                InterfaceC8884o2 mo25743a = C8871l1.this.f20716h.mo25743a(i11);
                this.f20723b = mo25743a;
                this.f20722a.add(mo25743a);
            }
            while (i11 > 0) {
                int min = Math.min(i11, this.f20723b.mo25704a());
                if (min == 0) {
                    InterfaceC8884o2 mo25743a2 = C8871l1.this.f20716h.mo25743a(Math.max(i11, this.f20723b.mo25706k() * 2));
                    this.f20723b = mo25743a2;
                    this.f20722a.add(mo25743a2);
                } else {
                    this.f20723b.write(bArr, i10, min);
                    i10 += min;
                    i11 -= min;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.l1$c */
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
            C8871l1.this.m25657n(bArr, i10, i11);
        }
    }

    /* renamed from: io.grpc.internal.l1$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: p */
        void mo25204p(InterfaceC8884o2 interfaceC8884o2, boolean z10, boolean z11, int i10);
    }

    public C8871l1(d dVar, InterfaceC8888p2 interfaceC8888p2, C8856h2 c8856h2) {
        this.f20709a = (d) C7159o.m21313p(dVar, "sink");
        this.f20716h = (InterfaceC8888p2) C7159o.m21313p(interfaceC8888p2, "bufferAllocator");
        this.f20717i = (C8856h2) C7159o.m21313p(c8856h2, "statsTraceCtx");
    }

    /* renamed from: e */
    private void m25650e(boolean z10, boolean z11) {
        InterfaceC8884o2 interfaceC8884o2 = this.f20711c;
        this.f20711c = null;
        this.f20709a.mo25204p(interfaceC8884o2, z10, z11, this.f20719k);
        this.f20719k = 0;
    }

    /* renamed from: g */
    private int m25651g(InputStream inputStream) {
        if ((inputStream instanceof InterfaceC11937o0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    /* renamed from: h */
    private void m25652h() {
        InterfaceC8884o2 interfaceC8884o2 = this.f20711c;
        if (interfaceC8884o2 != null) {
            interfaceC8884o2.release();
            this.f20711c = null;
        }
    }

    /* renamed from: j */
    private void m25653j() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* renamed from: k */
    private void m25654k(b bVar, boolean z10) {
        int m25663k = bVar.m25663k();
        this.f20715g.clear();
        this.f20715g.put(z10 ? (byte) 1 : (byte) 0).putInt(m25663k);
        InterfaceC8884o2 mo25743a = this.f20716h.mo25743a(5);
        mo25743a.write(this.f20715g.array(), 0, this.f20715g.position());
        if (m25663k == 0) {
            this.f20711c = mo25743a;
            return;
        }
        this.f20709a.mo25204p(mo25743a, false, false, this.f20719k - 1);
        this.f20719k = 1;
        List list = bVar.f20722a;
        for (int i10 = 0; i10 < list.size() - 1; i10++) {
            this.f20709a.mo25204p((InterfaceC8884o2) list.get(i10), false, false, 0);
        }
        this.f20711c = (InterfaceC8884o2) list.get(list.size() - 1);
        this.f20721m = m25663k;
    }

    /* renamed from: l */
    private int m25655l(InputStream inputStream, int i10) {
        b bVar = new b();
        OutputStream mo38201c = this.f20712d.mo38201c(bVar);
        try {
            int m25658o = m25658o(inputStream, mo38201c);
            mo38201c.close();
            int i11 = this.f20710b;
            if (i11 >= 0 && m25658o > i11) {
                throw C11915g1.f31543o.m38147r(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(m25658o), Integer.valueOf(this.f20710b))).m38139d();
            }
            m25654k(bVar, true);
            return m25658o;
        } catch (Throwable th2) {
            mo38201c.close();
            throw th2;
        }
    }

    /* renamed from: m */
    private int m25656m(InputStream inputStream, int i10) {
        int i11 = this.f20710b;
        if (i11 >= 0 && i10 > i11) {
            throw C11915g1.f31543o.m38147r(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f20710b))).m38139d();
        }
        this.f20715g.clear();
        this.f20715g.put((byte) 0).putInt(i10);
        if (this.f20711c == null) {
            this.f20711c = this.f20716h.mo25743a(this.f20715g.position() + i10);
        }
        m25657n(this.f20715g.array(), 0, this.f20715g.position());
        return m25658o(inputStream, this.f20714f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m25657n(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            InterfaceC8884o2 interfaceC8884o2 = this.f20711c;
            if (interfaceC8884o2 != null && interfaceC8884o2.mo25704a() == 0) {
                m25650e(false, false);
            }
            if (this.f20711c == null) {
                this.f20711c = this.f20716h.mo25743a(i11);
            }
            int min = Math.min(i11, this.f20711c.mo25704a());
            this.f20711c.write(bArr, i10, min);
            i10 += min;
            i11 -= min;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private static int m25658o(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof InterfaceC11952w) {
            return ((InterfaceC11952w) inputStream).mo38292a(outputStream);
        }
        long m21976b = C7324b.m21976b(inputStream, outputStream);
        C7159o.m21307j(m21976b <= 2147483647L, "Message size overflow: %s", m21976b);
        return (int) m21976b;
    }

    /* renamed from: p */
    private int m25659p(InputStream inputStream, int i10) {
        if (i10 != -1) {
            this.f20721m = i10;
            return m25656m(inputStream, i10);
        }
        b bVar = new b();
        int m25658o = m25658o(inputStream, bVar);
        int i11 = this.f20710b;
        if (i11 >= 0 && m25658o > i11) {
            throw C11915g1.f31543o.m38147r(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(m25658o), Integer.valueOf(this.f20710b))).m38139d();
        }
        m25654k(bVar, false);
        return m25658o;
    }

    @Override // io.grpc.internal.InterfaceC8882o0
    /* renamed from: b */
    public void mo25212b(InputStream inputStream) {
        m25653j();
        this.f20719k++;
        int i10 = this.f20720l + 1;
        this.f20720l = i10;
        this.f20721m = 0L;
        this.f20717i.m25599i(i10);
        boolean z10 = this.f20713e && this.f20712d != InterfaceC11928l.b.f31595a;
        try {
            int m25651g = m25651g(inputStream);
            int m25659p = (m25651g == 0 || !z10) ? m25659p(inputStream, m25651g) : m25655l(inputStream, m25651g);
            if (m25651g != -1 && m25659p != m25651g) {
                throw C11915g1.f31548t.m38147r(String.format("Message length inaccurate %s != %s", Integer.valueOf(m25659p), Integer.valueOf(m25651g))).m38139d();
            }
            long j10 = m25659p;
            this.f20717i.m25601k(j10);
            this.f20717i.m25602l(this.f20721m);
            this.f20717i.m25600j(this.f20720l, this.f20721m, j10);
        } catch (IOException e10) {
            throw C11915g1.f31548t.m38147r("Failed to frame message").m38146q(e10).m38139d();
        } catch (RuntimeException e11) {
            throw C11915g1.f31548t.m38147r("Failed to frame message").m38146q(e11).m38139d();
        }
    }

    @Override // io.grpc.internal.InterfaceC8882o0
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f20718j = true;
        InterfaceC8884o2 interfaceC8884o2 = this.f20711c;
        if (interfaceC8884o2 != null && interfaceC8884o2.mo25706k() == 0) {
            m25652h();
        }
        m25650e(true, true);
    }

    @Override // io.grpc.internal.InterfaceC8882o0
    /* renamed from: f */
    public void mo25213f(int i10) {
        C7159o.m21319v(this.f20710b == -1, "max size already set");
        this.f20710b = i10;
    }

    @Override // io.grpc.internal.InterfaceC8882o0
    public void flush() {
        InterfaceC8884o2 interfaceC8884o2 = this.f20711c;
        if (interfaceC8884o2 == null || interfaceC8884o2.mo25706k() <= 0) {
            return;
        }
        m25650e(false, true);
    }

    @Override // io.grpc.internal.InterfaceC8882o0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C8871l1 mo25211a(InterfaceC11934n interfaceC11934n) {
        this.f20712d = (InterfaceC11934n) C7159o.m21313p(interfaceC11934n, "Can't pass an empty compressor");
        return this;
    }

    @Override // io.grpc.internal.InterfaceC8882o0
    public boolean isClosed() {
        return this.f20718j;
    }
}
