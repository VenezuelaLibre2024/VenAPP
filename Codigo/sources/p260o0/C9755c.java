package p260o0;

import java.util.ArrayList;
import java.util.Iterator;
import p243n0.C9622e;
import p243n0.C9623f;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public class C9755c extends AbstractC9768p {

    /* renamed from: k */
    ArrayList<AbstractC9768p> f24004k;

    /* renamed from: l */
    private int f24005l;

    public C9755c(C9622e c9622e, int i10) {
        super(c9622e);
        this.f24004k = new ArrayList<>();
        this.f24064f = i10;
        m29238q();
    }

    /* renamed from: q */
    private void m29238q() {
        C9622e c9622e;
        C9622e c9622e2 = this.f24060b;
        do {
            c9622e = c9622e2;
            c9622e2 = c9622e2.m28688J(this.f24064f);
        } while (c9622e2 != null);
        this.f24060b = c9622e;
        this.f24004k.add(c9622e.m28692L(this.f24064f));
        C9622e m28684H = c9622e.m28684H(this.f24064f);
        while (m28684H != null) {
            this.f24004k.add(m28684H.m28692L(this.f24064f));
            m28684H = m28684H.m28684H(this.f24064f);
        }
        Iterator<AbstractC9768p> it = this.f24004k.iterator();
        while (it.hasNext()) {
            AbstractC9768p next = it.next();
            int i10 = this.f24064f;
            if (i10 == 0) {
                next.f24060b.f23493c = this;
            } else if (i10 == 1) {
                next.f24060b.f23495d = this;
            }
        }
        if ((this.f24064f == 0 && ((C9623f) this.f24060b.m28686I()).m28790L1()) && this.f24004k.size() > 1) {
            ArrayList<AbstractC9768p> arrayList = this.f24004k;
            this.f24060b = arrayList.get(arrayList.size() - 1).f24060b;
        }
        this.f24005l = this.f24064f == 0 ? this.f24060b.m28767x() : this.f24060b.m28700Q();
    }

    /* renamed from: r */
    private C9622e m29239r() {
        for (int i10 = 0; i10 < this.f24004k.size(); i10++) {
            AbstractC9768p abstractC9768p = this.f24004k.get(i10);
            if (abstractC9768p.f24060b.m28706T() != 8) {
                return abstractC9768p.f24060b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C9622e m29240s() {
        for (int size = this.f24004k.size() - 1; size >= 0; size--) {
            AbstractC9768p abstractC9768p = this.f24004k.get(size);
            if (abstractC9768p.f24060b.m28706T() != 8) {
                return abstractC9768p.f24060b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x03d1, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // p260o0.AbstractC9768p, p260o0.InterfaceC9756d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo29241a(p260o0.InterfaceC9756d r27) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9755c.mo29241a(o0.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        m29297b(r5.f24067i, r1, -r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r1 != null) goto L30;
     */
    @Override // p260o0.AbstractC9768p
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo29242d() {
        /*
            r5 = this;
            java.util.ArrayList<o0.p> r0 = r5.f24004k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            o0.p r1 = (p260o0.AbstractC9768p) r1
            r1.mo29242d()
            goto L6
        L16:
            java.util.ArrayList<o0.p> r0 = r5.f24004k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<o0.p> r2 = r5.f24004k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            o0.p r2 = (p260o0.AbstractC9768p) r2
            n0.e r2 = r2.f24060b
            java.util.ArrayList<o0.p> r4 = r5.f24004k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            o0.p r0 = (p260o0.AbstractC9768p) r0
            n0.e r0 = r0.f24060b
            int r4 = r5.f24064f
            if (r4 != 0) goto L70
            n0.d r1 = r2.f23477O
            n0.d r0 = r0.f23479Q
            o0.f r2 = r5.m29301i(r1, r3)
            int r1 = r1.m28647e()
            n0.e r4 = r5.m29239r()
            if (r4 == 0) goto L52
            n0.d r1 = r4.f23477O
            int r1 = r1.m28647e()
        L52:
            if (r2 == 0) goto L59
            o0.f r4 = r5.f24066h
            r5.m29297b(r4, r2, r1)
        L59:
            o0.f r1 = r5.m29301i(r0, r3)
            int r0 = r0.m28647e()
            n0.e r2 = r5.m29240s()
            if (r2 == 0) goto L6d
            n0.d r0 = r2.f23479Q
            int r0 = r0.m28647e()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            n0.d r2 = r2.f23478P
            n0.d r0 = r0.f23480R
            o0.f r3 = r5.m29301i(r2, r1)
            int r2 = r2.m28647e()
            n0.e r4 = r5.m29239r()
            if (r4 == 0) goto L88
            n0.d r2 = r4.f23478P
            int r2 = r2.m28647e()
        L88:
            if (r3 == 0) goto L8f
            o0.f r4 = r5.f24066h
            r5.m29297b(r4, r3, r2)
        L8f:
            o0.f r1 = r5.m29301i(r0, r1)
            int r0 = r0.m28647e()
            n0.e r2 = r5.m29240s()
            if (r2 == 0) goto La3
            n0.d r0 = r2.f23480R
            int r0 = r0.m28647e()
        La3:
            if (r1 == 0) goto Lab
        La5:
            o0.f r2 = r5.f24067i
            int r0 = -r0
            r5.m29297b(r2, r1, r0)
        Lab:
            o0.f r0 = r5.f24066h
            r0.f24015a = r5
            o0.f r0 = r5.f24067i
            r0.f24015a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9755c.mo29242d():void");
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: e */
    public void mo29243e() {
        for (int i10 = 0; i10 < this.f24004k.size(); i10++) {
            this.f24004k.get(i10).mo29243e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: f */
    public void mo29244f() {
        this.f24061c = null;
        Iterator<AbstractC9768p> it = this.f24004k.iterator();
        while (it.hasNext()) {
            it.next().mo29244f();
        }
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: j */
    public long mo29245j() {
        int size = this.f24004k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f24066h.f24020f + this.f24004k.get(i10).mo29245j() + r4.f24067i.f24020f;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: m */
    public boolean mo29246m() {
        int size = this.f24004k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f24004k.get(i10).mo29246m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f24064f == 0 ? "horizontal : " : "vertical : ");
        Iterator<AbstractC9768p> it = this.f24004k.iterator();
        while (it.hasNext()) {
            AbstractC9768p next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
