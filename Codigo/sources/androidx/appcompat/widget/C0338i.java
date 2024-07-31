package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0888a;
import androidx.core.widget.C1133c;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C0338i {

    /* renamed from: a */
    private final CompoundButton f1764a;

    /* renamed from: b */
    private ColorStateList f1765b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1766c = null;

    /* renamed from: d */
    private boolean f1767d = false;

    /* renamed from: e */
    private boolean f1768e = false;

    /* renamed from: f */
    private boolean f1769f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0338i(CompoundButton compoundButton) {
        this.f1764a = compoundButton;
    }

    /* renamed from: a */
    void m1745a() {
        Drawable m5541a = C1133c.m5541a(this.f1764a);
        if (m5541a != null) {
            if (this.f1767d || this.f1768e) {
                Drawable mutate = C0888a.m4545i(m5541a).mutate();
                if (this.f1767d) {
                    C0888a.m4543g(mutate, this.f1765b);
                }
                if (this.f1768e) {
                    C0888a.m4544h(mutate, this.f1766c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1764a.getDrawableState());
                }
                this.f1764a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1746b(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1747c() {
        return this.f1765b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1748d() {
        return this.f1766c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1749e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1764a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p111g.C7386j.f16956U0
            r8 = 0
            androidx.appcompat.widget.l1 r0 = androidx.appcompat.widget.C0349l1.m1845u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1764a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m1862q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C1116x0.m5256U(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p111g.C7386j.f16964W0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m1858m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1764a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p125h.C7605a.m23112b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = p111g.C7386j.f16960V0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m1858m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1764a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p125h.C7605a.m23112b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p111g.C7386j.f16968X0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1764a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m1848c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1133c.m5542b(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p111g.C7386j.f16972Y0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1764a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m1855j(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0360p0.m1909d(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1133c.m5543c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m1864v()
            return
        L84:
            r10 = move-exception
            r0.m1864v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0338i.m1749e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1750f() {
        if (this.f1769f) {
            this.f1769f = false;
        } else {
            this.f1769f = true;
            m1745a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1751g(ColorStateList colorStateList) {
        this.f1765b = colorStateList;
        this.f1767d = true;
        m1745a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1752h(PorterDuff.Mode mode) {
        this.f1766c = mode;
        this.f1768e = true;
        m1745a();
    }
}
