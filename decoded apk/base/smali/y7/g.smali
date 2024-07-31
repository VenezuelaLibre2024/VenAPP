.class public final Ly7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lz7/j;Ljava/lang/String;Lz7/i;I)Ls8/n;
    .locals 2

    new-instance v0, Ls8/n$b;

    invoke-direct {v0}, Ls8/n$b;-><init>()V

    invoke-virtual {p2, p1}, Lz7/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls8/n$b;->i(Landroid/net/Uri;)Ls8/n$b;

    move-result-object p1

    iget-wide v0, p2, Lz7/i;->a:J

    invoke-virtual {p1, v0, v1}, Ls8/n$b;->h(J)Ls8/n$b;

    move-result-object p1

    iget-wide v0, p2, Lz7/i;->b:J

    invoke-virtual {p1, v0, v1}, Ls8/n$b;->g(J)Ls8/n$b;

    move-result-object p1

    invoke-static {p0, p2}, Ly7/g;->b(Lz7/j;Lz7/i;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ls8/n$b;->f(Ljava/lang/String;)Ls8/n$b;

    move-result-object p0

    invoke-virtual {p0, p3}, Ls8/n$b;->b(I)Ls8/n$b;

    move-result-object p0

    invoke-virtual {p0}, Ls8/n$b;->a()Ls8/n;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lz7/j;Lz7/i;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lz7/j;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lz7/j;->c:Lcom/google/common/collect/w;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz7/b;

    iget-object p0, p0, Lz7/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p0}, Lz7/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
