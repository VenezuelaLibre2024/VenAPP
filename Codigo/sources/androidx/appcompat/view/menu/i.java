package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class i implements r0.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a */
    private final int f1137a;

    /* renamed from: b */
    private final int f1138b;

    /* renamed from: c */
    private final int f1139c;

    /* renamed from: d */
    private final int f1140d;

    /* renamed from: e */
    private CharSequence f1141e;

    /* renamed from: f */
    private CharSequence f1142f;

    /* renamed from: g */
    private Intent f1143g;

    /* renamed from: h */
    private char f1144h;

    /* renamed from: j */
    private char f1146j;

    /* renamed from: l */
    private Drawable f1148l;

    /* renamed from: n */
    g f1150n;

    /* renamed from: o */
    private r f1151o;

    /* renamed from: p */
    private Runnable f1152p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1153q;

    /* renamed from: r */
    private CharSequence f1154r;

    /* renamed from: s */
    private CharSequence f1155s;

    /* renamed from: z */
    private int f1162z;

    /* renamed from: i */
    private int f1145i = RecognitionOptions.AZTEC;

    /* renamed from: k */
    private int f1147k = RecognitionOptions.AZTEC;

    /* renamed from: m */
    private int f1149m = 0;

    /* renamed from: t */
    private ColorStateList f1156t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1157u = null;

    /* renamed from: v */
    private boolean f1158v = false;

    /* renamed from: w */
    private boolean f1159w = false;

    /* renamed from: x */
    private boolean f1160x = false;

    /* renamed from: y */
    private int f1161y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.InterfaceC0053b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0053b
        public void onActionProviderVisibilityChanged(boolean z10) {
            i iVar = i.this;
            iVar.f1150n.J(iVar);
        }
    }

    public i(g gVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1150n = gVar;
        this.f1137a = i11;
        this.f1138b = i10;
        this.f1139c = i12;
        this.f1140d = i13;
        this.f1141e = charSequence;
        this.f1162z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1160x && (this.f1158v || this.f1159w)) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            if (this.f1158v) {
                androidx.core.graphics.drawable.a.g(drawable, this.f1156t);
            }
            if (this.f1159w) {
                androidx.core.graphics.drawable.a.h(drawable, this.f1157u);
            }
            this.f1160x = false;
        }
        return drawable;
    }

    public boolean A() {
        return this.f1150n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f1162z & 4) == 4;
    }

    @Override // r0.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // r0.b
    public r0.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f1150n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f1150n.I(this);
    }

    @Override // r0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1162z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1150n.f(this);
        }
        return false;
    }

    @Override // r0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1150n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f1140d;
    }

    public char g() {
        return this.f1150n.G() ? this.f1146j : this.f1144h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // r0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.A = d10;
        return d10;
    }

    @Override // r0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1147k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1146j;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1154r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1138b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1148l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1149m == 0) {
            return null;
        }
        Drawable b10 = h.a.b(this.f1150n.u(), this.f1149m);
        this.f1149m = 0;
        this.f1148l = b10;
        return e(b10);
    }

    @Override // r0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1156t;
    }

    @Override // r0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1157u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1143g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1137a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // r0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1145i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1144h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1139c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1151o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1141e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1142f;
        return charSequence != null ? charSequence : this.f1141e;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1155s;
    }

    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f1150n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1150n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(g.h.f15394k));
        }
        int i11 = this.f1150n.G() ? this.f1147k : this.f1145i;
        d(sb2, i11, 65536, resources.getString(g.h.f15390g));
        d(sb2, i11, RecognitionOptions.AZTEC, resources.getString(g.h.f15386c));
        d(sb2, i11, 2, resources.getString(g.h.f15385b));
        d(sb2, i11, 1, resources.getString(g.h.f15391h));
        d(sb2, i11, 4, resources.getString(g.h.f15393j));
        d(sb2, i11, 8, resources.getString(g.h.f15389f));
        if (g10 == '\b') {
            i10 = g.h.f15387d;
        } else if (g10 == '\n') {
            i10 = g.h.f15388e;
        } else {
            if (g10 != ' ') {
                sb2.append(g10);
                return sb2.toString();
            }
            i10 = g.h.f15392i;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1151o != null;
    }

    public CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // r0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1161y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1161y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1161y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f1161y & 8) == 0 : (this.f1161y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1162z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1153q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f1150n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1152p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1143g != null) {
            try {
                this.f1150n.u().startActivity(this.f1143g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f1161y & 32) == 32;
    }

    public boolean m() {
        return (this.f1161y & 4) != 0;
    }

    public boolean n() {
        return (this.f1162z & 1) == 1;
    }

    public boolean o() {
        return (this.f1162z & 2) == 2;
    }

    @Override // r0.b, android.view.MenuItem
    /* renamed from: p */
    public r0.b setActionView(int i10) {
        Context u10 = this.f1150n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    /* renamed from: q */
    public r0.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1137a) > 0) {
            view.setId(i10);
        }
        this.f1150n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1150n.K(false);
    }

    public void s(boolean z10) {
        int i10 = this.f1161y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1161y = i11;
        if (i10 != i11) {
            this.f1150n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1146j == c10) {
            return this;
        }
        this.f1146j = Character.toLowerCase(c10);
        this.f1150n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1146j == c10 && this.f1147k == i10) {
            return this;
        }
        this.f1146j = Character.toLowerCase(c10);
        this.f1147k = KeyEvent.normalizeMetaState(i10);
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1161y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1161y = i11;
        if (i10 != i11) {
            this.f1150n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1161y & 4) != 0) {
            this.f1150n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public r0.b setContentDescription(CharSequence charSequence) {
        this.f1154r = charSequence;
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1161y = z10 ? this.f1161y | 16 : this.f1161y & (-17);
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1148l = null;
        this.f1149m = i10;
        this.f1160x = true;
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1149m = 0;
        this.f1148l = drawable;
        this.f1160x = true;
        this.f1150n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1156t = colorStateList;
        this.f1158v = true;
        this.f1160x = true;
        this.f1150n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1157u = mode;
        this.f1159w = true;
        this.f1160x = true;
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1143g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1144h == c10) {
            return this;
        }
        this.f1144h = c10;
        this.f1150n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1144h == c10 && this.f1145i == i10) {
            return this;
        }
        this.f1144h = c10;
        this.f1145i = KeyEvent.normalizeMetaState(i10);
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1153q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1144h = c10;
        this.f1146j = Character.toLowerCase(c11);
        this.f1150n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1144h = c10;
        this.f1145i = KeyEvent.normalizeMetaState(i10);
        this.f1146j = Character.toLowerCase(c11);
        this.f1147k = KeyEvent.normalizeMetaState(i11);
        this.f1150n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1162z = i10;
        this.f1150n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1150n.u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1141e = charSequence;
        this.f1150n.K(false);
        r rVar = this.f1151o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1142f = charSequence;
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public r0.b setTooltipText(CharSequence charSequence) {
        this.f1155s = charSequence;
        this.f1150n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1150n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1161y = (z10 ? 4 : 0) | (this.f1161y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1141e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f1161y = z10 ? this.f1161y | 32 : this.f1161y & (-33);
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // r0.b, android.view.MenuItem
    /* renamed from: w */
    public r0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(r rVar) {
        this.f1151o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f1161y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1161y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f1150n.A();
    }
}
