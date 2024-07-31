package p272oc;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p498firebaseauthapi.zzacf;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.e0 */
/* loaded from: classes.dex */
public final class C9846e0 extends BroadcastReceiver {

    /* renamed from: a */
    private final WeakReference<Activity> f24307a;

    /* renamed from: b */
    private final TaskCompletionSource<String> f24308b;

    /* renamed from: c */
    private final /* synthetic */ C9896v f24309c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9846e0(C9896v c9896v, Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        this.f24309c = c9896v;
        this.f24307a = new WeakReference<>(activity);
        this.f24308b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f24307a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f24308b.setException(zzacf.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C9896v.m29602d(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                C9896v.m29603e(this.f24309c, intent, this.f24308b, context);
                return;
            }
            this.f24308b.setException(zzacf.zza(C9881q.m29583a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (C9841c1.m29507d(intent)) {
            this.f24308b.setException(zzacf.zza(C9841c1.m29504a(intent)));
            C9896v.m29602d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f24308b.setException(zzacf.zza(C9881q.m29583a("WEB_CONTEXT_CANCELED")));
            C9896v.m29602d(context);
        }
    }
}
