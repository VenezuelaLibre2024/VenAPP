package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<b1.a> f4378d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f4379a;

    /* renamed from: b, reason: collision with root package name */
    private final m f4380b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f4381c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(m mVar, int i10) {
        this.f4380b = mVar;
        this.f4379a = i10;
    }

    private b1.a g() {
        ThreadLocal<b1.a> threadLocal = f4378d;
        b1.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new b1.a();
            threadLocal.set(aVar);
        }
        this.f4380b.d().j(aVar, this.f4379a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f4380b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        canvas.drawText(this.f4380b.c(), this.f4379a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f4381c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z10) {
        this.f4381c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
