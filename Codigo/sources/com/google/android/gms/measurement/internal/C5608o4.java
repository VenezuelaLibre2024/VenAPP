package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ca.C1912k;
import com.google.android.gms.common.internal.AbstractC5228c;
import p418wa.InterfaceC12109i;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes2.dex */
public final class C5608o4 extends AbstractC5228c<InterfaceC12109i> {
    public C5608o4(Context context, Looper looper, AbstractC5228c.a aVar, AbstractC5228c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final /* synthetic */ InterfaceC12109i createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC12109i ? (InterfaceC12109i) queryLocalInterface : new C5543j4(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return C1912k.f7932a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
