package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.C4965t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.y */
/* loaded from: classes.dex */
public final class RunnableC5057y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f10175a;

    /* renamed from: b */
    final /* synthetic */ String f10176b;

    /* renamed from: c */
    final /* synthetic */ boolean f10177c;

    /* renamed from: d */
    final /* synthetic */ boolean f10178d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5057y(C5060z c5060z, Context context, String str, boolean z10, boolean z11) {
        this.f10175a = context;
        this.f10176b = str;
        this.f10177c = z10;
        this.f10178d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4965t.m12581r();
        AlertDialog.Builder m12671j = C5005j2.m12671j(this.f10175a);
        m12671j.setMessage(this.f10176b);
        m12671j.setTitle(this.f10177c ? "Error" : "Info");
        if (this.f10178d) {
            m12671j.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            m12671j.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC5054x(this));
            m12671j.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        m12671j.create().show();
    }
}
