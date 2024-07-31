package j8;

import g8.i;
import java.util.List;

/* loaded from: classes.dex */
final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final List<g8.b> f19821a;

    public b(List<g8.b> list) {
        this.f19821a = list;
    }

    @Override // g8.i
    public int b(long j10) {
        return -1;
    }

    @Override // g8.i
    public List<g8.b> h(long j10) {
        return this.f19821a;
    }

    @Override // g8.i
    public long i(int i10) {
        return 0L;
    }

    @Override // g8.i
    public int l() {
        return 1;
    }
}
