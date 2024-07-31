package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: io.grpc.internal.u */
/* loaded from: classes3.dex */
public class C8901u extends AbstractC8833c {

    /* renamed from: e */
    private static final f<Void> f20903e = new a();

    /* renamed from: f */
    private static final f<Void> f20904f = new b();

    /* renamed from: r */
    private static final f<byte[]> f20905r = new c();

    /* renamed from: s */
    private static final f<ByteBuffer> f20906s = new d();

    /* renamed from: t */
    private static final g<OutputStream> f20907t = new e();

    /* renamed from: a */
    private final Deque<InterfaceC8903u1> f20908a;

    /* renamed from: b */
    private Deque<InterfaceC8903u1> f20909b;

    /* renamed from: c */
    private int f20910c;

    /* renamed from: d */
    private boolean f20911d;

    /* renamed from: io.grpc.internal.u$a */
    /* loaded from: classes3.dex */
    class a implements f<Void> {
        a() {
        }

        @Override // io.grpc.internal.C8901u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo25849a(InterfaceC8903u1 interfaceC8903u1, int i10, Void r32, int i11) {
            return interfaceC8903u1.readUnsignedByte();
        }
    }

    /* renamed from: io.grpc.internal.u$b */
    /* loaded from: classes3.dex */
    class b implements f<Void> {
        b() {
        }

        @Override // io.grpc.internal.C8901u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo25849a(InterfaceC8903u1 interfaceC8903u1, int i10, Void r32, int i11) {
            interfaceC8903u1.skipBytes(i10);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$c */
    /* loaded from: classes3.dex */
    class c implements f<byte[]> {
        c() {
        }

        @Override // io.grpc.internal.C8901u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo25849a(InterfaceC8903u1 interfaceC8903u1, int i10, byte[] bArr, int i11) {
            interfaceC8903u1.mo25685V0(bArr, i11, i10);
            return i11 + i10;
        }
    }

    /* renamed from: io.grpc.internal.u$d */
    /* loaded from: classes3.dex */
    class d implements f<ByteBuffer> {
        d() {
        }

        @Override // io.grpc.internal.C8901u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo25849a(InterfaceC8903u1 interfaceC8903u1, int i10, ByteBuffer byteBuffer, int i11) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            interfaceC8903u1.mo25688r0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$e */
    /* loaded from: classes3.dex */
    class e implements g<OutputStream> {
        e() {
        }

        @Override // io.grpc.internal.C8901u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo25849a(InterfaceC8903u1 interfaceC8903u1, int i10, OutputStream outputStream, int i11) {
            interfaceC8903u1.mo25687l1(outputStream, i10);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$f */
    /* loaded from: classes3.dex */
    private interface f<T> extends g<T> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.u$g */
    /* loaded from: classes3.dex */
    public interface g<T> {
        /* renamed from: a */
        int mo25849a(InterfaceC8903u1 interfaceC8903u1, int i10, T t10, int i11);
    }

    public C8901u() {
        this.f20908a = new ArrayDeque();
    }

    public C8901u(int i10) {
        this.f20908a = new ArrayDeque(i10);
    }

    /* renamed from: e */
    private void m25843e() {
        if (!this.f20911d) {
            this.f20908a.remove().close();
            return;
        }
        this.f20909b.add(this.f20908a.remove());
        InterfaceC8903u1 peek = this.f20908a.peek();
        if (peek != null) {
            peek.mo25319d1();
        }
    }

    /* renamed from: f */
    private void m25844f() {
        if (this.f20908a.peek().mo25686k() == 0) {
            m25843e();
        }
    }

    /* renamed from: g */
    private void m25845g(InterfaceC8903u1 interfaceC8903u1) {
        if (!(interfaceC8903u1 instanceof C8901u)) {
            this.f20908a.add(interfaceC8903u1);
            this.f20910c += interfaceC8903u1.mo25686k();
            return;
        }
        C8901u c8901u = (C8901u) interfaceC8903u1;
        while (!c8901u.f20908a.isEmpty()) {
            this.f20908a.add(c8901u.f20908a.remove());
        }
        this.f20910c += c8901u.f20910c;
        c8901u.f20910c = 0;
        c8901u.close();
    }

    /* renamed from: i */
    private <T> int m25846i(g<T> gVar, int i10, T t10, int i11) {
        m25318a(i10);
        if (this.f20908a.isEmpty()) {
            m25844f();
            while (i10 > 0 && !this.f20908a.isEmpty()) {
                InterfaceC8903u1 peek = this.f20908a.peek();
                int min = Math.min(i10, peek.mo25686k());
                i11 = gVar.mo25849a(peek, min, t10, i11);
                i10 -= min;
                this.f20910c -= min;
            }
            if (i10 <= 0) {
                return i11;
            }
            throw new AssertionError("Failed executing read operation");
        }
        m25844f();
    }

    /* renamed from: j */
    private <T> int m25847j(f<T> fVar, int i10, T t10, int i11) {
        try {
            return m25846i(fVar, i10, t10, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: A */
    public InterfaceC8903u1 mo25684A(int i10) {
        InterfaceC8903u1 poll;
        int i11;
        InterfaceC8903u1 interfaceC8903u1;
        if (i10 <= 0) {
            return C8906v1.m25866a();
        }
        m25318a(i10);
        this.f20910c -= i10;
        InterfaceC8903u1 interfaceC8903u12 = null;
        C8901u c8901u = null;
        while (true) {
            InterfaceC8903u1 peek = this.f20908a.peek();
            int mo25686k = peek.mo25686k();
            if (mo25686k > i10) {
                interfaceC8903u1 = peek.mo25684A(i10);
                i11 = 0;
            } else {
                if (this.f20911d) {
                    poll = peek.mo25684A(mo25686k);
                    m25843e();
                } else {
                    poll = this.f20908a.poll();
                }
                InterfaceC8903u1 interfaceC8903u13 = poll;
                i11 = i10 - mo25686k;
                interfaceC8903u1 = interfaceC8903u13;
            }
            if (interfaceC8903u12 == null) {
                interfaceC8903u12 = interfaceC8903u1;
            } else {
                if (c8901u == null) {
                    c8901u = new C8901u(i11 != 0 ? Math.min(this.f20908a.size() + 2, 16) : 2);
                    c8901u.m25848b(interfaceC8903u12);
                    interfaceC8903u12 = c8901u;
                }
                c8901u.m25848b(interfaceC8903u1);
            }
            if (i11 <= 0) {
                return interfaceC8903u12;
            }
            i10 = i11;
        }
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: V0 */
    public void mo25685V0(byte[] bArr, int i10, int i11) {
        m25847j(f20905r, i11, bArr, i10);
    }

    /* renamed from: b */
    public void m25848b(InterfaceC8903u1 interfaceC8903u1) {
        boolean z10 = this.f20911d && this.f20908a.isEmpty();
        m25845g(interfaceC8903u1);
        if (z10) {
            this.f20908a.peek().mo25319d1();
        }
    }

    @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f20908a.isEmpty()) {
            this.f20908a.remove().close();
        }
        if (this.f20909b != null) {
            while (!this.f20909b.isEmpty()) {
                this.f20909b.remove().close();
            }
        }
    }

    @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1
    /* renamed from: d1 */
    public void mo25319d1() {
        if (this.f20909b == null) {
            this.f20909b = new ArrayDeque(Math.min(this.f20908a.size(), 16));
        }
        while (!this.f20909b.isEmpty()) {
            this.f20909b.remove().close();
        }
        this.f20911d = true;
        InterfaceC8903u1 peek = this.f20908a.peek();
        if (peek != null) {
            peek.mo25319d1();
        }
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: k */
    public int mo25686k() {
        return this.f20910c;
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: l1 */
    public void mo25687l1(OutputStream outputStream, int i10) {
        m25846i(f20907t, i10, outputStream, 0);
    }

    @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1
    public boolean markSupported() {
        Iterator<InterfaceC8903u1> it = this.f20908a.iterator();
        while (it.hasNext()) {
            if (!it.next().markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: r0 */
    public void mo25688r0(ByteBuffer byteBuffer) {
        m25847j(f20906s, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public int readUnsignedByte() {
        return m25847j(f20903e, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1
    public void reset() {
        if (!this.f20911d) {
            throw new InvalidMarkException();
        }
        InterfaceC8903u1 peek = this.f20908a.peek();
        if (peek != null) {
            int mo25686k = peek.mo25686k();
            peek.reset();
            this.f20910c += peek.mo25686k() - mo25686k;
        }
        while (true) {
            InterfaceC8903u1 pollLast = this.f20909b.pollLast();
            if (pollLast == null) {
                return;
            }
            pollLast.reset();
            this.f20908a.addFirst(pollLast);
            this.f20910c += pollLast.mo25686k();
        }
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public void skipBytes(int i10) {
        m25847j(f20904f, i10, null, 0);
    }
}
