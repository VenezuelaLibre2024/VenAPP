package k2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final r1.u f20186a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.i<k2.a> f20187b;

    /* loaded from: classes.dex */
    class a extends r1.i<k2.a> {
        a(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // r1.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(v1.m mVar, k2.a aVar) {
            if (aVar.b() == null) {
                mVar.g1(1);
            } else {
                mVar.x0(1, aVar.b());
            }
            if (aVar.a() == null) {
                mVar.g1(2);
            } else {
                mVar.x0(2, aVar.a());
            }
        }
    }

    public c(r1.u uVar) {
        this.f20186a = uVar;
        this.f20187b = new a(uVar);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // k2.b
    public List<String> a(String str) {
        r1.x e10 = r1.x.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20186a.d();
        Cursor b10 = t1.b.b(this.f20186a, e10, false, null);
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

    @Override // k2.b
    public boolean b(String str) {
        r1.x e10 = r1.x.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20186a.d();
        boolean z10 = false;
        Cursor b10 = t1.b.b(this.f20186a, e10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            e10.i();
        }
    }

    @Override // k2.b
    public void c(k2.a aVar) {
        this.f20186a.d();
        this.f20186a.e();
        try {
            this.f20187b.j(aVar);
            this.f20186a.B();
        } finally {
            this.f20186a.i();
        }
    }

    @Override // k2.b
    public boolean d(String str) {
        r1.x e10 = r1.x.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20186a.d();
        boolean z10 = false;
        Cursor b10 = t1.b.b(this.f20186a, e10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            e10.i();
        }
    }
}
