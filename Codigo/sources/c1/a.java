package c1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f6776a;

    /* renamed from: b, reason: collision with root package name */
    private int f6777b = a.e.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    private int f6778c = 0;

    /* renamed from: c1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0113a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f6779a;

        /* renamed from: b, reason: collision with root package name */
        private final g f6780b;

        C0113a(EditText editText, boolean z10) {
            this.f6779a = editText;
            g gVar = new g(editText, z10);
            this.f6780b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(c1.b.getInstance());
        }

        @Override // c1.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // c1.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f6779a, inputConnection, editorInfo);
        }

        @Override // c1.a.b
        void c(boolean z10) {
            this.f6780b.c(z10);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText, boolean z10) {
        androidx.core.util.h.l(editText, "editText cannot be null");
        this.f6776a = new C0113a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f6776a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f6776a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f6776a.c(z10);
    }
}
