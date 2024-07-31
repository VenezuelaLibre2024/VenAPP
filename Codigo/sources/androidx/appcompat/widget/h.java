package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f1483a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1484b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1485c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1486d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1487e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1488f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(CheckedTextView checkedTextView) {
        this.f1483a = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = androidx.core.widget.b.a(this.f1483a);
        if (a10 != null) {
            if (this.f1486d || this.f1487e) {
                Drawable mutate = androidx.core.graphics.drawable.a.i(a10).mutate();
                if (this.f1486d) {
                    androidx.core.graphics.drawable.a.g(mutate, this.f1484b);
                }
                if (this.f1487e) {
                    androidx.core.graphics.drawable.a.h(mutate, this.f1485c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1483a.getDrawableState());
                }
                this.f1483a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f1484b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f1485c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1483a
            android.content.Context r0 = r0.getContext()
            int[] r3 = g.j.P0
            r8 = 0
            androidx.appcompat.widget.l1 r0 = androidx.appcompat.widget.l1.u(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1483a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.x0.U(r1, r2, r3, r4, r5, r6, r7)
            int r10 = g.j.R0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CheckedTextView r11 = r9.f1483a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = h.a.b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = g.j.Q0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CheckedTextView r11 = r9.f1483a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = h.a.b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = g.j.S0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CheckedTextView r11 = r9.f1483a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.b.b(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = g.j.T0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CheckedTextView r11 = r9.f1483a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.p0.d(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.b.c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.v()
            return
        L84:
            r10 = move-exception
            r0.v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.d(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f1488f) {
            this.f1488f = false;
        } else {
            this.f1488f = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f1484b = colorStateList;
        this.f1486d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f1485c = mode;
        this.f1487e = true;
        a();
    }
}
