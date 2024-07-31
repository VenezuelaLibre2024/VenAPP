package p192k2;

import android.database.Cursor;
import androidx.collection.C0731a;
import androidx.lifecycle.LiveData;
import androidx.work.C1522b;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p094f2.C7269b;
import p094f2.C7286s;
import p094f2.EnumC7268a;
import p094f2.EnumC7278k;
import p094f2.EnumC7281n;
import p192k2.C9132u;
import p322r1.AbstractC10585d0;
import p322r1.AbstractC10591h;
import p322r1.AbstractC10592i;
import p322r1.AbstractC10604u;
import p322r1.C10607x;
import p356t1.C10972a;
import p356t1.C10973b;
import p356t1.C10975d;
import p391v1.InterfaceC11614m;

/* renamed from: k2.w */
/* loaded from: classes.dex */
public final class C9134w implements InterfaceC9133v {

    /* renamed from: a */
    private final AbstractC10604u f22034a;

    /* renamed from: b */
    private final AbstractC10592i<C9132u> f22035b;

    /* renamed from: c */
    private final AbstractC10591h<C9132u> f22036c;

    /* renamed from: d */
    private final AbstractC10585d0 f22037d;

    /* renamed from: e */
    private final AbstractC10585d0 f22038e;

    /* renamed from: f */
    private final AbstractC10585d0 f22039f;

    /* renamed from: g */
    private final AbstractC10585d0 f22040g;

    /* renamed from: h */
    private final AbstractC10585d0 f22041h;

    /* renamed from: i */
    private final AbstractC10585d0 f22042i;

    /* renamed from: j */
    private final AbstractC10585d0 f22043j;

    /* renamed from: k */
    private final AbstractC10585d0 f22044k;

    /* renamed from: l */
    private final AbstractC10585d0 f22045l;

    /* renamed from: m */
    private final AbstractC10585d0 f22046m;

    /* renamed from: n */
    private final AbstractC10585d0 f22047n;

