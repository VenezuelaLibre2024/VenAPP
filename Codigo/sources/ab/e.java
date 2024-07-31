package ab;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes2.dex */
public abstract class e extends zab implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                l lVar = (l) zac.zaa(parcel, l.CREATOR);
                zac.zab(parcel);
                v0(lVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
