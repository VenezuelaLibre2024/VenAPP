package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.x0;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1176a;

    /* renamed from: b, reason: collision with root package name */
    private final g f1177b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1178c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1179d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1180e;

    /* renamed from: f, reason: collision with root package name */
    private View f1181f;

    /* renamed from: g, reason: collision with root package name */
    private int f1182g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1183h;

    /* renamed from: i, reason: collision with root package name */
    private m.a f1184i;

    /* renamed from: j, reason: collision with root package name */
    private k f1185j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1186k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1187l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z10, int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    public l(Context context, g gVar, View view, boolean z10, int i10, int i11) {
        this.f1182g = 8388611;
        this.f1187l = new a();
        this.f1176a = context;
        this.f1177b = gVar;
        this.f1181f = view;
        this.f1178c = z10;
        this.f1179d = i10;
        this.f1180e = i11;
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f1176a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f1176a.getResources().getDimensionPixelSize(g.d.f15299c) ? new d(this.f1176a, this.f1181f, this.f1179d, this.f1180e, this.f1178c) : new q(this.f1176a, this.f1177b, this.f1181f, this.f1179d, this.f1180e, this.f1178c);
        dVar.j(this.f1177b);
        dVar.t(this.f1187l);
        dVar.n(this.f1181f);
        dVar.d(this.f1184i);
        dVar.p(this.f1183h);
        dVar.q(this.f1182g);
        return dVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        k c10 = c();
        c10.u(z11);
        if (z10) {
            if ((androidx.core.view.r.a(this.f1182g, x0.u(this.f1181f)) & 7) == 5) {
                i10 -= this.f1181f.getWidth();
            }
            c10.s(i10);
            c10.v(i11);
            int i12 = (int) ((this.f1176a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.o(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.show();
    }

    public void b() {
        if (d()) {
            this.f1185j.dismiss();
        }
    }

    public k c() {
        if (this.f1185j == null) {
            this.f1185j = a();
        }
        return this.f1185j;
    }

    public boolean d() {
        k kVar = this.f1185j;
        return kVar != null && kVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f1185j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1186k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1181f = view;
    }

    public void g(boolean z10) {
        this.f1183h = z10;
        k kVar = this.f1185j;
        if (kVar != null) {
            kVar.p(z10);
        }
    }

    public void h(int i10) {
        this.f1182g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1186k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f1184i = aVar;
        k kVar = this.f1185j;
        if (kVar != null) {
            kVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1181f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1181f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
