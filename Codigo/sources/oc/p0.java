package oc;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: classes.dex */
final class p0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f22432a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t0 f22433b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f22434c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Continuation f22435d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(String str, t0 t0Var, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f22432a = str;
        this.f22433b = t0Var;
        this.f22434c = recaptchaAction;
        this.f22435d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzacf.zzb((Exception) com.google.android.gms.common.internal.s.j(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f22432a);
        }
        return this.f22433b.b(this.f22432a, Boolean.TRUE, this.f22434c).continueWithTask(this.f22435d);
    }
}
