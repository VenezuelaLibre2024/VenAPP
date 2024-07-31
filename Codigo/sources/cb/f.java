package cb;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import cb.b;
import cb.e;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f {

    /* loaded from: classes2.dex */
    public interface a {
        void onConsentFormLoadFailure(@RecentlyNonNull e eVar);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onConsentFormLoadSuccess(@RecentlyNonNull cb.b bVar);
    }

    @RecentlyNonNull
    public static c a(@RecentlyNonNull Context context) {
        return zza.zza(context).zzb();
    }

    public static void b(@RecentlyNonNull final Activity activity, @RecentlyNonNull final b.a aVar) {
        if (zza.zza(activity).zzb().canRequestAds()) {
            aVar.onConsentFormDismissed(null);
            return;
        }
        zzbn zzc = zza.zza(activity).zzc();
        zzcr.zza();
        b bVar = new b() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
            @Override // cb.f.b
            public final void onConsentFormLoadSuccess(b bVar2) {
                bVar2.show(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        zzc.zzb(bVar, new a() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
            @Override // cb.f.a
            public final void onConsentFormLoadFailure(e eVar) {
                b.a.this.onConsentFormDismissed(eVar);
            }
        });
    }

    public static void c(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        zza.zza(context).zzc().zzb(bVar, aVar);
    }

    public static void d(@RecentlyNonNull Activity activity, @RecentlyNonNull b.a aVar) {
        zza.zza(activity).zzc().zze(activity, aVar);
    }
}
