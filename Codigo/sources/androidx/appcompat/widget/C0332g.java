package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C1141k;
import p111g.C7377a;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public class C0332g extends CheckedTextView {

    /* renamed from: a */
    private final C0335h f1744a;

    /* renamed from: b */
    private final C0326e f1745b;

    /* renamed from: c */
    private final C0321c0 f1746c;

    /* renamed from: d */
    private C0350m f1747d;

    public C0332g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16715s);
    }

    public C0332g(Context context, AttributeSet attributeSet, int i10) {
        super(C0340i1.m1779b(context), attributeSet, i10);
        C0334g1.m1731a(this, getContext());
        C0321c0 c0321c0 = new C0321c0(this);
        this.f1746c = c0321c0;
        c0321c0.m1652m(attributeSet, i10);
        c0321c0.m1642b();
        C0326e c0326e = new C0326e(this);
        this.f1745b = c0326e;
        c0326e.m1699e(attributeSet, i10);
        C0335h c0335h = new C0335h(this);
        this.f1744a = c0335h;
        c0335h.m1740d(attributeSet, i10);
        getEmojiTextViewHelper().m1866b(attributeSet, i10);
    }

    private C0350m getEmojiTextViewHelper() {
        if (this.f1747d == null) {
            this.f1747d = new C0350m(this);
        }
        return this.f1747d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0321c0 c0321c0 = this.f1746c;
        if (c0321c0 != null) {
            c0321c0.m1642b();
        }
        C0326e c0326e = this.f1745b;
        if (c0326e != null) {
            c0326e.m1696b();
        }
        C0335h c0335h = this.f1744a;
        if (c0335h != null) {
            c0335h.m1737a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1141k.m5591m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1745b;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1745b;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0335h c0335h = this.f1744a;
        if (c0335h != null) {
            return c0335h.m1738b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0335h c0335h = this.f1744a;
        if (c0335h != null) {
            return c0335h.m1739c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1746c.m1649j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1746c.m1650k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0353n.m1869a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1867c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1745b;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1745b;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C7605a.m23112b(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0335h c0335h = this.f1744a;
        if (c0335h != null) {
            c0335h.m1741e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1746c;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1746c;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1141k.m5592n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m1868d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0326e c0326e = this.f1745b;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1745b;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0335h c0335h = this.f1744a;
        if (c0335h != null) {
            c0335h.m1742f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0335h c0335h = this.f1744a;
        if (c0335h != null) {
            c0335h.m1743g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1746c.m1662w(colorStateList);
        this.f1746c.m1642b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1746c.m1663x(mode);
        this.f1746c.m1642b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0321c0 c0321c0 = this.f1746c;
        if (c0321c0 != null) {
            c0321c0.m1656q(context, i10);
        }
    }
}
