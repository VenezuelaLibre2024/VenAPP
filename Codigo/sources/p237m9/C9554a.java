package p237m9;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4886p3;
import com.google.android.gms.ads.internal.client.C4945z2;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzcdr;
import p438x8.C12365h;
import p438x8.EnumC12355c;

/* renamed from: m9.a */
/* loaded from: classes.dex */
public class C9554a {

    /* renamed from: a */
    private final C4886p3 f23255a;

    public C9554a(C4886p3 c4886p3) {
        this.f23255a = c4886p3;
    }

    /* renamed from: a */
    public static void m28444a(Context context, EnumC12355c enumC12355c, C12365h c12365h, AbstractC9555b abstractC9555b) {
        m28445c(context, enumC12355c, c12365h, null, abstractC9555b);
    }

    /* renamed from: c */
    private static void m28445c(final Context context, final EnumC12355c enumC12355c, final C12365h c12365h, final String str, final AbstractC9555b abstractC9555b) {
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzk.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: m9.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12365h c12365h2 = c12365h;
                        C4945z2 m39990a = c12365h2 == null ? null : c12365h2.m39990a();
                        new zzbxk(context, enumC12355c, m39990a, str).zzb(abstractC9555b);
                    }
                });
                return;
            }
        }
        new zzbxk(context, enumC12355c, c12365h == null ? null : c12365h.m39990a(), str).zzb(abstractC9555b);
    }

    /* renamed from: b */
    public String m28446b() {
        return this.f23255a.m12433a();
    }
}
