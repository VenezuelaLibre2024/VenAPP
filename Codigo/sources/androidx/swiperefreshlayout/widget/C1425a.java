package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C1116x0;
import p476z1.C12762a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes.dex */
public class C1425a extends ImageView {

    /* renamed from: a */
    private Animation.AnimationListener f6309a;

    /* renamed from: b */
    private int f6310b;

    /* renamed from: c */
    private int f6311c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* loaded from: classes.dex */
    private static class a extends OvalShape {

        /* renamed from: a */
        private Paint f6312a = new Paint();

        /* renamed from: b */
        private int f6313b;

        /* renamed from: c */
        private C1425a f6314c;

        a(C1425a c1425a, int i10) {
            this.f6314c = c1425a;
            this.f6313b = i10;
            m8165a((int) rect().width());
        }

        /* renamed from: a */
        private void m8165a(int i10) {
            float f10 = i10 / 2;
            this.f6312a.setShader(new RadialGradient(f10, f10, this.f6313b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f6314c.getWidth() / 2;
            float height = this.f6314c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f6312a);
            canvas.drawCircle(width, height, r0 - this.f6313b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            m8165a((int) f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1425a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f6310b = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C12762a.f34806f);
        this.f6311c = obtainStyledAttributes.getColor(C12762a.f34807g, -328966);
        obtainStyledAttributes.recycle();
        if (m8163a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1116x0.m5269d0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f6310b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f6310b, i11, i10, 503316480);
            int i12 = this.f6310b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f6311c);
        C1116x0.m5261Z(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m8163a() {
        return true;
    }

    /* renamed from: b */
    public void m8164b(Animation.AnimationListener animationListener) {
        this.f6309a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f6309a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f6309a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (m8163a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f6310b * 2), getMeasuredHeight() + (this.f6310b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f6311c = i10;
        }
    }
}
