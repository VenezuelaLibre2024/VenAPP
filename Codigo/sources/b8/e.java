package b8;

import java.util.List;
import s8.g0;

/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    private final k f6214a;

    /* renamed from: b, reason: collision with root package name */
    private final List<u7.c> f6215b;

    public e(k kVar, List<u7.c> list) {
        this.f6214a = kVar;
        this.f6215b = list;
    }

    @Override // b8.k
    public g0.a<i> a(h hVar, g gVar) {
        return new u7.b(this.f6214a.a(hVar, gVar), this.f6215b);
    }

    @Override // b8.k
    public g0.a<i> b() {
        return new u7.b(this.f6214a.b(), this.f6215b);
    }
}
