.class public final Lz0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Ly0/b;Lok/l;Lzk/k0;)Lrk/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ly0/b<",
            "La1/d;",
            ">;",
            "Lok/l<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lx0/d<",
            "La1/d;",
            ">;>;>;",
            "Lzk/k0;",
            ")",
            "Lrk/a<",
            "Landroid/content/Context;",
            "Lx0/f<",
            "La1/d;",
            ">;>;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceMigrations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz0/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lz0/c;-><init>(Ljava/lang/String;Ly0/b;Lok/l;Lzk/k0;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;Ly0/b;Lok/l;Lzk/k0;ILjava/lang/Object;)Lrk/a;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, Lz0/a$a;->a:Lz0/a$a;

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    invoke-static {}, Lzk/a1;->b()Lzk/h0;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {v0, p4, v0}, Lzk/q2;->b(Lzk/w1;ILjava/lang/Object;)Lzk/y;

    move-result-object p4

    invoke-virtual {p3, p4}, Lgk/a;->U(Lgk/f;)Lgk/f;

    move-result-object p3

    invoke-static {p3}, Lzk/l0;->a(Lgk/f;)Lzk/k0;

    move-result-object p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lz0/a;->a(Ljava/lang/String;Ly0/b;Lok/l;Lzk/k0;)Lrk/a;

    move-result-object p0

    return-object p0
.end method
