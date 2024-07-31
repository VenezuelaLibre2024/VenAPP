package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.InterfaceC1306i;
import androidx.lifecycle.InterfaceC1310k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.x */
/* loaded from: classes.dex */
public class C1115x {

    /* renamed from: a */
    private final Runnable f4696a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<InterfaceC1067m0> f4697b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<InterfaceC1067m0, a> f4698c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.x$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final AbstractC1300f f4699a;

        /* renamed from: b */
        private InterfaceC1306i f4700b;

        a(AbstractC1300f abstractC1300f, InterfaceC1306i interfaceC1306i) {
            this.f4699a = abstractC1300f;
            this.f4700b = interfaceC1306i;
            abstractC1300f.mo7314a(interfaceC1306i);
        }

        /* renamed from: a */
        void m5235a() {
            this.f4699a.mo7316c(this.f4700b);
            this.f4700b = null;
        }
    }

    public C1115x(Runnable runnable) {
        this.f4696a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m5225f(InterfaceC1067m0 interfaceC1067m0, InterfaceC1310k interfaceC1310k, AbstractC1300f.a aVar) {
        if (aVar == AbstractC1300f.a.ON_DESTROY) {
            m5234l(interfaceC1067m0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m5226g(AbstractC1300f.b bVar, InterfaceC1067m0 interfaceC1067m0, InterfaceC1310k interfaceC1310k, AbstractC1300f.a aVar) {
        if (aVar == AbstractC1300f.a.m7319l(bVar)) {
            m5227c(interfaceC1067m0);
            return;
        }
        if (aVar == AbstractC1300f.a.ON_DESTROY) {
            m5234l(interfaceC1067m0);
        } else if (aVar == AbstractC1300f.a.m7318h(bVar)) {
            this.f4697b.remove(interfaceC1067m0);
            this.f4696a.run();
        }
    }

    /* renamed from: c */
    public void m5227c(InterfaceC1067m0 interfaceC1067m0) {
        this.f4697b.add(interfaceC1067m0);
        this.f4696a.run();
    }

    /* renamed from: d */
    public void m5228d(final InterfaceC1067m0 interfaceC1067m0, InterfaceC1310k interfaceC1310k) {
        m5227c(interfaceC1067m0);
        AbstractC1300f lifecycle = interfaceC1310k.getLifecycle();
        a remove = this.f4698c.remove(interfaceC1067m0);
        if (remove != null) {
            remove.m5235a();
        }
        this.f4698c.put(interfaceC1067m0, new a(lifecycle, new InterfaceC1306i() { // from class: androidx.core.view.v
            @Override // androidx.lifecycle.InterfaceC1306i
            public final void onStateChanged(InterfaceC1310k interfaceC1310k2, AbstractC1300f.a aVar) {
                C1115x.this.m5225f(interfaceC1067m0, interfaceC1310k2, aVar);
            }
        }));
    }

    /* renamed from: e */
    public void m5229e(final InterfaceC1067m0 interfaceC1067m0, InterfaceC1310k interfaceC1310k, final AbstractC1300f.b bVar) {
        AbstractC1300f lifecycle = interfaceC1310k.getLifecycle();
        a remove = this.f4698c.remove(interfaceC1067m0);
        if (remove != null) {
            remove.m5235a();
        }
        this.f4698c.put(interfaceC1067m0, new a(lifecycle, new InterfaceC1306i() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.InterfaceC1306i
            public final void onStateChanged(InterfaceC1310k interfaceC1310k2, AbstractC1300f.a aVar) {
                C1115x.this.m5226g(bVar, interfaceC1067m0, interfaceC1310k2, aVar);
            }
        }));
    }

    /* renamed from: h */
    public void m5230h(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC1067m0> it = this.f4697b.iterator();
        while (it.hasNext()) {
            it.next().m5059d(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void m5231i(Menu menu) {
        Iterator<InterfaceC1067m0> it = this.f4697b.iterator();
        while (it.hasNext()) {
            it.next().m5056a(menu);
        }
    }

    /* renamed from: j */
    public boolean m5232j(MenuItem menuItem) {
        Iterator<InterfaceC1067m0> it = this.f4697b.iterator();
        while (it.hasNext()) {
            if (it.next().m5058c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m5233k(Menu menu) {
        Iterator<InterfaceC1067m0> it = this.f4697b.iterator();
        while (it.hasNext()) {
            it.next().m5057b(menu);
        }
    }

    /* renamed from: l */
    public void m5234l(InterfaceC1067m0 interfaceC1067m0) {
        this.f4697b.remove(interfaceC1067m0);
        a remove = this.f4698c.remove(interfaceC1067m0);
        if (remove != null) {
            remove.m5235a();
        }
        this.f4696a.run();
    }
}
