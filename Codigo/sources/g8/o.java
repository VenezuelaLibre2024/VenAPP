package g8;

import java.util.List;

/* loaded from: classes.dex */
public abstract class o extends w6.h implements i {

    /* renamed from: d, reason: collision with root package name */
    private i f16103d;

    /* renamed from: e, reason: collision with root package name */
    private long f16104e;

    @Override // g8.i
    public int b(long j10) {
        return ((i) t8.a.e(this.f16103d)).b(j10 - this.f16104e);
    }

    @Override // g8.i
    public List<b> h(long j10) {
        return ((i) t8.a.e(this.f16103d)).h(j10 - this.f16104e);
    }

    @Override // g8.i
    public long i(int i10) {
        return ((i) t8.a.e(this.f16103d)).i(i10) + this.f16104e;
    }

    @Override // g8.i
    public int l() {
        return ((i) t8.a.e(this.f16103d)).l();
    }

    @Override // w6.a
    public void n() {
        super.n();
        this.f16103d = null;
    }

    public void y(long j10, i iVar, long j11) {
        this.f29687b = j10;
        this.f16103d = iVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f16104e = j10;
    }
}
