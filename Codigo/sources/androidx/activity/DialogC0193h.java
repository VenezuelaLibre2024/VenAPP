package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.C1312l;
import androidx.lifecycle.InterfaceC1310k;
import androidx.savedstate.C1418a;
import kotlin.jvm.internal.C9322n;
import p371u1.C11299c;
import p371u1.InterfaceC11300d;

/* renamed from: androidx.activity.h */
/* loaded from: classes.dex */
public class DialogC0193h extends Dialog implements InterfaceC1310k, InterfaceC0199n, InterfaceC11300d {

    /* renamed from: a */
    private C1312l f705a;

    /* renamed from: b */
    private final C11299c f706b;

    /* renamed from: c */
    private final OnBackPressedDispatcher f707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0193h(Context context, int i10) {
        super(context, i10);
        C9322n.m27781e(context, "context");
        this.f706b = C11299c.f29317d.m35302a(this);
        this.f707c = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.g
            @Override // java.lang.Runnable
            public final void run() {
                DialogC0193h.m808c(DialogC0193h.this);
            }
        });
    }

    /* renamed from: b */
    private final C1312l m807b() {
        C1312l c1312l = this.f705a;
        if (c1312l != null) {
            return c1312l;
        }
        C1312l c1312l2 = new C1312l(this);
        this.f705a = c1312l2;
        return c1312l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m808c(DialogC0193h this$0) {
        C9322n.m27781e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.InterfaceC1310k
    public AbstractC1300f getLifecycle() {
        return m807b();
    }

    @Override // androidx.activity.InterfaceC0199n
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f707c;
    }

    @Override // p371u1.InterfaceC11300d
    public C1418a getSavedStateRegistry() {
        return this.f706b.m35298b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f707c.m794e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f707c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C9322n.m27780d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.m795f(onBackInvokedDispatcher);
        }
        this.f706b.m35300d(bundle);
        m807b().m7360h(AbstractC1300f.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C9322n.m27780d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f706b.m35301e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        m807b().m7360h(AbstractC1300f.a.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        m807b().m7360h(AbstractC1300f.a.ON_DESTROY);
        this.f705a = null;
        super.onStop();
    }
}
