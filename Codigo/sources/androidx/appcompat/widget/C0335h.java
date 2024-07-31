package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.C0888a;
import androidx.core.widget.C1132b;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
class C0335h {

    /* renamed from: a */
    private final CheckedTextView f1758a;

    /* renamed from: b */
    private ColorStateList f1759b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1760c = null;

    /* renamed from: d */
    private boolean f1761d = false;

    /* renamed from: e */
    private boolean f1762e = false;

    /* renamed from: f */
    private boolean f1763f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0335h(CheckedTextView checkedTextView) {
        this.f1758a = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1737a() {
        Drawable m5535a = C1132b.m5535a(this.f1758a);
        if (m5535a != null) {
            if (this.f1761d || this.f1762e) {
                Drawable mutate = C0888a.m4545i(m5535a).mutate();
                if (this.f1761d) {
                    C0888a.m4543g(mutate, this.f1759b);
                }
                if (this.f1762e) {
                    C0888a.m4544h(mutate, this.f1760c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1758a.getDrawableState());
                }
                this.f1758a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m1738b() {
        return this.f1759b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m1739c() {
        return this.f1760c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1740d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1758a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p111g.C7386j.f16936P0
            r8 = 0
            androidx.appcompat.widget.l1 r0 = androidx.appcompat.widget.C0349l1.m1845u(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1758a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m1862q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C1116x0.m5256U(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p111g.C7386j.f16944R0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m1858m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CheckedTextView r11 = r9.f1758a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p125h.C7605a.m23112b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = p111g.C7386j.f16940Q0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m1858m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CheckedTextView r11 = r9.f1758a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p125h.C7605a.m23112b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p111g.C7386j.f16948S0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CheckedTextView r11 = r9.f1758a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m1848c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1132b.m5536b(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p111g.C7386j.f16952T0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1863r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CheckedTextView r11 = r9.f1758a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m1855j(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0360p0.m1909d(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1132b.m5537c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m1864v()
            return
        L84:
            r10 = move-exception
            r0.m1864v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0335h.m1740d(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1741e() {
        if (this.f1763f) {
            this.f1763f = false;
        } else {
            this.f1763f = true;
            m1737a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1742f(ColorStateList colorStateList) {
        this.f1759b = colorStateList;
        this.f1761d = true;
        m1737a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1743g(PorterDuff.Mode mode) {
        this.f1760c = mode;
        this.f1762e = true;
        m1737a();
    }
}
