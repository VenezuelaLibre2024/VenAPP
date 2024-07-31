.class public Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fiam"


# instance fields
.field private backgroundExecutor:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private blockingExecutor:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private legacyTransportFactory:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Lf6/g;",
            ">;"
        }
    .end annotation
.end field

.field private lightWeightExecutor:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ldc/a;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->backgroundExecutor:Lpc/e0;

    const-class v0, Ldc/b;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:Lpc/e0;

    const-class v0, Ldc/c;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->lightWeightExecutor:Lpc/e0;

    const-class v0, Led/a;

    const-class v1, Lf6/g;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->legacyTransportFactory:Lpc/e0;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;Lpc/d;)Lqd/q;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->providesFirebaseInAppMessaging(Lpc/d;)Lqd/q;

    move-result-object p0

    return-object p0
.end method

.method private providesFirebaseInAppMessaging(Lpc/d;)Lqd/q;
    .locals 7

    const-class v0, Lzb/g;

    invoke-interface {p1, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb/g;

    const-class v1, Lfe/f;

    invoke-interface {p1, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfe/f;

    const-class v2, Lcc/a;

    invoke-interface {p1, v2}, Lpc/d;->h(Ljava/lang/Class;)Lee/a;

    move-result-object v2

    const-class v3, Lnd/d;

    invoke-interface {p1, v3}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnd/d;

    invoke-virtual {v0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v4

    check-cast v4, Landroid/app/Application;

    invoke-static {}, Lae/c;->a()Lae/c$b;

    move-result-object v5

    new-instance v6, Lbe/n;

    invoke-direct {v6, v4}, Lbe/n;-><init>(Landroid/app/Application;)V

    invoke-virtual {v5, v6}, Lae/c$b;->c(Lbe/n;)Lae/c$b;

    move-result-object v4

    new-instance v5, Lbe/k;

    invoke-direct {v5, v2, v3}, Lbe/k;-><init>(Lee/a;Lnd/d;)V

    invoke-virtual {v4, v5}, Lae/c$b;->b(Lbe/k;)Lae/c$b;

    move-result-object v2

    new-instance v3, Lbe/a;

    invoke-direct {v3}, Lbe/a;-><init>()V

    invoke-virtual {v2, v3}, Lae/c$b;->a(Lbe/a;)Lae/c$b;

    move-result-object v2

    new-instance v3, Lbe/e0;

    new-instance v4, Lzd/r2;

    invoke-direct {v4}, Lzd/r2;-><init>()V

    invoke-direct {v3, v4}, Lbe/e0;-><init>(Lzd/r2;)V

    invoke-virtual {v2, v3}, Lae/c$b;->f(Lbe/e0;)Lae/c$b;

    move-result-object v2

    new-instance v3, Lbe/q;

    iget-object v4, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->lightWeightExecutor:Lpc/e0;

    invoke-interface {p1, v4}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/Executor;

    iget-object v5, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->backgroundExecutor:Lpc/e0;

    invoke-interface {p1, v5}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v6, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:Lpc/e0;

    invoke-interface {p1, v6}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-direct {v3, v4, v5, v6}, Lbe/q;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v2, v3}, Lae/c$b;->e(Lbe/q;)Lae/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lae/c$b;->d()Lae/d;

    move-result-object v2

    invoke-static {}, Lae/b;->a()Lae/a$a;

    move-result-object v3

    new-instance v4, Lzd/b;

    const-class v5, Lcom/google/firebase/abt/component/a;

    invoke-interface {p1, v5}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/firebase/abt/component/a;

    const-string v6, "fiam"

    invoke-virtual {v5, v6}, Lcom/google/firebase/abt/component/a;->b(Ljava/lang/String;)Lac/c;

    move-result-object v5

    iget-object v6, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:Lpc/e0;

    invoke-interface {p1, v6}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-direct {v4, v5, v6}, Lzd/b;-><init>(Lac/c;Ljava/util/concurrent/Executor;)V

    invoke-interface {v3, v4}, Lae/a$a;->c(Lzd/b;)Lae/a$a;

    move-result-object v3

    new-instance v4, Lbe/d;

    invoke-interface {v2}, Lae/d;->g()Lce/a;

    move-result-object v5

    invoke-direct {v4, v0, v1, v5}, Lbe/d;-><init>(Lzb/g;Lfe/f;Lce/a;)V

    invoke-interface {v3, v4}, Lae/a$a;->d(Lbe/d;)Lae/a$a;

    move-result-object v1

    new-instance v3, Lbe/z;

    invoke-direct {v3, v0}, Lbe/z;-><init>(Lzb/g;)V

    invoke-interface {v1, v3}, Lae/a$a;->b(Lbe/z;)Lae/a$a;

    move-result-object v0

    invoke-interface {v0, v2}, Lae/a$a;->a(Lae/d;)Lae/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->legacyTransportFactory:Lpc/e0;

    invoke-interface {p1, v1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf6/g;

    invoke-interface {v0, p1}, Lae/a$a;->e(Lf6/g;)Lae/a$a;

    move-result-object p1

    invoke-interface {p1}, Lae/a$a;->build()Lae/a;

    move-result-object p1

    invoke-interface {p1}, Lae/a;->a()Lqd/q;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
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

    const/4 v0, 0x2

    new-array v0, v0, [Lpc/c;

    const-class v1, Lqd/q;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v2, "fire-fiam"

    invoke-virtual {v1, v2}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lfe/f;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lzb/g;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lcom/google/firebase/abt/component/a;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lcc/a;

    invoke-static {v3}, Lpc/q;->a(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->legacyTransportFactory:Lpc/e0;

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lnd/d;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->backgroundExecutor:Lpc/e0;

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:Lpc/e0;

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->lightWeightExecutor:Lpc/e0;

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v3, Lqd/w;

    invoke-direct {v3, p0}, Lqd/w;-><init>(Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;)V

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->e()Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "20.4.0"

    invoke-static {v2, v1}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
