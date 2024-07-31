package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.s;

/* loaded from: classes.dex */
public class m extends androidx.activity.h implements e {

    /* renamed from: d */
    private g f851d;

    /* renamed from: e */
    private final s.a f852e;

    public m(Context context, int i10) {
        super(context, e(context, i10));
        this.f852e = new s.a() { // from class: androidx.appcompat.app.l
            public /* synthetic */ l() {
            }

            @Override // androidx.core.view.s.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return m.this.f(keyEvent);
            }
        };
        g d10 = d();
        d10.O(e(context, i10));
        d10.y(null);
    }

    private static int e(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f15286z, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().e(view, layoutParams);
    }

    public g d() {
        if (this.f851d == null) {
            this.f851d = g.i(this, this);
        }
        return this.f851d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        d().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.s.e(this.f852e, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) d().j(i10);
    }

    public boolean g(int i10) {
        return d().H(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        d().u();
    }

    @Override // androidx.activity.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().t();
        super.onCreate(bundle);
        d().y(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.h, android.app.Dialog
    public void onStop() {
        super.onStop();
        d().E();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d().J(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        d().K(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().L(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        d().P(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().P(charSequence);
    }
}
