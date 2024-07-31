package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p321r0.InterfaceSubMenuC10577c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
public class SubMenuC0272s extends MenuC0268o implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC10577c f1376e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0272s(Context context, InterfaceSubMenuC10577c interfaceSubMenuC10577c) {
        super(context, interfaceSubMenuC10577c);
        this.f1376e = interfaceSubMenuC10577c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f1376e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m1257c(this.f1376e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f1376e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1376e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f1376e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1376e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f1376e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f1376e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1376e.setIcon(drawable);
        return this;
    }
}
