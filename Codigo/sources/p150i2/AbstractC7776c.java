package p150i2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p128h2.InterfaceC7611a;
import p170j2.AbstractC8947h;
import p192k2.C9132u;

/* renamed from: i2.c */
/* loaded from: classes.dex */
public abstract class AbstractC7776c<T> implements InterfaceC7611a<T> {

    /* renamed from: a */
    private final AbstractC8947h<T> f18529a;

    /* renamed from: b */
    private final List<C9132u> f18530b;

    /* renamed from: c */
    private final List<String> f18531c;

    /* renamed from: d */
    private T f18532d;

    /* renamed from: e */
    private a f18533e;

    /* renamed from: i2.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        void mo23133b(List<C9132u> list);

        /* renamed from: c */
        void mo23134c(List<C9132u> list);
    }

    public AbstractC7776c(AbstractC8947h<T> tracker) {
        C9322n.m27781e(tracker, "tracker");
        this.f18529a = tracker;
        this.f18530b = new ArrayList();
        this.f18531c = new ArrayList();
    }

    /* renamed from: h */
    private final void m23730h(a aVar, T t10) {
        if (this.f18530b.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || mo23727c(t10)) {
            aVar.mo23134c(this.f18530b);
        } else {
            aVar.mo23133b(this.f18530b);
        }
    }

    @Override // p128h2.InterfaceC7611a
    /* renamed from: a */
    public void mo23127a(T t10) {
        this.f18532d = t10;
        m23730h(this.f18533e, t10);
    }

    /* renamed from: b */
    public abstract boolean mo23726b(C9132u c9132u);

    /* renamed from: c */
    public abstract boolean mo23727c(T t10);

    /* renamed from: d */
    public final boolean m23731d(String workSpecId) {
        C9322n.m27781e(workSpecId, "workSpecId");
        T t10 = this.f18532d;
        return t10 != null && mo23727c(t10) && this.f18531c.contains(workSpecId);
    }

    /* renamed from: e */
    public final void m23732e(Iterable<C9132u> workSpecs) {
        C9322n.m27781e(workSpecs, "workSpecs");
        this.f18530b.clear();
        this.f18531c.clear();
        List<C9132u> list = this.f18530b;
        for (C9132u c9132u : workSpecs) {
            if (mo23726b(c9132u)) {
                list.add(c9132u);
            }
        }
        List<C9132u> list2 = this.f18530b;
        List<String> list3 = this.f18531c;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((C9132u) it.next()).f22005a);
        }
        if (this.f18530b.isEmpty()) {
            this.f18529a.m26165f(this);
        } else {
            this.f18529a.m26163c(this);
        }
        m23730h(this.f18533e, this.f18532d);
    }

    /* renamed from: f */
    public final void m23733f() {
        if (!this.f18530b.isEmpty()) {
            this.f18530b.clear();
            this.f18529a.m26165f(this);
        }
    }

    /* renamed from: g */
    public final void m23734g(a aVar) {
        if (this.f18533e != aVar) {
            this.f18533e = aVar;
            m23730h(aVar, this.f18532d);
        }
    }
}
