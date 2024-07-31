package c1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a */
    private final TextView f6786a;

    /* renamed from: b */
    private e.AbstractC0062e f6787b;

    /* loaded from: classes.dex */
    public static class a extends e.AbstractC0062e {

        /* renamed from: a */
        private final Reference<TextView> f6788a;

        /* renamed from: b */
        private final Reference<d> f6789b;

        a(TextView textView, d dVar) {
            this.f6788a = new WeakReference(textView);
            this.f6789b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
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

        @Override // androidx.emoji2.text.e.AbstractC0062e
        public void b() {
            CharSequence text;
            CharSequence o10;
            super.b();
            TextView textView = this.f6788a.get();
            if (c(textView, this.f6789b.get()) && textView.isAttachedToWindow() && text != (o10 = androidx.emoji2.text.e.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(o10);
                int selectionEnd = Selection.getSelectionEnd(o10);
                textView.setText(o10);
                if (o10 instanceof Spannable) {
                    d.b((Spannable) o10, selectionStart, selectionEnd);
                }
            }
        }
    }

    public d(TextView textView) {
        this.f6786a = textView;
    }

    private e.AbstractC0062e a() {
        if (this.f6787b == null) {
            this.f6787b = new a(this.f6786a, this);
        }
        return this.f6787b;
    }

    public static void b(Spannable spannable, int i10, int i11) {
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
        if (this.f6786a.isInEditMode()) {
            return charSequence;
        }
        int d10 = androidx.emoji2.text.e.b().d();
        if (d10 != 0) {
            boolean z10 = true;
            if (d10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f6786a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.e.b().p(charSequence, 0, charSequence.length());
            }
            if (d10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.b().s(a());
        return charSequence;
    }
}
