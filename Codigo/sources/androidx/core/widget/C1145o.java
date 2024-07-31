package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1016c;
import androidx.core.view.InterfaceC1100t0;

/* renamed from: androidx.core.widget.o */
/* loaded from: classes.dex */
public final class C1145o implements InterfaceC1100t0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.o$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        static CharSequence m5628a(Context context, ClipData.Item item, int i10) {
            if ((i10 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* renamed from: b */
    private static CharSequence m5626b(Context context, ClipData.Item item, int i10) {
        return a.m5628a(context, item, i10);
    }

    /* renamed from: c */
    private static void m5627c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC1100t0
    /* renamed from: a */
    public C1016c mo5203a(View view, C1016c c1016c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1016c);
        }
        if (c1016c.m4951d() == 2) {
            return c1016c;
        }
        ClipData m4949b = c1016c.m4949b();
        int m4950c = c1016c.m4950c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < m4949b.getItemCount(); i10++) {
            CharSequence m5626b = m5626b(context, m4949b.getItemAt(i10), m4950c);
            if (m5626b != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m5626b);
                } else {
                    m5627c(editable, m5626b);
                    z10 = true;
                }
            }
        }
        return null;
    }
}
