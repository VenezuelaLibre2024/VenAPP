package p272oc;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzab;
import com.google.android.gms.internal.p498firebaseauthapi.zzafk;
import com.google.android.gms.internal.p498firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.w0 */
/* loaded from: classes.dex */
public final class C9900w0 implements Continuation<zzafk, Task<RecaptchaTasksClient>> {

    /* renamed from: a */
    private final /* synthetic */ String f24404a;

    /* renamed from: b */
    private final /* synthetic */ C9891t0 f24405b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9900w0(C9891t0 c9891t0, String str) {
        this.f24405b = c9891t0;
        this.f24404a = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzafk> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new C9894u0((String) C5276s.m13324j(((Exception) C5276s.m13324j(task.getException())).getMessage())));
        }
        zzafk result = task.getResult();
        String zza = result.zza();
        if (zzag.zzc(zza)) {
            return Tasks.forException(new C9894u0("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f24404a));
        }
        List<String> zza2 = zzab.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f24404a);
        }
        this.f24405b.f24387b = result;
        C9891t0 c9891t0 = this.f24405b;
        Task<RecaptchaTasksClient> mo29585a = c9891t0.f24390e.mo29585a((Application) c9891t0.f24388c.m42630m(), str);
        this.f24405b.f24386a.put(this.f24404a, mo29585a);
        return mo29585a;
    }
}
