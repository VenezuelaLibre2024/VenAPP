package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.e;
import bi.f;
import bi.i;
import ci.c;
import ci.d;

/* loaded from: classes3.dex */
public class UCropView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private GestureCropImageView f13617a;

    /* renamed from: b, reason: collision with root package name */
    private final OverlayView f13618b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements c {
        a() {
        }

        @Override // ci.c
        public void a(float f10) {
            UCropView.this.f13618b.setTargetAspectRatio(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements d {
        b() {
        }

        @Override // ci.d
        public void a(RectF rectF) {
            UCropView.this.f13617a.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UCropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(f.f6578d, (ViewGroup) this, true);
        this.f13617a = (GestureCropImageView) findViewById(e.f6550b);
        OverlayView overlayView = (OverlayView) findViewById(e.f6573y);
        this.f13618b = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Y);
        overlayView.g(obtainStyledAttributes);
        this.f13617a.A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        c();
    }

    private void c() {
        this.f13617a.setCropBoundsChangeListener(new a());
        this.f13618b.setOverlayViewChangeListener(new b());
    }

    public GestureCropImageView getCropImageView() {
        return this.f13617a;
    }

    public OverlayView getOverlayView() {
        return this.f13618b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
