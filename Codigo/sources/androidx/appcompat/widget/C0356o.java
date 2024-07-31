package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p111g.C7377a;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
public class C0356o extends ImageButton {

    /* renamed from: a */
    private final C0326e f1830a;

    /* renamed from: b */
    private final C0359p f1831b;

    /* renamed from: c */
    private boolean f1832c;

    public C0356o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16686C);
    }

    public C0356o(Context context, AttributeSet attributeSet, int i10) {
        super(C0340i1.m1779b(context), attributeSet, i10);
        this.f1832c = false;
        C0334g1.m1731a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1830a = c0326e;
        c0326e.m1699e(attributeSet, i10);
        C0359p c0359p = new C0359p(this);
        this.f1831b = c0359p;
        c0359p.m1901g(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1830a;
        if (c0326e != null) {
            c0326e.m1696b();
        }
        C0359p c0359p = this.f1831b;
        if (c0359p != null) {
            c0359p.m1897c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1830a;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1830a;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0359p c0359p = this.f1831b;
        if (c0359p != null) {
            return c0359p.m1898d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0359p c0359p = this.f1831b;
        if (c0359p != null) {
            return c0359p.m1899e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1831b.m1900f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1830a;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1830a;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0359p c0359p = this.f1831b;
        if (c0359p != null) {
            c0359p.m1897c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0359p c0359p = this.f1831b;
        if (c0359p != null && drawable != null && !this.f1832c) {
            c0359p.m1902h(drawable);
        }
        super.setImageDrawable(drawable);
        C0359p c0359p2 = this.f1831b;
        if (c0359p2 != null) {
            c0359p2.m1897c();
            if (this.f1832c) {
                return;
            }
            this.f1831b.m1896b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1832c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1831b.m1903i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0359p c0359p = this.f1831b;
        if (c0359p != null) {
            c0359p.m1897c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0326e c0326e = this.f1830a;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1830a;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0359p c0359p = this.f1831b;
        if (c0359p != null) {
            c0359p.m1904j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0359p c0359p = this.f1831b;
        if (c0359p != null) {
            c0359p.m1905k(mode);
        }
    }
}
