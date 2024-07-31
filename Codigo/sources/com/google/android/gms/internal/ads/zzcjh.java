package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes2.dex */
final class zzcjh implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;
    final /* synthetic */ EditText zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjh(JsPromptResult jsPromptResult, EditText editText) {
        this.zza = jsPromptResult;
        this.zzb = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.confirm(this.zzb.getText().toString());
    }
}
