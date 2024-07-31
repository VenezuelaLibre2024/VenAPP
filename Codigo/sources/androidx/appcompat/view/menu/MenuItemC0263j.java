package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.InterfaceC0244c;
import androidx.core.view.AbstractC1011b;
import java.lang.reflect.Method;
import p321r0.InterfaceMenuItemC10576b;

/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
public class MenuItemC0263j extends AbstractC0256c implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC10576b f1325d;

    /* renamed from: e */
    private Method f1326e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* loaded from: classes.dex */
    private class a extends AbstractC1011b {

        /* renamed from: d */
        final ActionProvider f1327d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1327d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: a */
        public boolean mo1378a() {
            return this.f1327d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: c */
        public View mo1379c() {
            return this.f1327d.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: e */
        public boolean mo1380e() {
            return this.f1327d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: f */
        public void mo1381f(SubMenu subMenu) {
            this.f1327d.onPrepareSubMenu(MenuItemC0263j.this.m1258d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC1011b.b f1329f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: b */
        public boolean mo1382b() {
            return this.f1327d.isVisible();
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: d */
        public View mo1383d(MenuItem menuItem) {
            return this.f1327d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: g */
        public boolean mo1384g() {
            return this.f1327d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1011b
        /* renamed from: j */
        public void mo1385j(AbstractC1011b.b bVar) {
            this.f1329f = bVar;
            this.f1327d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC1011b.b bVar = this.f1329f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* loaded from: classes.dex */
    static class c extends FrameLayout implements InterfaceC0244c {

        /* renamed from: a */
        final CollapsibleActionView f1331a;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f1331a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m1386a() {
            return (View) this.f1331a;
        }

        @Override // androidx.appcompat.view.InterfaceC0244c
        public void onActionViewCollapsed() {
            this.f1331a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.InterfaceC0244c
        public void onActionViewExpanded() {
            this.f1331a.onActionViewExpanded();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1332a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1332a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1332a.onMenuItemActionCollapse(MenuItemC0263j.this.m1257c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1332a.onMenuItemActionExpand(MenuItemC0263j.this.m1257c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f1334a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1334a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1334a.onMenuItemClick(MenuItemC0263j.this.m1257c(menuItem));
        }
    }

    public MenuItemC0263j(Context context, InterfaceMenuItemC10576b interfaceMenuItemC10576b) {
        super(context);
        if (interfaceMenuItemC10576b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1325d = interfaceMenuItemC10576b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f1325d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f1325d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1011b mo1236a = this.f1325d.mo1236a();
        if (mo1236a instanceof a) {
            return ((a) mo1236a).f1327d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f1325d.getActionView();
        return actionView instanceof c ? ((c) actionView).m1386a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1325d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1325d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1325d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1325d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1325d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1325d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1325d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1325d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1325d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1325d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1325d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1325d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1325d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m1258d(this.f1325d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1325d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1325d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1325d.getTooltipText();
    }

    /* renamed from: h */
    public void m1377h(boolean z10) {
        try {
            if (this.f1326e == null) {
                this.f1326e = this.f1325d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1326e.invoke(this.f1325d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1325d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1325d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f1325d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f1325d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f1325d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f1325d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f1205a, actionProvider);
        InterfaceMenuItemC10576b interfaceMenuItemC10576b = this.f1325d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC10576b.mo1237b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f1325d.setActionView(i10);
        View actionView = this.f1325d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1325d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1325d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1325d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1325d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f1325d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f1325d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1325d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1325d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1325d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1325d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1325d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1325d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1325d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f1325d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1325d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1325d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1325d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1325d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1325d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f1325d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f1325d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f1325d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1325d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1325d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1325d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f1325d.setVisible(z10);
    }
}
