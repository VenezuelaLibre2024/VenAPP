package p158ia;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ca.C1898d;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.internal.AbstractC5243h;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.internal.base.zav;

/* renamed from: ia.w */
/* loaded from: classes.dex */
public final class C7954w extends AbstractC5243h {
    /* JADX INFO: Access modifiers changed from: protected */
    public C7954w(Context context, Looper looper, C5234e c5234e, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
        super(context, looper, 308, c5234e, interfaceC5131f, interfaceC5161n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof C7940i ? (C7940i) queryLocalInterface : new C7940i(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final C1898d[] getApiFeatures() {
        return zav.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
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
