package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.t0;

/* loaded from: classes.dex */
public class d1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: u */
    private static final Interpolator f1430u = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1431a;

    /* renamed from: b */
    private c f1432b;

    /* renamed from: c */
    t0 f1433c;

    /* renamed from: d */
    private Spinner f1434d;

    /* renamed from: e */
    private boolean f1435e;

    /* renamed from: f */
    int f1436f;

    /* renamed from: r */
    int f1437r;

    /* renamed from: s */
    private int f1438s;

    /* renamed from: t */
    private int f1439t;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1440a;

        a(View view) {
            this.f1440a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.smoothScrollTo(this.f1440a.getLeft() - ((d1.this.getWidth() - this.f1440a.getWidth()) / 2), 0);
            d1.this.f1431a = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return d1.this.f1433c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) d1.this.f1433c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return d1.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = d1.this.f1433c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = d1.this.f1433c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: a */
        private final int[] f1444a;

        /* renamed from: b */
        private a.c f1445b;

        /* renamed from: c */
        private TextView f1446c;

        /* renamed from: d */
        private ImageView f1447d;

        /* renamed from: e */
        private View f1448e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.d1.this = r5
                int r5 = g.a.f15264d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1444a = r1
                r4.f1445b = r7
                androidx.appcompat.widget.l1 r5 = androidx.appcompat.widget.l1.u(r6, r0, r1, r5, r3)
                boolean r6 = r5.r(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.f(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.v()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d1.d.<init>(androidx.appcompat.widget.d1, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1445b = cVar;
            c();
        }

        public a.c b() {
            return this.f1445b;
        }

        public void c() {
            a.c cVar = this.f1445b;
            View b10 = cVar.b();
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1448e = b10;
                TextView textView = this.f1446c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1447d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1447d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1448e;
            if (view != null) {
                removeView(view);
                this.f1448e = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1447d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1447d = appCompatImageView;
                }
                this.f1447d.setImageDrawable(c10);
                this.f1447d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1447d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1447d.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f1446c == null) {
                    i0 i0Var = new i0(getContext(), null, g.a.f15265e);
                    i0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    i0Var.setLayoutParams(layoutParams2);
                    addView(i0Var);
                    this.f1446c = i0Var;
                }
                this.f1446c.setText(d10);
                this.f1446c.setVisibility(0);
            } else {
                TextView textView2 = this.f1446c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1446c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1447d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            r1.a(this, z10 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (d1.this.f1436f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = d1.this.f1436f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        y yVar = new y(getContext(), null, g.a.f15268h);
        yVar.setLayoutParams(new t0.a(-2, -1));
        yVar.setOnItemSelectedListener(this);
        return yVar;
    }

    private boolean d() {
        Spinner spinner = this.f1434d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1434d == null) {
            this.f1434d = b();
        }
        removeView(this.f1433c);
        addView(this.f1434d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1434d.getAdapter() == null) {
            this.f1434d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1431a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1431a = null;
        }
        this.f1434d.setSelection(this.f1439t);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1434d);
        addView(this.f1433c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1434d.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1433c.getChildAt(i10);
        Runnable runnable = this.f1431a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1431a = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(this, getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1438s));
        } else {
            dVar.setFocusable(true);
            if (this.f1432b == null) {
                this.f1432b = new c();
            }
            dVar.setOnClickListener(this.f1432b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1431a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(getContext());
        setContentHeight(b10.f());
        this.f1437r = b10.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1431a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1433c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.f1436f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1436f = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.f1436f, this.f1437r);
        }
        this.f1436f = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1438s, 1073741824);
        if (!z10 && this.f1435e) {
            this.f1433c.measure(0, makeMeasureSpec);
            if (this.f1433c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z10 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1439t);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z10) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1435e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1438s = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1439t = i10;
        int childCount = this.f1433c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1433c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1434d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
