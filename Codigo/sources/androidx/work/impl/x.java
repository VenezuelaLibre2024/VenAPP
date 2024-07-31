package androidx.work.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class x extends f2.r {

    /* renamed from: j */
    private static final String f5952j = f2.j.i("WorkContinuationImpl");

    /* renamed from: a */
    private final e0 f5953a;

    /* renamed from: b */
    private final String f5954b;

    /* renamed from: c */
    private final f2.d f5955c;

    /* renamed from: d */
    private final List<? extends f2.u> f5956d;

    /* renamed from: e */
    private final List<String> f5957e;

    /* renamed from: f */
    private final List<String> f5958f;

    /* renamed from: g */
    private final List<x> f5959g;

    /* renamed from: h */
    private boolean f5960h;

    /* renamed from: i */
    private f2.m f5961i;

    public x(e0 e0Var, String str, f2.d dVar, List<? extends f2.u> list, List<x> list2) {
        this.f5953a = e0Var;
        this.f5954b = str;
        this.f5955c = dVar;
        this.f5956d = list;
        this.f5959g = list2;
        this.f5957e = new ArrayList(list.size());
        this.f5958f = new ArrayList();
        if (list2 != null) {
            Iterator<x> it = list2.iterator();
            while (it.hasNext()) {
                this.f5958f.addAll(it.next().f5958f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String b10 = list.get(i10).b();
            this.f5957e.add(b10);
            this.f5958f.add(b10);
        }
    }

    public x(e0 e0Var, List<? extends f2.u> list) {
        this(e0Var, null, f2.d.KEEP, list, null);
    }

    private static boolean i(x xVar, Set<String> set) {
        set.addAll(xVar.c());
        Set<String> l10 = l(xVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (l10.contains(it.next())) {
                return true;
            }
        }
        List<x> e10 = xVar.e();
        if (e10 != null && !e10.isEmpty()) {
            Iterator<x> it2 = e10.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set<String> l(x xVar) {
        HashSet hashSet = new HashSet();
        List<x> e10 = xVar.e();
        if (e10 != null && !e10.isEmpty()) {
            Iterator<x> it = e10.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public f2.m a() {
        if (this.f5960h) {
            f2.j.e().k(f5952j, "Already enqueued work ids (" + TextUtils.join(", ", this.f5957e) + ")");
        } else {
            l2.d dVar = new l2.d(this);
            this.f5953a.s().c(dVar);
            this.f5961i = dVar.d();
        }
        return this.f5961i;
    }

    public f2.d b() {
        return this.f5955c;
    }

    public List<String> c() {
        return this.f5957e;
    }

    public String d() {
        return this.f5954b;
    }

    public List<x> e() {
        return this.f5959g;
    }

    public List<? extends f2.u> f() {
        return this.f5956d;
    }

    public e0 g() {
        return this.f5953a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f5960h;
    }

    public void k() {
        this.f5960h = true;
    }
}
