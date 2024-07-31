package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import f2.j;
import java.util.ArrayList;
import java.util.List;
import k2.u;
import k2.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f5749e = j.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f5750a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5751b;

    /* renamed from: c, reason: collision with root package name */
    private final g f5752c;

    /* renamed from: d, reason: collision with root package name */
    private final h2.e f5753d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i10, g gVar) {
        this.f5750a = context;
        this.f5751b = i10;
        this.f5752c = gVar;
        this.f5753d = new h2.e(gVar.g().q(), (h2.c) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<u> e10 = this.f5752c.g().r().J().e();
        ConstraintProxy.a(this.f5750a, e10);
        this.f5753d.a(e10);
        ArrayList<u> arrayList = new ArrayList(e10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (u uVar : e10) {
            String str = uVar.f20223a;
            if (currentTimeMillis >= uVar.c() && (!uVar.h() || this.f5753d.d(str))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str2 = uVar2.f20223a;
            Intent b10 = b.b(this.f5750a, x.a(uVar2));
            j.e().a(f5749e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f5752c.f().a().execute(new g.b(this.f5752c, b10, this.f5751b));
        }
        this.f5753d.reset();
    }
}
