.class public Lil/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _availablePermits:I

.field private final a:I

.field private final b:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private volatile deqIdx:J

.field private volatile enqIdx:J

.field private volatile head:Ljava/lang/Object;

.field private volatile tail:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "head"

    const-class v1, Lil/d;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lil/d;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "deqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lil/d;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "tail"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lil/d;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "enqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lil/d;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_availablePermits"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lil/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lil/d;->a:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_3

    if-ltz p2, :cond_1

    if-gt p2, p1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    new-instance v0, Lil/f;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-wide/16 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lil/f;-><init>(JLil/f;I)V

    iput-object v0, p0, Lil/d;->head:Ljava/lang/Object;

    iput-object v0, p0, Lil/d;->tail:Ljava/lang/Object;

    sub-int/2addr p1, p2

    iput p1, p0, Lil/d;->_availablePermits:I

    new-instance p1, Lil/d$b;

    invoke-direct {p1, p0}, Lil/d$b;-><init>(Lil/d;)V

    iput-object p1, p0, Lil/d;->b:Lok/l;

    return-void

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The number of acquired permits should be in 0.."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Semaphore should have at least 1 permit, but had "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final e(Lzk/b3;)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lil/d;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lil/f;

    sget-object v4, Lil/d;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v4

    sget-object v6, Lil/d$a;->a:Lil/d$a;

    invoke-static {}, Lil/e;->f()I

    move-result v7

    int-to-long v7, v7

    div-long v7, v4, v7

    :cond_0
    invoke-static {v3, v7, v8, v6}, Lel/d;->c(Lel/e0;JLok/p;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lel/f0;->c(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    invoke-static {v9}, Lel/f0;->b(Ljava/lang/Object;)Lel/e0;

    move-result-object v10

    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lel/e0;

    iget-wide v14, v13, Lel/e0;->c:J

    iget-wide v11, v10, Lel/e0;->c:J

    cmp-long v11, v14, v11

    if-ltz v11, :cond_3

    :cond_2
    :goto_1
    const/4 v10, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v10}, Lel/e0;->q()Z

    move-result v11

    if-nez v11, :cond_4

    const/4 v10, 0x0

    goto :goto_2

    :cond_4
    invoke-static {v2, v0, v13, v10}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v13}, Lel/e0;->m()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v13}, Lel/e;->k()V

    goto :goto_1

    :goto_2
    if-eqz v10, :cond_0

    goto :goto_3

    :cond_5
    invoke-virtual {v10}, Lel/e0;->m()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v10}, Lel/e;->k()V

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {v9}, Lel/f0;->b(Ljava/lang/Object;)Lel/e0;

    move-result-object v2

    check-cast v2, Lil/f;

    invoke-static {}, Lil/e;->f()I

    move-result v3

    int-to-long v6, v3

    rem-long/2addr v4, v6

    long-to-int v3, v4

    invoke-virtual {v2}, Lil/f;->r()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v3, v5, v1}, Lbl/h;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1, v2, v3}, Lzk/b3;->f(Lel/e0;I)V

    const/4 v1, 0x1

    return v1

    :cond_7
    invoke-static {}, Lil/e;->e()Lel/h0;

    move-result-object v4

    invoke-static {}, Lil/e;->g()Lel/h0;

    move-result-object v5

    invoke-virtual {v2}, Lil/f;->r()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v2

    invoke-static {v2, v3, v4, v5}, Lbl/h;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    instance-of v2, v1, Lzk/m;

    if-eqz v2, :cond_8

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lzk/m;

    sget-object v2, Lck/v;->a:Lck/v;

    iget-object v3, v0, Lil/d;->b:Lok/l;

    invoke-interface {v1, v2, v3}, Lzk/m;->c(Ljava/lang/Object;Lok/l;)V

    :goto_4
    const/4 v1, 0x1

    goto :goto_5

    :cond_8
    instance-of v2, v1, Lhl/b;

    if-eqz v2, :cond_9

    check-cast v1, Lhl/b;

    sget-object v2, Lck/v;->a:Lck/v;

    invoke-interface {v1, v2}, Lhl/b;->a(Ljava/lang/Object;)V

    goto :goto_4

    :goto_5
    return v1

    :cond_9
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unexpected: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_a
    const/4 v1, 0x0

    return v1
.end method

.method private final f()V
    .locals 3

    :cond_0
    sget-object v0, Lil/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    iget v2, p0, Lil/d;->a:I

    if-le v1, v2, :cond_1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method private final g()I
    .locals 2

    :cond_0
    sget-object v0, Lil/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lil/d;->a:I

    if-gt v0, v1, :cond_0

    return v0
.end method