    /* renamed from: k2.w$a */
    /* loaded from: classes.dex */
    class a extends AbstractC10585d0 {
        a(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: k2.w$b */
    /* loaded from: classes.dex */
    class b extends AbstractC10585d0 {
        b(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: k2.w$c */
    /* loaded from: classes.dex */
    class c extends AbstractC10585d0 {
        c(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* renamed from: k2.w$d */
    /* loaded from: classes.dex */
    class d extends AbstractC10585d0 {
        d(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* renamed from: k2.w$e */
    /* loaded from: classes.dex */
    class e implements Callable<List<C9132u.c>> {

        /* renamed from: a */
        final /* synthetic */ C10607x f22052a;

        e(C10607x c10607x) {
            this.f22052a = c10607x;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<C9132u.c> call() {
            C9134w.this.f22034a.m32253e();
            try {
                Cursor m33488b = C10973b.m33488b(C9134w.this.f22034a, this.f22052a, true, null);
                try {
                    C0731a c0731a = new C0731a();
                    C0731a c0731a2 = new C0731a();
                    while (m33488b.moveToNext()) {
                        String string = m33488b.getString(0);
                        if (((ArrayList) c0731a.get(string)) == null) {
                            c0731a.put(string, new ArrayList());
                        }
                        String string2 = m33488b.getString(0);
                        if (((ArrayList) c0731a2.get(string2)) == null) {
                            c0731a2.put(string2, new ArrayList());
                        }
                    }
                    m33488b.moveToPosition(-1);
                    C9134w.this.m26931z(c0731a);
                    C9134w.this.m26930y(c0731a2);
                    ArrayList arrayList = new ArrayList(m33488b.getCount());
                    while (m33488b.moveToNext()) {
                        String string3 = m33488b.isNull(0) ? null : m33488b.getString(0);
                        C7286s.a m26848f = C9113b0.m26848f(m33488b.getInt(1));
                        C1522b m8529g = C1522b.m8529g(m33488b.isNull(2) ? null : m33488b.getBlob(2));
                        int i10 = m33488b.getInt(3);
                        int i11 = m33488b.getInt(4);
                        ArrayList arrayList2 = (ArrayList) c0731a.get(m33488b.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) c0731a2.get(m33488b.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new C9132u.c(string3, m26848f, m8529g, i10, i11, arrayList3, arrayList4));
                    }
                    C9134w.this.f22034a.m32250B();
                    return arrayList;
                } finally {
                    m33488b.close();
                }
            } finally {
                C9134w.this.f22034a.m32255i();
            }
        }

        protected void finalize() {
            this.f22052a.m32303i();
        }
    }

    /* renamed from: k2.w$f */
    /* loaded from: classes.dex */
    class f extends AbstractC10592i<C9132u> {
        f(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p322r1.AbstractC10592i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo26837i(InterfaceC11614m interfaceC11614m, C9132u c9132u) {
            String str = c9132u.f22005a;
            if (str == null) {
                interfaceC11614m.mo32161g1(1);
            } else {
                interfaceC11614m.mo32163x0(1, str);
            }
            C9113b0 c9113b0 = C9113b0.f21963a;
            interfaceC11614m.mo32159M0(2, C9113b0.m26852j(c9132u.f22006b));
            String str2 = c9132u.f22007c;
            if (str2 == null) {
                interfaceC11614m.mo32161g1(3);
            } else {
                interfaceC11614m.mo32163x0(3, str2);
            }
            String str3 = c9132u.f22008d;
            if (str3 == null) {
                interfaceC11614m.mo32161g1(4);
            } else {
                interfaceC11614m.mo32163x0(4, str3);
            }
            byte[] m8530o = C1522b.m8530o(c9132u.f22009e);
            if (m8530o == null) {
                interfaceC11614m.mo32161g1(5);
            } else {
                interfaceC11614m.mo32160O0(5, m8530o);
            }
            byte[] m8530o2 = C1522b.m8530o(c9132u.f22010f);
            if (m8530o2 == null) {
                interfaceC11614m.mo32161g1(6);
            } else {
                interfaceC11614m.mo32160O0(6, m8530o2);
            }
            interfaceC11614m.mo32159M0(7, c9132u.f22011g);
            interfaceC11614m.mo32159M0(8, c9132u.f22012h);
            interfaceC11614m.mo32159M0(9, c9132u.f22013i);
            interfaceC11614m.mo32159M0(10, c9132u.f22015k);
            interfaceC11614m.mo32159M0(11, C9113b0.m26843a(c9132u.f22016l));
            interfaceC11614m.mo32159M0(12, c9132u.f22017m);
            interfaceC11614m.mo32159M0(13, c9132u.f22018n);
            interfaceC11614m.mo32159M0(14, c9132u.f22019o);
            interfaceC11614m.mo32159M0(15, c9132u.f22020p);
            interfaceC11614m.mo32159M0(16, c9132u.f22021q ? 1L : 0L);
            interfaceC11614m.mo32159M0(17, C9113b0.m26850h(c9132u.f22022r));
            interfaceC11614m.mo32159M0(18, c9132u.m26896g());
            interfaceC11614m.mo32159M0(19, c9132u.m26895f());
            C7269b c7269b = c9132u.f22014j;
            if (c7269b != null) {
                interfaceC11614m.mo32159M0(20, C9113b0.m26849g(c7269b.m21744d()));
                interfaceC11614m.mo32159M0(21, c7269b.m21747g() ? 1L : 0L);
                interfaceC11614m.mo32159M0(22, c7269b.m21748h() ? 1L : 0L);
                interfaceC11614m.mo32159M0(23, c7269b.m21746f() ? 1L : 0L);
                interfaceC11614m.mo32159M0(24, c7269b.m21749i() ? 1L : 0L);
                interfaceC11614m.mo32159M0(25, c7269b.m21742b());
                interfaceC11614m.mo32159M0(26, c7269b.m21741a());
                byte[] m26851i = C9113b0.m26851i(c7269b.m21743c());
                if (m26851i != null) {
                    interfaceC11614m.mo32160O0(27, m26851i);
                    return;
                }
            } else {
                interfaceC11614m.mo32161g1(20);
                interfaceC11614m.mo32161g1(21);
                interfaceC11614m.mo32161g1(22);
                interfaceC11614m.mo32161g1(23);
                interfaceC11614m.mo32161g1(24);
                interfaceC11614m.mo32161g1(25);
                interfaceC11614m.mo32161g1(26);
            }
            interfaceC11614m.mo32161g1(27);
        }
    }

    /* renamed from: k2.w$g */
    /* loaded from: classes.dex */
    class g extends AbstractC10591h<C9132u> {
        g(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: k2.w$h */
    /* loaded from: classes.dex */
    class h extends AbstractC10585d0 {
        h(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: k2.w$i */
    /* loaded from: classes.dex */
    class i extends AbstractC10585d0 {
        i(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* renamed from: k2.w$j */
    /* loaded from: classes.dex */
    class j extends AbstractC10585d0 {
        j(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* renamed from: k2.w$k */
    /* loaded from: classes.dex */
    class k extends AbstractC10585d0 {
        k(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: k2.w$l */
    /* loaded from: classes.dex */
    class l extends AbstractC10585d0 {
        l(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* renamed from: k2.w$m */
    /* loaded from: classes.dex */
    class m extends AbstractC10585d0 {
        m(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: k2.w$n */
    /* loaded from: classes.dex */
    class n extends AbstractC10585d0 {
        n(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public C9134w(AbstractC10604u abstractC10604u) {
        this.f22034a = abstractC10604u;
        this.f22035b = new f(abstractC10604u);
        this.f22036c = new g(abstractC10604u);
        this.f22037d = new h(abstractC10604u);
        this.f22038e = new i(abstractC10604u);
        this.f22039f = new j(abstractC10604u);
        this.f22040g = new k(abstractC10604u);
        this.f22041h = new l(abstractC10604u);
        this.f22042i = new m(abstractC10604u);
        this.f22043j = new n(abstractC10604u);
        this.f22044k = new a(abstractC10604u);
        this.f22045l = new b(abstractC10604u);
        this.f22046m = new c(abstractC10604u);
        this.f22047n = new d(abstractC10604u);
    }

    /* renamed from: D */
    public static List<Class<?>> m26929D() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m26930y(C0731a<String, ArrayList<C1522b>> c0731a) {
        Set<String> keySet = c0731a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (c0731a.size() > 999) {
            C0731a<String, ArrayList<C1522b>> c0731a2 = new C0731a<>(999);
            int size = c0731a.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                c0731a2.put(c0731a.m3711j(i10), c0731a.m3715n(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    m26930y(c0731a2);
                    c0731a2 = new C0731a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                m26930y(c0731a2);
                return;
            }
            return;
        }
        StringBuilder m33492b = C10975d.m33492b();
        m33492b.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        C10975d.m33491a(m33492b, size2);
        m33492b.append(")");
        C10607x m32298e = C10607x.m32298e(m33492b.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                m32298e.mo32161g1(i12);
            } else {
                m32298e.mo32163x0(i12, str);
            }
            i12++;
        }
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            int m33485d = C10972a.m33485d(m33488b, "work_spec_id");
            if (m33485d == -1) {
                return;
            }
            while (m33488b.moveToNext()) {
                ArrayList<C1522b> arrayList = c0731a.get(m33488b.getString(m33485d));
                if (arrayList != null) {
                    arrayList.add(C1522b.m8529g(m33488b.isNull(0) ? null : m33488b.getBlob(0)));
                }
            }
        } finally {
            m33488b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m26931z(C0731a<String, ArrayList<String>> c0731a) {
        Set<String> keySet = c0731a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (c0731a.size() > 999) {
            C0731a<String, ArrayList<String>> c0731a2 = new C0731a<>(999);
            int size = c0731a.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                c0731a2.put(c0731a.m3711j(i10), c0731a.m3715n(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    m26931z(c0731a2);
                    c0731a2 = new C0731a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                m26931z(c0731a2);
                return;
            }
            return;
        }
        StringBuilder m33492b = C10975d.m33492b();
        m33492b.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        C10975d.m33491a(m33492b, size2);
        m33492b.append(")");
        C10607x m32298e = C10607x.m32298e(m33492b.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                m32298e.mo32161g1(i12);
            } else {
                m32298e.mo32163x0(i12, str);
            }
            i12++;
        }
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            int m33485d = C10972a.m33485d(m33488b, "work_spec_id");
            if (m33485d == -1) {
                return;
            }
            while (m33488b.moveToNext()) {
                ArrayList<String> arrayList = c0731a.get(m33488b.getString(m33485d));
                if (arrayList != null) {
                    arrayList.add(m33488b.isNull(0) ? null : m33488b.getString(0));
                }
            }
        } finally {
            m33488b.close();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: a */
    public void mo26902a(String str) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22037d.m32172b();
        if (str == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32163x0(1, str);
        }
        this.f22034a.m32253e();
        try {
            m32172b.mo32164z();
            this.f22034a.m32250B();
        } finally {
            this.f22034a.m32255i();
            this.f22037d.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: b */
    public void mo26903b() {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22046m.m32172b();
        this.f22034a.m32253e();
        try {
            m32172b.mo32164z();
            this.f22034a.m32250B();
        } finally {
            this.f22034a.m32255i();
            this.f22046m.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: c */
    public void mo26904c(String str) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22039f.m32172b();
        if (str == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32163x0(1, str);
        }
        this.f22034a.m32253e();
        try {
            m32172b.mo32164z();
            this.f22034a.m32250B();
        } finally {
            this.f22034a.m32255i();
            this.f22039f.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: d */
    public List<C9132u> mo26905d(long j10) {
        C10607x c10607x;
        int m33486e;
        int m33486e2;
        int m33486e3;
        int m33486e4;
        int m33486e5;
        int m33486e6;
        int m33486e7;
        int m33486e8;
        int m33486e9;
        int m33486e10;
        int m33486e11;
        int m33486e12;
        int m33486e13;
        int m33486e14;
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
        C10607x m32298e = C10607x.m32298e("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        m32298e.mo32159M0(1, j10);
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            m33486e = C10972a.m33486e(m33488b, FacebookMediationAdapter.KEY_ID);
            m33486e2 = C10972a.m33486e(m33488b, "state");
            m33486e3 = C10972a.m33486e(m33488b, "worker_class_name");
            m33486e4 = C10972a.m33486e(m33488b, "input_merger_class_name");
            m33486e5 = C10972a.m33486e(m33488b, "input");
            m33486e6 = C10972a.m33486e(m33488b, "output");
            m33486e7 = C10972a.m33486e(m33488b, "initial_delay");
            m33486e8 = C10972a.m33486e(m33488b, "interval_duration");
            m33486e9 = C10972a.m33486e(m33488b, "flex_duration");
            m33486e10 = C10972a.m33486e(m33488b, "run_attempt_count");
            m33486e11 = C10972a.m33486e(m33488b, "backoff_policy");
            m33486e12 = C10972a.m33486e(m33488b, "backoff_delay_duration");
            m33486e13 = C10972a.m33486e(m33488b, "last_enqueue_time");
            m33486e14 = C10972a.m33486e(m33488b, "minimum_retention_duration");
            c10607x = m32298e;
        } catch (Throwable th2) {
            th = th2;
            c10607x = m32298e;
        }
        try {
            int m33486e15 = C10972a.m33486e(m33488b, "schedule_requested_at");
            int m33486e16 = C10972a.m33486e(m33488b, "run_in_foreground");
            int m33486e17 = C10972a.m33486e(m33488b, "out_of_quota_policy");
            int m33486e18 = C10972a.m33486e(m33488b, "period_count");
            int m33486e19 = C10972a.m33486e(m33488b, "generation");
            int m33486e20 = C10972a.m33486e(m33488b, "required_network_type");
            int m33486e21 = C10972a.m33486e(m33488b, "requires_charging");
            int m33486e22 = C10972a.m33486e(m33488b, "requires_device_idle");
            int m33486e23 = C10972a.m33486e(m33488b, "requires_battery_not_low");
            int m33486e24 = C10972a.m33486e(m33488b, "requires_storage_not_low");
            int m33486e25 = C10972a.m33486e(m33488b, "trigger_content_update_delay");
            int m33486e26 = C10972a.m33486e(m33488b, "trigger_max_content_delay");
            int m33486e27 = C10972a.m33486e(m33488b, "content_uri_triggers");
            int i15 = m33486e14;
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                String string = m33488b.isNull(m33486e) ? null : m33488b.getString(m33486e);
                C7286s.a m26848f = C9113b0.m26848f(m33488b.getInt(m33486e2));
                String string2 = m33488b.isNull(m33486e3) ? null : m33488b.getString(m33486e3);
                String string3 = m33488b.isNull(m33486e4) ? null : m33488b.getString(m33486e4);
                C1522b m8529g = C1522b.m8529g(m33488b.isNull(m33486e5) ? null : m33488b.getBlob(m33486e5));
                C1522b m8529g2 = C1522b.m8529g(m33488b.isNull(m33486e6) ? null : m33488b.getBlob(m33486e6));
                long j11 = m33488b.getLong(m33486e7);
                long j12 = m33488b.getLong(m33486e8);
                long j13 = m33488b.getLong(m33486e9);
                int i16 = m33488b.getInt(m33486e10);
                EnumC7268a m26845c = C9113b0.m26845c(m33488b.getInt(m33486e11));
                long j14 = m33488b.getLong(m33486e12);
                long j15 = m33488b.getLong(m33486e13);
                int i17 = i15;
                long j16 = m33488b.getLong(i17);
                int i18 = m33486e;
                int i19 = m33486e15;
                long j17 = m33488b.getLong(i19);
                m33486e15 = i19;
                int i20 = m33486e16;
                if (m33488b.getInt(i20) != 0) {
                    m33486e16 = i20;
                    i10 = m33486e17;
                    z10 = true;
                } else {
                    m33486e16 = i20;
                    i10 = m33486e17;
                    z10 = false;
                }
                EnumC7281n m26847e = C9113b0.m26847e(m33488b.getInt(i10));
                m33486e17 = i10;
                int i21 = m33486e18;
                int i22 = m33488b.getInt(i21);
                m33486e18 = i21;
                int i23 = m33486e19;
                int i24 = m33488b.getInt(i23);
                m33486e19 = i23;
                int i25 = m33486e20;
                EnumC7278k m26846d = C9113b0.m26846d(m33488b.getInt(i25));
                m33486e20 = i25;
                int i26 = m33486e21;
                if (m33488b.getInt(i26) != 0) {
                    m33486e21 = i26;
                    i11 = m33486e22;
                    z11 = true;
                } else {
                    m33486e21 = i26;
                    i11 = m33486e22;
                    z11 = false;
                }
                if (m33488b.getInt(i11) != 0) {
                    m33486e22 = i11;
                    i12 = m33486e23;
                    z12 = true;
                } else {
                    m33486e22 = i11;
                    i12 = m33486e23;
                    z12 = false;
                }
                if (m33488b.getInt(i12) != 0) {
                    m33486e23 = i12;
                    i13 = m33486e24;
                    z13 = true;
                } else {
                    m33486e23 = i12;
                    i13 = m33486e24;
                    z13 = false;
                }
                if (m33488b.getInt(i13) != 0) {
                    m33486e24 = i13;
                    i14 = m33486e25;
                    z14 = true;
                } else {
                    m33486e24 = i13;
                    i14 = m33486e25;
                    z14 = false;
                }
                long j18 = m33488b.getLong(i14);
                m33486e25 = i14;
                int i27 = m33486e26;
                long j19 = m33488b.getLong(i27);
                m33486e26 = i27;
                int i28 = m33486e27;
                m33486e27 = i28;
                arrayList.add(new C9132u(string, m26848f, string2, string3, m8529g, m8529g2, j11, j12, j13, new C7269b(m26846d, z11, z12, z13, z14, j18, j19, C9113b0.m26844b(m33488b.isNull(i28) ? null : m33488b.getBlob(i28))), i16, m26845c, j14, j15, j16, j17, z10, m26847e, i22, i24));
                m33486e = i18;
                i15 = i17;
            }
            m33488b.close();
            c10607x.m32303i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m33488b.close();
            c10607x.m32303i();
            throw th;
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: e */
    public List<C9132u> mo26906e() {
        C10607x c10607x;
        int m33486e;
        int m33486e2;
        int m33486e3;
        int m33486e4;
        int m33486e5;
        int m33486e6;
        int m33486e7;
        int m33486e8;
        int m33486e9;
        int m33486e10;
        int m33486e11;
        int m33486e12;
        int m33486e13;
        int m33486e14;
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
        C10607x m32298e = C10607x.m32298e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            m33486e = C10972a.m33486e(m33488b, FacebookMediationAdapter.KEY_ID);
            m33486e2 = C10972a.m33486e(m33488b, "state");
            m33486e3 = C10972a.m33486e(m33488b, "worker_class_name");
            m33486e4 = C10972a.m33486e(m33488b, "input_merger_class_name");
            m33486e5 = C10972a.m33486e(m33488b, "input");
            m33486e6 = C10972a.m33486e(m33488b, "output");
            m33486e7 = C10972a.m33486e(m33488b, "initial_delay");
            m33486e8 = C10972a.m33486e(m33488b, "interval_duration");
            m33486e9 = C10972a.m33486e(m33488b, "flex_duration");
            m33486e10 = C10972a.m33486e(m33488b, "run_attempt_count");
            m33486e11 = C10972a.m33486e(m33488b, "backoff_policy");
            m33486e12 = C10972a.m33486e(m33488b, "backoff_delay_duration");
            m33486e13 = C10972a.m33486e(m33488b, "last_enqueue_time");
            m33486e14 = C10972a.m33486e(m33488b, "minimum_retention_duration");
            c10607x = m32298e;
        } catch (Throwable th2) {
            th = th2;
            c10607x = m32298e;
        }
        try {
            int m33486e15 = C10972a.m33486e(m33488b, "schedule_requested_at");
            int m33486e16 = C10972a.m33486e(m33488b, "run_in_foreground");
            int m33486e17 = C10972a.m33486e(m33488b, "out_of_quota_policy");
            int m33486e18 = C10972a.m33486e(m33488b, "period_count");
            int m33486e19 = C10972a.m33486e(m33488b, "generation");
            int m33486e20 = C10972a.m33486e(m33488b, "required_network_type");
            int m33486e21 = C10972a.m33486e(m33488b, "requires_charging");
            int m33486e22 = C10972a.m33486e(m33488b, "requires_device_idle");
            int m33486e23 = C10972a.m33486e(m33488b, "requires_battery_not_low");
            int m33486e24 = C10972a.m33486e(m33488b, "requires_storage_not_low");
            int m33486e25 = C10972a.m33486e(m33488b, "trigger_content_update_delay");
            int m33486e26 = C10972a.m33486e(m33488b, "trigger_max_content_delay");
            int m33486e27 = C10972a.m33486e(m33488b, "content_uri_triggers");
            int i15 = m33486e14;
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                String string = m33488b.isNull(m33486e) ? null : m33488b.getString(m33486e);
                C7286s.a m26848f = C9113b0.m26848f(m33488b.getInt(m33486e2));
                String string2 = m33488b.isNull(m33486e3) ? null : m33488b.getString(m33486e3);
                String string3 = m33488b.isNull(m33486e4) ? null : m33488b.getString(m33486e4);
                C1522b m8529g = C1522b.m8529g(m33488b.isNull(m33486e5) ? null : m33488b.getBlob(m33486e5));
                C1522b m8529g2 = C1522b.m8529g(m33488b.isNull(m33486e6) ? null : m33488b.getBlob(m33486e6));
                long j10 = m33488b.getLong(m33486e7);
                long j11 = m33488b.getLong(m33486e8);
                long j12 = m33488b.getLong(m33486e9);
                int i16 = m33488b.getInt(m33486e10);
                EnumC7268a m26845c = C9113b0.m26845c(m33488b.getInt(m33486e11));
                long j13 = m33488b.getLong(m33486e12);
                long j14 = m33488b.getLong(m33486e13);
                int i17 = i15;
                long j15 = m33488b.getLong(i17);
                int i18 = m33486e;
                int i19 = m33486e15;
                long j16 = m33488b.getLong(i19);
                m33486e15 = i19;
                int i20 = m33486e16;
                if (m33488b.getInt(i20) != 0) {
                    m33486e16 = i20;
                    i10 = m33486e17;
                    z10 = true;
                } else {
                    m33486e16 = i20;
                    i10 = m33486e17;
                    z10 = false;
                }
                EnumC7281n m26847e = C9113b0.m26847e(m33488b.getInt(i10));
                m33486e17 = i10;
                int i21 = m33486e18;
                int i22 = m33488b.getInt(i21);
                m33486e18 = i21;
                int i23 = m33486e19;
                int i24 = m33488b.getInt(i23);
                m33486e19 = i23;
                int i25 = m33486e20;
                EnumC7278k m26846d = C9113b0.m26846d(m33488b.getInt(i25));
                m33486e20 = i25;
                int i26 = m33486e21;
                if (m33488b.getInt(i26) != 0) {
                    m33486e21 = i26;
                    i11 = m33486e22;
                    z11 = true;
                } else {
                    m33486e21 = i26;
                    i11 = m33486e22;
                    z11 = false;
                }
                if (m33488b.getInt(i11) != 0) {
                    m33486e22 = i11;
                    i12 = m33486e23;
                    z12 = true;
                } else {
                    m33486e22 = i11;
                    i12 = m33486e23;
                    z12 = false;
                }
                if (m33488b.getInt(i12) != 0) {
                    m33486e23 = i12;
                    i13 = m33486e24;
                    z13 = true;
                } else {
                    m33486e23 = i12;
                    i13 = m33486e24;
                    z13 = false;
                }
                if (m33488b.getInt(i13) != 0) {
                    m33486e24 = i13;
                    i14 = m33486e25;
                    z14 = true;
                } else {
                    m33486e24 = i13;
                    i14 = m33486e25;
                    z14 = false;
                }
                long j17 = m33488b.getLong(i14);
                m33486e25 = i14;
                int i27 = m33486e26;
                long j18 = m33488b.getLong(i27);
                m33486e26 = i27;
                int i28 = m33486e27;
                m33486e27 = i28;
                arrayList.add(new C9132u(string, m26848f, string2, string3, m8529g, m8529g2, j10, j11, j12, new C7269b(m26846d, z11, z12, z13, z14, j17, j18, C9113b0.m26844b(m33488b.isNull(i28) ? null : m33488b.getBlob(i28))), i16, m26845c, j13, j14, j15, j16, z10, m26847e, i22, i24));
                m33486e = i18;
                i15 = i17;
            }
            m33488b.close();
            c10607x.m32303i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m33488b.close();
            c10607x.m32303i();
            throw th;
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: f */
    public List<String> mo26907f(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                arrayList.add(m33488b.isNull(0) ? null : m33488b.getString(0));
            }
            return arrayList;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: g */
    public C7286s.a mo26908g(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f22034a.m32252d();
        C7286s.a aVar = null;
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            if (m33488b.moveToFirst()) {
                Integer valueOf = m33488b.isNull(0) ? null : Integer.valueOf(m33488b.getInt(0));
                if (valueOf != null) {
                    C9113b0 c9113b0 = C9113b0.f21963a;
                    aVar = C9113b0.m26848f(valueOf.intValue());
                }
            }
            return aVar;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: h */
    public C9132u mo26909h(String str) {
        C10607x c10607x;
        int m33486e;
        int m33486e2;
        int m33486e3;
        int m33486e4;
        int m33486e5;
        int m33486e6;
        int m33486e7;
        int m33486e8;
        int m33486e9;
        int m33486e10;
        int m33486e11;
        int m33486e12;
        int m33486e13;
        int m33486e14;
        C9132u c9132u;
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
        C10607x m32298e = C10607x.m32298e("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            m33486e = C10972a.m33486e(m33488b, FacebookMediationAdapter.KEY_ID);
            m33486e2 = C10972a.m33486e(m33488b, "state");
            m33486e3 = C10972a.m33486e(m33488b, "worker_class_name");
            m33486e4 = C10972a.m33486e(m33488b, "input_merger_class_name");
            m33486e5 = C10972a.m33486e(m33488b, "input");
            m33486e6 = C10972a.m33486e(m33488b, "output");
            m33486e7 = C10972a.m33486e(m33488b, "initial_delay");
            m33486e8 = C10972a.m33486e(m33488b, "interval_duration");
            m33486e9 = C10972a.m33486e(m33488b, "flex_duration");
            m33486e10 = C10972a.m33486e(m33488b, "run_attempt_count");
            m33486e11 = C10972a.m33486e(m33488b, "backoff_policy");
            m33486e12 = C10972a.m33486e(m33488b, "backoff_delay_duration");
            m33486e13 = C10972a.m33486e(m33488b, "last_enqueue_time");
            m33486e14 = C10972a.m33486e(m33488b, "minimum_retention_duration");
            c10607x = m32298e;
        } catch (Throwable th2) {
            th = th2;
            c10607x = m32298e;
        }
        try {
            int m33486e15 = C10972a.m33486e(m33488b, "schedule_requested_at");
            int m33486e16 = C10972a.m33486e(m33488b, "run_in_foreground");
            int m33486e17 = C10972a.m33486e(m33488b, "out_of_quota_policy");
            int m33486e18 = C10972a.m33486e(m33488b, "period_count");
            int m33486e19 = C10972a.m33486e(m33488b, "generation");
            int m33486e20 = C10972a.m33486e(m33488b, "required_network_type");
            int m33486e21 = C10972a.m33486e(m33488b, "requires_charging");
            int m33486e22 = C10972a.m33486e(m33488b, "requires_device_idle");
            int m33486e23 = C10972a.m33486e(m33488b, "requires_battery_not_low");
            int m33486e24 = C10972a.m33486e(m33488b, "requires_storage_not_low");
            int m33486e25 = C10972a.m33486e(m33488b, "trigger_content_update_delay");
            int m33486e26 = C10972a.m33486e(m33488b, "trigger_max_content_delay");
            int m33486e27 = C10972a.m33486e(m33488b, "content_uri_triggers");
            if (m33488b.moveToFirst()) {
                String string = m33488b.isNull(m33486e) ? null : m33488b.getString(m33486e);
                C7286s.a m26848f = C9113b0.m26848f(m33488b.getInt(m33486e2));
                String string2 = m33488b.isNull(m33486e3) ? null : m33488b.getString(m33486e3);
                String string3 = m33488b.isNull(m33486e4) ? null : m33488b.getString(m33486e4);
                C1522b m8529g = C1522b.m8529g(m33488b.isNull(m33486e5) ? null : m33488b.getBlob(m33486e5));
                C1522b m8529g2 = C1522b.m8529g(m33488b.isNull(m33486e6) ? null : m33488b.getBlob(m33486e6));
                long j10 = m33488b.getLong(m33486e7);
                long j11 = m33488b.getLong(m33486e8);
                long j12 = m33488b.getLong(m33486e9);
                int i15 = m33488b.getInt(m33486e10);
                EnumC7268a m26845c = C9113b0.m26845c(m33488b.getInt(m33486e11));
                long j13 = m33488b.getLong(m33486e12);
                long j14 = m33488b.getLong(m33486e13);
                long j15 = m33488b.getLong(m33486e14);
                long j16 = m33488b.getLong(m33486e15);
                if (m33488b.getInt(m33486e16) != 0) {
                    i10 = m33486e17;
                    z10 = true;
                } else {
                    i10 = m33486e17;
                    z10 = false;
                }
                EnumC7281n m26847e = C9113b0.m26847e(m33488b.getInt(i10));
                int i16 = m33488b.getInt(m33486e18);
                int i17 = m33488b.getInt(m33486e19);
                EnumC7278k m26846d = C9113b0.m26846d(m33488b.getInt(m33486e20));
                if (m33488b.getInt(m33486e21) != 0) {
                    i11 = m33486e22;
                    z11 = true;
                } else {
                    i11 = m33486e22;
                    z11 = false;
                }
                if (m33488b.getInt(i11) != 0) {
                    i12 = m33486e23;
                    z12 = true;
                } else {
                    i12 = m33486e23;
                    z12 = false;
                }
                if (m33488b.getInt(i12) != 0) {
                    i13 = m33486e24;
                    z13 = true;
                } else {
                    i13 = m33486e24;
                    z13 = false;
                }
                if (m33488b.getInt(i13) != 0) {
                    i14 = m33486e25;
                    z14 = true;
                } else {
                    i14 = m33486e25;
                    z14 = false;
                }
                c9132u = new C9132u(string, m26848f, string2, string3, m8529g, m8529g2, j10, j11, j12, new C7269b(m26846d, z11, z12, z13, z14, m33488b.getLong(i14), m33488b.getLong(m33486e26), C9113b0.m26844b(m33488b.isNull(m33486e27) ? null : m33488b.getBlob(m33486e27))), i15, m26845c, j13, j14, j15, j16, z10, m26847e, i16, i17);
            } else {
                c9132u = null;
            }
            m33488b.close();
            c10607x.m32303i();
            return c9132u;
        } catch (Throwable th3) {
            th = th3;
            m33488b.close();
            c10607x.m32303i();
            throw th;
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: i */
    public void mo26910i(String str, long j10) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22041h.m32172b();
        m32172b.mo32159M0(1, j10);
        if (str == null) {
            m32172b.mo32161g1(2);
        } else {
            m32172b.mo32163x0(2, str);
        }
        this.f22034a.m32253e();
        try {
            m32172b.mo32164z();
            this.f22034a.m32250B();
        } finally {
            this.f22034a.m32255i();
            this.f22041h.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: j */
    public List<String> mo26911j(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                arrayList.add(m33488b.isNull(0) ? null : m33488b.getString(0));
            }
            return arrayList;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: k */
    public List<C1522b> mo26912k(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                arrayList.add(C1522b.m8529g(m33488b.isNull(0) ? null : m33488b.getBlob(0)));
            }
            return arrayList;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: l */
    public List<C9132u> mo26913l(int i10) {
        C10607x c10607x;
        int m33486e;
        int m33486e2;
        int m33486e3;
        int m33486e4;
        int m33486e5;
        int m33486e6;
        int m33486e7;
        int m33486e8;
        int m33486e9;
        int m33486e10;
        int m33486e11;
        int m33486e12;
        int m33486e13;
        int m33486e14;
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
        C10607x m32298e = C10607x.m32298e("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        m32298e.mo32159M0(1, i10);
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            m33486e = C10972a.m33486e(m33488b, FacebookMediationAdapter.KEY_ID);
            m33486e2 = C10972a.m33486e(m33488b, "state");
            m33486e3 = C10972a.m33486e(m33488b, "worker_class_name");
            m33486e4 = C10972a.m33486e(m33488b, "input_merger_class_name");
            m33486e5 = C10972a.m33486e(m33488b, "input");
            m33486e6 = C10972a.m33486e(m33488b, "output");
            m33486e7 = C10972a.m33486e(m33488b, "initial_delay");
            m33486e8 = C10972a.m33486e(m33488b, "interval_duration");
            m33486e9 = C10972a.m33486e(m33488b, "flex_duration");
            m33486e10 = C10972a.m33486e(m33488b, "run_attempt_count");
            m33486e11 = C10972a.m33486e(m33488b, "backoff_policy");
            m33486e12 = C10972a.m33486e(m33488b, "backoff_delay_duration");
            m33486e13 = C10972a.m33486e(m33488b, "last_enqueue_time");
            m33486e14 = C10972a.m33486e(m33488b, "minimum_retention_duration");
            c10607x = m32298e;
        } catch (Throwable th2) {
            th = th2;
            c10607x = m32298e;
        }
        try {
            int m33486e15 = C10972a.m33486e(m33488b, "schedule_requested_at");
            int m33486e16 = C10972a.m33486e(m33488b, "run_in_foreground");
            int m33486e17 = C10972a.m33486e(m33488b, "out_of_quota_policy");
            int m33486e18 = C10972a.m33486e(m33488b, "period_count");
            int m33486e19 = C10972a.m33486e(m33488b, "generation");
            int m33486e20 = C10972a.m33486e(m33488b, "required_network_type");
            int m33486e21 = C10972a.m33486e(m33488b, "requires_charging");
            int m33486e22 = C10972a.m33486e(m33488b, "requires_device_idle");
            int m33486e23 = C10972a.m33486e(m33488b, "requires_battery_not_low");
            int m33486e24 = C10972a.m33486e(m33488b, "requires_storage_not_low");
            int m33486e25 = C10972a.m33486e(m33488b, "trigger_content_update_delay");
            int m33486e26 = C10972a.m33486e(m33488b, "trigger_max_content_delay");
            int m33486e27 = C10972a.m33486e(m33488b, "content_uri_triggers");
            int i16 = m33486e14;
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                String string = m33488b.isNull(m33486e) ? null : m33488b.getString(m33486e);
                C7286s.a m26848f = C9113b0.m26848f(m33488b.getInt(m33486e2));
                String string2 = m33488b.isNull(m33486e3) ? null : m33488b.getString(m33486e3);
                String string3 = m33488b.isNull(m33486e4) ? null : m33488b.getString(m33486e4);
                C1522b m8529g = C1522b.m8529g(m33488b.isNull(m33486e5) ? null : m33488b.getBlob(m33486e5));
                C1522b m8529g2 = C1522b.m8529g(m33488b.isNull(m33486e6) ? null : m33488b.getBlob(m33486e6));
                long j10 = m33488b.getLong(m33486e7);
                long j11 = m33488b.getLong(m33486e8);
                long j12 = m33488b.getLong(m33486e9);
                int i17 = m33488b.getInt(m33486e10);
                EnumC7268a m26845c = C9113b0.m26845c(m33488b.getInt(m33486e11));
                long j13 = m33488b.getLong(m33486e12);
                long j14 = m33488b.getLong(m33486e13);
                int i18 = i16;
                long j15 = m33488b.getLong(i18);
                int i19 = m33486e;
                int i20 = m33486e15;
                long j16 = m33488b.getLong(i20);
                m33486e15 = i20;
                int i21 = m33486e16;
                if (m33488b.getInt(i21) != 0) {
                    m33486e16 = i21;
                    i11 = m33486e17;
                    z10 = true;
                } else {
                    m33486e16 = i21;
                    i11 = m33486e17;
                    z10 = false;
                }
                EnumC7281n m26847e = C9113b0.m26847e(m33488b.getInt(i11));
                m33486e17 = i11;
                int i22 = m33486e18;
                int i23 = m33488b.getInt(i22);
                m33486e18 = i22;
                int i24 = m33486e19;
                int i25 = m33488b.getInt(i24);
                m33486e19 = i24;
                int i26 = m33486e20;
                EnumC7278k m26846d = C9113b0.m26846d(m33488b.getInt(i26));
                m33486e20 = i26;
                int i27 = m33486e21;
                if (m33488b.getInt(i27) != 0) {
                    m33486e21 = i27;
                    i12 = m33486e22;
                    z11 = true;
                } else {
                    m33486e21 = i27;
                    i12 = m33486e22;
                    z11 = false;
                }
                if (m33488b.getInt(i12) != 0) {
                    m33486e22 = i12;
                    i13 = m33486e23;
                    z12 = true;
                } else {
                    m33486e22 = i12;
                    i13 = m33486e23;
                    z12 = false;
                }
                if (m33488b.getInt(i13) != 0) {
                    m33486e23 = i13;
                    i14 = m33486e24;
                    z13 = true;
                } else {
                    m33486e23 = i13;
                    i14 = m33486e24;
                    z13 = false;
                }
                if (m33488b.getInt(i14) != 0) {
                    m33486e24 = i14;
                    i15 = m33486e25;
                    z14 = true;
                } else {
                    m33486e24 = i14;
                    i15 = m33486e25;
                    z14 = false;
                }
                long j17 = m33488b.getLong(i15);
                m33486e25 = i15;
                int i28 = m33486e26;
                long j18 = m33488b.getLong(i28);
                m33486e26 = i28;
                int i29 = m33486e27;
                m33486e27 = i29;
                arrayList.add(new C9132u(string, m26848f, string2, string3, m8529g, m8529g2, j10, j11, j12, new C7269b(m26846d, z11, z12, z13, z14, j17, j18, C9113b0.m26844b(m33488b.isNull(i29) ? null : m33488b.getBlob(i29))), i17, m26845c, j13, j14, j15, j16, z10, m26847e, i23, i25));
                m33486e = i19;
                i16 = i18;
            }
            m33488b.close();
            c10607x.m32303i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m33488b.close();
            c10607x.m32303i();
            throw th;
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: m */
    public int mo26914m() {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22045l.m32172b();
        this.f22034a.m32253e();
        try {
            int mo32164z = m32172b.mo32164z();
            this.f22034a.m32250B();
            return mo32164z;
        } finally {
            this.f22034a.m32255i();
            this.f22045l.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: n */
    public int mo26915n(String str, long j10) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22044k.m32172b();
        m32172b.mo32159M0(1, j10);
        if (str == null) {
            m32172b.mo32161g1(2);
        } else {
            m32172b.mo32163x0(2, str);
        }
        this.f22034a.m32253e();
        try {
            int mo32164z = m32172b.mo32164z();
            this.f22034a.m32250B();
            return mo32164z;
        } finally {
            this.f22034a.m32255i();
            this.f22044k.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: o */
    public List<C9132u.b> mo26916o(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                arrayList.add(new C9132u.b(m33488b.isNull(0) ? null : m33488b.getString(0), C9113b0.m26848f(m33488b.getInt(1))));
            }
            return arrayList;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: p */
    public List<C9132u> mo26917p(int i10) {
        C10607x c10607x;
        int m33486e;
        int m33486e2;
        int m33486e3;
        int m33486e4;
        int m33486e5;
        int m33486e6;
        int m33486e7;
        int m33486e8;
        int m33486e9;
        int m33486e10;
        int m33486e11;
        int m33486e12;
        int m33486e13;
        int m33486e14;
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
        C10607x m32298e = C10607x.m32298e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        m32298e.mo32159M0(1, i10);
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            m33486e = C10972a.m33486e(m33488b, FacebookMediationAdapter.KEY_ID);
            m33486e2 = C10972a.m33486e(m33488b, "state");
            m33486e3 = C10972a.m33486e(m33488b, "worker_class_name");
            m33486e4 = C10972a.m33486e(m33488b, "input_merger_class_name");
            m33486e5 = C10972a.m33486e(m33488b, "input");
            m33486e6 = C10972a.m33486e(m33488b, "output");
            m33486e7 = C10972a.m33486e(m33488b, "initial_delay");
            m33486e8 = C10972a.m33486e(m33488b, "interval_duration");
            m33486e9 = C10972a.m33486e(m33488b, "flex_duration");
            m33486e10 = C10972a.m33486e(m33488b, "run_attempt_count");
            m33486e11 = C10972a.m33486e(m33488b, "backoff_policy");
            m33486e12 = C10972a.m33486e(m33488b, "backoff_delay_duration");
            m33486e13 = C10972a.m33486e(m33488b, "last_enqueue_time");
            m33486e14 = C10972a.m33486e(m33488b, "minimum_retention_duration");
            c10607x = m32298e;
        } catch (Throwable th2) {
            th = th2;
            c10607x = m32298e;
        }
        try {
            int m33486e15 = C10972a.m33486e(m33488b, "schedule_requested_at");
            int m33486e16 = C10972a.m33486e(m33488b, "run_in_foreground");
            int m33486e17 = C10972a.m33486e(m33488b, "out_of_quota_policy");
            int m33486e18 = C10972a.m33486e(m33488b, "period_count");
            int m33486e19 = C10972a.m33486e(m33488b, "generation");
            int m33486e20 = C10972a.m33486e(m33488b, "required_network_type");
            int m33486e21 = C10972a.m33486e(m33488b, "requires_charging");
            int m33486e22 = C10972a.m33486e(m33488b, "requires_device_idle");
            int m33486e23 = C10972a.m33486e(m33488b, "requires_battery_not_low");
            int m33486e24 = C10972a.m33486e(m33488b, "requires_storage_not_low");
            int m33486e25 = C10972a.m33486e(m33488b, "trigger_content_update_delay");
            int m33486e26 = C10972a.m33486e(m33488b, "trigger_max_content_delay");
            int m33486e27 = C10972a.m33486e(m33488b, "content_uri_triggers");
            int i16 = m33486e14;
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                String string = m33488b.isNull(m33486e) ? null : m33488b.getString(m33486e);
                C7286s.a m26848f = C9113b0.m26848f(m33488b.getInt(m33486e2));
                String string2 = m33488b.isNull(m33486e3) ? null : m33488b.getString(m33486e3);
                String string3 = m33488b.isNull(m33486e4) ? null : m33488b.getString(m33486e4);
                C1522b m8529g = C1522b.m8529g(m33488b.isNull(m33486e5) ? null : m33488b.getBlob(m33486e5));
                C1522b m8529g2 = C1522b.m8529g(m33488b.isNull(m33486e6) ? null : m33488b.getBlob(m33486e6));
                long j10 = m33488b.getLong(m33486e7);
                long j11 = m33488b.getLong(m33486e8);
                long j12 = m33488b.getLong(m33486e9);
                int i17 = m33488b.getInt(m33486e10);
                EnumC7268a m26845c = C9113b0.m26845c(m33488b.getInt(m33486e11));
                long j13 = m33488b.getLong(m33486e12);
                long j14 = m33488b.getLong(m33486e13);
                int i18 = i16;
                long j15 = m33488b.getLong(i18);
                int i19 = m33486e;
                int i20 = m33486e15;
                long j16 = m33488b.getLong(i20);
                m33486e15 = i20;
                int i21 = m33486e16;
                if (m33488b.getInt(i21) != 0) {
                    m33486e16 = i21;
                    i11 = m33486e17;
                    z10 = true;
                } else {
                    m33486e16 = i21;
                    i11 = m33486e17;
                    z10 = false;
                }
                EnumC7281n m26847e = C9113b0.m26847e(m33488b.getInt(i11));
                m33486e17 = i11;
                int i22 = m33486e18;
                int i23 = m33488b.getInt(i22);
                m33486e18 = i22;
                int i24 = m33486e19;
                int i25 = m33488b.getInt(i24);
                m33486e19 = i24;
                int i26 = m33486e20;
                EnumC7278k m26846d = C9113b0.m26846d(m33488b.getInt(i26));
                m33486e20 = i26;
                int i27 = m33486e21;
                if (m33488b.getInt(i27) != 0) {
                    m33486e21 = i27;
                    i12 = m33486e22;
                    z11 = true;
                } else {
                    m33486e21 = i27;
                    i12 = m33486e22;
                    z11 = false;
                }
                if (m33488b.getInt(i12) != 0) {
                    m33486e22 = i12;
                    i13 = m33486e23;
                    z12 = true;
                } else {
                    m33486e22 = i12;
                    i13 = m33486e23;
                    z12 = false;
                }
                if (m33488b.getInt(i13) != 0) {
                    m33486e23 = i13;
                    i14 = m33486e24;
                    z13 = true;
                } else {
                    m33486e23 = i13;
                    i14 = m33486e24;
                    z13 = false;
                }
                if (m33488b.getInt(i14) != 0) {
                    m33486e24 = i14;
                    i15 = m33486e25;
                    z14 = true;
                } else {
                    m33486e24 = i14;
                    i15 = m33486e25;
                    z14 = false;
                }
                long j17 = m33488b.getLong(i15);
                m33486e25 = i15;
                int i28 = m33486e26;
                long j18 = m33488b.getLong(i28);
                m33486e26 = i28;
                int i29 = m33486e27;
                m33486e27 = i29;
                arrayList.add(new C9132u(string, m26848f, string2, string3, m8529g, m8529g2, j10, j11, j12, new C7269b(m26846d, z11, z12, z13, z14, j17, j18, C9113b0.m26844b(m33488b.isNull(i29) ? null : m33488b.getBlob(i29))), i17, m26845c, j13, j14, j15, j16, z10, m26847e, i23, i25));
                m33486e = i19;
                i16 = i18;
            }
            m33488b.close();
            c10607x.m32303i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m33488b.close();
            c10607x.m32303i();
            throw th;
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: q */
    public void mo26918q(String str, C1522b c1522b) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22040g.m32172b();
        byte[] m8530o = C1522b.m8530o(c1522b);
        if (m8530o == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32160O0(1, m8530o);
        }
        if (str == null) {
            m32172b.mo32161g1(2);
        } else {
            m32172b.mo32163x0(2, str);
        }
        this.f22034a.m32253e();
        try {
            m32172b.mo32164z();
            this.f22034a.m32250B();
        } finally {
            this.f22034a.m32255i();
            this.f22040g.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: r */
    public List<C9132u> mo26919r() {
        C10607x c10607x;
        int m33486e;
        int m33486e2;
        int m33486e3;
        int m33486e4;
        int m33486e5;
        int m33486e6;
        int m33486e7;
        int m33486e8;
        int m33486e9;
        int m33486e10;
        int m33486e11;
        int m33486e12;
        int m33486e13;
        int m33486e14;
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
        C10607x m32298e = C10607x.m32298e("SELECT * FROM workspec WHERE state=1", 0);
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            m33486e = C10972a.m33486e(m33488b, FacebookMediationAdapter.KEY_ID);
            m33486e2 = C10972a.m33486e(m33488b, "state");
            m33486e3 = C10972a.m33486e(m33488b, "worker_class_name");
            m33486e4 = C10972a.m33486e(m33488b, "input_merger_class_name");
            m33486e5 = C10972a.m33486e(m33488b, "input");
            m33486e6 = C10972a.m33486e(m33488b, "output");
            m33486e7 = C10972a.m33486e(m33488b, "initial_delay");
            m33486e8 = C10972a.m33486e(m33488b, "interval_duration");
            m33486e9 = C10972a.m33486e(m33488b, "flex_duration");
            m33486e10 = C10972a.m33486e(m33488b, "run_attempt_count");
            m33486e11 = C10972a.m33486e(m33488b, "backoff_policy");
            m33486e12 = C10972a.m33486e(m33488b, "backoff_delay_duration");
            m33486e13 = C10972a.m33486e(m33488b, "last_enqueue_time");
            m33486e14 = C10972a.m33486e(m33488b, "minimum_retention_duration");
            c10607x = m32298e;
        } catch (Throwable th2) {
            th = th2;
            c10607x = m32298e;
        }
        try {
            int m33486e15 = C10972a.m33486e(m33488b, "schedule_requested_at");
            int m33486e16 = C10972a.m33486e(m33488b, "run_in_foreground");
            int m33486e17 = C10972a.m33486e(m33488b, "out_of_quota_policy");
            int m33486e18 = C10972a.m33486e(m33488b, "period_count");
            int m33486e19 = C10972a.m33486e(m33488b, "generation");
            int m33486e20 = C10972a.m33486e(m33488b, "required_network_type");
            int m33486e21 = C10972a.m33486e(m33488b, "requires_charging");
            int m33486e22 = C10972a.m33486e(m33488b, "requires_device_idle");
            int m33486e23 = C10972a.m33486e(m33488b, "requires_battery_not_low");
            int m33486e24 = C10972a.m33486e(m33488b, "requires_storage_not_low");
            int m33486e25 = C10972a.m33486e(m33488b, "trigger_content_update_delay");
            int m33486e26 = C10972a.m33486e(m33488b, "trigger_max_content_delay");
            int m33486e27 = C10972a.m33486e(m33488b, "content_uri_triggers");
            int i15 = m33486e14;
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                String string = m33488b.isNull(m33486e) ? null : m33488b.getString(m33486e);
                C7286s.a m26848f = C9113b0.m26848f(m33488b.getInt(m33486e2));
                String string2 = m33488b.isNull(m33486e3) ? null : m33488b.getString(m33486e3);
                String string3 = m33488b.isNull(m33486e4) ? null : m33488b.getString(m33486e4);
                C1522b m8529g = C1522b.m8529g(m33488b.isNull(m33486e5) ? null : m33488b.getBlob(m33486e5));
                C1522b m8529g2 = C1522b.m8529g(m33488b.isNull(m33486e6) ? null : m33488b.getBlob(m33486e6));
                long j10 = m33488b.getLong(m33486e7);
                long j11 = m33488b.getLong(m33486e8);
                long j12 = m33488b.getLong(m33486e9);
                int i16 = m33488b.getInt(m33486e10);
                EnumC7268a m26845c = C9113b0.m26845c(m33488b.getInt(m33486e11));
                long j13 = m33488b.getLong(m33486e12);
                long j14 = m33488b.getLong(m33486e13);
                int i17 = i15;
                long j15 = m33488b.getLong(i17);
                int i18 = m33486e;
                int i19 = m33486e15;
                long j16 = m33488b.getLong(i19);
                m33486e15 = i19;
                int i20 = m33486e16;
                if (m33488b.getInt(i20) != 0) {
                    m33486e16 = i20;
                    i10 = m33486e17;
                    z10 = true;
                } else {
                    m33486e16 = i20;
                    i10 = m33486e17;
                    z10 = false;
                }
                EnumC7281n m26847e = C9113b0.m26847e(m33488b.getInt(i10));
                m33486e17 = i10;
                int i21 = m33486e18;
                int i22 = m33488b.getInt(i21);
                m33486e18 = i21;
                int i23 = m33486e19;
                int i24 = m33488b.getInt(i23);
                m33486e19 = i23;
                int i25 = m33486e20;
                EnumC7278k m26846d = C9113b0.m26846d(m33488b.getInt(i25));
                m33486e20 = i25;
                int i26 = m33486e21;
                if (m33488b.getInt(i26) != 0) {
                    m33486e21 = i26;
                    i11 = m33486e22;
                    z11 = true;
                } else {
                    m33486e21 = i26;
                    i11 = m33486e22;
                    z11 = false;
                }
                if (m33488b.getInt(i11) != 0) {
                    m33486e22 = i11;
                    i12 = m33486e23;
                    z12 = true;
                } else {
                    m33486e22 = i11;
                    i12 = m33486e23;
                    z12 = false;
                }
                if (m33488b.getInt(i12) != 0) {
                    m33486e23 = i12;
                    i13 = m33486e24;
                    z13 = true;
                } else {
                    m33486e23 = i12;
                    i13 = m33486e24;
                    z13 = false;
                }
                if (m33488b.getInt(i13) != 0) {
                    m33486e24 = i13;
                    i14 = m33486e25;
                    z14 = true;
                } else {
                    m33486e24 = i13;
                    i14 = m33486e25;
                    z14 = false;
                }
                long j17 = m33488b.getLong(i14);
                m33486e25 = i14;
                int i27 = m33486e26;
                long j18 = m33488b.getLong(i27);
                m33486e26 = i27;
                int i28 = m33486e27;
                m33486e27 = i28;
                arrayList.add(new C9132u(string, m26848f, string2, string3, m8529g, m8529g2, j10, j11, j12, new C7269b(m26846d, z11, z12, z13, z14, j17, j18, C9113b0.m26844b(m33488b.isNull(i28) ? null : m33488b.getBlob(i28))), i16, m26845c, j13, j14, j15, j16, z10, m26847e, i22, i24));
                m33486e = i18;
                i15 = i17;
            }
            m33488b.close();
            c10607x.m32303i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m33488b.close();
            c10607x.m32303i();
            throw th;
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: s */
    public LiveData<List<C9132u.c>> mo26920s(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        return this.f22034a.m32257l().m32196d(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new e(m32298e));
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: t */
    public boolean mo26921t() {
        boolean z10 = false;
        C10607x m32298e = C10607x.m32298e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f22034a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f22034a, m32298e, false, null);
        try {
            if (m33488b.moveToFirst()) {
                if (m33488b.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: u */
    public int mo26922u(String str) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22043j.m32172b();
        if (str == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32163x0(1, str);
        }
        this.f22034a.m32253e();
        try {
            int mo32164z = m32172b.mo32164z();
            this.f22034a.m32250B();
            return mo32164z;
        } finally {
            this.f22034a.m32255i();
            this.f22043j.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: v */
    public void mo26923v(C9132u c9132u) {
        this.f22034a.m32252d();
        this.f22034a.m32253e();
        try {
            this.f22035b.m32181j(c9132u);
            this.f22034a.m32250B();
        } finally {
            this.f22034a.m32255i();
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: w */
    public int mo26924w(C7286s.a aVar, String str) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22038e.m32172b();
        m32172b.mo32159M0(1, C9113b0.m26852j(aVar));
        if (str == null) {
            m32172b.mo32161g1(2);
        } else {
            m32172b.mo32163x0(2, str);
        }
        this.f22034a.m32253e();
        try {
            int mo32164z = m32172b.mo32164z();
            this.f22034a.m32250B();
            return mo32164z;
        } finally {
            this.f22034a.m32255i();
            this.f22038e.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9133v
    /* renamed from: x */
    public int mo26925x(String str) {
        this.f22034a.m32252d();
        InterfaceC11614m m32172b = this.f22042i.m32172b();
        if (str == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32163x0(1, str);
        }
        this.f22034a.m32253e();
        try {
            int mo32164z = m32172b.mo32164z();
            this.f22034a.m32250B();
            return mo32164z;
        } finally {
            this.f22034a.m32255i();
            this.f22042i.m32174h(m32172b);
        }
    }
}
