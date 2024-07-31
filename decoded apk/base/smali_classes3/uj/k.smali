.class public final Luj/k;
.super Ldj/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luj/k$a;,
        Luj/k$b;,
        Luj/k$c;
    }
.end annotation


# static fields
.field private static final b:Luj/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj/k;

    invoke-direct {v0}, Luj/k;-><init>()V

    sput-object v0, Luj/k;->b:Luj/k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldj/r;-><init>()V

    return-void
.end method

.method public static d()Luj/k;
    .locals 1

    sget-object v0, Luj/k;->b:Luj/k;

    return-object v0
.end method


# virtual methods
.method public a()Ldj/r$b;
    .locals 1

    new-instance v0, Luj/k$c;

    invoke-direct {v0}, Luj/k$c;-><init>()V

    return-object v0
.end method

.method public b(Ljava/lang/Runnable;)Lgj/b;
    .locals 0

    invoke-static {p1}, Lyj/a;->s(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    sget-object p1, Lkj/c;->INSTANCE:Lkj/c;

    return-object p1
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lgj/b;
    .locals 0

    :try_start_0
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->sleep(J)V

    invoke-static {p1}, Lyj/a;->s(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    sget-object p1, Lkj/c;->INSTANCE:Lkj/c;

    return-object p1
.end method
