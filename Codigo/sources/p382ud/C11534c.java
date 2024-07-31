package p382ud;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.View;

/* renamed from: ud.c */
/* loaded from: classes.dex */
public class C11534c {

    /* renamed from: ud.c$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f29910a;

        /* renamed from: b */
        final /* synthetic */ Application f29911b;

        a(View view, Application application) {
            this.f29910a = view;
            this.f29911b = application;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f29910a.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.f29911b.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.c$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f29913a;

        static {
            int[] iArr = new int[c.values().length];
            f29913a = iArr;
            try {
                iArr[c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29913a[c.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29913a[c.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29913a[c.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ud.c$c */
    /* loaded from: classes.dex */
    public enum c {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static Point m36099h(c cVar, View view) {
            view.measure(-2, -2);
            int i10 = b.f29913a[cVar.ordinal()];
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

    /* renamed from: a */
    public void m36097a(Application application, View view, c cVar) {
        view.setAlpha(0.0f);
        Point m36099h = c.m36099h(cVar, view);
        view.animate().translationX(m36099h.x).translationY(m36099h.y).setDuration(1L).setListener(new a(view, application));
    }
}
