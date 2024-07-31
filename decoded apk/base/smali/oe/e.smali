.class public Loe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final i:Lre/a;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/firebase/perf/config/a;

.field private final c:Lcom/google/firebase/perf/util/f;

.field private d:Ljava/lang/Boolean;

.field private final e:Lzb/g;

.field private final f:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lfe/f;

.field private final h:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lf6/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lre/a;->e()Lre/a;

    move-result-object v0

    sput-object v0, Loe/e;->i:Lre/a;

    return-void
.end method

.method constructor <init>(Lzb/g;Lee/b;Lfe/f;Lee/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;",
            "Lfe/f;",
            "Lee/b<",
            "Lf6/g;",
            ">;",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            "Lcom/google/firebase/perf/config/a;",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Loe/e;->a:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Loe/e;->d:Ljava/lang/Boolean;

    iput-object p1, p0, Loe/e;->e:Lzb/g;

    iput-object p2, p0, Loe/e;->f:Lee/b;

    iput-object p3, p0, Loe/e;->g:Lfe/f;

    iput-object p4, p0, Loe/e;->h:Lee/b;

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Loe/e;->d:Ljava/lang/Boolean;

    iput-object p6, p0, Loe/e;->b:Lcom/google/firebase/perf/config/a;

    new-instance p1, Lcom/google/firebase/perf/util/f;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p1, p2}, Lcom/google/firebase/perf/util/f;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, Loe/e;->c:Lcom/google/firebase/perf/util/f;

    return-void

    :cond_0
    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p4}, Lwe/k;->r(Lzb/g;Lfe/f;Lee/b;)V

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Loe/e;->a(Landroid/content/Context;)Lcom/google/firebase/perf/util/f;

    move-result-object p4

    iput-object p4, p0, Loe/e;->c:Lcom/google/firebase/perf/util/f;

    invoke-virtual {p5, p2}, Lcom/google/firebase/perf/config/RemoteConfigManager;->setFirebaseRemoteConfigProvider(Lee/b;)V

    iput-object p6, p0, Loe/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {p6, p4}, Lcom/google/firebase/perf/config/a;->Q(Lcom/google/firebase/perf/util/f;)V

    invoke-virtual {p6, p3}, Lcom/google/firebase/perf/config/a;->O(Landroid/content/Context;)V

    invoke-virtual {p7, p3}, Lcom/google/firebase/perf/session/SessionManager;->setApplicationContext(Landroid/content/Context;)V

    invoke-virtual {p6}, Lcom/google/firebase/perf/config/a;->j()Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Loe/e;->d:Ljava/lang/Boolean;

    sget-object p2, Loe/e;->i:Lre/a;

    invoke-virtual {p2}, Lre/a;->h()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Loe/e;->d()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    new-array p4, p4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lzb/g;->r()Lzb/p;

    move-result-object p1

    invoke-virtual {p1}, Lzb/p;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lre/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    aput-object p1, p4, p3

    const-string p1, "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s"

    invoke-static {p1, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lre/a;->f(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private static a(Landroid/content/Context;)Lcom/google/firebase/perf/util/f;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No perf enable meta data found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "isEnabled"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    :goto_1
    new-instance v0, Lcom/google/firebase/perf/util/f;

    if-eqz p0, :cond_0

    invoke-direct {v0, p0}, Lcom/google/firebase/perf/util/f;-><init>(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_0
    invoke-direct {v0}, Lcom/google/firebase/perf/util/f;-><init>()V

    :goto_2
    return-object v0
.end method

.method public static c()Loe/e;
    .locals 2

    invoke-static {}, Lzb/g;->o()Lzb/g;

    move-result-object v0

    const-class v1, Loe/e;

    invoke-virtual {v0, v1}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loe/e;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Loe/e;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Loe/e;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lzb/g;->o()Lzb/g;

    move-result-object v0

    invoke-virtual {v0}, Lzb/g;->x()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Lse/g;
    .locals 3

    new-instance v0, Lse/g;

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/perf/util/l;

    invoke-direct {v2}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-direct {v0, p1, p2, v1, v2}, Lse/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lwe/k;Lcom/google/firebase/perf/util/l;)V

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/perf/metrics/Trace;->c(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized g(Ljava/lang/Boolean;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lzb/g;->o()Lzb/g;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Loe/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->i()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Loe/e;->i:Lre/a;

    const-string v0, "Firebase Performance is permanently disabled"

    invoke-virtual {p1, v0}, Lre/a;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_2
    iget-object v0, p0, Loe/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/config/a;->P(Ljava/lang/Boolean;)V

    if-eqz p1, :cond_1

    :goto_0
    iput-object p1, p0, Loe/e;->d:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Loe/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {p1}, Lcom/google/firebase/perf/config/a;->j()Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v0, p0, Loe/e;->d:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Loe/e;->i:Lre/a;

    const-string v0, "Firebase Performance is Enabled"

    :goto_2
    invoke-virtual {p1, v0}, Lre/a;->f(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v0, p0, Loe/e;->d:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Loe/e;->i:Lre/a;

    const-string v0, "Firebase Performance is Disabled"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :cond_3
    :goto_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :catch_0
    monitor-exit p0

    return-void
.end method
