package l8;

import g8.i;
import java.util.Collections;
import java.util.List;
import t8.r0;

/* loaded from: classes.dex */
final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    private final List<List<g8.b>> f21025a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Long> f21026b;

    public d(List<List<g8.b>> list, List<Long> list2) {
        this.f21025a = list;
        this.f21026b = list2;
    }

    @Override // g8.i
    public int b(long j10) {
        int d10 = r0.d(this.f21026b, Long.valueOf(j10), false, false);
        if (d10 < this.f21026b.size()) {
            return d10;
        }
        return -1;
    }

    @Override // g8.i
    public List<g8.b> h(long j10) {
        int f10 = r0.f(this.f21026b, Long.valueOf(j10), true, false);
        return f10 == -1 ? Collections.emptyList() : this.f21025a.get(f10);
    }

    @Override // g8.i
    public long i(int i10) {
        t8.a.a(i10 >= 0);
        t8.a.a(i10 < this.f21026b.size());
        return this.f21026b.get(i10).longValue();
    }

    @Override // g8.i
    public int l() {
        return this.f21026b.size();
    }
}
