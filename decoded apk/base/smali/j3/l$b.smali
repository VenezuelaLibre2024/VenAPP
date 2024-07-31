.class Lj3/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Ly3/j;

.field final synthetic b:Lj3/l;


# direct methods
.method constructor <init>(Lj3/l;Ly3/j;)V
    .locals 0

    iput-object p1, p0, Lj3/l$b;->b:Lj3/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj3/l$b;->a:Ly3/j;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lj3/l$b;->a:Ly3/j;

    invoke-interface {v0}, Ly3/j;->f()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lj3/l$b;->b:Lj3/l;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lj3/l$b;->b:Lj3/l;

    iget-object v2, v2, Lj3/l;->a:Lj3/l$e;

    iget-object v3, p0, Lj3/l$b;->a:Ly3/j;

    invoke-virtual {v2, v3}, Lj3/l$e;->d(Ly3/j;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lj3/l$b;->b:Lj3/l;

    iget-object v2, v2, Lj3/l;->G:Lj3/p;

    invoke-virtual {v2}, Lj3/p;->a()V

    iget-object v2, p0, Lj3/l$b;->b:Lj3/l;

    iget-object v3, p0, Lj3/l$b;->a:Ly3/j;

    invoke-virtual {v2, v3}, Lj3/l;->f(Ly3/j;)V

    iget-object v2, p0, Lj3/l$b;->b:Lj3/l;

    iget-object v3, p0, Lj3/l$b;->a:Ly3/j;

    invoke-virtual {v2, v3}, Lj3/l;->r(Ly3/j;)V

    :cond_0
    iget-object v2, p0, Lj3/l$b;->b:Lj3/l;

    invoke-virtual {v2}, Lj3/l;->i()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception v2

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method
