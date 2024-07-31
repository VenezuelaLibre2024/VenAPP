package p020b2;

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
import androidx.core.view.C1116x0;
import java.util.Map;

/* renamed from: b2.c */
/* loaded from: classes.dex */
public class C1614c extends AbstractC1632l {

    /* renamed from: W */
    private static final String[] f6876W = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: X */
    private static final Property<Drawable, PointF> f6877X = new b(PointF.class, "boundsOrigin");

    /* renamed from: Y */
    private static final Property<k, PointF> f6878Y = new c(PointF.class, "topLeft");

    /* renamed from: Z */
    private static final Property<k, PointF> f6879Z = new d(PointF.class, "bottomRight");

    /* renamed from: a0 */
    private static final Property<View, PointF> f6880a0 = new e(PointF.class, "bottomRight");

    /* renamed from: b0 */
    private static final Property<View, PointF> f6881b0 = new f(PointF.class, "topLeft");

    /* renamed from: c0 */
    private static final Property<View, PointF> f6882c0 = new g(PointF.class, "position");

    /* renamed from: d0 */
    private static C1628j f6883d0 = new C1628j();

    /* renamed from: T */
    private int[] f6884T = new int[2];

    /* renamed from: U */
    private boolean f6885U = false;

    /* renamed from: V */
    private boolean f6886V = false;

    /* renamed from: b2.c$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f6887a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f6888b;

        /* renamed from: c */
        final /* synthetic */ View f6889c;

