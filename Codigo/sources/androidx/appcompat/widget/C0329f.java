package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p111g.C7377a;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public class C0329f extends CheckBox {

    /* renamed from: a */
    private final C0338i f1721a;

    /* renamed from: b */
    private final C0326e f1722b;

    /* renamed from: c */
    private final C0321c0 f1723c;

    /* renamed from: d */
    private C0350m f1724d;

    public C0329f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16714r);
    }

    public C0329f(Context context, AttributeSet attributeSet, int i10) {
        super(C0340i1.m1779b(context), attributeSet, i10);
        C0334g1.m1731a(this, getContext());
        C0338i c0338i = new C0338i(this);
        this.f1721a = c0338i;
        c0338i.m1749e(attributeSet, i10);
        C0326e c0326e = new C0326e(this);
        this.f1722b = c0326e;
        c0326e.m1699e(attributeSet, i10);
        C0321c0 c0321c0 = new C0321c0(this);
        this.f1723c = c0321c0;
        c0321c0.m1652m(attributeSet, i10);
        getEmojiTextViewHelper().m1866b(attributeSet, i10);
    }

    private C0350m getEmojiTextViewHelper() {
        if (this.f1724d == null) {
            this.f1724d = new C0350m(this);
        }
        return this.f1724d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1722b;
        if (c0326e != null) {
            c0326e.m1696b();
        }
        C0321c0 c0321c0 = this.f1723c;
        if (c0321c0 != null) {
            c0321c0.m1642b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0338i c0338i = this.f1721a;
        return c0338i != null ? c0338i.m1746b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1722b;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1722b;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0338i c0338i = this.f1721a;
        if (c0338i != null) {
            return c0338i.m1747c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0338i c0338i = this.f1721a;
        if (c0338i != null) {
            return c0338i.m1748d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1723c.m1649j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1723c.m1650k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1867c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1722b;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1722b;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C7605a.m23112b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0338i c0338i = this.f1721a;
        if (c0338i != null) {
            c0338i.m1750f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1723c;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1723c;
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
        C0326e c0326e = this.f1722b;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1722b;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0338i c0338i = this.f1721a;
        if (c0338i != null) {
            c0338i.m1751g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0338i c0338i = this.f1721a;
        if (c0338i != null) {
            c0338i.m1752h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1723c.m1662w(colorStateList);
        this.f1723c.m1642b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1723c.m1663x(mode);
        this.f1723c.m1642b();
    }
}
