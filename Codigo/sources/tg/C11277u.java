package tg;

import java.util.Map;
import kg.C9264b;
import p066dg.EnumC6940a;
import p066dg.EnumC6946g;
import p066dg.InterfaceC6960u;

/* renamed from: tg.u */
/* loaded from: classes2.dex */
public final class C11277u implements InterfaceC6960u {

    /* renamed from: a */
    private final C11266j f29242a = new C11266j();

    @Override // p066dg.InterfaceC6960u
    /* renamed from: a */
    public C9264b mo10303a(String str, EnumC6940a enumC6940a, int i10, int i11, Map<EnumC6946g, ?> map) {
        if (enumC6940a != EnumC6940a.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + enumC6940a);
        }
        return this.f29242a.mo10303a('0' + str, EnumC6940a.EAN_13, i10, i11, map);
    }
}
