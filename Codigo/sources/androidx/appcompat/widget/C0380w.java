package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p111g.C7377a;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C0380w extends SeekBar {

    /* renamed from: a */
    private final C0383x f1986a;

    public C0380w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16692I);
    }

    public C0380w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0334g1.m1731a(this, getContext());
        C0383x c0383x = new C0383x(this);
        this.f1986a = c0383x;
        c0383x.mo1955c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1986a.m2043h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1986a.m2044i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1986a.m2042g(canvas);
    }
}
