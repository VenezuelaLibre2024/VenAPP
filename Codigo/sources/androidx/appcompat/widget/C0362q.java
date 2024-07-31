package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p111g.C7377a;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
public class C0362q extends MultiAutoCompleteTextView {

    /* renamed from: d */
    private static final int[] f1864d = {R.attr.popupBackground};

    /* renamed from: a */
    private final C0326e f1865a;

    /* renamed from: b */
    private final C0321c0 f1866b;

    /* renamed from: c */
    private final C0347l f1867c;

    public C0362q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16712p);
    }

    public C0362q(Context context, AttributeSet attributeSet, int i10) {
        super(C0340i1.m1779b(context), attributeSet, i10);
        C0334g1.m1731a(this, getContext());
        C0349l1 m1845u = C0349l1.m1845u(getContext(), attributeSet, f1864d, i10, 0);
        if (m1845u.m1863r(0)) {
            setDropDownBackgroundDrawable(m1845u.m1851f(0));
        }
        m1845u.m1864v();
        C0326e c0326e = new C0326e(this);
        this.f1865a = c0326e;
        c0326e.m1699e(attributeSet, i10);
        C0321c0 c0321c0 = new C0321c0(this);
        this.f1866b = c0321c0;
        c0321c0.m1652m(attributeSet, i10);
        c0321c0.m1642b();
        C0347l c0347l = new C0347l(this);
        this.f1867c = c0347l;
        c0347l.m1839c(attributeSet, i10);
        m1922a(c0347l);
    }

    /* renamed from: a */
    void m1922a(C0347l c0347l) {
        KeyListener keyListener = getKeyListener();
        if (c0347l.m1838b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m1837a = c0347l.m1837a(keyListener);
            if (m1837a == keyListener) {
                return;
            }
            super.setKeyListener(m1837a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1865a;
        if (c0326e != null) {
            c0326e.m1696b();
        }
        C0321c0 c0321c0 = this.f1866b;
        if (c0321c0 != null) {
            c0321c0.m1642b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1865a;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1865a;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1866b.m1649j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1866b.m1650k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1867c.m1840d(C0353n.m1869a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1865a;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1865a;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1866b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1866b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C7605a.m23112b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1867c.m1841e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1867c.m1837a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0326e c0326e = this.f1865a;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1865a;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1866b.m1662w(colorStateList);
        this.f1866b.m1642b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1866b.m1663x(mode);
        this.f1866b.m1642b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0321c0 c0321c0 = this.f1866b;
        if (c0321c0 != null) {
            c0321c0.m1656q(context, i10);
        }
    }
}
