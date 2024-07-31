package ia;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public abstract class g extends zab implements h {
    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            ha.b bVar = (ha.b) zac.zaa(parcel, ha.b.CREATOR);
            zac.zab(parcel);
            J1(status, bVar);
        } else if (i10 == 2) {
            Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
            ha.g gVar = (ha.g) zac.zaa(parcel, ha.g.CREATOR);
            zac.zab(parcel);
            d2(status2, gVar);
        } else if (i10 == 3) {
            Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
            ha.e eVar = (ha.e) zac.zaa(parcel, ha.e.CREATOR);
            zac.zab(parcel);
            b0(status3, eVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zab(parcel);
            S1(status4);
        }
        return true;
    }
}
