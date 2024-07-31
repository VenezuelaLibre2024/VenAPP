package oc;

import com.google.android.gms.internal.p002firebaseauthapi.zzafk;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    Map<String, Task<RecaptchaTasksClient>> f22453a;

    /* renamed from: b, reason: collision with root package name */
    private zzafk f22454b;

    /* renamed from: c, reason: collision with root package name */
    zb.g f22455c;

    /* renamed from: d, reason: collision with root package name */
    private FirebaseAuth f22456d;

    /* renamed from: e, reason: collision with root package name */
    s0 f22457e;

    public t0(zb.g gVar, FirebaseAuth firebaseAuth) {
        this(gVar, firebaseAuth, new r0());
    }

    private t0(zb.g gVar, FirebaseAuth firebaseAuth, s0 s0Var) {
        this.f22453a = new HashMap();
        this.f22455c = gVar;
        this.f22456d = firebaseAuth;
        this.f22457e = s0Var;
    }

    private final Task<RecaptchaTasksClient> e(String str) {
        return this.f22453a.get(str);
    }

    private static String f(String str) {
        return zzag.zzc(str) ? "*" : str;
    }

    public final Task<RecaptchaTasksClient> a(String str, Boolean bool) {
        Task<RecaptchaTasksClient> e10;
        String f10 = f(str);
        return (bool.booleanValue() || (e10 = e(f10)) == null) ? this.f22456d.U("RECAPTCHA_ENTERPRISE").continueWithTask(new w0(this, f10)) : e10;
    }

    public final Task<String> b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String f10 = f(str);
        Task<RecaptchaTasksClient> e10 = e(f10);
        if (bool.booleanValue() || e10 == null) {
            e10 = a(f10, bool);
        }
        return e10.continueWithTask(new v0(this, recaptchaAction));
    }

    public final boolean d(String str) {
        zzafk zzafkVar = this.f22454b;
        return zzafkVar != null && zzafkVar.zzb(str);
    }
}
