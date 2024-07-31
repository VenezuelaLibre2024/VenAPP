package gd;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import ca.C1912k;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.internal.AbstractC5243h;
import com.google.android.gms.common.internal.C5234e;
import gd.InterfaceC7552h;
import gd.InterfaceC7553i;

/* renamed from: gd.e */
/* loaded from: classes.dex */
public class C7549e extends AbstractC5243h<InterfaceC7553i> {
    public C7549e(Context context, Looper looper, C5234e c5234e, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
        super(context, looper, 131, c5234e, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7553i createServiceInterface(IBinder iBinder) {
        return InterfaceC7553i.a.m22931f2(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m22918d(InterfaceC7552h.a aVar, Bundle bundle) {
        try {
            ((InterfaceC7553i) getService()).mo22930Y0(aVar, bundle);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m22919e(InterfaceC7552h.a aVar, String str) {
        try {
            ((InterfaceC7553i) getService()).mo22929P(aVar, str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public int getMinApkVersion() {
        return C1912k.f7932a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public boolean usesClientTelemetry() {
        return true;
    }
}
