package androidx.camera.core.impl.utils;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.core.util.C0984h;
import java.util.Comparator;
import p092f0.C7264d;

/* renamed from: androidx.camera.core.impl.utils.a */
/* loaded from: classes.dex */
public final class C0672a {

    /* renamed from: a */
    public static final Rational f2938a = new Rational(4, 3);

    /* renamed from: b */
    public static final Rational f2939b = new Rational(3, 4);

    /* renamed from: c */
    public static final Rational f2940c = new Rational(16, 9);

    /* renamed from: d */
    public static final Rational f2941d = new Rational(9, 16);

    /* renamed from: androidx.camera.core.impl.utils.a$a */
    /* loaded from: classes.dex */
    public static final class a implements Comparator<Rational> {

        /* renamed from: a */
        private final Rational f2942a;

        /* renamed from: b */
        private final RectF f2943b;

        /* renamed from: c */
        private final Rational f2944c;

        public a(Rational rational, Rational rational2) {
            this.f2942a = rational;
            this.f2944c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f2943b = m3249d(rational);
        }

        /* renamed from: b */
        private float m3247b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        /* renamed from: c */
        private float m3248c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        /* renamed from: d */
        private RectF m3249d(Rational rational) {
            return rational.floatValue() == this.f2944c.floatValue() ? new RectF(0.0f, 0.0f, this.f2944c.getNumerator(), this.f2944c.getDenominator()) : rational.floatValue() > this.f2944c.floatValue() ? new RectF(0.0f, 0.0f, this.f2944c.getNumerator(), (rational.getDenominator() * this.f2944c.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f2944c.getDenominator()) / rational.getDenominator(), this.f2944c.getDenominator());
        }

        /* renamed from: e */
        private boolean m3250e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF m3249d = m3249d(rational);
            RectF m3249d2 = m3249d(rational2);
            boolean m3250e = m3250e(m3249d, this.f2943b);
            boolean m3250e2 = m3250e(m3249d2, this.f2943b);
            if (m3250e && m3250e2) {
                return (int) Math.signum(m3247b(m3249d) - m3247b(m3249d2));
            }
            if (m3250e) {
                return -1;
            }
            if (m3250e2) {
                return 1;
            }
            return -((int) Math.signum(m3248c(m3249d, this.f2943b) - m3248c(m3249d2, this.f2943b)));
        }
    }

    /* renamed from: a */
    public static boolean m3243a(Size size, Rational rational) {
        return m3244b(size, rational, C7264d.f16273c);
    }

    /* renamed from: b */
    public static boolean m3244b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (C7264d.m21736a(size) >= C7264d.m21736a(size2)) {
            return m3245c(size, rational);
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m3245c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            return m3246d(Math.max(0, height + (-16)), width, rational) || m3246d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i10 == 0) {
            return m3246d(height, width, rational);
        }
        if (height % 16 == 0) {
            return m3246d(width, height, rational2);
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m3246d(int i10, int i11, Rational rational) {
        C0984h.m4823a(i11 % 16 == 0);
        double numerator = (i10 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }
}
