package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C1016c;
import androidx.core.view.C1116x0;
import androidx.core.view.InterfaceC1104u0;
import androidx.core.widget.C1141k;
import androidx.core.widget.C1145o;
import p111g.C7377a;
import p355t0.C10964d;
import p355t0.C10966f;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public class C0344k extends EditText implements InterfaceC1104u0 {

    /* renamed from: a */
    private final C0326e f1810a;

    /* renamed from: b */
    private final C0321c0 f1811b;

    /* renamed from: c */
    private final C0318b0 f1812c;

    /* renamed from: d */
    private final C1145o f1813d;

    /* renamed from: e */
    private final C0347l f1814e;

    /* renamed from: f */
    private a f1815f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.k$a */
    /* loaded from: classes.dex */
    public class a {
        a() {
        }

        /* renamed from: a */
        public TextClassifier m1834a() {
            return C0344k.super.getTextClassifier();
        }

        /* renamed from: b */
        public void m1835b(TextClassifier textClassifier) {
            C0344k.super.setTextClassifier(textClassifier);
        }
    }

    public C0344k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16685B);
    }

    public C0344k(Context context, AttributeSet attributeSet, int i10) {
        super(C0340i1.m1779b(context), attributeSet, i10);
        C0334g1.m1731a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1810a = c0326e;
        c0326e.m1699e(attributeSet, i10);
        C0321c0 c0321c0 = new C0321c0(this);
        this.f1811b = c0321c0;
        c0321c0.m1652m(attributeSet, i10);
        c0321c0.m1642b();
        this.f1812c = new C0318b0(this);
        this.f1813d = new C1145o();
        C0347l c0347l = new C0347l(this);
        this.f1814e = c0347l;
        c0347l.m1839c(attributeSet, i10);
        m1833d(c0347l);
    }

    private a getSuperCaller() {
        if (this.f1815f == null) {
            this.f1815f = new a();
        }
        return this.f1815f;
    }

    @Override // androidx.core.view.InterfaceC1104u0
    /* renamed from: a */
    public C1016c mo1832a(C1016c c1016c) {
        return this.f1813d.mo5203a(this, c1016c);
    }

    /* renamed from: d */
    void m1833d(C0347l c0347l) {
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
        C0326e c0326e = this.f1810a;
        if (c0326e != null) {
            c0326e.m1696b();
        }
        C0321c0 c0321c0 = this.f1811b;
        if (c0321c0 != null) {
            c0321c0.m1642b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1141k.m5591m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1810a;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1810a;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1811b.m1649j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1811b.m1650k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0318b0 c0318b0;
        return (Build.VERSION.SDK_INT >= 28 || (c0318b0 = this.f1812c) == null) ? getSuperCaller().m1834a() : c0318b0.m1610a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m5299x;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1811b.m1657r(this, onCreateInputConnection, editorInfo);
        InputConnection m1869a = C0353n.m1869a(onCreateInputConnection, editorInfo, this);
        if (m1869a != null && Build.VERSION.SDK_INT <= 30 && (m5299x = C1116x0.m5299x(this)) != null) {
            C10964d.m33455d(editorInfo, m5299x);
            m1869a = C10966f.m33464c(this, m1869a, editorInfo);
        }
        return this.f1814e.m1840d(m1869a, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0377v.m2026a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C0377v.m2027b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1810a;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1810a;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1811b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0321c0 c0321c0 = this.f1811b;
        if (c0321c0 != null) {
            c0321c0.m1655p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1141k.m5592n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1814e.m1841e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1814e.m1837a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0326e c0326e = this.f1810a;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1810a;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1811b.m1662w(colorStateList);
        this.f1811b.m1642b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1811b.m1663x(mode);
        this.f1811b.m1642b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0321c0 c0321c0 = this.f1811b;
        if (c0321c0 != null) {
            c0321c0.m1656q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0318b0 c0318b0;
        if (Build.VERSION.SDK_INT >= 28 || (c0318b0 = this.f1812c) == null) {
            getSuperCaller().m1835b(textClassifier);
        } else {
            c0318b0.m1611b(textClassifier);
        }
    }
}
