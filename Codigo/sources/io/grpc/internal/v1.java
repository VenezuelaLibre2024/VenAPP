package io.grpc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a */
    private static final u1 f19177a = new c(new byte[0]);

    /* loaded from: classes3.dex */
    public class a extends n0 {
        a(u1 u1Var) {
            super(u1Var);
        }

        @Override // io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b extends InputStream implements vi.o0 {

        /* renamed from: a */
        private u1 f19178a;

        public b(u1 u1Var) {
            this.f19178a = (u1) eb.o.p(u1Var, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f19178a.k();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f19178a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f19178a.d1();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f19178a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f19178a.k() == 0) {
                return -1;
            }
            return this.f19178a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (this.f19178a.k() == 0) {
                return -1;
            }
            int min = Math.min(this.f19178a.k(), i11);
            this.f19178a.V0(bArr, i10, min);
            return min;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f19178a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            int min = (int) Math.min(this.f19178a.k(), j10);
            this.f19178a.skipBytes(min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends io.grpc.internal.c {

        /* renamed from: a */
        int f19179a;

        /* renamed from: b */
        final int f19180b;

        /* renamed from: c */
        final byte[] f19181c;

        /* renamed from: d */
        int f19182d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        c(byte[] bArr, int i10, int i11) {
            this.f19182d = -1;
            eb.o.e(i10 >= 0, "offset must be >= 0");
            eb.o.e(i11 >= 0, "length must be >= 0");
            int i12 = i11 + i10;
            eb.o.e(i12 <= bArr.length, "offset + length exceeds array boundary");
            this.f19181c = (byte[]) eb.o.p(bArr, "bytes");
            this.f19179a = i10;
            this.f19180b = i12;
        }

        @Override // io.grpc.internal.u1
        public void V0(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f19181c, this.f19179a, bArr, i10, i11);
            this.f19179a += i11;
        }

        @Override // io.grpc.internal.u1
        /* renamed from: b */
        public c A(int i10) {
            a(i10);
            int i11 = this.f19179a;
            this.f19179a = i11 + i10;
            return new c(this.f19181c, i11, i10);
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public void d1() {
            this.f19182d = this.f19179a;
        }

        @Override // io.grpc.internal.u1
        public int k() {
            return this.f19180b - this.f19179a;
        }

        @Override // io.grpc.internal.u1
        public void l1(OutputStream outputStream, int i10) {
            a(i10);
            outputStream.write(this.f19181c, this.f19179a, i10);
            this.f19179a += i10;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.u1
        public void r0(ByteBuffer byteBuffer) {
            eb.o.p(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            a(remaining);
            byteBuffer.put(this.f19181c, this.f19179a, remaining);
            this.f19179a += remaining;
        }

        @Override // io.grpc.internal.u1
        public int readUnsignedByte() {
            a(1);
            byte[] bArr = this.f19181c;
            int i10 = this.f19179a;
            this.f19179a = i10 + 1;
            return bArr[i10] & 255;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public void reset() {
            int i10 = this.f19182d;
            if (i10 == -1) {
                throw new InvalidMarkException();
            }
            this.f19179a = i10;
        }

        @Override // io.grpc.internal.u1
        public void skipBytes(int i10) {
            a(i10);
            this.f19179a += i10;
        }
    }

    public static u1 a() {
        return f19177a;
    }

    public static u1 b(u1 u1Var) {
        return new a(u1Var);
    }

    public static InputStream c(u1 u1Var, boolean z10) {
        if (!z10) {
            u1Var = b(u1Var);
        }
        return new b(u1Var);
    }

    public static byte[] d(u1 u1Var) {
        eb.o.p(u1Var, "buffer");
        int k10 = u1Var.k();
        byte[] bArr = new byte[k10];
        u1Var.V0(bArr, 0, k10);
        return bArr;
    }

    public static String e(u1 u1Var, Charset charset) {
        eb.o.p(charset, "charset");
        return new String(d(u1Var), charset);
    }

    public static u1 f(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }
}
