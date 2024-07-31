package k3;

/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // k3.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // k3.a
    public int b() {
        return 1;
    }

    @Override // k3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // k3.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
