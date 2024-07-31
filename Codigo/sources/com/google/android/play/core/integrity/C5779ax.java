package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC5846t;
import com.google.android.play.integrity.internal.C5820c0;
import com.google.android.play.integrity.internal.C5821d;
import com.google.android.play.integrity.internal.C5842p;
import com.google.android.play.integrity.internal.InterfaceC5834j0;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.integrity.ax */
/* loaded from: classes2.dex */
final class C5779ax {

    /* renamed from: a */
    final C5821d f12157a;

    /* renamed from: b */
    private final C5820c0 f12158b;

    /* renamed from: c */
    private final String f12159c;

    /* renamed from: d */
    private final TaskCompletionSource f12160d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5779ax(Context context, C5820c0 c5820c0) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12160d = taskCompletionSource;
        this.f12159c = context.getPackageName();
        this.f12158b = c5820c0;
        C5821d c5821d = new C5821d(context, c5820c0, "ExpressIntegrityService", C5780ay.f12161a, new InterfaceC5834j0() { // from class: com.google.android.play.core.integrity.ap
            @Override // com.google.android.play.integrity.internal.InterfaceC5834j0
            /* renamed from: a */
            public final Object mo14615a(IBinder iBinder) {
                return AbstractBinderC5846t.m14702f2(iBinder);
            }
        }, null);
        this.f12157a = c5821d;
        c5821d.m14679c().post(new C5772aq(this, taskCompletionSource, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m14631a(C5779ax c5779ax, String str, long j10, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c5779ax.f12159c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        ArrayList arrayList = new ArrayList();
        C5842p.m14696b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5842p.m14695a(arrayList)));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m14632b(C5779ax c5779ax, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c5779ax.f12159c);
        bundle.putLong("cloud.prj", j10);
        ArrayList arrayList = new ArrayList();
        C5842p.m14696b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5842p.m14695a(arrayList)));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m14635g(C5779ax c5779ax) {
        return c5779ax.f12160d.getTask().isSuccessful() && !((Boolean) c5779ax.f12160d.getTask().getResult()).booleanValue();
    }

    /* renamed from: c */
    public final Task m14636c(String str, long j10, long j11) {
        this.f12158b.m14658c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12157a.m14681t(new C5774as(this, taskCompletionSource, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    public final Task m14637d(long j10) {
        this.f12158b.m14658c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12157a.m14681t(new C5773ar(this, taskCompletionSource, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
