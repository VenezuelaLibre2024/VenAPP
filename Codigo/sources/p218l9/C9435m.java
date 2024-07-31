package p218l9;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzebb;
import com.google.android.gms.internal.ads.zzgdu;
import com.google.android.gms.internal.ads.zzgen;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: l9.m */
/* loaded from: classes.dex */
public final class C9435m implements zzgdu {

    /* renamed from: a */
    private final Executor f22950a;

    /* renamed from: b */
    private final zzebb f22951b;

    public C9435m(Executor executor, zzebb zzebbVar) {
        this.f22950a = executor;
        this.f22951b = zzebbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ InterfaceFutureC5920f zza(Object obj) {
        final zzbze zzbzeVar = (zzbze) obj;
        return zzgen.zzn(this.f22951b.zzb(zzbzeVar), new zzgdu() { // from class: l9.l
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final InterfaceFutureC5920f zza(Object obj2) {
                C9439o c9439o = new C9439o(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    c9439o.f22959b = C4930x.m12474b().zzh(zzbze.this.zza).toString();
                } catch (JSONException unused) {
                    c9439o.f22959b = "{}";
                }
                return zzgen.zzh(c9439o);
            }
        }, this.f22950a);
    }
}
