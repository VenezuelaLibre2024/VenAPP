package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p321r0.InterfaceMenuC10575a;

/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class MenuC0268o extends AbstractC0256c implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC10575a f1350d;

    public MenuC0268o(Context context, InterfaceMenuC10575a interfaceMenuC10575a) {
        super(context);
        if (interfaceMenuC10575a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1350d = interfaceMenuC10575a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m1257c(this.f1350d.add(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m1257c(this.f1350d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m1257c(this.f1350d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m1257c(this.f1350d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f1350d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m1257c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return m1258d(this.f1350d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return m1258d(this.f1350d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return m1258d(this.f1350d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m1258d(this.f1350d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m1259e();
        this.f1350d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1350d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return m1257c(this.f1350d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return m1257c(this.f1350d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1350d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f1350d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f1350d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f1350d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        m1260f(i10);
        this.f1350d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m1261g(i10);
        this.f1350d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f1350d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f1350d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f1350d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1350d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1350d.size();
    }
}
