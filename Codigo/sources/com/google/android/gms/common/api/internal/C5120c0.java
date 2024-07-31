package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C0732b;
import ca.C1894b;
import ca.C1902f;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes.dex */
public final class C5120c0 extends AbstractDialogInterfaceOnCancelListenerC5126d2 {

    /* renamed from: e */
    private final C0732b f10446e;

    /* renamed from: f */
    private final C5135g f10447f;

    C5120c0(InterfaceC5147j interfaceC5147j, C5135g c5135g, C1902f c1902f) {
        super(interfaceC5147j, c1902f);
        this.f10446e = new C0732b();
        this.f10447f = c5135g;
        this.mLifecycleFragment.mo13078a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: j */
    public static void m13017j(Activity activity, C5135g c5135g, C5115b c5115b) {
        InterfaceC5147j fragment = LifecycleCallback.getFragment(activity);
        C5120c0 c5120c0 = (C5120c0) fragment.mo13079b("ConnectionlessLifecycleHelper", C5120c0.class);
        if (c5120c0 == null) {
            c5120c0 = new C5120c0(fragment, c5135g, C1902f.m10067n());
        }
        C5276s.m13325k(c5115b, "ApiKey cannot be null");
        c5120c0.f10446e.add(c5115b);
        c5135g.m13063d(c5120c0);
    }

    /* renamed from: k */
    private final void m13018k() {
        if (this.f10446e.isEmpty()) {
            return;
        }
        this.f10447f.m13063d(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC5126d2
    /* renamed from: b */
    protected final void mo13019b(C1894b c1894b, int i10) {
        this.f10447f.m13060K(c1894b, i10);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC5126d2
    /* renamed from: c */
    protected final void mo13020c() {
        this.f10447f.m13061b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final C0732b m13021i() {
        return this.f10446e;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        m13018k();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC5126d2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        m13018k();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC5126d2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f10447f.m13064e(this);
    }
}
