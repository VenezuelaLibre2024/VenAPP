.class public Landroidx/work/impl/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/h0$c;
    }
.end annotation


# static fields
.field static final D:Ljava/lang/String;


# instance fields
.field A:Landroidx/work/impl/utils/futures/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/c<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final B:Landroidx/work/impl/utils/futures/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/c<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile C:Z

.field a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/work/impl/t;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroidx/work/WorkerParameters$a;

.field e:Lk2/u;

.field f:Landroidx/work/c;

.field r:Lm2/b;

.field s:Landroidx/work/c$a;

.field private t:Landroidx/work/a;

.field private u:Landroidx/work/impl/foreground/a;

.field private v:Landroidx/work/impl/WorkDatabase;

.field private w:Lk2/v;

.field private x:Lk2/b;

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkerWrapper"

    invoke-static {v0}, Lf2/j;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroidx/work/impl/h0$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/h0;->s:Landroidx/work/c$a;

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->s()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/h0;->A:Landroidx/work/impl/utils/futures/c;

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->s()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/h0;->B:Landroidx/work/impl/utils/futures/c;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->a:Landroid/content/Context;

    iput-object v0, p0, Landroidx/work/impl/h0;->a:Landroid/content/Context;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->d:Lm2/b;

    iput-object v0, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->c:Landroidx/work/impl/foreground/a;

    iput-object v0, p0, Landroidx/work/impl/h0;->u:Landroidx/work/impl/foreground/a;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->g:Lk2/u;

    iput-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v0, v0, Lk2/u;->a:Ljava/lang/String;

    iput-object v0, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->h:Ljava/util/List;

    iput-object v0, p0, Landroidx/work/impl/h0;->c:Ljava/util/List;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->j:Landroidx/work/WorkerParameters$a;

    iput-object v0, p0, Landroidx/work/impl/h0;->d:Landroidx/work/WorkerParameters$a;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->b:Landroidx/work/c;

    iput-object v0, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->e:Landroidx/work/a;

    iput-object v0, p0, Landroidx/work/impl/h0;->t:Landroidx/work/a;

    iget-object v0, p1, Landroidx/work/impl/h0$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->J()Lk2/v;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->E()Lk2/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/h0;->x:Lk2/b;

    invoke-static {p1}, Landroidx/work/impl/h0$c;->a(Landroidx/work/impl/h0$c;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/impl/h0;->y:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Landroidx/work/impl/h0;Lcom/google/common/util/concurrent/f;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/work/impl/h0;->i(Lcom/google/common/util/concurrent/f;)V

    return-void
.end method

.method private b(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Work [ id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tags={ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, " } ]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private f(Landroidx/work/c$a;)V
    .locals 3

    instance-of v0, p1, Landroidx/work/c$a$c;

    if-eqz v0, :cond_1

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object p1

    sget-object v0, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker result SUCCESS for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/work/impl/h0;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lf2/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    invoke-virtual {p1}, Lk2/u;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    invoke-direct {p0}, Landroidx/work/impl/h0;->l()V

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Landroidx/work/impl/h0;->q()V

    goto :goto_1

    :cond_1
    instance-of p1, p1, Landroidx/work/c$a$b;

    if-eqz p1, :cond_2

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object p1

    sget-object v0, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker result RETRY for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/work/impl/h0;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lf2/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/work/impl/h0;->k()V

    goto :goto_1

    :cond_2
    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object p1

    sget-object v0, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker result FAILURE for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/work/impl/h0;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lf2/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    invoke-virtual {p1}, Lk2/u;->j()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroidx/work/impl/h0;->p()V

    :goto_1
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    invoke-interface {v1, p1}, Lk2/v;->g(Ljava/lang/String;)Lf2/s$a;

    move-result-object v1

    sget-object v2, Lf2/s$a;->CANCELLED:Lf2/s$a;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    sget-object v2, Lf2/s$a;->FAILED:Lf2/s$a;

    invoke-interface {v1, v2, p1}, Lk2/v;->w(Lf2/s$a;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Landroidx/work/impl/h0;->x:Lk2/b;

    invoke-interface {v1, p1}, Lk2/b;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private synthetic i(Lcom/google/common/util/concurrent/f;)V
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/h0;->B:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/a;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    sget-object v2, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    iget-object v3, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lk2/v;->w(Lf2/s$a;Ljava/lang/String;)I

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Lk2/v;->i(Ljava/lang/String;J)V

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, Lk2/v;->n(Ljava/lang/String;J)I

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    throw v1
.end method

.method private l()V
    .locals 5

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Lk2/v;->i(Ljava/lang/String;J)V

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    sget-object v2, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    iget-object v3, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lk2/v;->w(Lf2/s$a;Ljava/lang/String;)I

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Lk2/v;->u(Ljava/lang/String;)I

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Lk2/v;->c(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, Lk2/v;->n(Ljava/lang/String;J)I

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    throw v1
.end method

.method private m(Z)V
    .locals 4

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->J()Lk2/v;

    move-result-object v0

    invoke-interface {v0}, Lk2/v;->t()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/h0;->a:Landroid/content/Context;

    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ll2/q;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    sget-object v1, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lk2/v;->w(Lf2/s$a;Ljava/lang/String;)I

    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Lk2/v;->n(Ljava/lang/String;J)I

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/work/impl/h0;->u:Landroidx/work/impl/foreground/a;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroidx/work/impl/foreground/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/work/impl/h0;->u:Landroidx/work/impl/foreground/a;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroidx/work/impl/foreground/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->i()V

    iget-object v0, p0, Landroidx/work/impl/h0;->A:Landroidx/work/impl/utils/futures/c;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->o(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->i()V

    throw p1
.end method

.method private n()V
    .locals 5

    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lk2/v;->g(Ljava/lang/String;)Lf2/s$a;

    move-result-object v0

    sget-object v1, Lf2/s$a;->RUNNING:Lf2/s$a;

    const-string v2, "Status for "

    if-ne v0, v1, :cond_0

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is RUNNING; not doing any work and rescheduling for later execution"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v1

    sget-object v3, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " ; not doing any work"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    return-void
.end method

.method private o()V
    .locals 15

    invoke-direct {p0}, Landroidx/work/impl/h0;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v1, v0, Lk2/u;->b:Lf2/s$a;

    sget-object v2, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    if-eq v1, v2, :cond_1

    invoke-direct {p0}, Landroidx/work/impl/h0;->n()V

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->B()V

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v3, v3, Lk2/u;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is not in ENQUEUED state. Nothing more to do"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->i()V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lk2/u;->j()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    invoke-virtual {v0}, Lk2/u;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    invoke-virtual {v2}, Lk2/u;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    const-string v2, "Delaying execution for %s because it is being executed before schedule."

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v5, v5, Lk2/u;->c:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v3}, Landroidx/work/impl/h0;->m(Z)V

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->i()V

    return-void

    :cond_3
    :try_start_2
    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->B()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->i()V

    iget-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    invoke-virtual {v0}, Lk2/u;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v0, v0, Lk2/u;->e:Landroidx/work/b;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Landroidx/work/impl/h0;->t:Landroidx/work/a;

    invoke-virtual {v0}, Landroidx/work/a;->f()Lf2/h;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v1, v1, Lk2/u;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lf2/h;->b(Ljava/lang/String;)Lf2/g;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create Input Merger "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v3, v3, Lk2/u;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf2/j;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/impl/h0;->p()V

    return-void

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v2, v2, Lk2/u;->e:Landroidx/work/b;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v3, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v2, v3}, Lk2/v;->k(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, v1}, Lf2/g;->b(Ljava/util/List;)Landroidx/work/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    new-instance v0, Landroidx/work/WorkerParameters;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    iget-object v4, p0, Landroidx/work/impl/h0;->y:Ljava/util/List;

    iget-object v5, p0, Landroidx/work/impl/h0;->d:Landroidx/work/WorkerParameters$a;

    iget-object v1, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget v6, v1, Lk2/u;->k:I

    invoke-virtual {v1}, Lk2/u;->f()I

    move-result v7

    iget-object v1, p0, Landroidx/work/impl/h0;->t:Landroidx/work/a;

    invoke-virtual {v1}, Landroidx/work/a;->d()Ljava/util/concurrent/Executor;

    move-result-object v8

    iget-object v9, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    iget-object v1, p0, Landroidx/work/impl/h0;->t:Landroidx/work/a;

    invoke-virtual {v1}, Landroidx/work/a;->n()Lf2/v;

    move-result-object v10

    new-instance v11, Ll2/d0;

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    iget-object v12, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    invoke-direct {v11, v1, v12}, Ll2/d0;-><init>(Landroidx/work/impl/WorkDatabase;Lm2/b;)V

    new-instance v12, Ll2/c0;

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    iget-object v13, p0, Landroidx/work/impl/h0;->u:Landroidx/work/impl/foreground/a;

    iget-object v14, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    invoke-direct {v12, v1, v13, v14}, Ll2/c0;-><init>(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/foreground/a;Lm2/b;)V

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Landroidx/work/b;Ljava/util/Collection;Landroidx/work/WorkerParameters$a;IILjava/util/concurrent/Executor;Lm2/b;Lf2/v;Lf2/o;Lf2/f;)V

    iget-object v1, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    if-nez v1, :cond_6

    iget-object v1, p0, Landroidx/work/impl/h0;->t:Landroidx/work/a;

    invoke-virtual {v1}, Landroidx/work/a;->n()Lf2/v;

    move-result-object v1

    iget-object v2, p0, Landroidx/work/impl/h0;->a:Landroid/content/Context;

    iget-object v3, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v3, v3, Lk2/u;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Lf2/v;->b(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/c;

    move-result-object v1

    iput-object v1, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    :cond_6
    iget-object v1, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    if-nez v1, :cond_7

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create Worker "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v3, v3, Lk2/u;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf2/j;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/impl/h0;->p()V

    return-void

    :cond_7
    invoke-virtual {v1}, Landroidx/work/c;->isUsed()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received an already-used Worker "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v3, v3, Lk2/u;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; Worker Factory should return new instances"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf2/j;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/impl/h0;->p()V

    return-void

    :cond_8
    iget-object v1, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    invoke-virtual {v1}, Landroidx/work/c;->setUsed()V

    invoke-direct {p0}, Landroidx/work/impl/h0;->s()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-direct {p0}, Landroidx/work/impl/h0;->r()Z

    move-result v1

    if-eqz v1, :cond_9

    return-void

    :cond_9
    new-instance v1, Ll2/b0;

    iget-object v3, p0, Landroidx/work/impl/h0;->a:Landroid/content/Context;

    iget-object v4, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    iget-object v5, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->b()Lf2/f;

    move-result-object v6

    iget-object v7, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll2/b0;-><init>(Landroid/content/Context;Lk2/u;Landroidx/work/c;Lf2/f;Lm2/b;)V

    iget-object v0, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    invoke-interface {v0}, Lm2/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ll2/b0;->b()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/h0;->B:Landroidx/work/impl/utils/futures/c;

    new-instance v2, Landroidx/work/impl/g0;

    invoke-direct {v2, p0, v0}, Landroidx/work/impl/g0;-><init>(Landroidx/work/impl/h0;Lcom/google/common/util/concurrent/f;)V

    new-instance v3, Ll2/x;

    invoke-direct {v3}, Ll2/x;-><init>()V

    invoke-virtual {v1, v2, v3}, Landroidx/work/impl/utils/futures/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Landroidx/work/impl/h0$a;

    invoke-direct {v1, p0, v0}, Landroidx/work/impl/h0$a;-><init>(Landroidx/work/impl/h0;Lcom/google/common/util/concurrent/f;)V

    iget-object v2, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    invoke-interface {v2}, Lm2/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Landroidx/work/impl/h0;->z:Ljava/lang/String;

    iget-object v1, p0, Landroidx/work/impl/h0;->B:Landroidx/work/impl/utils/futures/c;

    new-instance v2, Landroidx/work/impl/h0$b;

    invoke-direct {v2, p0, v0}, Landroidx/work/impl/h0$b;-><init>(Landroidx/work/impl/h0;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/impl/h0;->r:Lm2/b;

    invoke-interface {v0}, Lm2/b;->b()Lm2/a;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroidx/work/impl/utils/futures/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    :cond_a
    invoke-direct {p0}, Landroidx/work/impl/h0;->n()V

    :goto_2
    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    throw v0
.end method

.method private q()V
    .locals 9

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    sget-object v2, Lf2/s$a;->SUCCEEDED:Lf2/s$a;

    iget-object v3, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lk2/v;->w(Lf2/s$a;Ljava/lang/String;)I

    iget-object v1, p0, Landroidx/work/impl/h0;->s:Landroidx/work/c$a;

    check-cast v1, Landroidx/work/c$a$c;

    invoke-virtual {v1}, Landroidx/work/c$a$c;->f()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v3, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lk2/v;->q(Ljava/lang/String;Landroidx/work/b;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/work/impl/h0;->x:Lk2/b;

    iget-object v4, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v3, v4}, Lk2/b;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    invoke-interface {v5, v4}, Lk2/v;->g(Ljava/lang/String;)Lf2/s$a;

    move-result-object v5

    sget-object v6, Lf2/s$a;->BLOCKED:Lf2/s$a;

    if-ne v5, v6, :cond_0

    iget-object v5, p0, Landroidx/work/impl/h0;->x:Lk2/b;

    invoke-interface {v5, v4}, Lk2/b;->b(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v5

    sget-object v6, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Setting status to enqueued for "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lf2/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    sget-object v6, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    invoke-interface {v5, v6, v4}, Lk2/v;->w(Lf2/s$a;Ljava/lang/String;)I

    iget-object v5, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    invoke-interface {v5, v4, v1, v2}, Lk2/v;->i(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    throw v1
.end method

.method private r()Z
    .locals 5

    iget-boolean v0, p0, Landroidx/work/impl/h0;->C:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v2, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Work interrupted for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/work/impl/h0;->z:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v2}, Lk2/v;->g(Ljava/lang/String;)Lf2/s$a;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-direct {p0, v1}, Landroidx/work/impl/h0;->m(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf2/s$a;->h()Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    :goto_0
    return v2

    :cond_1
    return v1
.end method

.method private s()Z
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lk2/v;->g(Ljava/lang/String;)Lf2/s$a;

    move-result-object v0

    sget-object v1, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    sget-object v1, Lf2/s$a;->RUNNING:Lf2/s$a;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lk2/v;->w(Lf2/s$a;Ljava/lang/String;)I

    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lk2/v;->x(Ljava/lang/String;)I

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    throw v0
.end method


# virtual methods
.method public c()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/h0;->A:Landroidx/work/impl/utils/futures/c;

    return-object v0
.end method

.method public d()Lk2/m;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    invoke-static {v0}, Lk2/x;->a(Lk2/u;)Lk2/m;

    move-result-object v0

    return-object v0
.end method

.method public e()Lk2/u;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    return-object v0
.end method

.method public g()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/work/impl/h0;->C:Z

    invoke-direct {p0}, Landroidx/work/impl/h0;->r()Z

    iget-object v1, p0, Landroidx/work/impl/h0;->B:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/a;->cancel(Z)Z

    iget-object v0, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/h0;->B:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/a;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/h0;->f:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/c;->stop()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WorkSpec "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/work/impl/h0;->e:Lk2/u;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is already done. Not interrupting."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v1

    sget-object v2, Landroidx/work/impl/h0;->D:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method j()V
    .locals 3

    invoke-direct {p0}, Landroidx/work/impl/h0;->r()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lk2/v;->g(Ljava/lang/String;)Lf2/s$a;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->I()Lk2/r;

    move-result-object v1

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Lk2/r;->a(Ljava/lang/String;)V

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, Lf2/s$a;->RUNNING:Lf2/s$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Landroidx/work/impl/h0;->s:Landroidx/work/c$a;

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->f(Landroidx/work/c$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lf2/s$a;->h()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Landroidx/work/impl/h0;->k()V

    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->i()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Landroidx/work/impl/h0;->c:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/work/impl/t;

    iget-object v2, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Landroidx/work/impl/t;->c(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Landroidx/work/impl/h0;->t:Landroidx/work/a;

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    iget-object v2, p0, Landroidx/work/impl/h0;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Landroidx/work/impl/u;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method p()V
    .locals 4

    iget-object v0, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lr1/u;->e()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-direct {p0, v1}, Landroidx/work/impl/h0;->h(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/impl/h0;->s:Landroidx/work/c$a;

    check-cast v1, Landroidx/work/c$a$a;

    invoke-virtual {v1}, Landroidx/work/c$a$a;->f()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, Landroidx/work/impl/h0;->w:Lk2/v;

    iget-object v3, p0, Landroidx/work/impl/h0;->b:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lk2/v;->q(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Landroidx/work/impl/h0;->v:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lr1/u;->i()V

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->m(Z)V

    throw v1
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/h0;->y:Ljava/util/List;

    invoke-direct {p0, v0}, Landroidx/work/impl/h0;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/h0;->z:Ljava/lang/String;

    invoke-direct {p0}, Landroidx/work/impl/h0;->o()V

    return-void
.end method
