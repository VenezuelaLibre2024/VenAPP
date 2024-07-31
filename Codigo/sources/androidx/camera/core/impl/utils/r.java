package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f2659a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f2659a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix b(RectF rectF, RectF rectF2, int i10) {
        return c(rectF, rectF2, i10, false);
    }

    public static Matrix c(RectF rectF, RectF rectF2, int i10, boolean z10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f2659a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(a(rectF2));
        return matrix;
    }

    public static Size d(Rect rect, int i10) {
        return k(i(rect), i10);
    }

    public static boolean e(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean f(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i10);
    }

    public static boolean g(Size size, Size size2) {
        return h(size, false, size2, false);
    }

    public static boolean h(Size size, boolean z10, Size size2, boolean z11) {
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

    public static Size i(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size j(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static Size k(Size size, int i10) {
        androidx.core.util.h.b(i10 % 90 == 0, "Invalid rotation degrees: " + i10);
        return f(q(i10)) ? j(size) : size;
    }

    public static Rect l(Size size) {
        return m(size, 0, 0);
    }

    public static Rect m(Size size, int i10, int i11) {
        return new Rect(i10, i11, size.getWidth() + i10, size.getHeight() + i11);
    }

    public static RectF n(Size size) {
        return o(size, 0, 0);
    }

    public static RectF o(Size size, int i10, int i11) {
        return new RectF(i10, i11, i10 + size.getWidth(), i11 + size.getHeight());
    }

    public static Matrix p(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static int q(int i10) {
        return ((i10 % 360) + 360) % 360;
    }
}
