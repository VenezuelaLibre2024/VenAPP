package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.f */
/* loaded from: classes.dex */
public class C0764f extends ViewGroup {

    /* renamed from: a */
    C0763e f3655a;

    /* renamed from: androidx.constraintlayout.widget.f$a */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.C0757b {

        /* renamed from: A0 */
        public float f3656A0;

        /* renamed from: B0 */
        public float f3657B0;

        /* renamed from: C0 */
        public float f3658C0;

        /* renamed from: D0 */
        public float f3659D0;

        /* renamed from: E0 */
        public float f3660E0;

        /* renamed from: F0 */
        public float f3661F0;

        /* renamed from: G0 */
        public float f3662G0;

        /* renamed from: H0 */
        public float f3663H0;

        /* renamed from: I0 */
        public float f3664I0;

        /* renamed from: J0 */
        public float f3665J0;

        /* renamed from: x0 */
        public float f3666x0;

        /* renamed from: y0 */
        public boolean f3667y0;

        /* renamed from: z0 */
        public float f3668z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f3666x0 = 1.0f;
            this.f3667y0 = false;
            this.f3668z0 = 0.0f;
            this.f3656A0 = 0.0f;
            this.f3657B0 = 0.0f;
            this.f3658C0 = 0.0f;
            this.f3659D0 = 1.0f;
            this.f3660E0 = 1.0f;
            this.f3661F0 = 0.0f;
            this.f3662G0 = 0.0f;
            this.f3663H0 = 0.0f;
            this.f3664I0 = 0.0f;
            this.f3665J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3666x0 = 1.0f;
            this.f3667y0 = false;
            this.f3668z0 = 0.0f;
            this.f3656A0 = 0.0f;
            this.f3657B0 = 0.0f;
            this.f3658C0 = 0.0f;
            this.f3659D0 = 1.0f;
            this.f3660E0 = 1.0f;
            this.f3661F0 = 0.0f;
            this.f3662G0 = 0.0f;
            this.f3663H0 = 0.0f;
            this.f3664I0 = 0.0f;
            this.f3665J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0769k.f3988l4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f3997m4) {
                    this.f3666x0 = obtainStyledAttributes.getFloat(index, this.f3666x0);
                } else if (index == C0769k.f4096x4) {
                    this.f3668z0 = obtainStyledAttributes.getFloat(index, this.f3668z0);
                    this.f3667y0 = true;
                } else if (index == C0769k.f4069u4) {
                    this.f3657B0 = obtainStyledAttributes.getFloat(index, this.f3657B0);
                } else if (index == C0769k.f4078v4) {
                    this.f3658C0 = obtainStyledAttributes.getFloat(index, this.f3658C0);
                } else if (index == C0769k.f4060t4) {
                    this.f3656A0 = obtainStyledAttributes.getFloat(index, this.f3656A0);
                } else if (index == C0769k.f4042r4) {
                    this.f3659D0 = obtainStyledAttributes.getFloat(index, this.f3659D0);
                } else if (index == C0769k.f4051s4) {
                    this.f3660E0 = obtainStyledAttributes.getFloat(index, this.f3660E0);
                } else if (index == C0769k.f4006n4) {
                    this.f3661F0 = obtainStyledAttributes.getFloat(index, this.f3661F0);
                } else if (index == C0769k.f4015o4) {
                    this.f3662G0 = obtainStyledAttributes.getFloat(index, this.f3662G0);
                } else if (index == C0769k.f4024p4) {
                    this.f3663H0 = obtainStyledAttributes.getFloat(index, this.f3663H0);
                } else if (index == C0769k.f4033q4) {
                    this.f3664I0 = obtainStyledAttributes.getFloat(index, this.f3664I0);
                } else if (index == C0769k.f4087w4) {
                    this.f3665J0 = obtainStyledAttributes.getFloat(index, this.f3665J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0757b(layoutParams);
    }

    public C0763e getConstraintSet() {
        if (this.f3655a == null) {
            this.f3655a = new C0763e();
        }
        this.f3655a.m3877g(this);
        return this.f3655a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
