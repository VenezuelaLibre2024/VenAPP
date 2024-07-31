package p8;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements g8.i {

    /* renamed from: a, reason: collision with root package name */
    private final List<g8.b> f22871a;

    public b(List<g8.b> list) {
        this.f22871a = Collections.unmodifiableList(list);
    }

    @Override // g8.i
    public int b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // g8.i
    public List<g8.b> h(long j10) {
        return j10 >= 0 ? this.f22871a : Collections.emptyList();
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
