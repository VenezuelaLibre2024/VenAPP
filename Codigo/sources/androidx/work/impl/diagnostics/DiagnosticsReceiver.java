package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import f2.j;
import f2.l;
import f2.t;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5800a = j.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.e().a(f5800a, "Requesting diagnostics");
        try {
            t.e(context).c(l.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            j.e().d(f5800a, "WorkManager is not initialized", e10);
        }
    }
}
