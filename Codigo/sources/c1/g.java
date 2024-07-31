package c1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import com.google.android.gms.common.api.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a */
    private final EditText f6797a;

    /* renamed from: b */
    private final boolean f6798b;

    /* renamed from: c */
    private e.AbstractC0062e f6799c;

    /* renamed from: d */
    private int f6800d = a.e.API_PRIORITY_OTHER;

    /* renamed from: e */
    private int f6801e = 0;

    /* renamed from: f */
    private boolean f6802f = true;

    /* loaded from: classes.dex */
    public static class a extends e.AbstractC0062e {

        /* renamed from: a */
        private final Reference<EditText> f6803a;

        a(EditText editText) {
            this.f6803a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0062e
        public void b() {
            super.b();
            g.b(this.f6803a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f6797a = editText;
        this.f6798b = z10;
    }

    private e.AbstractC0062e a() {
        if (this.f6799c == null) {
            this.f6799c = new a(this.f6797a);
        }
        return this.f6799c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f6802f && (this.f6798b || androidx.emoji2.text.e.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f6802f != z10) {
            if (this.f6799c != null) {
                androidx.emoji2.text.e.b().t(this.f6799c);
            }
            this.f6802f = z10;
            if (z10) {
                b(this.f6797a, androidx.emoji2.text.e.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f6797a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d10 = androidx.emoji2.text.e.b().d();
        if (d10 != 0) {
            if (d10 == 1) {
                androidx.emoji2.text.e.b().r((Spannable) charSequence, i10, i10 + i12, this.f6800d, this.f6801e);
                return;
            } else if (d10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.b().s(a());
    }
}
