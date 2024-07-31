.class public final Ldm/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/c;


# instance fields
.field public final a:Ldm/v;

.field public final b:Ldm/b;

.field public c:Z


# direct methods
.method public constructor <init>(Ldm/v;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldm/q;->a:Ldm/v;

    new-instance p1, Ldm/b;

    invoke-direct {p1}, Ldm/b;-><init>()V

    iput-object p1, p0, Ldm/q;->b:Ldm/b;

    return-void
.end method


# virtual methods
.method public E0(Ldm/x;)J
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, Ldm/q;->b:Ldm/b;

    const-wide/16 v3, 0x2000

    invoke-interface {p1, v2, v3, v4}, Ldm/x;->s1(Ldm/b;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    add-long/2addr v0, v2

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public K0(Ldm/b;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1, p2, p3}, Ldm/b;->K0(Ldm/b;J)V

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public T(Ljava/lang/String;)Ldm/c;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->c1(Ljava/lang/String;)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Z0(J)Ldm/c;
    .locals 1

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1, p2}, Ldm/b;->L0(J)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Ldm/c;
    .locals 4

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0}, Ldm/b;->g()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, Ldm/q;->a:Ldm/v;

    iget-object v3, p0, Ldm/q;->b:Ldm/b;

    invoke-interface {v2, v3, v0, v1}, Ldm/v;->K0(Ldm/b;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b0(Ldm/e;)Ldm/c;
    .locals 1

    const-string v0, "byteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->B0(Ldm/e;)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Ldm/b;
    .locals 1

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    return-object v0
.end method

.method public close()V
    .locals 4

    iget-boolean v0, p0, Ldm/q;->c:Z

    if-nez v0, :cond_3

    :try_start_0
    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0}, Ldm/b;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Ldm/q;->a:Ldm/v;

    iget-object v1, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v1}, Ldm/b;->size()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Ldm/v;->K0(Ldm/b;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    :try_start_1
    iget-object v1, p0, Ldm/q;->a:Ldm/v;

    invoke-interface {v1}, Ldm/v;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    :goto_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Ldm/q;->c:Z

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    throw v0

    :cond_3
    :goto_2
    return-void
.end method

.method public flush()V
    .locals 4

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0}, Ldm/b;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Ldm/q;->a:Ldm/v;

    iget-object v1, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v1}, Ldm/b;->size()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Ldm/v;->K0(Ldm/b;J)V

    :cond_0
    iget-object v0, p0, Ldm/q;->a:Ldm/v;

    invoke-interface {v0}, Ldm/v;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public m()Ldm/y;
    .locals 1

    iget-object v0, p0, Ldm/q;->a:Ldm/v;

    invoke-interface {v0}, Ldm/v;->m()Ldm/y;

    move-result-object v0

    return-object v0
.end method

.method public s0(J)Ldm/c;
    .locals 1

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1, p2}, Ldm/b;->J0(J)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldm/q;->a:Ldm/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([B)Ldm/c;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->D0([B)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)Ldm/c;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1, p2, p3}, Ldm/b;->F0([BII)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeByte(I)Ldm/c;
    .locals 1

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->I0(I)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeInt(I)Ldm/c;
    .locals 1

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->T0(I)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeShort(I)Ldm/c;
    .locals 1

    iget-boolean v0, p0, Ldm/q;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldm/q;->b:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->W0(I)Ldm/b;

    invoke-virtual {p0}, Ldm/q;->a()Ldm/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
