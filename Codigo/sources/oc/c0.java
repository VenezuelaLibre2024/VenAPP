package oc;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class c0 implements OnFailureListener {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f22351a;

    /* renamed from: b */
    private final /* synthetic */ Context f22352b;

    public c0(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f22351a = taskCompletionSource;
        this.f22352b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f22351a.setException(exc);
        v.d(this.f22352b);
    }
}
