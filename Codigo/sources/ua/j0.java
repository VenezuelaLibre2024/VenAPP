package ua;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j0 implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private final zzap f27520b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f27521c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(c0 c0Var) {
        zzap zzapVar;
        this.f27521c = c0Var;
        zzapVar = c0Var.f27491a;
        this.f27520b = zzapVar;
    }

    @Override // ua.d0
    public final a0 getTile(int i10, int i11, int i12) {
        try {
            return this.f27520b.zzb(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
