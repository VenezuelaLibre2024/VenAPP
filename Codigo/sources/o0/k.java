package o0;

import java.util.Iterator;
import o0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends p {
    public k(n0.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f22133h.f22092k.add(fVar);
        fVar.f22093l.add(this.f22133h);
    }

    @Override // o0.p, o0.d
    public void a(d dVar) {
        n0.a aVar = (n0.a) this.f22127b;
        int s12 = aVar.s1();
        Iterator<f> it = this.f22133h.f22093l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f22088g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (s12 == 0 || s12 == 2) {
            this.f22133h.d(i11 + aVar.t1());
        } else {
            this.f22133h.d(i10 + aVar.t1());
        }
    }

    @Override // o0.p
    public void d() {
        p pVar;
        n0.e eVar = this.f22127b;
        if (eVar instanceof n0.a) {
            this.f22133h.f22083b = true;
            n0.a aVar = (n0.a) eVar;
            int s12 = aVar.s1();
            boolean r12 = aVar.r1();
            int i10 = 0;
            if (s12 == 0) {
                this.f22133h.f22086e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    n0.e eVar2 = aVar.L0[i10];
                    if (r12 || eVar2.T() != 8) {
                        f fVar = eVar2.f21602e.f22133h;
                        fVar.f22092k.add(this.f22133h);
                        this.f22133h.f22093l.add(fVar);
                    }
                    i10++;
                }
            } else {
                if (s12 != 1) {
                    if (s12 == 2) {
                        this.f22133h.f22086e = f.a.TOP;
                        while (i10 < aVar.M0) {
                            n0.e eVar3 = aVar.L0[i10];
                            if (r12 || eVar3.T() != 8) {
                                f fVar2 = eVar3.f21604f.f22133h;
                                fVar2.f22092k.add(this.f22133h);
                                this.f22133h.f22093l.add(fVar2);
                            }
                            i10++;
                        }
                    } else {
                        if (s12 != 3) {
                            return;
                        }
                        this.f22133h.f22086e = f.a.BOTTOM;
                        while (i10 < aVar.M0) {
                            n0.e eVar4 = aVar.L0[i10];
                            if (r12 || eVar4.T() != 8) {
                                f fVar3 = eVar4.f21604f.f22134i;
                                fVar3.f22092k.add(this.f22133h);
                                this.f22133h.f22093l.add(fVar3);
                            }
                            i10++;
                        }
                    }
                    q(this.f22127b.f21604f.f22133h);
                    pVar = this.f22127b.f21604f;
                    q(pVar.f22134i);
                }
                this.f22133h.f22086e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    n0.e eVar5 = aVar.L0[i10];
                    if (r12 || eVar5.T() != 8) {
                        f fVar4 = eVar5.f21602e.f22134i;
                        fVar4.f22092k.add(this.f22133h);
                        this.f22133h.f22093l.add(fVar4);
                    }
                    i10++;
                }
            }
            q(this.f22127b.f21602e.f22133h);
            pVar = this.f22127b.f21602e;
            q(pVar.f22134i);
        }
    }

    @Override // o0.p
    public void e() {
        n0.e eVar = this.f22127b;
        if (eVar instanceof n0.a) {
            int s12 = ((n0.a) eVar).s1();
            if (s12 == 0 || s12 == 1) {
                this.f22127b.j1(this.f22133h.f22088g);
            } else {
                this.f22127b.k1(this.f22133h.f22088g);
            }
        }
    }

    @Override // o0.p
    public void f() {
        this.f22128c = null;
        this.f22133h.c();
    }

    @Override // o0.p
    public boolean m() {
        return false;
    }
}
