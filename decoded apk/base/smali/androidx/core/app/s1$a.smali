.class Landroidx/core/app/s1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/s1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method static a(Landroid/app/Person;)Landroidx/core/app/s1;
    .locals 2

    new-instance v0, Landroidx/core/app/s1$b;

    invoke-direct {v0}, Landroidx/core/app/s1$b;-><init>()V

    invoke-static {p0}, Landroidx/core/app/p1;->a(Landroid/app/Person;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/s1$b;->f(Ljava/lang/CharSequence;)Landroidx/core/app/s1$b;

    move-result-object v0

    invoke-static {p0}, Landroidx/core/app/q1;->a(Landroid/app/Person;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/core/app/q1;->a(Landroid/app/Person;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/core/app/s1$b;->c(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/s1$b;

    move-result-object v0

    invoke-static {p0}, Landroidx/core/app/r1;->a(Landroid/app/Person;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/s1$b;->g(Ljava/lang/String;)Landroidx/core/app/s1$b;

    move-result-object v0

    invoke-static {p0}, Landroidx/core/app/g1;->a(Landroid/app/Person;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/s1$b;->e(Ljava/lang/String;)Landroidx/core/app/s1$b;

    move-result-object v0

    invoke-static {p0}, Landroidx/core/app/h1;->a(Landroid/app/Person;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/s1$b;->b(Z)Landroidx/core/app/s1$b;

    move-result-object v0

    invoke-static {p0}, Landroidx/core/app/i1;->a(Landroid/app/Person;)Z

    move-result p0

    invoke-virtual {v0, p0}, Landroidx/core/app/s1$b;->d(Z)Landroidx/core/app/s1$b;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/core/app/s1$b;->a()Landroidx/core/app/s1;

    move-result-object p0

    return-object p0
.end method

.method static b(Landroidx/core/app/s1;)Landroid/app/Person;
    .locals 2

    new-instance v0, Landroid/app/Person$Builder;

    invoke-direct {v0}, Landroid/app/Person$Builder;-><init>()V

    invoke-virtual {p0}, Landroidx/core/app/s1;->e()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/app/f1;->a(Landroid/app/Person$Builder;Ljava/lang/CharSequence;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/app/s1;->c()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/core/app/s1;->c()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->u()Landroid/graphics/drawable/Icon;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Landroidx/core/app/j1;->a(Landroid/app/Person$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/app/s1;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/app/k1;->a(Landroid/app/Person$Builder;Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/app/s1;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/app/l1;->a(Landroid/app/Person$Builder;Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/app/s1;->g()Z

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/app/m1;->a(Landroid/app/Person$Builder;Z)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/app/s1;->h()Z

    move-result p0

    invoke-static {v0, p0}, Landroidx/core/app/n1;->a(Landroid/app/Person$Builder;Z)Landroid/app/Person$Builder;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/app/o1;->a(Landroid/app/Person$Builder;)Landroid/app/Person;

    move-result-object p0

    return-object p0
.end method
