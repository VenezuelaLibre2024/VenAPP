package p260o0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p243n0.C9622e;
import p243n0.C9623f;
import p243n0.C9624g;
import p243n0.C9626i;
import p260o0.C9754b;

/* renamed from: o0.e */
/* loaded from: classes.dex */
public class C9757e {

    /* renamed from: a */
    private C9623f f24006a;

    /* renamed from: d */
    private C9623f f24009d;

    /* renamed from: b */
    private boolean f24007b = true;

    /* renamed from: c */
    private boolean f24008c = true;

    /* renamed from: e */
    private ArrayList<AbstractC9768p> f24010e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C9765m> f24011f = new ArrayList<>();

    /* renamed from: g */
    private C9754b.b f24012g = null;

    /* renamed from: h */
    private C9754b.a f24013h = new C9754b.a();

    /* renamed from: i */
    ArrayList<C9765m> f24014i = new ArrayList<>();

    public C9757e(C9623f c9623f) {
        this.f24006a = c9623f;
        this.f24009d = c9623f;
    }

    /* renamed from: a */
    private void m29247a(C9758f c9758f, int i10, int i11, C9758f c9758f2, ArrayList<C9765m> arrayList, C9765m c9765m) {
        AbstractC9768p abstractC9768p = c9758f.f24018d;
        if (abstractC9768p.f24061c == null) {
            C9623f c9623f = this.f24006a;
            if (abstractC9768p == c9623f.f23497e || abstractC9768p == c9623f.f23499f) {
                return;
            }
            if (c9765m == null) {
                c9765m = new C9765m(abstractC9768p, i11);
                arrayList.add(c9765m);
            }
            abstractC9768p.f24061c = c9765m;
            c9765m.m29283a(abstractC9768p);
            for (InterfaceC9756d interfaceC9756d : abstractC9768p.f24066h.f24025k) {
                if (interfaceC9756d instanceof C9758f) {
                    m29247a((C9758f) interfaceC9756d, i10, 0, c9758f2, arrayList, c9765m);
                }
            }
            for (InterfaceC9756d interfaceC9756d2 : abstractC9768p.f24067i.f24025k) {
                if (interfaceC9756d2 instanceof C9758f) {
                    m29247a((C9758f) interfaceC9756d2, i10, 1, c9758f2, arrayList, c9765m);
                }
            }
            if (i10 == 1 && (abstractC9768p instanceof C9766n)) {
                for (InterfaceC9756d interfaceC9756d3 : ((C9766n) abstractC9768p).f24041k.f24025k) {
                    if (interfaceC9756d3 instanceof C9758f) {
                        m29247a((C9758f) interfaceC9756d3, i10, 2, c9758f2, arrayList, c9765m);
                    }
                }
            }
            for (C9758f c9758f3 : abstractC9768p.f24066h.f24026l) {
                if (c9758f3 == c9758f2) {
                    c9765m.f24035b = true;
                }
                m29247a(c9758f3, i10, 0, c9758f2, arrayList, c9765m);
            }
            for (C9758f c9758f4 : abstractC9768p.f24067i.f24026l) {
                if (c9758f4 == c9758f2) {
                    c9765m.f24035b = true;
                }
                m29247a(c9758f4, i10, 1, c9758f2, arrayList, c9765m);
            }
            if (i10 == 1 && (abstractC9768p instanceof C9766n)) {
                Iterator<C9758f> it = ((C9766n) abstractC9768p).f24041k.f24026l.iterator();
                while (it.hasNext()) {
                    m29247a(it.next(), i10, 2, c9758f2, arrayList, c9765m);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r2.f23535x == 0) goto L32;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m29248b(p243n0.C9623f r17) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9757e.m29248b(n0.f):boolean");
    }

    /* renamed from: e */
    private int m29249e(C9623f c9623f, int i10) {
        int size = this.f24014i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f24014i.get(i11).m29284b(c9623f, i10));
        }
        return (int) j10;
    }

