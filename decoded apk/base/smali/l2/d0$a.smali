.class Ll2/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/d0;->a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/b;)Lcom/google/common/util/concurrent/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/UUID;

.field final synthetic b:Landroidx/work/b;

.field final synthetic c:Landroidx/work/impl/utils/futures/c;

.field final synthetic d:Ll2/d0;


# direct methods
.method constructor <init>(Ll2/d0;Ljava/util/UUID;Landroidx/work/b;Landroidx/work/impl/utils/futures/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ll2/d0$a;->d:Ll2/d0;

    iput-object p2, p0, Ll2/d0$a;->a:Ljava/util/UUID;

    iput-object p3, p0, Ll2/d0$a;->b:Landroidx/work/b;

    iput-object p4, p0, Ll2/d0$a;->c:Landroidx/work/impl/utils/futures/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Ll2/d0$a;->a:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v1

    sget-object v2, Ll2/d0;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Updating progress for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll2/d0$a;->a:Ljava/util/UUID;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll2/d0$a;->b:Landroidx/work/b;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ll2/d0$a;->d:Ll2/d0;

    iget-object v1, v1, Ll2/d0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->e()V

    :try_start_0
    iget-object v1, p0, Ll2/d0$a;->d:Ll2/d0;

    iget-object v1, v1, Ll2/d0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->J()Lk2/v;

    move-result-object v1

    invoke-interface {v1, v0}, Lk2/v;->h(Ljava/lang/String;)Lk2/u;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v1, Lk2/u;->b:Lf2/s$a;

    sget-object v3, Lf2/s$a;->RUNNING:Lf2/s$a;

    if-ne v1, v3, :cond_0

    new-instance v1, Lk2/q;

    iget-object v2, p0, Ll2/d0$a;->b:Landroidx/work/b;

    invoke-direct {v1, v0, v2}, Lk2/q;-><init>(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v0, p0, Ll2/d0$a;->d:Ll2/d0;

    iget-object v0, v0, Ll2/d0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->I()Lk2/r;

    move-result-object v0

    invoke-interface {v0, v1}, Lk2/r;->c(Lk2/q;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ignoring setProgressAsync(...). WorkSpec ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") is not in a RUNNING state."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lf2/j;->k(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Ll2/d0$a;->c:Landroidx/work/impl/utils/futures/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->o(Ljava/lang/Object;)Z

    iget-object v0, p0, Ll2/d0$a;->d:Ll2/d0;

    iget-object v0, v0, Ll2/d0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->B()V

    goto :goto_1

    :cond_1
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v1

    sget-object v2, Ll2/d0;->c:Ljava/lang/String;

    const-string v3, "Error updating Worker progress"

    invoke-virtual {v1, v2, v3, v0}, Lf2/j;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Ll2/d0$a;->c:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->p(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    iget-object v0, p0, Ll2/d0$a;->d:Ll2/d0;

    iget-object v0, v0, Ll2/d0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->i()V

    return-void

    :catchall_1
    move-exception v0

    iget-object v1, p0, Ll2/d0$a;->d:Ll2/d0;

    iget-object v1, v1, Ll2/d0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    throw v0
.end method
