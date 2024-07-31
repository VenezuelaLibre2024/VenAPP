package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0243b;
import androidx.appcompat.view.menu.C0260g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.e */
/* loaded from: classes.dex */
public class C0246e extends AbstractC0243b implements C0260g.a {

    /* renamed from: c */
    private Context f1079c;

    /* renamed from: d */
    private ActionBarContextView f1080d;

    /* renamed from: e */
    private AbstractC0243b.a f1081e;

    /* renamed from: f */
    private WeakReference<View> f1082f;

    /* renamed from: r */
    private boolean f1083r;

    /* renamed from: s */
    private boolean f1084s;

    /* renamed from: t */
    private C0260g f1085t;

    public C0246e(Context context, ActionBarContextView actionBarContextView, AbstractC0243b.a aVar, boolean z10) {
        this.f1079c = context;
        this.f1080d = actionBarContextView;
        this.f1081e = aVar;
        C0260g m1316S = new C0260g(actionBarContextView.getContext()).m1316S(1);
        this.f1085t = m1316S;
        m1316S.mo1315R(this);
        this.f1084s = z10;
    }

    @Override // androidx.appcompat.view.menu.C0260g.a
    /* renamed from: a */
    public boolean mo1012a(C0260g c0260g, MenuItem menuItem) {
        return this.f1081e.mo1039c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0260g.a
    /* renamed from: b */
    public void mo1014b(C0260g c0260g) {
        mo1161k();
        this.f1080d.m1418l();
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: c */
    public void mo1155c() {
        if (this.f1083r) {
            return;
        }
        this.f1083r = true;
        this.f1081e.mo1037a(this);
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: d */
    public View mo1156d() {
        WeakReference<View> weakReference = this.f1082f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: e */
    public Menu mo1157e() {
        return this.f1085t;
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: f */
    public MenuInflater mo1158f() {
        return new C0248g(this.f1080d.getContext());
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: g */
    public CharSequence mo1159g() {
        return this.f1080d.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: i */
    public CharSequence mo1160i() {
        return this.f1080d.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: k */
    public void mo1161k() {
        this.f1081e.mo1040d(this, this.f1085t);
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: l */
    public boolean mo1162l() {
        return this.f1080d.m1416j();
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: m */
    public void mo1163m(View view) {
        this.f1080d.setCustomView(view);
        this.f1082f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: n */
    public void mo1164n(int i10) {
        mo1165o(this.f1079c.getString(i10));
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: o */
    public void mo1165o(CharSequence charSequence) {
        this.f1080d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: q */
    public void mo1166q(int i10) {
        mo1167r(this.f1079c.getString(i10));
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: r */
    public void mo1167r(CharSequence charSequence) {
        this.f1080d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0243b
    /* renamed from: s */
    public void mo1168s(boolean z10) {
        super.mo1168s(z10);
        this.f1080d.setTitleOptional(z10);
    }
}
