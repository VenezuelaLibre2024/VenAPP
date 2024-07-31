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
import androidx.core.content.C0854a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p321r0.InterfaceMenuC10575a;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0260g implements InterfaceMenuC10575a {

    /* renamed from: A */
    private static final int[] f1262A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1263a;

    /* renamed from: b */
    private final Resources f1264b;

    /* renamed from: c */
    private boolean f1265c;

    /* renamed from: d */
    private boolean f1266d;

    /* renamed from: e */
    private a f1267e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1275m;

    /* renamed from: n */
    CharSequence f1276n;

    /* renamed from: o */
    Drawable f1277o;

    /* renamed from: p */
    View f1278p;

    /* renamed from: x */
    private C0262i f1286x;

    /* renamed from: z */
    private boolean f1288z;

    /* renamed from: l */
    private int f1274l = 0;

    /* renamed from: q */
    private boolean f1279q = false;

    /* renamed from: r */
    private boolean f1280r = false;

    /* renamed from: s */
    private boolean f1281s = false;

    /* renamed from: t */
    private boolean f1282t = false;

    /* renamed from: u */
    private boolean f1283u = false;

    /* renamed from: v */
    private ArrayList<C0262i> f1284v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0266m>> f1285w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f1287y = false;

    /* renamed from: f */
    private ArrayList<C0262i> f1268f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0262i> f1269g = new ArrayList<>();

    /* renamed from: h */
    private boolean f1270h = true;

    /* renamed from: i */
    private ArrayList<C0262i> f1271i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0262i> f1272j = new ArrayList<>();

    /* renamed from: k */
    private boolean f1273k = true;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo1012a(C0260g c0260g, MenuItem menuItem);

        /* renamed from: b */
        void mo1014b(C0260g c0260g);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: b */
        boolean mo1228b(C0262i c0262i);
    }

    public C0260g(Context context) {
        this.f1263a = context;
        this.f1264b = context.getResources();
        m1295c0(true);
    }

    /* renamed from: B */
    private static int m1292B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f1262A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m1293N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f1268f.size()) {
            return;
        }
        this.f1268f.remove(i10);
        if (z10) {
            m1309K(true);
        }
    }

    /* renamed from: W */
    private void m1294W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources m1301C = m1301C();
        if (view != null) {
            this.f1278p = view;
            this.f1276n = null;
            this.f1277o = null;
        } else {
            if (i10 > 0) {
                this.f1276n = m1301C.getText(i10);
            } else if (charSequence != null) {
                this.f1276n = charSequence;
            }
            if (i11 > 0) {
                this.f1277o = C0854a.getDrawable(m1343u(), i11);
            } else if (drawable != null) {
                this.f1277o = drawable;
            }
            this.f1278p = null;
        }
        m1309K(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.C1044h2.m4994e(android.view.ViewConfiguration.get(r2.f1263a), r2.f1263a) != false) goto L9;
     */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1295c0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1264b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1263a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1263a
            boolean r3 = androidx.core.view.C1044h2.m4994e(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1266d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0260g.m1295c0(boolean):void");
    }

    /* renamed from: g */
    private C0262i m1296g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new C0262i(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* renamed from: i */
    private void m1297i(boolean z10) {
        if (this.f1285w.isEmpty()) {
            return;
        }
        m1331e0();
        Iterator<WeakReference<InterfaceC0266m>> it = this.f1285w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0266m> next = it.next();
            InterfaceC0266m interfaceC0266m = next.get();
            if (interfaceC0266m == null) {
                this.f1285w.remove(next);
            } else {
                interfaceC0266m.mo1246f(z10);
            }
        }
        m1329d0();
    }

    /* renamed from: j */
    private boolean m1298j(SubMenuC0271r subMenuC0271r, InterfaceC0266m interfaceC0266m) {
        if (this.f1285w.isEmpty()) {
            return false;
        }
        boolean mo1245e = interfaceC0266m != null ? interfaceC0266m.mo1245e(subMenuC0271r) : false;
        Iterator<WeakReference<InterfaceC0266m>> it = this.f1285w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0266m> next = it.next();
            InterfaceC0266m interfaceC0266m2 = next.get();
            if (interfaceC0266m2 == null) {
                this.f1285w.remove(next);
            } else if (!mo1245e) {
                mo1245e = interfaceC0266m2.mo1245e(subMenuC0271r);
            }
        }
        return mo1245e;
    }

    /* renamed from: n */
    private static int m1299n(ArrayList<C0262i> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m1356f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m1300A() {
        return this.f1282t;
    }

    /* renamed from: C */
    Resources m1301C() {
        return this.f1264b;
    }

    /* renamed from: D */
    public C0260g mo1302D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0262i> m1303E() {
        if (!this.f1270h) {
            return this.f1269g;
        }
        this.f1269g.clear();
        int size = this.f1268f.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0262i c0262i = this.f1268f.get(i10);
            if (c0262i.isVisible()) {
                this.f1269g.add(c0262i);
            }
        }
        this.f1270h = false;
        this.f1273k = true;
        return this.f1269g;
    }

    /* renamed from: F */
    public boolean mo1304F() {
        return this.f1287y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo1305G() {
        return this.f1265c;
    }

    /* renamed from: H */
    public boolean mo1306H() {
        return this.f1266d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m1307I(C0262i c0262i) {
        this.f1273k = true;
        m1309K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m1308J(C0262i c0262i) {
        this.f1270h = true;
        m1309K(true);
    }

    /* renamed from: K */
    public void m1309K(boolean z10) {
        if (this.f1279q) {
            this.f1280r = true;
            if (z10) {
                this.f1281s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f1270h = true;
            this.f1273k = true;
        }
        m1297i(z10);
    }

    /* renamed from: L */
    public boolean m1310L(MenuItem menuItem, int i10) {
        return m1311M(menuItem, null, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        m1330e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if ((r9 & 1) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r1 == false) goto L17;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m1311M(android.view.MenuItem r7, androidx.appcompat.view.menu.InterfaceC0266m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0262i) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.m1361k()
            androidx.core.view.b r2 = r7.mo1236a()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.mo1378a()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.m1360j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.m1330e(r3)
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
            r6.m1330e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.m1343u()
            r9.<init>(r0, r6, r7)
            r7.m1374x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.SubMenuC0271r) r7
            if (r4 == 0) goto L63
            r2.mo1381f(r7)
        L63:
            boolean r7 = r6.m1298j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0260g.m1311M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: O */
    public void m1312O(InterfaceC0266m interfaceC0266m) {
        Iterator<WeakReference<InterfaceC0266m>> it = this.f1285w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0266m> next = it.next();
            InterfaceC0266m interfaceC0266m2 = next.get();
            if (interfaceC0266m2 == null || interfaceC0266m2 == interfaceC0266m) {
                this.f1285w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m1313P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1342t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0271r) item.getSubMenu()).m1313P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: Q */
    public void m1314Q(Bundle bundle) {
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
                ((SubMenuC0271r) item.getSubMenu()).m1314Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1342t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo1315R(a aVar) {
        this.f1267e = aVar;
    }

    /* renamed from: S */
    public C0260g m1316S(int i10) {
        this.f1274l = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m1317T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1268f.size();
        m1331e0();
        for (int i10 = 0; i10 < size; i10++) {
            C0262i c0262i = this.f1268f.get(i10);
            if (c0262i.getGroupId() == groupId && c0262i.m1363m() && c0262i.isCheckable()) {
                c0262i.m1369s(c0262i == menuItem);
            }
        }
        m1329d0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public C0260g m1318U(int i10) {
        m1294W(0, null, i10, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public C0260g m1319V(Drawable drawable) {
        m1294W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public C0260g m1320X(int i10) {
        m1294W(i10, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C0260g m1321Y(CharSequence charSequence) {
        m1294W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C0260g m1322Z(View view) {
        m1294W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected MenuItem m1323a(int i10, int i11, int i12, CharSequence charSequence) {
        int m1292B = m1292B(i12);
        C0262i m1296g = m1296g(i10, i11, i12, m1292B, charSequence, this.f1274l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1275m;
        if (contextMenuInfo != null) {
            m1296g.m1372v(contextMenuInfo);
        }
        ArrayList<C0262i> arrayList = this.f1268f;
        arrayList.add(m1299n(arrayList, m1292B), m1296g);
        m1309K(true);
        return m1296g;
    }

    /* renamed from: a0 */
    public void m1324a0(boolean z10) {
        this.f1282t = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m1323a(0, 0, 0, this.f1264b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m1323a(i10, i11, i12, this.f1264b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m1323a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m1323a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1263a.getPackageManager();
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
        return addSubMenu(0, 0, 0, this.f1264b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1264b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C0262i c0262i = (C0262i) m1323a(i10, i11, i12, charSequence);
        SubMenuC0271r subMenuC0271r = new SubMenuC0271r(this.f1263a, this, c0262i);
        c0262i.m1374x(subMenuC0271r);
        return subMenuC0271r;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m1325b(InterfaceC0266m interfaceC0266m) {
        m1327c(interfaceC0266m, this.f1263a);
    }

    /* renamed from: b0 */
    public void m1326b0(boolean z10) {
        this.f1288z = z10;
    }

    /* renamed from: c */
    public void m1327c(InterfaceC0266m interfaceC0266m, Context context) {
        this.f1285w.add(new WeakReference<>(interfaceC0266m));
        interfaceC0266m.mo1248i(context, this);
        this.f1273k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        C0262i c0262i = this.f1286x;
        if (c0262i != null) {
            mo1332f(c0262i);
        }
        this.f1268f.clear();
        m1309K(true);
    }

    public void clearHeader() {
        this.f1277o = null;
        this.f1276n = null;
        this.f1278p = null;
        m1309K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m1330e(true);
    }

    /* renamed from: d */
    public void m1328d() {
        a aVar = this.f1267e;
        if (aVar != null) {
            aVar.mo1014b(this);
        }
    }

    /* renamed from: d0 */
    public void m1329d0() {
        this.f1279q = false;
        if (this.f1280r) {
            this.f1280r = false;
            m1309K(this.f1281s);
        }
    }

    /* renamed from: e */
    public final void m1330e(boolean z10) {
        if (this.f1283u) {
            return;
        }
        this.f1283u = true;
        Iterator<WeakReference<InterfaceC0266m>> it = this.f1285w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0266m> next = it.next();
            InterfaceC0266m interfaceC0266m = next.get();
            if (interfaceC0266m == null) {
                this.f1285w.remove(next);
            } else {
                interfaceC0266m.mo1242b(this, z10);
            }
        }
        this.f1283u = false;
    }

    /* renamed from: e0 */
    public void m1331e0() {
        if (this.f1279q) {
            return;
        }
        this.f1279q = true;
        this.f1280r = false;
        this.f1281s = false;
    }

    /* renamed from: f */
    public boolean mo1332f(C0262i c0262i) {
        boolean z10 = false;
        if (!this.f1285w.isEmpty() && this.f1286x == c0262i) {
            m1331e0();
            Iterator<WeakReference<InterfaceC0266m>> it = this.f1285w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0266m> next = it.next();
                InterfaceC0266m interfaceC0266m = next.get();
                if (interfaceC0266m == null) {
                    this.f1285w.remove(next);
                } else {
                    z10 = interfaceC0266m.mo1247h(this, c0262i);
                    if (z10) {
                        break;
                    }
                }
            }
            m1329d0();
            if (z10) {
                this.f1286x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            C0262i c0262i = this.f1268f.get(i11);
            if (c0262i.getItemId() == i10) {
                return c0262i;
            }
            if (c0262i.hasSubMenu() && (findItem = c0262i.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f1268f.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1333h(C0260g c0260g, MenuItem menuItem) {
        a aVar = this.f1267e;
        return aVar != null && aVar.mo1012a(c0260g, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1288z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f1268f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m1338p(i10, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo1334k(C0262i c0262i) {
        boolean z10 = false;
        if (this.f1285w.isEmpty()) {
            return false;
        }
        m1331e0();
        Iterator<WeakReference<InterfaceC0266m>> it = this.f1285w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0266m> next = it.next();
            InterfaceC0266m interfaceC0266m = next.get();
            if (interfaceC0266m == null) {
                this.f1285w.remove(next);
            } else {
                z10 = interfaceC0266m.mo1243c(this, c0262i);
                if (z10) {
                    break;
                }
            }
        }
        m1329d0();
        if (z10) {
            this.f1286x = c0262i;
        }
        return z10;
    }

    /* renamed from: l */
    public int m1335l(int i10) {
        return m1336m(i10, 0);
    }

    /* renamed from: m */
    public int m1336m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f1268f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m1337o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1268f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: p */
    C0262i m1338p(int i10, KeyEvent keyEvent) {
        ArrayList<C0262i> arrayList = this.f1284v;
        arrayList.clear();
        m1339q(arrayList, i10, keyEvent);
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
        boolean mo1305G = mo1305G();
        for (int i11 = 0; i11 < size; i11++) {
            C0262i c0262i = arrayList.get(i11);
            char alphabeticShortcut = mo1305G ? c0262i.getAlphabeticShortcut() : c0262i.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (mo1305G && alphabeticShortcut == '\b' && i10 == 67))) {
                return c0262i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return m1310L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        C0262i m1338p = m1338p(i10, keyEvent);
        boolean m1310L = m1338p != null ? m1310L(m1338p, i11) : false;
        if ((i11 & 2) != 0) {
            m1330e(true);
        }
        return m1310L;
    }

    /* renamed from: q */
    void m1339q(List<C0262i> list, int i10, KeyEvent keyEvent) {
        boolean mo1305G = mo1305G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1268f.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0262i c0262i = this.f1268f.get(i11);
                if (c0262i.hasSubMenu()) {
                    ((C0260g) c0262i.getSubMenu()).m1339q(list, i10, keyEvent);
                }
                char alphabeticShortcut = mo1305G ? c0262i.getAlphabeticShortcut() : c0262i.getNumericShortcut();
                if (((modifiers & 69647) == ((mo1305G ? c0262i.getAlphabeticModifiers() : c0262i.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo1305G && alphabeticShortcut == '\b' && i10 == 67)) && c0262i.isEnabled()) {
                        list.add(c0262i);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void m1340r() {
        ArrayList<C0262i> m1303E = m1303E();
        if (this.f1273k) {
            Iterator<WeakReference<InterfaceC0266m>> it = this.f1285w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0266m> next = it.next();
                InterfaceC0266m interfaceC0266m = next.get();
                if (interfaceC0266m == null) {
                    this.f1285w.remove(next);
                } else {
                    z10 |= interfaceC0266m.mo1270g();
                }
            }
            if (z10) {
                this.f1271i.clear();
                this.f1272j.clear();
                int size = m1303E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0262i c0262i = m1303E.get(i10);
                    (c0262i.m1362l() ? this.f1271i : this.f1272j).add(c0262i);
                }
            } else {
                this.f1271i.clear();
                this.f1272j.clear();
                this.f1272j.addAll(m1303E());
            }
            this.f1273k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int m1335l = m1335l(i10);
        if (m1335l >= 0) {
            int size = this.f1268f.size() - m1335l;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f1268f.get(m1335l).getGroupId() != i10) {
                    break;
                }
                m1293N(m1335l, false);
                i11 = i12;
            }
            m1309K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m1293N(m1337o(i10), true);
    }

    /* renamed from: s */
    public ArrayList<C0262i> m1341s() {
        m1340r();
        return this.f1271i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1268f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0262i c0262i = this.f1268f.get(i11);
            if (c0262i.getGroupId() == i10) {
                c0262i.m1370t(z11);
                c0262i.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1287y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1268f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0262i c0262i = this.f1268f.get(i11);
            if (c0262i.getGroupId() == i10) {
                c0262i.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1268f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C0262i c0262i = this.f1268f.get(i11);
            if (c0262i.getGroupId() == i10 && c0262i.m1375y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            m1309K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1265c = z10;
        m1309K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1268f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public String mo1342t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m1343u() {
        return this.f1263a;
    }

    /* renamed from: v */
    public C0262i m1344v() {
        return this.f1286x;
    }

    /* renamed from: w */
    public Drawable m1345w() {
        return this.f1277o;
    }

    /* renamed from: x */
    public CharSequence m1346x() {
        return this.f1276n;
    }

    /* renamed from: y */
    public View m1347y() {
        return this.f1278p;
    }

    /* renamed from: z */
    public ArrayList<C0262i> m1348z() {
        m1340r();
        return this.f1272j;
    }
}
