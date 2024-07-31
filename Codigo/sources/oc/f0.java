package oc;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzacf;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f22382a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<com.google.firebase.auth.i> f22383b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseAuth f22384c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.auth.a0 f22385d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ v f22386e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(v vVar, Activity activity, TaskCompletionSource<com.google.firebase.auth.i> taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        this.f22386e = vVar;
        this.f22382a = new WeakReference<>(activity);
        this.f22383b = taskCompletionSource;
        this.f22384c = firebaseAuth;
        this.f22385d = a0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f22382a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f22383b.setException(zzacf.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            v.d(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (c1.d(intent)) {
                this.f22383b.setException(zzacf.zza(c1.a(intent)));
                v.d(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f22383b.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED")));
                    v.d(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f22384c.y(v.a(intent)).addOnSuccessListener(new x(r0, r1, context)).addOnFailureListener(new y(this.f22386e, this.f22383b, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            this.f22385d.B1(v.a(intent)).addOnSuccessListener(new z(r0, r1, context)).addOnFailureListener(new a0(this.f22386e, this.f22383b, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            this.f22385d.C1(v.a(intent)).addOnSuccessListener(new b0(r0, r1, context)).addOnFailureListener(new c0(this.f22386e, this.f22383b, context));
        } else {
            this.f22383b.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
