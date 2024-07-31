package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class n implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f3854d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spannable f3855a;

    /* renamed from: b, reason: collision with root package name */
    private final a f3856b;

    /* renamed from: c, reason: collision with root package name */
    private final PrecomputedText f3857c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f3858a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f3859b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3860c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3861d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f3862e;

        /* renamed from: androidx.core.text.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0051a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f3863a;

            /* renamed from: c, reason: collision with root package name */
            private int f3865c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f3866d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f3864b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0051a(TextPaint textPaint) {
                this.f3863a = textPaint;
            }

            public a a() {
                return new a(this.f3863a, this.f3864b, this.f3865c, this.f3866d);
            }

            public C0051a b(int i10) {
                this.f3865c = i10;
                return this;
            }

            public C0051a c(int i10) {
                this.f3866d = i10;
                return this;
            }

            public C0051a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3864b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f3858a = textPaint;
            textDirection = params.getTextDirection();
            this.f3859b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f3860c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f3861d = hyphenationFrequency;
            this.f3862e = Build.VERSION.SDK_INT < 29 ? null : params;
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
            this.f3862e = params;
            this.f3858a = textPaint;
            this.f3859b = textDirectionHeuristic;
            this.f3860c = i10;
            this.f3861d = i11;
        }

        public boolean a(a aVar) {
            if (this.f3860c == aVar.b() && this.f3861d == aVar.c() && this.f3858a.getTextSize() == aVar.e().getTextSize() && this.f3858a.getTextScaleX() == aVar.e().getTextScaleX() && this.f3858a.getTextSkewX() == aVar.e().getTextSkewX() && this.f3858a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f3858a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f3858a.getFlags() == aVar.e().getFlags() && this.f3858a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f3858a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f3858a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f3860c;
        }

        public int c() {
            return this.f3861d;
        }

        public TextDirectionHeuristic d() {
            return this.f3859b;
        }

        public TextPaint e() {
            return this.f3858a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f3859b == aVar.d();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Float.valueOf(this.f3858a.getTextSize()), Float.valueOf(this.f3858a.getTextScaleX()), Float.valueOf(this.f3858a.getTextSkewX()), Float.valueOf(this.f3858a.getLetterSpacing()), Integer.valueOf(this.f3858a.getFlags()), this.f3858a.getTextLocales(), this.f3858a.getTypeface(), Boolean.valueOf(this.f3858a.isElegantTextHeight()), this.f3859b, Integer.valueOf(this.f3860c), Integer.valueOf(this.f3861d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f3858a.getTextSize());
            sb2.append(", textScaleX=" + this.f3858a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f3858a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f3858a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f3858a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f3858a.getTextLocales());
            sb2.append(", typeface=" + this.f3858a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f3858a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb2.append(sb3.toString());
            }
            sb2.append(", textDir=" + this.f3859b);
            sb2.append(", breakStrategy=" + this.f3860c);
            sb2.append(", hyphenationFrequency=" + this.f3861d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a a() {
        return this.f3856b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f3855a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f3855a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3855a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3855a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3855a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return (T[]) this.f3855a.getSpans(i10, i11, cls);
        }
        spans = this.f3857c.getSpans(i10, i11, cls);
        return (T[]) spans;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3855a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3855a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3857c.removeSpan(obj);
        } else {
            this.f3855a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3857c.setSpan(obj, i10, i11, i12);
        } else {
            this.f3855a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f3855a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3855a.toString();
    }
}
