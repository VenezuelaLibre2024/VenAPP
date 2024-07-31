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
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int M = g.g.f15368e;
    View A;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private boolean H;
    private m.a I;
    ViewTreeObserver J;
    private PopupWindow.OnDismissListener K;
    boolean L;

    /* renamed from: b */
    private final Context f1066b;

    /* renamed from: c */
    private final int f1067c;

    /* renamed from: d */
    private final int f1068d;

    /* renamed from: e */
    private final int f1069e;

    /* renamed from: f */
    private final boolean f1070f;

    /* renamed from: r */
    final Handler f1071r;

    /* renamed from: z */
    private View f1079z;

    /* renamed from: s */
    private final List<g> f1072s = new ArrayList();

    /* renamed from: t */
    final List<C0020d> f1073t = new ArrayList();

    /* renamed from: u */
    final ViewTreeObserver.OnGlobalLayoutListener f1074u = new a();

    /* renamed from: v */
    private final View.OnAttachStateChangeListener f1075v = new b();

    /* renamed from: w */
    private final x0 f1076w = new c();

    /* renamed from: x */
    private int f1077x = 0;

    /* renamed from: y */
    private int f1078y = 0;
    private boolean G = false;
    private int B = C();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.f1073t.size() <= 0 || d.this.f1073t.get(0).f1087a.w()) {
                return;
            }
            View view = d.this.A;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0020d> it = d.this.f1073t.iterator();
            while (it.hasNext()) {
                it.next().f1087a.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.J;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.J = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.J.removeGlobalOnLayoutListener(dVar.f1074u);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements x0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0020d f1083a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f1084b;

            /* renamed from: c */
            final /* synthetic */ g f1085c;

            a(C0020d c0020d, MenuItem menuItem, g gVar) {
                this.f1083a = c0020d;
                this.f1084b = menuItem;
                this.f1085c = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0020d c0020d = this.f1083a;
                if (c0020d != null) {
                    d.this.L = true;
                    c0020d.f1088b.e(false);
                    d.this.L = false;
                }
                if (this.f1084b.isEnabled() && this.f1084b.hasSubMenu()) {
                    this.f1085c.L(this.f1084b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.x0
        public void b(g gVar, MenuItem menuItem) {
            d.this.f1071r.removeCallbacksAndMessages(null);
            int size = d.this.f1073t.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (gVar == d.this.f1073t.get(i10).f1088b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            d.this.f1071r.postAtTime(new a(i11 < d.this.f1073t.size() ? d.this.f1073t.get(i11) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.x0
        public void c(g gVar, MenuItem menuItem) {
            d.this.f1071r.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* loaded from: classes.dex */
    public static class C0020d {

        /* renamed from: a */
        public final y0 f1087a;

        /* renamed from: b */
        public final g f1088b;

        /* renamed from: c */
        public final int f1089c;

        public C0020d(y0 y0Var, g gVar, int i10) {
            this.f1087a = y0Var;
            this.f1088b = gVar;
            this.f1089c = i10;
        }

        public ListView a() {
            return this.f1087a.r();
        }
    }

    public d(Context context, View view, int i10, int i11, boolean z10) {
        this.f1066b = context;
        this.f1079z = view;
        this.f1068d = i10;
        this.f1069e = i11;
        this.f1070f = z10;
        Resources resources = context.getResources();
        this.f1067c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f15300d));
        this.f1071r = new Handler();
    }

    private MenuItem A(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(C0020d c0020d, g gVar) {
        f fVar;
        int i10;
        int firstVisiblePosition;
        MenuItem A = A(c0020d.f1088b, gVar);
        if (A == null) {
            return null;
        }
        ListView a10 = c0020d.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i10 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (A == fVar.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return androidx.core.view.x0.u(this.f1079z) == 1 ? 0 : 1;
    }

    private int D(int i10) {
        List<C0020d> list = this.f1073t;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.A.getWindowVisibleDisplayFrame(rect);
        return this.B == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void E(g gVar) {
        C0020d c0020d;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1066b);
        f fVar = new f(gVar, from, this.f1070f, M);
        if (!a() && this.G) {
            fVar.d(true);
        } else if (a()) {
            fVar.d(k.w(gVar));
        }
        int m10 = k.m(fVar, null, this.f1066b, this.f1067c);
        y0 y10 = y();
        y10.q(fVar);
        y10.A(m10);
        y10.B(this.f1078y);
        if (this.f1073t.size() > 0) {
            List<C0020d> list = this.f1073t;
            c0020d = list.get(list.size() - 1);
            view = B(c0020d, gVar);
        } else {
            c0020d = null;
            view = null;
        }
        if (view != null) {
            y10.P(false);
            y10.M(null);
            int D = D(m10);
            boolean z10 = D == 1;
            this.B = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y10.y(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1079z.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1078y & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1079z.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1078y & 5) == 5) {
                if (!z10) {
                    m10 = view.getWidth();
                    i12 = i10 - m10;
                }
                i12 = i10 + m10;
            } else {
                if (z10) {
                    m10 = view.getWidth();
                    i12 = i10 + m10;
                }
                i12 = i10 - m10;
            }
            y10.i(i12);
            y10.H(true);
            y10.m(i11);
        } else {
            if (this.C) {
                y10.i(this.E);
            }
            if (this.D) {
                y10.m(this.F);
            }
            y10.C(l());
        }
        this.f1073t.add(new C0020d(y10, gVar, this.B));
        y10.show();
        ListView r10 = y10.r();
        r10.setOnKeyListener(this);
        if (c0020d == null && this.H && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.g.f15375l, (ViewGroup) r10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            r10.addHeaderView(frameLayout, null, false);
            y10.show();
        }
    }

    private y0 y() {
        y0 y0Var = new y0(this.f1066b, null, this.f1068d, this.f1069e);
        y0Var.O(this.f1076w);
        y0Var.G(this);
        y0Var.F(this);
        y0Var.y(this.f1079z);
        y0Var.B(this.f1078y);
        y0Var.E(true);
        y0Var.D(2);
        return y0Var;
    }

    private int z(g gVar) {
        int size = this.f1073t.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == this.f1073t.get(i10).f1088b) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.f1073t.size() > 0 && this.f1073t.get(0).f1087a.a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z10) {
        int z11 = z(gVar);
        if (z11 < 0) {
            return;
        }
        int i10 = z11 + 1;
        if (i10 < this.f1073t.size()) {
            this.f1073t.get(i10).f1088b.e(false);
        }
        C0020d remove = this.f1073t.remove(z11);
        remove.f1088b.O(this);
        if (this.L) {
            remove.f1087a.N(null);
            remove.f1087a.z(0);
        }
        remove.f1087a.dismiss();
        int size = this.f1073t.size();
        this.B = size > 0 ? this.f1073t.get(size - 1).f1089c : C();
        if (size != 0) {
            if (z10) {
                this.f1073t.get(0).f1088b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.I;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.J.removeGlobalOnLayoutListener(this.f1074u);
            }
            this.J = null;
        }
        this.A.removeOnAttachStateChangeListener(this.f1075v);
        this.K.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(m.a aVar) {
        this.I = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f1073t.size();
        if (size > 0) {
            C0020d[] c0020dArr = (C0020d[]) this.f1073t.toArray(new C0020d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0020d c0020d = c0020dArr[i10];
                if (c0020d.f1087a.a()) {
                    c0020d.f1087a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        for (C0020d c0020d : this.f1073t) {
            if (rVar == c0020d.f1088b) {
                c0020d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        j(rVar);
        m.a aVar = this.I;
        if (aVar != null) {
            aVar.c(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        Iterator<C0020d> it = this.f1073t.iterator();
        while (it.hasNext()) {
            k.x(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void j(g gVar) {
        gVar.c(this, this.f1066b);
        if (a()) {
            E(gVar);
        } else {
            this.f1072s.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void n(View view) {
        if (this.f1079z != view) {
            this.f1079z = view;
            this.f1078y = androidx.core.view.r.a(this.f1077x, androidx.core.view.x0.u(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0020d c0020d;
        int size = this.f1073t.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0020d = null;
                break;
            }
            c0020d = this.f1073t.get(i10);
            if (!c0020d.f1087a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (c0020d != null) {
            c0020d.f1088b.e(false);
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

    @Override // androidx.appcompat.view.menu.k
    public void p(boolean z10) {
        this.G = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void q(int i10) {
        if (this.f1077x != i10) {
            this.f1077x = i10;
            this.f1078y = androidx.core.view.r.a(i10, androidx.core.view.x0.u(this.f1079z));
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView r() {
        if (this.f1073t.isEmpty()) {
            return null;
        }
        return this.f1073t.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        this.C = true;
        this.E = i10;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        if (a()) {
            return;
        }
        Iterator<g> it = this.f1072s.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        this.f1072s.clear();
        View view = this.f1079z;
        this.A = view;
        if (view != null) {
            boolean z10 = this.J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.J = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1074u);
            }
            this.A.addOnAttachStateChangeListener(this.f1075v);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z10) {
        this.H = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i10) {
        this.D = true;
        this.F = i10;
    }
}
