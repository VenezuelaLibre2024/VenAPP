package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xa.d;
import xa.e;

/* loaded from: classes2.dex */
public final class zzae implements e {
    private static final String zza = "zzae";

    public static i<e.b> zza(f fVar, byte[] bArr, String str) {
        return fVar.a(new zzi(fVar, bArr, str));
    }

    public static i<Object> zzb(f fVar, String str, int i10, String str2, int... iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return fVar.a(new zzk(fVar, iArr, i10, str, str2));
    }

    public final i<e.b> attest(f fVar, byte[] bArr) {
        return zza(fVar, bArr, null);
    }

    public final i<e.d> enableVerifyApps(f fVar) {
        return fVar.a(new zzm(this, fVar));
    }

    public final i<e.d> isVerifyAppsEnabled(f fVar) {
        return fVar.a(new zzl(this, fVar));
    }

    public final boolean isVerifyAppsEnabled(Context context) {
        Task<e.c> e10 = d.a(context).e();
        try {
            Tasks.await(e10, 15000L, TimeUnit.MILLISECONDS);
            return e10.getResult().c();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return false;
        }
    }

    public final i<Object> listHarmfulApps(f fVar) {
        return fVar.a(new zzn(this, fVar));
    }

    public final i<Object> lookupUri(f fVar, String str, String str2, int... iArr) {
        return zzb(fVar, str, 1, str2, iArr);
    }

    public final i<Object> lookupUri(f fVar, List<Integer> list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return fVar.a(new zzj(this, fVar, list, str, null));
    }

    public final i<Object> verifyWithRecaptcha(f fVar, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
        }
        return fVar.a(new zzo(this, fVar, str));
    }
}
