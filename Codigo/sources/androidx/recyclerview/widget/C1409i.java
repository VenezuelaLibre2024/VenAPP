package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0987a;
import androidx.core.view.accessibility.C1007p;
import androidx.core.view.accessibility.C1008q;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public class C1409i extends C0987a {

    /* renamed from: d */
    final RecyclerView f6248d;

    /* renamed from: e */
    private final a f6249e;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    public static class a extends C0987a {

        /* renamed from: d */
        final C1409i f6250d;

        /* renamed from: e */
        private Map<View, C0987a> f6251e = new WeakHashMap();

        public a(C1409i c1409i) {
            this.f6250d = c1409i;
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: a */
        public boolean mo4849a(View view, AccessibilityEvent accessibilityEvent) {
            C0987a c0987a = this.f6251e.get(view);
            return c0987a != null ? c0987a.mo4849a(view, accessibilityEvent) : super.mo4849a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: b */
        public C1008q mo4850b(View view) {
            C0987a c0987a = this.f6251e.get(view);
            return c0987a != null ? c0987a.mo4850b(view) : super.mo4850b(view);
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: f */
        public void mo4852f(View view, AccessibilityEvent accessibilityEvent) {
            C0987a c0987a = this.f6251e.get(view);
            if (c0987a != null) {
                c0987a.mo4852f(view, accessibilityEvent);
            } else {
                super.mo4852f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: g */
        public void mo4853g(View view, C1007p c1007p) {
            if (!this.f6250d.m8070o() && this.f6250d.f6248d.getLayoutManager() != null) {
                this.f6250d.f6248d.getLayoutManager().m7841d0(view, c1007p);
                C0987a c0987a = this.f6251e.get(view);
                if (c0987a != null) {
                    c0987a.mo4853g(view, c1007p);
                    return;
                }
            }
            super.mo4853g(view, c1007p);
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: h */
        public void mo4854h(View view, AccessibilityEvent accessibilityEvent) {
            C0987a c0987a = this.f6251e.get(view);
            if (c0987a != null) {
                c0987a.mo4854h(view, accessibilityEvent);
            } else {
                super.mo4854h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: i */
        public boolean mo4855i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0987a c0987a = this.f6251e.get(viewGroup);
            return c0987a != null ? c0987a.mo4855i(viewGroup, view, accessibilityEvent) : super.mo4855i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: j */
        public boolean mo4856j(View view, int i10, Bundle bundle) {
            if (this.f6250d.m8070o() || this.f6250d.f6248d.getLayoutManager() == null) {
                return super.mo4856j(view, i10, bundle);
            }
            C0987a c0987a = this.f6251e.get(view);
            if (c0987a != null) {
                if (c0987a.mo4856j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.mo4856j(view, i10, bundle)) {
                return true;
            }
            return this.f6250d.f6248d.getLayoutManager().m7856t0(view, i10, bundle);
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: l */
        public void mo4857l(View view, int i10) {
            C0987a c0987a = this.f6251e.get(view);
            if (c0987a != null) {
                c0987a.mo4857l(view, i10);
            } else {
                super.mo4857l(view, i10);
            }
        }

        @Override // androidx.core.view.C0987a
        /* renamed from: m */
        public void mo4858m(View view, AccessibilityEvent accessibilityEvent) {
            C0987a c0987a = this.f6251e.get(view);
            if (c0987a != null) {
                c0987a.mo4858m(view, accessibilityEvent);
            } else {
                super.mo4858m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C0987a m8071n(View view) {
            return this.f6251e.remove(view);
        }
    }

    public C1409i(RecyclerView recyclerView) {
        this.f6248d = recyclerView;
        C0987a m8069n = m8069n();
        this.f6249e = (m8069n == null || !(m8069n instanceof a)) ? new a(this) : (a) m8069n;
    }

    @Override // androidx.core.view.C0987a
    /* renamed from: f */
    public void mo4852f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4852f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m8070o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo7627Z(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0987a
    /* renamed from: g */
    public void mo4853g(View view, C1007p c1007p) {
        super.mo4853g(view, c1007p);
        if (m8070o() || this.f6248d.getLayoutManager() == null) {
            return;
        }
        this.f6248d.getLayoutManager().m7839b0(c1007p);
    }

    @Override // androidx.core.view.C0987a
    /* renamed from: j */
    public boolean mo4856j(View view, int i10, Bundle bundle) {
        if (super.mo4856j(view, i10, bundle)) {
            return true;
        }
        if (m8070o() || this.f6248d.getLayoutManager() == null) {
            return false;
        }
        return this.f6248d.getLayoutManager().m7852r0(i10, bundle);
    }

    /* renamed from: n */
    public C0987a m8069n() {
        return this.f6249e;
    }

    /* renamed from: o */
    boolean m8070o() {
        return this.f6248d.m7678L();
    }
}
