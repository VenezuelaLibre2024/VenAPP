package b2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final m0 f6011a;

    /* renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f6012b;

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f6013c;

    /* loaded from: classes.dex */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(a0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            a0.g(view, f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return x0.p(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            x0.c0(view, rect);
        }
    }

    static {
        f6011a = Build.VERSION.SDK_INT >= 29 ? new l0() : new k0();
        f6012b = new a(Float.class, "translationAlpha");
        f6013c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        f6011a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z b(View view) {
        return new y(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return f6011a.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p0 d(View view) {
        return new o0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        f6011a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, int i10, int i11, int i12, int i13) {
        f6011a.d(view, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, float f10) {
        f6011a.e(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, int i10) {
        f6011a.f(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, Matrix matrix) {
        f6011a.g(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, Matrix matrix) {
        f6011a.h(view, matrix);
    }
}
