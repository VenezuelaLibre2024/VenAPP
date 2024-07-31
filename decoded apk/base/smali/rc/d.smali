.class public Lrc/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lee/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/a<",
            "Lcc/a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile b:Ltc/a;

.field private volatile c:Luc/b;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Luc/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lee/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/a<",
            "Lcc/a;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Luc/c;

    invoke-direct {v0}, Luc/c;-><init>()V

    new-instance v1, Ltc/f;

    invoke-direct {v1}, Ltc/f;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lrc/d;-><init>(Lee/a;Luc/b;Ltc/a;)V

    return-void
.end method

.method public constructor <init>(Lee/a;Luc/b;Ltc/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/a<",
            "Lcc/a;",
            ">;",
            "Luc/b;",
            "Ltc/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/d;->a:Lee/a;

    iput-object p2, p0, Lrc/d;->c:Luc/b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lrc/d;->d:Ljava/util/List;

    iput-object p3, p0, Lrc/d;->b:Ltc/a;

    invoke-direct {p0}, Lrc/d;->f()V

    return-void
.end method

.method public static synthetic a(Lrc/d;Lee/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lrc/d;->i(Lee/b;)V

    return-void
.end method

.method public static synthetic b(Lrc/d;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lrc/d;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Lrc/d;Luc/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lrc/d;->h(Luc/a;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lrc/d;->a:Lee/a;

    new-instance v1, Lrc/c;

    invoke-direct {v1, p0}, Lrc/c;-><init>(Lrc/d;)V

    invoke-interface {v0, v1}, Lee/a;->a(Lee/a$a;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lrc/d;->b:Ltc/a;

    invoke-interface {v0, p1, p2}, Ltc/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private synthetic h(Luc/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lrc/d;->c:Luc/b;

    instance-of v0, v0, Luc/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrc/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lrc/d;->c:Luc/b;

    invoke-interface {v0, p1}, Luc/b;->a(Luc/a;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic i(Lee/b;)V
    .locals 5

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v1, "AnalyticsConnector now available."

    invoke-virtual {v0, v1}, Lsc/g;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Lee/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcc/a;

    new-instance v0, Ltc/e;

    invoke-direct {v0, p1}, Ltc/e;-><init>(Lcc/a;)V

    new-instance v1, Lrc/e;

    invoke-direct {v1}, Lrc/e;-><init>()V

    invoke-static {p1, v1}, Lrc/d;->j(Lcc/a;Lrc/e;)Lcc/a$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p1

    const-string v2, "Registered Firebase Analytics listener."

    invoke-virtual {p1, v2}, Lsc/g;->b(Ljava/lang/String;)V

    new-instance p1, Ltc/d;

    invoke-direct {p1}, Ltc/d;-><init>()V

    new-instance v2, Ltc/c;

    const/16 v3, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v0, v3, v4}, Ltc/c;-><init>(Ltc/e;ILjava/util/concurrent/TimeUnit;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lrc/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luc/a;

    invoke-virtual {p1, v3}, Ltc/d;->a(Luc/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Lrc/e;->d(Ltc/b;)V

    invoke-virtual {v1, v2}, Lrc/e;->e(Ltc/b;)V

    iput-object p1, p0, Lrc/d;->c:Luc/b;

    iput-object v2, p0, Lrc/d;->b:Ltc/a;

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p1

    const-string v0, "Could not register Firebase Analytics listener; a listener is already registered."

    invoke-virtual {p1, v0}, Lsc/g;->k(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private static j(Lcc/a;Lrc/e;)Lcc/a$a;
    .locals 2

    const-string v0, "clx"

    invoke-interface {p0, v0, p1}, Lcc/a;->b(Ljava/lang/String;Lcc/a$b;)Lcc/a$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    invoke-virtual {v0, v1}, Lsc/g;->b(Ljava/lang/String;)V

    const-string v0, "crash"

    invoke-interface {p0, v0, p1}, Lcc/a;->b(Ljava/lang/String;Lcc/a$b;)Lcc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p0

    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    invoke-virtual {p0, p1}, Lsc/g;->k(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public d()Ltc/a;
    .locals 1

    new-instance v0, Lrc/b;

    invoke-direct {v0, p0}, Lrc/b;-><init>(Lrc/d;)V

    return-object v0
.end method

.method public e()Luc/b;
    .locals 1

    new-instance v0, Lrc/a;

    invoke-direct {v0, p0}, Lrc/a;-><init>(Lrc/d;)V

    return-object v0
.end method
