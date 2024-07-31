package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC0895h;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
class C0368s {

    /* renamed from: c */
    private static final int[] f1890c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    private final ProgressBar f1891a;

    /* renamed from: b */
    private Bitmap f1892b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.s$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m1957a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
            layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
            layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
            layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
            layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
            layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
            layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
            layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
            layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
            layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0368s(ProgressBar progressBar) {
        this.f1891a = progressBar;
    }

    /* renamed from: a */
    private Shape m1952a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: e */
    private Drawable m1953e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i10 = 0; i10 < numberOfFrames; i10++) {
            Drawable m1956d = m1956d(animationDrawable.getFrame(i10), true);
            m1956d.setLevel(ModuleDescriptor.MODULE_VERSION);
            animationDrawable2.addFrame(m1956d, animationDrawable.getDuration(i10));
        }
        animationDrawable2.setLevel(ModuleDescriptor.MODULE_VERSION);
        return animationDrawable2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m1954b() {
        return this.f1892b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1955c(AttributeSet attributeSet, int i10) {
        C0349l1 m1845u = C0349l1.m1845u(this.f1891a.getContext(), attributeSet, f1890c, i10, 0);
        Drawable m1852g = m1845u.m1852g(0);
        if (m1852g != null) {
            this.f1891a.setIndeterminateDrawable(m1953e(m1852g));
        }
        Drawable m1852g2 = m1845u.m1852g(1);
        if (m1852g2 != null) {
            this.f1891a.setProgressDrawable(m1956d(m1852g2, false));
        }
        m1845u.m1864v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    Drawable m1956d(Drawable drawable, boolean z10) {
        if (drawable instanceof InterfaceC0895h) {
            InterfaceC0895h interfaceC0895h = (InterfaceC0895h) drawable;
            Drawable m4568a = interfaceC0895h.m4568a();
            if (m4568a != null) {
                interfaceC0895h.m4569b(m1956d(m4568a, z10));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = m1956d(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    a.m1957a(layerDrawable, layerDrawable2, i11);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1892b == null) {
                    this.f1892b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m1952a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
