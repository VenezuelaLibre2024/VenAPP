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
import androidx.core.view.r2;
import androidx.core.view.x0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<View> f4664a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<View> f4665b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f4666c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4667d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        this.f4667d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d1.c.f13702h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(d1.c.f13703i) : classAttribute;
        String string = obtainStyledAttributes.getString(d1.c.f13704j);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment g02 = nVar.g0(id2);
        if (classAttribute != null && g02 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a10 = nVar.p0().a(context.getClassLoader(), classAttribute);
            a10.onInflate(context, attributeSet, (Bundle) null);
            nVar.m().l(true).c(this, a10, string).h();
        }
        nVar.T0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f4665b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f4664a == null) {
            this.f4664a = new ArrayList<>();
        }
        this.f4664a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (n.y0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (n.y0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        r2 u10 = r2.u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4666c;
        r2 u11 = onApplyWindowInsetsListener != null ? r2.u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : x0.N(this, u10);
        if (!u11.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                x0.e(getChildAt(i10), u11);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f4667d && this.f4664a != null) {
            for (int i10 = 0; i10 < this.f4664a.size(); i10++) {
                super.drawChild(canvas, this.f4664a.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f4667d || (arrayList = this.f4664a) == null || arrayList.size() <= 0 || !this.f4664a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f4665b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f4664a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f4667d = true;
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
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f4667d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f4666c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f4665b == null) {
                this.f4665b = new ArrayList<>();
            }
            this.f4665b.add(view);
        }
        super.startViewTransition(view);
    }
}
