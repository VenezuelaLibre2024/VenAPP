.class public Lzk/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/w1;
.implements Lzk/u;
.implements Lzk/l2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzk/d2$a;,
        Lzk/d2$b;,
        Lzk/d2$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state"

    const-class v1, Lzk/d2;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lzk/d2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, Lzk/e2;->c()Lzk/f1;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lzk/e2;->d()Lzk/f1;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lzk/d2;->_state:Ljava/lang/Object;

    return-void
.end method

.method private final A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/r1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lzk/d2$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lzk/d2$c;

    invoke-virtual {v1}, Lzk/d2$c;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lzk/a0;

    invoke-direct {p0, p1}, Lzk/d2;->J(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, Lzk/a0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-direct {p0, v0, v1}, Lzk/d2;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lzk/e2;->b()Lel/h0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object p1

    return-object p1
.end method

.method private final C(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lzk/d2;->e0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, Lzk/d2;->X()Lzk/s;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, Lzk/j2;->a:Lzk/j2;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lzk/s;->h(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method private final D0(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, Lzk/f1;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lzk/f1;

    invoke-virtual {v0}, Lzk/f1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    sget-object v0, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lzk/e2;->c()Lzk/f1;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lzk/d2;->w0()V

    return v2

    :cond_2
    instance-of v0, p1, Lzk/q1;

    if-eqz v0, :cond_4

    sget-object v0, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, Lzk/q1;

    invoke-virtual {v3}, Lzk/q1;->c()Lzk/i2;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lzk/d2;->w0()V

    return v2

    :cond_4
    return v3
.end method

.method private final E0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Lzk/d2$c;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, Lzk/d2$c;

    invoke-virtual {p1}, Lzk/d2$c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lzk/d2$c;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lzk/r1;

    if-eqz v0, :cond_3

    check-cast p1, Lzk/r1;

    invoke-interface {p1}, Lzk/r1;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lzk/a0;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method private final G(Lzk/r1;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lzk/d2;->X()Lzk/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lzk/c1;->dispose()V

    sget-object v0, Lzk/j2;->a:Lzk/j2;

    invoke-virtual {p0, v0}, Lzk/d2;->C0(Lzk/s;)V

    :cond_0
    instance-of v0, p2, Lzk/a0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lzk/a0;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object v1, p2, Lzk/a0;->a:Ljava/lang/Throwable;

    :cond_2
    instance-of p2, p1, Lzk/c2;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, Lzk/c2;

    invoke-virtual {p2, v1}, Lzk/c0;->v(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    new-instance v0, Lzk/d0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lzk/d0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lzk/d2;->a0(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lzk/r1;->c()Lzk/i2;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p1, v1}, Lzk/d2;->s0(Lzk/i2;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static synthetic G0(Lzk/d2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lzk/d2;->F0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final H(Lzk/d2$c;Lzk/t;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p2}, Lzk/d2;->q0(Lel/s;)Lzk/t;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lzk/d2;->M0(Lzk/d2$c;Lzk/t;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1, p3}, Lzk/d2;->K(Lzk/d2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzk/d2;->t(Ljava/lang/Object;)V

    return-void
.end method

.method private final I0(Lzk/r1;Ljava/lang/Object;)Z
    .locals 2

    sget-object v0, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lzk/e2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzk/d2;->t0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, Lzk/d2;->u0(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lzk/d2;->G(Lzk/r1;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final J(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    new-instance p1, Lzk/x1;

    invoke-static {p0}, Lzk/d2;->m(Lzk/d2;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lzk/x1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzk/w1;)V

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lzk/l2;

    invoke-interface {p1}, Lzk/l2;->I()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final J0(Lzk/r1;Ljava/lang/Throwable;)Z
    .locals 4

    invoke-direct {p0, p1}, Lzk/d2;->W(Lzk/r1;)Lzk/i2;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, Lzk/d2$c;

    invoke-direct {v2, v0, v1, p2}, Lzk/d2$c;-><init>(Lzk/i2;ZLjava/lang/Throwable;)V

    sget-object v3, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, p1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, v0, p2}, Lzk/d2;->r0(Lzk/i2;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final K(Lzk/d2$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lzk/a0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzk/a0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lzk/a0;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lzk/d2$c;->g()Z

    move-result v2

    invoke-virtual {p1, v0}, Lzk/d2$c;->j(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lzk/d2;->P(Lzk/d2$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-direct {p0, v4, v3}, Lzk/d2;->s(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p1

    const/4 v3, 0x0

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    if-ne v4, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p2, Lzk/a0;

    const/4 v0, 0x2

    invoke-direct {p2, v4, v3, v0, v1}, Lzk/a0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    :goto_2
    if-eqz v4, :cond_7

    invoke-direct {p0, v4}, Lzk/d2;->C(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, Lzk/d2;->Z(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v3, 0x1

    :cond_6
    if-eqz v3, :cond_7

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lzk/a0;

    invoke-virtual {v0}, Lzk/a0;->b()Z

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p0, v4}, Lzk/d2;->t0(Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {p0, p2}, Lzk/d2;->u0(Ljava/lang/Object;)V

    sget-object v0, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lzk/e2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-direct {p0, p1, p2}, Lzk/d2;->G(Lzk/r1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method private final K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lzk/r1;

    if-nez v0, :cond_0

    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lzk/f1;

    if-nez v0, :cond_1

    instance-of v0, p1, Lzk/c2;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lzk/t;

    if-nez v0, :cond_3

    instance-of v0, p2, Lzk/a0;

    if-nez v0, :cond_3

    check-cast p1, Lzk/r1;

    invoke-direct {p0, p1, p2}, Lzk/d2;->I0(Lzk/r1;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, Lzk/e2;->b()Lel/h0;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Lzk/r1;

    invoke-direct {p0, p1, p2}, Lzk/d2;->L0(Lzk/r1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final L(Lzk/r1;)Lzk/t;
    .locals 2

    instance-of v0, p1, Lzk/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lzk/t;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-interface {p1}, Lzk/r1;->c()Lzk/i2;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lzk/d2;->q0(Lel/s;)Lzk/t;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method private final L0(Lzk/r1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-direct {p0, p1}, Lzk/d2;->W(Lzk/r1;)Lzk/i2;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lzk/e2;->b()Lel/h0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, Lzk/d2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lzk/d2$c;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_2

    new-instance v1, Lzk/d2$c;

    invoke-direct {v1, v0, v3, v2}, Lzk/d2$c;-><init>(Lzk/i2;ZLjava/lang/Throwable;)V

    :cond_2
    new-instance v4, Lkotlin/jvm/internal/x;

    invoke-direct {v4}, Lkotlin/jvm/internal/x;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lzk/d2$c;->h()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v1, v5}, Lzk/d2$c;->k(Z)V

    if-eq v1, p1, :cond_4

    sget-object v6, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v6, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {}, Lzk/e2;->b()Lel/h0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-virtual {v1}, Lzk/d2$c;->g()Z

    move-result v6

    instance-of v7, p2, Lzk/a0;

    if-eqz v7, :cond_5

    move-object v7, p2

    check-cast v7, Lzk/a0;

    goto :goto_1

    :cond_5
    move-object v7, v2

    :goto_1
    if-eqz v7, :cond_6

    iget-object v7, v7, Lzk/a0;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v7}, Lzk/d2$c;->b(Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v1}, Lzk/d2$c;->f()Ljava/lang/Throwable;

    move-result-object v7

    if-nez v6, :cond_7

    move v3, v5

    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_8

    move-object v2, v7

    :cond_8
    iput-object v2, v4, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    sget-object v3, Lck/v;->a:Lck/v;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-eqz v2, :cond_9

    invoke-direct {p0, v0, v2}, Lzk/d2;->r0(Lzk/i2;Ljava/lang/Throwable;)V

    :cond_9
    invoke-direct {p0, p1}, Lzk/d2;->L(Lzk/r1;)Lzk/t;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-direct {p0, v1, p1, p2}, Lzk/d2;->M0(Lzk/d2$c;Lzk/t;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, Lzk/e2;->b:Lel/h0;

    return-object p1

    :cond_a
    invoke-direct {p0, v1, p2}, Lzk/d2;->K(Lzk/d2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method private final M0(Lzk/d2$c;Lzk/t;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, Lzk/t;->e:Lzk/u;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lzk/d2$b;

    invoke-direct {v3, p0, p1, p2, p3}, Lzk/d2$b;-><init>(Lzk/d2;Lzk/d2$c;Lzk/t;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lzk/w1$a;->d(Lzk/w1;ZZLok/l;ILjava/lang/Object;)Lzk/c1;

    move-result-object v0

    sget-object v1, Lzk/j2;->a:Lzk/j2;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-direct {p0, p2}, Lzk/d2;->q0(Lel/s;)Lzk/t;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method private final N(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lzk/a0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lzk/a0;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Lzk/a0;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method private final P(Lzk/d2$c;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/d2$c;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lzk/d2$c;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lzk/x1;

    invoke-static {p0}, Lzk/d2;->m(Lzk/d2;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lzk/x1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzk/w1;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Throwable;

    instance-of v4, v4, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v4, v3

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Throwable;

    if-eqz v2, :cond_4

    return-object v2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Throwable;

    instance-of v2, p2, Lzk/v2;

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Throwable;

    if-eq v4, p2, :cond_6

    instance-of v4, v4, Lzk/v2;

    if-eqz v4, :cond_6

    move v4, v3

    goto :goto_1

    :cond_6
    move v4, v0

    :goto_1
    if-eqz v4, :cond_5

    move-object v1, v2

    :cond_7
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_8

    return-object v1

    :cond_8
    return-object p2
.end method

.method private final W(Lzk/r1;)Lzk/i2;
    .locals 3

    invoke-interface {p1}, Lzk/r1;->c()Lzk/i2;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lzk/f1;

    if-eqz v0, :cond_0

    new-instance v0, Lzk/i2;

    invoke-direct {v0}, Lzk/i2;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lzk/c2;

    if-eqz v0, :cond_1

    check-cast p1, Lzk/c2;

    invoke-direct {p0, p1}, Lzk/d2;->y0(Lzk/c2;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private final f0()Z
    .locals 2

    :cond_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/r1;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-direct {p0, v0}, Lzk/d2;->D0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method private final g0(Lgk/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzk/n;

    invoke-static {p1}, Lhk/b;->b(Lgk/Continuation;)Lgk/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lzk/n;-><init>(Lgk/Continuation;I)V

    invoke-virtual {v0}, Lzk/n;->z()V

    new-instance v1, Lzk/n2;

    invoke-direct {v1, v0}, Lzk/n2;-><init>(Lgk/Continuation;)V

    invoke-virtual {p0, v1}, Lzk/d2;->R(Lok/l;)Lzk/c1;

    move-result-object v1

    invoke-static {v0, v1}, Lzk/p;->a(Lzk/m;Lzk/c1;)V

    invoke-virtual {v0}, Lzk/n;->w()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lgk/Continuation;)V

    :cond_0
    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_1

    return-object v0

    :cond_1
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method private final k0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lzk/d2$c;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, Lzk/d2$c;

    invoke-virtual {v3}, Lzk/d2$c;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lzk/e2;->f()Lel/h0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lzk/d2$c;

    invoke-virtual {v3}, Lzk/d2$c;->g()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, Lzk/d2;->J(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, Lzk/d2$c;

    invoke-virtual {p1, v1}, Lzk/d2$c;->b(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, Lzk/d2$c;

    invoke-virtual {p1}, Lzk/d2$c;->f()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-eqz v0, :cond_6

    check-cast v2, Lzk/d2$c;

    invoke-virtual {v2}, Lzk/d2$c;->c()Lzk/i2;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lzk/d2;->r0(Lzk/i2;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, Lzk/r1;

    if-eqz v3, :cond_b

    if-nez v1, :cond_8

    invoke-direct {p0, p1}, Lzk/d2;->J(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, Lzk/r1;

    invoke-interface {v3}, Lzk/r1;->a()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-direct {p0, v3, v1}, Lzk/d2;->J0(Lzk/r1;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, Lzk/a0;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lzk/a0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-direct {p0, v2, v3}, Lzk/d2;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object v4

    if-eq v3, v4, :cond_a

    invoke-static {}, Lzk/e2;->b()Lel/h0;

    move-result-object v2

    if-eq v3, v2, :cond_0

    return-object v3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, Lzk/e2;->f()Lel/h0;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic m(Lzk/d2;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lzk/d2;->D()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final o0(Lok/l;Z)Lzk/c2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;Z)",
            "Lzk/c2;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    instance-of p2, p1, Lzk/y1;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lzk/y1;

    :cond_0
    if-nez v0, :cond_4

    new-instance v0, Lzk/u1;

    invoke-direct {v0, p1}, Lzk/u1;-><init>(Lok/l;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lzk/c2;

    if-eqz p2, :cond_2

    move-object v0, p1

    check-cast v0, Lzk/c2;

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lzk/v1;

    invoke-direct {v0, p1}, Lzk/v1;-><init>(Lok/l;)V

    :cond_4
    :goto_0
    invoke-virtual {v0, p0}, Lzk/c2;->x(Lzk/d2;)V

    return-object v0
.end method

.method public static final synthetic p(Lzk/d2;Lzk/d2$c;Lzk/t;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzk/d2;->H(Lzk/d2$c;Lzk/t;Ljava/lang/Object;)V

    return-void
.end method

.method private final q0(Lel/s;)Lzk/t;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lel/s;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lel/s;->p()Lel/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lel/s;->o()Lel/s;

    move-result-object p1

    invoke-virtual {p1}, Lel/s;->q()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, Lzk/t;

    if-eqz v0, :cond_1

    check-cast p1, Lzk/t;

    return-object p1

    :cond_1
    instance-of v0, p1, Lzk/i2;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final r(Ljava/lang/Object;Lzk/i2;Lzk/c2;)Z
    .locals 2

    new-instance v0, Lzk/d2$d;

    invoke-direct {v0, p3, p0, p1}, Lzk/d2$d;-><init>(Lel/s;Lzk/d2;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lel/s;->p()Lel/s;

    move-result-object p1

    invoke-virtual {p1, p3, p2, v0}, Lel/s;->u(Lel/s;Lel/s;Lel/s$a;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method private final r0(Lzk/i2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0, p2}, Lzk/d2;->t0(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lel/s;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lel/s;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lzk/y1;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lzk/c2;

    :try_start_0
    invoke-virtual {v2, p2}, Lzk/c0;->v(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lck/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lzk/d0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lzk/d0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lck/v;->a:Lck/v;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lel/s;->o()Lel/s;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lzk/d2;->a0(Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0, p2}, Lzk/d2;->C(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final s(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    if-eq v1, p1, :cond_1

    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v1}, Lck/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final s0(Lzk/i2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lel/s;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lel/s;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lzk/c2;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lzk/c2;

    :try_start_0
    invoke-virtual {v2, p2}, Lzk/c0;->v(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lck/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lzk/d0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lzk/d0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lck/v;->a:Lck/v;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lel/s;->o()Lel/s;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lzk/d2;->a0(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method private final v(Lgk/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzk/d2$a;

    invoke-static {p1}, Lhk/b;->b(Lgk/Continuation;)Lgk/Continuation;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lzk/d2$a;-><init>(Lgk/Continuation;Lzk/d2;)V

    invoke-virtual {v0}, Lzk/n;->z()V

    new-instance v1, Lzk/m2;

    invoke-direct {v1, v0}, Lzk/m2;-><init>(Lzk/n;)V

    invoke-virtual {p0, v1}, Lzk/d2;->R(Lok/l;)Lzk/c1;

    move-result-object v1

    invoke-static {v0, v1}, Lzk/p;->a(Lzk/m;Lzk/c1;)V

    invoke-virtual {v0}, Lzk/n;->w()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lgk/Continuation;)V

    :cond_0
    return-object v0
.end method

.method private final x0(Lzk/f1;)V
    .locals 2

    new-instance v0, Lzk/i2;

    invoke-direct {v0}, Lzk/i2;-><init>()V

    invoke-virtual {p1}, Lzk/f1;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lzk/q1;

    invoke-direct {v1, v0}, Lzk/q1;-><init>(Lzk/i2;)V

    move-object v0, v1

    :goto_0
    sget-object v1, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final y0(Lzk/c2;)V
    .locals 2

    new-instance v0, Lzk/i2;

    invoke-direct {v0}, Lzk/i2;-><init>()V

    invoke-virtual {p1, v0}, Lel/s;->g(Lel/s;)Z

    invoke-virtual {p1}, Lel/s;->o()Lel/s;

    move-result-object v0

    sget-object v1, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final A0(Lzk/c2;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/c2;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lzk/e2;->c()Lzk/f1;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, Lzk/r1;

    if-eqz v1, :cond_3

    check-cast v0, Lzk/r1;

    invoke-interface {v0}, Lzk/r1;->c()Lzk/i2;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lel/s;->r()Z

    :cond_3
    return-void
.end method

.method public final B0(Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lzk/d2;->f0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object p1

    invoke-static {p1}, Lzk/a2;->h(Lgk/f;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lzk/d2;->g0(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public final C0(Lzk/s;)V
    .locals 1

    sget-object v0, Lzk/d2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method protected D()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public F(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lzk/d2;->x(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lzk/d2;->T()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method protected final F0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lzk/x1;

    if-nez p2, :cond_1

    invoke-static {p0}, Lzk/d2;->m(Lzk/d2;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lzk/x1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzk/w1;)V

    :cond_2
    return-object v0
.end method

.method public final H0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lzk/d2;->p0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lzk/d2;->E0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public I()Ljava/util/concurrent/CancellationException;
    .locals 5

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/d2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lzk/d2$c;

    invoke-virtual {v1}, Lzk/d2$c;->f()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lzk/a0;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lzk/a0;

    iget-object v1, v1, Lzk/a0;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lzk/r1;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lzk/x1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Lzk/d2;->E0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lzk/x1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzk/w1;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final M()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/r1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    instance-of v1, v0, Lzk/a0;

    if-nez v1, :cond_0

    invoke-static {v0}, Lzk/e2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Lzk/a0;

    iget-object v0, v0, Lzk/a0;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public O(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Lzk/x1;

    invoke-static {p0}, Lzk/d2;->m(Lzk/d2;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lzk/x1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzk/w1;)V

    :cond_0
    invoke-virtual {p0, p1}, Lzk/d2;->z(Ljava/lang/Throwable;)V

    return-void
.end method

.method public Q(Lgk/f$c;)Lgk/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f$c<",
            "*>;)",
            "Lgk/f;"
        }
    .end annotation

    invoke-static {p0, p1}, Lzk/w1$a;->e(Lzk/w1;Lgk/f$c;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public final R(Lok/l;)Lzk/c1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)",
            "Lzk/c1;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Lzk/d2;->m0(ZZLok/l;)Lzk/c1;

    move-result-object p1

    return-object p1
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public U(Lgk/f;)Lgk/f;
    .locals 0

    invoke-static {p0, p1}, Lzk/w1$a;->f(Lzk/w1;Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final X()Lzk/s;
    .locals 1

    sget-object v0, Lzk/d2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/s;

    return-object v0
.end method

.method public final Y()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lel/a0;

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    check-cast v1, Lel/a0;

    invoke-virtual {v1, p0}, Lel/a0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected Z(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public a()Z
    .locals 2

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/r1;

    if-eqz v1, :cond_0

    check-cast v0, Lzk/r1;

    invoke-interface {v0}, Lzk/r1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a0(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method public b(Lgk/f$c;)Lgk/f$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lgk/f$b;",
            ">(",
            "Lgk/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lzk/w1$a;->c(Lzk/w1;Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    return-object p1
.end method

.method protected final b0(Lzk/w1;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lzk/j2;->a:Lzk/j2;

    invoke-virtual {p0, p1}, Lzk/d2;->C0(Lzk/s;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lzk/w1;->start()Z

    invoke-interface {p1, p0}, Lzk/w1;->j0(Lzk/u;)Lzk/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzk/d2;->C0(Lzk/s;)V

    invoke-virtual {p0}, Lzk/d2;->d0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lzk/c1;->dispose()V

    sget-object p1, Lzk/j2;->a:Lzk/j2;

    invoke-virtual {p0, p1}, Lzk/d2;->C0(Lzk/s;)V

    :cond_1
    return-void
.end method

.method public final c0(Lzk/l2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lzk/d2;->x(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d0()Z
    .locals 1

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lzk/r1;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected e0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getKey()Lgk/f$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgk/f$c<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lzk/w1;->q:Lzk/w1$b;

    return-object v0
.end method

.method public getParent()Lzk/w1;
    .locals 1

    invoke-virtual {p0}, Lzk/d2;->X()Lzk/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lzk/s;->getParent()Lzk/w1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final i()Lwk/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwk/d<",
            "Lzk/w1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzk/d2$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzk/d2$e;-><init>(Lzk/d2;Lgk/Continuation;)V

    invoke-static {v0}, Lwk/g;->b(Lok/p;)Lwk/d;

    move-result-object v0

    return-object v0
.end method

.method public final isCancelled()Z
    .locals 2

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/a0;

    if-nez v1, :cond_1

    instance-of v1, v0, Lzk/d2$c;

    if-eqz v1, :cond_0

    check-cast v0, Lzk/d2$c;

    invoke-virtual {v0}, Lzk/d2$c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final j()Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/r1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lzk/d2;->N(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j0(Lzk/u;)Lzk/s;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    new-instance v3, Lzk/t;

    invoke-direct {v3, p1}, Lzk/t;-><init>(Lzk/u;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lzk/w1$a;->d(Lzk/w1;ZZLok/l;ILjava/lang/Object;)Lzk/c1;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lzk/s;

    return-object p1
.end method

.method public final l0(Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lzk/d2;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, Lzk/e2;->b:Lel/h0;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    invoke-static {}, Lzk/e2;->b()Lel/h0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lzk/d2;->t(Ljava/lang/Object;)V

    return v2
.end method

.method public final m0(ZZLok/l;)Lzk/c1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)",
            "Lzk/c1;"
        }
    .end annotation

    invoke-direct {p0, p3, p1}, Lzk/d2;->o0(Lok/l;Z)Lzk/c2;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lzk/f1;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lzk/f1;

    invoke-virtual {v2}, Lzk/f1;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lzk/d2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-direct {p0, v2}, Lzk/d2;->x0(Lzk/f1;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lzk/r1;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Lzk/r1;

    invoke-interface {v2}, Lzk/r1;->c()Lzk/i2;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lzk/c2;

    invoke-direct {p0, v1}, Lzk/d2;->y0(Lzk/c2;)V

    goto :goto_0

    :cond_3
    sget-object v4, Lzk/j2;->a:Lzk/j2;

    if-eqz p1, :cond_8

    instance-of v5, v1, Lzk/d2$c;

    if-eqz v5, :cond_8

    monitor-enter v1

    :try_start_0
    move-object v3, v1

    check-cast v3, Lzk/d2$c;

    invoke-virtual {v3}, Lzk/d2$c;->f()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4

    instance-of v5, p3, Lzk/t;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Lzk/d2$c;

    invoke-virtual {v5}, Lzk/d2$c;->h()Z

    move-result v5

    if-nez v5, :cond_7

    :cond_4
    invoke-direct {p0, v1, v2, v0}, Lzk/d2;->r(Ljava/lang/Object;Lzk/i2;Lzk/c2;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    monitor-exit v1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    monitor-exit v1

    return-object v0

    :cond_6
    move-object v4, v0

    :cond_7
    :try_start_1
    sget-object v5, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_1
    if-eqz v3, :cond_a

    if-eqz p2, :cond_9

    invoke-interface {p3, v3}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v4

    :cond_a
    invoke-direct {p0, v1, v2, v0}, Lzk/d2;->r(Ljava/lang/Object;Lzk/i2;Lzk/c2;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_b
    if-eqz p2, :cond_e

    instance-of p1, v1, Lzk/a0;

    if-eqz p1, :cond_c

    check-cast v1, Lzk/a0;

    goto :goto_2

    :cond_c
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_d

    iget-object v3, v1, Lzk/a0;->a:Ljava/lang/Throwable;

    :cond_d
    invoke-interface {p3, v3}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    sget-object p1, Lzk/j2;->a:Lzk/j2;

    return-object p1
.end method

.method public final n()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/d2$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, Lzk/d2$c;

    invoke-virtual {v0}, Lzk/d2$c;->f()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lzk/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lzk/d2;->F0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, Lzk/r1;

    if-nez v1, :cond_3

    instance-of v1, v0, Lzk/a0;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lzk/a0;

    iget-object v0, v0, Lzk/a0;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, Lzk/d2;->G0(Lzk/d2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lzk/x1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lzk/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lzk/x1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzk/w1;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lzk/d2;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lzk/e2;->b()Lel/h0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lzk/d2;->N(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public p0()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lzk/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final start()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lzk/d2;->D0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method protected t(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected t0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lzk/d2;->H0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lzk/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final u(Lgk/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/r1;

    if-nez v1, :cond_2

    instance-of p1, v0, Lzk/a0;

    if-nez p1, :cond_1

    invoke-static {v0}, Lzk/e2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast v0, Lzk/a0;

    iget-object p1, v0, Lzk/a0;->a:Ljava/lang/Throwable;

    throw p1

    :cond_2
    invoke-direct {p0, v0}, Lzk/d2;->D0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-direct {p0, p1}, Lzk/d2;->v(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected u0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final w(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lzk/d2;->x(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected w0()V
    .locals 0

    return-void
.end method

.method public final x(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object v0

    invoke-virtual {p0}, Lzk/d2;->V()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lzk/d2;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lzk/e2;->b:Lel/h0;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, Lzk/d2;->k0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, Lzk/e2;->a()Lel/h0;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lzk/e2;->b:Lel/h0;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lzk/e2;->f()Lel/h0;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, Lzk/d2;->t(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public z(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lzk/d2;->x(Ljava/lang/Object;)Z

    return-void
.end method

.method public z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lok/p<",
            "-TR;-",
            "Lgk/f$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lzk/w1$a;->b(Lzk/w1;Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
