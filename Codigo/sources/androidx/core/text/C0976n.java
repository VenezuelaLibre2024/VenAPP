package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C0979c;

/* renamed from: androidx.core.text.n */
/* loaded from: classes.dex */
public class C0976n implements Spannable {

    /* renamed from: d */
    private static final Object f4526d = new Object();

    /* renamed from: a */
    private final Spannable f4527a;

    /* renamed from: b */
    private final a f4528b;

    /* renamed from: c */
    private final PrecomputedText f4529c;

    /* renamed from: androidx.core.text.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f4530a;

        /* renamed from: b */
        private final TextDirectionHeuristic f4531b;

        /* renamed from: c */
        private final int f4532c;

        /* renamed from: d */
        private final int f4533d;

        /* renamed from: e */
        final PrecomputedText.Params f4534e;

        /* renamed from: androidx.core.text.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13161a {

            /* renamed from: a */
            private final TextPaint f4535a;

            /* renamed from: c */
            private int f4537c = 1;

            /* renamed from: d */
            private int f4538d = 1;

            /* renamed from: b */
            private TextDirectionHeuristic f4536b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C13161a(TextPaint textPaint) {
                this.f4535a = textPaint;
            }

            /* renamed from: a */
            public a m4807a() {
                return new a(this.f4535a, this.f4536b, this.f4537c, this.f4538d);
            }

            /* renamed from: b */
            public C13161a m4808b(int i10) {
                this.f4537c = i10;
                return this;
            }

            /* renamed from: c */
            public C13161a m4809c(int i10) {
                this.f4538d = i10;
                return this;
            }

            /* renamed from: d */
            public C13161a m4810d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f4536b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f4530a = textPaint;
            textDirection = params.getTextDirection();
            this.f4531b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f4532c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f4533d = hyphenationFrequency;
            this.f4534e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            PrecomputedText.Params params;
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                params = textDirection.build();
            } else {
                params = null;
            }
            this.f4534e = params;
            this.f4530a = textPaint;
            this.f4531b = textDirectionHeuristic;
            this.f4532c = i10;
            this.f4533d = i11;
        }

        /* renamed from: a */
        public boolean m4802a(a aVar) {
            if (this.f4532c == aVar.m4803b() && this.f4533d == aVar.m4804c() && this.f4530a.getTextSize() == aVar.m4806e().getTextSize() && this.f4530a.getTextScaleX() == aVar.m4806e().getTextScaleX() && this.f4530a.getTextSkewX() == aVar.m4806e().getTextSkewX() && this.f4530a.getLetterSpacing() == aVar.m4806e().getLetterSpacing() && TextUtils.equals(this.f4530a.getFontFeatureSettings(), aVar.m4806e().getFontFeatureSettings()) && this.f4530a.getFlags() == aVar.m4806e().getFlags() && this.f4530a.getTextLocales().equals(aVar.m4806e().getTextLocales())) {
                return this.f4530a.getTypeface() == null ? aVar.m4806e().getTypeface() == null : this.f4530a.getTypeface().equals(aVar.m4806e().getTypeface());
            }
            return false;
        }

        /* renamed from: b */
        public int m4803b() {
            return this.f4532c;
        }

        /* renamed from: c */
        public int m4804c() {
            return this.f4533d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m4805d() {
            return this.f4531b;
        }

        /* renamed from: e */
        public TextPaint m4806e() {
            return this.f4530a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m4802a(aVar) && this.f4531b == aVar.m4805d();
        }

        public int hashCode() {
            return C0979c.m4813b(Float.valueOf(this.f4530a.getTextSize()), Float.valueOf(this.f4530a.getTextScaleX()), Float.valueOf(this.f4530a.getTextSkewX()), Float.valueOf(this.f4530a.getLetterSpacing()), Integer.valueOf(this.f4530a.getFlags()), this.f4530a.getTextLocales(), this.f4530a.getTypeface(), Boolean.valueOf(this.f4530a.isElegantTextHeight()), this.f4531b, Integer.valueOf(this.f4532c), Integer.valueOf(this.f4533d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f4530a.getTextSize());
            sb2.append(", textScaleX=" + this.f4530a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f4530a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f4530a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f4530a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f4530a.getTextLocales());
            sb2.append(", typeface=" + this.f4530a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f4530a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb2.append(sb3.toString());
            }
            sb2.append(", textDir=" + this.f4531b);
            sb2.append(", breakStrategy=" + this.f4532c);
            sb2.append(", hyphenationFrequency=" + this.f4533d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public a m4800a() {
        return this.f4528b;
    }

    /* renamed from: b */
    public PrecomputedText m4801b() {
        Spannable spannable = this.f4527a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f4527a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f4527a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f4527a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f4527a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return (T[]) this.f4527a.getSpans(i10, i11, cls);
        }
        spans = this.f4529c.getSpans(i10, i11, cls);
        return (T[]) spans;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f4527a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f4527a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4529c.removeSpan(obj);
        } else {
            this.f4527a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4529c.setSpan(obj, i10, i11, i12);
        } else {
            this.f4527a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f4527a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f4527a.toString();
    }
}
