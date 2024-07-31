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
import androidx.appcompat.view.menu.InterfaceC0267n;
import androidx.core.graphics.drawable.C0888a;
import androidx.core.view.AbstractC1011b;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p111g.C7384h;
import p125h.C7605a;
import p321r0.InterfaceMenuItemC10576b;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public final class C0262i implements InterfaceMenuItemC10576b {

    /* renamed from: A */
    private View f1293A;

    /* renamed from: B */
    private AbstractC1011b f1294B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1295C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1297E;

    /* renamed from: a */
    private final int f1298a;

    /* renamed from: b */
    private final int f1299b;

    /* renamed from: c */
    private final int f1300c;

    /* renamed from: d */
    private final int f1301d;

    /* renamed from: e */
    private CharSequence f1302e;

    /* renamed from: f */
    private CharSequence f1303f;

    /* renamed from: g */
    private Intent f1304g;

    /* renamed from: h */
    private char f1305h;

    /* renamed from: j */
    private char f1307j;

    /* renamed from: l */
    private Drawable f1309l;

    /* renamed from: n */
    C0260g f1311n;

    /* renamed from: o */
    private SubMenuC0271r f1312o;

    /* renamed from: p */
    private Runnable f1313p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1314q;

    /* renamed from: r */
    private CharSequence f1315r;

    /* renamed from: s */
    private CharSequence f1316s;

    /* renamed from: z */
    private int f1323z;

    /* renamed from: i */
    private int f1306i = RecognitionOptions.AZTEC;

    /* renamed from: k */
    private int f1308k = RecognitionOptions.AZTEC;

    /* renamed from: m */
    private int f1310m = 0;

    /* renamed from: t */
    private ColorStateList f1317t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1318u = null;

    /* renamed from: v */
    private boolean f1319v = false;

    /* renamed from: w */
    private boolean f1320w = false;

    /* renamed from: x */
    private boolean f1321x = false;

    /* renamed from: y */
    private int f1322y = 16;

    /* renamed from: D */
    private boolean f1296D = false;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes.dex */
    class a implements AbstractC1011b.b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1011b.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            C0262i c0262i = C0262i.this;
            c0262i.f1311n.m1308J(c0262i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0262i(C0260g c0260g, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1311n = c0260g;
        this.f1298a = i11;
        this.f1299b = i10;
        this.f1300c = i12;
        this.f1301d = i13;
        this.f1302e = charSequence;
        this.f1323z = i14;
    }

    /* renamed from: d */
    private static void m1351d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1352e(Drawable drawable) {
        if (drawable != null && this.f1321x && (this.f1319v || this.f1320w)) {
            drawable = C0888a.m4545i(drawable).mutate();
            if (this.f1319v) {
                C0888a.m4543g(drawable, this.f1317t);
            }
            if (this.f1320w) {
                C0888a.m4544h(drawable, this.f1318u);
            }
            this.f1321x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m1353A() {
        return this.f1311n.mo1306H() && m1357g() != 0;
    }

    /* renamed from: B */
    public boolean m1354B() {
        return (this.f1323z & 4) == 4;
    }

    @Override // p321r0.InterfaceMenuItemC10576b
    /* renamed from: a */
    public AbstractC1011b mo1236a() {
        return this.f1294B;
    }

    @Override // p321r0.InterfaceMenuItemC10576b
    /* renamed from: b */
    public InterfaceMenuItemC10576b mo1237b(AbstractC1011b abstractC1011b) {
        AbstractC1011b abstractC1011b2 = this.f1294B;
        if (abstractC1011b2 != null) {
            abstractC1011b2.m4940h();
        }
        this.f1293A = null;
        this.f1294B = abstractC1011b;
        this.f1311n.m1309K(true);
        AbstractC1011b abstractC1011b3 = this.f1294B;
        if (abstractC1011b3 != null) {
            abstractC1011b3.mo1385j(new a());
        }
        return this;
    }

    /* renamed from: c */
    public void m1355c() {
        this.f1311n.m1307I(this);
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1323z & 8) == 0) {
            return false;
        }
        if (this.f1293A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1295C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1311n.mo1332f(this);
        }
        return false;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m1360j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1295C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1311n.mo1334k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m1356f() {
        return this.f1301d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public char m1357g() {
        return this.f1311n.mo1305G() ? this.f1307j : this.f1305h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1293A;
        if (view != null) {
            return view;
        }
        AbstractC1011b abstractC1011b = this.f1294B;
        if (abstractC1011b == null) {
            return null;
        }
        View mo1383d = abstractC1011b.mo1383d(this);
        this.f1293A = mo1383d;
        return mo1383d;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1308k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1307j;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1315r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1299b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1309l;
        if (drawable != null) {
            return m1352e(drawable);
        }
        if (this.f1310m == 0) {
            return null;
        }
        Drawable m23112b = C7605a.m23112b(this.f1311n.m1343u(), this.f1310m);
        this.f1310m = 0;
        this.f1309l = m23112b;
        return m1352e(m23112b);
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1317t;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1318u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1304g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1298a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1297E;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1306i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1305h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1300c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1312o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1302e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1303f;
        return charSequence != null ? charSequence : this.f1302e;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1316s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m1358h() {
        int i10;
        char m1357g = m1357g();
        if (m1357g == 0) {
            return "";
        }
        Resources resources = this.f1311n.m1343u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1311n.m1343u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C7384h.f16865k));
        }
        int i11 = this.f1311n.mo1305G() ? this.f1308k : this.f1306i;
        m1351d(sb2, i11, 65536, resources.getString(C7384h.f16861g));
        m1351d(sb2, i11, RecognitionOptions.AZTEC, resources.getString(C7384h.f16857c));
        m1351d(sb2, i11, 2, resources.getString(C7384h.f16856b));
        m1351d(sb2, i11, 1, resources.getString(C7384h.f16862h));
        m1351d(sb2, i11, 4, resources.getString(C7384h.f16864j));
        m1351d(sb2, i11, 8, resources.getString(C7384h.f16860f));
        if (m1357g == '\b') {
            i10 = C7384h.f16858d;
        } else if (m1357g == '\n') {
            i10 = C7384h.f16859e;
        } else {
            if (m1357g != ' ') {
                sb2.append(m1357g);
                return sb2.toString();
            }
            i10 = C7384h.f16863i;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1312o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence m1359i(InterfaceC0267n.a aVar) {
        return (aVar == null || !aVar.mo1222d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1296D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1322y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1322y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1322y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1011b abstractC1011b = this.f1294B;
        return (abstractC1011b == null || !abstractC1011b.mo1384g()) ? (this.f1322y & 8) == 0 : (this.f1322y & 8) == 0 && this.f1294B.mo1382b();
    }

    /* renamed from: j */
    public boolean m1360j() {
        AbstractC1011b abstractC1011b;
        if ((this.f1323z & 8) == 0) {
            return false;
        }
        if (this.f1293A == null && (abstractC1011b = this.f1294B) != null) {
            this.f1293A = abstractC1011b.mo1383d(this);
        }
        return this.f1293A != null;
    }

    /* renamed from: k */
    public boolean m1361k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1314q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0260g c0260g = this.f1311n;
        if (c0260g.mo1333h(c0260g, this)) {
            return true;
        }
        Runnable runnable = this.f1313p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1304g != null) {
            try {
                this.f1311n.m1343u().startActivity(this.f1304g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC1011b abstractC1011b = this.f1294B;
        return abstractC1011b != null && abstractC1011b.mo1380e();
    }

    /* renamed from: l */
    public boolean m1362l() {
        return (this.f1322y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m1363m() {
        return (this.f1322y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m1364n() {
        return (this.f1323z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m1365o() {
        return (this.f1323z & 2) == 2;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10576b setActionView(int i10) {
        Context m1343u = this.f1311n.m1343u();
        setActionView(LayoutInflater.from(m1343u).inflate(i10, (ViewGroup) new LinearLayout(m1343u), false));
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10576b setActionView(View view) {
        int i10;
        this.f1293A = view;
        this.f1294B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1298a) > 0) {
            view.setId(i10);
        }
        this.f1311n.m1307I(this);
        return this;
    }

    /* renamed from: r */
    public void m1368r(boolean z10) {
        this.f1296D = z10;
        this.f1311n.m1309K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1369s(boolean z10) {
        int i10 = this.f1322y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1322y = i11;
        if (i10 != i11) {
            this.f1311n.m1309K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1307j == c10) {
            return this;
        }
        this.f1307j = Character.toLowerCase(c10);
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1307j == c10 && this.f1308k == i10) {
            return this;
        }
        this.f1307j = Character.toLowerCase(c10);
        this.f1308k = KeyEvent.normalizeMetaState(i10);
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1322y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1322y = i11;
        if (i10 != i11) {
            this.f1311n.m1309K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1322y & 4) != 0) {
            this.f1311n.m1317T(this);
        } else {
            m1369s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC10576b setContentDescription(CharSequence charSequence) {
        this.f1315r = charSequence;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1322y = z10 ? this.f1322y | 16 : this.f1322y & (-17);
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1309l = null;
        this.f1310m = i10;
        this.f1321x = true;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1310m = 0;
        this.f1309l = drawable;
        this.f1321x = true;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1317t = colorStateList;
        this.f1319v = true;
        this.f1321x = true;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1318u = mode;
        this.f1320w = true;
        this.f1321x = true;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1304g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1305h == c10) {
            return this;
        }
        this.f1305h = c10;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1305h == c10 && this.f1306i == i10) {
            return this;
        }
        this.f1305h = c10;
        this.f1306i = KeyEvent.normalizeMetaState(i10);
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1295C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1314q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1305h = c10;
        this.f1307j = Character.toLowerCase(c11);
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1305h = c10;
        this.f1306i = KeyEvent.normalizeMetaState(i10);
        this.f1307j = Character.toLowerCase(c11);
        this.f1308k = KeyEvent.normalizeMetaState(i11);
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1323z = i10;
        this.f1311n.m1307I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1311n.m1343u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1302e = charSequence;
        this.f1311n.m1309K(false);
        SubMenuC0271r subMenuC0271r = this.f1312o;
        if (subMenuC0271r != null) {
            subMenuC0271r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1303f = charSequence;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC10576b setTooltipText(CharSequence charSequence) {
        this.f1316s = charSequence;
        this.f1311n.m1309K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m1375y(z10)) {
            this.f1311n.m1308J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m1370t(boolean z10) {
        this.f1322y = (z10 ? 4 : 0) | (this.f1322y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1302e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m1371u(boolean z10) {
        this.f1322y = z10 ? this.f1322y | 32 : this.f1322y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m1372v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1297E = contextMenuInfo;
    }

    @Override // p321r0.InterfaceMenuItemC10576b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10576b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    /* renamed from: x */
    public void m1374x(SubMenuC0271r subMenuC0271r) {
        this.f1312o = subMenuC0271r;
        subMenuC0271r.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m1375y(boolean z10) {
        int i10 = this.f1322y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1322y = i11;
        return i10 != i11;
    }

    /* renamed from: z */
    public boolean m1376z() {
        return this.f1311n.m1300A();
    }
}
