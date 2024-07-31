package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class d2 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    protected volatile boolean f9346a;

    /* renamed from: b, reason: collision with root package name */
    protected final AtomicReference f9347b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f9348c;

    /* renamed from: d, reason: collision with root package name */
    protected final ca.f f9349d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(j jVar, ca.f fVar) {
        super(jVar);
        this.f9347b = new AtomicReference(null);
        this.f9348c = new zau(Looper.getMainLooper());
        this.f9349d = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ca.b bVar, int i10) {
        this.f9347b.set(null);
        b(bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.f9347b.set(null);
        c();
    }

    private static final int e(a2 a2Var) {
        if (a2Var == null) {
            return -1;
        }
        return a2Var.a();
    }

    protected abstract void b(ca.b bVar, int i10);

    protected abstract void c();

    public final void h(ca.b bVar, int i10) {
        a2 a2Var = new a2(bVar, i10);
        AtomicReference atomicReference = this.f9347b;
        while (!e2.c.a(atomicReference, null, a2Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f9348c.post(new c2(this, a2Var));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        a2 a2Var = (a2) this.f9347b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int g10 = this.f9349d.g(getActivity());
                if (g10 == 0) {
                    d();
                    return;
                } else {
                    if (a2Var == null) {
                        return;
                    }
                    if (a2Var.b().u1() == 18 && g10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (a2Var == null) {
                return;
            }
            a(new ca.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, a2Var.b().toString()), e(a2Var));
            return;
        }
        if (a2Var != null) {
            a(a2Var.b(), a2Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ca.b(13, null), e((a2) this.f9347b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f9347b.set(bundle.getBoolean("resolving_error", false) ? new a2(new ca.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a2 a2Var = (a2) this.f9347b.get();
        if (a2Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", a2Var.a());
        bundle.putInt("failed_status", a2Var.b().u1());
        bundle.putParcelable("failed_resolution", a2Var.b().w1());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f9346a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f9346a = false;
    }
}
