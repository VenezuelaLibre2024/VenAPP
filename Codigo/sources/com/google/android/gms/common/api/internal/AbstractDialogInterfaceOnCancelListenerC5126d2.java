package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ca.C1894b;
import ca.C1902f;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;

/* renamed from: com.google.android.gms.common.api.internal.d2 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC5126d2 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    protected volatile boolean f10454a;

    /* renamed from: b */
    protected final AtomicReference f10455b;

    /* renamed from: c */
    private final Handler f10456c;

    /* renamed from: d */
    protected final C1902f f10457d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDialogInterfaceOnCancelListenerC5126d2(InterfaceC5147j interfaceC5147j, C1902f c1902f) {
        super(interfaceC5147j);
        this.f10455b = new AtomicReference(null);
        this.f10456c = new zau(Looper.getMainLooper());
        this.f10457d = c1902f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m13025a(C1894b c1894b, int i10) {
        this.f10455b.set(null);
        mo13019b(c1894b, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m13026d() {
        this.f10455b.set(null);
        mo13020c();
    }

    /* renamed from: e */
    private static final int m13027e(C5114a2 c5114a2) {
        if (c5114a2 == null) {
            return -1;
        }
        return c5114a2.m12997a();
    }

    /* renamed from: b */
    protected abstract void mo13019b(C1894b c1894b, int i10);

    /* renamed from: c */
    protected abstract void mo13020c();

    /* renamed from: h */
    public final void m13030h(C1894b c1894b, int i10) {
        C5114a2 c5114a2 = new C5114a2(c1894b, i10);
        AtomicReference atomicReference = this.f10455b;
        while (!C7099c.m20926a(atomicReference, null, c5114a2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f10456c.post(new RunnableC5122c2(this, c5114a2));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        C5114a2 c5114a2 = (C5114a2) this.f10455b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int mo10071g = this.f10457d.mo10071g(getActivity());
                if (mo10071g == 0) {
                    m13026d();
                    return;
                } else {
                    if (c5114a2 == null) {
                        return;
                    }
                    if (c5114a2.m12998b().m10050u1() == 18 && mo10071g == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            m13026d();
            return;
        } else if (i11 == 0) {
            if (c5114a2 == null) {
                return;
            }
            m13025a(new C1894b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c5114a2.m12998b().toString()), m13027e(c5114a2));
            return;
        }
        if (c5114a2 != null) {
            m13025a(c5114a2.m12998b(), c5114a2.m12997a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m13025a(new C1894b(13, null), m13027e((C5114a2) this.f10455b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f10455b.set(bundle.getBoolean("resolving_error", false) ? new C5114a2(new C1894b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C5114a2 c5114a2 = (C5114a2) this.f10455b.get();
        if (c5114a2 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c5114a2.m12997a());
        bundle.putInt("failed_status", c5114a2.m12998b().m10050u1());
        bundle.putParcelable("failed_resolution", c5114a2.m12998b().m10052w1());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f10454a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f10454a = false;
    }
}
