package io.grpc.internal;

/* loaded from: classes3.dex */
public abstract class c implements u1 {
    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i10) {
        if (k() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.u1
    public void d1() {
    }

    @Override // io.grpc.internal.u1
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.u1
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
