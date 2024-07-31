.class public final Lcom/facebook/appevents/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/appevents/m;

.field private static final b:Ljava/lang/String;

.field private static final c:I

.field private static volatile d:Lcom/facebook/appevents/e;

.field private static final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private static f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private static final g:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/appevents/m;

    invoke-direct {v0}, Lcom/facebook/appevents/m;-><init>()V

    sput-object v0, Lcom/facebook/appevents/m;->a:Lcom/facebook/appevents/m;

    const-class v0, Lcom/facebook/appevents/m;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/appevents/m;->b:Ljava/lang/String;

    const/16 v0, 0x64

    sput v0, Lcom/facebook/appevents/m;->c:I

    new-instance v0, Lcom/facebook/appevents/e;

    invoke-direct {v0}, Lcom/facebook/appevents/e;-><init>()V

    sput-object v0, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/facebook/appevents/m;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/facebook/appevents/h;

    invoke-direct {v0}, Lcom/facebook/appevents/h;-><init>()V

    sput-object v0, Lcom/facebook/appevents/m;->g:Ljava/lang/Runnable;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/facebook/appevents/m;->t()V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lcom/facebook/appevents/m;->o()V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/appevents/a;Lcom/facebook/appevents/d;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/appevents/m;->h(Lcom/facebook/appevents/a;Lcom/facebook/appevents/d;)V

    return-void
.end method

