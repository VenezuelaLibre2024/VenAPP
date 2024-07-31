package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.c implements j.d {

    /* renamed from: u */
    private boolean f2951u;

    /* renamed from: v */
    private boolean f2952v;

    /* renamed from: w */
    private float f2953w;

    /* renamed from: x */
    protected View[] f2954x;

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void a(j jVar, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void b(j jVar, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void c(j jVar, int i10, int i11) {
    }

    public float getProgress() {
        return this.f2953w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.k.B6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.k.D6) {
                    this.f2951u = obtainStyledAttributes.getBoolean(index, this.f2951u);
                } else if (index == androidx.constraintlayout.widget.k.C6) {
                    this.f2952v = obtainStyledAttributes.getBoolean(index, this.f2952v);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f2953w = f10;
        int i10 = 0;
        if (this.f3094b > 0) {
            this.f2954x = l((ConstraintLayout) getParent());
            while (i10 < this.f3094b) {
                x(this.f2954x[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof h)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f2952v;
    }

    public boolean v() {
        return this.f2951u;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f10) {
    }
}
