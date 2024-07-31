package oc;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.d2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    private static v f22463c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f22464a = false;

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f22465b;

    private v() {
    }

    private static com.google.firebase.auth.h a(Intent intent) {
        com.google.android.gms.common.internal.s.j(intent);
        return d2.B1(((zzagt) ea.e.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzagt.CREATOR)).zzc(true));
    }

    public static v b() {
        if (f22463c == null) {
            f22463c = new v();
        }
        return f22463c;
    }

    private final void c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f22465b = broadcastReceiver;
        k1.a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Context context) {
        v vVar = f22463c;
        vVar.f22464a = false;
        if (vVar.f22465b != null) {
            k1.a.b(context).e(f22463c.f22465b);
        }
        f22463c.f22465b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(v vVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        d(context);
    }

    public final boolean h(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.f22464a) {
            return false;
        }
        c(activity, new e0(this, activity, taskCompletionSource));
        this.f22464a = true;
        return true;
    }

    public final boolean i(Activity activity, TaskCompletionSource<com.google.firebase.auth.i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return j(activity, taskCompletionSource, firebaseAuth, null);
    }

    public final boolean j(Activity activity, TaskCompletionSource<com.google.firebase.auth.i> taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        if (this.f22464a) {
            return false;
        }
        c(activity, new f0(this, activity, taskCompletionSource, firebaseAuth, a0Var));
        this.f22464a = true;
        return true;
    }
}
