package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: io.grpc.internal.u1 */
/* loaded from: classes3.dex */
public interface InterfaceC8903u1 extends Closeable {
    /* renamed from: A */
    InterfaceC8903u1 mo25684A(int i10);

    /* renamed from: V0 */
    void mo25685V0(byte[] bArr, int i10, int i11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: d1 */
    void mo25319d1();

    /* renamed from: k */
    int mo25686k();

    /* renamed from: l1 */
    void mo25687l1(OutputStream outputStream, int i10);

    boolean markSupported();

    /* renamed from: r0 */
    void mo25688r0(ByteBuffer byteBuffer);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);
}
