package p033c1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C1227e;

/* renamed from: c1.e */
/* loaded from: classes.dex */
final class C1832e implements KeyListener {

    /* renamed from: a */
    private final KeyListener f7739a;

    /* renamed from: b */
    private final a f7740b;

    /* renamed from: c1.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public boolean m9848a(Editable editable, int i10, KeyEvent keyEvent) {
            return C1227e.m6624f(editable, i10, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1832e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    C1832e(KeyListener keyListener, a aVar) {
        this.f7739a = keyListener;
        this.f7740b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f7739a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f7739a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f7740b.m9848a(editable, i10, keyEvent) || this.f7739a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f7739a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f7739a.onKeyUp(view, editable, i10, keyEvent);
    }
}
