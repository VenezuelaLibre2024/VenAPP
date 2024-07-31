package k2;

import java.util.Collections;
import java.util.List;
import r1.d0;

/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r1.u f20213a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.i<q> f20214b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f20215c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f20216d;

    /* loaded from: classes.dex */
    class a extends r1.i<q> {
        a(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // r1.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(v1.m mVar, q qVar) {
            if (qVar.b() == null) {
                mVar.g1(1);
            } else {
                mVar.x0(1, qVar.b());
            }
            byte[] o10 = androidx.work.b.o(qVar.a());
            if (o10 == null) {
                mVar.g1(2);
            } else {
                mVar.O0(2, o10);
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
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    class c extends d0 {
        c(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(r1.u uVar) {
        this.f20213a = uVar;
        this.f20214b = new a(uVar);
        this.f20215c = new b(uVar);
        this.f20216d = new c(uVar);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // k2.r
    public void a(String str) {
        this.f20213a.d();
        v1.m b10 = this.f20215c.b();
        if (str == null) {
            b10.g1(1);
        } else {
            b10.x0(1, str);
        }
        this.f20213a.e();
        try {
            b10.z();
            this.f20213a.B();
        } finally {
            this.f20213a.i();
            this.f20215c.h(b10);
        }
    }

    @Override // k2.r
    public void b() {
        this.f20213a.d();
        v1.m b10 = this.f20216d.b();
        this.f20213a.e();
        try {
            b10.z();
            this.f20213a.B();
        } finally {
            this.f20213a.i();
            this.f20216d.h(b10);
        }
    }

    @Override // k2.r
    public void c(q qVar) {
        this.f20213a.d();
        this.f20213a.e();
        try {
            this.f20214b.j(qVar);
            this.f20213a.B();
        } finally {
            this.f20213a.i();
        }
    }
}
