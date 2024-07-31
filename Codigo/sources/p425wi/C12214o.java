package p425wi;

import dm.C7056b;
import io.grpc.internal.InterfaceC8884o2;

/* renamed from: wi.o */
/* loaded from: classes3.dex */
class C12214o implements InterfaceC8884o2 {

    /* renamed from: a */
    private final C7056b f32666a;

    /* renamed from: b */
    private int f32667b;

    /* renamed from: c */
    private int f32668c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12214o(C7056b c7056b, int i10) {
        this.f32666a = c7056b;
        this.f32667b = i10;
    }

    @Override // io.grpc.internal.InterfaceC8884o2
    /* renamed from: a */
    public int mo25704a() {
        return this.f32667b;
    }

    @Override // io.grpc.internal.InterfaceC8884o2
    /* renamed from: b */
    public void mo25705b(byte b10) {
        this.f32666a.writeByte(b10);
        this.f32667b--;
        this.f32668c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C7056b m39318c() {
        return this.f32666a;
    }

    @Override // io.grpc.internal.InterfaceC8884o2
    /* renamed from: k */
    public int mo25706k() {
        return this.f32668c;
    }

    @Override // io.grpc.internal.InterfaceC8884o2
    public void release() {
    }

    @Override // io.grpc.internal.InterfaceC8884o2
    public void write(byte[] bArr, int i10, int i11) {
        this.f32666a.write(bArr, i10, i11);
        this.f32667b -= i11;
        this.f32668c += i11;
    }
}
