package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC1272n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public class C1271m {

    /* renamed from: a */
    private final CopyOnWriteArrayList<a> f5416a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final AbstractC1272n f5417b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final AbstractC1272n.l f5418a;

        /* renamed from: b */
        final boolean f5419b;

        a(AbstractC1272n.l lVar, boolean z10) {
            this.f5418a = lVar;
            this.f5419b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1271m(AbstractC1272n abstractC1272n) {
        this.f5417b = abstractC1272n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6975a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6975a(fragment, bundle, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7122a(this.f5417b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6976b(Fragment fragment, boolean z10) {
        Context m6970f = this.f5417b.m7101s0().m6970f();
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6976b(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7123b(this.f5417b, fragment, m6970f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6977c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6977c(fragment, bundle, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7124c(this.f5417b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6978d(Fragment fragment, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6978d(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7125d(this.f5417b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6979e(Fragment fragment, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6979e(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7126e(this.f5417b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m6980f(Fragment fragment, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6980f(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.mo7127f(this.f5417b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m6981g(Fragment fragment, boolean z10) {
        Context m6970f = this.f5417b.m7101s0().m6970f();
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6981g(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7128g(this.f5417b, fragment, m6970f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6982h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6982h(fragment, bundle, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7129h(this.f5417b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m6983i(Fragment fragment, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6983i(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.mo7130i(this.f5417b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m6984j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6984j(fragment, bundle, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7131j(this.f5417b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m6985k(Fragment fragment, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6985k(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7132k(this.f5417b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m6986l(Fragment fragment, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6986l(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7133l(this.f5417b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m6987m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6987m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7134m(this.f5417b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m6988n(Fragment fragment, boolean z10) {
        Fragment m7106v0 = this.f5417b.m7106v0();
        if (m7106v0 != null) {
            m7106v0.getParentFragmentManager().m7104u0().m6988n(fragment, true);
        }
        Iterator<a> it = this.f5416a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5419b) {
                next.f5418a.m7135n(this.f5417b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m6989o(AbstractC1272n.l lVar, boolean z10) {
        this.f5416a.add(new a(lVar, z10));
    }

    /* renamed from: p */
    public void m6990p(AbstractC1272n.l lVar) {
        synchronized (this.f5416a) {
            int size = this.f5416a.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (this.f5416a.get(i10).f5418a == lVar) {
                    this.f5416a.remove(i10);
                    break;
                }
                i10++;
            }
        }
    }
}
