package z9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes.dex */
public final class w extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void f2(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, vVar);
        zbc.zbc(zba, googleSignInOptions);
        zbb(103, zba);
    }

    public final void g2(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, vVar);
        zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void h2(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, vVar);
        zbc.zbc(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
