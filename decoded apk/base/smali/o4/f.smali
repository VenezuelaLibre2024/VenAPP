.class public final Lo4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo4/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo4/f;

    invoke-direct {v0}, Lo4/f;-><init>()V

    sput-object v0, Lo4/f;->a:Lo4/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lo4/f;->e()V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lo4/f;->f()V

    return-void
.end method

.method private final c()V
    .locals 3

    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lo4/j;->a:Lo4/j;

    sget-object v0, Lo4/h;->s:Lo4/h$b;

    invoke-virtual {v0}, Lo4/h$b;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0}, Lo4/h$b;->e()Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lo4/j;->e(Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v0}, Lo4/h$b;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lo4/f;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "context"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.android.billingclient.api.Purchase"

    invoke-static {v1}, Lo4/m;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lo4/h;->s:Lo4/h$b;

    invoke-virtual {v1, p0}, Lo4/h$b;->c(Landroid/content/Context;)Lo4/h;

    move-result-object p0

    if-nez p0, :cond_2

    return-void

    :cond_2
    invoke-virtual {v1}, Lo4/h$b;->f()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Lo4/j;->d()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "inapp"

    if-eqz v1, :cond_3

    :try_start_1
    new-instance v1, Lo4/d;

    invoke-direct {v1}, Lo4/d;-><init>()V

    invoke-virtual {p0, v2, v1}, Lo4/h;->p(Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_3
    new-instance v1, Lo4/e;

    invoke-direct {v1}, Lo4/e;-><init>()V

    invoke-virtual {p0, v2, v1}, Lo4/h;->o(Ljava/lang/String;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :goto_0
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final e()V
    .locals 2

    const-class v0, Lo4/f;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lo4/f;->a:Lo4/f;

    invoke-direct {v1}, Lo4/f;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final f()V
    .locals 2

    const-class v0, Lo4/f;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lo4/f;->a:Lo4/f;

    invoke-direct {v1}, Lo4/f;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
