package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.core.util.C0984h;

/* renamed from: androidx.camera.core.impl.utils.r */
/* loaded from: classes.dex */
public class C0689r {

    /* renamed from: a */
    public static final RectF f3003a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static Matrix m3343a(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f3003a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: b */
    public static Matrix m3344b(RectF rectF, RectF rectF2, int i10) {
        return m3345c(rectF, rectF2, i10, false);
    }

    /* renamed from: c */
    public static Matrix m3345c(RectF rectF, RectF rectF2, int i10, boolean z10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f3003a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(m3343a(rectF2));
        return matrix;
    }

    /* renamed from: d */
    public static Size m3346d(Rect rect, int i10) {
        return m3353k(m3351i(rect), i10);
    }

    /* renamed from: e */
    public static boolean m3347e(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    /* renamed from: f */
    public static boolean m3348f(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i10);
    }

    /* renamed from: g */
    public static boolean m3349g(Size size, Size size2) {
        return m3350h(size, false, size2, false);
    }

    /* renamed from: h */
    public static boolean m3350h(Size size, boolean z10, Size size2, boolean z11) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z10) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z11) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    /* renamed from: i */
    public static Size m3351i(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* renamed from: j */
    public static Size m3352j(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: k */
    public static Size m3353k(Size size, int i10) {
        C0984h.m4824b(i10 % 90 == 0, "Invalid rotation degrees: " + i10);
        return m3348f(m3359q(i10)) ? m3352j(size) : size;
    }

    /* renamed from: l */
    public static Rect m3354l(Size size) {
        return m3355m(size, 0, 0);
    }

    /* renamed from: m */
    public static Rect m3355m(Size size, int i10, int i11) {
        return new Rect(i10, i11, size.getWidth() + i10, size.getHeight() + i11);
    }

    /* renamed from: n */
    public static RectF m3356n(Size size) {
        return m3357o(size, 0, 0);
    }

    /* renamed from: o */
    public static RectF m3357o(Size size, int i10, int i11) {
        return new RectF(i10, i11, i10 + size.getWidth(), i11 + size.getHeight());
    }

    /* renamed from: p */
    public static Matrix m3358p(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    /* renamed from: q */
    public static int m3359q(int i10) {
        return ((i10 % 360) + 360) % 360;
    }
}
