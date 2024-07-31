package r3;

import c4.k;
import j3.v;

/* loaded from: classes.dex */
public class b implements v<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24698a;

    public b(byte[] bArr) {
        this.f24698a = (byte[]) k.d(bArr);
    }

    @Override // j3.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f24698a;
    }

    @Override // j3.v
    public int p() {
        return this.f24698a.length;
    }

    @Override // j3.v
    public void q() {
    }

    @Override // j3.v
    public Class<byte[]> r() {
        return byte[].class;
    }
}
