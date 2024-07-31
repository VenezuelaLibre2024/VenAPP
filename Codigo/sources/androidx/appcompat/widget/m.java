package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1548a;

    /* renamed from: b, reason: collision with root package name */
    private final c1.f f1549b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(TextView textView) {
        this.f1548a = textView;
        this.f1549b = new c1.f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1549b.a(inputFilterArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1548a.getContext().obtainStyledAttributes(attributeSet, g.j.f15432g0, i10, 0);
        try {
            int i11 = g.j.f15502u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.f1549b.b(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f1549b.c(z10);
    }
}
