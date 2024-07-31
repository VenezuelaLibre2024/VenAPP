package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f2807s = {R.attr.colorBackground};

    /* renamed from: t, reason: collision with root package name */
    private static final c f2808t;

    /* renamed from: a, reason: collision with root package name */
    private boolean f2809a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2810b;

    /* renamed from: c, reason: collision with root package name */
    int f2811c;

    /* renamed from: d, reason: collision with root package name */
    int f2812d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f2813e;

    /* renamed from: f, reason: collision with root package name */
    final Rect f2814f;

    /* renamed from: r, reason: collision with root package name */
    private final b f2815r;

    /* loaded from: classes.dex */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f2816a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(Drawable drawable) {
            this.f2816a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable c() {
            return this.f2816a;
        }

        @Override // androidx.cardview.widget.b
        public void d(int i10, int i11, int i12, int i13) {
            CardView.this.f2814f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f2813e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f2808t = aVar;
        aVar.k();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.f19471a);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2813e = rect;
        this.f2814f = new Rect();
        a aVar = new a();
        this.f2815r = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.d.f19475a, i10, j0.c.f19474a);
        int i12 = j0.d.f19478d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2807s);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = j0.b.f19473b;
            } else {
                resources = getResources();
                i11 = j0.b.f19472a;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(j0.d.f19479e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(j0.d.f19480f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(j0.d.f19481g, 0.0f);
        this.f2809a = obtainStyledAttributes.getBoolean(j0.d.f19483i, false);
        this.f2810b = obtainStyledAttributes.getBoolean(j0.d.f19482h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j0.d.f19484j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(j0.d.f19486l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(j0.d.f19488n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(j0.d.f19487m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(j0.d.f19485k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2811c = obtainStyledAttributes.getDimensionPixelSize(j0.d.f19476b, 0);
        this.f2812d = obtainStyledAttributes.getDimensionPixelSize(j0.d.f19477c, 0);
        obtainStyledAttributes.recycle();
        f2808t.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2808t.e(this.f2815r);
    }

    public float getCardElevation() {
        return f2808t.i(this.f2815r);
    }

    public int getContentPaddingBottom() {
        return this.f2813e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2813e.left;
    }

    public int getContentPaddingRight() {
        return this.f2813e.right;
    }

    public int getContentPaddingTop() {
        return this.f2813e.top;
    }

    public float getMaxCardElevation() {
        return f2808t.d(this.f2815r);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2810b;
    }

    public float getRadius() {
        return f2808t.b(this.f2815r);
    }

    public boolean getUseCompatPadding() {
        return this.f2809a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(f2808t instanceof androidx.cardview.widget.a)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.f2815r)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.f(this.f2815r)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f2808t.m(this.f2815r, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2808t.m(this.f2815r, colorStateList);
    }

    public void setCardElevation(float f10) {
        f2808t.c(this.f2815r, f10);
    }

    public void setMaxCardElevation(float f10) {
        f2808t.n(this.f2815r, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f2812d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f2811c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f2810b) {
            this.f2810b = z10;
            f2808t.g(this.f2815r);
        }
    }

    public void setRadius(float f10) {
        f2808t.a(this.f2815r, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f2809a != z10) {
            this.f2809a = z10;
            f2808t.j(this.f2815r);
        }
    }
}
