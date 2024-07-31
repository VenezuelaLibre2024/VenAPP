package m9;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.p3;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzcdr;
import x8.h;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final p3 f21401a;

    public a(p3 p3Var) {
        this.f21401a = p3Var;
    }

    public static void a(Context context, x8.c cVar, h hVar, b bVar) {
        c(context, cVar, hVar, null, bVar);
    }

    private static void c(final Context context, final x8.c cVar, final h hVar, final String str, final b bVar) {
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzk.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: m9.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar2 = hVar;
                        z2 a10 = hVar2 == null ? null : hVar2.a();
                        new zzbxk(context, cVar, a10, str).zzb(bVar);
                    }
                });
                return;
            }
        }
        new zzbxk(context, cVar, hVar == null ? null : hVar.a(), str).zzb(bVar);
    }

    public String b() {
        return this.f21401a.a();
    }
}
