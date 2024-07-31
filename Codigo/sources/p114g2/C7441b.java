package p114g2;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1521a;
import androidx.work.impl.C1553e0;
import androidx.work.impl.C1584v;
import androidx.work.impl.C1585w;
import androidx.work.impl.InterfaceC1552e;
import androidx.work.impl.InterfaceC1579t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p094f2.AbstractC7277j;
import p094f2.C7286s;
import p128h2.C7615e;
import p128h2.InterfaceC7613c;
import p128h2.InterfaceC7614d;
import p170j2.C8953n;
import p192k2.C9124m;
import p192k2.C9132u;
import p192k2.C9135x;
import p211l2.C9367s;

/* renamed from: g2.b */
/* loaded from: classes.dex */
public class C7441b implements InterfaceC1579t, InterfaceC7613c, InterfaceC1552e {

    /* renamed from: u */
    private static final String f17289u = AbstractC7277j.m21769i("GreedyScheduler");

    /* renamed from: a */
    private final Context f17290a;

    /* renamed from: b */
    private final C1553e0 f17291b;

    /* renamed from: c */
    private final InterfaceC7614d f17292c;

    /* renamed from: e */
    private C7440a f17294e;

    /* renamed from: f */
    private boolean f17295f;

    /* renamed from: t */
    Boolean f17298t;

    /* renamed from: d */
    private final Set<C9132u> f17293d = new HashSet();

    /* renamed from: s */
    private final C1585w f17297s = new C1585w();

    /* renamed from: r */
    private final Object f17296r = new Object();

    public C7441b(Context context, C1521a c1521a, C8953n c8953n, C1553e0 c1553e0) {
        this.f17290a = context;
        this.f17291b = c1553e0;
        this.f17292c = new C7615e(c8953n, this);
        this.f17294e = new C7440a(this, c1521a.m8516k());
    }

    /* renamed from: g */
    private void m22443g() {
        this.f17298t = Boolean.valueOf(C9367s.m27885b(this.f17290a, this.f17291b.m8687k()));
    }

    /* renamed from: h */
    private void m22444h() {
        if (this.f17295f) {
            return;
        }
        this.f17291b.m8689o().m8754g(this);
        this.f17295f = true;
    }

    /* renamed from: i */
    private void m22445i(C9124m c9124m) {
        synchronized (this.f17296r) {
            Iterator<C9132u> it = this.f17293d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9132u next = it.next();
                if (C9135x.m26934a(next).equals(c9124m)) {
                    AbstractC7277j.m21767e().mo21770a(f17289u, "Stopping tracking for " + c9124m);
                    this.f17293d.remove(next);
                    this.f17292c.mo23132a(this.f17293d);
                    break;
                }
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1579t
    /* renamed from: a */
    public void mo8664a(C9132u... c9132uArr) {
        AbstractC7277j m21767e;
        String str;
        StringBuilder sb2;
        String str2;
        if (this.f17298t == null) {
            m22443g();
        }
        if (!this.f17298t.booleanValue()) {
            AbstractC7277j.m21767e().mo21774f(f17289u, "Ignoring schedule request in a secondary process");
            return;
        }
        m22444h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C9132u c9132u : c9132uArr) {
            if (!this.f17297s.m8803a(C9135x.m26934a(c9132u))) {
                long m26893c = c9132u.m26893c();
                long currentTimeMillis = System.currentTimeMillis();
                if (c9132u.f22006b == C7286s.a.ENQUEUED) {
                    if (currentTimeMillis < m26893c) {
                        C7440a c7440a = this.f17294e;
                        if (c7440a != null) {
                            c7440a.m22441a(c9132u);
                        }
                    } else if (c9132u.m26897h()) {
                        if (c9132u.f22014j.m21748h()) {
                            m21767e = AbstractC7277j.m21767e();
                            str = f17289u;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(c9132u);
                            str2 = ". Requires device idle.";
                        } else if (c9132u.f22014j.m21745e()) {
                            m21767e = AbstractC7277j.m21767e();
                            str = f17289u;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(c9132u);
                            str2 = ". Requires ContentUri triggers.";
                        } else {
                            hashSet.add(c9132u);
                            hashSet2.add(c9132u.f22005a);
                        }
                        sb2.append(str2);
                        m21767e.mo21770a(str, sb2.toString());
                    } else if (!this.f17297s.m8803a(C9135x.m26934a(c9132u))) {
                        AbstractC7277j.m21767e().mo21770a(f17289u, "Starting work for " + c9132u.f22005a);
                        this.f17291b.m8697x(this.f17297s.m8807e(c9132u));
                    }
                }
            }
        }
        synchronized (this.f17296r) {
            if (!hashSet.isEmpty()) {
                AbstractC7277j.m21767e().mo21770a(f17289u, "Starting tracking for " + TextUtils.join(",", hashSet2));
                this.f17293d.addAll(hashSet);
                this.f17292c.mo23132a(this.f17293d);
            }
        }
    }

    @Override // p128h2.InterfaceC7613c
    /* renamed from: b */
    public void mo8630b(List<C9132u> list) {
        Iterator<C9132u> it = list.iterator();
        while (it.hasNext()) {
            C9124m m26934a = C9135x.m26934a(it.next());
            AbstractC7277j.m21767e().mo21770a(f17289u, "Constraints not met: Cancelling work ID " + m26934a);
            C1584v m8804b = this.f17297s.m8804b(m26934a);
            if (m8804b != null) {
                this.f17291b.m8679A(m8804b);
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1579t
    /* renamed from: c */
    public void mo8665c(String str) {
        if (this.f17298t == null) {
            m22443g();
        }
        if (!this.f17298t.booleanValue()) {
            AbstractC7277j.m21767e().mo21774f(f17289u, "Ignoring schedule request in non-main process");
            return;
        }
        m22444h();
        AbstractC7277j.m21767e().mo21770a(f17289u, "Cancelling work ID " + str);
        C7440a c7440a = this.f17294e;
        if (c7440a != null) {
            c7440a.m22442b(str);
        }
        Iterator<C1584v> it = this.f17297s.m8805c(str).iterator();
        while (it.hasNext()) {
            this.f17291b.m8679A(it.next());
        }
    }

    @Override // androidx.work.impl.InterfaceC1552e
    /* renamed from: d */
    public void m8750l(C9124m c9124m, boolean z10) {
        this.f17297s.m8804b(c9124m);
        m22445i(c9124m);
    }

    @Override // androidx.work.impl.InterfaceC1579t
    /* renamed from: e */
    public boolean mo8666e() {
        return false;
    }

    @Override // p128h2.InterfaceC7613c
    /* renamed from: f */
    public void mo8631f(List<C9132u> list) {
        Iterator<C9132u> it = list.iterator();
        while (it.hasNext()) {
            C9124m m26934a = C9135x.m26934a(it.next());
            if (!this.f17297s.m8803a(m26934a)) {
                AbstractC7277j.m21767e().mo21770a(f17289u, "Constraints met: Scheduling work ID " + m26934a);
                this.f17291b.m8697x(this.f17297s.m8806d(m26934a));
            }
        }
    }
}
