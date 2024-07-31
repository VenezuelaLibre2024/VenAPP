package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p033c1.C1833f;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
class C0350m {

    /* renamed from: a */
    private final TextView f1823a;

    /* renamed from: b */
    private final C1833f f1824b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0350m(TextView textView) {
        this.f1823a = textView;
        this.f1824b = new C1833f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public InputFilter[] m1865a(InputFilter[] inputFilterArr) {
        return this.f1824b.m9849a(inputFilterArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1866b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1823a.getContext().obtainStyledAttributes(attributeSet, C7386j.f17010g0, i10, 0);
        try {
            int i11 = C7386j.f17080u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            m1868d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1867c(boolean z10) {
        this.f1824b.m9850b(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m1868d(boolean z10) {
        this.f1824b.m9851c(z10);
    }
}
