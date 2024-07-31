package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C0984h;

/* renamed from: androidx.emoji2.text.i */
/* loaded from: classes.dex */
public abstract class AbstractC1231i extends ReplacementSpan {

    /* renamed from: b */
    private final C1229g f5107b;

    /* renamed from: a */
    private final Paint.FontMetricsInt f5106a = new Paint.FontMetricsInt();

    /* renamed from: c */
    private short f5108c = -1;

    /* renamed from: d */
    private short f5109d = -1;

    /* renamed from: e */
    private float f5110e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1231i(C1229g c1229g) {
        C0984h.m4834l(c1229g, "metadata cannot be null");
        this.f5107b = c1229g;
    }

    /* renamed from: a */
    public final C1229g m6680a() {
        return this.f5107b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m6681b() {
        return this.f5108c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f5106a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f5106a;
        this.f5110e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f5107b.m6656e();
        this.f5109d = (short) (this.f5107b.m6656e() * this.f5110e);
        short m6659i = (short) (this.f5107b.m6659i() * this.f5110e);
        this.f5108c = m6659i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f5106a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return m6659i;
    }
}
