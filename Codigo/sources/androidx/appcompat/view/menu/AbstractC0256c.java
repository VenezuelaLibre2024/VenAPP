package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.C0738h;
import p321r0.InterfaceMenuItemC10576b;
import p321r0.InterfaceSubMenuC10577c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public abstract class AbstractC0256c {

    /* renamed from: a */
    final Context f1205a;

    /* renamed from: b */
    private C0738h<InterfaceMenuItemC10576b, MenuItem> f1206b;

    /* renamed from: c */
    private C0738h<InterfaceSubMenuC10577c, SubMenu> f1207c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0256c(Context context) {
        this.f1205a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m1257c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC10576b)) {
            return menuItem;
        }
        InterfaceMenuItemC10576b interfaceMenuItemC10576b = (InterfaceMenuItemC10576b) menuItem;
        if (this.f1206b == null) {
            this.f1206b = new C0738h<>();
        }
        MenuItem menuItem2 = this.f1206b.get(interfaceMenuItemC10576b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0263j menuItemC0263j = new MenuItemC0263j(this.f1205a, interfaceMenuItemC10576b);
        this.f1206b.put(interfaceMenuItemC10576b, menuItemC0263j);
        return menuItemC0263j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m1258d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC10577c)) {
            return subMenu;
        }
        InterfaceSubMenuC10577c interfaceSubMenuC10577c = (InterfaceSubMenuC10577c) subMenu;
        if (this.f1207c == null) {
            this.f1207c = new C0738h<>();
        }
        SubMenu subMenu2 = this.f1207c.get(interfaceSubMenuC10577c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0272s subMenuC0272s = new SubMenuC0272s(this.f1205a, interfaceSubMenuC10577c);
        this.f1207c.put(interfaceSubMenuC10577c, subMenuC0272s);
        return subMenuC0272s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m1259e() {
        C0738h<InterfaceMenuItemC10576b, MenuItem> c0738h = this.f1206b;
        if (c0738h != null) {
            c0738h.clear();
        }
        C0738h<InterfaceSubMenuC10577c, SubMenu> c0738h2 = this.f1207c;
        if (c0738h2 != null) {
            c0738h2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m1260f(int i10) {
        if (this.f1206b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f1206b.size()) {
            if (this.f1206b.m3711j(i11).getGroupId() == i10) {
                this.f1206b.mo3713l(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m1261g(int i10) {
        if (this.f1206b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f1206b.size(); i11++) {
            if (this.f1206b.m3711j(i11).getItemId() == i10) {
                this.f1206b.mo3713l(i11);
                return;
            }
        }
    }
}
