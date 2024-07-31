package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class n0 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    private final u1 f19002a;

    /* JADX INFO: Access modifiers changed from: protected */
    public n0(u1 u1Var) {
        this.f19002a = (u1) eb.o.p(u1Var, "buf");
    }

    @Override // io.grpc.internal.u1
    public u1 A(int i10) {
        return this.f19002a.A(i10);
    }

    @Override // io.grpc.internal.u1
    public void V0(byte[] bArr, int i10, int i11) {
        this.f19002a.V0(bArr, i10, i11);
    }

    @Override // io.grpc.internal.u1
    public void d1() {
        this.f19002a.d1();
    }

    @Override // io.grpc.internal.u1
    public int k() {
        return this.f19002a.k();
    }

    @Override // io.grpc.internal.u1
    public void l1(OutputStream outputStream, int i10) {
        this.f19002a.l1(outputStream, i10);
    }

    @Override // io.grpc.internal.u1
    public boolean markSupported() {
        return this.f19002a.markSupported();
    }

    @Override // io.grpc.internal.u1
    public void r0(ByteBuffer byteBuffer) {
        this.f19002a.r0(byteBuffer);
    }

    @Override // io.grpc.internal.u1
    public int readUnsignedByte() {
        return this.f19002a.readUnsignedByte();
    }

    @Override // io.grpc.internal.u1
    public void reset() {
        this.f19002a.reset();
    }

    @Override // io.grpc.internal.u1
    public void skipBytes(int i10) {
        this.f19002a.skipBytes(i10);
    }

    public String toString() {
        return eb.i.c(this).d("delegate", this.f19002a).toString();
    }
}
