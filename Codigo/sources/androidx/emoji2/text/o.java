package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: f, reason: collision with root package name */
    private static Paint f4425f;

    public o(g gVar) {
        super(gVar);
    }

    private static Paint c() {
        if (f4425f == null) {
            TextPaint textPaint = new TextPaint();
            f4425f = textPaint;
            textPaint.setColor(e.b().c());
            f4425f.setStyle(Paint.Style.FILL);
        }
        return f4425f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, c());
        }
        a().a(canvas, f10, i13, paint);
    }
}
