package o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends p {
    public j(n0.e eVar) {
        super(eVar);
        eVar.f21602e.f();
        eVar.f21604f.f();
        this.f22131f = ((n0.g) eVar).p1();
    }

    private void q(f fVar) {
        this.f22133h.f22092k.add(fVar);
        fVar.f22093l.add(this.f22133h);
    }

    @Override // o0.p, o0.d
    public void a(d dVar) {
        f fVar = this.f22133h;
        if (fVar.f22084c && !fVar.f22091j) {
            this.f22133h.d((int) ((fVar.f22093l.get(0).f22088g * ((n0.g) this.f22127b).s1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o0.p
    public void d() {
        f fVar;
        p pVar;
        f fVar2;
        n0.g gVar = (n0.g) this.f22127b;
        int q12 = gVar.q1();
        int r12 = gVar.r1();
        gVar.s1();
        if (gVar.p1() == 1) {
            f fVar3 = this.f22133h;
            if (q12 != -1) {
                fVar3.f22093l.add(this.f22127b.f21595a0.f21602e.f22133h);
                this.f22127b.f21595a0.f21602e.f22133h.f22092k.add(this.f22133h);
                fVar2 = this.f22133h;
            } else if (r12 != -1) {
                fVar3.f22093l.add(this.f22127b.f21595a0.f21602e.f22134i);
                this.f22127b.f21595a0.f21602e.f22134i.f22092k.add(this.f22133h);
                fVar2 = this.f22133h;
                q12 = -r12;
            } else {
                fVar3.f22083b = true;
                fVar3.f22093l.add(this.f22127b.f21595a0.f21602e.f22134i);
                this.f22127b.f21595a0.f21602e.f22134i.f22092k.add(this.f22133h);
                q(this.f22127b.f21602e.f22133h);
                pVar = this.f22127b.f21602e;
            }
            fVar2.f22087f = q12;
            q(this.f22127b.f21602e.f22133h);
            pVar = this.f22127b.f21602e;
        } else {
            f fVar4 = this.f22133h;
            if (q12 != -1) {
                fVar4.f22093l.add(this.f22127b.f21595a0.f21604f.f22133h);
                this.f22127b.f21595a0.f21604f.f22133h.f22092k.add(this.f22133h);
                fVar = this.f22133h;
            } else if (r12 != -1) {
                fVar4.f22093l.add(this.f22127b.f21595a0.f21604f.f22134i);
                this.f22127b.f21595a0.f21604f.f22134i.f22092k.add(this.f22133h);
                fVar = this.f22133h;
                q12 = -r12;
            } else {
                fVar4.f22083b = true;
                fVar4.f22093l.add(this.f22127b.f21595a0.f21604f.f22134i);
                this.f22127b.f21595a0.f21604f.f22134i.f22092k.add(this.f22133h);
                q(this.f22127b.f21604f.f22133h);
                pVar = this.f22127b.f21604f;
            }
            fVar.f22087f = q12;
            q(this.f22127b.f21604f.f22133h);
            pVar = this.f22127b.f21604f;
        }
        q(pVar.f22134i);
    }

    @Override // o0.p
    public void e() {
        if (((n0.g) this.f22127b).p1() == 1) {
            this.f22127b.j1(this.f22133h.f22088g);
        } else {
            this.f22127b.k1(this.f22133h.f22088g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o0.p
    public void f() {
        this.f22133h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o0.p
    public boolean m() {
        return false;
    }
}
