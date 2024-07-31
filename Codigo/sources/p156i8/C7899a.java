package p156i8;

import java.util.List;
import p120g8.AbstractC7490h;
import p120g8.InterfaceC7491i;
import p363t8.C11146e0;

/* renamed from: i8.a */
/* loaded from: classes.dex */
public final class C7899a extends AbstractC7490h {

    /* renamed from: o */
    private final C7900b f19205o;

    public C7899a(List<byte[]> list) {
        super("DvbDecoder");
        C11146e0 c11146e0 = new C11146e0(list.get(0));
        this.f19205o = new C7900b(c11146e0.m34670N(), c11146e0.m34670N());
    }

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f19205o.m24377r();
        }
        return new C7901c(this.f19205o.m24376b(bArr, i10));
    }
}
