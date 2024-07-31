package n8;

import g8.i;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t8.r0;

/* loaded from: classes.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final d f21903a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f21904b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g> f21905c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, e> f21906d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f21907e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f21903a = dVar;
        this.f21906d = map2;
        this.f21907e = map3;
        this.f21905c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f21904b = dVar.j();
    }

    @Override // g8.i
    public int b(long j10) {
        int e10 = r0.e(this.f21904b, j10, false, false);
        if (e10 < this.f21904b.length) {
            return e10;
        }
        return -1;
    }

    @Override // g8.i
    public List<g8.b> h(long j10) {
        return this.f21903a.h(j10, this.f21905c, this.f21906d, this.f21907e);
    }

    @Override // g8.i
    public long i(int i10) {
        return this.f21904b[i10];
    }

    @Override // g8.i
    public int l() {
        return this.f21904b.length;
    }
}
