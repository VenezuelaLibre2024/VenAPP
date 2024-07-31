package wi;

import io.grpc.internal.u1;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
class l extends io.grpc.internal.c {

    /* renamed from: a, reason: collision with root package name */
    private final dm.b f30152a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(dm.b bVar) {
        this.f30152a = bVar;
    }

    private void b() {
    }

    @Override // io.grpc.internal.u1
    public u1 A(int i10) {
        dm.b bVar = new dm.b();
        bVar.K0(this.f30152a, i10);
        return new l(bVar);
    }

    @Override // io.grpc.internal.u1
    public void V0(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int read = this.f30152a.read(bArr, i10, i11);
            if (read == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i11 + " bytes");
            }
            i11 -= read;
            i10 += read;
        }
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30152a.b();
    }

    @Override // io.grpc.internal.u1
    public int k() {
        return (int) this.f30152a.size();
    }

    @Override // io.grpc.internal.u1
    public void l1(OutputStream outputStream, int i10) {
        this.f30152a.b1(outputStream, i10);
    }

    @Override // io.grpc.internal.u1
    public void r0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.u1
    public int readUnsignedByte() {
        try {
            b();
            return this.f30152a.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.u1
    public void skipBytes(int i10) {
        try {
            this.f30152a.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }
}
