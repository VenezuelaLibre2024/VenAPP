package p272oc;

import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* renamed from: oc.p0 */
/* loaded from: classes.dex */
final class C9879p0 implements Continuation {

    /* renamed from: a */
    private final /* synthetic */ String f24365a;

    /* renamed from: b */
    private final /* synthetic */ C9891t0 f24366b;

    /* renamed from: c */
    private final /* synthetic */ RecaptchaAction f24367c;

    /* renamed from: d */
    private final /* synthetic */ Continuation f24368d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9879p0(String str, C9891t0 c9891t0, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f24365a = str;
        this.f24366b = c9891t0;
        this.f24367c = recaptchaAction;
        this.f24368d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzacf.zzb((Exception) C5276s.m13324j(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f24365a);
        }
        return this.f24366b.m29597b(this.f24365a, Boolean.TRUE, this.f24367c).continueWithTask(this.f24368d);
    }
}
