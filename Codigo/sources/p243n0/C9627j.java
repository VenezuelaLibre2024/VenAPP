package p243n0;

import p190k0.C9102d;
import p243n0.C9622e;

/* renamed from: n0.j */
/* loaded from: classes.dex */
public class C9627j {

    /* renamed from: a */
    static boolean[] f23584a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m28820a(C9623f c9623f, C9102d c9102d, C9622e c9622e) {
        c9622e.f23527t = -1;
        c9622e.f23529u = -1;
        C9622e.b bVar = c9623f.f23488Z[0];
        C9622e.b bVar2 = C9622e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c9622e.f23488Z[0] == C9622e.b.MATCH_PARENT) {
            int i10 = c9622e.f23477O.f23448g;
            int m28708U = c9623f.m28708U() - c9622e.f23479Q.f23448g;
            C9621d c9621d = c9622e.f23477O;
            c9621d.f23450i = c9102d.m26792q(c9621d);
            C9621d c9621d2 = c9622e.f23479Q;
            c9621d2.f23450i = c9102d.m26792q(c9621d2);
            c9102d.m26783f(c9622e.f23477O.f23450i, i10);
            c9102d.m26783f(c9622e.f23479Q.f23450i, m28708U);
            c9622e.f23527t = 2;
            c9622e.m28693L0(i10, m28708U);
        }
        if (c9623f.f23488Z[1] == bVar2 || c9622e.f23488Z[1] != C9622e.b.MATCH_PARENT) {
            return;
        }
        int i11 = c9622e.f23478P.f23448g;
        int m28765v = c9623f.m28765v() - c9622e.f23480R.f23448g;
        C9621d c9621d3 = c9622e.f23478P;
        c9621d3.f23450i = c9102d.m26792q(c9621d3);
        C9621d c9621d4 = c9622e.f23480R;
        c9621d4.f23450i = c9102d.m26792q(c9621d4);
        c9102d.m26783f(c9622e.f23478P.f23450i, i11);
        c9102d.m26783f(c9622e.f23480R.f23450i, m28765v);
        if (c9622e.f23512l0 > 0 || c9622e.m28706T() == 8) {
            C9621d c9621d5 = c9622e.f23481S;
            c9621d5.f23450i = c9102d.m26792q(c9621d5);
            c9102d.m26783f(c9622e.f23481S.f23450i, c9622e.f23512l0 + i11);
        }
        c9622e.f23529u = 2;
        c9622e.m28725c1(i11, m28765v);
    }

    /* renamed from: b */
    public static final boolean m28821b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
