package xd;

import android.app.Application;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final de.i f31211a;

    /* renamed from: b, reason: collision with root package name */
    private final ud.l f31212b;

    /* renamed from: c, reason: collision with root package name */
    private final Application f31213c;

    public q(de.i iVar, ud.l lVar, Application application) {
        this.f31211a = iVar;
        this.f31212b = lVar;
        this.f31213c = application;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ud.l a() {
        return this.f31212b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public de.i b() {
        return this.f31211a;
    }

    public LayoutInflater c() {
        return (LayoutInflater) this.f31213c.getSystemService("layout_inflater");
    }
}
