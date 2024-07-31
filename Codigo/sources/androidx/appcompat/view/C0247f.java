package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0243b;
import androidx.appcompat.view.menu.MenuC0268o;
import androidx.appcompat.view.menu.MenuItemC0263j;
import androidx.collection.C0738h;
import java.util.ArrayList;
import p321r0.InterfaceMenuC10575a;
import p321r0.InterfaceMenuItemC10576b;

/* renamed from: androidx.appcompat.view.f */
/* loaded from: classes.dex */
public class C0247f extends ActionMode {

    /* renamed from: a */
    final Context f1086a;

    /* renamed from: b */
    final AbstractC0243b f1087b;

    /* renamed from: androidx.appcompat.view.f$a */
    /* loaded from: classes.dex */
    public static class a implements AbstractC0243b.a {

        /* renamed from: a */
        final ActionMode.Callback f1088a;

        /* renamed from: b */
        final Context f1089b;

        /* renamed from: c */
        final ArrayList<C0247f> f1090c = new ArrayList<>();

        /* renamed from: d */
        final C0738h<Menu, Menu> f1091d = new C0738h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1089b = context;
            this.f1088a = callback;
        }

        /* renamed from: f */
        private Menu m1188f(Menu menu) {
            Menu menu2 = this.f1091d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC0268o menuC0268o = new MenuC0268o(this.f1089b, (InterfaceMenuC10575a) menu);
            this.f1091d.put(menu, menuC0268o);
            return menuC0268o;
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: a */
        public void mo1037a(AbstractC0243b abstractC0243b) {
            this.f1088a.onDestroyActionMode(m1189e(abstractC0243b));
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: b */
        public boolean mo1038b(AbstractC0243b abstractC0243b, Menu menu) {
            return this.f1088a.onCreateActionMode(m1189e(abstractC0243b), m1188f(menu));
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: c */
        public boolean mo1039c(AbstractC0243b abstractC0243b, MenuItem menuItem) {
            return this.f1088a.onActionItemClicked(m1189e(abstractC0243b), new MenuItemC0263j(this.f1089b, (InterfaceMenuItemC10576b) menuItem));
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: d */
        public boolean mo1040d(AbstractC0243b abstractC0243b, Menu menu) {
            return this.f1088a.onPrepareActionMode(m1189e(abstractC0243b), m1188f(menu));
        }

        /* renamed from: e */
        public ActionMode m1189e(AbstractC0243b abstractC0243b) {
            int size = this.f1090c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0247f c0247f = this.f1090c.get(i10);
                if (c0247f != null && c0247f.f1087b == abstractC0243b) {
                    return c0247f;
                }
            }
            C0247f c0247f2 = new C0247f(this.f1089b, abstractC0243b);
            this.f1090c.add(c0247f2);
            return c0247f2;
        }
    }

    public C0247f(Context context, AbstractC0243b abstractC0243b) {
        this.f1086a = context;
        this.f1087b = abstractC0243b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1087b.mo1155c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1087b.mo1156d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0268o(this.f1086a, (InterfaceMenuC10575a) this.f1087b.mo1157e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1087b.mo1158f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1087b.mo1159g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1087b.m1178h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1087b.mo1160i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1087b.m1179j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1087b.mo1161k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1087b.mo1162l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1087b.mo1163m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f1087b.mo1164n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1087b.mo1165o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1087b.m1180p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f1087b.mo1166q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1087b.mo1167r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f1087b.mo1168s(z10);
    }
}
