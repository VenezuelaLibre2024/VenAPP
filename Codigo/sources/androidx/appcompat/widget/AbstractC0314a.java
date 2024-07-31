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
import androidx.core.view.C1074n2;
import androidx.core.view.C1116x0;
import androidx.core.view.InterfaceC1079o2;
import p111g.C7377a;
import p111g.C7386j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0314a extends ViewGroup {

    /* renamed from: a */
    protected final a f1608a;

    /* renamed from: b */
    protected final Context f1609b;

    /* renamed from: c */
    protected ActionMenuView f1610c;

    /* renamed from: d */
    protected C0320c f1611d;

    /* renamed from: e */
    protected int f1612e;

    /* renamed from: f */
    protected C1074n2 f1613f;

    /* renamed from: r */
    private boolean f1614r;

    /* renamed from: s */
    private boolean f1615s;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class a implements InterfaceC1079o2 {

        /* renamed from: a */
        private boolean f1616a = false;

        /* renamed from: b */
        int f1617b;

        protected a() {
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: a */
        public void mo1574a(View view) {
            this.f1616a = true;
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: b */
        public void mo1032b(View view) {
            if (this.f1616a) {
                return;
            }
            AbstractC0314a abstractC0314a = AbstractC0314a.this;
            abstractC0314a.f1613f = null;
            AbstractC0314a.super.setVisibility(this.f1617b);
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: c */
        public void mo1033c(View view) {
            AbstractC0314a.super.setVisibility(0);
            this.f1616a = false;
        }

        /* renamed from: d */
        public a m1575d(C1074n2 c1074n2, int i10) {
            AbstractC0314a.this.f1613f = c1074n2;
            this.f1617b = i10;
            return this;
        }
    }

    AbstractC0314a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0314a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1608a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C7377a.f16697a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1609b = context;
        } else {
            this.f1609b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m1571d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m1572c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m1573e(View view, int i10, int i11, int i12, boolean z10) {
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

    /* renamed from: f */
    public C1074n2 mo1413f(int i10, long j10) {
        C1074n2 m5068b;
        C1074n2 c1074n2 = this.f1613f;
        if (c1074n2 != null) {
            c1074n2.m5069c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            m5068b = C1116x0.m5266c(this).m5068b(1.0f);
        } else {
            m5068b = C1116x0.m5266c(this).m5068b(0.0f);
        }
        m5068b.m5071f(j10);
        m5068b.m5073h(this.f1608a.m1575d(m5068b, i10));
        return m5068b;
    }

    public int getAnimatedVisibility() {
        return this.f1613f != null ? this.f1608a.f1617b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1612e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C7386j.f16979a, C7377a.f16699c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C7386j.f17024j, 0));
        obtainStyledAttributes.recycle();
        C0320c c0320c = this.f1611d;
        if (c0320c != null) {
            c0320c.m1627F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1615s = false;
        }
        if (!this.f1615s) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1615s = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1615s = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1614r = false;
        }
        if (!this.f1614r) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1614r = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1614r = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1612e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C1074n2 c1074n2 = this.f1613f;
            if (c1074n2 != null) {
                c1074n2.m5069c();
            }
            super.setVisibility(i10);
        }
    }
}
