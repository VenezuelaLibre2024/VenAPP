package p033c1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C1227e;

/* renamed from: c1.h */
/* loaded from: classes.dex */
class C1835h implements TransformationMethod {

    /* renamed from: a */
    private final TransformationMethod f7753a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1835h(TransformationMethod transformationMethod) {
        this.f7753a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m9869a() {
        return this.f7753a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f7753a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C1227e.m6622b().m6630d() != 1) ? charSequence : C1227e.m6622b().m6635o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f7753a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
