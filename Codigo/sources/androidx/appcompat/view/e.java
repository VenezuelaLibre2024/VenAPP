package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f948c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f949d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f950e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<View> f951f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f952r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f953s;

    /* renamed from: t, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f954t;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f948c = context;
        this.f949d = actionBarContextView;
        this.f950e = aVar;
        androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f954t = S;
        S.R(this);
        this.f953s = z10;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f950e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f949d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f952r) {
            return;
        }
        this.f952r = true;
        this.f950e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f951f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f954t;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f949d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f949d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f949d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f950e.d(this, this.f954t);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f949d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f949d.setCustomView(view);
        this.f951f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f948c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f949d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f948c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f949d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f949d.setTitleOptional(z10);
    }
}
