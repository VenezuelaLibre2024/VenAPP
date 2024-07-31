package o0;

import o0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f22094m;

    public g(p pVar) {
        super(pVar);
        this.f22086e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // o0.f
    public void d(int i10) {
        if (this.f22091j) {
            return;
        }
        this.f22091j = true;
        this.f22088g = i10;
        for (d dVar : this.f22092k) {
            dVar.a(dVar);
        }
    }
}
