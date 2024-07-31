package p272oc;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.y */
/* loaded from: classes.dex */
public final class C9905y implements OnFailureListener {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f24414a;

    /* renamed from: b */
    private final /* synthetic */ Context f24415b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9905y(C9896v c9896v, TaskCompletionSource taskCompletionSource, Context context) {
        this.f24414a = taskCompletionSource;
        this.f24415b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f24414a.setException(exc);
        C9896v.m29602d(this.f24415b);
    }
}
