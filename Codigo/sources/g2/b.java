package g2;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import androidx.work.impl.t;
import androidx.work.impl.v;
import androidx.work.impl.w;
import f2.j;
import f2.s;
import h2.c;
import h2.d;
import j2.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k2.m;
import k2.u;
import k2.x;
import l2.s;

/* loaded from: classes.dex */
public class b implements t, c, e {

    /* renamed from: u, reason: collision with root package name */
    private static final String f15707u = j.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f15708a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f15709b;

    /* renamed from: c, reason: collision with root package name */
    private final d f15710c;

    /* renamed from: e, reason: collision with root package name */
    private a f15712e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15713f;

    /* renamed from: t, reason: collision with root package name */
    Boolean f15716t;

    /* renamed from: d, reason: collision with root package name */
    private final Set<u> f15711d = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    private final w f15715s = new w();

    /* renamed from: r, reason: collision with root package name */
    private final Object f15714r = new Object();

    public b(Context context, androidx.work.a aVar, n nVar, e0 e0Var) {
        this.f15708a = context;
        this.f15709b = e0Var;
        this.f15710c = new h2.e(nVar, this);
        this.f15712e = new a(this, aVar.k());
    }

    private void g() {
        this.f15716t = Boolean.valueOf(s.b(this.f15708a, this.f15709b.k()));
    }

    private void h() {
        if (this.f15713f) {
            return;
        }
        this.f15709b.o().g(this);
        this.f15713f = true;
    }

    private void i(m mVar) {
        synchronized (this.f15714r) {
            Iterator<u> it = this.f15711d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u next = it.next();
                if (x.a(next).equals(mVar)) {
                    j.e().a(f15707u, "Stopping tracking for " + mVar);
                    this.f15711d.remove(next);
                    this.f15710c.a(this.f15711d);
                    break;
                }
            }
        }
    }

    @Override // androidx.work.impl.t
    public void a(u... uVarArr) {
        j e10;
        String str;
        StringBuilder sb2;
        String str2;
        if (this.f15716t == null) {
            g();
        }
        if (!this.f15716t.booleanValue()) {
            j.e().f(f15707u, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f15715s.a(x.a(uVar))) {
                long c10 = uVar.c();
                long currentTimeMillis = System.currentTimeMillis();
                if (uVar.f20224b == s.a.ENQUEUED) {
                    if (currentTimeMillis < c10) {
                        a aVar = this.f15712e;
                        if (aVar != null) {
                            aVar.a(uVar);
                        }
                    } else if (uVar.h()) {
                        if (uVar.f20232j.h()) {
                            e10 = j.e();
                            str = f15707u;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(uVar);
                            str2 = ". Requires device idle.";
                        } else if (uVar.f20232j.e()) {
                            e10 = j.e();
                            str = f15707u;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(uVar);
                            str2 = ". Requires ContentUri triggers.";
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f20223a);
                        }
                        sb2.append(str2);
                        e10.a(str, sb2.toString());
                    } else if (!this.f15715s.a(x.a(uVar))) {
                        j.e().a(f15707u, "Starting work for " + uVar.f20223a);
                        this.f15709b.x(this.f15715s.e(uVar));
                    }
                }
            }
        }
        synchronized (this.f15714r) {
            if (!hashSet.isEmpty()) {
                j.e().a(f15707u, "Starting tracking for " + TextUtils.join(",", hashSet2));
                this.f15711d.addAll(hashSet);
                this.f15710c.a(this.f15711d);
            }
        }
    }

    @Override // h2.c
    public void b(List<u> list) {
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            m a10 = x.a(it.next());
            j.e().a(f15707u, "Constraints not met: Cancelling work ID " + a10);
            v b10 = this.f15715s.b(a10);
            if (b10 != null) {
                this.f15709b.A(b10);
            }
        }
    }

    @Override // androidx.work.impl.t
    public void c(String str) {
        if (this.f15716t == null) {
            g();
        }
        if (!this.f15716t.booleanValue()) {
            j.e().f(f15707u, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        j.e().a(f15707u, "Cancelling work ID " + str);
        a aVar = this.f15712e;
        if (aVar != null) {
            aVar.b(str);
        }
        Iterator<v> it = this.f15715s.c(str).iterator();
        while (it.hasNext()) {
            this.f15709b.A(it.next());
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        this.f15715s.b(mVar);
        i(mVar);
    }

    @Override // androidx.work.impl.t
    public boolean e() {
        return false;
    }

    @Override // h2.c
    public void f(List<u> list) {
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            m a10 = x.a(it.next());
            if (!this.f15715s.a(a10)) {
                j.e().a(f15707u, "Constraints met: Scheduling work ID " + a10);
                this.f15709b.x(this.f15715s.d(a10));
            }
        }
    }
}
