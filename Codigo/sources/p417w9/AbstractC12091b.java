package p417w9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.internal.p497authapiphone.zzw;
import com.google.android.gms.tasks.Task;

/* renamed from: w9.b */
/* loaded from: classes.dex */
public abstract class AbstractC12091b extends AbstractC5105e<C5101a.d.c> {
    private static final C5101a.g<zzw> zza;
    private static final C5101a.a<zzw, C5101a.d.c> zzb;
    private static final C5101a<C5101a.d.c> zzc;

    static {
        C5101a.g<zzw> gVar = new C5101a.g<>();
        zza = gVar;
        C12092c c12092c = new C12092c();
        zzb = c12092c;
        zzc = new C5101a<>("SmsRetriever.API", c12092c, gVar);
    }

    public AbstractC12091b(Activity activity) {
        super(activity, zzc, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }

    public AbstractC12091b(Context context) {
        super(context, zzc, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);
}
