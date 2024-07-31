package o0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k */
    ArrayList<p> f22071k;

    /* renamed from: l */
    private int f22072l;

    public c(n0.e eVar, int i10) {
        super(eVar);
        this.f22071k = new ArrayList<>();
        this.f22131f = i10;
        q();
    }

    private void q() {
        n0.e eVar;
        n0.e eVar2 = this.f22127b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.J(this.f22131f);
        } while (eVar2 != null);
        this.f22127b = eVar;
        this.f22071k.add(eVar.L(this.f22131f));
        n0.e H = eVar.H(this.f22131f);
        while (H != null) {
            this.f22071k.add(H.L(this.f22131f));
            H = H.H(this.f22131f);
        }
        Iterator<p> it = this.f22071k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f22131f;
            if (i10 == 0) {
                next.f22127b.f21598c = this;
            } else if (i10 == 1) {
                next.f22127b.f21600d = this;
            }
        }
        if ((this.f22131f == 0 && ((n0.f) this.f22127b.I()).L1()) && this.f22071k.size() > 1) {
            ArrayList<p> arrayList = this.f22071k;
            this.f22127b = arrayList.get(arrayList.size() - 1).f22127b;
        }
        this.f22072l = this.f22131f == 0 ? this.f22127b.x() : this.f22127b.Q();
    }

    private n0.e r() {
        for (int i10 = 0; i10 < this.f22071k.size(); i10++) {
            p pVar = this.f22071k.get(i10);
            if (pVar.f22127b.T() != 8) {
                return pVar.f22127b;
            }
        }
        return null;
    }

    private n0.e s() {
        for (int size = this.f22071k.size() - 1; size >= 0; size--) {
            p pVar = this.f22071k.get(size);
            if (pVar.f22127b.T() != 8) {
                return pVar.f22127b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x03d1, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // o0.p, o0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(o0.d r27) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.c.a(o0.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        b(r5.f22134i, r1, -r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r1 != null) goto L64;
     */
    @Override // o0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList<o0.p> r0 = r5.f22071k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            o0.p r1 = (o0.p) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList<o0.p> r0 = r5.f22071k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<o0.p> r2 = r5.f22071k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            o0.p r2 = (o0.p) r2
            n0.e r2 = r2.f22127b
            java.util.ArrayList<o0.p> r4 = r5.f22071k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            o0.p r0 = (o0.p) r0
            n0.e r0 = r0.f22127b
            int r4 = r5.f22131f
            if (r4 != 0) goto L70
            n0.d r1 = r2.O
            n0.d r0 = r0.Q
            o0.f r2 = r5.i(r1, r3)
            int r1 = r1.e()
            n0.e r4 = r5.r()
            if (r4 == 0) goto L52
            n0.d r1 = r4.O
            int r1 = r1.e()
        L52:
            if (r2 == 0) goto L59
            o0.f r4 = r5.f22133h
            r5.b(r4, r2, r1)
        L59:
            o0.f r1 = r5.i(r0, r3)
            int r0 = r0.e()
            n0.e r2 = r5.s()
            if (r2 == 0) goto L6d
            n0.d r0 = r2.Q
            int r0 = r0.e()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            n0.d r2 = r2.P
            n0.d r0 = r0.R
            o0.f r3 = r5.i(r2, r1)
            int r2 = r2.e()
            n0.e r4 = r5.r()
            if (r4 == 0) goto L88
            n0.d r2 = r4.P
            int r2 = r2.e()
        L88:
            if (r3 == 0) goto L8f
            o0.f r4 = r5.f22133h
            r5.b(r4, r3, r2)
        L8f:
            o0.f r1 = r5.i(r0, r1)
            int r0 = r0.e()
            n0.e r2 = r5.s()
            if (r2 == 0) goto La3
            n0.d r0 = r2.R
            int r0 = r0.e()
        La3:
            if (r1 == 0) goto Lab
        La5:
            o0.f r2 = r5.f22134i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            o0.f r0 = r5.f22133h
            r0.f22082a = r5
            o0.f r0 = r5.f22134i
            r0.f22082a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.c.d():void");
    }

    @Override // o0.p
    public void e() {
        for (int i10 = 0; i10 < this.f22071k.size(); i10++) {
            this.f22071k.get(i10).e();
        }
    }

    @Override // o0.p
    public void f() {
        this.f22128c = null;
        Iterator<p> it = this.f22071k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // o0.p
    public long j() {
        int size = this.f22071k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f22133h.f22087f + this.f22071k.get(i10).j() + r4.f22134i.f22087f;
        }
        return j10;
    }

    @Override // o0.p
    public boolean m() {
        int size = this.f22071k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f22071k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f22131f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f22071k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
