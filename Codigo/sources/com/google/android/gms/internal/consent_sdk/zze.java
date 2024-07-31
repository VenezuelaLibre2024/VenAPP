package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zze {
    private final Executor zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(final String str, final String str2, final zzd... zzdVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzc
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                final JSONObject jSONObject;
                String str4;
                Throwable e10;
                String str5 = str;
                if (!TextUtils.isEmpty(str5)) {
                    String str6 = str2;
                    final String lowerCase = str5.toLowerCase();
                    if (TextUtils.isEmpty(str6)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(str6);
                        } catch (JSONException unused) {
                            str3 = "Action[" + lowerCase + "]: failed to parse args: " + str6;
                        }
                    }
                    zzd[] zzdVarArr2 = zzdVarArr;
                    Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                    for (final zzd zzdVar : zzdVarArr2) {
                        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzb
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(zzd.this.zzb(lowerCase, jSONObject));
                            }
                        });
                        zzdVar.zza().execute(futureTask);
                        try {
                        } catch (InterruptedException e11) {
                            e10 = e11;
                            str4 = "Thread interrupted for Action[" + lowerCase + "]: ";
                            Log.d("UserMessagingPlatform", str4, e10);
                        } catch (ExecutionException e12) {
                            str4 = "Failed to run Action[" + lowerCase + "]: ";
                            e10 = e12.getCause();
                            Log.d("UserMessagingPlatform", str4, e10);
                        }
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    }
                    return;
                }
                str3 = "Error on action: empty action name";
                Log.d("UserMessagingPlatform", str3);
            }
        });
    }
}
