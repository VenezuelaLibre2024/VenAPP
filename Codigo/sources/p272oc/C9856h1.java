package p272oc;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: oc.h1 */
/* loaded from: classes.dex */
final class C9856h1 implements OnSuccessListener<String> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f24327a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9856h1(C9843d0 c9843d0, TaskCompletionSource taskCompletionSource) {
        this.f24327a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(String str) {
        this.f24327a.setResult(new C9874n1().mo29551c(str).mo29549a());
    }
}
