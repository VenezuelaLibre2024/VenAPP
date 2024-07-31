package p197k7;

import p197k7.C9177b;
import p197k7.C9184e0;
import p197k7.InterfaceC9191l;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;

/* renamed from: k7.j */
/* loaded from: classes.dex */
public final class C9189j implements InterfaceC9191l.b {

    /* renamed from: a */
    private int f22226a = 0;

    /* renamed from: b */
    private boolean f22227b;

    @Override // p197k7.InterfaceC9191l.b
    /* renamed from: a */
    public InterfaceC9191l mo27153a(InterfaceC9191l.a aVar) {
        int i10;
        int i11 = C11172r0.f29040a;
        if (i11 < 23 || ((i10 = this.f22226a) != 1 && (i10 != 0 || i11 < 31))) {
            return new C9184e0.b().mo27153a(aVar);
        }
        int m35003k = C11178w.m35003k(aVar.f22235c.f28797w);
        C11173s.m34967f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + C11172r0.m34933l0(m35003k));
        return new C9177b.b(m35003k, this.f22227b).mo27153a(aVar);
    }
}
