package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p111g.C7377a;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public class C0374u extends RatingBar {

    /* renamed from: a */
    private final C0368s f1925a;

    public C0374u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16690G);
    }

    public C0374u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0334g1.m1731a(this, getContext());
        C0368s c0368s = new C0368s(this);
        this.f1925a = c0368s;
        c0368s.mo1955c(attributeSet, i10);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap m1954b = this.f1925a.m1954b();
        if (m1954b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m1954b.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
