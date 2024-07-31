package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
final class x implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ y f9074a;

    public x(y yVar) {
        this.f9074a = yVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.t.r();
        j2.t(this.f9074a.f9076a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
