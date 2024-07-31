package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p019b1.C1605a;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public class C1229g {

    /* renamed from: d */
    private static final ThreadLocal<C1605a> f5089d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f5090a;

    /* renamed from: b */
    private final C1235m f5091b;

    /* renamed from: c */
    private volatile int f5092c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1229g(C1235m c1235m, int i10) {
        this.f5091b = c1235m;
        this.f5090a = i10;
    }

    /* renamed from: g */
    private C1605a m6651g() {
        ThreadLocal<C1605a> threadLocal = f5089d;
        C1605a c1605a = threadLocal.get();
        if (c1605a == null) {
            c1605a = new C1605a();
            threadLocal.set(c1605a);
        }
        this.f5091b.m6702d().m8942j(c1605a, this.f5090a);
        return c1605a;
    }

    /* renamed from: a */
    public void m6652a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface m6705g = this.f5091b.m6705g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m6705g);
        canvas.drawText(this.f5091b.m6701c(), this.f5090a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m6653b(int i10) {
        return m6651g().m8931h(i10);
    }

    /* renamed from: c */
    public int m6654c() {
        return m6651g().m8932i();
    }

    /* renamed from: d */
    public int m6655d() {
        return this.f5092c;
    }

    /* renamed from: e */
    public short m6656e() {
        return m6651g().m8934k();
    }

    /* renamed from: f */
    public int m6657f() {
        return m6651g().m8935l();
    }

    /* renamed from: h */
    public short m6658h() {
        return m6651g().m8936m();
    }

    /* renamed from: i */
    public short m6659i() {
        return m6651g().m8937n();
    }

    /* renamed from: j */
    public boolean m6660j() {
        return m6651g().m8933j();
    }

    /* renamed from: k */
    public void m6661k(boolean z10) {
        this.f5092c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(m6657f()));
        sb2.append(", codepoints:");
        int m6654c = m6654c();
        for (int i10 = 0; i10 < m6654c; i10++) {
            sb2.append(Integer.toHexString(m6653b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
