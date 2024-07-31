package p324r3;

import p036c4.C1870k;
import p171j3.InterfaceC8975v;

/* renamed from: r3.b */
/* loaded from: classes.dex */
public class C10612b implements InterfaceC8975v<byte[]> {

    /* renamed from: a */
    private final byte[] f26812a;

    public C10612b(byte[] bArr) {
        this.f26812a = (byte[]) C1870k.m9950d(bArr);
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f26812a;
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: p */
    public int mo26309p() {
        return this.f26812a.length;
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: q */
    public void mo26310q() {
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: r */
    public Class<byte[]> mo26311r() {
        return byte[].class;
    }
}
