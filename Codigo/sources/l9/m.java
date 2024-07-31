package l9;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzebb;
import com.google.android.gms.internal.ads.zzgdu;
import com.google.android.gms.internal.ads.zzgen;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class m implements zzgdu {

    /* renamed from: a */
    private final Executor f21097a;

    /* renamed from: b */
    private final zzebb f21098b;

    public m(Executor executor, zzebb zzebbVar) {
        this.f21097a = executor;
        this.f21098b = zzebbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.f zza(Object obj) {
        zzbze zzbzeVar = (zzbze) obj;
        return zzgen.zzn(this.f21098b.zzb(zzbzeVar), new zzgdu() { // from class: l9.l
            public /* synthetic */ l() {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj2) {
                o oVar = new o(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    oVar.f21106b = com.google.android.gms.ads.internal.client.x.b().zzh(zzbze.this.zza).toString();
                } catch (JSONException unused) {
                    oVar.f21106b = "{}";
                }
                return zzgen.zzh(oVar);
            }
        }, this.f21097a);
    }
}
