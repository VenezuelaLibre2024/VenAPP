package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC5147j;

/* renamed from: com.google.android.gms.common.internal.i0 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC5247i0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC5247i0 m13278b(Activity activity, Intent intent, int i10) {
        return new C5241g0(intent, activity, i10);
    }

    /* renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC5247i0 m13279c(InterfaceC5147j interfaceC5147j, Intent intent, int i10) {
        return new C5244h0(intent, interfaceC5147j, 2);
    }

    /* renamed from: a */
    protected abstract void mo13262a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            mo13262a();
        } catch (ActivityNotFoundException e10) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
