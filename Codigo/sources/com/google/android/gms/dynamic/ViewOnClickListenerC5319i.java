package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: com.google.android.gms.dynamic.i */
/* loaded from: classes.dex */
final class ViewOnClickListenerC5319i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f10829a;

    /* renamed from: b */
    final /* synthetic */ Intent f10830b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC5319i(Context context, Intent intent) {
        this.f10829a = context;
        this.f10830b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f10829a.startActivity(this.f10830b);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
