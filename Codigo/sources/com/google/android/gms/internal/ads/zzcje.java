package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class zzcje implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcje(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.confirm();
    }
}
