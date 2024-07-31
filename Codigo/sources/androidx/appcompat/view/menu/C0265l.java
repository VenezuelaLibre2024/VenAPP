package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.core.view.C1091r;
import androidx.core.view.C1116x0;
import p111g.C7380d;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class C0265l {

    /* renamed from: a */
    private final Context f1337a;

    /* renamed from: b */
    private final C0260g f1338b;

    /* renamed from: c */
    private final boolean f1339c;

    /* renamed from: d */
    private final int f1340d;

    /* renamed from: e */
    private final int f1341e;

    /* renamed from: f */
    private View f1342f;

    /* renamed from: g */
    private int f1343g;

    /* renamed from: h */
    private boolean f1344h;

    /* renamed from: i */
    private InterfaceC0266m.a f1345i;

    /* renamed from: j */
    private AbstractC0264k f1346j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1347k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1348l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0265l.this.mo1397e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static void m1406a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0265l(Context context, C0260g c0260g, View view, boolean z10, int i10) {
        this(context, c0260g, view, z10, i10, 0);
    }

    public C0265l(Context context, C0260g c0260g, View view, boolean z10, int i10, int i11) {
        this.f1343g = 8388611;
        this.f1348l = new a();
        this.f1337a = context;
        this.f1338b = c0260g;
        this.f1342f = view;
        this.f1339c = z10;
        this.f1340d = i10;
        this.f1341e = i11;
    }

    /* renamed from: a */
    private AbstractC0264k m1392a() {
        Display defaultDisplay = ((WindowManager) this.f1337a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.m1406a(defaultDisplay, point);
        AbstractC0264k viewOnKeyListenerC0257d = Math.min(point.x, point.y) >= this.f1337a.getResources().getDimensionPixelSize(C7380d.f16735c) ? new ViewOnKeyListenerC0257d(this.f1337a, this.f1342f, this.f1340d, this.f1341e, this.f1339c) : new ViewOnKeyListenerC0270q(this.f1337a, this.f1338b, this.f1342f, this.f1340d, this.f1341e, this.f1339c);
        viewOnKeyListenerC0257d.mo1271j(this.f1338b);
        viewOnKeyListenerC0257d.mo1278t(this.f1348l);
        viewOnKeyListenerC0257d.mo1273n(this.f1342f);
        viewOnKeyListenerC0257d.mo1244d(this.f1345i);
        viewOnKeyListenerC0257d.mo1274p(this.f1344h);
        viewOnKeyListenerC0257d.mo1275q(this.f1343g);
        return viewOnKeyListenerC0257d;
    }

    /* renamed from: l */
    private void m1393l(int i10, int i11, boolean z10, boolean z11) {
        AbstractC0264k m1395c = m1395c();
        m1395c.mo1279u(z11);
        if (z10) {
            if ((C1091r.m5127a(this.f1343g, C1116x0.m5296u(this.f1342f)) & 7) == 5) {
                i10 -= this.f1342f.getWidth();
            }
            m1395c.mo1277s(i10);
            m1395c.mo1280v(i11);
            int i12 = (int) ((this.f1337a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m1395c.m1391o(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        m1395c.show();
    }

    /* renamed from: b */
    public void m1394b() {
        if (m1396d()) {
            this.f1346j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0264k m1395c() {
        if (this.f1346j == null) {
            this.f1346j = m1392a();
        }
        return this.f1346j;
    }

    /* renamed from: d */
    public boolean m1396d() {
        AbstractC0264k abstractC0264k = this.f1346j;
        return abstractC0264k != null && abstractC0264k.mo1269a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1397e() {
        this.f1346j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1347k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m1398f(View view) {
        this.f1342f = view;
    }

    /* renamed from: g */
    public void m1399g(boolean z10) {
        this.f1344h = z10;
        AbstractC0264k abstractC0264k = this.f1346j;
        if (abstractC0264k != null) {
            abstractC0264k.mo1274p(z10);
        }
    }

    /* renamed from: h */
    public void m1400h(int i10) {
        this.f1343g = i10;
    }

    /* renamed from: i */
    public void m1401i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1347k = onDismissListener;
    }

    /* renamed from: j */
    public void m1402j(InterfaceC0266m.a aVar) {
        this.f1345i = aVar;
        AbstractC0264k abstractC0264k = this.f1346j;
        if (abstractC0264k != null) {
            abstractC0264k.mo1244d(aVar);
        }
    }

    /* renamed from: k */
    public void m1403k() {
        if (!m1404m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m1404m() {
        if (m1396d()) {
            return true;
        }
        if (this.f1342f == null) {
            return false;
        }
        m1393l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m1405n(int i10, int i11) {
        if (m1396d()) {
            return true;
        }
        if (this.f1342f == null) {
            return false;
        }
        m1393l(i10, i11, true, true);
        return true;
    }
}
