package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.journeyapps.barcodescanner.a;
import dg.s;
import ig.j;
import ig.o;
import ih.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ViewfinderView extends View {

    /* renamed from: y, reason: collision with root package name */
    protected static final int[] f13423y = {0, 64, RecognitionOptions.ITF, 192, 255, 192, RecognitionOptions.ITF, 64};

    /* renamed from: a, reason: collision with root package name */
    protected final Paint f13424a;

    /* renamed from: b, reason: collision with root package name */
    protected Bitmap f13425b;

    /* renamed from: c, reason: collision with root package name */
    protected int f13426c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f13427d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f13428e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f13429f;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f13430r;

    /* renamed from: s, reason: collision with root package name */
    protected int f13431s;

    /* renamed from: t, reason: collision with root package name */
    protected List<s> f13432t;

    /* renamed from: u, reason: collision with root package name */
    protected List<s> f13433u;

    /* renamed from: v, reason: collision with root package name */
    protected com.journeyapps.barcodescanner.a f13434v;

    /* renamed from: w, reason: collision with root package name */
    protected Rect f13435w;

    /* renamed from: x, reason: collision with root package name */
    protected p f13436x;

    /* loaded from: classes3.dex */
    class a implements a.f {
        a() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
            ViewfinderView.this.b();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13424a = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f17761n);
        this.f13426c = obtainStyledAttributes.getColor(o.f17766s, resources.getColor(j.f17729d));
        this.f13427d = obtainStyledAttributes.getColor(o.f17763p, resources.getColor(j.f17727b));
        this.f13428e = obtainStyledAttributes.getColor(o.f17764q, resources.getColor(j.f17728c));
        this.f13429f = obtainStyledAttributes.getColor(o.f17762o, resources.getColor(j.f17726a));
        this.f13430r = obtainStyledAttributes.getBoolean(o.f17765r, true);
        obtainStyledAttributes.recycle();
        this.f13431s = 0;
        this.f13432t = new ArrayList(20);
        this.f13433u = new ArrayList(20);
    }

    public void a(s sVar) {
        if (this.f13432t.size() < 20) {
            this.f13432t.add(sVar);
        }
    }

    protected void b() {
        com.journeyapps.barcodescanner.a aVar = this.f13434v;
        if (aVar == null) {
            return;
        }
        Rect framingRect = aVar.getFramingRect();
        p previewSize = this.f13434v.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f13435w = framingRect;
        this.f13436x = previewSize;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        p pVar;
        b();
        Rect rect = this.f13435w;
        if (rect == null || (pVar = this.f13436x) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f13424a.setColor(this.f13425b != null ? this.f13427d : this.f13426c);
        float f10 = width;
        canvas.drawRect(0.0f, 0.0f, f10, rect.top, this.f13424a);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f13424a);
        canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, this.f13424a);
        canvas.drawRect(0.0f, rect.bottom + 1, f10, height, this.f13424a);
        if (this.f13425b != null) {
            this.f13424a.setAlpha(160);
            canvas.drawBitmap(this.f13425b, (Rect) null, rect, this.f13424a);
            return;
        }
        if (this.f13430r) {
            this.f13424a.setColor(this.f13428e);
            Paint paint = this.f13424a;
            int[] iArr = f13423y;
            paint.setAlpha(iArr[this.f13431s]);
            this.f13431s = (this.f13431s + 1) % iArr.length;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, this.f13424a);
        }
        float width2 = getWidth() / pVar.f17804a;
        float height3 = getHeight() / pVar.f17805b;
        if (!this.f13433u.isEmpty()) {
            this.f13424a.setAlpha(80);
            this.f13424a.setColor(this.f13429f);
            for (s sVar : this.f13433u) {
                canvas.drawCircle((int) (sVar.c() * width2), (int) (sVar.d() * height3), 3.0f, this.f13424a);
            }
            this.f13433u.clear();
        }
        if (!this.f13432t.isEmpty()) {
            this.f13424a.setAlpha(160);
            this.f13424a.setColor(this.f13429f);
            for (s sVar2 : this.f13432t) {
                canvas.drawCircle((int) (sVar2.c() * width2), (int) (sVar2.d() * height3), 6.0f, this.f13424a);
            }
            List<s> list = this.f13432t;
            List<s> list2 = this.f13433u;
            this.f13432t = list2;
            this.f13433u = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(com.journeyapps.barcodescanner.a aVar) {
        this.f13434v = aVar;
        aVar.i(new a());
    }

    public void setLaserVisibility(boolean z10) {
        this.f13430r = z10;
    }

    public void setMaskColor(int i10) {
        this.f13426c = i10;
    }
}
