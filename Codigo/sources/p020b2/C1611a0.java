package p020b2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C1116x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b2.a0 */
/* loaded from: classes.dex */
public class C1611a0 {

    /* renamed from: a */
    private static final C1635m0 f6873a;

    /* renamed from: b */
    static final Property<View, Float> f6874b;

    /* renamed from: c */
    static final Property<View, Rect> f6875c;

    /* renamed from: b2.a0$a */
    /* loaded from: classes.dex */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C1611a0.m8956c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C1611a0.m8960g(view, f10.floatValue());
        }
    }

    /* renamed from: b2.a0$b */
    /* loaded from: classes.dex */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C1116x0.m5291p(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C1116x0.m5267c0(view, rect);
        }
    }

    static {
        f6873a = Build.VERSION.SDK_INT >= 29 ? new C1633l0() : new C1631k0();
        f6874b = new a(Float.class, "translationAlpha");
        f6875c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8954a(View view) {
        f6873a.mo9000a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1651z m8955b(View view) {
        return new C1650y(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m8956c(View view) {
        return f6873a.mo9001b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC1641p0 m8957d(View view) {
        return new C1639o0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m8958e(View view) {
        f6873a.mo9002c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m8959f(View view, int i10, int i11, int i12, int i13) {
        f6873a.mo9014d(view, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m8960g(View view, float f10) {
        f6873a.mo9003e(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m8961h(View view, int i10) {
        f6873a.mo9020f(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m8962i(View view, Matrix matrix) {
        f6873a.mo9010g(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m8963j(View view, Matrix matrix) {
        f6873a.mo9011h(view, matrix);
    }
}
