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
import androidx.core.content.C0854a;
import androidx.core.graphics.drawable.C0888a;
import androidx.core.view.AbstractC1011b;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p321r0.InterfaceMenuItemC10576b;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public class C0254a implements InterfaceMenuItemC10576b {

    /* renamed from: a */
    private final int f1175a;

    /* renamed from: b */
    private final int f1176b;

    /* renamed from: c */
    private final int f1177c;

    /* renamed from: d */
    private CharSequence f1178d;

    /* renamed from: e */
    private CharSequence f1179e;

    /* renamed from: f */
    private Intent f1180f;

    /* renamed from: g */
    private char f1181g;

    /* renamed from: i */
    private char f1183i;

    /* renamed from: k */
    private Drawable f1185k;

    /* renamed from: l */
    private Context f1186l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f1187m;

    /* renamed from: n */
    private CharSequence f1188n;

    /* renamed from: o */
    private CharSequence f1189o;

    /* renamed from: h */
    private int f1182h = RecognitionOptions.AZTEC;

    /* renamed from: j */
    private int f1184j = RecognitionOptions.AZTEC;

    /* renamed from: p */
    private ColorStateList f1190p = null;

    /* renamed from: q */
    private PorterDuff.Mode f1191q = null;

    /* renamed from: r */
    private boolean f1192r = false;

    /* renamed from: s */
    private boolean f1193s = false;

    /* renamed from: t */
    private int f1194t = 16;

    public C0254a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f1186l = context;
        this.f1175a = i11;
        this.f1176b = i10;
        this.f1177c = i13;
        this.f1178d = charSequence;
    }

    /* renamed from: c */
    private void m1235c() {
        Drawable drawable = this.f1185k;
        if (drawable != null) {
            if (this.f1192r || this.f1193s) {
                Drawable m4545i = C0888a.m4545i(drawable);
                this.f1185k = m4545i;
                Drawable mutate = m4545i.mutate();
                this.f1185k = mutate;
                if (this.f1192r) {
                    C0888a.m4543g(mutate, this.f1190p);
                }
                if (this.f1193s) {
                    C0888a.m4544h(this.f1185k, this.f1191q);
                }
            }
        }
    }

    @Override // p321r0.InterfaceMenuItemC10576b
    /* renamed from: a */
    public AbstractC1011b mo1236a() {
        return null;
    }

    @Override // p321r0.InterfaceMenuItemC10576b
    /* renamed from: b */
    public InterfaceMenuItemC10576b mo1237b(AbstractC1011b abstractC1011b) {
        throw new UnsupportedOperationException();
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10576b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10576b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10576b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1184j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1183i;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1188n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1176b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1185k;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1190p;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1191q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1180f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1175a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1182h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1181g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1177c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1178d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1179e;
        return charSequence != null ? charSequence : this.f1178d;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1189o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1194t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1194t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1194t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1194t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1183i = Character.toLowerCase(c10);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1183i = Character.toLowerCase(c10);
        this.f1184j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f1194t = (z10 ? 1 : 0) | (this.f1194t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f1194t = (z10 ? 2 : 0) | (this.f1194t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC10576b setContentDescription(CharSequence charSequence) {
        this.f1188n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1194t = (z10 ? 16 : 0) | (this.f1194t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1185k = C0854a.getDrawable(this.f1186l, i10);
        m1235c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1185k = drawable;
        m1235c();
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1190p = colorStateList;
        this.f1192r = true;
        m1235c();
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1191q = mode;
        this.f1193s = true;
        m1235c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1180f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f1181g = c10;
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1181g = c10;
        this.f1182h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1187m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1181g = c10;
        this.f1183i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1181g = c10;
        this.f1182h = KeyEvent.normalizeMetaState(i10);
        this.f1183i = Character.toLowerCase(c11);
        this.f1184j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f1178d = this.f1186l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1178d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1179e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC10576b setTooltipText(CharSequence charSequence) {
        this.f1189o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f1194t = (this.f1194t & 8) | (z10 ? 0 : 8);
        return this;
    }
}
