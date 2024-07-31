package com.google.android.gms.internal.p497authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ca.C1898d;
import ca.C1912k;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.internal.AbstractC5243h;
import com.google.android.gms.common.internal.C5234e;

/* loaded from: classes2.dex */
public final class zzw extends AbstractC5243h<zzh> {
    public zzw(Context context, Looper looper, C5234e c5234e, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
        super(context, looper, 126, c5234e, interfaceC5131f, interfaceC5161n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final C1898d[] getApiFeatures() {
        return zzac.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return C1912k.f7932a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
