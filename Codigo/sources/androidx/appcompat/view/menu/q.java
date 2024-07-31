package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.y0;
import androidx.core.view.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int G = g.g.f15376m;
    ViewTreeObserver A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean F;

    /* renamed from: b */
    private final Context f1190b;

    /* renamed from: c */
    private final g f1191c;

    /* renamed from: d */
    private final f f1192d;

    /* renamed from: e */
    private final boolean f1193e;

    /* renamed from: f */
    private final int f1194f;

    /* renamed from: r */
    private final int f1195r;

    /* renamed from: s */
    private final int f1196s;

    /* renamed from: t */
    final y0 f1197t;

    /* renamed from: w */
    private PopupWindow.OnDismissListener f1200w;

    /* renamed from: x */
    private View f1201x;

    /* renamed from: y */
    View f1202y;

    /* renamed from: z */
    private m.a f1203z;

    /* renamed from: u */
    final ViewTreeObserver.OnGlobalLayoutListener f1198u = new a();

    /* renamed from: v */
    private final View.OnAttachStateChangeListener f1199v = new b();
    private int E = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.a() || q.this.f1197t.w()) {
                return;
            }
            View view = q.this.f1202y;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f1197t.show();
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
            ViewTreeObserver viewTreeObserver = q.this.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.A = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.A.removeGlobalOnLayoutListener(qVar.f1198u);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f1190b = context;
        this.f1191c = gVar;
        this.f1193e = z10;
        this.f1192d = new f(gVar, LayoutInflater.from(context), z10, G);
        this.f1195r = i10;
        this.f1196s = i11;
        Resources resources = context.getResources();
        this.f1194f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f15300d));
        this.f1201x = view;
        this.f1197t = new y0(context, null, i10, i11);
        gVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.B || (view = this.f1201x) == null) {
            return false;
        }
        this.f1202y = view;
        this.f1197t.F(this);
        this.f1197t.G(this);
        this.f1197t.E(true);
        View view2 = this.f1202y;
        boolean z10 = this.A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1198u);
        }
        view2.addOnAttachStateChangeListener(this.f1199v);
        this.f1197t.y(view2);
        this.f1197t.B(this.E);
        if (!this.C) {
            this.D = k.m(this.f1192d, null, this.f1190b, this.f1194f);
            this.C = true;
        }
        this.f1197t.A(this.D);
        this.f1197t.D(2);
        this.f1197t.C(l());
        this.f1197t.show();
        ListView r10 = this.f1197t.r();
        r10.setOnKeyListener(this);
        if (this.F && this.f1191c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1190b).inflate(g.g.f15375l, (ViewGroup) r10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1191c.x());
            }
            frameLayout.setEnabled(false);
            r10.addHeaderView(frameLayout, null, false);
        }
        this.f1197t.q(this.f1192d);
        this.f1197t.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return !this.B && this.f1197t.a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z10) {
        if (gVar != this.f1191c) {
            return;
        }
        dismiss();
        m.a aVar = this.f1203z;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(m.a aVar) {
        this.f1203z = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (a()) {
            this.f1197t.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f1190b, rVar, this.f1202y, this.f1193e, this.f1195r, this.f1196s);
            lVar.j(this.f1203z);
            lVar.g(k.w(rVar));
            lVar.i(this.f1200w);
            this.f1200w = null;
            this.f1191c.e(false);
            int h10 = this.f1197t.h();
            int p10 = this.f1197t.p();
            if ((Gravity.getAbsoluteGravity(this.E, x0.u(this.f1201x)) & 7) == 5) {
                h10 += this.f1201x.getWidth();
            }
            if (lVar.n(h10, p10)) {
                m.a aVar = this.f1203z;
                if (aVar == null) {
                    return true;
                }
                aVar.c(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        this.C = false;
        f fVar = this.f1192d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void j(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.k
    public void n(View view) {
        this.f1201x = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.B = true;
        this.f1191c.close();
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.f1202y.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.f1198u);
            this.A = null;
        }
        this.f1202y.removeOnAttachStateChangeListener(this.f1199v);
        PopupWindow.OnDismissListener onDismissListener = this.f1200w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f1192d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void q(int i10) {
        this.E = i10;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView r() {
        return this.f1197t.r();
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        this.f1197t.i(i10);
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1200w = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z10) {
        this.F = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i10) {
        this.f1197t.m(i10);
    }
}
