.class public Lcom/google/firebase/perf/FirebasePerfRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final EARLY_LIBRARY_NAME:Ljava/lang/String; = "fire-perf-early"

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-perf"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/d;)Loe/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->providesFirebasePerformance(Lpc/d;)Loe/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lpc/e0;Lpc/d;)Loe/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->lambda$getComponents$0(Lpc/e0;Lpc/d;)Loe/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lpc/e0;Lpc/d;)Loe/b;
    .locals 3

    new-instance v0, Loe/b;

    const-class v1, Lzb/g;

    invoke-interface {p1, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzb/g;

    const-class v2, Lzb/r;

    invoke-interface {p1, v2}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v2

    invoke-interface {v2}, Lee/b;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzb/r;

    invoke-interface {p1, p0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, p0}, Loe/b;-><init>(Lzb/g;Lzb/r;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method private static providesFirebasePerformance(Lpc/d;)Loe/e;
    .locals 6

    const-class v0, Loe/b;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    invoke-static {}, Lpe/a;->b()Lpe/a$b;

    move-result-object v0

    new-instance v1, Lqe/a;

    const-class v2, Lzb/g;

    invoke-interface {p0, v2}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzb/g;

    const-class v3, Lfe/f;

    invoke-interface {p0, v3}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfe/f;

    const-class v4, Lcom/google/firebase/remoteconfig/c;

    invoke-interface {p0, v4}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v4

    const-class v5, Lf6/g;

    invoke-interface {p0, v5}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object p0

    invoke-direct {v1, v2, v3, v4, p0}, Lqe/a;-><init>(Lzb/g;Lfe/f;Lee/b;Lee/b;)V

    invoke-virtual {v0, v1}, Lpe/a$b;->b(Lqe/a;)Lpe/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lpe/a$b;->a()Lpe/b;

    move-result-object p0

    invoke-interface {p0}, Lpe/b;->a()Loe/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

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

    const/4 v1, 0x3

    new-array v1, v1, [Lpc/c;

    const-class v2, Loe/e;

    invoke-static {v2}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v2

    const-string v3, "fire-perf"

    invoke-virtual {v2, v3}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v2

    const-class v4, Lzb/g;

    invoke-static {v4}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    const-class v5, Lcom/google/firebase/remoteconfig/c;

    invoke-static {v5}, Lpc/q;->l(Ljava/lang/Class;)Lpc/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    const-class v5, Lfe/f;

    invoke-static {v5}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    const-class v5, Lf6/g;

    invoke-static {v5}, Lpc/q;->l(Ljava/lang/Class;)Lpc/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    const-class v5, Loe/b;

    invoke-static {v5}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v2, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    new-instance v6, Loe/c;

    invoke-direct {v6}, Loe/c;-><init>()V

    invoke-virtual {v2, v6}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lpc/c$b;->d()Lpc/c;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v1, v6

    invoke-static {v5}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v2

    const-string v5, "fire-perf-early"

    invoke-virtual {v2, v5}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v2

    invoke-static {v4}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v4

    invoke-virtual {v2, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    const-class v4, Lzb/r;

    invoke-static {v4}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v4

    invoke-virtual {v2, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    invoke-static {v0}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v2, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lpc/c$b;->e()Lpc/c$b;

    move-result-object v2

    new-instance v4, Loe/d;

    invoke-direct {v4, v0}, Loe/d;-><init>(Lpc/e0;)V

    invoke-virtual {v2, v4}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const-string v0, "20.5.1"

    invoke-static {v3, v0}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
