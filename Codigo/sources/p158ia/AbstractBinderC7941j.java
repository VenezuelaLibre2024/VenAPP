package p158ia;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import p136ha.C7680h;

/* renamed from: ia.j */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7941j extends zab implements InterfaceC7942k {
    public AbstractBinderC7941j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C7680h c7680h = (C7680h) zac.zaa(parcel, C7680h.CREATOR);
        zac.zab(parcel);
        mo24436u(c7680h);
        return true;
    }
}