.method public static synthetic d(Lcom/facebook/appevents/a;Li4/i0;Lcom/facebook/appevents/j0;Lcom/facebook/appevents/g0;Li4/n0;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/facebook/appevents/m;->j(Lcom/facebook/appevents/a;Li4/i0;Lcom/facebook/appevents/j0;Lcom/facebook/appevents/g0;Li4/n0;)V

    return-void
.end method

.method public static synthetic e(Lcom/facebook/appevents/e0;)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/m;->m(Lcom/facebook/appevents/e0;)V

    return-void
.end method

.method public static synthetic f(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/appevents/m;->r(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V

    return-void
.end method

.method public static final g(Lcom/facebook/appevents/a;Lcom/facebook/appevents/d;)V
    .locals 3

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "accessTokenAppId"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appEvent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/appevents/m;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/facebook/appevents/g;

    invoke-direct {v2, p0, p1}, Lcom/facebook/appevents/g;-><init>(Lcom/facebook/appevents/a;Lcom/facebook/appevents/d;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lcom/facebook/appevents/a;Lcom/facebook/appevents/d;)V
    .locals 4

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "$accessTokenAppId"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$appEvent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;

    invoke-virtual {v1, p0, p1}, Lcom/facebook/appevents/e;->a(Lcom/facebook/appevents/a;Lcom/facebook/appevents/d;)V

    sget-object p0, Lcom/facebook/appevents/o;->b:Lcom/facebook/appevents/o$a;

    invoke-virtual {p0}, Lcom/facebook/appevents/o$a;->c()Lcom/facebook/appevents/o$b;

    move-result-object p0

    sget-object p1, Lcom/facebook/appevents/o$b;->EXPLICIT_ONLY:Lcom/facebook/appevents/o$b;

    if-eq p0, p1, :cond_1

    sget-object p0, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;

    invoke-virtual {p0}, Lcom/facebook/appevents/e;->d()I

    move-result p0

    sget p1, Lcom/facebook/appevents/m;->c:I

    if-le p0, p1, :cond_1

    sget-object p0, Lcom/facebook/appevents/e0;->EVENT_THRESHOLD:Lcom/facebook/appevents/e0;

    invoke-static {p0}, Lcom/facebook/appevents/m;->n(Lcom/facebook/appevents/e0;)V

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/facebook/appevents/m;->f:Ljava/util/concurrent/ScheduledFuture;

    if-nez p0, :cond_2

    sget-object p0, Lcom/facebook/appevents/m;->e:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object p1, Lcom/facebook/appevents/m;->g:Ljava/lang/Runnable;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xf

    invoke-interface {p0, p1, v2, v3, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    sput-object p0, Lcom/facebook/appevents/m;->f:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final i(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;ZLcom/facebook/appevents/g0;)Li4/i0;
    .locals 9

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "accessTokenAppId"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appEvents"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "flushState"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/appevents/a;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/facebook/internal/v;->q(Ljava/lang/String;Z)Lcom/facebook/internal/r;

    move-result-object v4

    sget-object v5, Li4/i0;->n:Li4/i0$c;

    sget-object v6, Lkotlin/jvm/internal/a0;->a:Lkotlin/jvm/internal/a0;

    const-string v6, "%s/activities"

    const/4 v7, 0x1

    new-array v8, v7, [Ljava/lang/Object;

    aput-object v1, v8, v3

    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "java.lang.String.format(format, *args)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v2, v1, v2, v2}, Li4/i0$c;->A(Li4/a;Ljava/lang/String;Lorg/json/JSONObject;Li4/i0$b;)Li4/i0;

    move-result-object v1

    invoke-virtual {v1, v7}, Li4/i0;->E(Z)V

    invoke-virtual {v1}, Li4/i0;->u()Landroid/os/Bundle;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_1
    const-string v6, "access_token"

    invoke-virtual {p0}, Lcom/facebook/appevents/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lcom/facebook/appevents/h0;->b:Lcom/facebook/appevents/h0$a;

    invoke-virtual {v6}, Lcom/facebook/appevents/h0$a;->d()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    const-string v7, "device_token"

    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-object v6, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v6}, Lcom/facebook/appevents/r$a;->k()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    const-string v7, "install_referrer"

    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1, v5}, Li4/i0;->H(Landroid/os/Bundle;)V

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/facebook/internal/r;->q()Z

    move-result v3

    :cond_4
    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {p1, v1, v4, v3, p2}, Lcom/facebook/appevents/j0;->e(Li4/i0;Landroid/content/Context;ZZ)I

    move-result p2

    if-nez p2, :cond_5

    return-object v2

    :cond_5
    invoke-virtual {p3}, Lcom/facebook/appevents/g0;->a()I

    move-result v3

    add-int/2addr v3, p2

    invoke-virtual {p3, v3}, Lcom/facebook/appevents/g0;->c(I)V

    new-instance p2, Lcom/facebook/appevents/i;

    invoke-direct {p2, p0, v1, p1, p3}, Lcom/facebook/appevents/i;-><init>(Lcom/facebook/appevents/a;Li4/i0;Lcom/facebook/appevents/j0;Lcom/facebook/appevents/g0;)V

    invoke-virtual {v1, p2}, Li4/i0;->D(Li4/i0$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method private static final j(Lcom/facebook/appevents/a;Li4/i0;Lcom/facebook/appevents/j0;Lcom/facebook/appevents/g0;Li4/n0;)V
    .locals 2

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "$accessTokenAppId"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$postRequest"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$appEvents"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$flushState"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "response"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p4, p2, p3}, Lcom/facebook/appevents/m;->q(Lcom/facebook/appevents/a;Li4/i0;Li4/n0;Lcom/facebook/appevents/j0;Lcom/facebook/appevents/g0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final k(Lcom/facebook/appevents/e;Lcom/facebook/appevents/g0;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/appevents/e;",
            "Lcom/facebook/appevents/g0;",
            ")",
            "Ljava/util/List<",
            "Li4/i0;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "appEventCollection"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "flushResults"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Li4/e0;->z(Landroid/content/Context;)Z

    move-result v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/appevents/e;->f()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/appevents/a;

    invoke-virtual {p0, v5}, Lcom/facebook/appevents/e;->c(Lcom/facebook/appevents/a;)Lcom/facebook/appevents/j0;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v5, v6, v1, p1}, Lcom/facebook/appevents/m;->i(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;ZLcom/facebook/appevents/g0;)Li4/i0;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v6, Lk4/d;->a:Lk4/d;

    invoke-virtual {v6}, Lk4/d;->f()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-static {v5}, Lk4/g;->l(Li4/i0;)V

    goto :goto_0

    :cond_2
    const-string p0, "Required value was null."

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    return-object v3

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final l(Lcom/facebook/appevents/e0;)V
    .locals 3

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "reason"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/appevents/m;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/facebook/appevents/j;

    invoke-direct {v2, p0}, Lcom/facebook/appevents/j;-><init>(Lcom/facebook/appevents/e0;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lcom/facebook/appevents/e0;)V
    .locals 2

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "$reason"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/facebook/appevents/m;->n(Lcom/facebook/appevents/e0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final n(Lcom/facebook/appevents/e0;)V
    .locals 4

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "reason"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/appevents/f;->a()Lcom/facebook/appevents/i0;

    move-result-object v1

    sget-object v2, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;

    invoke-virtual {v2, v1}, Lcom/facebook/appevents/e;->b(Lcom/facebook/appevents/i0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v1, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;

    invoke-static {p0, v1}, Lcom/facebook/appevents/m;->u(Lcom/facebook/appevents/e0;Lcom/facebook/appevents/e;)Lcom/facebook/appevents/g0;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_1

    :try_start_2
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSHED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"

    invoke-virtual {p0}, Lcom/facebook/appevents/g0;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"

    invoke-virtual {p0}, Lcom/facebook/appevents/g0;->b()Lcom/facebook/appevents/f0;

    move-result-object p0

    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lk1/a;->b(Landroid/content/Context;)Lk1/a;

    move-result-object p0

    invoke-virtual {p0, v1}, Lk1/a;->d(Landroid/content/Intent;)Z

    :cond_1
    return-void

    :catch_0
    move-exception p0

    sget-object v1, Lcom/facebook/appevents/m;->b:Ljava/lang/String;

    const-string v2, "Caught unexpected exception while flushing app events: "

    invoke-static {v1, v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final o()V
    .locals 3

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    sput-object v1, Lcom/facebook/appevents/m;->f:Ljava/util/concurrent/ScheduledFuture;

    sget-object v1, Lcom/facebook/appevents/o;->b:Lcom/facebook/appevents/o$a;

    invoke-virtual {v1}, Lcom/facebook/appevents/o$a;->c()Lcom/facebook/appevents/o$b;

    move-result-object v1

    sget-object v2, Lcom/facebook/appevents/o$b;->EXPLICIT_ONLY:Lcom/facebook/appevents/o$b;

    if-eq v1, v2, :cond_1

    sget-object v1, Lcom/facebook/appevents/e0;->TIMER:Lcom/facebook/appevents/e0;

    invoke-static {v1}, Lcom/facebook/appevents/m;->n(Lcom/facebook/appevents/e0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final p()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/facebook/appevents/a;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    sget-object v1, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;

    invoke-virtual {v1}, Lcom/facebook/appevents/e;->f()Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final q(Lcom/facebook/appevents/a;Li4/i0;Li4/n0;Lcom/facebook/appevents/j0;Lcom/facebook/appevents/g0;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const-class v3, Lcom/facebook/appevents/m;

    invoke-static {v3}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v4, "accessTokenAppId"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "request"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "response"

    move-object/from16 v6, p2

    invoke-static {v6, v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "appEvents"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "flushState"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Li4/n0;->b()Li4/u;

    move-result-object v4

    const-string v7, "Success"

    sget-object v8, Lcom/facebook/appevents/f0;->SUCCESS:Lcom/facebook/appevents/f0;

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Li4/u;->b()I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_1

    const-string v7, "Failed: No Connectivity"

    sget-object v8, Lcom/facebook/appevents/f0;->NO_CONNECTIVITY:Lcom/facebook/appevents/f0;

    goto :goto_0

    :cond_1
    sget-object v7, Lkotlin/jvm/internal/a0;->a:Lkotlin/jvm/internal/a0;

    const-string v7, "Failed:\n  Response: %s\n  Error %s"

    new-array v8, v9, [Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Li4/n0;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v11

    invoke-virtual {v4}, Li4/u;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v10

    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v6, "java.lang.String.format(format, *args)"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lcom/facebook/appevents/f0;->SERVER_ERROR:Lcom/facebook/appevents/f0;

    :cond_2
    :goto_0
    sget-object v6, Li4/e0;->a:Li4/e0;

    sget-object v6, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {v6}, Li4/e0;->H(Li4/q0;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual/range {p1 .. p1}, Li4/i0;->w()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v12, Lorg/json/JSONArray;

    invoke-direct {v12, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v9}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;

    move-result-object v6

    const-string v12, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    :try_start_2
    const-string v6, "<Can\'t encode events for debug logging>"

    :goto_1
    sget-object v12, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v13, Li4/q0;->APP_EVENTS:Li4/q0;

    sget-object v14, Lcom/facebook/appevents/m;->b:Ljava/lang/String;

    const-string v15, "TAG"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s"

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Li4/i0;->q()Lorg/json/JSONObject;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v9, v11

    aput-object v7, v9, v10

    const/4 v5, 0x2

    aput-object v6, v9, v5

    invoke-virtual {v12, v13, v14, v15, v9}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    move v10, v11

    :goto_2
    invoke-virtual {v1, v10}, Lcom/facebook/appevents/j0;->b(Z)V

    sget-object v4, Lcom/facebook/appevents/f0;->NO_CONNECTIVITY:Lcom/facebook/appevents/f0;

    if-ne v8, v4, :cond_5

    invoke-static {}, Li4/e0;->t()Ljava/util/concurrent/Executor;

    move-result-object v5

    new-instance v6, Lcom/facebook/appevents/k;

    invoke-direct {v6, v0, v1}, Lcom/facebook/appevents/k;-><init>(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_5
    sget-object v0, Lcom/facebook/appevents/f0;->SUCCESS:Lcom/facebook/appevents/f0;

    if-eq v8, v0, :cond_6

    invoke-virtual/range {p4 .. p4}, Lcom/facebook/appevents/g0;->b()Lcom/facebook/appevents/f0;

    move-result-object v0

    if-eq v0, v4, :cond_6

    invoke-virtual {v2, v8}, Lcom/facebook/appevents/g0;->d(Lcom/facebook/appevents/f0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_6
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, v3}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final r(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V
    .locals 2

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "$accessTokenAppId"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$appEvents"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/facebook/appevents/n;->a(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final s()V
    .locals 3

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lcom/facebook/appevents/m;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/facebook/appevents/l;

    invoke-direct {v2}, Lcom/facebook/appevents/l;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final t()V
    .locals 2

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lcom/facebook/appevents/n;->a:Lcom/facebook/appevents/n;

    sget-object v1, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;

    invoke-static {v1}, Lcom/facebook/appevents/n;->b(Lcom/facebook/appevents/e;)V

    new-instance v1, Lcom/facebook/appevents/e;

    invoke-direct {v1}, Lcom/facebook/appevents/e;-><init>()V

    sput-object v1, Lcom/facebook/appevents/m;->d:Lcom/facebook/appevents/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final u(Lcom/facebook/appevents/e0;Lcom/facebook/appevents/e;)Lcom/facebook/appevents/g0;
    .locals 11

    const-class v0, Lcom/facebook/appevents/m;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "reason"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appEventCollection"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/facebook/appevents/g0;

    invoke-direct {v1}, Lcom/facebook/appevents/g0;-><init>()V

    invoke-static {p1, v1}, Lcom/facebook/appevents/m;->k(Lcom/facebook/appevents/e;Lcom/facebook/appevents/g0;)Ljava/util/List;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-eqz v3, :cond_2

    sget-object v3, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v5, Li4/q0;->APP_EVENTS:Li4/q0;

    sget-object v6, Lcom/facebook/appevents/m;->b:Ljava/lang/String;

    const-string v7, "TAG"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "Flushing %d events due to %s."

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/facebook/appevents/g0;->a()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v8, v4

    invoke-virtual {v3, v5, v6, v7, v8}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li4/i0;

    invoke-virtual {p1}, Li4/i0;->k()Li4/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    return-object v2

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method
