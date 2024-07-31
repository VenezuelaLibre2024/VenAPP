package p272oc;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.a0 */
/* loaded from: classes.dex */
public final class C9832a0 implements OnFailureListener {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f24273a;

    /* renamed from: b */
    private final /* synthetic */ Context f24274b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9832a0(C9896v c9896v, TaskCompletionSource taskCompletionSource, Context context) {
        this.f24273a = taskCompletionSource;
        this.f24274b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f24273a.setException(exc);
        C9896v.m29602d(this.f24274b);
    }
}
