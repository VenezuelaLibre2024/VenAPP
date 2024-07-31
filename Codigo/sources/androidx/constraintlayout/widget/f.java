package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class f extends ViewGroup {

    /* renamed from: a */
    e f3225a;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;

        /* renamed from: x0 */
        public float f3226x0;

        /* renamed from: y0 */
        public boolean f3227y0;

        /* renamed from: z0 */
        public float f3228z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f3226x0 = 1.0f;
            this.f3227y0 = false;
            this.f3228z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3226x0 = 1.0f;
            this.f3227y0 = false;
            this.f3228z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f3337l4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f3346m4) {
                    this.f3226x0 = obtainStyledAttributes.getFloat(index, this.f3226x0);
                } else if (index == k.f3445x4) {
                    this.f3228z0 = obtainStyledAttributes.getFloat(index, this.f3228z0);
                    this.f3227y0 = true;
                } else if (index == k.f3418u4) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == k.f3427v4) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == k.f3409t4) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == k.f3391r4) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == k.f3400s4) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == k.f3355n4) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == k.f3364o4) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == k.f3373p4) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == k.f3382q4) {
                    this.I0 = obtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == k.f3436w4) {
                    this.J0 = obtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e getConstraintSet() {
        if (this.f3225a == null) {
            this.f3225a = new e();
        }
        this.f3225a.g(this);
        return this.f3225a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
