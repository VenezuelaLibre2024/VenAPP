.class public Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lec/e;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->b(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lec/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lec/e;
    .locals 8

    new-instance v7, Lhc/j;

    const-class v0, Lzb/g;

    invoke-interface {p4, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzb/g;

    const-class v0, Lod/i;

    invoke-interface {p4, v0}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v2

    invoke-interface {p4, p0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p2}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p3}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lhc/j;-><init>(Lzb/g;Lee/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v7
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Ldc/d;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    const-class v2, Ldc/c;

    invoke-static {v2, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v2

    const-class v3, Ldc/a;

    invoke-static {v3, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v1

    const-class v3, Ldc/b;

    const-class v4, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v3, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Lpc/c;

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Class;

    const-class v7, Ljc/b;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    const-class v7, Lec/e;

    invoke-static {v7, v6}, Lpc/c;->d(Ljava/lang/Class;[Ljava/lang/Class;)Lpc/c$b;

    move-result-object v6

    const-string v7, "fire-app-check"

    invoke-virtual {v6, v7}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v6

    const-class v9, Lzb/g;

    invoke-static {v9}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v9

    invoke-virtual {v6, v9}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v6

    invoke-static {v0}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v9

    invoke-virtual {v6, v9}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v6

    invoke-static {v2}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v9

    invoke-virtual {v6, v9}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v6

    invoke-static {v1}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v9

    invoke-virtual {v6, v9}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v6

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v9

    invoke-virtual {v6, v9}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v6

    const-class v9, Lod/i;

    invoke-static {v9}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v9

    invoke-virtual {v6, v9}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v6

    new-instance v9, Lec/f;

    invoke-direct {v9, v0, v2, v1, v3}, Lec/f;-><init>(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;)V

    invoke-virtual {v6, v9}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->c()Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    aput-object v0, v4, v8

    invoke-static {}, Lod/h;->a()Lpc/c;

    move-result-object v0

    aput-object v0, v4, v5

    const-string v0, "17.1.1"

    invoke-static {v7, v0}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
