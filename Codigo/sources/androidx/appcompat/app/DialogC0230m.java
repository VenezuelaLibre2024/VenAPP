package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0193h;
import androidx.appcompat.view.AbstractC0243b;
import androidx.core.view.C1095s;
import p111g.C7377a;

/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes.dex */
public class DialogC0230m extends DialogC0193h implements InterfaceC0222e {

    /* renamed from: d */
    private AbstractC0224g f976d;

    /* renamed from: e */
    private final C1095s.a f977e;

    public DialogC0230m(Context context, int i10) {
        super(context, m1073e(context, i10));
        this.f977e = new C1095s.a() { // from class: androidx.appcompat.app.l
            @Override // androidx.core.view.C1095s.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogC0230m.this.m1075f(keyEvent);
            }
        };
        AbstractC0224g m1074d = m1074d();
        m1074d.mo941O(m1073e(context, i10));
        m1074d.mo956y(null);
    }

    /* renamed from: e */
    private static int m1073e(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7377a.f16722z, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1074d().mo944e(view, layoutParams);
    }

    /* renamed from: d */
    public AbstractC0224g m1074d() {
        if (this.f976d == null) {
            this.f976d = AbstractC0224g.m923i(this, this);
        }
        return this.f976d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m1074d().mo957z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1095s.m5198e(this.f977e, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m1075f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) m1074d().mo947j(i10);
    }

    /* renamed from: g */
    public boolean m1076g(int i10) {
        return m1074d().mo935H(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m1074d().mo954u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.DialogC0193h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m1074d().mo953t();
        super.onCreate(bundle);
        m1074d().mo956y(bundle);
    }

    @Override // androidx.activity.DialogC0193h, android.app.Dialog
    protected void onStop() {
        super.onStop();
        m1074d().mo934E();
    }

    @Override // androidx.appcompat.app.InterfaceC0222e
    public void onSupportActionModeFinished(AbstractC0243b abstractC0243b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0222e
    public void onSupportActionModeStarted(AbstractC0243b abstractC0243b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0222e
    public AbstractC0243b onWindowStartingSupportActionMode(AbstractC0243b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m1074d().mo936J(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m1074d().mo937K(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1074d().mo938L(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        m1074d().mo942P(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1074d().mo942P(charSequence);
    }
}
