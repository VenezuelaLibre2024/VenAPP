package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* renamed from: a, reason: collision with root package name */
    private final e f1252a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f1253b;

    /* renamed from: c, reason: collision with root package name */
    private m f1254c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f15277q);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(i1.b(context), attributeSet, i10);
        g1.a(this, getContext());
        e eVar = new e(this);
        this.f1252a = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f1253b = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1254c == null) {
            this.f1254c = new m(this);
        }
        return this.f1254c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1252a;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (x1.f1702b) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            return c0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (x1.f1702b) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            return c0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (x1.f1702b) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            return c0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (x1.f1702b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f1253b;
        return c0Var != null ? c0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (x1.f1702b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            return c0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1252a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1252a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1253b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1253b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        c0 c0Var = this.f1253b;
        if ((c0Var == null || x1.f1702b || !c0Var.l()) ? false : true) {
            this.f1253b.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (x1.f1702b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (x1.f1702b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (x1.f1702b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1252a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1252a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1252a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1252a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1253b.w(colorStateList);
        this.f1253b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1253b.x(mode);
        this.f1253b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (x1.f1702b) {
            super.setTextSize(i10, f10);
            return;
        }
        c0 c0Var = this.f1253b;
        if (c0Var != null) {
            c0Var.A(i10, f10);
        }
    }
}
