package oc;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class a0 implements OnFailureListener {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f22340a;

    /* renamed from: b */
    private final /* synthetic */ Context f22341b;

    public a0(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f22340a = taskCompletionSource;
        this.f22341b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f22340a.setException(exc);
        v.d(this.f22341b);
    }
}
