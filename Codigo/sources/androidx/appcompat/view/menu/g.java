package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class g implements r0.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1107a;

    /* renamed from: b */
    private final Resources f1108b;

    /* renamed from: c */
    private boolean f1109c;

    /* renamed from: d */
    private boolean f1110d;

    /* renamed from: e */
    private a f1111e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1119m;

    /* renamed from: n */
    CharSequence f1120n;

    /* renamed from: o */
    Drawable f1121o;

    /* renamed from: p */
    View f1122p;

    /* renamed from: x */
    private i f1130x;

    /* renamed from: z */
    private boolean f1132z;

    /* renamed from: l */
    private int f1118l = 0;

    /* renamed from: q */
    private boolean f1123q = false;

    /* renamed from: r */
    private boolean f1124r = false;

    /* renamed from: s */
    private boolean f1125s = false;

    /* renamed from: t */
    private boolean f1126t = false;

    /* renamed from: u */
    private boolean f1127u = false;

    /* renamed from: v */
    private ArrayList<i> f1128v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<m>> f1129w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f1131y = false;

    /* renamed from: f */
    private ArrayList<i> f1112f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<i> f1113g = new ArrayList<>();

    /* renamed from: h */
    private boolean f1114h = true;

    /* renamed from: i */
    private ArrayList<i> f1115i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<i> f1116j = new ArrayList<>();

    /* renamed from: k */
    private boolean f1117k = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean b(i iVar);
    }

    public g(Context context) {
        this.f1107a = context;
        this.f1108b = context.getResources();
        c0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f1112f.size()) {
            return;
        }
        this.f1112f.remove(i10);
        if (z10) {
            K(true);
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f1122p = view;
            this.f1120n = null;
            this.f1121o = null;
        } else {
            if (i10 > 0) {
                this.f1120n = C.getText(i10);
            } else if (charSequence != null) {
                this.f1120n = charSequence;
            }
            if (i11 > 0) {
                this.f1121o = androidx.core.content.a.getDrawable(u(), i11);
            } else if (drawable != null) {
                this.f1121o = drawable;
            }
            this.f1122p = null;
        }
        K(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.h2.e(android.view.ViewConfiguration.get(r2.f1107a), r2.f1107a) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1108b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1107a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1107a
            boolean r3 = androidx.core.view.h2.e(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1110d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.c0(boolean):void");
    }

    private i g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new i(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f1129w.isEmpty()) {
            return;
        }
        e0();
        Iterator<WeakReference<m>> it = this.f1129w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.f1129w.remove(next);
            } else {
                mVar.f(z10);
            }
        }
        d0();
    }

    private boolean j(r rVar, m mVar) {
        if (this.f1129w.isEmpty()) {
            return false;
        }
        boolean e10 = mVar != null ? mVar.e(rVar) : false;
        Iterator<WeakReference<m>> it = this.f1129w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null) {
                this.f1129w.remove(next);
            } else if (!e10) {
                e10 = mVar2.e(rVar);
            }
        }
        return e10;
    }

    private static int n(ArrayList<i> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f1126t;
    }

    Resources C() {
        return this.f1108b;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.f1114h) {
            return this.f1113g;
        }
        this.f1113g.clear();
        int size = this.f1112f.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.f1112f.get(i10);
            if (iVar.isVisible()) {
                this.f1113g.add(iVar);
            }
        }
        this.f1114h = false;
        this.f1117k = true;
        return this.f1113g;
    }

    public boolean F() {
        return this.f1131y;
    }

    public boolean G() {
        return this.f1109c;
    }

    public boolean H() {
        return this.f1110d;
    }

    public void I(i iVar) {
        this.f1117k = true;
        K(true);
    }

    public void J(i iVar) {
        this.f1114h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (this.f1123q) {
            this.f1124r = true;
            if (z10) {
                this.f1125s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f1114h = true;
            this.f1117k = true;
        }
        i(z10);
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, null, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if ((r9 & 1) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r1 == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.i) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            androidx.core.view.b r2 = r7.a()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.r) r7
            if (r4 == 0) goto L63
            r2.f(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    public void O(m mVar) {
        Iterator<WeakReference<m>> it = this.f1129w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f1129w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f1111e = aVar;
    }

    public g S(int i10) {
        this.f1118l = i10;
        return this;
    }

    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1112f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.f1112f.get(i10);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        d0();
    }

    public g U(int i10) {
        W(0, null, i10, null, null);
        return this;
    }

    public g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    public g X(int i10) {
        W(i10, null, 0, null, null);
        return this;
    }

    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    public g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        i g10 = g(i10, i11, i12, B, charSequence, this.f1118l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1119m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f1112f;
        arrayList.add(n(arrayList, B), g10);
        K(true);
        return g10;
    }

    public void a0(boolean z10) {
        this.f1126t = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f1108b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f1108b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1107a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f1108b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1108b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        i iVar = (i) a(i10, i11, i12, charSequence);
        r rVar = new r(this.f1107a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f1107a);
    }

    public void b0(boolean z10) {
        this.f1132z = z10;
    }

    public void c(m mVar, Context context) {
        this.f1129w.add(new WeakReference<>(mVar));
        mVar.i(context, this);
        this.f1117k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.f1130x;
        if (iVar != null) {
            f(iVar);
        }
        this.f1112f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f1121o = null;
        this.f1120n = null;
        this.f1122p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1111e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f1123q = false;
        if (this.f1124r) {
            this.f1124r = false;
            K(this.f1125s);
        }
    }

    public final void e(boolean z10) {
        if (this.f1127u) {
            return;
        }
        this.f1127u = true;
        Iterator<WeakReference<m>> it = this.f1129w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.f1129w.remove(next);
            } else {
                mVar.b(this, z10);
            }
        }
        this.f1127u = false;
    }

    public void e0() {
        if (this.f1123q) {
            return;
        }
        this.f1123q = true;
        this.f1124r = false;
        this.f1125s = false;
    }

    public boolean f(i iVar) {
        boolean z10 = false;
        if (!this.f1129w.isEmpty() && this.f1130x == iVar) {
            e0();
            Iterator<WeakReference<m>> it = this.f1129w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.f1129w.remove(next);
                } else {
                    z10 = mVar.h(this, iVar);
                    if (z10) {
                        break;
                    }
                }
            }
            d0();
            if (z10) {
                this.f1130x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1112f.get(i11);
            if (iVar.getItemId() == i10) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f1112f.get(i10);
    }

    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f1111e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1132z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f1112f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean z10 = false;
        if (this.f1129w.isEmpty()) {
            return false;
        }
        e0();
        Iterator<WeakReference<m>> it = this.f1129w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.f1129w.remove(next);
            } else {
                z10 = mVar.c(this, iVar);
                if (z10) {
                    break;
                }
            }
        }
        d0();
        if (z10) {
            this.f1130x = iVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f1112f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1112f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    i p(int i10, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.f1128v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = arrayList.get(i11);
            char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == '\b' && i10 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        i p10 = p(i10, keyEvent);
        boolean L = p10 != null ? L(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List<i> list, int i10, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1112f.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = this.f1112f.get(i11);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i10 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> E = E();
        if (this.f1117k) {
            Iterator<WeakReference<m>> it = this.f1129w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.f1129w.remove(next);
                } else {
                    z10 |= mVar.g();
                }
            }
            if (z10) {
                this.f1115i.clear();
                this.f1116j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = E.get(i10);
                    (iVar.l() ? this.f1115i : this.f1116j).add(iVar);
                }
            } else {
                this.f1115i.clear();
                this.f1116j.clear();
                this.f1116j.addAll(E());
            }
            this.f1117k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f1112f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f1112f.get(l10).getGroupId() != i10) {
                    break;
                }
                N(l10, false);
                i11 = i12;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<i> s() {
        r();
        return this.f1115i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1112f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1112f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.t(z11);
                iVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1131y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1112f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1112f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1112f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1112f.get(i11);
            if (iVar.getGroupId() == i10 && iVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1109c = z10;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1112f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f1107a;
    }

    public i v() {
        return this.f1130x;
    }

    public Drawable w() {
        return this.f1121o;
    }

    public CharSequence x() {
        return this.f1120n;
    }

    public View y() {
        return this.f1122p;
    }

    public ArrayList<i> z() {
        r();
        return this.f1116j;
    }
}
