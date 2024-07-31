package p382ud;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import p382ud.ViewOnTouchListenerC11547p;
import p401vd.AbstractC11875c;

/* renamed from: ud.g */
/* loaded from: classes.dex */
public class C11538g {

    /* renamed from: a */
    private AbstractC11875c f29923a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.g$a */
    /* loaded from: classes.dex */
    public class a implements ViewOnTouchListenerC11547p.e {

        /* renamed from: a */
        final /* synthetic */ AbstractC11875c f29924a;

        a(AbstractC11875c abstractC11875c) {
            this.f29924a = abstractC11875c;
        }

        @Override // p382ud.ViewOnTouchListenerC11547p.e
        /* renamed from: a */
        public boolean mo36127a(Object obj) {
            return true;
        }

        @Override // p382ud.ViewOnTouchListenerC11547p.e
        /* renamed from: b */
        public void mo36128b(View view, Object obj) {
            if (this.f29924a.mo37969d() != null) {
                this.f29924a.mo37969d().onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.g$b */
    /* loaded from: classes.dex */
    public class b extends ViewOnTouchListenerC11547p {

        /* renamed from: A */
        final /* synthetic */ WindowManager f29926A;

        /* renamed from: B */
        final /* synthetic */ AbstractC11875c f29927B;

        /* renamed from: z */
        final /* synthetic */ WindowManager.LayoutParams f29929z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, Object obj, ViewOnTouchListenerC11547p.e eVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, AbstractC11875c abstractC11875c) {
            super(view, obj, eVar);
            this.f29929z = layoutParams;
            this.f29926A = windowManager;
            this.f29927B = abstractC11875c;
        }

        @Override // p382ud.ViewOnTouchListenerC11547p
        /* renamed from: f */
        protected float mo36129f() {
            return this.f29929z.x;
        }

        @Override // p382ud.ViewOnTouchListenerC11547p
        /* renamed from: i */
        protected void mo36130i(float f10) {
            this.f29929z.x = (int) f10;
            this.f29926A.updateViewLayout(this.f29927B.mo37971f(), this.f29929z);
        }
    }

    /* renamed from: b */
    private Point m36118b(Activity activity) {
        Point point = new Point();
        m36123g(activity).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: c */
    private Rect m36119c(Activity activity) {
        Rect rect = new Rect();
        Rect m36122f = m36122f(activity);
        Point m36118b = m36118b(activity);
        rect.top = m36122f.top;
        rect.left = m36122f.left;
        rect.right = m36118b.x - m36122f.right;
        rect.bottom = m36118b.y - m36122f.bottom;
        return rect;
    }

    /* renamed from: d */
    private WindowManager.LayoutParams m36120d(C11543l c11543l, Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(c11543l.m36155A().intValue(), c11543l.m36167z().intValue(), 1003, c11543l.m36166y().intValue(), -3);
        Rect m36119c = m36119c(activity);
        if ((c11543l.m36165x().intValue() & 48) == 48) {
            layoutParams.y = m36119c.top;
        }
        layoutParams.dimAmount = 0.3f;
        layoutParams.gravity = c11543l.m36165x().intValue();
        layoutParams.windowAnimations = 0;
        return layoutParams;
    }

    /* renamed from: e */
    private ViewOnTouchListenerC11547p m36121e(C11543l c11543l, AbstractC11875c abstractC11875c, WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        a aVar = new a(abstractC11875c);
        return c11543l.m36155A().intValue() == -1 ? new ViewOnTouchListenerC11547p(abstractC11875c.mo37968c(), null, aVar) : new b(abstractC11875c.mo37968c(), null, aVar, layoutParams, windowManager, abstractC11875c);
    }

    /* renamed from: f */
    private Rect m36122f(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: g */
    private WindowManager m36123g(Activity activity) {
        return (WindowManager) activity.getSystemService("window");
    }

    /* renamed from: a */
    public void m36124a(Activity activity) {
        if (m36125h()) {
            m36123g(activity).removeViewImmediate(this.f29923a.mo37971f());
            this.f29923a = null;
        }
    }

    /* renamed from: h */
    public boolean m36125h() {
        AbstractC11875c abstractC11875c = this.f29923a;
        if (abstractC11875c == null) {
            return false;
        }
        return abstractC11875c.mo37971f().isShown();
    }

    /* renamed from: i */
    public void m36126i(AbstractC11875c abstractC11875c, Activity activity) {
        String str;
        if (m36125h()) {
            str = "Fiam already active. Cannot show new Fiam.";
        } else {
            if (!activity.isFinishing()) {
                C11543l mo37967b = abstractC11875c.mo37967b();
                WindowManager.LayoutParams m36120d = m36120d(mo37967b, activity);
                WindowManager m36123g = m36123g(activity);
                m36123g.addView(abstractC11875c.mo37971f(), m36120d);
                Rect m36119c = m36119c(activity);
                C11544m.m36185d("Inset (top, bottom)", m36119c.top, m36119c.bottom);
                C11544m.m36185d("Inset (left, right)", m36119c.left, m36119c.right);
                if (abstractC11875c.mo37966a()) {
                    abstractC11875c.mo37968c().setOnTouchListener(m36121e(mo37967b, abstractC11875c, m36123g, m36120d));
                }
                this.f29923a = abstractC11875c;
                return;
            }
            str = "Activity is finishing or does not have valid window token. Cannot show FIAM.";
        }
        C11544m.m36186e(str);
    }
}
