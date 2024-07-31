package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c0;
import com.google.android.play.integrity.internal.j0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.d f10942a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f10943b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10944c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f10945d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ax(Context context, c0 c0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f10945d = taskCompletionSource;
        this.f10944c = context.getPackageName();
        this.f10943b = c0Var;
        com.google.android.play.integrity.internal.d dVar = new com.google.android.play.integrity.internal.d(context, c0Var, "ExpressIntegrityService", ay.f10946a, new j0() { // from class: com.google.android.play.core.integrity.ap
            @Override // com.google.android.play.integrity.internal.j0
            public final Object a(IBinder iBinder) {
                return com.google.android.play.integrity.internal.t.f2(iBinder);
            }
        }, null);
        this.f10942a = dVar;
        dVar.c().post(new aq(this, taskCompletionSource, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Bundle a(ax axVar, String str, long j10, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f10944c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.p.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.p.a(arrayList)));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Bundle b(ax axVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f10944c);
        bundle.putLong("cloud.prj", j10);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.p.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.p.a(arrayList)));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean g(ax axVar) {
        return axVar.f10945d.getTask().isSuccessful() && !((Boolean) axVar.f10945d.getTask().getResult()).booleanValue();
    }

    public final Task c(String str, long j10, long j11) {
        this.f10943b.c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f10942a.t(new as(this, taskCompletionSource, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(long j10) {
        this.f10943b.c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f10942a.t(new ar(this, taskCompletionSource, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
