package k2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k2.z;
import r1.d0;

/* loaded from: classes.dex */
public final class a0 implements z {

    /* renamed from: a, reason: collision with root package name */
    private final r1.u f20176a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.i<y> f20177b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f20178c;

    /* loaded from: classes.dex */
    class a extends r1.i<y> {
        a(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // r1.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(v1.m mVar, y yVar) {
            if (yVar.a() == null) {
                mVar.g1(1);
            } else {
                mVar.x0(1, yVar.a());
            }
            if (yVar.b() == null) {
                mVar.g1(2);
            } else {
                mVar.x0(2, yVar.b());
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends d0 {
        b(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public a0(r1.u uVar) {
        this.f20176a = uVar;
        this.f20177b = new a(uVar);
        this.f20178c = new b(uVar);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // k2.z
    public List<String> a(String str) {
        r1.x e10 = r1.x.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20176a.d();
        Cursor b10 = t1.b.b(this.f20176a, e10, false, null);
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

    @Override // k2.z
    public void b(y yVar) {
        this.f20176a.d();
        this.f20176a.e();
        try {
            this.f20177b.j(yVar);
            this.f20176a.B();
        } finally {
            this.f20176a.i();
        }
    }

    @Override // k2.z
    public void c(String str, Set<String> set) {
        z.a.a(this, str, set);
    }
}
