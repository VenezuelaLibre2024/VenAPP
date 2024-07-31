.class final Lwi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwi/a$d;,
        Lwi/a$e;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ldm/b;

.field private final c:Lio/grpc/internal/c2;

.field private final d:Lwi/b$a;

.field private final e:I

.field private f:Z

.field private r:Z

.field private s:Z

.field private t:Ldm/v;

.field private u:Ljava/net/Socket;

.field private v:Z

.field private w:I

.field private x:I


# direct methods
.method private constructor <init>(Lio/grpc/internal/c2;Lwi/b$a;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lwi/a;->a:Ljava/lang/Object;

    new-instance v0, Ldm/b;

    invoke-direct {v0}, Ldm/b;-><init>()V

    iput-object v0, p0, Lwi/a;->b:Ldm/b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwi/a;->f:Z

    iput-boolean v0, p0, Lwi/a;->r:Z

    iput-boolean v0, p0, Lwi/a;->s:Z

    const-string v0, "executor"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/c2;

    iput-object p1, p0, Lwi/a;->c:Lio/grpc/internal/c2;

    const-string p1, "exceptionHandler"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwi/b$a;

    iput-object p1, p0, Lwi/a;->d:Lwi/b$a;

    iput p3, p0, Lwi/a;->e:I

    return-void
.end method

.method static synthetic a(Lwi/a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lwi/a;->a:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic b(Lwi/a;)Ldm/b;
    .locals 0

    iget-object p0, p0, Lwi/a;->b:Ldm/b;

    return-object p0
.end method

.method static synthetic e(Lwi/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lwi/a;->f:Z

    return p1
.end method

.method static synthetic f(Lwi/a;)I
    .locals 0

    iget p0, p0, Lwi/a;->x:I

    return p0
.end method

.method static synthetic g(Lwi/a;I)I
    .locals 1

    iget v0, p0, Lwi/a;->x:I

    sub-int/2addr v0, p1

    iput v0, p0, Lwi/a;->x:I

    return v0
.end method

.method static synthetic i(Lwi/a;)Ldm/v;
    .locals 0

    iget-object p0, p0, Lwi/a;->t:Ldm/v;

    return-object p0
.end method

.method static synthetic j(Lwi/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lwi/a;->r:Z

    return p1
.end method

.method static synthetic l(Lwi/a;)Lwi/b$a;
    .locals 0

    iget-object p0, p0, Lwi/a;->d:Lwi/b$a;

    return-object p0
.end method

.method static synthetic n(Lwi/a;)Ljava/net/Socket;
    .locals 0

    iget-object p0, p0, Lwi/a;->u:Ljava/net/Socket;

    return-object p0
.end method

.method static synthetic o(Lwi/a;)I
    .locals 2

    iget v0, p0, Lwi/a;->w:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lwi/a;->w:I

    return v0
.end method

.method static y(Lio/grpc/internal/c2;Lwi/b$a;I)Lwi/a;
    .locals 1

    new-instance v0, Lwi/a;

    invoke-direct {v0, p0, p1, p2}, Lwi/a;-><init>(Lio/grpc/internal/c2;Lwi/b$a;I)V

    return-object v0
.end method


# virtual methods
.method public K0(Ldm/b;J)V
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lwi/a;->s:Z

    if-nez v0, :cond_4

    const-string v0, "AsyncSink.write"

    invoke-static {v0}, Lcj/c;->f(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lwi/a;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lwi/a;->b:Ldm/b;

    invoke-virtual {v1, p1, p2, p3}, Ldm/b;->K0(Ldm/b;J)V

    iget p1, p0, Lwi/a;->x:I

    iget p2, p0, Lwi/a;->w:I

    add-int/2addr p1, p2

    iput p1, p0, Lwi/a;->x:I

    const/4 p2, 0x0

    iput p2, p0, Lwi/a;->w:I

    iget-boolean p3, p0, Lwi/a;->v:Z

    const/4 v1, 0x1

    if-nez p3, :cond_0

    iget p3, p0, Lwi/a;->e:I

    if-le p1, p3, :cond_0

    iput-boolean v1, p0, Lwi/a;->v:Z

    move p2, v1

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lwi/a;->f:Z

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lwi/a;->r:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lwi/a;->b:Ldm/b;

    invoke-virtual {p1}, Ldm/b;->g()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-gtz p1, :cond_1

    goto :goto_2

    :cond_1
    iput-boolean v1, p0, Lwi/a;->f:Z

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_2

    :try_start_2
    iget-object p1, p0, Lwi/a;->u:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_3
    iget-object p2, p0, Lwi/a;->d:Lwi/b$a;

    invoke-interface {p2, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    const-string p1, "AsyncSink.write"

    invoke-static {p1}, Lcj/c;->h(Ljava/lang/String;)V

    return-void

    :cond_2
    :try_start_4
    iget-object p1, p0, Lwi/a;->c:Lio/grpc/internal/c2;

    new-instance p2, Lwi/a$a;

    invoke-direct {p2, p0}, Lwi/a$a;-><init>(Lwi/a;)V

    invoke-virtual {p1, p2}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const-string p1, "AsyncSink.write"

    invoke-static {p1}, Lcj/c;->h(Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_2
    :try_start_5
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    const-string p2, "AsyncSink.write"

    invoke-static {p2}, Lcj/c;->h(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Lwi/a;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lwi/a;->s:Z

    iget-object v0, p0, Lwi/a;->c:Lio/grpc/internal/c2;

    new-instance v1, Lwi/a$c;

    invoke-direct {v1, p0}, Lwi/a$c;-><init>(Lwi/a;)V

    invoke-virtual {v0, v1}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public flush()V
    .locals 2

    iget-boolean v0, p0, Lwi/a;->s:Z

    if-nez v0, :cond_1

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lcj/c;->f(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lwi/a;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v1, p0, Lwi/a;->r:Z

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lcj/c;->h(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_2
    iput-boolean v1, p0, Lwi/a;->r:Z

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lwi/a;->c:Lio/grpc/internal/c2;

    new-instance v1, Lwi/a$b;

    invoke-direct {v1, p0}, Lwi/a$b;-><init>(Lwi/a;)V

    invoke-virtual {v0, v1}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lcj/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    const-string v1, "AsyncSink.flush"

    invoke-static {v1}, Lcj/c;->h(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()Ldm/y;
    .locals 1

    sget-object v0, Ldm/y;->e:Ldm/y;

    return-object v0
.end method

.method q(Ldm/v;Ljava/net/Socket;)V
    .locals 2

    iget-object v0, p0, Lwi/a;->t:Ldm/v;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "AsyncSink\'s becomeConnected should only be called once."

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    const-string v0, "sink"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldm/v;

    iput-object p1, p0, Lwi/a;->t:Ldm/v;

    const-string p1, "socket"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/Socket;

    iput-object p1, p0, Lwi/a;->u:Ljava/net/Socket;

    return-void
.end method

.method r(Lxi/c;)Lxi/c;
    .locals 1

    new-instance v0, Lwi/a$d;

    invoke-direct {v0, p0, p1}, Lwi/a$d;-><init>(Lwi/a;Lxi/c;)V

    return-object v0
.end method
