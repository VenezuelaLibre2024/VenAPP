package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f9714a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f9715b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, Intent intent) {
        this.f9714a = context;
        this.f9715b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f9714a.startActivity(this.f9715b);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
