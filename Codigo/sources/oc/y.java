package oc;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f22481a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f22482b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f22481a = taskCompletionSource;
        this.f22482b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f22481a.setException(exc);
        v.d(this.f22482b);
    }
}
