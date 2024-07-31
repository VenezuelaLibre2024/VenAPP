package d7;

import y6.l;
import y6.u;

/* loaded from: classes.dex */
final class c extends u {

    /* renamed from: b, reason: collision with root package name */
    private final long f13818b;

    public c(l lVar, long j10) {
        super(lVar);
        t8.a.a(lVar.getPosition() >= j10);
        this.f13818b = j10;
    }

    @Override // y6.u, y6.l
    public long getLength() {
        return super.getLength() - this.f13818b;
    }

    @Override // y6.u, y6.l
    public long getPosition() {
        return super.getPosition() - this.f13818b;
    }

    @Override // y6.u, y6.l
    public long i() {
        return super.i() - this.f13818b;
    }
}
