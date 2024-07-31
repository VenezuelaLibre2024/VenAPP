package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public class C0351m0 extends ToggleButton {

    /* renamed from: a */
    private final C0326e f1825a;

    /* renamed from: b */
    private final C0321c0 f1826b;

    /* renamed from: c */
    private C0350m f1827c;

    public C0351m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C0351m0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0334g1.m1731a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1825a = c0326e;
        c0326e.m1699e(attributeSet, i10);
        C0321c0 c0321c0 = new C0321c0(this);
        this.f1826b = c0321c0;
        c0321c0.m1652m(attributeSet, i10);
        getEmojiTextViewHelper().m1866b(attributeSet, i10);
    }

    private C0350m getEmojiTextViewHelper() {
        if (this.f1827c == null) {
            this.f1827c = new C0350m(this);
        }
        return this.f1827c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1825a;
        if (c0326e != null) {
            c0326e.m1696b();
        }
        C0321c0 c0321c0 = this.f1826b;
        if (c0321c0 != null) {
            c0321c0.m1642b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1825a;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1825a;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1826b.m1649j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1826b.m1650k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1867c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1825a;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1825a;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1826b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1826b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m1868d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1865a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0326e c0326e = this.f1825a;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1825a;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1826b.m1662w(colorStateList);
        this.f1826b.m1642b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1826b.m1663x(mode);
        this.f1826b.m1642b();
    }
}
