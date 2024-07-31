package p033c1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C1227e;
import com.google.android.gms.common.api.C5101a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: c1.g */
/* loaded from: classes.dex */
final class C1834g implements TextWatcher {

    /* renamed from: a */
    private final EditText f7746a;

    /* renamed from: b */
    private final boolean f7747b;

    /* renamed from: c */
    private C1227e.e f7748c;

    /* renamed from: d */
    private int f7749d = C5101a.e.API_PRIORITY_OTHER;

    /* renamed from: e */
    private int f7750e = 0;

    /* renamed from: f */
    private boolean f7751f = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1.g$a */
    /* loaded from: classes.dex */
    public static class a extends C1227e.e {

        /* renamed from: a */
        private final Reference<EditText> f7752a;

        a(EditText editText) {
            this.f7752a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C1227e.e
        /* renamed from: b */
        public void mo6649b() {
            super.mo6649b();
            C1834g.m9866b(this.f7752a.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1834g(EditText editText, boolean z10) {
        this.f7746a = editText;
        this.f7747b = z10;
    }

    /* renamed from: a */
    private C1227e.e m9865a() {
        if (this.f7748c == null) {
            this.f7748c = new a(this.f7746a);
        }
        return this.f7748c;
    }

    /* renamed from: b */
    static void m9866b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1227e.m6622b().m6635o(editableText);
            C1831d.m9846b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: d */
    private boolean m9867d() {
        return (this.f7751f && (this.f7747b || C1227e.m6626h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: c */
    public void m9868c(boolean z10) {
        if (this.f7751f != z10) {
            if (this.f7748c != null) {
                C1227e.m6622b().m6640t(this.f7748c);
            }
            this.f7751f = z10;
            if (z10) {
                m9866b(this.f7746a, C1227e.m6622b().m6630d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f7746a.isInEditMode() || m9867d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int m6630d = C1227e.m6622b().m6630d();
        if (m6630d != 0) {
            if (m6630d == 1) {
                C1227e.m6622b().m6638r((Spannable) charSequence, i10, i10 + i12, this.f7749d, this.f7750e);
                return;
            } else if (m6630d != 3) {
                return;
            }
        }
        C1227e.m6622b().m6639s(m9865a());
    }
}
