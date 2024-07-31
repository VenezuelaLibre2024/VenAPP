package i2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.u;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class c<T> implements h2.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final j2.h<T> f16877a;

    /* renamed from: b, reason: collision with root package name */
    private final List<u> f16878b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f16879c;

    /* renamed from: d, reason: collision with root package name */
    private T f16880d;

    /* renamed from: e, reason: collision with root package name */
    private a f16881e;

    /* loaded from: classes.dex */
    public interface a {
        void b(List<u> list);

        void c(List<u> list);
    }

    public c(j2.h<T> tracker) {
        n.e(tracker, "tracker");
        this.f16877a = tracker;
        this.f16878b = new ArrayList();
        this.f16879c = new ArrayList();
    }

    private final void h(a aVar, T t10) {
        if (this.f16878b.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || c(t10)) {
            aVar.c(this.f16878b);
        } else {
            aVar.b(this.f16878b);
        }
    }

    @Override // h2.a
    public void a(T t10) {
        this.f16880d = t10;
        h(this.f16881e, t10);
    }

    public abstract boolean b(u uVar);

    public abstract boolean c(T t10);

    public final boolean d(String workSpecId) {
        n.e(workSpecId, "workSpecId");
        T t10 = this.f16880d;
        return t10 != null && c(t10) && this.f16879c.contains(workSpecId);
    }

    public final void e(Iterable<u> workSpecs) {
        n.e(workSpecs, "workSpecs");
        this.f16878b.clear();
        this.f16879c.clear();
        List<u> list = this.f16878b;
        for (u uVar : workSpecs) {
            if (b(uVar)) {
                list.add(uVar);
            }
        }
        List<u> list2 = this.f16878b;
        List<String> list3 = this.f16879c;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((u) it.next()).f20223a);
        }
        if (this.f16878b.isEmpty()) {
            this.f16877a.f(this);
        } else {
            this.f16877a.c(this);
        }
        h(this.f16881e, this.f16880d);
    }

    public final void f() {
        if (!this.f16878b.isEmpty()) {
            this.f16878b.clear();
            this.f16877a.f(this);
        }
    }

    public final void g(a aVar) {
        if (this.f16881e != aVar) {
            this.f16881e = aVar;
            h(aVar, this.f16880d);
        }
    }
}
