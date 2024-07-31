package com.google.android.gms.internal.p496authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ca.C1898d;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.internal.AbstractC5243h;
import com.google.android.gms.common.internal.C5234e;
import p399v9.C11757a0;

/* loaded from: classes2.dex */
public final class zbbh extends AbstractC5243h {
    private final Bundle zba;

    public zbbh(Context context, Looper looper, C11757a0 c11757a0, C5234e c5234e, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
        super(context, looper, 212, c5234e, interfaceC5131f, interfaceC5161n);
        this.zba = new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof zbam ? (zbam) queryLocalInterface : new zbam(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final C1898d[] getApiFeatures() {
        return zbbi.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
