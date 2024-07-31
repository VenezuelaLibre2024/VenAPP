package oc;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzacf;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f22374a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<String> f22375b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v f22376c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(v vVar, Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        this.f22376c = vVar;
        this.f22374a = new WeakReference<>(activity);
        this.f22375b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f22374a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f22375b.setException(zzacf.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            v.d(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                v.e(this.f22376c, intent, this.f22375b, context);
                return;
            }
            this.f22375b.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (c1.d(intent)) {
            this.f22375b.setException(zzacf.zza(c1.a(intent)));
            v.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f22375b.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED")));
            v.d(context);
        }
    }
}