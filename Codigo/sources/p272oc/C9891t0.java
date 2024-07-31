package p272oc;

import com.google.android.gms.internal.p498firebaseauthapi.zzafk;
import com.google.android.gms.internal.p498firebaseauthapi.zzag;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import p485zb.C12867g;

/* renamed from: oc.t0 */
/* loaded from: classes.dex */
public final class C9891t0 {

    /* renamed from: a */
    Map<String, Task<RecaptchaTasksClient>> f24386a;

    /* renamed from: b */
    private zzafk f24387b;

    /* renamed from: c */
    C12867g f24388c;

    /* renamed from: d */
    private FirebaseAuth f24389d;

    /* renamed from: e */
    InterfaceC9888s0 f24390e;

    public C9891t0(C12867g c12867g, FirebaseAuth firebaseAuth) {
        this(c12867g, firebaseAuth, new C9885r0());
    }

    private C9891t0(C12867g c12867g, FirebaseAuth firebaseAuth, InterfaceC9888s0 interfaceC9888s0) {
        this.f24386a = new HashMap();
        this.f24388c = c12867g;
        this.f24389d = firebaseAuth;
        this.f24390e = interfaceC9888s0;
    }

    /* renamed from: e */
    private final Task<RecaptchaTasksClient> m29594e(String str) {
        return this.f24386a.get(str);
    }

    /* renamed from: f */
    private static String m29595f(String str) {
        return zzag.zzc(str) ? "*" : str;
    }

    /* renamed from: a */
    public final Task<RecaptchaTasksClient> m29596a(String str, Boolean bool) {
        Task<RecaptchaTasksClient> m29594e;
        String m29595f = m29595f(str);
        return (bool.booleanValue() || (m29594e = m29594e(m29595f)) == null) ? this.f24389d.m16381U("RECAPTCHA_ENTERPRISE").continueWithTask(new C9900w0(this, m29595f)) : m29594e;
    }

    /* renamed from: b */
    public final Task<String> m29597b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String m29595f = m29595f(str);
        Task<RecaptchaTasksClient> m29594e = m29594e(m29595f);
        if (bool.booleanValue() || m29594e == null) {
            m29594e = m29596a(m29595f, bool);
        }
        return m29594e.continueWithTask(new C9897v0(this, recaptchaAction));
    }

    /* renamed from: d */
    public final boolean m29598d(String str) {
        zzafk zzafkVar = this.f24387b;
        return zzafkVar != null && zzafkVar.zzb(str);
    }
}
