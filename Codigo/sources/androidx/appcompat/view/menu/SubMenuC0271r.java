package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0260g;

/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
public class SubMenuC0271r extends C0260g implements SubMenu {

    /* renamed from: B */
    private C0260g f1374B;

    /* renamed from: C */
    private C0262i f1375C;

    public SubMenuC0271r(Context context, C0260g c0260g, C0262i c0262i) {
        super(context);
        this.f1374B = c0260g;
        this.f1375C = c0262i;
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: D */
    public C0260g mo1302D() {
        return this.f1374B.mo1302D();
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: F */
    public boolean mo1304F() {
        return this.f1374B.mo1304F();
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: G */
    public boolean mo1305G() {
        return this.f1374B.mo1305G();
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: H */
    public boolean mo1306H() {
        return this.f1374B.mo1306H();
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: R */
    public void mo1315R(C0260g.a aVar) {
        this.f1374B.mo1315R(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: f */
    public boolean mo1332f(C0262i c0262i) {
        return this.f1374B.mo1332f(c0262i);
    }

    /* renamed from: f0 */
    public Menu m1408f0() {
        return this.f1374B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1375C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: h */
    public boolean mo1333h(C0260g c0260g, MenuItem menuItem) {
        return super.mo1333h(c0260g, menuItem) || this.f1374B.mo1333h(c0260g, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: k */
    public boolean mo1334k(C0262i c0262i) {
        return this.f1374B.mo1334k(c0262i);
    }

    @Override // androidx.appcompat.view.menu.C0260g, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1374B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.m1318U(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m1319V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.m1320X(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m1321Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m1322Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f1375C.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1375C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0260g, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1374B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.C0260g
    /* renamed from: t */
    public String mo1342t() {
        C0262i c0262i = this.f1375C;
        int itemId = c0262i != null ? c0262i.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1342t() + ":" + itemId;
    }
}
