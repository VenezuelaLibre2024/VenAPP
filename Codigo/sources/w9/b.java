package w9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.p001authapiphone.zzw;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public abstract class b extends e<a.d.c> {
    private static final a.g<zzw> zza;
    private static final a.AbstractC0146a<zzw, a.d.c> zzb;
    private static final com.google.android.gms.common.api.a<a.d.c> zzc;

    static {
        a.g<zzw> gVar = new a.g<>();
        zza = gVar;
        c cVar = new c();
        zzb = cVar;
        zzc = new com.google.android.gms.common.api.a<>("SmsRetriever.API", cVar, gVar);
    }

    public b(Activity activity) {
        super(activity, zzc, a.d.f9307l, e.a.f9309c);
    }

    public b(Context context) {
        super(context, zzc, a.d.f9307l, e.a.f9309c);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);
}
