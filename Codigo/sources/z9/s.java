package z9;

import android.os.Parcel;
import com.google.android.gms.internal.p000authapi.zbb;

/* loaded from: classes.dex */
public abstract class s extends zbb implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            s();
        } else {
            if (i10 != 2) {
                return false;
            }
            i();
        }
        return true;
    }
}
