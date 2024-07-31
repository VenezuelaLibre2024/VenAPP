package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f9076a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9077b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f9078c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f9079d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, Context context, String str, boolean z10, boolean z11) {
        this.f9076a = context;
        this.f9077b = str;
        this.f9078c = z10;
        this.f9079d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.t.r();
        AlertDialog.Builder j10 = j2.j(this.f9076a);
        j10.setMessage(this.f9077b);
        j10.setTitle(this.f9078c ? "Error" : "Info");
        if (this.f9079d) {
            j10.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            j10.setPositiveButton("Learn More", new x(this));
            j10.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        j10.create().show();
    }
}
