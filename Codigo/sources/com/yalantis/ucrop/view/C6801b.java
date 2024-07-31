package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ci.InterfaceC2009b;
import fi.C7356a;
import fi.C7359d;
import fi.C7362g;
import p068di.C6974c;

/* renamed from: com.yalantis.ucrop.view.b */
/* loaded from: classes3.dex */
public class C6801b extends AppCompatImageView {

    /* renamed from: A */
    private String f14987A;

    /* renamed from: B */
    private String f14988B;

    /* renamed from: C */
    private Uri f14989C;

    /* renamed from: D */
    private Uri f14990D;

    /* renamed from: E */
    private C6974c f14991E;

    /* renamed from: d */
    protected final float[] f14992d;

    /* renamed from: e */
    protected final float[] f14993e;

    /* renamed from: f */
    private final float[] f14994f;

    /* renamed from: r */
    protected Matrix f14995r;

    /* renamed from: s */
    protected int f14996s;

    /* renamed from: t */
    protected int f14997t;

    /* renamed from: u */
    protected b f14998u;

    /* renamed from: v */
    private float[] f14999v;

    /* renamed from: w */
    private float[] f15000w;

    /* renamed from: x */
    protected boolean f15001x;

    /* renamed from: y */
    protected boolean f15002y;

    /* renamed from: z */
    private int f15003z;

    /* renamed from: com.yalantis.ucrop.view.b$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC2009b {
        a() {
        }

        @Override // ci.InterfaceC2009b
        /* renamed from: a */
        public void mo10306a(Bitmap bitmap, C6974c c6974c, Uri uri, Uri uri2) {
            C6801b.this.f14989C = uri;
            C6801b.this.f14990D = uri2;
            C6801b.this.f14987A = uri.getPath();
            C6801b.this.f14988B = uri2 != null ? uri2.getPath() : null;
            C6801b.this.f14991E = c6974c;
            C6801b c6801b = C6801b.this;
            c6801b.f15001x = true;
            c6801b.setImageBitmap(bitmap);
        }

        @Override // ci.InterfaceC2009b
        public void onFailure(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            b bVar = C6801b.this.f14998u;
            if (bVar != null) {
                bVar.mo19586b(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo19585a();

        /* renamed from: b */
        void mo19586b(Exception exc);

        /* renamed from: c */
        void mo19587c(float f10);

        /* renamed from: d */
        void mo19588d(float f10);
    }

    public C6801b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6801b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14992d = new float[8];
        this.f14993e = new float[2];
        this.f14994f = new float[9];
        this.f14995r = new Matrix();
        this.f15001x = false;
        this.f15002y = false;
        this.f15003z = 0;
        mo19623k();
    }

    /* renamed from: q */
    private void m19662q() {
        this.f14995r.mapPoints(this.f14992d, this.f14999v);
        this.f14995r.mapPoints(this.f14993e, this.f15000w);
    }

    public float getCurrentAngle() {
        return m19663h(this.f14995r);
    }

    public float getCurrentScale() {
        return m19664i(this.f14995r);
    }

    public C6974c getExifInfo() {
        return this.f14991E;
    }

    public String getImageInputPath() {
        return this.f14987A;
    }

    public Uri getImageInputUri() {
        return this.f14989C;
    }

    public String getImageOutputPath() {
        return this.f14988B;
    }

    public Uri getImageOutputUri() {
        return this.f14990D;
    }

    public int getMaxBitmapSize() {
        if (this.f15003z <= 0) {
            this.f15003z = C7356a.m22190b(getContext());
        }
        return this.f15003z;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C7359d)) {
            return null;
        }
        return ((C7359d) getDrawable()).m22202a();
    }

    /* renamed from: h */
    public float m19663h(Matrix matrix) {
        return (float) (-(Math.atan2(m19665j(matrix, 1), m19665j(matrix, 0)) * 57.29577951308232d));
    }

    /* renamed from: i */
    public float m19664i(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(m19665j(matrix, 0), 2.0d) + Math.pow(m19665j(matrix, 3), 2.0d));
    }

    /* renamed from: j */
    protected float m19665j(Matrix matrix, int i10) {
        matrix.getValues(this.f14994f);
        return this.f14994f[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void mo19623k() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo19650l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.f14999v = C7362g.m22225b(rectF);
        this.f15000w = C7362g.m22224a(rectF);
        this.f15002y = true;
        b bVar = this.f14998u;
        if (bVar != null) {
            bVar.mo19585a();
        }
    }

    /* renamed from: m */
    public void m19666m(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f14995r.postRotate(f10, f11, f12);
            setImageMatrix(this.f14995r);
            b bVar = this.f14998u;
            if (bVar != null) {
                bVar.mo19588d(m19663h(this.f14995r));
            }
        }
    }

    /* renamed from: n */
    public void mo19651n(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f14995r.postScale(f10, f10, f11, f12);
            setImageMatrix(this.f14995r);
            b bVar = this.f14998u;
            if (bVar != null) {
                bVar.mo19587c(m19664i(this.f14995r));
            }
        }
    }

    /* renamed from: o */
    public void m19667o(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f14995r.postTranslate(f10, f11);
        setImageMatrix(this.f14995r);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.f15001x && !this.f15002y)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f14996s = width - paddingLeft;
            this.f14997t = height - paddingTop;
            mo19650l();
        }
    }

    /* renamed from: p */
    public void m19668p(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        C7356a.m22192d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C7359d(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f14995r.set(matrix);
        m19662q();
    }

    public void setMaxBitmapSize(int i10) {
        this.f15003z = i10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(b bVar) {
        this.f14998u = bVar;
    }
}
