package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C1537g;
import java.util.ArrayList;
import java.util.List;
import p094f2.AbstractC7277j;
import p128h2.C7615e;
import p128h2.InterfaceC7613c;
import p192k2.C9132u;
import p192k2.C9135x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes.dex */
public class C1533c {

    /* renamed from: e */
    private static final String f6600e = AbstractC7277j.m21769i("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f6601a;

    /* renamed from: b */
    private final int f6602b;

    /* renamed from: c */
    private final C1537g f6603c;

    /* renamed from: d */
    private final C7615e f6604d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1533c(Context context, int i10, C1537g c1537g) {
        this.f6601a = context;
        this.f6602b = i10;
        this.f6603c = c1537g;
        this.f6604d = new C7615e(c1537g.m8641g().m8691q(), (InterfaceC7613c) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8623a() {
        List<C9132u> mo26906e = this.f6603c.m8641g().m8692r().mo8560J().mo26906e();
        ConstraintProxy.m8597a(this.f6601a, mo26906e);
        this.f6604d.mo23132a(mo26906e);
        ArrayList<C9132u> arrayList = new ArrayList(mo26906e.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C9132u c9132u : mo26906e) {
            String str = c9132u.f22005a;
            if (currentTimeMillis >= c9132u.m26893c() && (!c9132u.m26897h() || this.f6604d.m23135d(str))) {
                arrayList.add(c9132u);
            }
        }
        for (C9132u c9132u2 : arrayList) {
            String str2 = c9132u2.f22005a;
            Intent m8607b = C1532b.m8607b(this.f6601a, C9135x.m26934a(c9132u2));
            AbstractC7277j.m21767e().mo21770a(f6600e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f6603c.m8640f().mo28363a().execute(new C1537g.b(this.f6603c, m8607b, this.f6602b));
        }
        this.f6604d.reset();
    }
}
