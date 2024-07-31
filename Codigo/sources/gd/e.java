package gd;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.f;
import gd.h;
import gd.i;

/* loaded from: classes.dex */
public class e extends com.google.android.gms.common.internal.h<i> {
    public e(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, f.a aVar, f.b bVar) {
        super(context, looper, 131, eVar, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i createServiceInterface(IBinder iBinder) {
        return i.a.f2(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(h.a aVar, Bundle bundle) {
        try {
            ((i) getService()).Y0(aVar, bundle);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(h.a aVar, String str) {
        try {
            ((i) getService()).P(aVar, str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return ca.k.f6983a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public boolean usesClientTelemetry() {
        return true;
    }
}
