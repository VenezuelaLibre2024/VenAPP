package p260o0;

import p243n0.C9622e;
import p243n0.C9624g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o0.j */
/* loaded from: classes.dex */
public class C9762j extends AbstractC9768p {
    public C9762j(C9622e c9622e) {
        super(c9622e);
        c9622e.f23497e.mo29244f();
        c9622e.f23499f.mo29244f();
        this.f24064f = ((C9624g) c9622e).m28806p1();
    }

    /* renamed from: q */
    private void m29277q(C9758f c9758f) {
        this.f24066h.f24025k.add(c9758f);
        c9758f.f24026l.add(this.f24066h);
    }

    @Override // p260o0.AbstractC9768p, p260o0.InterfaceC9756d
    /* renamed from: a */
    public void mo29241a(InterfaceC9756d interfaceC9756d) {
        C9758f c9758f = this.f24066h;
        if (c9758f.f24017c && !c9758f.f24024j) {
            this.f24066h.mo29263d((int) ((c9758f.f24026l.get(0).f24021g * ((C9624g) this.f24060b).m28809s1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: d */
    public void mo29242d() {
        C9758f c9758f;
        AbstractC9768p abstractC9768p;
        C9758f c9758f2;
        C9624g c9624g = (C9624g) this.f24060b;
        int m28807q1 = c9624g.m28807q1();
        int m28808r1 = c9624g.m28808r1();
        c9624g.m28809s1();
        if (c9624g.m28806p1() == 1) {
            C9758f c9758f3 = this.f24066h;
            if (m28807q1 != -1) {
                c9758f3.f24026l.add(this.f24060b.f23490a0.f23497e.f24066h);
                this.f24060b.f23490a0.f23497e.f24066h.f24025k.add(this.f24066h);
                c9758f2 = this.f24066h;
            } else if (m28808r1 != -1) {
                c9758f3.f24026l.add(this.f24060b.f23490a0.f23497e.f24067i);
                this.f24060b.f23490a0.f23497e.f24067i.f24025k.add(this.f24066h);
                c9758f2 = this.f24066h;
                m28807q1 = -m28808r1;
            } else {
                c9758f3.f24016b = true;
                c9758f3.f24026l.add(this.f24060b.f23490a0.f23497e.f24067i);
                this.f24060b.f23490a0.f23497e.f24067i.f24025k.add(this.f24066h);
                m29277q(this.f24060b.f23497e.f24066h);
                abstractC9768p = this.f24060b.f23497e;
            }
            c9758f2.f24020f = m28807q1;
            m29277q(this.f24060b.f23497e.f24066h);
            abstractC9768p = this.f24060b.f23497e;
        } else {
            C9758f c9758f4 = this.f24066h;
            if (m28807q1 != -1) {
                c9758f4.f24026l.add(this.f24060b.f23490a0.f23499f.f24066h);
                this.f24060b.f23490a0.f23499f.f24066h.f24025k.add(this.f24066h);
                c9758f = this.f24066h;
            } else if (m28808r1 != -1) {
                c9758f4.f24026l.add(this.f24060b.f23490a0.f23499f.f24067i);
                this.f24060b.f23490a0.f23499f.f24067i.f24025k.add(this.f24066h);
                c9758f = this.f24066h;
                m28807q1 = -m28808r1;
            } else {
                c9758f4.f24016b = true;
                c9758f4.f24026l.add(this.f24060b.f23490a0.f23499f.f24067i);
                this.f24060b.f23490a0.f23499f.f24067i.f24025k.add(this.f24066h);
                m29277q(this.f24060b.f23499f.f24066h);
                abstractC9768p = this.f24060b.f23499f;
            }
            c9758f.f24020f = m28807q1;
            m29277q(this.f24060b.f23499f.f24066h);
            abstractC9768p = this.f24060b.f23499f;
        }
        m29277q(abstractC9768p.f24067i);
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: e */
    public void mo29243e() {
        if (((C9624g) this.f24060b).m28806p1() == 1) {
            this.f24060b.m28741j1(this.f24066h.f24021g);
        } else {
            this.f24060b.m28744k1(this.f24066h.f24021g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: f */
    public void mo29244f() {
        this.f24066h.m29262c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: m */
    public boolean mo29246m() {
        return false;
    }
}
