package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0753j;
import androidx.constraintlayout.widget.AbstractC0761c;
import androidx.constraintlayout.widget.C0769k;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.motion.widget.h */
/* loaded from: classes.dex */
public class C0751h extends AbstractC0761c implements C0753j.d {

    /* renamed from: u */
    private boolean f3296u;

    /* renamed from: v */
    private boolean f3297v;

    /* renamed from: w */
    private float f3298w;

    /* renamed from: x */
    protected View[] f3299x;

    @Override // androidx.constraintlayout.motion.widget.C0753j.d
    /* renamed from: a */
    public void mo3770a(C0753j c0753j, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.C0753j.d
    /* renamed from: b */
    public void mo3771b(C0753j c0753j, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.C0753j.d
    /* renamed from: c */
    public void mo3772c(C0753j c0753j, int i10, int i11) {
    }

    public float getProgress() {
        return this.f3298w;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761c
    /* renamed from: m */
    protected void mo3773m(AttributeSet attributeSet) {
        super.mo3773m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0769k.f3689B6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f3707D6) {
                    this.f3296u = obtainStyledAttributes.getBoolean(index, this.f3296u);
                } else if (index == C0769k.f3698C6) {
                    this.f3297v = obtainStyledAttributes.getBoolean(index, this.f3297v);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f3298w = f10;
        int i10 = 0;
        if (this.f3498b > 0) {
            this.f3299x = m3850l((ConstraintLayout) getParent());
            while (i10 < this.f3498b) {
                m3778x(this.f3299x[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof C0751h)) {
                m3778x(childAt, f10);
            }
            i10++;
        }
    }

    /* renamed from: t */
    public boolean m3774t() {
        return false;
    }

    /* renamed from: u */
    public boolean m3775u() {
        return this.f3297v;
    }

    /* renamed from: v */
    public boolean m3776v() {
        return this.f3296u;
    }

    /* renamed from: w */
    public void m3777w(Canvas canvas) {
    }

    /* renamed from: x */
    public void m3778x(View view, float f10) {
    }
}
