package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.p;
import androidx.core.view.accessibility.q;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f5423d;

    /* renamed from: e, reason: collision with root package name */
    private final a f5424e;

    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final i f5425d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f5426e = new WeakHashMap();

        public a(i iVar) {
            this.f5425d = iVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5426e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public q b(View view) {
            androidx.core.view.a aVar = this.f5426e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5426e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, p pVar) {
            if (!this.f5425d.o() && this.f5425d.f5423d.getLayoutManager() != null) {
                this.f5425d.f5423d.getLayoutManager().d0(view, pVar);
                androidx.core.view.a aVar = this.f5426e.get(view);
                if (aVar != null) {
                    aVar.g(view, pVar);
                    return;
                }
            }
            super.g(view, pVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5426e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5426e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f5425d.o() || this.f5425d.f5423d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = this.f5426e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f5425d.f5423d.getLayoutManager().t0(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f5426e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5426e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return this.f5426e.remove(view);
        }
    }

    public i(RecyclerView recyclerView) {
        this.f5423d = recyclerView;
        androidx.core.view.a n10 = n();
        this.f5424e = (n10 == null || !(n10 instanceof a)) ? new a(this) : (a) n10;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Z(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, p pVar) {
        super.g(view, pVar);
        if (o() || this.f5423d.getLayoutManager() == null) {
            return;
        }
        this.f5423d.getLayoutManager().b0(pVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f5423d.getLayoutManager() == null) {
            return false;
        }
        return this.f5423d.getLayoutManager().r0(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f5424e;
    }

    boolean o() {
        return this.f5423d.L();
    }
}
