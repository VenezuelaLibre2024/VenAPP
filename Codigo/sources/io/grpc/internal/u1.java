package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface u1 extends Closeable {
    u1 A(int i10);

    void V0(byte[] bArr, int i10, int i11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d1();

    int k();

    void l1(OutputStream outputStream, int i10);

    boolean markSupported();

    void r0(ByteBuffer byteBuffer);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);
}
