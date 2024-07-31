package o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d */
    p f22085d;

    /* renamed from: f */
    int f22087f;

    /* renamed from: g */
    public int f22088g;

    /* renamed from: a */
    public d f22082a = null;

    /* renamed from: b */
    public boolean f22083b = false;

    /* renamed from: c */
    public boolean f22084c = false;

    /* renamed from: e */
    a f22086e = a.UNKNOWN;

    /* renamed from: h */
    int f22089h = 1;

    /* renamed from: i */
    g f22090i = null;

    /* renamed from: j */
    public boolean f22091j = false;

    /* renamed from: k */
    List<d> f22092k = new ArrayList();

    /* renamed from: l */
    List<f> f22093l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f22085d = pVar;
    }

    @Override // o0.d
    public void a(d dVar) {
        Iterator<f> it = this.f22093l.iterator();
        while (it.hasNext()) {
            if (!it.next().f22091j) {
                return;
            }
        }
        this.f22084c = true;
        d dVar2 = this.f22082a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f22083b) {
            this.f22085d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f22093l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f22091j) {
            g gVar = this.f22090i;
            if (gVar != null) {
                if (!gVar.f22091j) {
                    return;
                } else {
                    this.f22087f = this.f22089h * gVar.f22088g;
                }
            }
            d(fVar.f22088g + this.f22087f);
        }
        d dVar3 = this.f22082a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f22092k.add(dVar);
        if (this.f22091j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f22093l.clear();
        this.f22092k.clear();
        this.f22091j = false;
        this.f22088g = 0;
        this.f22084c = false;
        this.f22083b = false;
    }

    public void d(int i10) {
        if (this.f22091j) {
            return;
        }
        this.f22091j = true;
        this.f22088g = i10;
        for (d dVar : this.f22092k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22085d.f22127b.r());
        sb2.append(":");
        sb2.append(this.f22086e);
        sb2.append("(");
        sb2.append(this.f22091j ? Integer.valueOf(this.f22088g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f22093l.size());
        sb2.append(":d=");
        sb2.append(this.f22092k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
