package k2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private final r1.u f20208a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.i<n> f20209b;

    /* loaded from: classes.dex */
    class a extends r1.i<n> {
        a(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // r1.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(v1.m mVar, n nVar) {
            if (nVar.a() == null) {
                mVar.g1(1);
            } else {
                mVar.x0(1, nVar.a());
            }
            if (nVar.b() == null) {
                mVar.g1(2);
            } else {
                mVar.x0(2, nVar.b());
            }
        }
    }

    public p(r1.u uVar) {
        this.f20208a = uVar;
        this.f20209b = new a(uVar);
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    @Override // k2.o
    public void a(n nVar) {
        this.f20208a.d();
        this.f20208a.e();
        try {
            this.f20209b.j(nVar);
            this.f20208a.B();
        } finally {
            this.f20208a.i();
        }
    }

    @Override // k2.o
    public List<String> b(String str) {
        r1.x e10 = r1.x.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20208a.d();
        Cursor b10 = t1.b.b(this.f20208a, e10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.isNull(0) ? null : b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            e10.i();
        }
    }
}
