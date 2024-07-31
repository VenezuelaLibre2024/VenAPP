package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class i0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private final e f1495a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f1496b;

    /* renamed from: c, reason: collision with root package name */
    private final b0 f1497c;

    /* renamed from: d, reason: collision with root package name */
    private m f1498d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1499e;

    /* renamed from: f, reason: collision with root package name */
    private a f1500f;

    /* renamed from: r, reason: collision with root package name */
    private Future<androidx.core.text.n> f1501r;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        int[] e();

        TextClassifier f();

        int g();

        void h(TextClassifier textClassifier);

        void i(int i10, int i11, int i12, int i13);

        void j(int i10);

        int k();

        void l(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.i0.a
        public void a(int[] iArr, int i10) {
            i0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.i0.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.i0.a
        public int c() {
            return i0.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.i0.a
        public int d() {
            return i0.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.i0.a
        public int[] e() {
            return i0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.i0.a
        public TextClassifier f() {
            return i0.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.i0.a
        public int g() {
            return i0.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.i0.a
        public void h(TextClassifier textClassifier) {
            i0.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.i0.a
        public void i(int i10, int i11, int i12, int i13) {
            i0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.i0.a
        public void j(int i10) {
        }

        @Override // androidx.appcompat.widget.i0.a
        public int k() {
            return i0.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.i0.a
        public void l(int i10) {
            i0.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.i0.b, androidx.appcompat.widget.i0.a
        public void b(int i10) {
            i0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.i0.b, androidx.appcompat.widget.i0.a
        public void j(int i10) {
            i0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(i1.b(context), attributeSet, i10);
        this.f1499e = false;
        this.f1500f = null;
        g1.a(this, getContext());
        e eVar = new e(this);
        this.f1495a = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f1496b = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        this.f1497c = new b0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1498d == null) {
            this.f1498d = new m(this);
        }
        return this.f1498d;
    }

    private void q() {
        Future<androidx.core.text.n> future = this.f1501r;
        if (future != null) {
            try {
                this.f1501r = null;
                androidx.core.widget.k.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1495a;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (x1.f1702b) {
            return getSuperCaller().g();
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            return c0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (x1.f1702b) {
            return getSuperCaller().d();
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            return c0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (x1.f1702b) {
            return getSuperCaller().k();
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            return c0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (x1.f1702b) {
            return getSuperCaller().e();
        }
        c0 c0Var = this.f1496b;
        return c0Var != null ? c0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (x1.f1702b) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            return c0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.k.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.k.b(this);
    }

    a getSuperCaller() {
        a bVar;
        if (this.f1500f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f1500f = bVar;
        }
        return this.f1500f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1495a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1495a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1496b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1496b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        return (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1497c) == null) ? getSuperCaller().f() : b0Var.a();
    }

    public n.a getTextMetricsParamsCompat() {
        return androidx.core.widget.k.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1496b.r(this, onCreateInputConnection, editorInfo);
        return n.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        q();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        c0 c0Var = this.f1496b;
        if ((c0Var == null || x1.f1702b || !c0Var.l()) ? false : true) {
            this.f1496b.c();
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
            getSuperCaller().i(i10, i11, i12, i13);
            return;
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (x1.f1702b) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (x1.f1702b) {
            getSuperCaller().l(i10);
            return;
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1495a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1495a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? h.a.b(context, i10) : null, i11 != 0 ? h.a.b(context, i11) : null, i12 != 0 ? h.a.b(context, i12) : null, i13 != 0 ? h.a.b(context, i13) : null);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? h.a.b(context, i10) : null, i11 != 0 ? h.a.b(context, i11) : null, i12 != 0 ? h.a.b(context, i12) : null, i13 != 0 ? h.a.b(context, i13) : null);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.p();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            androidx.core.widget.k.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            androidx.core.widget.k.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.k.j(this, i10);
    }

    public void setPrecomputedText(androidx.core.text.n nVar) {
        androidx.core.widget.k.k(this, nVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1495a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1495a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1496b.w(colorStateList);
        this.f1496b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1496b.x(mode);
        this.f1496b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1497c) == null) {
            getSuperCaller().h(textClassifier);
        } else {
            b0Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.n> future) {
        this.f1501r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(n.a aVar) {
        androidx.core.widget.k.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (x1.f1702b) {
            super.setTextSize(i10, f10);
            return;
        }
        c0 c0Var = this.f1496b;
        if (c0Var != null) {
            c0Var.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1499e) {
            return;
        }
        Typeface a10 = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.i.a(getContext(), typeface, i10);
        this.f1499e = true;
        if (a10 != null) {
            typeface = a10;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1499e = false;
        }
    }
}
