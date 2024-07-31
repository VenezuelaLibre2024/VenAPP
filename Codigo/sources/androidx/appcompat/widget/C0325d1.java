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
import androidx.appcompat.app.AbstractC0218a;
import androidx.appcompat.view.C0242a;
import androidx.appcompat.widget.C0372t0;
import p111g.C7377a;

/* renamed from: androidx.appcompat.widget.d1 */
/* loaded from: classes.dex */
public class C0325d1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: u */
    private static final Interpolator f1695u = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1696a;

    /* renamed from: b */
    private c f1697b;

    /* renamed from: c */
    C0372t0 f1698c;

    /* renamed from: d */
    private Spinner f1699d;

    /* renamed from: e */
    private boolean f1700e;

    /* renamed from: f */
    int f1701f;

    /* renamed from: r */
    int f1702r;

    /* renamed from: s */
    private int f1703s;

    /* renamed from: t */
    private int f1704t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.d1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1705a;

        a(View view) {
            this.f1705a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0325d1.this.smoothScrollTo(this.f1705a.getLeft() - ((C0325d1.this.getWidth() - this.f1705a.getWidth()) / 2), 0);
            C0325d1.this.f1696a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d1$b */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0325d1.this.f1698c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) C0325d1.this.f1698c.getChildAt(i10)).m1692b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0325d1.this.m1690c((AbstractC0218a.c) getItem(i10), true);
            }
            ((d) view).m1691a((AbstractC0218a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d1$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1692b().m903e();
            int childCount = C0325d1.this.f1698c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = C0325d1.this.f1698c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d1$d */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: a */
        private final int[] f1709a;

        /* renamed from: b */
        private AbstractC0218a.c f1710b;

        /* renamed from: c */
        private TextView f1711c;

        /* renamed from: d */
        private ImageView f1712d;

        /* renamed from: e */
        private View f1713e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.Context r6, androidx.appcompat.app.AbstractC0218a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0325d1.this = r5
                int r5 = p111g.C7377a.f16700d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1709a = r1
                r4.f1710b = r7
                androidx.appcompat.widget.l1 r5 = androidx.appcompat.widget.C0349l1.m1845u(r6, r0, r1, r5, r3)
                boolean r6 = r5.m1863r(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.m1851f(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.m1864v()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.m1693c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0325d1.d.<init>(androidx.appcompat.widget.d1, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        /* renamed from: a */
        public void m1691a(AbstractC0218a.c cVar) {
            this.f1710b = cVar;
            m1693c();
        }

        /* renamed from: b */
        public AbstractC0218a.c m1692b() {
            return this.f1710b;
        }

        /* renamed from: c */
        public void m1693c() {
            AbstractC0218a.c cVar = this.f1710b;
            View m900b = cVar.m900b();
            if (m900b != null) {
                ViewParent parent = m900b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m900b);
                    }
                    addView(m900b);
                }
                this.f1713e = m900b;
                TextView textView = this.f1711c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1712d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1712d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1713e;
            if (view != null) {
                removeView(view);
                this.f1713e = null;
            }
            Drawable m901c = cVar.m901c();
            CharSequence m902d = cVar.m902d();
            if (m901c != null) {
                if (this.f1712d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1712d = appCompatImageView;
                }
                this.f1712d.setImageDrawable(m901c);
                this.f1712d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1712d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1712d.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(m902d);
            if (z10) {
                if (this.f1711c == null) {
                    C0339i0 c0339i0 = new C0339i0(getContext(), null, C7377a.f16701e);
                    c0339i0.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0339i0.setLayoutParams(layoutParams2);
                    addView(c0339i0);
                    this.f1711c = c0339i0;
                }
                this.f1711c.setText(m902d);
                this.f1711c.setVisibility(0);
            } else {
                TextView textView2 = this.f1711c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1711c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1712d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m899a());
            }
            C0367r1.m1950a(this, z10 ? null : cVar.m899a());
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
            if (C0325d1.this.f1701f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = C0325d1.this.f1701f;
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

    /* renamed from: b */
    private Spinner m1685b() {
        C0386y c0386y = new C0386y(getContext(), null, C7377a.f16704h);
        c0386y.setLayoutParams(new C0372t0.a(-2, -1));
        c0386y.setOnItemSelectedListener(this);
        return c0386y;
    }

    /* renamed from: d */
    private boolean m1686d() {
        Spinner spinner = this.f1699d;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1687e() {
        if (m1686d()) {
            return;
        }
        if (this.f1699d == null) {
            this.f1699d = m1685b();
        }
        removeView(this.f1698c);
        addView(this.f1699d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1699d.getAdapter() == null) {
            this.f1699d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1696a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1696a = null;
        }
        this.f1699d.setSelection(this.f1704t);
    }

    /* renamed from: f */
    private boolean m1688f() {
        if (!m1686d()) {
            return false;
        }
        removeView(this.f1699d);
        addView(this.f1698c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1699d.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void m1689a(int i10) {
        View childAt = this.f1698c.getChildAt(i10);
        Runnable runnable = this.f1696a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1696a = aVar;
        post(aVar);
    }

    /* renamed from: c */
    d m1690c(AbstractC0218a.c cVar, boolean z10) {
        d dVar = new d(this, getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1703s));
        } else {
            dVar.setFocusable(true);
            if (this.f1697b == null) {
                this.f1697b = new c();
            }
            dVar.setOnClickListener(this.f1697b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1696a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0242a m1170b = C0242a.m1170b(getContext());
        setContentHeight(m1170b.m1175f());
        this.f1702r = m1170b.m1174e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1696a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).m1692b().m903e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1698c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.f1701f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1701f = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.f1701f, this.f1702r);
        }
        this.f1701f = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1703s, 1073741824);
        if (!z10 && this.f1700e) {
            this.f1698c.measure(0, makeMeasureSpec);
            if (this.f1698c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                m1687e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z10 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1704t);
                return;
            }
        }
        m1688f();
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
        this.f1700e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1703s = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1704t = i10;
        int childCount = this.f1698c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1698c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                m1689a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1699d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
