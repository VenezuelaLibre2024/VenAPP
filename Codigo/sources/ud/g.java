package ud;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import ud.p;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private vd.c f27603a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements p.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vd.c f27604a;

        a(vd.c cVar) {
            this.f27604a = cVar;
        }

        @Override // ud.p.e
        public boolean a(Object obj) {
            return true;
        }

        @Override // ud.p.e
        public void b(View view, Object obj) {
            if (this.f27604a.d() != null) {
                this.f27604a.d().onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends p {
        final /* synthetic */ WindowManager A;
        final /* synthetic */ vd.c B;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ WindowManager.LayoutParams f27606z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, Object obj, p.e eVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, vd.c cVar) {
            super(view, obj, eVar);
            this.f27606z = layoutParams;
            this.A = windowManager;
            this.B = cVar;
        }

        @Override // ud.p
        protected float f() {
            return this.f27606z.x;
        }

        @Override // ud.p
        protected void i(float f10) {
            this.f27606z.x = (int) f10;
            this.A.updateViewLayout(this.B.f(), this.f27606z);
        }
    }

    private Point b(Activity activity) {
        Point point = new Point();
        g(activity).getDefaultDisplay().getRealSize(point);
        return point;
    }

    private Rect c(Activity activity) {
        Rect rect = new Rect();
        Rect f10 = f(activity);
        Point b10 = b(activity);
        rect.top = f10.top;
        rect.left = f10.left;
        rect.right = b10.x - f10.right;
        rect.bottom = b10.y - f10.bottom;
        return rect;
    }

    private WindowManager.LayoutParams d(l lVar, Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(lVar.A().intValue(), lVar.z().intValue(), 1003, lVar.y().intValue(), -3);
        Rect c10 = c(activity);
        if ((lVar.x().intValue() & 48) == 48) {
            layoutParams.y = c10.top;
        }
        layoutParams.dimAmount = 0.3f;
        layoutParams.gravity = lVar.x().intValue();
        layoutParams.windowAnimations = 0;
        return layoutParams;
    }

    private p e(l lVar, vd.c cVar, WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        a aVar = new a(cVar);
        return lVar.A().intValue() == -1 ? new p(cVar.c(), null, aVar) : new b(cVar.c(), null, aVar, layoutParams, windowManager, cVar);
    }

    private Rect f(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    private WindowManager g(Activity activity) {
        return (WindowManager) activity.getSystemService("window");
    }

    public void a(Activity activity) {
        if (h()) {
            g(activity).removeViewImmediate(this.f27603a.f());
            this.f27603a = null;
        }
    }

    public boolean h() {
        vd.c cVar = this.f27603a;
        if (cVar == null) {
            return false;
        }
        return cVar.f().isShown();
    }

    public void i(vd.c cVar, Activity activity) {
        String str;
        if (h()) {
            str = "Fiam already active. Cannot show new Fiam.";
        } else {
            if (!activity.isFinishing()) {
                l b10 = cVar.b();
                WindowManager.LayoutParams d10 = d(b10, activity);
                WindowManager g10 = g(activity);
                g10.addView(cVar.f(), d10);
                Rect c10 = c(activity);
                m.d("Inset (top, bottom)", c10.top, c10.bottom);
                m.d("Inset (left, right)", c10.left, c10.right);
                if (cVar.a()) {
                    cVar.c().setOnTouchListener(e(b10, cVar, g10, d10));
                }
                this.f27603a = cVar;
                return;
            }
            str = "Activity is finishing or does not have valid window token. Cannot show FIAM.";
        }
        m.e(str);
    }
}
