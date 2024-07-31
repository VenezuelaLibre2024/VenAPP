package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import p082eb.C7153i;
import p082eb.C7159o;

/* renamed from: io.grpc.internal.n0 */
/* loaded from: classes3.dex */
public abstract class AbstractC8878n0 implements InterfaceC8903u1 {

    /* renamed from: a */
    private final InterfaceC8903u1 f20749a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8878n0(InterfaceC8903u1 interfaceC8903u1) {
        this.f20749a = (InterfaceC8903u1) C7159o.m21313p(interfaceC8903u1, "buf");
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: A */
    public InterfaceC8903u1 mo25684A(int i10) {
        return this.f20749a.mo25684A(i10);
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: V0 */
    public void mo25685V0(byte[] bArr, int i10, int i11) {
        this.f20749a.mo25685V0(bArr, i10, i11);
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: d1 */
    public void mo25319d1() {
        this.f20749a.mo25319d1();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: k */
    public int mo25686k() {
        return this.f20749a.mo25686k();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: l1 */
    public void mo25687l1(OutputStream outputStream, int i10) {
        this.f20749a.mo25687l1(outputStream, i10);
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public boolean markSupported() {
        return this.f20749a.markSupported();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    /* renamed from: r0 */
    public void mo25688r0(ByteBuffer byteBuffer) {
        this.f20749a.mo25688r0(byteBuffer);
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public int readUnsignedByte() {
        return this.f20749a.readUnsignedByte();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public void reset() {
        this.f20749a.reset();
    }

    @Override // io.grpc.internal.InterfaceC8903u1
    public void skipBytes(int i10) {
        this.f20749a.skipBytes(i10);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", this.f20749a).toString();
    }
}
