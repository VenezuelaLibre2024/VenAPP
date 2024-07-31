package p484z9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p496authapi.zba;
import com.google.android.gms.internal.p496authapi.zbc;

/* renamed from: z9.w */
/* loaded from: classes.dex */
public final class C12850w extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12850w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: f2 */
    public final void m42596f2(InterfaceC12849v interfaceC12849v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC12849v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(103, zba);
    }

    /* renamed from: g2 */
    public final void m42597g2(InterfaceC12849v interfaceC12849v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC12849v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    /* renamed from: h2 */
    public final void m42598h2(InterfaceC12849v interfaceC12849v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC12849v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