        /* renamed from: d */
        final /* synthetic */ float f6890d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f6887a = viewGroup;
            this.f6888b = bitmapDrawable;
            this.f6889c = view;
            this.f6890d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1611a0.m8955b(this.f6887a).mo9100b(this.f6888b);
            C1611a0.m8960g(this.f6889c, this.f6890d);
        }
    }

    /* renamed from: b2.c$b */
    /* loaded from: classes.dex */
    class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f6892a;

        b(Class cls, String str) {
            super(cls, str);
            this.f6892a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6892a);
            Rect rect = this.f6892a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6892a);
            this.f6892a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6892a);
        }
    }

    /* renamed from: b2.c$c */
    /* loaded from: classes.dex */
    class c extends Property<k, PointF> {
        c(Class cls, String str) {
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
            kVar.m8994c(pointF);
        }
    }

    /* renamed from: b2.c$d */
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
            kVar.m8993a(pointF);
        }
    }

    /* renamed from: b2.c$e */
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
            C1611a0.m8959f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: b2.c$f */
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
            C1611a0.m8959f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: b2.c$g */
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
            C1611a0.m8959f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: b2.c$h */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f6893a;
        private k mViewBounds;

        h(k kVar) {
            this.f6893a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: b2.c$i */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6895a;

        /* renamed from: b */
        final /* synthetic */ View f6896b;

        /* renamed from: c */
        final /* synthetic */ Rect f6897c;

        /* renamed from: d */
        final /* synthetic */ int f6898d;

        /* renamed from: e */
        final /* synthetic */ int f6899e;

        /* renamed from: f */
        final /* synthetic */ int f6900f;

        /* renamed from: g */
        final /* synthetic */ int f6901g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f6896b = view;
            this.f6897c = rect;
            this.f6898d = i10;
            this.f6899e = i11;
            this.f6900f = i12;
            this.f6901g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6895a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6895a) {
                return;
            }
            C1116x0.m5267c0(this.f6896b, this.f6897c);
            C1611a0.m8959f(this.f6896b, this.f6898d, this.f6899e, this.f6900f, this.f6901g);
        }
    }

    /* renamed from: b2.c$j */
    /* loaded from: classes.dex */
    class j extends C1634m {

        /* renamed from: a */
        boolean f6903a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f6904b;

        j(ViewGroup viewGroup) {
            this.f6904b = viewGroup;
        }

        @Override // p020b2.C1634m, p020b2.AbstractC1632l.f
        /* renamed from: a */
        public void mo8988a(AbstractC1632l abstractC1632l) {
            C1649x.m9106c(this.f6904b, true);
        }

        @Override // p020b2.C1634m, p020b2.AbstractC1632l.f
        /* renamed from: b */
        public void mo8989b(AbstractC1632l abstractC1632l) {
            C1649x.m9106c(this.f6904b, false);
        }

        @Override // p020b2.C1634m, p020b2.AbstractC1632l.f
        /* renamed from: d */
        public void mo8990d(AbstractC1632l abstractC1632l) {
            C1649x.m9106c(this.f6904b, false);
            this.f6903a = true;
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            if (!this.f6903a) {
                C1649x.m9106c(this.f6904b, false);
            }
            abstractC1632l.mo9042T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2.c$k */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        private int f6906a;

        /* renamed from: b */
        private int f6907b;

        /* renamed from: c */
        private int f6908c;

        /* renamed from: d */
        private int f6909d;

        /* renamed from: e */
        private View f6910e;

        /* renamed from: f */
        private int f6911f;

        /* renamed from: g */
        private int f6912g;

        k(View view) {
            this.f6910e = view;
        }

        /* renamed from: b */
        private void m8992b() {
            C1611a0.m8959f(this.f6910e, this.f6906a, this.f6907b, this.f6908c, this.f6909d);
            this.f6911f = 0;
            this.f6912g = 0;
        }

        /* renamed from: a */
        void m8993a(PointF pointF) {
            this.f6908c = Math.round(pointF.x);
            this.f6909d = Math.round(pointF.y);
            int i10 = this.f6912g + 1;
            this.f6912g = i10;
            if (this.f6911f == i10) {
                m8992b();
            }
        }

        /* renamed from: c */
        void m8994c(PointF pointF) {
            this.f6906a = Math.round(pointF.x);
            this.f6907b = Math.round(pointF.y);
            int i10 = this.f6911f + 1;
            this.f6911f = i10;
            if (i10 == this.f6912g) {
                m8992b();
            }
        }
    }

    /* renamed from: i0 */
    private void m8970i0(C1644s c1644s) {
        View view = c1644s.f7027b;
        if (!C1116x0.m5243H(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c1644s.f7026a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c1644s.f7026a.put("android:changeBounds:parent", c1644s.f7027b.getParent());
        if (this.f6886V) {
            c1644s.f7027b.getLocationInWindow(this.f6884T);
            c1644s.f7026a.put("android:changeBounds:windowX", Integer.valueOf(this.f6884T[0]));
            c1644s.f7026a.put("android:changeBounds:windowY", Integer.valueOf(this.f6884T[1]));
        }
        if (this.f6885U) {
            c1644s.f7026a.put("android:changeBounds:clip", C1116x0.m5291p(view));
        }
    }

    /* renamed from: j0 */
    private boolean m8971j0(View view, View view2) {
        if (!this.f6886V) {
            return true;
        }
        C1644s m9066v = m9066v(view, true);
        if (m9066v == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m9066v.f7027b) {
            return true;
        }
        return false;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: G */
    public String[] mo8972G() {
        return f6876W;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: g */
    public void mo8973g(C1644s c1644s) {
        m8970i0(c1644s);
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: j */
    public void mo8974j(C1644s c1644s) {
        m8970i0(c1644s);
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: p */
    public Animator mo8975p(ViewGroup viewGroup, C1644s c1644s, C1644s c1644s2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m9098c;
        Path mo9009a;
        Property<View, PointF> property;
        if (c1644s == null || c1644s2 == null) {
            return null;
        }
        Map<String, Object> map = c1644s.f7026a;
        Map<String, Object> map2 = c1644s2.f7026a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c1644s2.f7027b;
        if (!m8971j0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) c1644s.f7026a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) c1644s.f7026a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) c1644s2.f7026a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) c1644s2.f7026a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f6884T);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float m8956c = C1611a0.m8956c(view2);
            C1611a0.m8960g(view2, 0.0f);
            C1611a0.m8955b(viewGroup).mo9099a(bitmapDrawable);
            AbstractC1622g m9068x = m9068x();
            int[] iArr = this.f6884T;
            int i12 = iArr[0];
            int i13 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C1624h.m9012a(f6877X, m9068x.mo9009a(intValue - i12, intValue2 - i13, intValue3 - i12, intValue4 - i13)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, m8956c));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) c1644s.f7026a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c1644s2.f7026a.get("android:changeBounds:bounds");
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
        Rect rect4 = (Rect) c1644s.f7026a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c1644s2.f7026a.get("android:changeBounds:clip");
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
        if (this.f6885U) {
            view = view2;
            C1611a0.m8959f(view, i14, i16, Math.max(i22, i24) + i14, Math.max(i23, i25) + i16);
            ObjectAnimator m9007a = (i14 == i15 && i16 == i17) ? null : C1620f.m9007a(view, f6882c0, m9068x().mo9009a(i14, i16, i15, i17));
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
                C1116x0.m5267c0(view, rect);
                C1628j c1628j = f6883d0;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c1628j, objArr);
                ofObject.addListener(new i(view, rect5, i15, i17, i19, i21));
                objectAnimator = ofObject;
            }
            m9098c = C1643r.m9098c(m9007a, objectAnimator);
        } else {
            view = view2;
            C1611a0.m8959f(view, i14, i16, i18, i20);
            if (i10 == 2) {
                if (i22 == i24 && i23 == i25) {
                    mo9009a = m9068x().mo9009a(i14, i16, i15, i17);
                    property = f6882c0;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator m9007a2 = C1620f.m9007a(kVar, f6878Y, m9068x().mo9009a(i14, i16, i15, i17));
                    ObjectAnimator m9007a3 = C1620f.m9007a(kVar, f6879Z, m9068x().mo9009a(i18, i20, i19, i21));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(m9007a2, m9007a3);
                    animatorSet.addListener(new h(kVar));
                    m9098c = animatorSet;
                }
            } else if (i14 == i15 && i16 == i17) {
                mo9009a = m9068x().mo9009a(i18, i20, i19, i21);
                property = f6880a0;
            } else {
                mo9009a = m9068x().mo9009a(i14, i16, i15, i17);
                property = f6881b0;
            }
            m9098c = C1620f.m9007a(view, property, mo9009a);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C1649x.m9106c(viewGroup4, true);
            mo9048a(new j(viewGroup4));
        }
        return m9098c;
    }
}
