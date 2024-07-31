package o0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n0.e;
import o0.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private n0.f f22073a;

    /* renamed from: d, reason: collision with root package name */
    private n0.f f22076d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22074b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22075c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f22077e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<m> f22078f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0362b f22079g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f22080h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m> f22081i = new ArrayList<>();

    public e(n0.f fVar) {
        this.f22073a = fVar;
        this.f22076d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f22085d;
        if (pVar.f22128c == null) {
            n0.f fVar3 = this.f22073a;
            if (pVar == fVar3.f21602e || pVar == fVar3.f21604f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f22128c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f22133h.f22092k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f22134i.f22092k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f22108k.f22092k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f22133h.f22093l) {
                if (fVar4 == fVar2) {
                    mVar.f22102b = true;
                }
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f22134i.f22093l) {
                if (fVar5 == fVar2) {
                    mVar.f22102b = true;
                }
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f22108k.f22093l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i10, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r2.f21640x == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(n0.f r17) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.e.b(n0.f):boolean");
    }

    private int e(n0.f fVar, int i10) {
        int size = this.f22081i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f22081i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f22133h.f22092k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f22134i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f22133h, i10, 0, pVar.f22134i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f22134i.f22092k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f22133h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f22134i, i10, 1, pVar.f22133h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f22108k.f22092k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(n0.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f22080h;
        aVar.f22061a = bVar;
        aVar.f22062b = bVar2;
        aVar.f22063c = i10;
        aVar.f22064d = i11;
        this.f22079g.b(eVar, aVar);
        eVar.h1(this.f22080h.f22065e);
        eVar.I0(this.f22080h.f22066f);
        eVar.H0(this.f22080h.f22068h);
        eVar.x0(this.f22080h.f22067g);
    }

    public void c() {
        d(this.f22077e);
        this.f22081i.clear();
        m.f22100h = 0;
        i(this.f22073a.f21602e, 0, this.f22081i);
        i(this.f22073a.f21604f, 1, this.f22081i);
        this.f22074b = false;
    }

    public void d(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.f22076d.f21602e.f();
        this.f22076d.f21604f.f();
        arrayList.add(this.f22076d.f21602e);
        arrayList.add(this.f22076d.f21604f);
        Iterator<n0.e> it = this.f22076d.L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            n0.e next = it.next();
            if (next instanceof n0.g) {
                jVar = new j(next);
            } else {
                if (next.g0()) {
                    if (next.f21598c == null) {
                        next.f21598c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f21598c);
                } else {
                    arrayList.add(next.f21602e);
                }
                if (next.i0()) {
                    if (next.f21600d == null) {
                        next.f21600d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f21600d);
                } else {
                    arrayList.add(next.f21604f);
                }
                if (next instanceof n0.i) {
                    jVar = new k(next);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f22127b != this.f22076d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f22074b || this.f22075c) {
            Iterator<n0.e> it = this.f22073a.L0.iterator();
            while (it.hasNext()) {
                n0.e next = it.next();
                next.l();
                next.f21594a = false;
                next.f21602e.r();
                next.f21604f.q();
            }
            this.f22073a.l();
            n0.f fVar = this.f22073a;
            fVar.f21594a = false;
            fVar.f21602e.r();
            this.f22073a.f21604f.q();
            this.f22075c = false;
        }
        if (b(this.f22076d)) {
            return false;
        }
        this.f22073a.j1(0);
        this.f22073a.k1(0);
        e.b s10 = this.f22073a.s(0);
        e.b s11 = this.f22073a.s(1);
        if (this.f22074b) {
            c();
        }
        int V = this.f22073a.V();
        int W = this.f22073a.W();
        this.f22073a.f21602e.f22133h.d(V);
        this.f22073a.f21604f.f22133h.d(W);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z13) {
                Iterator<p> it2 = this.f22077e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && s10 == e.b.WRAP_CONTENT) {
                this.f22073a.M0(e.b.FIXED);
                n0.f fVar2 = this.f22073a;
                fVar2.h1(e(fVar2, 0));
                n0.f fVar3 = this.f22073a;
                fVar3.f21602e.f22130e.d(fVar3.U());
            }
            if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f22073a.d1(e.b.FIXED);
                n0.f fVar4 = this.f22073a;
                fVar4.I0(e(fVar4, 1));
                n0.f fVar5 = this.f22073a;
                fVar5.f21604f.f22130e.d(fVar5.v());
            }
        }
        n0.f fVar6 = this.f22073a;
        e.b bVar2 = fVar6.Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int U = fVar6.U() + V;
            this.f22073a.f21602e.f22134i.d(U);
            this.f22073a.f21602e.f22130e.d(U - V);
            m();
            n0.f fVar7 = this.f22073a;
            e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + W;
                this.f22073a.f21604f.f22134i.d(v10);
                this.f22073a.f21604f.f22130e.d(v10 - W);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f22077e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f22127b != this.f22073a || next2.f22132g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f22077e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z11 || next3.f22127b != this.f22073a) {
                if (!next3.f22133h.f22091j || ((!next3.f22134i.f22091j && !(next3 instanceof j)) || (!next3.f22130e.f22091j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f22073a.M0(s10);
        this.f22073a.d1(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f22074b) {
            Iterator<n0.e> it = this.f22073a.L0.iterator();
            while (it.hasNext()) {
                n0.e next = it.next();
                next.l();
                next.f21594a = false;
                l lVar = next.f21602e;
                lVar.f22130e.f22091j = false;
                lVar.f22132g = false;
                lVar.r();
                n nVar = next.f21604f;
                nVar.f22130e.f22091j = false;
                nVar.f22132g = false;
                nVar.q();
            }
            this.f22073a.l();
            n0.f fVar = this.f22073a;
            fVar.f21594a = false;
            l lVar2 = fVar.f21602e;
            lVar2.f22130e.f22091j = false;
            lVar2.f22132g = false;
            lVar2.r();
            n nVar2 = this.f22073a.f21604f;
            nVar2.f22130e.f22091j = false;
            nVar2.f22132g = false;
            nVar2.q();
            c();
        }
        if (b(this.f22076d)) {
            return false;
        }
        this.f22073a.j1(0);
        this.f22073a.k1(0);
        this.f22073a.f21602e.f22133h.d(0);
        this.f22073a.f21604f.f22133h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        g gVar;
        int v10;
        boolean z12 = true;
        boolean z13 = z10 & true;
        e.b s10 = this.f22073a.s(0);
        e.b s11 = this.f22073a.s(1);
        int V = this.f22073a.V();
        int W = this.f22073a.W();
        if (z13 && (s10 == (bVar = e.b.WRAP_CONTENT) || s11 == bVar)) {
            Iterator<p> it = this.f22077e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f22131f == i10 && !next.m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && s10 == e.b.WRAP_CONTENT) {
                    this.f22073a.M0(e.b.FIXED);
                    n0.f fVar = this.f22073a;
                    fVar.h1(e(fVar, 0));
                    n0.f fVar2 = this.f22073a;
                    gVar = fVar2.f21602e.f22130e;
                    v10 = fVar2.U();
                    gVar.d(v10);
                }
            } else if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f22073a.d1(e.b.FIXED);
                n0.f fVar3 = this.f22073a;
                fVar3.I0(e(fVar3, 1));
                n0.f fVar4 = this.f22073a;
                gVar = fVar4.f21604f.f22130e;
                v10 = fVar4.v();
                gVar.d(v10);
            }
        }
        n0.f fVar5 = this.f22073a;
        if (i10 == 0) {
            e.b bVar2 = fVar5.Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int U = fVar5.U() + V;
                this.f22073a.f21602e.f22134i.d(U);
                this.f22073a.f21602e.f22130e.d(U - V);
                z11 = true;
            }
            z11 = false;
        } else {
            e.b bVar3 = fVar5.Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int v11 = fVar5.v() + W;
                this.f22073a.f21604f.f22134i.d(v11);
                this.f22073a.f21604f.f22130e.d(v11 - W);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<p> it2 = this.f22077e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f22131f == i10 && (next2.f22127b != this.f22073a || next2.f22132g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f22077e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f22131f == i10 && (z11 || next3.f22127b != this.f22073a)) {
                if (!next3.f22133h.f22091j || !next3.f22134i.f22091j || (!(next3 instanceof c) && !next3.f22130e.f22091j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f22073a.M0(s10);
        this.f22073a.d1(s11);
        return z12;
    }

    public void j() {
        this.f22074b = true;
    }

    public void k() {
        this.f22075c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r12 = this;
            n0.f r0 = r12.f22073a
            java.util.ArrayList<n0.e> r0 = r0.L0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            n0.e r1 = (n0.e) r1
            boolean r2 = r1.f21594a
            if (r2 == 0) goto L19
            goto L8
        L19:
            n0.e$b[] r2 = r1.Z
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f21638w
            int r4 = r1.f21640x
            n0.e$b r6 = n0.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            n0.e$b r5 = n0.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = r3
            goto L33
        L32:
            r2 = r9
        L33:
            if (r10 == r6) goto L3b
            n0.e$b r5 = n0.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = r9
        L3c:
            o0.l r4 = r1.f21602e
            o0.g r4 = r4.f22130e
            boolean r5 = r4.f22091j
            o0.n r7 = r1.f21604f
            o0.g r7 = r7.f22130e
            boolean r11 = r7.f22091j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            n0.e$b r6 = n0.e.b.FIXED
            int r5 = r4.f22088g
            int r7 = r7.f22088g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f21594a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            n0.e$b r5 = n0.e.b.FIXED
            int r8 = r4.f22088g
            int r7 = r7.f22088g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            n0.e$b r2 = n0.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            o0.n r2 = r1.f21604f
            o0.g r2 = r2.f22130e
            int r3 = r1.v()
        L78:
            r2.f22094m = r3
            goto Lae
        L7b:
            o0.n r2 = r1.f21604f
            o0.g r2 = r2.f22130e
            int r3 = r1.v()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f22088g
            n0.e$b r10 = n0.e.b.FIXED
            int r7 = r7.f22088g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            n0.e$b r2 = n0.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            o0.l r2 = r1.f21602e
            o0.g r2 = r2.f22130e
            int r3 = r1.U()
            goto L78
        La5:
            o0.l r2 = r1.f21602e
            o0.g r2 = r2.f22130e
            int r3 = r1.U()
            goto L83
        Lae:
            boolean r2 = r1.f21594a
            if (r2 == 0) goto L8
            o0.n r2 = r1.f21604f
            o0.g r2 = r2.f22109l
            if (r2 == 0) goto L8
            int r1 = r1.n()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.e.m():void");
    }

    public void n(b.InterfaceC0362b interfaceC0362b) {
        this.f22079g = interfaceC0362b;
    }
}
