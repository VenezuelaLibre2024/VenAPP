package com.google.android.gms.internal.p496authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.internal.AbstractC5243h;
import com.google.android.gms.common.internal.C5234e;
import p352s9.C10849a;

/* loaded from: classes2.dex */
public final class zbo extends AbstractC5243h {
    private final C10849a.a zba;

    public zbo(Context context, Looper looper, C5234e c5234e, C10849a.a aVar, AbstractC5106f.a aVar2, AbstractC5106f.b bVar) {
        super(context, looper, 68, c5234e, aVar2, bVar);
        C10849a.a.C13250a c13250a = new C10849a.a.C13250a(aVar == null ? C10849a.a.f27528d : aVar);
        c13250a.m33094a(zbbj.zba());
        this.zba = new C10849a.a(c13250a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbt ? (zbt) queryLocalInterface : new zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.m33092a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C10849a.a zba() {
        return this.zba;
    }
}
