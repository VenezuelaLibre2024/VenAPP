package ul;

import ck.v;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f27811e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f27812f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ok.a<v> f27813g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z10, ok.a<v> aVar) {
        super(str, z10);
        this.f27811e = str;
        this.f27812f = z10;
        this.f27813g = aVar;
    }

    @Override // ul.a
    public long f() {
        this.f27813g.invoke();
        return -1L;
    }
}
