package p033c1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C0984h;
import com.google.android.gms.common.api.C5101a;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C1828a {

    /* renamed from: a */
    private final b f7725a;

    /* renamed from: b */
    private int f7726b = C5101a.e.API_PRIORITY_OTHER;

    /* renamed from: c */
    private int f7727c = 0;

    /* renamed from: c1.a$a */
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a */
        private final EditText f7728a;

        /* renamed from: b */
        private final C1834g f7729b;

        a(EditText editText, boolean z10) {
            this.f7728a = editText;
            C1834g c1834g = new C1834g(editText, z10);
            this.f7729b = c1834g;
            editText.addTextChangedListener(c1834g);
            editText.setEditableFactory(C1829b.getInstance());
        }

        @Override // p033c1.C1828a.b
        /* renamed from: a */
        KeyListener mo9839a(KeyListener keyListener) {
            if (keyListener instanceof C1832e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C1832e(keyListener);
        }

        @Override // p033c1.C1828a.b
        /* renamed from: b */
        InputConnection mo9840b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C1830c ? inputConnection : new C1830c(this.f7728a, inputConnection, editorInfo);
        }

        @Override // p033c1.C1828a.b
        /* renamed from: c */
        void mo9841c(boolean z10) {
            this.f7729b.m9868c(z10);
        }
    }

    /* renamed from: c1.a$b */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        /* renamed from: a */
        KeyListener mo9839a(KeyListener keyListener) {
            throw null;
        }

        /* renamed from: b */
        InputConnection mo9840b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* renamed from: c */
        void mo9841c(boolean z10) {
            throw null;
        }
    }

    public C1828a(EditText editText, boolean z10) {
        C0984h.m4834l(editText, "editText cannot be null");
        this.f7725a = new a(editText, z10);
    }

    /* renamed from: a */
    public KeyListener m9836a(KeyListener keyListener) {
        return this.f7725a.mo9839a(keyListener);
    }

    /* renamed from: b */
    public InputConnection m9837b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f7725a.mo9840b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void m9838c(boolean z10) {
        this.f7725a.mo9841c(z10);
    }
}
