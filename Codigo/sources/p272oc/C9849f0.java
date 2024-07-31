package p272oc;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p498firebaseauthapi.zzacf;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC6076i;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.f0 */
/* loaded from: classes.dex */
public final class C9849f0 extends BroadcastReceiver {

    /* renamed from: a */
    private final WeakReference<Activity> f24315a;

    /* renamed from: b */
    private final TaskCompletionSource<InterfaceC6076i> f24316b;

    /* renamed from: c */
    private final FirebaseAuth f24317c;

    /* renamed from: d */
    private final AbstractC6045a0 f24318d;

    /* renamed from: e */
    private final /* synthetic */ C9896v f24319e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9849f0(C9896v c9896v, Activity activity, TaskCompletionSource<InterfaceC6076i> taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC6045a0 abstractC6045a0) {
        this.f24319e = c9896v;
        this.f24315a = new WeakReference<>(activity);
        this.f24316b = taskCompletionSource;
        this.f24317c = firebaseAuth;
        this.f24318d = abstractC6045a0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f24315a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f24316b.setException(zzacf.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C9896v.m29602d(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (C9841c1.m29507d(intent)) {
                this.f24316b.setException(zzacf.zza(C9841c1.m29504a(intent)));
                C9896v.m29602d(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f24316b.setException(zzacf.zza(C9881q.m29583a("WEB_CONTEXT_CANCELED")));
                    C9896v.m29602d(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f24317c.m16422y(C9896v.m29599a(intent)).addOnSuccessListener(new C9902x(r0, r1, context)).addOnFailureListener(new C9905y(this.f24319e, this.f24316b, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            this.f24318d.m16431B1(C9896v.m29599a(intent)).addOnSuccessListener(new C9908z(r0, r1, context)).addOnFailureListener(new C9832a0(this.f24319e, this.f24316b, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            this.f24318d.m16432C1(C9896v.m29599a(intent)).addOnSuccessListener(new C9836b0(r0, r1, context)).addOnFailureListener(new C9840c0(this.f24319e, this.f24316b, context));
        } else {
            this.f24316b.setException(zzacf.zza(C9881q.m29583a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
