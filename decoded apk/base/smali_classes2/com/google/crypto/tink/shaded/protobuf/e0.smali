.class public Lcom/google/crypto/tink/shaded/protobuf/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Lcom/google/crypto/tink/shaded/protobuf/p;


# instance fields
.field private a:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private b:Lcom/google/crypto/tink/shaded/protobuf/p;

.field protected volatile c:Lcom/google/crypto/tink/shaded/protobuf/r0;

.field private volatile d:Lcom/google/crypto/tink/shaded/protobuf/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/e0;->e:Lcom/google/crypto/tink/shaded/protobuf/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    if-eqz v0, :cond_1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/r0;->g()Lcom/google/crypto/tink/shaded/protobuf/z0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->b:Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-interface {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/z0;->b(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/r0;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    :goto_0
    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/r0;->c()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-object p1
.end method

.method public d(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-object v0
.end method

.method public e()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    monitor-exit p0

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    if-nez v0, :cond_3

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    :goto_0
    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/r0;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/e0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/e0;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/r0;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->e()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->e()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->e()Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->c(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, Lcom/google/crypto/tink/shaded/protobuf/s0;->e()Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->c(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
