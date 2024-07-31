package p484z9;

import android.os.Parcel;
import com.google.android.gms.internal.p496authapi.zbb;

/* renamed from: z9.s */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12846s extends zbb implements InterfaceC12847t {
    public AbstractBinderC12846s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p496authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            mo42595s();
        } else {
            if (i10 != 2) {
                return false;
            }
            mo42594i();
        }
        return true;
    }
}
