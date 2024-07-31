.class final Loj/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loj/h$a$a;
    }
.end annotation


# instance fields
.field final a:Ldj/c;

.field final b:Lkj/e;

.field final synthetic c:Loj/h;


# direct methods
.method constructor <init>(Loj/h;Ldj/c;Lkj/e;)V
    .locals 0

    iput-object p1, p0, Loj/h$a;->c:Loj/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Loj/h$a;->a:Ldj/c;

    iput-object p3, p0, Loj/h$a;->b:Lkj/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Loj/h$a;->a:Ldj/c;

    invoke-interface {v0}, Ldj/c;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Loj/h$a;->b:Lkj/e;

    invoke-virtual {v0, p1}, Lkj/e;->b(Lgj/b;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Loj/h$a;->c:Loj/h;

    iget-object v0, v0, Loj/h;->b:Ljj/e;

    invoke-interface {v0, p1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldj/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "The CompletableConsumable returned is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object p1, p0, Loj/h$a;->a:Ldj/c;

    invoke-interface {p1, v0}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    new-instance p1, Loj/h$a$a;

    invoke-direct {p1, p0}, Loj/h$a$a;-><init>(Loj/h$a;)V

    invoke-interface {v0, p1}, Ldj/d;->a(Ldj/c;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Loj/h$a;->a:Ldj/c;

    new-instance v2, Lhj/a;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Throwable;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object p1, v3, v0

    invoke-direct {v2, v3}, Lhj/a;-><init>([Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
