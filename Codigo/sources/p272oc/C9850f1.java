package p272oc;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p498firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.security.MessageDigest;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.f1 */
/* loaded from: classes.dex */
public final class C9850f1 implements Continuation<zzafj, Task<IntegrityTokenResponse>> {

    /* renamed from: a */
    private final /* synthetic */ String f24320a;

    /* renamed from: b */
    private final /* synthetic */ IntegrityManager f24321b;

    /* renamed from: c */
    private final /* synthetic */ C9843d0 f24322c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9850f1(C9843d0 c9843d0, String str, IntegrityManager integrityManager) {
        this.f24322c = c9843d0;
        this.f24320a = str;
        this.f24321b = integrityManager;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<IntegrityTokenResponse> then(Task<zzafj> task) {
        String str;
        if (task.isSuccessful()) {
            this.f24322c.f24302a = task.getResult().zza();
            return this.f24321b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(task.getResult().zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f24320a.getBytes("UTF-8")), 11))).build());
        }
        str = C9843d0.f24300b;
        Log.e(str, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
