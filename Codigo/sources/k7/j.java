package k7;

import k7.b;
import k7.e0;
import k7.l;
import t8.r0;

/* loaded from: classes.dex */
public final class j implements l.b {

    /* renamed from: a, reason: collision with root package name */
    private int f20444a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20445b;

    @Override // k7.l.b
    public l a(l.a aVar) {
        int i10;
        int i11 = r0.f26744a;
        if (i11 < 23 || ((i10 = this.f20444a) != 1 && (i10 != 0 || i11 < 31))) {
            return new e0.b().a(aVar);
        }
        int k10 = t8.w.k(aVar.f20453c.f26517w);
        t8.s.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + r0.l0(k10));
        return new b.C0321b(k10, this.f20445b).a(aVar);
    }
}
