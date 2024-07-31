package ih;

import dg.s;
import dg.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class f implements t {

    /* renamed from: a, reason: collision with root package name */
    private dg.o f17775a;

    /* renamed from: b, reason: collision with root package name */
    private List<s> f17776b = new ArrayList();

    public f(dg.o oVar) {
        this.f17775a = oVar;
    }

    @Override // dg.t
    public void a(s sVar) {
        this.f17776b.add(sVar);
    }

    protected dg.q b(dg.c cVar) {
        this.f17776b.clear();
        try {
            dg.o oVar = this.f17775a;
            if (oVar instanceof dg.k) {
                dg.q d10 = ((dg.k) oVar).d(cVar);
                this.f17775a.reset();
                return d10;
            }
            dg.q a10 = oVar.a(cVar);
            this.f17775a.reset();
            return a10;
        } catch (Exception unused) {
            this.f17775a.reset();
            return null;
        } catch (Throwable th2) {
            this.f17775a.reset();
            throw th2;
        }
    }

    public dg.q c(dg.j jVar) {
        return b(e(jVar));
    }

    public List<s> d() {
        return new ArrayList(this.f17776b);
    }

    protected dg.c e(dg.j jVar) {
        return new dg.c(new kg.m(jVar));
    }
}
