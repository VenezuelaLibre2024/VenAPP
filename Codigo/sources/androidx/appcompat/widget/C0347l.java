package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p033c1.C1828a;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
class C0347l {

    /* renamed from: a */
    private final EditText f1818a;

    /* renamed from: b */
    private final C1828a f1819b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0347l(EditText editText) {
        this.f1818a = editText;
        this.f1819b = new C1828a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyListener m1837a(KeyListener keyListener) {
        return m1838b(keyListener) ? this.f1819b.m9836a(keyListener) : keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m1838b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1839c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1818a.getContext().obtainStyledAttributes(attributeSet, C7386j.f17010g0, i10, 0);
        try {
            int i11 = C7386j.f17080u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            m1841e(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InputConnection m1840d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1819b.m9837b(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1841e(boolean z10) {
        this.f1819b.m9838c(z10);
    }
}
