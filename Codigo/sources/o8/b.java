package o8;

import g8.i;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final b f22326b = new b();

    /* renamed from: a, reason: collision with root package name */
    private final List<g8.b> f22327a;

    private b() {
        this.f22327a = Collections.emptyList();
    }

    public b(g8.b bVar) {
        this.f22327a = Collections.singletonList(bVar);
    }

    @Override // g8.i
    public int b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // g8.i
    public List<g8.b> h(long j10) {
        return j10 >= 0 ? this.f22327a : Collections.emptyList();
    }

    @Override // g8.i
    public long i(int i10) {
        t8.a.a(i10 == 0);
        return 0L;
    }

    @Override // g8.i
    public int l() {
        return 1;
    }
}
