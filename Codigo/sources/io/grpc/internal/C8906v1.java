package io.grpc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import p082eb.C7159o;
import vi.InterfaceC11937o0;

/* renamed from: io.grpc.internal.v1 */
/* loaded from: classes3.dex */
public final class C8906v1 {

    /* renamed from: a */
    private static final InterfaceC8903u1 f20924a = new c(new byte[0]);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.v1$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8878n0 {
        a(InterfaceC8903u1 interfaceC8903u1) {
            super(interfaceC8903u1);
        }

        @Override // io.grpc.internal.InterfaceC8903u1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: io.grpc.internal.v1$b */
    /* loaded from: classes3.dex */
    private static final class b extends InputStream implements InterfaceC11937o0 {

        /* renamed from: a */
        private InterfaceC8903u1 f20925a;

        public b(InterfaceC8903u1 interfaceC8903u1) {
            this.f20925a = (InterfaceC8903u1) C7159o.m21313p(interfaceC8903u1, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f20925a.mo25686k();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f20925a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f20925a.mo25319d1();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f20925a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f20925a.mo25686k() == 0) {
                return -1;
            }
            return this.f20925a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (this.f20925a.mo25686k() == 0) {
                return -1;
            }
            int min = Math.min(this.f20925a.mo25686k(), i11);
            this.f20925a.mo25685V0(bArr, i10, min);
            return min;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f20925a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            int min = (int) Math.min(this.f20925a.mo25686k(), j10);
            this.f20925a.skipBytes(min);
            return min;
        }
    }

    /* renamed from: io.grpc.internal.v1$c */
    /* loaded from: classes3.dex */
    private static class c extends AbstractC8833c {

        /* renamed from: a */
        int f20926a;

        /* renamed from: b */
        final int f20927b;

        /* renamed from: c */
        final byte[] f20928c;

        /* renamed from: d */
        int f20929d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        c(byte[] bArr, int i10, int i11) {
            this.f20929d = -1;
            C7159o.m21302e(i10 >= 0, "offset must be >= 0");
            C7159o.m21302e(i11 >= 0, "length must be >= 0");
            int i12 = i11 + i10;
            C7159o.m21302e(i12 <= bArr.length, "offset + length exceeds array boundary");
            this.f20928c = (byte[]) C7159o.m21313p(bArr, "bytes");
            this.f20926a = i10;
            this.f20927b = i12;
        }

        @Override // io.grpc.internal.InterfaceC8903u1
        /* renamed from: V0 */
        public void mo25685V0(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f20928c, this.f20926a, bArr, i10, i11);
            this.f20926a += i11;
        }

        @Override // io.grpc.internal.InterfaceC8903u1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c mo25684A(int i10) {
            m25318a(i10);
            int i11 = this.f20926a;
            this.f20926a = i11 + i10;
            return new c(this.f20928c, i11, i10);
        }

        @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1
        /* renamed from: d1 */
        public void mo25319d1() {
            this.f20929d = this.f20926a;
        }

        @Override // io.grpc.internal.InterfaceC8903u1
        /* renamed from: k */
        public int mo25686k() {
            return this.f20927b - this.f20926a;
        }

        @Override // io.grpc.internal.InterfaceC8903u1
        /* renamed from: l1 */
        public void mo25687l1(OutputStream outputStream, int i10) {
            m25318a(i10);
            outputStream.write(this.f20928c, this.f20926a, i10);
            this.f20926a += i10;
        }

        @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.InterfaceC8903u1
        /* renamed from: r0 */
        public void mo25688r0(ByteBuffer byteBuffer) {
            C7159o.m21313p(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            m25318a(remaining);
            byteBuffer.put(this.f20928c, this.f20926a, remaining);
            this.f20926a += remaining;
        }

        @Override // io.grpc.internal.InterfaceC8903u1
        public int readUnsignedByte() {
            m25318a(1);
            byte[] bArr = this.f20928c;
            int i10 = this.f20926a;
            this.f20926a = i10 + 1;
            return bArr[i10] & 255;
        }

        @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1
        public void reset() {
            int i10 = this.f20929d;
            if (i10 == -1) {
                throw new InvalidMarkException();
            }
            this.f20926a = i10;
        }

        @Override // io.grpc.internal.InterfaceC8903u1
        public void skipBytes(int i10) {
            m25318a(i10);
            this.f20926a += i10;
        }
    }

    /* renamed from: a */
    public static InterfaceC8903u1 m25866a() {
        return f20924a;
    }

    /* renamed from: b */
    public static InterfaceC8903u1 m25867b(InterfaceC8903u1 interfaceC8903u1) {
        return new a(interfaceC8903u1);
    }

    /* renamed from: c */
    public static InputStream m25868c(InterfaceC8903u1 interfaceC8903u1, boolean z10) {
        if (!z10) {
            interfaceC8903u1 = m25867b(interfaceC8903u1);
        }
        return new b(interfaceC8903u1);
    }

    /* renamed from: d */
    public static byte[] m25869d(InterfaceC8903u1 interfaceC8903u1) {
        C7159o.m21313p(interfaceC8903u1, "buffer");
        int mo25686k = interfaceC8903u1.mo25686k();
        byte[] bArr = new byte[mo25686k];
        interfaceC8903u1.mo25685V0(bArr, 0, mo25686k);
        return bArr;
    }

    /* renamed from: e */
    public static String m25870e(InterfaceC8903u1 interfaceC8903u1, Charset charset) {
        C7159o.m21313p(charset, "charset");
        return new String(m25869d(interfaceC8903u1), charset);
    }

    /* renamed from: f */
    public static InterfaceC8903u1 m25871f(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }
}
