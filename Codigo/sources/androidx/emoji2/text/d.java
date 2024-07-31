package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements e.d {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f4341b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f4342a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        TextPaint textPaint = new TextPaint();
        this.f4342a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f4341b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.d
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.h.a(this.f4342a, b10.toString());
    }
}
