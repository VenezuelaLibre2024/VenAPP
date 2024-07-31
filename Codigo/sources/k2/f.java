package k2;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final r1.u f20191a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.i<d> f20192b;

    /* loaded from: classes.dex */
    class a extends r1.i<d> {
        a(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // r1.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(v1.m mVar, d dVar) {
            if (dVar.a() == null) {
                mVar.g1(1);
            } else {
                mVar.x0(1, dVar.a());
            }
            if (dVar.b() == null) {
                mVar.g1(2);
            } else {
                mVar.M0(2, dVar.b().longValue());
            }
        }
    }

    public f(r1.u uVar) {
        this.f20191a = uVar;
        this.f20192b = new a(uVar);
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    @Override // k2.e
    public void a(d dVar) {
        this.f20191a.d();
        this.f20191a.e();
        try {
            this.f20192b.j(dVar);
            this.f20191a.B();
        } finally {
            this.f20191a.i();
        }
    }

    @Override // k2.e
    public Long b(String str) {
        r1.x e10 = r1.x.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20191a.d();
        Long l10 = null;
        Cursor b10 = t1.b.b(this.f20191a, e10, false, null);
        try {
            if (b10.moveToFirst() && !b10.isNull(0)) {
                l10 = Long.valueOf(b10.getLong(0));
            }
            return l10;
        } finally {
            b10.close();
            e10.i();
        }
    }
}
