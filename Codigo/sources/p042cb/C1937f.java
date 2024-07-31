package p042cb;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import java.util.Objects;
import p042cb.C1936e;
import p042cb.InterfaceC1933b;

/* renamed from: cb.f */
/* loaded from: classes2.dex */
public final class C1937f {

    /* renamed from: cb.f$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onConsentFormLoadFailure(@RecentlyNonNull C1936e c1936e);
    }

    /* renamed from: cb.f$b */
    /* loaded from: classes2.dex */
    public interface b {
        void onConsentFormLoadSuccess(@RecentlyNonNull InterfaceC1933b interfaceC1933b);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static InterfaceC1934c m10142a(@RecentlyNonNull Context context) {
        return zza.zza(context).zzb();
    }

    /* renamed from: b */
    public static void m10143b(@RecentlyNonNull final Activity activity, @RecentlyNonNull final InterfaceC1933b.a aVar) {
        if (zza.zza(activity).zzb().canRequestAds()) {
            aVar.onConsentFormDismissed(null);
            return;
        }
        zzbn zzc = zza.zza(activity).zzc();
        zzcr.zza();
        b bVar = new b() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
            @Override // p042cb.C1937f.b
            public final void onConsentFormLoadSuccess(InterfaceC1933b interfaceC1933b) {
                interfaceC1933b.show(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        zzc.zzb(bVar, new a() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
            @Override // p042cb.C1937f.a
            public final void onConsentFormLoadFailure(C1936e c1936e) {
                InterfaceC1933b.a.this.onConsentFormDismissed(c1936e);
            }
        });
    }

    /* renamed from: c */
    public static void m10144c(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        zza.zza(context).zzc().zzb(bVar, aVar);
    }

    /* renamed from: d */
    public static void m10145d(@RecentlyNonNull Activity activity, @RecentlyNonNull InterfaceC1933b.a aVar) {
        zza.zza(activity).zzc().zze(activity, aVar);
    }
}
