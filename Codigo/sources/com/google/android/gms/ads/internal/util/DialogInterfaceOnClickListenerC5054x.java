package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.C4965t;

/* renamed from: com.google.android.gms.ads.internal.util.x */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC5054x implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RunnableC5057y f10173a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC5054x(RunnableC5057y runnableC5057y) {
        this.f10173a = runnableC5057y;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C4965t.m12581r();
        C5005j2.m12681t(this.f10173a.f10175a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
