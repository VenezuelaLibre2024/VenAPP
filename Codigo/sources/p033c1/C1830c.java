package p033c1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C1227e;

/* renamed from: c1.c */
/* loaded from: classes.dex */
final class C1830c extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f7733a;

    /* renamed from: b */
    private final a f7734b;

    /* renamed from: c1.c$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public boolean m9843a(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
            return C1227e.m6623e(inputConnection, editable, i10, i11, z10);
        }

        /* renamed from: b */
        public void m9844b(EditorInfo editorInfo) {
            if (C1227e.m6626h()) {
                C1227e.m6622b().m6641u(editorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1830c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    C1830c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f7733a = textView;
        this.f7734b = aVar;
        aVar.m9844b(editorInfo);
    }

    /* renamed from: a */
    private Editable m9842a() {
        return this.f7733a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f7734b.m9843a(this, m9842a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f7734b.m9843a(this, m9842a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
