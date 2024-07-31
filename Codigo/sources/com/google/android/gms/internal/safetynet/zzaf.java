package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaf extends h<zzh> {
    private final Context zze;

    public zzaf(Context context, Looper looper, e eVar, f.a aVar, f.b bVar) {
        super(context, looper, 45, eVar, aVar, bVar);
        this.zze = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12200000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzp(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.zze.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.zze.getPackageName(), RecognitionOptions.ITF)) == null || (bundle = applicationInfo.metaData) == null) {
                return "";
            }
            String str2 = (String) bundle.get(str);
            return str2 == null ? "" : str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(zzg zzgVar, List<Integer> list, int i10, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = zzp("com.google.android.safetynet.API_KEY");
        }
        String str3 = str2;
        int[] iArr = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr[i11] = list.get(i11).intValue();
        }
        ((zzh) getService()).zzh(zzgVar, str3, iArr, i10, str);
    }
}
