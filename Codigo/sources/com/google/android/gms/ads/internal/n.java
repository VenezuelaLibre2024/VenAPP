package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f8878a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(s sVar) {
        this.f8878a = sVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzavi zzaviVar;
        zzavi zzaviVar2;
        s sVar = this.f8878a;
        zzaviVar = sVar.f8911s;
        if (zzaviVar == null) {
            return false;
        }
        zzaviVar2 = sVar.f8911s;
        zzaviVar2.zzd(motionEvent);
        return false;
    }
}
