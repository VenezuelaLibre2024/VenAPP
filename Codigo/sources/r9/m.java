package r9;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f24828a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f24829b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str, Bundle bundle) {
        this.f24828a = str;
        this.f24829b = bundle;
    }

    @Override // r9.n
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd(this.f24828a, this.f24829b);
        o.f(zzd);
        String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new d(string);
    }
}
