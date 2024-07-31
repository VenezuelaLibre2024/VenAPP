package k2;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import f2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import k2.u;
import r1.d0;

/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    private final r1.u f20252a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.i<u> f20253b;

    /* renamed from: c, reason: collision with root package name */
    private final r1.h<u> f20254c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f20255d;

    /* renamed from: e, reason: collision with root package name */
    private final d0 f20256e;

    /* renamed from: f, reason: collision with root package name */
    private final d0 f20257f;

    /* renamed from: g, reason: collision with root package name */
    private final d0 f20258g;

    /* renamed from: h, reason: collision with root package name */
    private final d0 f20259h;

    /* renamed from: i, reason: collision with root package name */
    private final d0 f20260i;

    /* renamed from: j, reason: collision with root package name */
    private final d0 f20261j;

    /* renamed from: k, reason: collision with root package name */
    private final d0 f20262k;

    /* renamed from: l, reason: collision with root package name */
    private final d0 f20263l;

    /* renamed from: m, reason: collision with root package name */
    private final d0 f20264m;

    /* renamed from: n, reason: collision with root package name */
    private final d0 f20265n;

    /* loaded from: classes.dex */
    class a extends d0 {
        a(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class b extends d0 {
        b(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    class c extends d0 {
        c(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* loaded from: classes.dex */
    class d extends d0 {
        d(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class e implements Callable<List<u.c>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r1.x f20270a;

        e(r1.x xVar) {
            this.f20270a = xVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<u.c> call() {
            w.this.f20252a.e();
            try {
                Cursor b10 = t1.b.b(w.this.f20252a, this.f20270a, true, null);
                try {
                    androidx.collection.a aVar = new androidx.collection.a();
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    while (b10.moveToNext()) {
                        String string = b10.getString(0);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                        String string2 = b10.getString(0);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                    b10.moveToPosition(-1);
                    w.this.z(aVar);
                    w.this.y(aVar2);
                    ArrayList arrayList = new ArrayList(b10.getCount());
                    while (b10.moveToNext()) {
                        String string3 = b10.isNull(0) ? null : b10.getString(0);
                        s.a f10 = b0.f(b10.getInt(1));
                        androidx.work.b g10 = androidx.work.b.g(b10.isNull(2) ? null : b10.getBlob(2));
                        int i10 = b10.getInt(3);
                        int i11 = b10.getInt(4);
                        ArrayList arrayList2 = (ArrayList) aVar.get(b10.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) aVar2.get(b10.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new u.c(string3, f10, g10, i10, i11, arrayList3, arrayList4));
                    }
                    w.this.f20252a.B();
                    return arrayList;
                } finally {
                    b10.close();
                }
            } finally {
                w.this.f20252a.i();
            }
        }

        protected void finalize() {
            this.f20270a.i();
        }
    }

    /* loaded from: classes.dex */
    class f extends r1.i<u> {
        f(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // r1.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(v1.m mVar, u uVar) {
            String str = uVar.f20223a;
            if (str == null) {
                mVar.g1(1);
            } else {
                mVar.x0(1, str);
            }
            b0 b0Var = b0.f20181a;
            mVar.M0(2, b0.j(uVar.f20224b));
            String str2 = uVar.f20225c;
            if (str2 == null) {
                mVar.g1(3);
            } else {
                mVar.x0(3, str2);
            }
            String str3 = uVar.f20226d;
            if (str3 == null) {
                mVar.g1(4);
            } else {
                mVar.x0(4, str3);
            }
            byte[] o10 = androidx.work.b.o(uVar.f20227e);
            if (o10 == null) {
                mVar.g1(5);
            } else {
                mVar.O0(5, o10);
            }
            byte[] o11 = androidx.work.b.o(uVar.f20228f);
            if (o11 == null) {
                mVar.g1(6);
            } else {
                mVar.O0(6, o11);
            }
            mVar.M0(7, uVar.f20229g);
            mVar.M0(8, uVar.f20230h);
            mVar.M0(9, uVar.f20231i);
            mVar.M0(10, uVar.f20233k);
            mVar.M0(11, b0.a(uVar.f20234l));
            mVar.M0(12, uVar.f20235m);
            mVar.M0(13, uVar.f20236n);
            mVar.M0(14, uVar.f20237o);
            mVar.M0(15, uVar.f20238p);
            mVar.M0(16, uVar.f20239q ? 1L : 0L);
            mVar.M0(17, b0.h(uVar.f20240r));
            mVar.M0(18, uVar.g());
            mVar.M0(19, uVar.f());
            f2.b bVar = uVar.f20232j;
            if (bVar != null) {
                mVar.M0(20, b0.g(bVar.d()));
                mVar.M0(21, bVar.g() ? 1L : 0L);
                mVar.M0(22, bVar.h() ? 1L : 0L);
                mVar.M0(23, bVar.f() ? 1L : 0L);
                mVar.M0(24, bVar.i() ? 1L : 0L);
                mVar.M0(25, bVar.b());
                mVar.M0(26, bVar.a());
                byte[] i10 = b0.i(bVar.c());
                if (i10 != null) {
                    mVar.O0(27, i10);
                    return;
                }
            } else {
                mVar.g1(20);
                mVar.g1(21);
                mVar.g1(22);
                mVar.g1(23);
                mVar.g1(24);
                mVar.g1(25);
                mVar.g1(26);
            }
            mVar.g1(27);
        }
    }

    /* loaded from: classes.dex */
    class g extends r1.h<u> {
        g(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    /* loaded from: classes.dex */
    class h extends d0 {
        h(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class i extends d0 {
        i(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class j extends d0 {
        j(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class k extends d0 {
        k(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class l extends d0 {
        l(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class m extends d0 {
        m(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class n extends d0 {
        n(r1.u uVar) {
            super(uVar);
        }

        @Override // r1.d0
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public w(r1.u uVar) {
        this.f20252a = uVar;
        this.f20253b = new f(uVar);
        this.f20254c = new g(uVar);
        this.f20255d = new h(uVar);
        this.f20256e = new i(uVar);
        this.f20257f = new j(uVar);
        this.f20258g = new k(uVar);
        this.f20259h = new l(uVar);
        this.f20260i = new m(uVar);
        this.f20261j = new n(uVar);
        this.f20262k = new a(uVar);
        this.f20263l = new b(uVar);
        this.f20264m = new c(uVar);
        this.f20265n = new d(uVar);
    }

    public static List<Class<?>> D() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(androidx.collection.a<String, ArrayList<androidx.work.b>> aVar) {
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.b>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.j(i10), aVar.n(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    y(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                y(aVar2);
                return;
            }
            return;
        }
        StringBuilder b10 = t1.d.b();
        b10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        t1.d.a(b10, size2);
        b10.append(")");
        r1.x e10 = r1.x.e(b10.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                e10.g1(i12);
            } else {
                e10.x0(i12, str);
            }
            i12++;
        }
        Cursor b11 = t1.b.b(this.f20252a, e10, false, null);
        try {
            int d10 = t1.a.d(b11, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<androidx.work.b> arrayList = aVar.get(b11.getString(d10));
                if (arrayList != null) {
                    arrayList.add(androidx.work.b.g(b11.isNull(0) ? null : b11.getBlob(0)));
                }
            }
        } finally {
            b11.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(androidx.collection.a<String, ArrayList<String>> aVar) {
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.j(i10), aVar.n(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    z(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                z(aVar2);
                return;
            }
            return;
        }
        StringBuilder b10 = t1.d.b();
        b10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        t1.d.a(b10, size2);
        b10.append(")");
        r1.x e10 = r1.x.e(b10.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                e10.g1(i12);
            } else {
                e10.x0(i12, str);
            }
            i12++;
        }
        Cursor b11 = t1.b.b(this.f20252a, e10, false, null);
        try {
            int d10 = t1.a.d(b11, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<String> arrayList = aVar.get(b11.getString(d10));
                if (arrayList != null) {
                    arrayList.add(b11.isNull(0) ? null : b11.getString(0));
                }
            }
        } finally {
            b11.close();
        }
    }

    @Override // k2.v
    public void a(String str) {
        this.f20252a.d();
        v1.m b10 = this.f20255d.b();
        if (str == null) {
            b10.g1(1);
        } else {
            b10.x0(1, str);
        }
        this.f20252a.e();
        try {
            b10.z();
            this.f20252a.B();
        } finally {
            this.f20252a.i();
            this.f20255d.h(b10);
        }
    }

    @Override // k2.v
    public void b() {
        this.f20252a.d();
        v1.m b10 = this.f20264m.b();
        this.f20252a.e();
        try {
            b10.z();
            this.f20252a.B();
        } finally {
            this.f20252a.i();
            this.f20264m.h(b10);
        }
    }

    @Override // k2.v
    public void c(String str) {
        this.f20252a.d();
        v1.m b10 = this.f20257f.b();
        if (str == null) {
            b10.g1(1);
        } else {
            b10.x0(1, str);
        }
        this.f20252a.e();
        try {
            b10.z();
            this.f20252a.B();
        } finally {
            this.f20252a.i();
            this.f20257f.h(b10);
        }
    }

    @Override // k2.v
    public List<u> d(long j10) {
        r1.x xVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        r1.x e24 = r1.x.e("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        e24.M0(1, j10);
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e24, false, null);
        try {
            e10 = t1.a.e(b10, FacebookMediationAdapter.KEY_ID);
            e11 = t1.a.e(b10, "state");
            e12 = t1.a.e(b10, "worker_class_name");
            e13 = t1.a.e(b10, "input_merger_class_name");
            e14 = t1.a.e(b10, "input");
            e15 = t1.a.e(b10, "output");
            e16 = t1.a.e(b10, "initial_delay");
            e17 = t1.a.e(b10, "interval_duration");
            e18 = t1.a.e(b10, "flex_duration");
            e19 = t1.a.e(b10, "run_attempt_count");
            e20 = t1.a.e(b10, "backoff_policy");
            e21 = t1.a.e(b10, "backoff_delay_duration");
            e22 = t1.a.e(b10, "last_enqueue_time");
            e23 = t1.a.e(b10, "minimum_retention_duration");
            xVar = e24;
        } catch (Throwable th2) {
            th = th2;
            xVar = e24;
        }
        try {
            int e25 = t1.a.e(b10, "schedule_requested_at");
            int e26 = t1.a.e(b10, "run_in_foreground");
            int e27 = t1.a.e(b10, "out_of_quota_policy");
            int e28 = t1.a.e(b10, "period_count");
            int e29 = t1.a.e(b10, "generation");
            int e30 = t1.a.e(b10, "required_network_type");
            int e31 = t1.a.e(b10, "requires_charging");
            int e32 = t1.a.e(b10, "requires_device_idle");
            int e33 = t1.a.e(b10, "requires_battery_not_low");
            int e34 = t1.a.e(b10, "requires_storage_not_low");
            int e35 = t1.a.e(b10, "trigger_content_update_delay");
            int e36 = t1.a.e(b10, "trigger_max_content_delay");
            int e37 = t1.a.e(b10, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                s.a f10 = b0.f(b10.getInt(e11));
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j11 = b10.getLong(e16);
                long j12 = b10.getLong(e17);
                long j13 = b10.getLong(e18);
                int i16 = b10.getInt(e19);
                f2.a c10 = b0.c(b10.getInt(e20));
                long j14 = b10.getLong(e21);
                long j15 = b10.getLong(e22);
                int i17 = i15;
                long j16 = b10.getLong(i17);
                int i18 = e10;
                int i19 = e25;
                long j17 = b10.getLong(i19);
                e25 = i19;
                int i20 = e26;
                if (b10.getInt(i20) != 0) {
                    e26 = i20;
                    i10 = e27;
                    z10 = true;
                } else {
                    e26 = i20;
                    i10 = e27;
                    z10 = false;
                }
                f2.n e38 = b0.e(b10.getInt(i10));
                e27 = i10;
                int i21 = e28;
                int i22 = b10.getInt(i21);
                e28 = i21;
                int i23 = e29;
                int i24 = b10.getInt(i23);
                e29 = i23;
                int i25 = e30;
                f2.k d10 = b0.d(b10.getInt(i25));
                e30 = i25;
                int i26 = e31;
                if (b10.getInt(i26) != 0) {
                    e31 = i26;
                    i11 = e32;
                    z11 = true;
                } else {
                    e31 = i26;
                    i11 = e32;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    e32 = i11;
                    i12 = e33;
                    z12 = true;
                } else {
                    e32 = i11;
                    i12 = e33;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e33 = i12;
                    i13 = e34;
                    z13 = true;
                } else {
                    e33 = i12;
                    i13 = e34;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e34 = i13;
                    i14 = e35;
                    z14 = true;
                } else {
                    e34 = i13;
                    i14 = e35;
                    z14 = false;
                }
                long j18 = b10.getLong(i14);
                e35 = i14;
                int i27 = e36;
                long j19 = b10.getLong(i27);
                e36 = i27;
                int i28 = e37;
                e37 = i28;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j11, j12, j13, new f2.b(d10, z11, z12, z13, z14, j18, j19, b0.b(b10.isNull(i28) ? null : b10.getBlob(i28))), i16, c10, j14, j15, j16, j17, z10, e38, i22, i24));
                e10 = i18;
                i15 = i17;
            }
            b10.close();
            xVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            xVar.i();
            throw th;
        }
    }

    @Override // k2.v
    public List<u> e() {
        r1.x xVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        r1.x e24 = r1.x.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e24, false, null);
        try {
            e10 = t1.a.e(b10, FacebookMediationAdapter.KEY_ID);
            e11 = t1.a.e(b10, "state");
            e12 = t1.a.e(b10, "worker_class_name");
            e13 = t1.a.e(b10, "input_merger_class_name");
            e14 = t1.a.e(b10, "input");
            e15 = t1.a.e(b10, "output");
            e16 = t1.a.e(b10, "initial_delay");
            e17 = t1.a.e(b10, "interval_duration");
            e18 = t1.a.e(b10, "flex_duration");
            e19 = t1.a.e(b10, "run_attempt_count");
            e20 = t1.a.e(b10, "backoff_policy");
            e21 = t1.a.e(b10, "backoff_delay_duration");
            e22 = t1.a.e(b10, "last_enqueue_time");
            e23 = t1.a.e(b10, "minimum_retention_duration");
            xVar = e24;
        } catch (Throwable th2) {
            th = th2;
            xVar = e24;
        }
        try {
            int e25 = t1.a.e(b10, "schedule_requested_at");
            int e26 = t1.a.e(b10, "run_in_foreground");
            int e27 = t1.a.e(b10, "out_of_quota_policy");
            int e28 = t1.a.e(b10, "period_count");
            int e29 = t1.a.e(b10, "generation");
            int e30 = t1.a.e(b10, "required_network_type");
            int e31 = t1.a.e(b10, "requires_charging");
            int e32 = t1.a.e(b10, "requires_device_idle");
            int e33 = t1.a.e(b10, "requires_battery_not_low");
            int e34 = t1.a.e(b10, "requires_storage_not_low");
            int e35 = t1.a.e(b10, "trigger_content_update_delay");
            int e36 = t1.a.e(b10, "trigger_max_content_delay");
            int e37 = t1.a.e(b10, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                s.a f10 = b0.f(b10.getInt(e11));
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i16 = b10.getInt(e19);
                f2.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i17 = i15;
                long j15 = b10.getLong(i17);
                int i18 = e10;
                int i19 = e25;
                long j16 = b10.getLong(i19);
                e25 = i19;
                int i20 = e26;
                if (b10.getInt(i20) != 0) {
                    e26 = i20;
                    i10 = e27;
                    z10 = true;
                } else {
                    e26 = i20;
                    i10 = e27;
                    z10 = false;
                }
                f2.n e38 = b0.e(b10.getInt(i10));
                e27 = i10;
                int i21 = e28;
                int i22 = b10.getInt(i21);
                e28 = i21;
                int i23 = e29;
                int i24 = b10.getInt(i23);
                e29 = i23;
                int i25 = e30;
                f2.k d10 = b0.d(b10.getInt(i25));
                e30 = i25;
                int i26 = e31;
                if (b10.getInt(i26) != 0) {
                    e31 = i26;
                    i11 = e32;
                    z11 = true;
                } else {
                    e31 = i26;
                    i11 = e32;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    e32 = i11;
                    i12 = e33;
                    z12 = true;
                } else {
                    e32 = i11;
                    i12 = e33;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e33 = i12;
                    i13 = e34;
                    z13 = true;
                } else {
                    e33 = i12;
                    i13 = e34;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e34 = i13;
                    i14 = e35;
                    z14 = true;
                } else {
                    e34 = i13;
                    i14 = e35;
                    z14 = false;
                }
                long j17 = b10.getLong(i14);
                e35 = i14;
                int i27 = e36;
                long j18 = b10.getLong(i27);
                e36 = i27;
                int i28 = e37;
                e37 = i28;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new f2.b(d10, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i28) ? null : b10.getBlob(i28))), i16, c10, j13, j14, j15, j16, z10, e38, i22, i24));
                e10 = i18;
                i15 = i17;
            }
            b10.close();
            xVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            xVar.i();
            throw th;
        }
    }

    @Override // k2.v
    public List<String> f(String str) {
        r1.x e10 = r1.x.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e10, false, null);
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

    @Override // k2.v
    public s.a g(String str) {
        r1.x e10 = r1.x.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20252a.d();
        s.a aVar = null;
        Cursor b10 = t1.b.b(this.f20252a, e10, false, null);
        try {
            if (b10.moveToFirst()) {
                Integer valueOf = b10.isNull(0) ? null : Integer.valueOf(b10.getInt(0));
                if (valueOf != null) {
                    b0 b0Var = b0.f20181a;
                    aVar = b0.f(valueOf.intValue());
                }
            }
            return aVar;
        } finally {
            b10.close();
            e10.i();
        }
    }

    @Override // k2.v
    public u h(String str) {
        r1.x xVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        u uVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        r1.x e24 = r1.x.e("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            e24.g1(1);
        } else {
            e24.x0(1, str);
        }
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e24, false, null);
        try {
            e10 = t1.a.e(b10, FacebookMediationAdapter.KEY_ID);
            e11 = t1.a.e(b10, "state");
            e12 = t1.a.e(b10, "worker_class_name");
            e13 = t1.a.e(b10, "input_merger_class_name");
            e14 = t1.a.e(b10, "input");
            e15 = t1.a.e(b10, "output");
            e16 = t1.a.e(b10, "initial_delay");
            e17 = t1.a.e(b10, "interval_duration");
            e18 = t1.a.e(b10, "flex_duration");
            e19 = t1.a.e(b10, "run_attempt_count");
            e20 = t1.a.e(b10, "backoff_policy");
            e21 = t1.a.e(b10, "backoff_delay_duration");
            e22 = t1.a.e(b10, "last_enqueue_time");
            e23 = t1.a.e(b10, "minimum_retention_duration");
            xVar = e24;
        } catch (Throwable th2) {
            th = th2;
            xVar = e24;
        }
        try {
            int e25 = t1.a.e(b10, "schedule_requested_at");
            int e26 = t1.a.e(b10, "run_in_foreground");
            int e27 = t1.a.e(b10, "out_of_quota_policy");
            int e28 = t1.a.e(b10, "period_count");
            int e29 = t1.a.e(b10, "generation");
            int e30 = t1.a.e(b10, "required_network_type");
            int e31 = t1.a.e(b10, "requires_charging");
            int e32 = t1.a.e(b10, "requires_device_idle");
            int e33 = t1.a.e(b10, "requires_battery_not_low");
            int e34 = t1.a.e(b10, "requires_storage_not_low");
            int e35 = t1.a.e(b10, "trigger_content_update_delay");
            int e36 = t1.a.e(b10, "trigger_max_content_delay");
            int e37 = t1.a.e(b10, "content_uri_triggers");
            if (b10.moveToFirst()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                s.a f10 = b0.f(b10.getInt(e11));
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i15 = b10.getInt(e19);
                f2.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                long j15 = b10.getLong(e23);
                long j16 = b10.getLong(e25);
                if (b10.getInt(e26) != 0) {
                    i10 = e27;
                    z10 = true;
                } else {
                    i10 = e27;
                    z10 = false;
                }
                f2.n e38 = b0.e(b10.getInt(i10));
                int i16 = b10.getInt(e28);
                int i17 = b10.getInt(e29);
                f2.k d10 = b0.d(b10.getInt(e30));
                if (b10.getInt(e31) != 0) {
                    i11 = e32;
                    z11 = true;
                } else {
                    i11 = e32;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    i12 = e33;
                    z12 = true;
                } else {
                    i12 = e33;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    i13 = e34;
                    z13 = true;
                } else {
                    i13 = e34;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    i14 = e35;
                    z14 = true;
                } else {
                    i14 = e35;
                    z14 = false;
                }
                uVar = new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new f2.b(d10, z11, z12, z13, z14, b10.getLong(i14), b10.getLong(e36), b0.b(b10.isNull(e37) ? null : b10.getBlob(e37))), i15, c10, j13, j14, j15, j16, z10, e38, i16, i17);
            } else {
                uVar = null;
            }
            b10.close();
            xVar.i();
            return uVar;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            xVar.i();
            throw th;
        }
    }

    @Override // k2.v
    public void i(String str, long j10) {
        this.f20252a.d();
        v1.m b10 = this.f20259h.b();
        b10.M0(1, j10);
        if (str == null) {
            b10.g1(2);
        } else {
            b10.x0(2, str);
        }
        this.f20252a.e();
        try {
            b10.z();
            this.f20252a.B();
        } finally {
            this.f20252a.i();
            this.f20259h.h(b10);
        }
    }

    @Override // k2.v
    public List<String> j(String str) {
        r1.x e10 = r1.x.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e10, false, null);
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

    @Override // k2.v
    public List<androidx.work.b> k(String str) {
        r1.x e10 = r1.x.e("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.b.g(b10.isNull(0) ? null : b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            e10.i();
        }
    }

    @Override // k2.v
    public List<u> l(int i10) {
        r1.x xVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        r1.x e24 = r1.x.e("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        e24.M0(1, i10);
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e24, false, null);
        try {
            e10 = t1.a.e(b10, FacebookMediationAdapter.KEY_ID);
            e11 = t1.a.e(b10, "state");
            e12 = t1.a.e(b10, "worker_class_name");
            e13 = t1.a.e(b10, "input_merger_class_name");
            e14 = t1.a.e(b10, "input");
            e15 = t1.a.e(b10, "output");
            e16 = t1.a.e(b10, "initial_delay");
            e17 = t1.a.e(b10, "interval_duration");
            e18 = t1.a.e(b10, "flex_duration");
            e19 = t1.a.e(b10, "run_attempt_count");
            e20 = t1.a.e(b10, "backoff_policy");
            e21 = t1.a.e(b10, "backoff_delay_duration");
            e22 = t1.a.e(b10, "last_enqueue_time");
            e23 = t1.a.e(b10, "minimum_retention_duration");
            xVar = e24;
        } catch (Throwable th2) {
            th = th2;
            xVar = e24;
        }
        try {
            int e25 = t1.a.e(b10, "schedule_requested_at");
            int e26 = t1.a.e(b10, "run_in_foreground");
            int e27 = t1.a.e(b10, "out_of_quota_policy");
            int e28 = t1.a.e(b10, "period_count");
            int e29 = t1.a.e(b10, "generation");
            int e30 = t1.a.e(b10, "required_network_type");
            int e31 = t1.a.e(b10, "requires_charging");
            int e32 = t1.a.e(b10, "requires_device_idle");
            int e33 = t1.a.e(b10, "requires_battery_not_low");
            int e34 = t1.a.e(b10, "requires_storage_not_low");
            int e35 = t1.a.e(b10, "trigger_content_update_delay");
            int e36 = t1.a.e(b10, "trigger_max_content_delay");
            int e37 = t1.a.e(b10, "content_uri_triggers");
            int i16 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                s.a f10 = b0.f(b10.getInt(e11));
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i17 = b10.getInt(e19);
                f2.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i18 = i16;
                long j15 = b10.getLong(i18);
                int i19 = e10;
                int i20 = e25;
                long j16 = b10.getLong(i20);
                e25 = i20;
                int i21 = e26;
                if (b10.getInt(i21) != 0) {
                    e26 = i21;
                    i11 = e27;
                    z10 = true;
                } else {
                    e26 = i21;
                    i11 = e27;
                    z10 = false;
                }
                f2.n e38 = b0.e(b10.getInt(i11));
                e27 = i11;
                int i22 = e28;
                int i23 = b10.getInt(i22);
                e28 = i22;
                int i24 = e29;
                int i25 = b10.getInt(i24);
                e29 = i24;
                int i26 = e30;
                f2.k d10 = b0.d(b10.getInt(i26));
                e30 = i26;
                int i27 = e31;
                if (b10.getInt(i27) != 0) {
                    e31 = i27;
                    i12 = e32;
                    z11 = true;
                } else {
                    e31 = i27;
                    i12 = e32;
                    z11 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e32 = i12;
                    i13 = e33;
                    z12 = true;
                } else {
                    e32 = i12;
                    i13 = e33;
                    z12 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e33 = i13;
                    i14 = e34;
                    z13 = true;
                } else {
                    e33 = i13;
                    i14 = e34;
                    z13 = false;
                }
                if (b10.getInt(i14) != 0) {
                    e34 = i14;
                    i15 = e35;
                    z14 = true;
                } else {
                    e34 = i14;
                    i15 = e35;
                    z14 = false;
                }
                long j17 = b10.getLong(i15);
                e35 = i15;
                int i28 = e36;
                long j18 = b10.getLong(i28);
                e36 = i28;
                int i29 = e37;
                e37 = i29;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new f2.b(d10, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i29) ? null : b10.getBlob(i29))), i17, c10, j13, j14, j15, j16, z10, e38, i23, i25));
                e10 = i19;
                i16 = i18;
            }
            b10.close();
            xVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            xVar.i();
            throw th;
        }
    }

    @Override // k2.v
    public int m() {
        this.f20252a.d();
        v1.m b10 = this.f20263l.b();
        this.f20252a.e();
        try {
            int z10 = b10.z();
            this.f20252a.B();
            return z10;
        } finally {
            this.f20252a.i();
            this.f20263l.h(b10);
        }
    }

    @Override // k2.v
    public int n(String str, long j10) {
        this.f20252a.d();
        v1.m b10 = this.f20262k.b();
        b10.M0(1, j10);
        if (str == null) {
            b10.g1(2);
        } else {
            b10.x0(2, str);
        }
        this.f20252a.e();
        try {
            int z10 = b10.z();
            this.f20252a.B();
            return z10;
        } finally {
            this.f20252a.i();
            this.f20262k.h(b10);
        }
    }

    @Override // k2.v
    public List<u.b> o(String str) {
        r1.x e10 = r1.x.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(new u.b(b10.isNull(0) ? null : b10.getString(0), b0.f(b10.getInt(1))));
            }
            return arrayList;
        } finally {
            b10.close();
            e10.i();
        }
    }

    @Override // k2.v
    public List<u> p(int i10) {
        r1.x xVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        r1.x e24 = r1.x.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e24.M0(1, i10);
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e24, false, null);
        try {
            e10 = t1.a.e(b10, FacebookMediationAdapter.KEY_ID);
            e11 = t1.a.e(b10, "state");
            e12 = t1.a.e(b10, "worker_class_name");
            e13 = t1.a.e(b10, "input_merger_class_name");
            e14 = t1.a.e(b10, "input");
            e15 = t1.a.e(b10, "output");
            e16 = t1.a.e(b10, "initial_delay");
            e17 = t1.a.e(b10, "interval_duration");
            e18 = t1.a.e(b10, "flex_duration");
            e19 = t1.a.e(b10, "run_attempt_count");
            e20 = t1.a.e(b10, "backoff_policy");
            e21 = t1.a.e(b10, "backoff_delay_duration");
            e22 = t1.a.e(b10, "last_enqueue_time");
            e23 = t1.a.e(b10, "minimum_retention_duration");
            xVar = e24;
        } catch (Throwable th2) {
            th = th2;
            xVar = e24;
        }
        try {
            int e25 = t1.a.e(b10, "schedule_requested_at");
            int e26 = t1.a.e(b10, "run_in_foreground");
            int e27 = t1.a.e(b10, "out_of_quota_policy");
            int e28 = t1.a.e(b10, "period_count");
            int e29 = t1.a.e(b10, "generation");
            int e30 = t1.a.e(b10, "required_network_type");
            int e31 = t1.a.e(b10, "requires_charging");
            int e32 = t1.a.e(b10, "requires_device_idle");
            int e33 = t1.a.e(b10, "requires_battery_not_low");
            int e34 = t1.a.e(b10, "requires_storage_not_low");
            int e35 = t1.a.e(b10, "trigger_content_update_delay");
            int e36 = t1.a.e(b10, "trigger_max_content_delay");
            int e37 = t1.a.e(b10, "content_uri_triggers");
            int i16 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                s.a f10 = b0.f(b10.getInt(e11));
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i17 = b10.getInt(e19);
                f2.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i18 = i16;
                long j15 = b10.getLong(i18);
                int i19 = e10;
                int i20 = e25;
                long j16 = b10.getLong(i20);
                e25 = i20;
                int i21 = e26;
                if (b10.getInt(i21) != 0) {
                    e26 = i21;
                    i11 = e27;
                    z10 = true;
                } else {
                    e26 = i21;
                    i11 = e27;
                    z10 = false;
                }
                f2.n e38 = b0.e(b10.getInt(i11));
                e27 = i11;
                int i22 = e28;
                int i23 = b10.getInt(i22);
                e28 = i22;
                int i24 = e29;
                int i25 = b10.getInt(i24);
                e29 = i24;
                int i26 = e30;
                f2.k d10 = b0.d(b10.getInt(i26));
                e30 = i26;
                int i27 = e31;
                if (b10.getInt(i27) != 0) {
                    e31 = i27;
                    i12 = e32;
                    z11 = true;
                } else {
                    e31 = i27;
                    i12 = e32;
                    z11 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e32 = i12;
                    i13 = e33;
                    z12 = true;
                } else {
                    e32 = i12;
                    i13 = e33;
                    z12 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e33 = i13;
                    i14 = e34;
                    z13 = true;
                } else {
                    e33 = i13;
                    i14 = e34;
                    z13 = false;
                }
                if (b10.getInt(i14) != 0) {
                    e34 = i14;
                    i15 = e35;
                    z14 = true;
                } else {
                    e34 = i14;
                    i15 = e35;
                    z14 = false;
                }
                long j17 = b10.getLong(i15);
                e35 = i15;
                int i28 = e36;
                long j18 = b10.getLong(i28);
                e36 = i28;
                int i29 = e37;
                e37 = i29;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new f2.b(d10, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i29) ? null : b10.getBlob(i29))), i17, c10, j13, j14, j15, j16, z10, e38, i23, i25));
                e10 = i19;
                i16 = i18;
            }
            b10.close();
            xVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            xVar.i();
            throw th;
        }
    }

    @Override // k2.v
    public void q(String str, androidx.work.b bVar) {
        this.f20252a.d();
        v1.m b10 = this.f20258g.b();
        byte[] o10 = androidx.work.b.o(bVar);
        if (o10 == null) {
            b10.g1(1);
        } else {
            b10.O0(1, o10);
        }
        if (str == null) {
            b10.g1(2);
        } else {
            b10.x0(2, str);
        }
        this.f20252a.e();
        try {
            b10.z();
            this.f20252a.B();
        } finally {
            this.f20252a.i();
            this.f20258g.h(b10);
        }
    }

    @Override // k2.v
    public List<u> r() {
        r1.x xVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        r1.x e24 = r1.x.e("SELECT * FROM workspec WHERE state=1", 0);
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e24, false, null);
        try {
            e10 = t1.a.e(b10, FacebookMediationAdapter.KEY_ID);
            e11 = t1.a.e(b10, "state");
            e12 = t1.a.e(b10, "worker_class_name");
            e13 = t1.a.e(b10, "input_merger_class_name");
            e14 = t1.a.e(b10, "input");
            e15 = t1.a.e(b10, "output");
            e16 = t1.a.e(b10, "initial_delay");
            e17 = t1.a.e(b10, "interval_duration");
            e18 = t1.a.e(b10, "flex_duration");
            e19 = t1.a.e(b10, "run_attempt_count");
            e20 = t1.a.e(b10, "backoff_policy");
            e21 = t1.a.e(b10, "backoff_delay_duration");
            e22 = t1.a.e(b10, "last_enqueue_time");
            e23 = t1.a.e(b10, "minimum_retention_duration");
            xVar = e24;
        } catch (Throwable th2) {
            th = th2;
            xVar = e24;
        }
        try {
            int e25 = t1.a.e(b10, "schedule_requested_at");
            int e26 = t1.a.e(b10, "run_in_foreground");
            int e27 = t1.a.e(b10, "out_of_quota_policy");
            int e28 = t1.a.e(b10, "period_count");
            int e29 = t1.a.e(b10, "generation");
            int e30 = t1.a.e(b10, "required_network_type");
            int e31 = t1.a.e(b10, "requires_charging");
            int e32 = t1.a.e(b10, "requires_device_idle");
            int e33 = t1.a.e(b10, "requires_battery_not_low");
            int e34 = t1.a.e(b10, "requires_storage_not_low");
            int e35 = t1.a.e(b10, "trigger_content_update_delay");
            int e36 = t1.a.e(b10, "trigger_max_content_delay");
            int e37 = t1.a.e(b10, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                s.a f10 = b0.f(b10.getInt(e11));
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i16 = b10.getInt(e19);
                f2.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i17 = i15;
                long j15 = b10.getLong(i17);
                int i18 = e10;
                int i19 = e25;
                long j16 = b10.getLong(i19);
                e25 = i19;
                int i20 = e26;
                if (b10.getInt(i20) != 0) {
                    e26 = i20;
                    i10 = e27;
                    z10 = true;
                } else {
                    e26 = i20;
                    i10 = e27;
                    z10 = false;
                }
                f2.n e38 = b0.e(b10.getInt(i10));
                e27 = i10;
                int i21 = e28;
                int i22 = b10.getInt(i21);
                e28 = i21;
                int i23 = e29;
                int i24 = b10.getInt(i23);
                e29 = i23;
                int i25 = e30;
                f2.k d10 = b0.d(b10.getInt(i25));
                e30 = i25;
                int i26 = e31;
                if (b10.getInt(i26) != 0) {
                    e31 = i26;
                    i11 = e32;
                    z11 = true;
                } else {
                    e31 = i26;
                    i11 = e32;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    e32 = i11;
                    i12 = e33;
                    z12 = true;
                } else {
                    e32 = i11;
                    i12 = e33;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e33 = i12;
                    i13 = e34;
                    z13 = true;
                } else {
                    e33 = i12;
                    i13 = e34;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e34 = i13;
                    i14 = e35;
                    z14 = true;
                } else {
                    e34 = i13;
                    i14 = e35;
                    z14 = false;
                }
                long j17 = b10.getLong(i14);
                e35 = i14;
                int i27 = e36;
                long j18 = b10.getLong(i27);
                e36 = i27;
                int i28 = e37;
                e37 = i28;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new f2.b(d10, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i28) ? null : b10.getBlob(i28))), i16, c10, j13, j14, j15, j16, z10, e38, i22, i24));
                e10 = i18;
                i15 = i17;
            }
            b10.close();
            xVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            xVar.i();
            throw th;
        }
    }

    @Override // k2.v
    public LiveData<List<u.c>> s(String str) {
        r1.x e10 = r1.x.e("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            e10.g1(1);
        } else {
            e10.x0(1, str);
        }
        return this.f20252a.l().d(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new e(e10));
    }

    @Override // k2.v
    public boolean t() {
        boolean z10 = false;
        r1.x e10 = r1.x.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f20252a.d();
        Cursor b10 = t1.b.b(this.f20252a, e10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            b10.close();
            e10.i();
        }
    }

    @Override // k2.v
    public int u(String str) {
        this.f20252a.d();
        v1.m b10 = this.f20261j.b();
        if (str == null) {
            b10.g1(1);
        } else {
            b10.x0(1, str);
        }
        this.f20252a.e();
        try {
            int z10 = b10.z();
            this.f20252a.B();
            return z10;
        } finally {
            this.f20252a.i();
            this.f20261j.h(b10);
        }
    }

    @Override // k2.v
    public void v(u uVar) {
        this.f20252a.d();
        this.f20252a.e();
        try {
            this.f20253b.j(uVar);
            this.f20252a.B();
        } finally {
            this.f20252a.i();
        }
    }

    @Override // k2.v
    public int w(s.a aVar, String str) {
        this.f20252a.d();
        v1.m b10 = this.f20256e.b();
        b10.M0(1, b0.j(aVar));
        if (str == null) {
            b10.g1(2);
        } else {
            b10.x0(2, str);
        }
        this.f20252a.e();
        try {
            int z10 = b10.z();
            this.f20252a.B();
            return z10;
        } finally {
            this.f20252a.i();
            this.f20256e.h(b10);
        }
    }

    @Override // k2.v
    public int x(String str) {
        this.f20252a.d();
        v1.m b10 = this.f20260i.b();
        if (str == null) {
            b10.g1(1);
        } else {
            b10.x0(1, str);
        }
        this.f20252a.e();
        try {
            int z10 = b10.z();
            this.f20252a.B();
            return z10;
        } finally {
            this.f20252a.i();
            this.f20260i.h(b10);
        }
    }
}
