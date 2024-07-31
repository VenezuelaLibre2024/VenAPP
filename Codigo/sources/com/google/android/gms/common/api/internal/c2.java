package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a2 f9341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d2 f9342b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c2(d2 d2Var, a2 a2Var) {
        this.f9342b = d2Var;
        this.f9341a = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9342b.f9346a) {
            ca.b b10 = this.f9341a.b();
            if (b10.x1()) {
                d2 d2Var = this.f9342b;
                d2Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(d2Var.getActivity(), (PendingIntent) com.google.android.gms.common.internal.s.j(b10.w1()), this.f9341a.a(), false), 1);
                return;
            }
            d2 d2Var2 = this.f9342b;
            if (d2Var2.f9349d.b(d2Var2.getActivity(), b10.u1(), null) != null) {
                d2 d2Var3 = this.f9342b;
                d2Var3.f9349d.w(d2Var3.getActivity(), this.f9342b.mLifecycleFragment, b10.u1(), 2, this.f9342b);
            } else {
                if (b10.u1() != 18) {
                    this.f9342b.a(b10, this.f9341a.a());
                    return;
                }
                d2 d2Var4 = this.f9342b;
                Dialog r10 = d2Var4.f9349d.r(d2Var4.getActivity(), this.f9342b);
                d2 d2Var5 = this.f9342b;
                d2Var5.f9349d.s(d2Var5.getActivity().getApplicationContext(), new b2(this, r10));
            }
        }
    }
}
