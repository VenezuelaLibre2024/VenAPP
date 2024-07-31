package tg;

import java.util.Map;

/* loaded from: classes2.dex */
public final class u implements dg.u {

    /* renamed from: a, reason: collision with root package name */
    private final j f26940a = new j();

    @Override // dg.u
    public kg.b a(String str, dg.a aVar, int i10, int i11, Map<dg.g, ?> map) {
        if (aVar != dg.a.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
        }
        return this.f26940a.a('0' + str, dg.a.EAN_13, i10, i11, map);
    }
}
