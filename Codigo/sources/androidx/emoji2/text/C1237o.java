package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
/* loaded from: classes.dex */
public final class C1237o extends AbstractC1231i {

    /* renamed from: f */
    private static Paint f5136f;

    public C1237o(C1229g c1229g) {
        super(c1229g);
    }

    /* renamed from: c */
    private static Paint m6722c() {
        if (f5136f == null) {
            TextPaint textPaint = new TextPaint();
            f5136f = textPaint;
            textPaint.setColor(C1227e.m6622b().m6629c());
            f5136f.setStyle(Paint.Style.FILL);
        }
        return f5136f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (C1227e.m6622b().m6631i()) {
            canvas.drawRect(f10, i12, f10 + m6681b(), i14, m6722c());
        }
        m6680a().m6652a(canvas, f10, i13, paint);
    }
}
