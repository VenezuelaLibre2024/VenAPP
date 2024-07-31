package zd;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    private q3 f32678a;

    /* renamed from: b */
    private AtomicBoolean f32679b;

    public n(zb.g gVar, q3 q3Var, nd.d dVar) {
        this.f32678a = q3Var;
        this.f32679b = new AtomicBoolean(gVar.x());
        dVar.b(zb.b.class, new nd.b() { // from class: zd.m
            public /* synthetic */ m() {
            }

            @Override // nd.b
            public final void a(nd.a aVar) {
                n.this.e(aVar);
            }
        });
    }

    private boolean c() {
        return this.f32678a.e("firebase_inapp_messaging_auto_data_collection_enabled");
    }

    private boolean d() {
        return this.f32678a.f("auto_init");
    }

    public /* synthetic */ void e(nd.a aVar) {
        this.f32679b.set(((zb.b) aVar.a()).f32512a);
    }

    public boolean b() {
        return d() ? this.f32678a.d("auto_init", true) : c() ? this.f32678a.c("firebase_inapp_messaging_auto_data_collection_enabled", true) : this.f32679b.get();
    }

    public void f(Boolean bool) {
        if (bool == null) {
            this.f32678a.a("auto_init");
        } else {
            this.f32678a.g("auto_init", Boolean.TRUE.equals(bool));
        }
    }
}
