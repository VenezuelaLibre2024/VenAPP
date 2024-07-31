package p330r9;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r9.m */
/* loaded from: classes.dex */
public final class C10654m implements InterfaceC10655n {

    /* renamed from: a */
    final /* synthetic */ String f26942a;

    /* renamed from: b */
    final /* synthetic */ Bundle f26943b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10654m(String str, Bundle bundle) {
        this.f26942a = str;
        this.f26943b = bundle;
    }

    @Override // p330r9.InterfaceC10655n
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo32425a(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd(this.f26942a, this.f26943b);
        C10656o.m32431f(zzd);
        String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new C10645d(string);
    }
}
