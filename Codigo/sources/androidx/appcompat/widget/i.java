package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f1489a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1490b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1491c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1492d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1493e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1494f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(CompoundButton compoundButton) {
        this.f1489a = compoundButton;
    }

    void a() {
        Drawable a10 = androidx.core.widget.c.a(this.f1489a);
        if (a10 != null) {
            if (this.f1492d || this.f1493e) {
                Drawable mutate = androidx.core.graphics.drawable.a.i(a10).mutate();
                if (this.f1492d) {
                    androidx.core.graphics.drawable.a.g(mutate, this.f1490b);
                }
                if (this.f1493e) {
                    androidx.core.graphics.drawable.a.h(mutate, this.f1491c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1489a.getDrawableState());
                }
                this.f1489a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1490b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1491c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1489a
            android.content.Context r0 = r0.getContext()
            int[] r3 = g.j.U0
            r8 = 0
            androidx.appcompat.widget.l1 r0 = androidx.appcompat.widget.l1.u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1489a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.x0.U(r1, r2, r3, r4, r5, r6, r7)
            int r10 = g.j.W0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1489a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = h.a.b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = g.j.V0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1489a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = h.a.b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = g.j.X0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1489a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.c.b(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = g.j.Y0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1489a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.p0.d(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.c.c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.v()
            return
        L84:
            r10 = move-exception
            r0.v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f1494f) {
            this.f1494f = false;
        } else {
            this.f1494f = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1490b = colorStateList;
        this.f1492d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1491c = mode;
        this.f1493e = true;
        a();
    }
}
