package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.n2;
import androidx.core.view.o2;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a */
    protected final C0021a f1358a;

    /* renamed from: b */
    protected final Context f1359b;

    /* renamed from: c */
    protected ActionMenuView f1360c;

    /* renamed from: d */
    protected c f1361d;

    /* renamed from: e */
    protected int f1362e;

    /* renamed from: f */
    protected n2 f1363f;

    /* renamed from: r */
    private boolean f1364r;

    /* renamed from: s */
    private boolean f1365s;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C0021a implements o2 {

        /* renamed from: a */
        private boolean f1366a = false;

        /* renamed from: b */
        int f1367b;

        protected C0021a() {
        }

        @Override // androidx.core.view.o2
        public void a(View view) {
            this.f1366a = true;
        }

        @Override // androidx.core.view.o2
        public void b(View view) {
            if (this.f1366a) {
                return;
            }
            a aVar = a.this;
            aVar.f1363f = null;
            a.super.setVisibility(this.f1367b);
        }

        @Override // androidx.core.view.o2
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1366a = false;
        }

        public C0021a d(n2 n2Var, int i10) {
            a.this.f1363f = n2Var;
            this.f1367b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1358a = new C0021a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(g.a.f15261a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1359b = context;
        } else {
            this.f1359b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public n2 f(int i10, long j10) {
        n2 b10;
        n2 n2Var = this.f1363f;
        if (n2Var != null) {
            n2Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b10 = androidx.core.view.x0.c(this).b(1.0f);
        } else {
            b10 = androidx.core.view.x0.c(this).b(0.0f);
        }
        b10.f(j10);
        b10.h(this.f1358a.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.f1363f != null ? this.f1358a.f1367b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1362e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, g.j.f15401a, g.a.f15263c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(g.j.f15446j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1361d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1365s = false;
        }
        if (!this.f1365s) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1365s = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1365s = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1364r = false;
        }
        if (!this.f1364r) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1364r = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1364r = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1362e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            n2 n2Var = this.f1363f;
            if (n2Var != null) {
                n2Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
