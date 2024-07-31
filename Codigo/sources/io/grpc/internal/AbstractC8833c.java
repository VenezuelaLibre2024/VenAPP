package io.grpc.internal;

/* renamed from: io.grpc.internal.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8833c implements InterfaceC8903u1 {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m25318a(int i10) {
        if (mo25686k() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.InterfaceC8903u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: d1 */
    public void mo25319d1() {
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        m25318a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
