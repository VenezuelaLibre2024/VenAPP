package r1;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import r1.u;
import v1.j;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    public final Context f24557a;

    /* renamed from: b */
    public final String f24558b;

    /* renamed from: c */
    public final j.c f24559c;

    /* renamed from: d */
    public final u.e f24560d;

    /* renamed from: e */
    public final List<u.b> f24561e;

    /* renamed from: f */
    public final boolean f24562f;

    /* renamed from: g */
    public final u.d f24563g;

    /* renamed from: h */
    public final Executor f24564h;

    /* renamed from: i */
    public final Executor f24565i;

    /* renamed from: j */
    public final Intent f24566j;

    /* renamed from: k */
    public final boolean f24567k;

    /* renamed from: l */
    public final boolean f24568l;

    /* renamed from: m */
    private final Set<Integer> f24569m;

    /* renamed from: n */
    public final String f24570n;

    /* renamed from: o */
    public final File f24571o;

    /* renamed from: p */
    public final Callable<InputStream> f24572p;

    /* renamed from: q */
    public final List<Object> f24573q;

    /* renamed from: r */
    public final List<s1.a> f24574r;

    /* renamed from: s */
    public final boolean f24575s;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, String str, j.c sqliteOpenHelperFactory, u.e migrationContainer, List<? extends u.b> list, boolean z10, u.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, u.f fVar, List<? extends Object> typeConverters, List<? extends s1.a> autoMigrationSpecs) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.n.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.n.e(journalMode, "journalMode");
        kotlin.jvm.internal.n.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.n.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.n.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.n.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f24557a = context;
        this.f24558b = str;
        this.f24559c = sqliteOpenHelperFactory;
        this.f24560d = migrationContainer;
        this.f24561e = list;
        this.f24562f = z10;
        this.f24563g = journalMode;
        this.f24564h = queryExecutor;
        this.f24565i = transactionExecutor;
        this.f24566j = intent;
        this.f24567k = z11;
        this.f24568l = z12;
        this.f24569m = set;
        this.f24570n = str2;
        this.f24571o = file;
        this.f24572p = callable;
        this.f24573q = typeConverters;
        this.f24574r = autoMigrationSpecs;
        this.f24575s = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f24568l) {
            return false;
        }
        return this.f24567k && ((set = this.f24569m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
