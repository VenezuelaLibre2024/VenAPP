.class final Lwi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwi/b$a;
    }
.end annotation


# static fields
.field private static final d:Ljava/util/logging/Logger;


# instance fields
.field private final a:Lwi/b$a;

.field private final b:Lxi/c;

.field private final c:Lwi/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lwi/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lwi/b;->d:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Lwi/b$a;Lxi/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwi/j;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-class v2, Lwi/i;

    invoke-direct {v0, v1, v2}, Lwi/j;-><init>(Ljava/util/logging/Level;Ljava/lang/Class;)V

    iput-object v0, p0, Lwi/b;->c:Lwi/j;

    const-string v0, "transportExceptionHandler"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwi/b$a;

    iput-object p1, p0, Lwi/b;->a:Lwi/b$a;

    const-string p1, "frameWriter"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxi/c;

    iput-object p1, p0, Lwi/b;->b:Lxi/c;

    return-void
.end method

.method static a(Ljava/lang/Throwable;)Ljava/util/logging/Level;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Ljava/io/IOException;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    return-object p0

    :cond_0
    sget-object p0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    return-object p0
.end method


# virtual methods
.method public F(ILxi/a;[B)V
    .locals 3

    iget-object v0, p0, Lwi/b;->c:Lwi/j;

    sget-object v1, Lwi/j$a;->OUTBOUND:Lwi/j$a;

    invoke-static {p3}, Ldm/e;->u([B)Ldm/e;

    move-result-object v2

    invoke-virtual {v0, v1, p1, p2, v2}, Lwi/j;->c(Lwi/j$a;ILxi/a;Ldm/e;)V

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0, p1, p2, p3}, Lxi/c;->F(ILxi/a;[B)V

    iget-object p1, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {p1}, Lxi/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {p2, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public G()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0}, Lxi/c;->G()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {v1, v0}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public P0(Lxi/i;)V
    .locals 2

    iget-object v0, p0, Lwi/b;->c:Lwi/j;

    sget-object v1, Lwi/j$a;->OUTBOUND:Lwi/j$a;

    invoke-virtual {v0, v1, p1}, Lwi/j;->i(Lwi/j$a;Lxi/i;)V

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0, p1}, Lxi/c;->P0(Lxi/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {v0, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public X0(ZILdm/b;I)V
    .locals 6

    iget-object v0, p0, Lwi/b;->c:Lwi/j;

    sget-object v1, Lwi/j$a;->OUTBOUND:Lwi/j$a;

    invoke-virtual {p3}, Ldm/b;->a()Ldm/b;

    move-result-object v3

    move v2, p2

    move v4, p4

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lwi/j;->b(Lwi/j$a;ILdm/b;IZ)V

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0, p1, p2, p3, p4}, Lxi/c;->X0(ZILdm/b;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {p2, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public close()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lwi/b;->d:Ljava/util/logging/Logger;

    invoke-static {v0}, Lwi/b;->a(Ljava/lang/Throwable;)Ljava/util/logging/Level;

    move-result-object v2

    const-string v3, "Failed closing connection"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public d(IJ)V
    .locals 2

    iget-object v0, p0, Lwi/b;->c:Lwi/j;

    sget-object v1, Lwi/j$a;->OUTBOUND:Lwi/j$a;

    invoke-virtual {v0, v1, p1, p2, p3}, Lwi/j;->k(Lwi/j$a;IJ)V

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0, p1, p2, p3}, Lxi/c;->d(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {p2, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public flush()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0}, Lxi/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {v1, v0}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public h(ZII)V
    .locals 9

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    iget-object v3, p0, Lwi/b;->c:Lwi/j;

    sget-object v4, Lwi/j$a;->OUTBOUND:Lwi/j$a;

    int-to-long v5, p2

    shl-long/2addr v5, v2

    int-to-long v7, p3

    and-long/2addr v0, v7

    or-long/2addr v0, v5

    if-eqz p1, :cond_0

    invoke-virtual {v3, v4, v0, v1}, Lwi/j;->f(Lwi/j$a;J)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v4, v0, v1}, Lwi/j;->e(Lwi/j$a;J)V

    :goto_0
    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0, p1, p2, p3}, Lxi/c;->h(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {p2, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public o1(Lxi/i;)V
    .locals 2

    iget-object v0, p0, Lwi/b;->c:Lwi/j;

    sget-object v1, Lwi/j$a;->OUTBOUND:Lwi/j$a;

    invoke-virtual {v0, v1}, Lwi/j;->j(Lwi/j$a;)V

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0, p1}, Lxi/c;->o1(Lxi/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {v0, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public p0()I
    .locals 1

    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0}, Lxi/c;->p0()I

    move-result v0

    return v0
.end method

.method public r1(ZZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lxi/c;->r1(ZZIILjava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {p2, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public s(ILxi/a;)V
    .locals 2

    iget-object v0, p0, Lwi/b;->c:Lwi/j;

    sget-object v1, Lwi/j$a;->OUTBOUND:Lwi/j$a;

    invoke-virtual {v0, v1, p1, p2}, Lwi/j;->h(Lwi/j$a;ILxi/a;)V

    :try_start_0
    iget-object v0, p0, Lwi/b;->b:Lxi/c;

    invoke-interface {v0, p1, p2}, Lxi/c;->s(ILxi/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lwi/b;->a:Lwi/b$a;

    invoke-interface {p2, p1}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
