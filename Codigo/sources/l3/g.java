package l3;

import j3.v;
import l3.h;

/* loaded from: classes.dex */
public class g extends c4.h<h3.f, v<?>> implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f20897e;

    public g(long j10) {
        super(j10);
    }

    @Override // l3.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // l3.h
    public /* bridge */ /* synthetic */ v c(h3.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    @Override // l3.h
    public void d(h.a aVar) {
        this.f20897e = aVar;
    }

    @Override // l3.h
    public /* bridge */ /* synthetic */ v e(h3.f fVar) {
        return (v) super.l(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v<?> vVar) {
        return vVar == null ? super.i(null) : vVar.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(h3.f fVar, v<?> vVar) {
        h.a aVar = this.f20897e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.a(vVar);
    }
}
