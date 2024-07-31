package p272oc;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C6111q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.b1 */
/* loaded from: classes.dex */
public final class C9837b1 implements OnFailureListener {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f24278a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9837b1(C9843d0 c9843d0, TaskCompletionSource taskCompletionSource) {
        this.f24278a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = C9843d0.f24300b;
        Log.e(str, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof C6111q) && ((C6111q) exc).m16603a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f24278a.setException(exc);
        } else {
            this.f24278a.setResult(new C9874n1().mo29549a());
        }
    }
}