.method private final k(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lzk/m;

    if-eqz v0, :cond_1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lzk/m;

    sget-object v0, Lck/v;->a:Lck/v;

    const/4 v1, 0x0

    iget-object v2, p0, Lil/d;->b:Lok/l;

    invoke-interface {p1, v0, v1, v2}, Lzk/m;->l(Ljava/lang/Object;Ljava/lang/Object;Lok/l;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lzk/m;->o(Ljava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lhl/b;

    if-eqz v0, :cond_2

    check-cast p1, Lhl/b;

    sget-object v0, Lck/v;->a:Lck/v;

    invoke-interface {p1, p0, v0}, Lhl/b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final l()Z
    .locals 15

    move-object v0, p0

    sget-object v1, Lil/d;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lil/f;

    sget-object v3, Lil/d;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v3

    invoke-static {}, Lil/e;->f()I

    move-result v5

    int-to-long v5, v5

    div-long v5, v3, v5

    sget-object v7, Lil/d$c;->a:Lil/d$c;

    :cond_0
    invoke-static {v2, v5, v6, v7}, Lel/d;->c(Lel/e0;JLok/p;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lel/f0;->c(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    invoke-static {v8}, Lel/f0;->b(Ljava/lang/Object;)Lel/e0;

    move-result-object v9

    :cond_1
    :goto_0
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lel/e0;

    iget-wide v13, v12, Lel/e0;->c:J

    iget-wide v10, v9, Lel/e0;->c:J

    cmp-long v10, v13, v10

    if-ltz v10, :cond_3

    :cond_2
    :goto_1
    const/4 v9, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v9}, Lel/e0;->q()Z

    move-result v10

    if-nez v10, :cond_4

    const/4 v9, 0x0

    goto :goto_2

    :cond_4
    invoke-static {v1, p0, v12, v9}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v12}, Lel/e0;->m()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v12}, Lel/e;->k()V

    goto :goto_1

    :goto_2
    if-eqz v9, :cond_0

    goto :goto_3

    :cond_5
    invoke-virtual {v9}, Lel/e0;->m()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v9}, Lel/e;->k()V

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {v8}, Lel/f0;->b(Ljava/lang/Object;)Lel/e0;

    move-result-object v1

    check-cast v1, Lil/f;

    invoke-virtual {v1}, Lel/e;->b()V

    iget-wide v7, v1, Lel/e0;->c:J

    cmp-long v2, v7, v5

    if-lez v2, :cond_7

    const/4 v2, 0x0

    return v2

    :cond_7
    invoke-static {}, Lil/e;->f()I

    move-result v2

    int-to-long v5, v2

    rem-long/2addr v3, v5

    long-to-int v2, v3

    invoke-static {}, Lil/e;->e()Lel/h0;

    move-result-object v3

    invoke-virtual {v1}, Lil/f;->r()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_a

    invoke-static {}, Lil/e;->d()I

    move-result v3

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v3, :cond_9

    invoke-virtual {v1}, Lil/f;->r()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {}, Lil/e;->g()Lel/h0;

    move-result-object v5

    if-ne v4, v5, :cond_8

    const/4 v4, 0x1

    return v4

    :cond_8
    const/4 v4, 0x1

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_9
    const/4 v4, 0x1

    invoke-static {}, Lil/e;->e()Lel/h0;

    move-result-object v3

    invoke-static {}, Lil/e;->b()Lel/h0;

    move-result-object v5

    invoke-virtual {v1}, Lil/f;->r()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v1

    invoke-static {v1, v2, v3, v5}, Lbl/h;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v4

    return v1

    :cond_a
    invoke-static {}, Lil/e;->c()Lel/h0;

    move-result-object v1

    if-ne v3, v1, :cond_b

    const/4 v1, 0x0

    return v1

    :cond_b
    invoke-direct {p0, v3}, Lil/d;->k(Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method


# virtual methods
.method protected final d(Lzk/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/m<",
            "-",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    :cond_0
    invoke-direct {p0}, Lil/d;->g()I

    move-result v0

    if-lez v0, :cond_1

    sget-object v0, Lck/v;->a:Lck/v;

    iget-object v1, p0, Lil/d;->b:Lok/l;

    invoke-interface {p1, v0, v1}, Lzk/m;->c(Ljava/lang/Object;Lok/l;)V

    goto :goto_0

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.Waiter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Lzk/b3;

    invoke-direct {p0, v0}, Lil/d;->e(Lzk/b3;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void
.end method

.method public h()I
    .locals 2

    sget-object v0, Lil/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public i()V
    .locals 3

    :cond_0
    sget-object v0, Lil/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndIncrement(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lil/d;->a:I

    if-ge v0, v1, :cond_2

    if-ltz v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lil/d;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    invoke-direct {p0}, Lil/d;->f()V

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The number of released permits cannot be greater than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lil/d;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()Z
    .locals 3

    :cond_0
    :goto_0
    sget-object v0, Lil/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    iget v2, p0, Lil/d;->a:I

    if-le v1, v2, :cond_1

    invoke-direct {p0}, Lil/d;->f()V

    goto :goto_0

    :cond_1
    if-gtz v1, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    add-int/lit8 v2, v1, -0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method
