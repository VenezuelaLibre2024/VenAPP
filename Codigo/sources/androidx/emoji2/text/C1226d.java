package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.C0902h;
import androidx.emoji2.text.C1227e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes.dex */
public class C1226d implements C1227e.d {

    /* renamed from: b */
    private static final ThreadLocal<StringBuilder> f5052b = new ThreadLocal<>();

    /* renamed from: a */
    private final TextPaint f5053a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1226d() {
        TextPaint textPaint = new TextPaint();
        this.f5053a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m6619b() {
        ThreadLocal<StringBuilder> threadLocal = f5052b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.C1227e.d
    /* renamed from: a */
    public boolean mo6620a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder m6619b = m6619b();
        m6619b.setLength(0);
        while (i10 < i11) {
            m6619b.append(charSequence.charAt(i10));
            i10++;
        }
        return C0902h.m4592a(this.f5053a, m6619b.toString());
    }
}
