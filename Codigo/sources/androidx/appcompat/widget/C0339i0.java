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
import androidx.core.graphics.C0904i;
import androidx.core.text.C0976n;
import androidx.core.widget.C1141k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: classes.dex */
public class C0339i0 extends TextView {

    /* renamed from: a */
    private final C0326e f1770a;

    /* renamed from: b */
    private final C0321c0 f1771b;

    /* renamed from: c */
    private final C0318b0 f1772c;

    /* renamed from: d */
    private C0350m f1773d;

    /* renamed from: e */
    private boolean f1774e;

    /* renamed from: f */
    private a f1775f;

    /* renamed from: r */
    private Future<C0976n> f1776r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo1766a(int[] iArr, int i10);

        /* renamed from: b */
        void mo1767b(int i10);

        /* renamed from: c */
        int mo1768c();

        /* renamed from: d */
        int mo1769d();

        /* renamed from: e */
        int[] mo1770e();

        /* renamed from: f */
        TextClassifier mo1771f();

        /* renamed from: g */
        int mo1772g();

        /* renamed from: h */
        void mo1773h(TextClassifier textClassifier);

        /* renamed from: i */
        void mo1774i(int i10, int i11, int i12, int i13);

        /* renamed from: j */
        void mo1775j(int i10);

        /* renamed from: k */
        int mo1776k();

        /* renamed from: l */
        void mo1777l(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.i0$b */
    /* loaded from: classes.dex */
    public class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: a */
        public void mo1766a(int[] iArr, int i10) {
            C0339i0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: b */
        public void mo1767b(int i10) {
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: c */
        public int mo1768c() {
            return C0339i0.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: d */
        public int mo1769d() {
            return C0339i0.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: e */
        public int[] mo1770e() {
            return C0339i0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: f */
        public TextClassifier mo1771f() {
            return C0339i0.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: g */
        public int mo1772g() {
            return C0339i0.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: h */
        public void mo1773h(TextClassifier textClassifier) {
            C0339i0.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: i */
        public void mo1774i(int i10, int i11, int i12, int i13) {
            C0339i0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: j */
        public void mo1775j(int i10) {
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: k */
        public int mo1776k() {
            return C0339i0.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.C0339i0.a
        /* renamed from: l */
        public void mo1777l(int i10) {
            C0339i0.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.i0$c */
    /* loaded from: classes.dex */
    public class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.C0339i0.b, androidx.appcompat.widget.C0339i0.a
        /* renamed from: b */
        public void mo1767b(int i10) {
            C0339i0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.C0339i0.b, androidx.appcompat.widget.C0339i0.a
        /* renamed from: j */
        public void mo1775j(int i10) {
            C0339i0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public C0339i0(Context context) {
        this(context, null);
    }

    public C0339i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0339i0(Context context, AttributeSet attributeSet, int i10) {
        super(C0340i1.m1779b(context), attributeSet, i10);
        this.f1774e = false;
        this.f1775f = null;
        C0334g1.m1731a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1770a = c0326e;
        c0326e.m1699e(attributeSet, i10);
        C0321c0 c0321c0 = new C0321c0(this);
        this.f1771b = c0321c0;
        c0321c0.m1652m(attributeSet, i10);
        c0321c0.m1642b();
        this.f1772c = new C0318b0(this);
        getEmojiTextViewHelper().m1866b(attributeSet, i10);
    }

    private C0350m getEmojiTextViewHelper() {
        if (this.f1773d == null) {
            this.f1773d = new C0350m(this);
        }
        return this.f1773d;
    }

    /* renamed from: q */
    private void m1765q() {
        Future<C0976n> future = this.f1776r;
        if (future != null) {
            try {
                this.f1776r = null;
                C1141k.m5589k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1770a;
        if (c0326e != null) {
            c0326e.m1696b();
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1642b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C0385x1.f1996b) {
            return getSuperCaller().mo1772g();
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            return c0321c0.m1644e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C0385x1.f1996b) {
            return getSuperCaller().mo1769d();
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            return c0321c0.m1645f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C0385x1.f1996b) {
            return getSuperCaller().mo1776k();
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            return c0321c0.m1646g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0385x1.f1996b) {
            return getSuperCaller().mo1770e();
        }
        C0321c0 c0321c0 = this.f1771b;
        return c0321c0 != null ? c0321c0.m1647h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (C0385x1.f1996b) {
            return getSuperCaller().mo1768c() == 1 ? 1 : 0;
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            return c0321c0.m1648i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1141k.m5591m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C1141k.m5579a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C1141k.m5580b(this);
    }

    a getSuperCaller() {
        a bVar;
        if (this.f1775f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f1775f = bVar;
        }
        return this.f1775f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1770a;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1770a;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1771b.m1649j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1771b.m1650k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m1765q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0318b0 c0318b0;
        return (Build.VERSION.SDK_INT >= 28 || (c0318b0 = this.f1772c) == null) ? getSuperCaller().mo1771f() : c0318b0.m1610a();
    }

    public C0976n.a getTextMetricsParamsCompat() {
        return C1141k.m5583e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1771b.m1657r(this, onCreateInputConnection, editorInfo);
        return C0353n.m1869a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1654o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        m1765q();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0321c0 c0321c0 = this.f1771b;
        if ((c0321c0 == null || C0385x1.f1996b || !c0321c0.m1651l()) ? false : true) {
            this.f1771b.m1643c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1867c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (C0385x1.f1996b) {
            getSuperCaller().mo1774i(i10, i11, i12, i13);
            return;
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1659t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (C0385x1.f1996b) {
            getSuperCaller().mo1766a(iArr, i10);
            return;
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1660u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (C0385x1.f1996b) {
            getSuperCaller().mo1777l(i10);
            return;
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1661v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1770a;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1770a;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? C7605a.m23112b(context, i10) : null, i11 != 0 ? C7605a.m23112b(context, i11) : null, i12 != 0 ? C7605a.m23112b(context, i12) : null, i13 != 0 ? C7605a.m23112b(context, i13) : null);
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C7605a.m23112b(context, i10) : null, i11 != 0 ? C7605a.m23112b(context, i11) : null, i12 != 0 ? C7605a.m23112b(context, i12) : null, i13 != 0 ? C7605a.m23112b(context, i13) : null);
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1771b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1865a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1775j(i10);
        } else {
            C1141k.m5586h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1767b(i10);
        } else {
            C1141k.m5587i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        C1141k.m5588j(this, i10);
    }

    public void setPrecomputedText(C0976n c0976n) {
        C1141k.m5589k(this, c0976n);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0326e c0326e = this.f1770a;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1770a;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1771b.m1662w(colorStateList);
        this.f1771b.m1642b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1771b.m1663x(mode);
        this.f1771b.m1642b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1656q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0318b0 c0318b0;
        if (Build.VERSION.SDK_INT >= 28 || (c0318b0 = this.f1772c) == null) {
            getSuperCaller().mo1773h(textClassifier);
        } else {
            c0318b0.m1611b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0976n> future) {
        this.f1776r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0976n.a aVar) {
        C1141k.m5590l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (C0385x1.f1996b) {
            super.setTextSize(i10, f10);
            return;
        }
        C0321c0 c0321c0 = this.f1771b;
        if (c0321c0 != null) {
            c0321c0.m1641A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1774e) {
            return;
        }
        Typeface m4603a = (typeface == null || i10 <= 0) ? null : C0904i.m4603a(getContext(), typeface, i10);
        this.f1774e = true;
        if (m4603a != null) {
            typeface = m4603a;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1774e = false;
        }
    }
}
