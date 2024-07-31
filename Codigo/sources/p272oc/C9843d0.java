package p272oc;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzacf;
import com.google.android.gms.internal.p498firebaseauthapi.zzadr;
import com.google.android.gms.internal.p498firebaseauthapi.zzaed;
import com.google.android.gms.internal.p498firebaseauthapi.zzafj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.C6111q;
import com.google.firebase.auth.C6123t;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: oc.d0 */
/* loaded from: classes.dex */
public class C9843d0 {

    /* renamed from: b */
    private static final String f24300b = "d0";

    /* renamed from: c */
    private static final C9843d0 f24301c = new C9843d0();

    /* renamed from: a */
    private String f24302a;

    private C9843d0() {
    }

    /* renamed from: b */
    public static C9843d0 m29516b() {
        return f24301c;
    }

    /* renamed from: d */
    private final void m29517d(FirebaseAuth firebaseAuth, C9847e1 c9847e1, Activity activity, TaskCompletionSource<AbstractC9853g1> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new C6123t());
            return;
        }
        C9870m0.m29557d(firebaseAuth.m16396i().m42630m(), firebaseAuth);
        C5276s.m13324j(activity);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (C9896v.m29600b().m29607h(activity, taskCompletionSource2)) {
            new zzadr(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzacf.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new C9856h1(this, taskCompletionSource)).addOnFailureListener(new C9837b1(this, taskCompletionSource));
    }

    /* renamed from: f */
    public static boolean m29519f(Exception exc) {
        if (exc instanceof C6123t) {
            return true;
        }
        return (exc instanceof C6111q) && ((C6111q) exc).m16603a().endsWith("UNAUTHORIZED_DOMAIN");
    }

    /* renamed from: a */
    public final Task<AbstractC9853g1> m29521a(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z10, boolean z11) {
        AbstractC9862j1 c9874n1;
        C9845e c9845e = (C9845e) firebaseAuth.m16401l();
        final C9847e1 m29528f = C9847e1.m29528f();
        if (!zzaed.zza(firebaseAuth.m16396i()) && !c9845e.m29527h()) {
            String str2 = f24300b;
            Log.i(str2, "ForceRecaptchaFlow from phoneAuthOptions = " + z11 + ", ForceRecaptchaFlow from firebaseSettings = " + c9845e.m29525f());
            boolean m29525f = z11 | c9845e.m29525f();
            final TaskCompletionSource<AbstractC9853g1> taskCompletionSource = new TaskCompletionSource<>();
            Task<String> m29533e = m29528f.m29533e();
            if (m29533e != null) {
                if (m29533e.isSuccessful()) {
                    c9874n1 = new C9874n1().mo29551c(m29533e.getResult());
                } else {
                    Log.e(str2, "Error in previous reCAPTCHA flow: " + m29533e.getException().getMessage());
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (!z10 || m29525f) {
                m29517d(firebaseAuth, m29528f, activity, taskCompletionSource);
            } else {
                (!TextUtils.isEmpty(this.f24302a) ? Tasks.forResult(new zzafj(this.f24302a)) : firebaseAuth.m16369H()).continueWithTask(firebaseAuth.m16361B0(), new C9850f1(this, str, IntegrityManagerFactory.create(firebaseAuth.m16396i().m42630m()))).addOnCompleteListener(new OnCompleteListener() { // from class: oc.c
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C9843d0.this.m29522c(taskCompletionSource, firebaseAuth, m29528f, activity, task);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }
        c9874n1 = new C9874n1();
        return Tasks.forResult(c9874n1.mo29549a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m29522c(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, C9847e1 c9847e1, Activity activity, Task task) {
        if ((!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) ? false : true) {
            taskCompletionSource.setResult(new C9874n1().mo29550b(((IntegrityTokenResponse) task.getResult()).token()).mo29549a());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(f24300b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        m29517d(firebaseAuth, c9847e1, activity, taskCompletionSource);
    }
}
