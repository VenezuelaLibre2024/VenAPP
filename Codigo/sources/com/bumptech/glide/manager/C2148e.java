package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.InterfaceC2146c;

/* renamed from: com.bumptech.glide.manager.e */
/* loaded from: classes.dex */
final class C2148e implements InterfaceC2146c {

    /* renamed from: a */
    private final Context f8447a;

    /* renamed from: b */
    final InterfaceC2146c.a f8448b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2148e(Context context, InterfaceC2146c.a aVar) {
        this.f8447a = context.getApplicationContext();
        this.f8448b = aVar;
    }

    /* renamed from: c */
    private void m10803c() {
        C2163t.m10845a(this.f8447a).m10848d(this.f8448b);
    }

    /* renamed from: d */
    private void m10804d() {
        C2163t.m10845a(this.f8447a).m10849e(this.f8448b);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStart() {
        m10803c();
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStop() {
        m10804d();
    }
}
