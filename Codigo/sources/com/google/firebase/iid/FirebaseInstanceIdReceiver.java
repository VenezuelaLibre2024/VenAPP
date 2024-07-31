package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.i0;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends ba.b {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // ba.b
    protected int b(Context context, ba.a aVar) {
        try {
            return ((Integer) Tasks.await(new com.google.firebase.messaging.m(context).k(aVar.u1()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // ba.b
    protected void c(Context context, Bundle bundle) {
        Intent g10 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (i0.B(g10)) {
            i0.s(g10);
        }
    }
}
