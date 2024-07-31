package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.x0;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends l {
    private static final String[] W = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> X = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> Y = new C0102c(PointF.class, "topLeft");
    private static final Property<k, PointF> Z = new d(PointF.class, "bottomRight");

    /* renamed from: a0, reason: collision with root package name */
    private static final Property<View, PointF> f6014a0 = new e(PointF.class, "bottomRight");

    /* renamed from: b0, reason: collision with root package name */
    private static final Property<View, PointF> f6015b0 = new f(PointF.class, "topLeft");

    /* renamed from: c0, reason: collision with root package name */
    private static final Property<View, PointF> f6016c0 = new g(PointF.class, "position");

    /* renamed from: d0, reason: collision with root package name */
    private static b2.j f6017d0 = new b2.j();
    private int[] T = new int[2];
    private boolean U = false;
    private boolean V = false;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f6019b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6020c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f6021d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f6018a = viewGroup;
            this.f6019b = bitmapDrawable;
            this.f6020c = view;
            this.f6021d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.b(this.f6018a).b(this.f6019b);
            a0.g(this.f6020c, this.f6021d);
        }
    }

    /* loaded from: classes.dex */
    class b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f6023a;

        b(Class cls, String str) {
            super(cls, str);
            this.f6023a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6023a);
            Rect rect = this.f6023a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6023a);
            this.f6023a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6023a);
        }
    }

    /* renamed from: b2.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0102c extends Property<k, PointF> {
        C0102c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            a0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            a0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            a0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f6024a;
        private k mViewBounds;

        h(k kVar) {
            this.f6024a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f6028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6029d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6030e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6031f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6032g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f6027b = view;
            this.f6028c = rect;
            this.f6029d = i10;
            this.f6030e = i11;
            this.f6031f = i12;
            this.f6032g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6026a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6026a) {
                return;
            }
            x0.c0(this.f6027b, this.f6028c);
            a0.f(this.f6027b, this.f6029d, this.f6030e, this.f6031f, this.f6032g);
        }
    }

    /* loaded from: classes.dex */
    class j extends m {

        /* renamed from: a, reason: collision with root package name */
        boolean f6034a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6035b;

        j(ViewGroup viewGroup) {
            this.f6035b = viewGroup;
        }

        @Override // b2.m, b2.l.f
        public void a(l lVar) {
            x.c(this.f6035b, true);
        }

        @Override // b2.m, b2.l.f
        public void b(l lVar) {
            x.c(this.f6035b, false);
        }

        @Override // b2.m, b2.l.f
        public void d(l lVar) {
            x.c(this.f6035b, false);
            this.f6034a = true;
        }

        @Override // b2.l.f
        public void e(l lVar) {
            if (!this.f6034a) {
                x.c(this.f6035b, false);
            }
            lVar.T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f6037a;

        /* renamed from: b, reason: collision with root package name */
        private int f6038b;

        /* renamed from: c, reason: collision with root package name */
        private int f6039c;

        /* renamed from: d, reason: collision with root package name */
        private int f6040d;

        /* renamed from: e, reason: collision with root package name */
        private View f6041e;

        /* renamed from: f, reason: collision with root package name */
        private int f6042f;

        /* renamed from: g, reason: collision with root package name */
        private int f6043g;

        k(View view) {
            this.f6041e = view;
        }

        private void b() {
            a0.f(this.f6041e, this.f6037a, this.f6038b, this.f6039c, this.f6040d);
            this.f6042f = 0;
            this.f6043g = 0;
        }

        void a(PointF pointF) {
            this.f6039c = Math.round(pointF.x);
            this.f6040d = Math.round(pointF.y);
            int i10 = this.f6043g + 1;
            this.f6043g = i10;
            if (this.f6042f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f6037a = Math.round(pointF.x);
            this.f6038b = Math.round(pointF.y);
            int i10 = this.f6042f + 1;
            this.f6042f = i10;
            if (i10 == this.f6043g) {
                b();
            }
        }
    }

    private void i0(s sVar) {
        View view = sVar.f6132b;
        if (!x0.H(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f6131a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f6131a.put("android:changeBounds:parent", sVar.f6132b.getParent());
        if (this.V) {
            sVar.f6132b.getLocationInWindow(this.T);
            sVar.f6131a.put("android:changeBounds:windowX", Integer.valueOf(this.T[0]));
            sVar.f6131a.put("android:changeBounds:windowY", Integer.valueOf(this.T[1]));
        }
        if (this.U) {
            sVar.f6131a.put("android:changeBounds:clip", x0.p(view));
        }
    }

    private boolean j0(View view, View view2) {
        if (!this.V) {
            return true;
        }
        s v10 = v(view, true);
        if (v10 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == v10.f6132b) {
            return true;
        }
        return false;
    }

    @Override // b2.l
    public String[] G() {
        return W;
    }

    @Override // b2.l
    public void g(s sVar) {
        i0(sVar);
    }

    @Override // b2.l
    public void j(s sVar) {
        i0(sVar);
    }

    @Override // b2.l
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c10;
        Path a10;
        Property<View, PointF> property;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f6131a;
        Map<String, Object> map2 = sVar2.f6131a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f6132b;
        if (!j0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) sVar.f6131a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar.f6131a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar2.f6131a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar2.f6131a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.T);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c11 = a0.c(view2);
            a0.g(view2, 0.0f);
            a0.b(viewGroup).a(bitmapDrawable);
            b2.g x10 = x();
            int[] iArr = this.T;
            int i12 = iArr[0];
            int i13 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, b2.h.a(X, x10.a(intValue - i12, intValue2 - i13, intValue3 - i12, intValue4 - i13)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c11));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.f6131a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.f6131a.get("android:changeBounds:bounds");
        int i14 = rect2.left;
        int i15 = rect3.left;
        int i16 = rect2.top;
        int i17 = rect3.top;
        int i18 = rect2.right;
        int i19 = rect3.right;
        int i20 = rect2.bottom;
        int i21 = rect3.bottom;
        int i22 = i18 - i14;
        int i23 = i20 - i16;
        int i24 = i19 - i15;
        int i25 = i21 - i17;
        Rect rect4 = (Rect) sVar.f6131a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.f6131a.get("android:changeBounds:clip");
        if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
            i10 = 0;
        } else {
            i10 = (i14 == i15 && i16 == i17) ? 0 : 1;
            if (i18 != i19 || i20 != i21) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.U) {
            view = view2;
            a0.f(view, i14, i16, Math.max(i22, i24) + i14, Math.max(i23, i25) + i16);
            ObjectAnimator a11 = (i14 == i15 && i16 == i17) ? null : b2.f.a(view, f6016c0, x().a(i14, i16, i15, i17));
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i22, i23);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i24, i25) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                x0.c0(view, rect);
                b2.j jVar = f6017d0;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                ofObject.addListener(new i(view, rect5, i15, i17, i19, i21));
                objectAnimator = ofObject;
            }
            c10 = r.c(a11, objectAnimator);
        } else {
            view = view2;
            a0.f(view, i14, i16, i18, i20);
            if (i10 == 2) {
                if (i22 == i24 && i23 == i25) {
                    a10 = x().a(i14, i16, i15, i17);
                    property = f6016c0;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a12 = b2.f.a(kVar, Y, x().a(i14, i16, i15, i17));
                    ObjectAnimator a13 = b2.f.a(kVar, Z, x().a(i18, i20, i19, i21));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a12, a13);
                    animatorSet.addListener(new h(kVar));
                    c10 = animatorSet;
                }
            } else if (i14 == i15 && i16 == i17) {
                a10 = x().a(i18, i20, i19, i21);
                property = f6014a0;
            } else {
                a10 = x().a(i14, i16, i15, i17);
                property = f6015b0;
            }
            c10 = b2.f.a(view, property, a10);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return c10;
    }
}
