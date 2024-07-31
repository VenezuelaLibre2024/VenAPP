package p158ia;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import p136ha.C7674b;
import p136ha.C7677e;
import p136ha.C7679g;

/* renamed from: ia.g */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7938g extends zab implements InterfaceC7939h {
    public AbstractBinderC7938g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            C7674b c7674b = (C7674b) zac.zaa(parcel, C7674b.CREATOR);
            zac.zab(parcel);
            mo24432J1(status, c7674b);
        } else if (i10 == 2) {
            Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
            C7679g c7679g = (C7679g) zac.zaa(parcel, C7679g.CREATOR);
            zac.zab(parcel);
            mo24435d2(status2, c7679g);
        } else if (i10 == 3) {
            Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
            C7677e c7677e = (C7677e) zac.zaa(parcel, C7677e.CREATOR);
            zac.zab(parcel);
            mo24434b0(status3, c7677e);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zab(parcel);
            mo24433S1(status4);
        }
        return true;
    }
}
