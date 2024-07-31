package p260o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o0.f */
/* loaded from: classes.dex */
public class C9758f implements InterfaceC9756d {

    /* renamed from: d */
    AbstractC9768p f24018d;

    /* renamed from: f */
    int f24020f;

    /* renamed from: g */
    public int f24021g;

    /* renamed from: a */
    public InterfaceC9756d f24015a = null;

    /* renamed from: b */
    public boolean f24016b = false;

    /* renamed from: c */
    public boolean f24017c = false;

    /* renamed from: e */
    a f24019e = a.UNKNOWN;

    /* renamed from: h */
    int f24022h = 1;

    /* renamed from: i */
    C9759g f24023i = null;

    /* renamed from: j */
    public boolean f24024j = false;

    /* renamed from: k */
    List<InterfaceC9756d> f24025k = new ArrayList();

    /* renamed from: l */
    List<C9758f> f24026l = new ArrayList();

    /* renamed from: o0.f$a */
    /* loaded from: classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C9758f(AbstractC9768p abstractC9768p) {
        this.f24018d = abstractC9768p;
    }

    @Override // p260o0.InterfaceC9756d
    /* renamed from: a */
    public void mo29241a(InterfaceC9756d interfaceC9756d) {
        Iterator<C9758f> it = this.f24026l.iterator();
        while (it.hasNext()) {
            if (!it.next().f24024j) {
                return;
            }
        }
        this.f24017c = true;
        InterfaceC9756d interfaceC9756d2 = this.f24015a;
        if (interfaceC9756d2 != null) {
            interfaceC9756d2.mo29241a(this);
        }
        if (this.f24016b) {
            this.f24018d.mo29241a(this);
            return;
        }
        C9758f c9758f = null;
        int i10 = 0;
        for (C9758f c9758f2 : this.f24026l) {
            if (!(c9758f2 instanceof C9759g)) {
                i10++;
                c9758f = c9758f2;
            }
        }
        if (c9758f != null && i10 == 1 && c9758f.f24024j) {
            C9759g c9759g = this.f24023i;
            if (c9759g != null) {
                if (!c9759g.f24024j) {
                    return;
                } else {
                    this.f24020f = this.f24022h * c9759g.f24021g;
                }
            }
            mo29263d(c9758f.f24021g + this.f24020f);
        }
        InterfaceC9756d interfaceC9756d3 = this.f24015a;
        if (interfaceC9756d3 != null) {
            interfaceC9756d3.mo29241a(this);
        }
    }

    /* renamed from: b */
    public void m29261b(InterfaceC9756d interfaceC9756d) {
        this.f24025k.add(interfaceC9756d);
        if (this.f24024j) {
            interfaceC9756d.mo29241a(interfaceC9756d);
        }
    }

    /* renamed from: c */
    public void m29262c() {
        this.f24026l.clear();
        this.f24025k.clear();
        this.f24024j = false;
        this.f24021g = 0;
        this.f24017c = false;
        this.f24016b = false;
    }

    /* renamed from: d */
    public void mo29263d(int i10) {
        if (this.f24024j) {
            return;
        }
        this.f24024j = true;
        this.f24021g = i10;
        for (InterfaceC9756d interfaceC9756d : this.f24025k) {
            interfaceC9756d.mo29241a(interfaceC9756d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24018d.f24060b.m28758r());
        sb2.append(":");
        sb2.append(this.f24019e);
        sb2.append("(");
        sb2.append(this.f24024j ? Integer.valueOf(this.f24021g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f24026l.size());
        sb2.append(":d=");
        sb2.append(this.f24025k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
