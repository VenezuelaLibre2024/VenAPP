package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C1094r2;
import androidx.core.view.C1116x0;
import java.util.ArrayList;
import p052d1.C6817c;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public final class C1266h extends FrameLayout {

    /* renamed from: a */
    private ArrayList<View> f5402a;

    /* renamed from: b */
    private ArrayList<View> f5403b;

    /* renamed from: c */
    private View.OnApplyWindowInsetsListener f5404c;

    /* renamed from: d */
    private boolean f5405d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1266h(Context context, AttributeSet attributeSet, AbstractC1272n abstractC1272n) {
        super(context, attributeSet);
        String str;
        this.f5405d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6817c.f15056h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C6817c.f15057i) : classAttribute;
        String string = obtainStyledAttributes.getString(C6817c.f15058j);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment m7078g0 = abstractC1272n.m7078g0(id2);
        if (classAttribute != null && m7078g0 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment mo6968a = abstractC1272n.m7097p0().mo6968a(context.getClassLoader(), classAttribute);
            mo6968a.onInflate(context, attributeSet, (Bundle) null);
            abstractC1272n.m7092m().m7209l(true).m7205c(this, mo6968a, string).mo6843h();
        }
        abstractC1272n.m7060T0(this);
    }

    /* renamed from: a */
    private void m6940a(View view) {
        ArrayList<View> arrayList = this.f5403b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f5402a == null) {
            this.f5402a = new ArrayList<>();
        }
        this.f5402a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (AbstractC1272n.m7025y0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (AbstractC1272n.m7025y0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1094r2 m5135u = C1094r2.m5135u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5404c;
        C1094r2 m5135u2 = onApplyWindowInsetsListener != null ? C1094r2.m5135u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C1116x0.m5249N(this, m5135u);
        if (!m5135u2.m5149n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C1116x0.m5270e(getChildAt(i10), m5135u2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f5405d && this.f5402a != null) {
            for (int i10 = 0; i10 < this.f5402a.size(); i10++) {
                super.drawChild(canvas, this.f5402a.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f5405d || (arrayList = this.f5402a) == null || arrayList.size() <= 0 || !this.f5402a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f5403b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f5402a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f5405d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m6940a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            m6940a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m6940a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        m6940a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m6940a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m6940a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m6940a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f5405d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f5404c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f5403b == null) {
                this.f5403b = new ArrayList<>();
            }
            this.f5403b.add(view);
        }
        super.startViewTransition(view);
    }
}
