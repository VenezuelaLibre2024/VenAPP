.class public final Lue/b;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/OutputStream;

.field private final b:Lcom/google/firebase/perf/util/l;

.field c:Lse/h;

.field d:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lse/h;Lcom/google/firebase/perf/util/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lue/b;->d:J

    iput-object p1, p0, Lue/b;->a:Ljava/io/OutputStream;

    iput-object p2, p0, Lue/b;->c:Lse/h;

    iput-object p3, p0, Lue/b;->b:Lcom/google/firebase/perf/util/l;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    iget-wide v0, p0, Lue/b;->d:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lue/b;->c:Lse/h;

    invoke-virtual {v2, v0, v1}, Lse/h;->p(J)Lse/h;

    :cond_0
    iget-object v0, p0, Lue/b;->c:Lse/h;

    iget-object v1, p0, Lue/b;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v1}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lse/h;->u(J)Lse/h;

    :try_start_0
    iget-object v0, p0, Lue/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lue/b;->c:Lse/h;

    iget-object v2, p0, Lue/b;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v2}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lse/h;->v(J)Lse/h;

    iget-object v1, p0, Lue/b;->c:Lse/h;

    invoke-static {v1}, Lue/d;->d(Lse/h;)V

    throw v0
.end method

.method public flush()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lue/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lue/b;->c:Lse/h;

    iget-object v2, p0, Lue/b;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v2}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lse/h;->v(J)Lse/h;

    iget-object v1, p0, Lue/b;->c:Lse/h;

    invoke-static {v1}, Lue/d;->d(Lse/h;)V

    throw v0
.end method

.method public write(I)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lue/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget-wide v0, p0, Lue/b;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lue/b;->d:J

    iget-object p1, p0, Lue/b;->c:Lse/h;

    invoke-virtual {p1, v0, v1}, Lse/h;->p(J)Lse/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lue/b;->c:Lse/h;

    iget-object v1, p0, Lue/b;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v1}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lse/h;->v(J)Lse/h;

    iget-object v0, p0, Lue/b;->c:Lse/h;

    invoke-static {v0}, Lue/d;->d(Lse/h;)V

    throw p1
.end method

.method public write([B)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lue/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget-wide v0, p0, Lue/b;->d:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lue/b;->d:J

    iget-object p1, p0, Lue/b;->c:Lse/h;

    invoke-virtual {p1, v0, v1}, Lse/h;->p(J)Lse/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lue/b;->c:Lse/h;

    iget-object v1, p0, Lue/b;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v1}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lse/h;->v(J)Lse/h;

    iget-object v0, p0, Lue/b;->c:Lse/h;

    invoke-static {v0}, Lue/d;->d(Lse/h;)V

    throw p1
.end method

.method public write([BII)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lue/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget-wide p1, p0, Lue/b;->d:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lue/b;->d:J

    iget-object p3, p0, Lue/b;->c:Lse/h;

    invoke-virtual {p3, p1, p2}, Lse/h;->p(J)Lse/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lue/b;->c:Lse/h;

    iget-object p3, p0, Lue/b;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {p3}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lse/h;->v(J)Lse/h;

    iget-object p2, p0, Lue/b;->c:Lse/h;

    invoke-static {p2}, Lue/d;->d(Lse/h;)V

    throw p1
.end method
