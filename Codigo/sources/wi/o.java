package wi;

import io.grpc.internal.o2;

/* loaded from: classes3.dex */
class o implements o2 {

    /* renamed from: a, reason: collision with root package name */
    private final dm.b f30154a;

    /* renamed from: b, reason: collision with root package name */
    private int f30155b;

    /* renamed from: c, reason: collision with root package name */
    private int f30156c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(dm.b bVar, int i10) {
        this.f30154a = bVar;
        this.f30155b = i10;
    }

    @Override // io.grpc.internal.o2
    public int a() {
        return this.f30155b;
    }

    @Override // io.grpc.internal.o2
    public void b(byte b10) {
        this.f30154a.writeByte(b10);
        this.f30155b--;
        this.f30156c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dm.b c() {
        return this.f30154a;
    }

    @Override // io.grpc.internal.o2
    public int k() {
        return this.f30156c;
    }

    @Override // io.grpc.internal.o2
    public void release() {
    }

    @Override // io.grpc.internal.o2
    public void write(byte[] bArr, int i10, int i11) {
        this.f30154a.write(bArr, i10, i11);
        this.f30155b -= i11;
        this.f30156c += i11;
    }
}
