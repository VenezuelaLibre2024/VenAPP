package n0;

import n0.e;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    static boolean[] f21665a = new boolean[3];

    public static void a(f fVar, k0.d dVar, e eVar) {
        eVar.f21632t = -1;
        eVar.f21634u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f21590g;
            int U = fVar.U() - eVar.Q.f21590g;
            d dVar2 = eVar.O;
            dVar2.f21592i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f21592i = dVar.q(dVar3);
            dVar.f(eVar.O.f21592i, i10);
            dVar.f(eVar.Q.f21592i, U);
            eVar.f21632t = 2;
            eVar.L0(i10, U);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.P.f21590g;
        int v10 = fVar.v() - eVar.R.f21590g;
        d dVar4 = eVar.P;
        dVar4.f21592i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f21592i = dVar.q(dVar5);
        dVar.f(eVar.P.f21592i, i11);
        dVar.f(eVar.R.f21592i, v10);
        if (eVar.f21617l0 > 0 || eVar.T() == 8) {
            d dVar6 = eVar.S;
            dVar6.f21592i = dVar.q(dVar6);
            dVar.f(eVar.S.f21592i, eVar.f21617l0 + i11);
        }
        eVar.f21634u = 2;
        eVar.c1(i11, v10);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