    /* renamed from: i */
    private void m29250i(AbstractC9768p abstractC9768p, int i10, ArrayList<C9765m> arrayList) {
        for (InterfaceC9756d interfaceC9756d : abstractC9768p.f24066h.f24025k) {
            if (interfaceC9756d instanceof C9758f) {
                m29247a((C9758f) interfaceC9756d, i10, 0, abstractC9768p.f24067i, arrayList, null);
            } else if (interfaceC9756d instanceof AbstractC9768p) {
                m29247a(((AbstractC9768p) interfaceC9756d).f24066h, i10, 0, abstractC9768p.f24067i, arrayList, null);
            }
        }
        for (InterfaceC9756d interfaceC9756d2 : abstractC9768p.f24067i.f24025k) {
            if (interfaceC9756d2 instanceof C9758f) {
                m29247a((C9758f) interfaceC9756d2, i10, 1, abstractC9768p.f24066h, arrayList, null);
            } else if (interfaceC9756d2 instanceof AbstractC9768p) {
                m29247a(((AbstractC9768p) interfaceC9756d2).f24067i, i10, 1, abstractC9768p.f24066h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (InterfaceC9756d interfaceC9756d3 : ((C9766n) abstractC9768p).f24041k.f24025k) {
                if (interfaceC9756d3 instanceof C9758f) {
                    m29247a((C9758f) interfaceC9756d3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m29251l(C9622e c9622e, C9622e.b bVar, int i10, C9622e.b bVar2, int i11) {
        C9754b.a aVar = this.f24013h;
        aVar.f23994a = bVar;
        aVar.f23995b = bVar2;
        aVar.f23996c = i10;
        aVar.f23997d = i11;
        this.f24012g.mo3831b(c9622e, aVar);
        c9622e.m28736h1(this.f24013h.f23998e);
        c9622e.m28687I0(this.f24013h.f23999f);
        c9622e.m28685H0(this.f24013h.f24001h);
        c9622e.m28768x0(this.f24013h.f24000g);
    }

    /* renamed from: c */
    public void m29252c() {
        m29253d(this.f24010e);
        this.f24014i.clear();
        C9765m.f24033h = 0;
        m29250i(this.f24006a.f23497e, 0, this.f24014i);
        m29250i(this.f24006a.f23499f, 1, this.f24014i);
        this.f24007b = false;
    }

    /* renamed from: d */
    public void m29253d(ArrayList<AbstractC9768p> arrayList) {
        AbstractC9768p c9762j;
        arrayList.clear();
        this.f24009d.f23497e.mo29244f();
        this.f24009d.f23499f.mo29244f();
        arrayList.add(this.f24009d.f23497e);
        arrayList.add(this.f24009d.f23499f);
        Iterator<C9622e> it = this.f24009d.f23598L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C9622e next = it.next();
            if (next instanceof C9624g) {
                c9762j = new C9762j(next);
            } else {
                if (next.m28733g0()) {
                    if (next.f23493c == null) {
                        next.f23493c = new C9755c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f23493c);
                } else {
                    arrayList.add(next.f23497e);
                }
                if (next.m28737i0()) {
                    if (next.f23495d == null) {
                        next.f23495d = new C9755c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f23495d);
                } else {
                    arrayList.add(next.f23499f);
                }
                if (next instanceof C9626i) {
                    c9762j = new C9763k(next);
                }
            }
            arrayList.add(c9762j);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC9768p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo29244f();
        }
        Iterator<AbstractC9768p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC9768p next2 = it3.next();
            if (next2.f24060b != this.f24009d) {
                next2.mo29242d();
            }
        }
    }

    /* renamed from: f */
    public boolean m29254f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f24007b || this.f24008c) {
            Iterator<C9622e> it = this.f24006a.f23598L0.iterator();
            while (it.hasNext()) {
                C9622e next = it.next();
                next.m28745l();
                next.f23489a = false;
                next.f23497e.m29280r();
                next.f23499f.m29285q();
            }
            this.f24006a.m28745l();
            C9623f c9623f = this.f24006a;
            c9623f.f23489a = false;
            c9623f.f23497e.m29280r();
            this.f24006a.f23499f.m29285q();
            this.f24008c = false;
        }
        if (m29248b(this.f24009d)) {
            return false;
        }
        this.f24006a.m28741j1(0);
        this.f24006a.m28744k1(0);
        C9622e.b m28760s = this.f24006a.m28760s(0);
        C9622e.b m28760s2 = this.f24006a.m28760s(1);
        if (this.f24007b) {
            m29252c();
        }
        int m28710V = this.f24006a.m28710V();
        int m28712W = this.f24006a.m28712W();
        this.f24006a.f23497e.f24066h.mo29263d(m28710V);
        this.f24006a.f23499f.f24066h.mo29263d(m28712W);
        m29259m();
        C9622e.b bVar = C9622e.b.WRAP_CONTENT;
        if (m28760s == bVar || m28760s2 == bVar) {
            if (z13) {
                Iterator<AbstractC9768p> it2 = this.f24010e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().mo29246m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && m28760s == C9622e.b.WRAP_CONTENT) {
                this.f24006a.m28695M0(C9622e.b.FIXED);
                C9623f c9623f2 = this.f24006a;
                c9623f2.m28736h1(m29249e(c9623f2, 0));
                C9623f c9623f3 = this.f24006a;
                c9623f3.f23497e.f24063e.mo29263d(c9623f3.m28708U());
            }
            if (z13 && m28760s2 == C9622e.b.WRAP_CONTENT) {
                this.f24006a.m28726d1(C9622e.b.FIXED);
                C9623f c9623f4 = this.f24006a;
                c9623f4.m28687I0(m29249e(c9623f4, 1));
                C9623f c9623f5 = this.f24006a;
                c9623f5.f23499f.f24063e.mo29263d(c9623f5.m28765v());
            }
        }
        C9623f c9623f6 = this.f24006a;
        C9622e.b bVar2 = c9623f6.f23488Z[0];
        C9622e.b bVar3 = C9622e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C9622e.b.MATCH_PARENT) {
            int m28708U = c9623f6.m28708U() + m28710V;
            this.f24006a.f23497e.f24067i.mo29263d(m28708U);
            this.f24006a.f23497e.f24063e.mo29263d(m28708U - m28710V);
            m29259m();
            C9623f c9623f7 = this.f24006a;
            C9622e.b bVar4 = c9623f7.f23488Z[1];
            if (bVar4 == bVar3 || bVar4 == C9622e.b.MATCH_PARENT) {
                int m28765v = c9623f7.m28765v() + m28712W;
                this.f24006a.f23499f.f24067i.mo29263d(m28765v);
                this.f24006a.f23499f.f24063e.mo29263d(m28765v - m28712W);
            }
            m29259m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<AbstractC9768p> it3 = this.f24010e.iterator();
        while (it3.hasNext()) {
            AbstractC9768p next2 = it3.next();
            if (next2.f24060b != this.f24006a || next2.f24065g) {
                next2.mo29243e();
            }
        }
        Iterator<AbstractC9768p> it4 = this.f24010e.iterator();
        while (it4.hasNext()) {
            AbstractC9768p next3 = it4.next();
            if (z11 || next3.f24060b != this.f24006a) {
                if (!next3.f24066h.f24024j || ((!next3.f24067i.f24024j && !(next3 instanceof C9762j)) || (!next3.f24063e.f24024j && !(next3 instanceof C9755c) && !(next3 instanceof C9762j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f24006a.m28695M0(m28760s);
        this.f24006a.m28726d1(m28760s2);
        return z12;
    }

    /* renamed from: g */
    public boolean m29255g(boolean z10) {
        if (this.f24007b) {
            Iterator<C9622e> it = this.f24006a.f23598L0.iterator();
            while (it.hasNext()) {
                C9622e next = it.next();
                next.m28745l();
                next.f23489a = false;
                C9764l c9764l = next.f23497e;
                c9764l.f24063e.f24024j = false;
                c9764l.f24065g = false;
                c9764l.m29280r();
                C9766n c9766n = next.f23499f;
                c9766n.f24063e.f24024j = false;
                c9766n.f24065g = false;
                c9766n.m29285q();
            }
            this.f24006a.m28745l();
            C9623f c9623f = this.f24006a;
            c9623f.f23489a = false;
            C9764l c9764l2 = c9623f.f23497e;
            c9764l2.f24063e.f24024j = false;
            c9764l2.f24065g = false;
            c9764l2.m29280r();
            C9766n c9766n2 = this.f24006a.f23499f;
            c9766n2.f24063e.f24024j = false;
            c9766n2.f24065g = false;
            c9766n2.m29285q();
            m29252c();
        }
        if (m29248b(this.f24009d)) {
            return false;
        }
        this.f24006a.m28741j1(0);
        this.f24006a.m28744k1(0);
        this.f24006a.f23497e.f24066h.mo29263d(0);
        this.f24006a.f23499f.f24066h.mo29263d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m29256h(boolean z10, int i10) {
        boolean z11;
        C9622e.b bVar;
        C9759g c9759g;
        int m28765v;
        boolean z12 = true;
        boolean z13 = z10 & true;
        C9622e.b m28760s = this.f24006a.m28760s(0);
        C9622e.b m28760s2 = this.f24006a.m28760s(1);
        int m28710V = this.f24006a.m28710V();
        int m28712W = this.f24006a.m28712W();
        if (z13 && (m28760s == (bVar = C9622e.b.WRAP_CONTENT) || m28760s2 == bVar)) {
            Iterator<AbstractC9768p> it = this.f24010e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC9768p next = it.next();
                if (next.f24064f == i10 && !next.mo29246m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && m28760s == C9622e.b.WRAP_CONTENT) {
                    this.f24006a.m28695M0(C9622e.b.FIXED);
                    C9623f c9623f = this.f24006a;
                    c9623f.m28736h1(m29249e(c9623f, 0));
                    C9623f c9623f2 = this.f24006a;
                    c9759g = c9623f2.f23497e.f24063e;
                    m28765v = c9623f2.m28708U();
                    c9759g.mo29263d(m28765v);
                }
            } else if (z13 && m28760s2 == C9622e.b.WRAP_CONTENT) {
                this.f24006a.m28726d1(C9622e.b.FIXED);
                C9623f c9623f3 = this.f24006a;
                c9623f3.m28687I0(m29249e(c9623f3, 1));
                C9623f c9623f4 = this.f24006a;
                c9759g = c9623f4.f23499f.f24063e;
                m28765v = c9623f4.m28765v();
                c9759g.mo29263d(m28765v);
            }
        }
        C9623f c9623f5 = this.f24006a;
        if (i10 == 0) {
            C9622e.b bVar2 = c9623f5.f23488Z[0];
            if (bVar2 == C9622e.b.FIXED || bVar2 == C9622e.b.MATCH_PARENT) {
                int m28708U = c9623f5.m28708U() + m28710V;
                this.f24006a.f23497e.f24067i.mo29263d(m28708U);
                this.f24006a.f23497e.f24063e.mo29263d(m28708U - m28710V);
                z11 = true;
            }
            z11 = false;
        } else {
            C9622e.b bVar3 = c9623f5.f23488Z[1];
            if (bVar3 == C9622e.b.FIXED || bVar3 == C9622e.b.MATCH_PARENT) {
                int m28765v2 = c9623f5.m28765v() + m28712W;
                this.f24006a.f23499f.f24067i.mo29263d(m28765v2);
                this.f24006a.f23499f.f24063e.mo29263d(m28765v2 - m28712W);
                z11 = true;
            }
            z11 = false;
        }
        m29259m();
        Iterator<AbstractC9768p> it2 = this.f24010e.iterator();
        while (it2.hasNext()) {
            AbstractC9768p next2 = it2.next();
            if (next2.f24064f == i10 && (next2.f24060b != this.f24006a || next2.f24065g)) {
                next2.mo29243e();
            }
        }
        Iterator<AbstractC9768p> it3 = this.f24010e.iterator();
        while (it3.hasNext()) {
            AbstractC9768p next3 = it3.next();
            if (next3.f24064f == i10 && (z11 || next3.f24060b != this.f24006a)) {
                if (!next3.f24066h.f24024j || !next3.f24067i.f24024j || (!(next3 instanceof C9755c) && !next3.f24063e.f24024j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f24006a.m28695M0(m28760s);
        this.f24006a.m28726d1(m28760s2);
        return z12;
    }

    /* renamed from: j */
    public void m29257j() {
        this.f24007b = true;
    }

    /* renamed from: k */
    public void m29258k() {
        this.f24008c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m29259m() {
        /*
            r12 = this;
            n0.f r0 = r12.f24006a
            java.util.ArrayList<n0.e> r0 = r0.f23598L0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            n0.e r1 = (p243n0.C9622e) r1
            boolean r2 = r1.f23489a
            if (r2 == 0) goto L19
            goto L8
        L19:
            n0.e$b[] r2 = r1.f23488Z
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f23533w
            int r4 = r1.f23535x
            n0.e$b r6 = p243n0.C9622e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            n0.e$b r5 = p243n0.C9622e.b.MATCH_CONSTRAINT
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
            n0.e$b r5 = p243n0.C9622e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = r9
        L3c:
            o0.l r4 = r1.f23497e
            o0.g r4 = r4.f24063e
            boolean r5 = r4.f24024j
            o0.n r7 = r1.f23499f
            o0.g r7 = r7.f24063e
            boolean r11 = r7.f24024j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            n0.e$b r6 = p243n0.C9622e.b.FIXED
            int r5 = r4.f24021g
            int r7 = r7.f24021g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.m29251l(r3, r4, r5, r6, r7)
        L58:
            r1.f23489a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            n0.e$b r5 = p243n0.C9622e.b.FIXED
            int r8 = r4.f24021g
            int r7 = r7.f24021g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.m29251l(r3, r4, r5, r6, r7)
            n0.e$b r2 = p243n0.C9622e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            o0.n r2 = r1.f23499f
            o0.g r2 = r2.f24063e
            int r3 = r1.m28765v()
        L78:
            r2.f24027m = r3
            goto Lae
        L7b:
            o0.n r2 = r1.f23499f
            o0.g r2 = r2.f24063e
            int r3 = r1.m28765v()
        L83:
            r2.mo29263d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f24021g
            n0.e$b r10 = p243n0.C9622e.b.FIXED
            int r7 = r7.f24021g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.m29251l(r3, r4, r5, r6, r7)
            n0.e$b r2 = p243n0.C9622e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            o0.l r2 = r1.f23497e
            o0.g r2 = r2.f24063e
            int r3 = r1.m28708U()
            goto L78
        La5:
            o0.l r2 = r1.f23497e
            o0.g r2 = r2.f24063e
            int r3 = r1.m28708U()
            goto L83
        Lae:
            boolean r2 = r1.f23489a
            if (r2 == 0) goto L8
            o0.n r2 = r1.f23499f
            o0.g r2 = r2.f24042l
            if (r2 == 0) goto L8
            int r1 = r1.m28749n()
            r2.mo29263d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9757e.m29259m():void");
    }

    /* renamed from: n */
    public void m29260n(C9754b.b bVar) {
        this.f24012g = bVar;
    }
}
