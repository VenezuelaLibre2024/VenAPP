package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavi;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.n */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC4958n implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ BinderC4964s f9965a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC4958n(BinderC4964s binderC4964s) {
        this.f9965a = binderC4964s;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzavi zzaviVar;
        zzavi zzaviVar2;
        BinderC4964s binderC4964s = this.f9965a;
        zzaviVar = binderC4964s.f10006s;
        if (zzaviVar == null) {
            return false;
        }
        zzaviVar2 = binderC4964s.f10006s;
        zzaviVar2.zzd(motionEvent);
        return false;
    }
}
