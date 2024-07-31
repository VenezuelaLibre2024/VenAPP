.class public Le2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;
    .locals 1

    invoke-static {}, Landroidx/webkit/internal/k1;->c()Landroidx/webkit/internal/r1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/webkit/internal/r1;->f(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/webkit/WebSettings;)I
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->d:Landroidx/webkit/internal/a$c;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/webkit/internal/d;->f(Landroid/webkit/WebSettings;)I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->a()I

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static c(Landroid/webkit/WebSettings;)Z
    .locals 1

    sget-object v0, Landroidx/webkit/internal/j1;->Z:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->b()Z

    move-result p0

    return p0

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static d(Landroid/webkit/WebSettings;)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->T:Landroidx/webkit/internal/a$h;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$h;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/webkit/internal/k0;->a(Landroid/webkit/WebSettings;)I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->c()I

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static e(Landroid/webkit/WebSettings;)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->U:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->c()I

    move-result p0

    return p0

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static f(Landroid/webkit/WebSettings;)Z
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->b:Landroidx/webkit/internal/a$b;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/webkit/internal/c;->g(Landroid/webkit/WebSettings;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->d()Z

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static g(Landroid/webkit/WebSettings;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebSettings;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->b0:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->e()Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static h(Landroid/webkit/WebSettings;)Z
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->c:Landroidx/webkit/internal/a$e;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$e;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/webkit/internal/j;->b(Landroid/webkit/WebSettings;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->f()Z

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static i(Landroid/webkit/WebSettings;)Z
    .locals 1

    sget-object v0, Landroidx/webkit/internal/j1;->P:Landroidx/webkit/internal/a$i;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->g()Z

    move-result p0

    return p0

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static j(Landroid/webkit/WebSettings;Z)V
    .locals 1

    sget-object v0, Landroidx/webkit/internal/j1;->P:Landroidx/webkit/internal/a$i;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->h(Z)V

    return-void

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static k(Landroid/webkit/WebSettings;I)V
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->d:Landroidx/webkit/internal/a$c;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Landroidx/webkit/internal/d;->o(Landroid/webkit/WebSettings;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->i(I)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static l(Landroid/webkit/WebSettings;Z)V
    .locals 1

    sget-object v0, Landroidx/webkit/internal/j1;->Z:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->j(Z)V

    return-void

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static m(Landroid/webkit/WebSettings;I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->T:Landroidx/webkit/internal/a$h;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$h;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Landroidx/webkit/internal/k0;->d(Landroid/webkit/WebSettings;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->k(I)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static n(Landroid/webkit/WebSettings;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->U:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->l(I)V

    return-void

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static o(Landroid/webkit/WebSettings;Z)V
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->b:Landroidx/webkit/internal/a$b;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Landroidx/webkit/internal/c;->k(Landroid/webkit/WebSettings;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->m(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static p(Landroid/webkit/WebSettings;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebSettings;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->b0:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->n(Ljava/util/Set;)V

    return-void

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static q(Landroid/webkit/WebSettings;Z)V
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->c:Landroidx/webkit/internal/a$e;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$e;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Landroidx/webkit/internal/j;->e(Landroid/webkit/WebSettings;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->o(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static r(Landroid/webkit/WebSettings;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->R:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/webkit/internal/i1;->p(Z)V

    return-void

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static s(Landroid/webkit/WebSettings;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Landroidx/webkit/internal/j1;->R:Landroidx/webkit/internal/a$d;

    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le2/q;->a(Landroid/webkit/WebSettings;)Landroidx/webkit/internal/i1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/i1;->q()Z

    move-result p0

    return p0

    :cond_0
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method
