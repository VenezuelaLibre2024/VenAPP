package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class u extends io.grpc.internal.c {

    /* renamed from: e, reason: collision with root package name */
    private static final f<Void> f19156e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final f<Void> f19157f = new b();

    /* renamed from: r, reason: collision with root package name */
    private static final f<byte[]> f19158r = new c();

    /* renamed from: s, reason: collision with root package name */
    private static final f<ByteBuffer> f19159s = new d();

    /* renamed from: t, reason: collision with root package name */
    private static final g<OutputStream> f19160t = new e();

    /* renamed from: a, reason: collision with root package name */
    private final Deque<u1> f19161a;

    /* renamed from: b, reason: collision with root package name */
    private Deque<u1> f19162b;

    /* renamed from: c, reason: collision with root package name */
    private int f19163c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19164d;

    /* loaded from: classes3.dex */
    class a implements f<Void> {
        a() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int i10, Void r32, int i11) {
            return u1Var.readUnsignedByte();
        }
    }

    /* loaded from: classes3.dex */
    class b implements f<Void> {
        b() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int i10, Void r32, int i11) {
            u1Var.skipBytes(i10);
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    class c implements f<byte[]> {
        c() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int i10, byte[] bArr, int i11) {
            u1Var.V0(bArr, i11, i10);
            return i11 + i10;
        }
    }

    /* loaded from: classes3.dex */
    class d implements f<ByteBuffer> {
        d() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int i10, ByteBuffer byteBuffer, int i11) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            u1Var.r0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    class e implements g<OutputStream> {
        e() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int i10, OutputStream outputStream, int i11) {
            u1Var.l1(outputStream, i10);
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    private interface f<T> extends g<T> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface g<T> {
        int a(u1 u1Var, int i10, T t10, int i11);
    }

    public u() {
        this.f19161a = new ArrayDeque();
    }

    public u(int i10) {
        this.f19161a = new ArrayDeque(i10);
    }

    private void e() {
        if (!this.f19164d) {
            this.f19161a.remove().close();
            return;
        }
        this.f19162b.add(this.f19161a.remove());
        u1 peek = this.f19161a.peek();
        if (peek != null) {
            peek.d1();
        }
    }

    private void f() {
        if (this.f19161a.peek().k() == 0) {
            e();
        }
    }

    private void g(u1 u1Var) {
        if (!(u1Var instanceof u)) {
            this.f19161a.add(u1Var);
            this.f19163c += u1Var.k();
            return;
        }
        u uVar = (u) u1Var;
        while (!uVar.f19161a.isEmpty()) {
            this.f19161a.add(uVar.f19161a.remove());
        }
        this.f19163c += uVar.f19163c;
        uVar.f19163c = 0;
        uVar.close();
    }

    private <T> int i(g<T> gVar, int i10, T t10, int i11) {
        a(i10);
        if (this.f19161a.isEmpty()) {
            f();
            while (i10 > 0 && !this.f19161a.isEmpty()) {
                u1 peek = this.f19161a.peek();
                int min = Math.min(i10, peek.k());
                i11 = gVar.a(peek, min, t10, i11);
                i10 -= min;
                this.f19163c -= min;
            }
            if (i10 <= 0) {
                return i11;
            }
            throw new AssertionError("Failed executing read operation");
        }
        f();
    }

    private <T> int j(f<T> fVar, int i10, T t10, int i11) {
        try {
            return i(fVar, i10, t10, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // io.grpc.internal.u1
    public u1 A(int i10) {
        u1 poll;
        int i11;
        u1 u1Var;
        if (i10 <= 0) {
            return v1.a();
        }
        a(i10);
        this.f19163c -= i10;
        u1 u1Var2 = null;
        u uVar = null;
        while (true) {
            u1 peek = this.f19161a.peek();
            int k10 = peek.k();
            if (k10 > i10) {
                u1Var = peek.A(i10);
                i11 = 0;
            } else {
                if (this.f19164d) {
                    poll = peek.A(k10);
                    e();
                } else {
                    poll = this.f19161a.poll();
                }
                u1 u1Var3 = poll;
                i11 = i10 - k10;
                u1Var = u1Var3;
            }
            if (u1Var2 == null) {
                u1Var2 = u1Var;
            } else {
                if (uVar == null) {
                    uVar = new u(i11 != 0 ? Math.min(this.f19161a.size() + 2, 16) : 2);
                    uVar.b(u1Var2);
                    u1Var2 = uVar;
                }
                uVar.b(u1Var);
            }
            if (i11 <= 0) {
                return u1Var2;
            }
            i10 = i11;
        }
    }

    @Override // io.grpc.internal.u1
    public void V0(byte[] bArr, int i10, int i11) {
        j(f19158r, i11, bArr, i10);
    }

    public void b(u1 u1Var) {
        boolean z10 = this.f19164d && this.f19161a.isEmpty();
        g(u1Var);
        if (z10) {
            this.f19161a.peek().d1();
        }
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f19161a.isEmpty()) {
            this.f19161a.remove().close();
        }
        if (this.f19162b != null) {
            while (!this.f19162b.isEmpty()) {
                this.f19162b.remove().close();
            }
        }
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public void d1() {
        if (this.f19162b == null) {
            this.f19162b = new ArrayDeque(Math.min(this.f19161a.size(), 16));
        }
        while (!this.f19162b.isEmpty()) {
            this.f19162b.remove().close();
        }
        this.f19164d = true;
        u1 peek = this.f19161a.peek();
        if (peek != null) {
            peek.d1();
        }
    }

    @Override // io.grpc.internal.u1
    public int k() {
        return this.f19163c;
    }

    @Override // io.grpc.internal.u1
    public void l1(OutputStream outputStream, int i10) {
        i(f19160t, i10, outputStream, 0);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public boolean markSupported() {
        Iterator<u1> it = this.f19161a.iterator();
        while (it.hasNext()) {
            if (!it.next().markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.u1
    public void r0(ByteBuffer byteBuffer) {
        j(f19159s, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.u1
    public int readUnsignedByte() {
        return j(f19156e, 1, null, 0);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public void reset() {
        if (!this.f19164d) {
            throw new InvalidMarkException();
        }
        u1 peek = this.f19161a.peek();
        if (peek != null) {
            int k10 = peek.k();
            peek.reset();
            this.f19163c += peek.k() - k10;
        }
        while (true) {
            u1 pollLast = this.f19162b.pollLast();
            if (pollLast == null) {
                return;
            }
            pollLast.reset();
            this.f19161a.addFirst(pollLast);
            this.f19163c += pollLast.k();
        }
    }

    @Override // io.grpc.internal.u1
    public void skipBytes(int i10) {
        j(f19157f, i10, null, 0);
    }
}
