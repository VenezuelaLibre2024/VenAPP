package androidx.camera.core.impl.utils;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f2594a = new Rational(4, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final Rational f2595b = new Rational(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final Rational f2596c = new Rational(16, 9);

    /* renamed from: d, reason: collision with root package name */
    public static final Rational f2597d = new Rational(9, 16);

    /* renamed from: androidx.camera.core.impl.utils.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0027a implements Comparator<Rational> {

        /* renamed from: a, reason: collision with root package name */
        private final Rational f2598a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f2599b;

        /* renamed from: c, reason: collision with root package name */
        private final Rational f2600c;

        public C0027a(Rational rational, Rational rational2) {
            this.f2598a = rational;
            this.f2600c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f2599b = d(rational);
        }

        private float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        private float c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF d(Rational rational) {
            return rational.floatValue() == this.f2600c.floatValue() ? new RectF(0.0f, 0.0f, this.f2600c.getNumerator(), this.f2600c.getDenominator()) : rational.floatValue() > this.f2600c.floatValue() ? new RectF(0.0f, 0.0f, this.f2600c.getNumerator(), (rational.getDenominator() * this.f2600c.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f2600c.getDenominator()) / rational.getDenominator(), this.f2600c.getDenominator());
        }

        private boolean e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF d10 = d(rational);
            RectF d11 = d(rational2);
            boolean e10 = e(d10, this.f2599b);
            boolean e11 = e(d11, this.f2599b);
            if (e10 && e11) {
                return (int) Math.signum(b(d10) - b(d11));
            }
            if (e10) {
                return -1;
            }
            if (e11) {
                return 1;
            }
            return -((int) Math.signum(c(d10, this.f2599b) - c(d11, this.f2599b)));
        }
    }

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, f0.d.f14850c);
    }

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (f0.d.a(size) >= f0.d.a(size2)) {
            return c(size, rational);
        }
        return false;
    }

    private static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            return d(Math.max(0, height + (-16)), width, rational) || d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i10 == 0) {
            return d(height, width, rational);
        }
        if (height % 16 == 0) {
            return d(width, height, rational2);
        }
        return false;
    }

    private static boolean d(int i10, int i11, Rational rational) {
        androidx.core.util.h.a(i11 % 16 == 0);
        double numerator = (i10 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }
}
