.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/d;)Lfe/f;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lpc/d;)Lfe/f;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lpc/d;)Lfe/f;
    .locals 6

    new-instance v0, Lcom/google/firebase/installations/c;

    const-class v1, Lzb/g;

    invoke-interface {p0, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzb/g;

    const-class v2, Lod/i;

    invoke-interface {p0, v2}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v2

    const-class v3, Ldc/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v3

    invoke-interface {p0, v3}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, Ldc/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v4

    invoke-interface {p0, v4}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lqc/j;->c(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/installations/c;-><init>(Lzb/g;Lee/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lpc/c;

    const-class v1, Lfe/f;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v2, "fire-installations"

    invoke-virtual {v1, v2}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lzb/g;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lod/i;

    invoke-static {v3}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Ldc/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v3

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Ldc/b;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-static {v3, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v3

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v3, Lfe/g;

    invoke-direct {v3}, Lfe/g;-><init>()V

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const/4 v1, 0x1

    invoke-static {}, Lod/h;->a()Lpc/c;

    move-result-object v3

    aput-object v3, v0, v1

    const-string v1, "17.2.0"

    invoke-static {v2, v1}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
