package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.widget.C0387y0;
import androidx.appcompat.widget.InterfaceC0384x0;
import androidx.core.view.C1091r;
import androidx.core.view.C1116x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p111g.C7380d;
import p111g.C7383g;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
final class ViewOnKeyListenerC0257d extends AbstractC0264k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: M */
    private static final int f1208M = C7383g.f16839e;

    /* renamed from: A */
    View f1209A;

    /* renamed from: C */
    private boolean f1211C;

    /* renamed from: D */
    private boolean f1212D;

    /* renamed from: E */
    private int f1213E;

    /* renamed from: F */
    private int f1214F;

    /* renamed from: H */
    private boolean f1216H;

    /* renamed from: I */
    private InterfaceC0266m.a f1217I;

    /* renamed from: J */
    ViewTreeObserver f1218J;

    /* renamed from: K */
    private PopupWindow.OnDismissListener f1219K;

    /* renamed from: L */
    boolean f1220L;

    /* renamed from: b */
    private final Context f1221b;

    /* renamed from: c */
    private final int f1222c;

    /* renamed from: d */
    private final int f1223d;

    /* renamed from: e */
    private final int f1224e;

    /* renamed from: f */
    private final boolean f1225f;

    /* renamed from: r */
    final Handler f1226r;

    /* renamed from: z */
    private View f1234z;

    /* renamed from: s */
    private final List<C0260g> f1227s = new ArrayList();

    /* renamed from: t */
    final List<d> f1228t = new ArrayList();

    /* renamed from: u */
    final ViewTreeObserver.OnGlobalLayoutListener f1229u = new a();

    /* renamed from: v */
    private final View.OnAttachStateChangeListener f1230v = new b();

    /* renamed from: w */
    private final InterfaceC0384x0 f1231w = new c();

    /* renamed from: x */
    private int f1232x = 0;

    /* renamed from: y */
    private int f1233y = 0;

    /* renamed from: G */
    private boolean f1215G = false;

    /* renamed from: B */
    private int f1210B = m1264C();

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0257d.this.mo1269a() || ViewOnKeyListenerC0257d.this.f1228t.size() <= 0 || ViewOnKeyListenerC0257d.this.f1228t.get(0).f1242a.m2010w()) {
                return;
            }
            View view = ViewOnKeyListenerC0257d.this.f1209A;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0257d.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0257d.this.f1228t.iterator();
            while (it.hasNext()) {
                it.next().f1242a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0257d.this.f1218J;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0257d.this.f1218J = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0257d viewOnKeyListenerC0257d = ViewOnKeyListenerC0257d.this;
                viewOnKeyListenerC0257d.f1218J.removeGlobalOnLayoutListener(viewOnKeyListenerC0257d.f1229u);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC0384x0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ d f1238a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f1239b;

            /* renamed from: c */
            final /* synthetic */ C0260g f1240c;

            a(d dVar, MenuItem menuItem, C0260g c0260g) {
                this.f1238a = dVar;
                this.f1239b = menuItem;
                this.f1240c = c0260g;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1238a;
                if (dVar != null) {
                    ViewOnKeyListenerC0257d.this.f1220L = true;
                    dVar.f1243b.m1330e(false);
                    ViewOnKeyListenerC0257d.this.f1220L = false;
                }
                if (this.f1239b.isEnabled() && this.f1239b.hasSubMenu()) {
                    this.f1240c.m1310L(this.f1239b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0384x0
        /* renamed from: b */
        public void mo1281b(C0260g c0260g, MenuItem menuItem) {
            ViewOnKeyListenerC0257d.this.f1226r.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0257d.this.f1228t.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (c0260g == ViewOnKeyListenerC0257d.this.f1228t.get(i10).f1243b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            ViewOnKeyListenerC0257d.this.f1226r.postAtTime(new a(i11 < ViewOnKeyListenerC0257d.this.f1228t.size() ? ViewOnKeyListenerC0257d.this.f1228t.get(i11) : null, menuItem, c0260g), c0260g, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0384x0
        /* renamed from: c */
        public void mo1282c(C0260g c0260g, MenuItem menuItem) {
            ViewOnKeyListenerC0257d.this.f1226r.removeCallbacksAndMessages(c0260g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final C0387y0 f1242a;

        /* renamed from: b */
        public final C0260g f1243b;

        /* renamed from: c */
        public final int f1244c;

        public d(C0387y0 c0387y0, C0260g c0260g, int i10) {
            this.f1242a = c0387y0;
            this.f1243b = c0260g;
            this.f1244c = i10;
        }

        /* renamed from: a */
        public ListView m1283a() {
            return this.f1242a.mo1276r();
        }
    }

    public ViewOnKeyListenerC0257d(Context context, View view, int i10, int i11, boolean z10) {
        this.f1221b = context;
        this.f1234z = view;
        this.f1223d = i10;
        this.f1224e = i11;
        this.f1225f = z10;
        Resources resources = context.getResources();
        this.f1222c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7380d.f16736d));
        this.f1226r = new Handler();
    }

    /* renamed from: A */
    private MenuItem m1262A(C0260g c0260g, C0260g c0260g2) {
        int size = c0260g.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0260g.getItem(i10);
            if (item.hasSubMenu() && c0260g2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: B */
    private View m1263B(d dVar, C0260g c0260g) {
        C0259f c0259f;
        int i10;
        int firstVisiblePosition;
        MenuItem m1262A = m1262A(dVar.f1243b, c0260g);
        if (m1262A == null) {
            return null;
        }
        ListView m1283a = dVar.m1283a();
        ListAdapter adapter = m1283a.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            c0259f = (C0259f) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0259f = (C0259f) adapter;
            i10 = 0;
        }
        int count = c0259f.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (m1262A == c0259f.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - m1283a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m1283a.getChildCount()) {
            return m1283a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: C */
    private int m1264C() {
        return C1116x0.m5296u(this.f1234z) == 1 ? 0 : 1;
    }

    /* renamed from: D */
    private int m1265D(int i10) {
        List<d> list = this.f1228t;
        ListView m1283a = list.get(list.size() - 1).m1283a();
        int[] iArr = new int[2];
        m1283a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1209A.getWindowVisibleDisplayFrame(rect);
        return this.f1210B == 1 ? (iArr[0] + m1283a.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    /* renamed from: E */
    private void m1266E(C0260g c0260g) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1221b);
        C0259f c0259f = new C0259f(c0260g, from, this.f1225f, f1208M);
        if (!mo1269a() && this.f1215G) {
            c0259f.m1291d(true);
        } else if (mo1269a()) {
            c0259f.m1291d(AbstractC0264k.m1388w(c0260g));
        }
        int m1387m = AbstractC0264k.m1387m(c0259f, null, this.f1221b, this.f1222c);
        C0387y0 m1267y = m1267y();
        m1267y.mo2006q(c0259f);
        m1267y.m1987A(m1387m);
        m1267y.m1988B(this.f1233y);
        if (this.f1228t.size() > 0) {
            List<d> list = this.f1228t;
            dVar = list.get(list.size() - 1);
            view = m1263B(dVar, c0260g);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m1267y.m2077P(false);
            m1267y.m2074M(null);
            int m1265D = m1265D(m1387m);
            boolean z10 = m1265D == 1;
            this.f1210B = m1265D;
            if (Build.VERSION.SDK_INT >= 26) {
                m1267y.m2011y(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1234z.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1233y & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1234z.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1233y & 5) == 5) {
                if (!z10) {
                    m1387m = view.getWidth();
                    i12 = i10 - m1387m;
                }
                i12 = i10 + m1387m;
            } else {
                if (z10) {
                    m1387m = view.getWidth();
                    i12 = i10 + m1387m;
                }
                i12 = i10 - m1387m;
            }
            m1267y.m2002i(i12);
            m1267y.m1994H(true);
            m1267y.m2004m(i11);
        } else {
            if (this.f1211C) {
                m1267y.m2002i(this.f1213E);
            }
            if (this.f1212D) {
                m1267y.m2004m(this.f1214F);
            }
            m1267y.m1989C(m1390l());
        }
        this.f1228t.add(new d(m1267y, c0260g, this.f1210B));
        m1267y.show();
        ListView mo1276r = m1267y.mo1276r();
        mo1276r.setOnKeyListener(this);
        if (dVar == null && this.f1216H && c0260g.m1346x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C7383g.f16846l, (ViewGroup) mo1276r, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0260g.m1346x());
            mo1276r.addHeaderView(frameLayout, null, false);
            m1267y.show();
        }
    }

    /* renamed from: y */
    private C0387y0 m1267y() {
        C0387y0 c0387y0 = new C0387y0(this.f1221b, null, this.f1223d, this.f1224e);
        c0387y0.m2076O(this.f1231w);
        c0387y0.m1993G(this);
        c0387y0.m1992F(this);
        c0387y0.m2011y(this.f1234z);
        c0387y0.m1988B(this.f1233y);
        c0387y0.m1991E(true);
        c0387y0.m1990D(2);
        return c0387y0;
    }

    /* renamed from: z */
    private int m1268z(C0260g c0260g) {
        int size = this.f1228t.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (c0260g == this.f1228t.get(i10).f1243b) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    /* renamed from: a */
    public boolean mo1269a() {
        return this.f1228t.size() > 0 && this.f1228t.get(0).f1242a.mo1269a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: b */
    public void mo1242b(C0260g c0260g, boolean z10) {
        int m1268z = m1268z(c0260g);
        if (m1268z < 0) {
            return;
        }
        int i10 = m1268z + 1;
        if (i10 < this.f1228t.size()) {
            this.f1228t.get(i10).f1243b.m1330e(false);
        }
        d remove = this.f1228t.remove(m1268z);
        remove.f1243b.m1312O(this);
        if (this.f1220L) {
            remove.f1242a.m2075N(null);
            remove.f1242a.m2012z(0);
        }
        remove.f1242a.dismiss();
        int size = this.f1228t.size();
        this.f1210B = size > 0 ? this.f1228t.get(size - 1).f1244c : m1264C();
        if (size != 0) {
            if (z10) {
                this.f1228t.get(0).f1243b.m1330e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0266m.a aVar = this.f1217I;
        if (aVar != null) {
            aVar.mo1035b(c0260g, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1218J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1218J.removeGlobalOnLayoutListener(this.f1229u);
            }
            this.f1218J = null;
        }
        this.f1209A.removeOnAttachStateChangeListener(this.f1230v);
        this.f1219K.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: d */
    public void mo1244d(InterfaceC0266m.a aVar) {
        this.f1217I = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    public void dismiss() {
        int size = this.f1228t.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1228t.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1242a.mo1269a()) {
                    dVar.f1242a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: e */
    public boolean mo1245e(SubMenuC0271r subMenuC0271r) {
        for (d dVar : this.f1228t) {
            if (subMenuC0271r == dVar.f1243b) {
                dVar.m1283a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0271r.hasVisibleItems()) {
            return false;
        }
        mo1271j(subMenuC0271r);
        InterfaceC0266m.a aVar = this.f1217I;
        if (aVar != null) {
            aVar.mo1036c(subMenuC0271r);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: f */
    public void mo1246f(boolean z10) {
        Iterator<d> it = this.f1228t.iterator();
        while (it.hasNext()) {
            AbstractC0264k.m1389x(it.next().m1283a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: g */
    public boolean mo1270g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: j */
    public void mo1271j(C0260g c0260g) {
        c0260g.m1327c(this, this.f1221b);
        if (mo1269a()) {
            m1266E(c0260g);
        } else {
            this.f1227s.add(c0260g);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: k */
    protected boolean mo1272k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: n */
    public void mo1273n(View view) {
        if (this.f1234z != view) {
            this.f1234z = view;
            this.f1233y = C1091r.m5127a(this.f1232x, C1116x0.m5296u(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1228t.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1228t.get(i10);
            if (!dVar.f1242a.mo1269a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f1243b.m1330e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: p */
    public void mo1274p(boolean z10) {
        this.f1215G = z10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: q */
    public void mo1275q(int i10) {
        if (this.f1232x != i10) {
            this.f1232x = i10;
            this.f1233y = C1091r.m5127a(i10, C1116x0.m5296u(this.f1234z));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    /* renamed from: r */
    public ListView mo1276r() {
        if (this.f1228t.isEmpty()) {
            return null;
        }
        return this.f1228t.get(r0.size() - 1).m1283a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: s */
    public void mo1277s(int i10) {
        this.f1211C = true;
        this.f1213E = i10;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    public void show() {
        if (mo1269a()) {
            return;
        }
        Iterator<C0260g> it = this.f1227s.iterator();
        while (it.hasNext()) {
            m1266E(it.next());
        }
        this.f1227s.clear();
        View view = this.f1234z;
        this.f1209A = view;
        if (view != null) {
            boolean z10 = this.f1218J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1218J = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1229u);
            }
            this.f1209A.addOnAttachStateChangeListener(this.f1230v);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: t */
    public void mo1278t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1219K = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: u */
    public void mo1279u(boolean z10) {
        this.f1216H = z10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: v */
    public void mo1280v(int i10) {
        this.f1212D = true;
        this.f1214F = i10;
    }
}
