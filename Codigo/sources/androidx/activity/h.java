package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.f;

/* loaded from: classes.dex */
public class h extends Dialog implements androidx.lifecycle.k, n, u1.d {

    /* renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.l f640a;

    /* renamed from: b, reason: collision with root package name */
    private final u1.c f641b;

    /* renamed from: c, reason: collision with root package name */
    private final OnBackPressedDispatcher f642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.n.e(context, "context");
        this.f641b = u1.c.f27015d.a(this);
        this.f642c = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.g
            @Override // java.lang.Runnable
            public final void run() {
                h.c(h.this);
            }
        });
    }

    private final androidx.lifecycle.l b() {
        androidx.lifecycle.l lVar = this.f640a;
        if (lVar != null) {
            return lVar;
        }
        androidx.lifecycle.l lVar2 = new androidx.lifecycle.l(this);
        this.f640a = lVar2;
        return lVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(h this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.f getLifecycle() {
        return b();
    }

    @Override // androidx.activity.n
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f642c;
    }

    @Override // u1.d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.f641b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f642c.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f642c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.n.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.f(onBackInvokedDispatcher);
        }
        this.f641b.d(bundle);
        b().h(f.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.n.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f641b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().h(f.a.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        b().h(f.a.ON_DESTROY);
        this.f640a = null;
        super.onStop();
    }
}
