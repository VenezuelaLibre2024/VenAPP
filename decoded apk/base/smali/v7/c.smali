.class public final Lv7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/k0;


# instance fields
.field private final a:Ly6/p;

.field private b:Ly6/k;

.field private c:Ly6/l;


# direct methods
.method public constructor <init>(Ly6/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/c;->a:Ly6/p;

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    iget-object v0, p0, Lv7/c;->b:Ly6/k;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/k;

    invoke-interface {v0, p1, p2, p3, p4}, Ly6/k;->a(JJ)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lv7/c;->b:Ly6/k;

    instance-of v1, v0, Lf7/f;

    if-eqz v1, :cond_0

    check-cast v0, Lf7/f;

    invoke-virtual {v0}, Lf7/f;->j()V

    :cond_0
    return-void
.end method

.method public c(Ly6/y;)I
    .locals 2

    iget-object v0, p0, Lv7/c;->b:Ly6/k;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/k;

    iget-object v1, p0, Lv7/c;->c:Ly6/l;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly6/l;

    invoke-interface {v0, v1, p1}, Ly6/k;->f(Ly6/l;Ly6/y;)I

    move-result p1

    return p1
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lv7/c;->c:Ly6/l;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly6/l;->getPosition()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method public e(Ls8/h;Landroid/net/Uri;Ljava/util/Map;JJLy6/m;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/h;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;JJ",
            "Ly6/m;",
            ")V"
        }
    .end annotation

    new-instance v6, Ly6/e;

    move-object v0, v6

    move-object v1, p1

    move-wide v2, p4

    move-wide v4, p6

    invoke-direct/range {v0 .. v5}, Ly6/e;-><init>(Ls8/h;JJ)V

    iput-object v6, p0, Lv7/c;->c:Ly6/l;

    iget-object p1, p0, Lv7/c;->b:Ly6/k;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lv7/c;->a:Ly6/p;

    invoke-interface {p1, p2, p3}, Ly6/p;->b(Landroid/net/Uri;Ljava/util/Map;)[Ly6/k;

    move-result-object p1

    array-length p3, p1

    const/4 p6, 0x0

    const/4 p7, 0x1

    if-ne p3, p7, :cond_1

    aget-object p1, p1, p6

    iput-object p1, p0, Lv7/c;->b:Ly6/k;

    goto :goto_4

    :cond_1
    array-length p3, p1

    move v0, p6

    :goto_0
    if-ge v0, p3, :cond_7

    aget-object v1, p1, v0

    :try_start_0
    invoke-interface {v1, v6}, Ly6/k;->e(Ly6/l;)Z

    move-result v2

    if-eqz v2, :cond_2

    iput-object v1, p0, Lv7/c;->b:Ly6/k;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p7}, Lt8/a;->g(Z)V

    invoke-interface {v6}, Ly6/l;->f()V

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lv7/c;->b:Ly6/k;

    if-nez v1, :cond_6

    invoke-interface {v6}, Ly6/l;->getPosition()J

    move-result-wide v1

    cmp-long v1, v1, p4

    if-nez v1, :cond_5

    goto :goto_1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lv7/c;->b:Ly6/k;

    if-nez p2, :cond_3

    invoke-interface {v6}, Ly6/l;->getPosition()J

    move-result-wide p2

    cmp-long p2, p2, p4

    if-nez p2, :cond_4

    :cond_3
    move p6, p7

    :cond_4
    invoke-static {p6}, Lt8/a;->g(Z)V

    invoke-interface {v6}, Ly6/l;->f()V

    throw p1

    :catch_0
    iget-object v1, p0, Lv7/c;->b:Ly6/k;

    if-nez v1, :cond_6

    invoke-interface {v6}, Ly6/l;->getPosition()J

    move-result-wide v1

    cmp-long v1, v1, p4

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    move v1, p6

    goto :goto_2

    :cond_6
    :goto_1
    move v1, p7

    :goto_2
    invoke-static {v1}, Lt8/a;->g(Z)V

    invoke-interface {v6}, Ly6/l;->f()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    :goto_3
    iget-object p3, p0, Lv7/c;->b:Ly6/k;

    if-eqz p3, :cond_8

    :goto_4
    iget-object p1, p0, Lv7/c;->b:Ly6/k;

    invoke-interface {p1, p8}, Ly6/k;->b(Ly6/m;)V

    return-void

    :cond_8
    new-instance p3, Lv7/g1;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "None of the available extractors ("

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lt8/r0;->M([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") could read the stream."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/net/Uri;

    invoke-direct {p3, p1, p2}, Lv7/g1;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    throw p3
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lv7/c;->b:Ly6/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly6/k;->release()V

    iput-object v1, p0, Lv7/c;->b:Ly6/k;

    :cond_0
    iput-object v1, p0, Lv7/c;->c:Ly6/l;

    return-void
.end method
