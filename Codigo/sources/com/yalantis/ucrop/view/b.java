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
import di.c;
import fi.d;
import fi.g;

/* loaded from: classes3.dex */
public class b extends AppCompatImageView {
    private String A;
    private String B;
    private Uri C;
    private Uri D;
    private c E;

    /* renamed from: d, reason: collision with root package name */
    protected final float[] f13638d;

    /* renamed from: e, reason: collision with root package name */
    protected final float[] f13639e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f13640f;

    /* renamed from: r, reason: collision with root package name */
    protected Matrix f13641r;

    /* renamed from: s, reason: collision with root package name */
    protected int f13642s;

    /* renamed from: t, reason: collision with root package name */
    protected int f13643t;

    /* renamed from: u, reason: collision with root package name */
    protected InterfaceC0200b f13644u;

    /* renamed from: v, reason: collision with root package name */
    private float[] f13645v;

    /* renamed from: w, reason: collision with root package name */
    private float[] f13646w;

    /* renamed from: x, reason: collision with root package name */
    protected boolean f13647x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f13648y;

    /* renamed from: z, reason: collision with root package name */
    private int f13649z;

    /* loaded from: classes3.dex */
    class a implements ci.b {
        a() {
        }

        @Override // ci.b
        public void a(Bitmap bitmap, c cVar, Uri uri, Uri uri2) {
            b.this.C = uri;
            b.this.D = uri2;
            b.this.A = uri.getPath();
            b.this.B = uri2 != null ? uri2.getPath() : null;
            b.this.E = cVar;
            b bVar = b.this;
            bVar.f13647x = true;
            bVar.setImageBitmap(bitmap);
        }

        @Override // ci.b
        public void onFailure(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            InterfaceC0200b interfaceC0200b = b.this.f13644u;
            if (interfaceC0200b != null) {
                interfaceC0200b.b(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0200b {
        void a();

        void b(Exception exc);

        void c(float f10);

        void d(float f10);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13638d = new float[8];
        this.f13639e = new float[2];
        this.f13640f = new float[9];
        this.f13641r = new Matrix();
        this.f13647x = false;
        this.f13648y = false;
        this.f13649z = 0;
        k();
    }

    private void q() {
        this.f13641r.mapPoints(this.f13638d, this.f13645v);
        this.f13641r.mapPoints(this.f13639e, this.f13646w);
    }

    public float getCurrentAngle() {
        return h(this.f13641r);
    }

    public float getCurrentScale() {
        return i(this.f13641r);
    }

    public c getExifInfo() {
        return this.E;
    }

    public String getImageInputPath() {
        return this.A;
    }

    public Uri getImageInputUri() {
        return this.C;
    }

    public String getImageOutputPath() {
        return this.B;
    }

    public Uri getImageOutputUri() {
        return this.D;
    }

    public int getMaxBitmapSize() {
        if (this.f13649z <= 0) {
            this.f13649z = fi.a.b(getContext());
        }
        return this.f13649z;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof d)) {
            return null;
        }
        return ((d) getDrawable()).a();
    }

    public float h(Matrix matrix) {
        return (float) (-(Math.atan2(j(matrix, 1), j(matrix, 0)) * 57.29577951308232d));
    }

    public float i(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(j(matrix, 0), 2.0d) + Math.pow(j(matrix, 3), 2.0d));
    }

    protected float j(Matrix matrix, int i10) {
        matrix.getValues(this.f13640f);
        return this.f13640f[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.f13645v = g.b(rectF);
        this.f13646w = g.a(rectF);
        this.f13648y = true;
        InterfaceC0200b interfaceC0200b = this.f13644u;
        if (interfaceC0200b != null) {
            interfaceC0200b.a();
        }
    }

    public void m(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f13641r.postRotate(f10, f11, f12);
            setImageMatrix(this.f13641r);
            InterfaceC0200b interfaceC0200b = this.f13644u;
            if (interfaceC0200b != null) {
                interfaceC0200b.d(h(this.f13641r));
            }
        }
    }

    public void n(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f13641r.postScale(f10, f10, f11, f12);
            setImageMatrix(this.f13641r);
            InterfaceC0200b interfaceC0200b = this.f13644u;
            if (interfaceC0200b != null) {
                interfaceC0200b.c(i(this.f13641r));
            }
        }
    }

    public void o(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f13641r.postTranslate(f10, f11);
        setImageMatrix(this.f13641r);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.f13647x && !this.f13648y)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f13642s = width - paddingLeft;
            this.f13643t = height - paddingTop;
            l();
        }
    }

    public void p(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        fi.a.d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new d(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f13641r.set(matrix);
        q();
    }

    public void setMaxBitmapSize(int i10) {
        this.f13649z = i10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(InterfaceC0200b interfaceC0200b) {
        this.f13644u = interfaceC0200b;
    }
}
