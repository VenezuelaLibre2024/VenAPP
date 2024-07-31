package te;

import xe.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    private final g f26878a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar) {
        this.f26878a = gVar;
    }

    @Override // te.e
    public boolean c() {
        return this.f26878a.p0() && (this.f26878a.l0() > 0 || this.f26878a.k0() > 0 || (this.f26878a.o0() && this.f26878a.n0().g0()));
    }
}
