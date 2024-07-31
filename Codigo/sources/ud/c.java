package ud;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.View;

/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f27590a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f27591b;

        a(View view, Application application) {
            this.f27590a = view;
            this.f27591b = application;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f27590a.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.f27591b.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27593a;

        static {
            int[] iArr = new int[EnumC0447c.values().length];
            f27593a = iArr;
            try {
                iArr[EnumC0447c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27593a[EnumC0447c.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27593a[EnumC0447c.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27593a[EnumC0447c.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ud.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0447c {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        /* JADX INFO: Access modifiers changed from: private */
        public static Point h(EnumC0447c enumC0447c, View view) {
            view.measure(-2, -2);
            int i10 = b.f27593a[enumC0447c.ordinal()];
            if (i10 == 1) {
                return new Point(view.getMeasuredWidth() * (-1), 0);
            }
            if (i10 == 2) {
                return new Point(view.getMeasuredWidth() * 1, 0);
            }
            if (i10 != 3 && i10 == 4) {
                return new Point(0, view.getMeasuredHeight() * 1);
            }
            return new Point(0, view.getMeasuredHeight() * (-1));
        }
    }

    public void a(Application application, View view, EnumC0447c enumC0447c) {
        view.setAlpha(0.0f);
        Point h10 = EnumC0447c.h(enumC0447c, view);
        view.animate().translationX(h10.x).translationY(h10.y).setDuration(1L).setListener(new a(view, application));
    }
}
