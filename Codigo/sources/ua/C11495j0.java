package ua;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.j0 */
/* loaded from: classes2.dex */
public final class C11495j0 implements InterfaceC11483d0 {

    /* renamed from: b */
    private final zzap f29836b;

    /* renamed from: c */
    final /* synthetic */ C11481c0 f29837c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11495j0(C11481c0 c11481c0) {
        zzap zzapVar;
        this.f29837c = c11481c0;
        zzapVar = c11481c0.f29807a;
        this.f29836b = zzapVar;
    }

    @Override // ua.InterfaceC11483d0
    public final C11477a0 getTile(int i10, int i11, int i12) {
        try {
            return this.f29836b.zzb(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
