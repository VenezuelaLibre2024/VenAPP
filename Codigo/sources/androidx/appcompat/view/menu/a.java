package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public class a implements r0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f1033a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1034b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1035c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f1036d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f1037e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f1038f;

    /* renamed from: g, reason: collision with root package name */
    private char f1039g;

    /* renamed from: i, reason: collision with root package name */
    private char f1041i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f1043k;

    /* renamed from: l, reason: collision with root package name */
    private Context f1044l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1045m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f1046n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f1047o;

    /* renamed from: h, reason: collision with root package name */
    private int f1040h = RecognitionOptions.AZTEC;

    /* renamed from: j, reason: collision with root package name */
    private int f1042j = RecognitionOptions.AZTEC;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f1048p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f1049q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1050r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1051s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f1052t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f1044l = context;
        this.f1033a = i11;
        this.f1034b = i10;
        this.f1035c = i13;
        this.f1036d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f1043k;
        if (drawable != null) {
            if (this.f1050r || this.f1051s) {
                Drawable i10 = androidx.core.graphics.drawable.a.i(drawable);
                this.f1043k = i10;
                Drawable mutate = i10.mutate();
                this.f1043k = mutate;
                if (this.f1050r) {
                    androidx.core.graphics.drawable.a.g(mutate, this.f1048p);
                }
                if (this.f1051s) {
                    androidx.core.graphics.drawable.a.h(this.f1043k, this.f1049q);
                }
            }
        }
    }

    @Override // r0.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // r0.b
    public r0.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // r0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // r0.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // r0.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public r0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // r0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // r0.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // r0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // r0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1042j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1041i;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1046n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1034b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1043k;
    }

    @Override // r0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1048p;
    }

    @Override // r0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1049q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1038f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1033a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // r0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1040h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1039g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1035c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1036d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1037e;
        return charSequence != null ? charSequence : this.f1036d;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1047o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // r0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1052t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1052t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1052t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1052t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1041i = Character.toLowerCase(c10);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1041i = Character.toLowerCase(c10);
        this.f1042j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f1052t = (z10 ? 1 : 0) | (this.f1052t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f1052t = (z10 ? 2 : 0) | (this.f1052t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public r0.b setContentDescription(CharSequence charSequence) {
        this.f1046n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1052t = (z10 ? 16 : 0) | (this.f1052t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1043k = androidx.core.content.a.getDrawable(this.f1044l, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1043k = drawable;
        c();
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1048p = colorStateList;
        this.f1050r = true;
        c();
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1049q = mode;
        this.f1051s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1038f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f1039g = c10;
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1039g = c10;
        this.f1040h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1045m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1039g = c10;
        this.f1041i = Character.toLowerCase(c11);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1039g = c10;
        this.f1040h = KeyEvent.normalizeMetaState(i10);
        this.f1041i = Character.toLowerCase(c11);
        this.f1042j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f1036d = this.f1044l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1036d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1037e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public r0.b setTooltipText(CharSequence charSequence) {
        this.f1047o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f1052t = (this.f1052t & 8) | (z10 ? 0 : 8);
        return this;
    }
}
