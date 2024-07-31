package androidx.work.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r1.u;
import r1.w;
import t1.e;
import v1.j;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q, reason: collision with root package name */
    private volatile k2.v f5721q;

    /* renamed from: r, reason: collision with root package name */
    private volatile k2.b f5722r;

    /* renamed from: s, reason: collision with root package name */
    private volatile k2.z f5723s;

    /* renamed from: t, reason: collision with root package name */
    private volatile k2.j f5724t;

    /* renamed from: u, reason: collision with root package name */
    private volatile k2.o f5725u;

    /* renamed from: v, reason: collision with root package name */
    private volatile k2.r f5726v;

    /* renamed from: w, reason: collision with root package name */
    private volatile k2.e f5727w;

    /* loaded from: classes.dex */
    class a extends w.b {
        a(int i10) {
            super(i10);
        }

        @Override // r1.w.b
        public void a(v1.i iVar) {
            iVar.x("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.x("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            iVar.x("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            iVar.x("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            iVar.x("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            iVar.x("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            iVar.x("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.x("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            iVar.x("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.x("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.x("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            iVar.x("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.x("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            iVar.x("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            iVar.x("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // r1.w.b
        public void b(v1.i iVar) {
            iVar.x("DROP TABLE IF EXISTS `Dependency`");
            iVar.x("DROP TABLE IF EXISTS `WorkSpec`");
            iVar.x("DROP TABLE IF EXISTS `WorkTag`");
            iVar.x("DROP TABLE IF EXISTS `SystemIdInfo`");
            iVar.x("DROP TABLE IF EXISTS `WorkName`");
            iVar.x("DROP TABLE IF EXISTS `WorkProgress`");
            iVar.x("DROP TABLE IF EXISTS `Preference`");
            if (((r1.u) WorkDatabase_Impl.this).f24644h != null) {
                int size = ((r1.u) WorkDatabase_Impl.this).f24644h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) ((r1.u) WorkDatabase_Impl.this).f24644h.get(i10)).b(iVar);
                }
            }
        }

        @Override // r1.w.b
        public void c(v1.i iVar) {
            if (((r1.u) WorkDatabase_Impl.this).f24644h != null) {
                int size = ((r1.u) WorkDatabase_Impl.this).f24644h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) ((r1.u) WorkDatabase_Impl.this).f24644h.get(i10)).a(iVar);
                }
            }
        }

        @Override // r1.w.b
        public void d(v1.i iVar) {
            ((r1.u) WorkDatabase_Impl.this).f24637a = iVar;
            iVar.x("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.v(iVar);
            if (((r1.u) WorkDatabase_Impl.this).f24644h != null) {
                int size = ((r1.u) WorkDatabase_Impl.this).f24644h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) ((r1.u) WorkDatabase_Impl.this).f24644h.get(i10)).c(iVar);
                }
            }
        }

        @Override // r1.w.b
        public void e(v1.i iVar) {
        }

        @Override // r1.w.b
        public void f(v1.i iVar) {
            t1.b.a(iVar);
        }

        @Override // r1.w.b
        public w.c g(v1.i iVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new e.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.C0434e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new e.C0434e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            t1.e eVar = new t1.e("Dependency", hashMap, hashSet, hashSet2);
            t1.e a10 = t1.e.a(iVar, "Dependency");
            if (!eVar.equals(a10)) {
                return new w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put(FacebookMediationAdapter.KEY_ID, new e.a(FacebookMediationAdapter.KEY_ID, "TEXT", true, 1, null, 1));
            hashMap2.put("state", new e.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new e.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new e.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new e.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new e.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new e.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new e.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new e.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new e.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new e.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new e.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new e.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new e.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new e.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new e.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new e.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new e.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new e.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new e.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new e.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new e.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new e.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new e.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new e.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new e.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new e.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new e.C0434e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new e.C0434e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            t1.e eVar2 = new t1.e("WorkSpec", hashMap2, hashSet3, hashSet4);
            t1.e a11 = t1.e.a(iVar, "WorkSpec");
            if (!eVar2.equals(a11)) {
                return new w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new e.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.C0434e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            t1.e eVar3 = new t1.e("WorkTag", hashMap3, hashSet5, hashSet6);
            t1.e a12 = t1.e.a(iVar, "WorkTag");
            if (!eVar3.equals(a12)) {
                return new w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new e.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new e.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            t1.e eVar4 = new t1.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            t1.e a13 = t1.e.a(iVar, "SystemIdInfo");
            if (!eVar4.equals(a13)) {
                return new w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new e.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new e.C0434e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            t1.e eVar5 = new t1.e("WorkName", hashMap5, hashSet8, hashSet9);
            t1.e a14 = t1.e.a(iVar, "WorkName");
            if (!eVar5.equals(a14)) {
                return new w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new e.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            t1.e eVar6 = new t1.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            t1.e a15 = t1.e.a(iVar, "WorkProgress");
            if (!eVar6.equals(a15)) {
                return new w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(Constants.KEY, new e.a(Constants.KEY, "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new e.a("long_value", "INTEGER", false, 0, null, 1));
            t1.e eVar7 = new t1.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
            t1.e a16 = t1.e.a(iVar, "Preference");
            if (eVar7.equals(a16)) {
                return new w.c(true, null);
            }
            return new w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a16);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public k2.b E() {
        k2.b bVar;
        if (this.f5722r != null) {
            return this.f5722r;
        }
        synchronized (this) {
            if (this.f5722r == null) {
                this.f5722r = new k2.c(this);
            }
            bVar = this.f5722r;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k2.e F() {
        k2.e eVar;
        if (this.f5727w != null) {
            return this.f5727w;
        }
        synchronized (this) {
            if (this.f5727w == null) {
                this.f5727w = new k2.f(this);
            }
            eVar = this.f5727w;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k2.j G() {
        k2.j jVar;
        if (this.f5724t != null) {
            return this.f5724t;
        }
        synchronized (this) {
            if (this.f5724t == null) {
                this.f5724t = new k2.k(this);
            }
            jVar = this.f5724t;
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k2.o H() {
        k2.o oVar;
        if (this.f5725u != null) {
            return this.f5725u;
        }
        synchronized (this) {
            if (this.f5725u == null) {
                this.f5725u = new k2.p(this);
            }
            oVar = this.f5725u;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k2.r I() {
        k2.r rVar;
        if (this.f5726v != null) {
            return this.f5726v;
        }
        synchronized (this) {
            if (this.f5726v == null) {
                this.f5726v = new k2.s(this);
            }
            rVar = this.f5726v;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k2.v J() {
        k2.v vVar;
        if (this.f5721q != null) {
            return this.f5721q;
        }
        synchronized (this) {
            if (this.f5721q == null) {
                this.f5721q = new k2.w(this);
            }
            vVar = this.f5721q;
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k2.z K() {
        k2.z zVar;
        if (this.f5723s != null) {
            return this.f5723s;
        }
        synchronized (this) {
            if (this.f5723s == null) {
                this.f5723s = new k2.a0(this);
            }
            zVar = this.f5723s;
        }
        return zVar;
    }

    @Override // r1.u
    protected r1.o g() {
        return new r1.o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // r1.u
    protected v1.j h(r1.f fVar) {
        return fVar.f24559c.a(j.b.a(fVar.f24557a).d(fVar.f24558b).c(new r1.w(fVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // r1.u
    public List<s1.b> j(Map<Class<? extends s1.a>, s1.a> map) {
        return Arrays.asList(new c0(), new d0());
    }

    @Override // r1.u
    public Set<Class<? extends s1.a>> o() {
        return new HashSet();
    }

    @Override // r1.u
    protected Map<Class<?>, List<Class<?>>> p() {
        HashMap hashMap = new HashMap();
        hashMap.put(k2.v.class, k2.w.D());
        hashMap.put(k2.b.class, k2.c.e());
        hashMap.put(k2.z.class, k2.a0.d());
        hashMap.put(k2.j.class, k2.k.h());
        hashMap.put(k2.o.class, k2.p.c());
        hashMap.put(k2.r.class, k2.s.d());
        hashMap.put(k2.e.class, k2.f.c());
        hashMap.put(k2.g.class, k2.h.a());
        return hashMap;
    }
}
