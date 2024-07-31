package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p243n0.C9628k;

/* renamed from: androidx.constraintlayout.widget.m */
/* loaded from: classes.dex */
public abstract class AbstractC0771m extends AbstractC0761c {

    /* renamed from: u */
    private boolean f4120u;

    /* renamed from: v */
    private boolean f4121v;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0761c
    /* renamed from: i */
    public void mo3849i(ConstraintLayout constraintLayout) {
        m3848h(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0761c
    /* renamed from: m */
    public void mo3773m(AttributeSet attributeSet) {
        super.mo3773m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0769k.f4003n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f4021p1) {
                    this.f4120u = true;
                } else if (index == C0769k.f4066u1) {
                    this.f4121v = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4120u || this.f4121v) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f3498b; i10++) {
                    View m3821h = constraintLayout.m3821h(this.f3497a[i10]);
                    if (m3821h != null) {
                        if (this.f4120u) {
                            m3821h.setVisibility(visibility);
                        }
                        if (this.f4121v && elevation > 0.0f) {
                            m3821h.setTranslationZ(m3821h.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m3847g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        m3847g();
    }

    /* renamed from: t */
    public void m3904t(C9628k c9628k, int i10, int i11) {
    }
}
