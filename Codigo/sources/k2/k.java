package k2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.j;
import r1.d0;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final r1.u f20197a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.i<i> f20198b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f20199c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f20200d;

    /* loaded from: classes.dex */
    class a extends r1.i<i> {
        a(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // r1.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(v1.m mVar, i iVar) {
            String str = iVar.f20194a;
            if (str == null) {
                mVar.g1(1);
            } else {
                mVar.x0(1, str);
            }
            mVar.M0(2, iVar.a());
            mVar.M0(3, iVar.f20196c);
        }
    }

    /* loaded from: classes.dex */
    class b extends d0 {
        b(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* loaded from: classes.dex */
    class c extends d0 {
        c(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(r1.u uVar) {
        this.f20197a = uVar;
        this.f20198b = new a(uVar);
        this.f20199c = new b(uVar);
        this.f20200d = new c(uVar);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    @Override // k2.j
    public void a(m mVar) {
        j.a.b(this, mVar);
    }

    @Override // k2.j
    public i b(String str, int i10) {
        r1.x e10 = r1.x.e("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        e10.M0(2, i10);
        this.f20197a.d();
        i iVar = null;
        String string = null;
        Cursor b10 = t1.b.b(this.f20197a, e10, false, null);
        try {
            int e11 = t1.a.e(b10, "work_spec_id");
            int e12 = t1.a.e(b10, "generation");
            int e13 = t1.a.e(b10, "system_id");
            if (b10.moveToFirst()) {
                if (!b10.isNull(e11)) {
                    string = b10.getString(e11);
                }
                iVar = new i(string, b10.getInt(e12), b10.getInt(e13));
            }
            return iVar;
        } finally {
            b10.close();
            e10.i();
        }
    }

    @Override // k2.j
    public void c(i iVar) {
        this.f20197a.d();
        this.f20197a.e();
        try {
            this.f20198b.j(iVar);
            this.f20197a.B();
        } finally {
            this.f20197a.i();
        }
    }

    @Override // k2.j
    public List<String> d() {
        r1.x e10 = r1.x.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f20197a.d();
        Cursor b10 = t1.b.b(this.f20197a, e10, false, null);
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

    @Override // k2.j
    public i e(m mVar) {
        return j.a.a(this, mVar);
    }

    @Override // k2.j
    public void f(String str, int i10) {
        this.f20197a.d();
        v1.m b10 = this.f20199c.b();
        if (str == null) {
            b10.g1(1);
        } else {
            b10.x0(1, str);
        }
        b10.M0(2, i10);
        this.f20197a.e();
        try {
            b10.z();
            this.f20197a.B();
        } finally {
            this.f20197a.i();
            this.f20199c.h(b10);
        }
    }

    @Override // k2.j
    public void g(String str) {
        this.f20197a.d();
        v1.m b10 = this.f20200d.b();
        if (str == null) {
            b10.g1(1);
        } else {
            b10.x0(1, str);
        }
        this.f20197a.e();
        try {
            b10.z();
            this.f20197a.B();
        } finally {
            this.f20197a.i();
            this.f20200d.h(b10);
        }
    }
}
