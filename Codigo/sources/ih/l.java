package ih;

/* loaded from: classes3.dex */
public class l extends f {

    /* renamed from: c, reason: collision with root package name */
    private boolean f17795c;

    public l(dg.o oVar) {
        super(oVar);
        this.f17795c = true;
    }

    @Override // ih.f
    protected dg.c e(dg.j jVar) {
        if (this.f17795c) {
            this.f17795c = false;
            return new dg.c(new kg.m(jVar.e()));
        }
        this.f17795c = true;
        return new dg.c(new kg.m(jVar));
    }
}
