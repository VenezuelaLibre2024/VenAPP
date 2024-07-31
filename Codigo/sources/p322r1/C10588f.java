package p322r1;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C9322n;
import p322r1.AbstractC10604u;
import p344s1.InterfaceC10766a;
import p391v1.InterfaceC11611j;

/* renamed from: r1.f */
/* loaded from: classes.dex */
public class C10588f {

    /* renamed from: a */
    public final Context f26671a;

    /* renamed from: b */
    public final String f26672b;

    /* renamed from: c */
    public final InterfaceC11611j.c f26673c;

    /* renamed from: d */
    public final AbstractC10604u.e f26674d;

    /* renamed from: e */
    public final List<AbstractC10604u.b> f26675e;

    /* renamed from: f */
    public final boolean f26676f;

    /* renamed from: g */
    public final AbstractC10604u.d f26677g;

    /* renamed from: h */
    public final Executor f26678h;

    /* renamed from: i */
    public final Executor f26679i;

    /* renamed from: j */
    public final Intent f26680j;

    /* renamed from: k */
    public final boolean f26681k;

    /* renamed from: l */
    public final boolean f26682l;

    /* renamed from: m */
    private final Set<Integer> f26683m;

    /* renamed from: n */
    public final String f26684n;

    /* renamed from: o */
    public final File f26685o;

    /* renamed from: p */
    public final Callable<InputStream> f26686p;

    /* renamed from: q */
    public final List<Object> f26687q;

    /* renamed from: r */
    public final List<InterfaceC10766a> f26688r;

    /* renamed from: s */
    public final boolean f26689s;

    /* JADX WARN: Multi-variable type inference failed */
    public C10588f(Context context, String str, InterfaceC11611j.c sqliteOpenHelperFactory, AbstractC10604u.e migrationContainer, List<? extends AbstractC10604u.b> list, boolean z10, AbstractC10604u.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, AbstractC10604u.f fVar, List<? extends Object> typeConverters, List<? extends InterfaceC10766a> autoMigrationSpecs) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        C9322n.m27781e(migrationContainer, "migrationContainer");
        C9322n.m27781e(journalMode, "journalMode");
        C9322n.m27781e(queryExecutor, "queryExecutor");
        C9322n.m27781e(transactionExecutor, "transactionExecutor");
        C9322n.m27781e(typeConverters, "typeConverters");
        C9322n.m27781e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f26671a = context;
        this.f26672b = str;
        this.f26673c = sqliteOpenHelperFactory;
        this.f26674d = migrationContainer;
        this.f26675e = list;
        this.f26676f = z10;
        this.f26677g = journalMode;
        this.f26678h = queryExecutor;
        this.f26679i = transactionExecutor;
        this.f26680j = intent;
        this.f26681k = z11;
        this.f26682l = z12;
        this.f26683m = set;
        this.f26684n = str2;
        this.f26685o = file;
        this.f26686p = callable;
        this.f26687q = typeConverters;
        this.f26688r = autoMigrationSpecs;
        this.f26689s = intent != null;
    }

    /* renamed from: a */
    public boolean m32177a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f26682l) {
            return false;
        }
        return this.f26681k && ((set = this.f26683m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
