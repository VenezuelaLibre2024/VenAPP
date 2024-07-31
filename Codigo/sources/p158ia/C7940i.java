package p158ia;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC5139h;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* renamed from: ia.i */
/* loaded from: classes.dex */
public final class C7940i extends zaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C7940i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    /* renamed from: f2 */
    public final void m24437f2(InterfaceC7939h interfaceC7939h, C7932a c7932a) {
        Parcel zaa = zaa();
        zac.zae(zaa, interfaceC7939h);
        zac.zad(zaa, c7932a);
        zac(1, zaa);
    }

    /* renamed from: g2 */
    public final void m24438g2(InterfaceC7939h interfaceC7939h, C7932a c7932a, InterfaceC7942k interfaceC7942k) {
        Parcel zaa = zaa();
        zac.zae(zaa, interfaceC7939h);
        zac.zad(zaa, c7932a);
        zac.zae(zaa, interfaceC7942k);
        zac(2, zaa);
    }

    /* renamed from: h2 */
    public final void m24439h2(InterfaceC5139h interfaceC5139h, InterfaceC7942k interfaceC7942k) {
        Parcel zaa = zaa();
        zac.zae(zaa, interfaceC5139h);
        zac.zae(zaa, interfaceC7942k);
        zac(6, zaa);
    }
}
