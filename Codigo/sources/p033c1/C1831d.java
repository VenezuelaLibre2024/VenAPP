package p033c1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C1227e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: c1.d */
/* loaded from: classes.dex */
final class C1831d implements InputFilter {

    /* renamed from: a */
    private final TextView f7735a;

    /* renamed from: b */
    private C1227e.e f7736b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1.d$a */
    /* loaded from: classes.dex */
    public static class a extends C1227e.e {

        /* renamed from: a */
        private final Reference<TextView> f7737a;

        /* renamed from: b */
        private final Reference<C1831d> f7738b;

        a(TextView textView, C1831d c1831d) {
            this.f7737a = new WeakReference(textView);
            this.f7738b = new WeakReference(c1831d);
        }

        /* renamed from: c */
        private boolean m9847c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.C1227e.e
        /* renamed from: b */
        public void mo6649b() {
            CharSequence text;
            CharSequence m6635o;
            super.mo6649b();
            TextView textView = this.f7737a.get();
            if (m9847c(textView, this.f7738b.get()) && textView.isAttachedToWindow() && text != (m6635o = C1227e.m6622b().m6635o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(m6635o);
                int selectionEnd = Selection.getSelectionEnd(m6635o);
                textView.setText(m6635o);
                if (m6635o instanceof Spannable) {
                    C1831d.m9846b((Spannable) m6635o, selectionStart, selectionEnd);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1831d(TextView textView) {
        this.f7735a = textView;
    }

    /* renamed from: a */
    private C1227e.e m9845a() {
        if (this.f7736b == null) {
            this.f7736b = new a(this.f7735a, this);
        }
        return this.f7736b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m9846b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f7735a.isInEditMode()) {
            return charSequence;
        }
        int m6630d = C1227e.m6622b().m6630d();
        if (m6630d != 0) {
            boolean z10 = true;
            if (m6630d == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f7735a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return C1227e.m6622b().m6636p(charSequence, 0, charSequence.length());
            }
            if (m6630d != 3) {
                return charSequence;
            }
        }
        C1227e.m6622b().m6639s(m9845a());
        return charSequence;
    }
}
