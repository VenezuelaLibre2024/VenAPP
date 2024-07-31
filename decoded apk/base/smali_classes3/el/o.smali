.class public final Lel/o;
.super Lzk/h0;
.source "SourceFile"

# interfaces
.implements Lzk/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lel/o$a;
    }
.end annotation


# static fields
.field private static final s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final c:Lzk/h0;

.field private final d:I

.field private final synthetic e:Lzk/t0;

.field private final f:Lel/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lel/t<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lel/o;

    const-string v1, "runningWorkers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lel/o;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lzk/h0;I)V
    .locals 0

    invoke-direct {p0}, Lzk/h0;-><init>()V

    iput-object p1, p0, Lel/o;->c:Lzk/h0;

    iput p2, p0, Lel/o;->d:I

    instance-of p2, p1, Lzk/t0;

    if-eqz p2, :cond_0

    check-cast p1, Lzk/t0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Lzk/q0;->a()Lzk/t0;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lel/o;->e:Lzk/t0;

    new-instance p1, Lel/t;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lel/t;-><init>(Z)V

    iput-object p1, p0, Lel/o;->f:Lel/t;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lel/o;->r:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic I0(Lel/o;)Lzk/h0;
    .locals 0

    iget-object p0, p0, Lel/o;->c:Lzk/h0;

    return-object p0
.end method

.method public static final synthetic J0(Lel/o;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0}, Lel/o;->L0()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method private final L0()Ljava/lang/Runnable;
    .locals 3

    :goto_0
    iget-object v0, p0, Lel/o;->f:Lel/t;

    invoke-virtual {v0}, Lel/t;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lel/o;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lel/o;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v2, p0, Lel/o;->f:Lel/t;

    invoke-virtual {v2}, Lel/t;->c()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method private final R0()Z
    .locals 4

    iget-object v0, p0, Lel/o;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lel/o;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    iget v3, p0, Lel/o;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v2, v3, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public D0(Lgk/f;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, Lel/o;->f:Lel/t;

    invoke-virtual {p1, p2}, Lel/t;->a(Ljava/lang/Object;)Z

    sget-object p1, Lel/o;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lel/o;->d:I

    if-ge p1, p2, :cond_1

    invoke-direct {p0}, Lel/o;->R0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lel/o;->L0()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lel/o$a;

    invoke-direct {p2, p0, p1}, Lel/o$a;-><init>(Lel/o;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lel/o;->c:Lzk/h0;

    invoke-virtual {p1, p0, p2}, Lzk/h0;->D0(Lgk/f;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public o(JLjava/lang/Runnable;Lgk/f;)Lzk/c1;
    .locals 1

    iget-object v0, p0, Lel/o;->e:Lzk/t0;

    invoke-interface {v0, p1, p2, p3, p4}, Lzk/t0;->o(JLjava/lang/Runnable;Lgk/f;)Lzk/c1;

    move-result-object p1

    return-object p1
.end method
