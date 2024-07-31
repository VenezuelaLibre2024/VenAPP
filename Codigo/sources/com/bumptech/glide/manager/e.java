package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.c;

/* loaded from: classes.dex */
final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7480a;

    /* renamed from: b, reason: collision with root package name */
    final c.a f7481b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, c.a aVar) {
        this.f7480a = context.getApplicationContext();
        this.f7481b = aVar;
    }

    private void c() {
        t.a(this.f7480a).d(this.f7481b);
    }

    private void d() {
        t.a(this.f7480a).e(this.f7481b);
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
        c();
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
        d();
    }
}
