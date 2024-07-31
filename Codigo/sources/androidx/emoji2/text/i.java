package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* renamed from: b */
    private final g f4396b;

    /* renamed from: a */
    private final Paint.FontMetricsInt f4395a = new Paint.FontMetricsInt();

    /* renamed from: c */
    private short f4397c = -1;

    /* renamed from: d */
    private short f4398d = -1;

    /* renamed from: e */
    private float f4399e = 1.0f;

    public i(g gVar) {
        androidx.core.util.h.l(gVar, "metadata cannot be null");
        this.f4396b = gVar;
    }

    public final g a() {
        return this.f4396b;
    }

    public final int b() {
        return this.f4397c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f4395a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f4395a;
        this.f4399e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f4396b.e();
        this.f4398d = (short) (this.f4396b.e() * this.f4399e);
        short i12 = (short) (this.f4396b.i() * this.f4399e);
        this.f4397c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f4395a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
