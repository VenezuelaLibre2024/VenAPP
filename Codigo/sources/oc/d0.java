package oc;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzacf;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.android.gms.internal.p002firebaseauthapi.zzafj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f22367b = "d0";

    /* renamed from: c, reason: collision with root package name */
    private static final d0 f22368c = new d0();

    /* renamed from: a, reason: collision with root package name */
    private String f22369a;

    private d0() {
    }

    public static d0 b() {
        return f22368c;
    }

    private final void d(FirebaseAuth firebaseAuth, e1 e1Var, Activity activity, TaskCompletionSource<g1> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new com.google.firebase.auth.t());
            return;
        }
        m0.d(firebaseAuth.i().m(), firebaseAuth);
        com.google.android.gms.common.internal.s.j(activity);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (v.b().h(activity, taskCompletionSource2)) {
            new zzadr(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzacf.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new h1(this, taskCompletionSource)).addOnFailureListener(new b1(this, taskCompletionSource));
    }

    public static boolean f(Exception exc) {
        if (exc instanceof com.google.firebase.auth.t) {
            return true;
        }
        return (exc instanceof com.google.firebase.auth.q) && ((com.google.firebase.auth.q) exc).a().endsWith("UNAUTHORIZED_DOMAIN");
    }

    public final Task<g1> a(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z10, boolean z11) {
        j1 n1Var;
        e eVar = (e) firebaseAuth.l();
        final e1 f10 = e1.f();
        if (!zzaed.zza(firebaseAuth.i()) && !eVar.h()) {
            String str2 = f22367b;
            Log.i(str2, "ForceRecaptchaFlow from phoneAuthOptions = " + z11 + ", ForceRecaptchaFlow from firebaseSettings = " + eVar.f());
            boolean f11 = z11 | eVar.f();
            final TaskCompletionSource<g1> taskCompletionSource = new TaskCompletionSource<>();
            Task<String> e10 = f10.e();
            if (e10 != null) {
                if (e10.isSuccessful()) {
                    n1Var = new n1().c(e10.getResult());
                } else {
                    Log.e(str2, "Error in previous reCAPTCHA flow: " + e10.getException().getMessage());
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (!z10 || f11) {
                d(firebaseAuth, f10, activity, taskCompletionSource);
            } else {
                (!TextUtils.isEmpty(this.f22369a) ? Tasks.forResult(new zzafj(this.f22369a)) : firebaseAuth.H()).continueWithTask(firebaseAuth.B0(), new f1(this, str, IntegrityManagerFactory.create(firebaseAuth.i().m()))).addOnCompleteListener(new OnCompleteListener() { // from class: oc.c
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        d0.this.c(taskCompletionSource, firebaseAuth, f10, activity, task);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }
        n1Var = new n1();
        return Tasks.forResult(n1Var.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, e1 e1Var, Activity activity, Task task) {
        if ((!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) ? false : true) {
            taskCompletionSource.setResult(new n1().b(((IntegrityTokenResponse) task.getResult()).token()).a());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(f22367b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        d(firebaseAuth, e1Var, activity, taskCompletionSource);
    }
}
