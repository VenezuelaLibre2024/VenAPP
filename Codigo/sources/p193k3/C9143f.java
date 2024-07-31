package p193k3;

/* renamed from: k3.f */
/* loaded from: classes.dex */
public final class C9143f implements InterfaceC9138a<byte[]> {
    @Override // p193k3.InterfaceC9138a
    /* renamed from: a */
    public String mo26938a() {
        return "ByteArrayPool";
    }

    @Override // p193k3.InterfaceC9138a
    /* renamed from: b */
    public int mo26939b() {
        return 1;
    }

    @Override // p193k3.InterfaceC9138a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int mo26940c(byte[] bArr) {
        return bArr.length;
    }

    @Override // p193k3.InterfaceC9138a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
