package p425wi;

import dm.C7056b;
import io.grpc.internal.AbstractC8833c;
import io.grpc.internal.InterfaceC8903u1;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: wi.l */
/* loaded from: classes3.dex */
class C12211l extends AbstractC8833c {

    /* renamed from: a */
    private final C7056b f32664a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12211l(C7056b c7056b) {
        this.f32664a = c7056b;
    }

    /* renamed from: b */
    private void m39312b() {
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: A */
    public InterfaceC8903u1 mo25684A(int i10) {
        C7056b c7056b = new C7056b();
        c7056b.mo19710K0(this.f32664a, i10);
        return new C12211l(c7056b);
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: V0 */
    public void mo25685V0(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int read = this.f32664a.read(bArr, i10, i11);
            if (read == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i11 + " bytes");
            }
            i11 -= read;
            i10 += read;
        }
    }

    @Override // io.grpc.internal.AbstractC8833c, io.grpc.internal.InterfaceC8903u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32664a.m20714b();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: k */
    public int mo25686k() {
        return (int) this.f32664a.size();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: l1 */
    public void mo25687l1(OutputStream outputStream, int i10) {
        this.f32664a.m20716b1(outputStream, i10);
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: r0 */
    public void mo25688r0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public int readUnsignedByte() {
        try {
            m39312b();
            return this.f32664a.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public void skipBytes(int i10) {
        try {
            this.f32664a.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }
}
