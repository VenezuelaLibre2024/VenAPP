.class public final Loj/c;
.super Ldj/b;
.source "SourceFile"


# instance fields
.field final a:Ljj/a;


# direct methods
.method public constructor <init>(Ljj/a;)V
    .locals 0

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Loj/c;->a:Ljj/a;

    return-void
.end method


# virtual methods
.method protected p(Ldj/c;)V
    .locals 2

    invoke-static {}, Lgj/c;->b()Lgj/b;

    move-result-object v0

    invoke-interface {p1, v0}, Ldj/c;->b(Lgj/b;)V

    :try_start_0
    iget-object v1, p0, Loj/c;->a:Ljj/a;

    invoke-interface {v1}, Ljj/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ldj/c;->a()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
