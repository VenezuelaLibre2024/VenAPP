package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfm extends BroadcastReceiver {
    final /* synthetic */ zzfn zza;

    public /* synthetic */ zzfm(zzfn zzfnVar, zzfl zzflVar) {
        this.zza = zzfnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i10 = type != 9 ? 8 : 7;
                                }
                                i10 = 5;
                            }
                        }
                        i10 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i10 = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i10 = 4;
                            break;
                        case 13:
                            i10 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i10 = 6;
                            break;
                        case 18:
                            i10 = 2;
                            break;
                        case 20:
                            if (zzfy.zza >= 29) {
                                i10 = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i10 = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (zzfy.zza < 31 || i10 != 5) {
            zzfn.zzc(this.zza, i10);
            return;
        }
        zzfn zzfnVar = this.zza;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
            telephonyManager.getClass();
            zzfk zzfkVar = new zzfk(zzfnVar);
            mainExecutor = context.getMainExecutor();
            telephonyManager.registerTelephonyCallback(mainExecutor, zzfkVar);
            telephonyManager.unregisterTelephonyCallback(zzfkVar);
        } catch (RuntimeException unused2) {
            zzfn.zzc(zzfnVar, 5);
        }
    }
}
