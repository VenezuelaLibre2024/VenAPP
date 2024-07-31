.class final Lyg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkg/b;

.field private final b:Ldg/s;

.field private final c:Ldg/s;

.field private final d:Ldg/s;

.field private final e:Ldg/s;

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I


# direct methods
.method constructor <init>(Lkg/b;Ldg/s;Ldg/s;Ldg/s;Ldg/s;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    if-eqz p4, :cond_2

    if-nez p5, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    if-eqz v2, :cond_5

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {}, Ldg/m;->a()Ldg/m;

    move-result-object p1

    throw p1

    :cond_5
    :goto_2
    if-eqz v2, :cond_6

    new-instance p2, Ldg/s;

    invoke-virtual {p4}, Ldg/s;->d()F

    move-result p3

    const/4 v0, 0x0

    invoke-direct {p2, v0, p3}, Ldg/s;-><init>(FF)V

    new-instance p3, Ldg/s;

    invoke-virtual {p5}, Ldg/s;->d()F

    move-result v1

    invoke-direct {p3, v0, v1}, Ldg/s;-><init>(FF)V

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    new-instance p4, Ldg/s;

    invoke-virtual {p1}, Lkg/b;->m()I

    move-result p5

    sub-int/2addr p5, v1

    int-to-float p5, p5

    invoke-virtual {p2}, Ldg/s;->d()F

    move-result v0

    invoke-direct {p4, p5, v0}, Ldg/s;-><init>(FF)V

    new-instance p5, Ldg/s;

    invoke-virtual {p1}, Lkg/b;->m()I

    move-result v0

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p3}, Ldg/s;->d()F

    move-result v1

    invoke-direct {p5, v0, v1}, Ldg/s;-><init>(FF)V

    :cond_7
    :goto_3
    iput-object p1, p0, Lyg/c;->a:Lkg/b;

    iput-object p2, p0, Lyg/c;->b:Ldg/s;

    iput-object p3, p0, Lyg/c;->c:Ldg/s;

    iput-object p4, p0, Lyg/c;->d:Ldg/s;

    iput-object p5, p0, Lyg/c;->e:Ldg/s;

    invoke-virtual {p2}, Ldg/s;->c()F

    move-result p1

    invoke-virtual {p3}, Ldg/s;->c()F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lyg/c;->f:I

    invoke-virtual {p4}, Ldg/s;->c()F

    move-result p1

    invoke-virtual {p5}, Ldg/s;->c()F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lyg/c;->g:I

    invoke-virtual {p2}, Ldg/s;->d()F

    move-result p1

    invoke-virtual {p4}, Ldg/s;->d()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lyg/c;->h:I

    invoke-virtual {p3}, Ldg/s;->d()F

    move-result p1

    invoke-virtual {p5}, Ldg/s;->d()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lyg/c;->i:I

    return-void
.end method

.method constructor <init>(Lyg/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lyg/c;->a:Lkg/b;

    iput-object v0, p0, Lyg/c;->a:Lkg/b;

    iget-object v0, p1, Lyg/c;->b:Ldg/s;

    iput-object v0, p0, Lyg/c;->b:Ldg/s;

    iget-object v0, p1, Lyg/c;->c:Ldg/s;

    iput-object v0, p0, Lyg/c;->c:Ldg/s;

    iget-object v0, p1, Lyg/c;->d:Ldg/s;

    iput-object v0, p0, Lyg/c;->d:Ldg/s;

    iget-object v0, p1, Lyg/c;->e:Ldg/s;

    iput-object v0, p0, Lyg/c;->e:Ldg/s;

    iget v0, p1, Lyg/c;->f:I

    iput v0, p0, Lyg/c;->f:I

    iget v0, p1, Lyg/c;->g:I

    iput v0, p0, Lyg/c;->g:I

    iget v0, p1, Lyg/c;->h:I

    iput v0, p0, Lyg/c;->h:I

    iget p1, p1, Lyg/c;->i:I

    iput p1, p0, Lyg/c;->i:I

    return-void
.end method

.method static j(Lyg/c;Lyg/c;)Lyg/c;
    .locals 7

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance v6, Lyg/c;

    iget-object v1, p0, Lyg/c;->a:Lkg/b;

    iget-object v2, p0, Lyg/c;->b:Ldg/s;

    iget-object v3, p0, Lyg/c;->c:Ldg/s;

    iget-object v4, p1, Lyg/c;->d:Ldg/s;

    iget-object v5, p1, Lyg/c;->e:Ldg/s;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lyg/c;-><init>(Lkg/b;Ldg/s;Ldg/s;Ldg/s;Ldg/s;)V

    return-object v6
.end method


# virtual methods
.method a(IIZ)Lyg/c;
    .locals 12

    iget-object v0, p0, Lyg/c;->b:Ldg/s;

    iget-object v1, p0, Lyg/c;->c:Ldg/s;

    iget-object v2, p0, Lyg/c;->d:Ldg/s;

    iget-object v3, p0, Lyg/c;->e:Ldg/s;

    if-lez p1, :cond_3

    if-eqz p3, :cond_0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual {v4}, Ldg/s;->d()F

    move-result v5

    float-to-int v5, v5

    sub-int/2addr v5, p1

    if-gez v5, :cond_1

    const/4 v5, 0x0

    :cond_1
    new-instance p1, Ldg/s;

    invoke-virtual {v4}, Ldg/s;->c()F

    move-result v4

    int-to-float v5, v5

    invoke-direct {p1, v4, v5}, Ldg/s;-><init>(FF)V

    if-eqz p3, :cond_2

    move-object v8, p1

    goto :goto_1

    :cond_2
    move-object v10, p1

    move-object v8, v0

    goto :goto_2

    :cond_3
    move-object v8, v0

    :goto_1
    move-object v10, v2

    :goto_2
    if-lez p2, :cond_7

    if-eqz p3, :cond_4

    iget-object p1, p0, Lyg/c;->c:Ldg/s;

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lyg/c;->e:Ldg/s;

    :goto_3
    invoke-virtual {p1}, Ldg/s;->d()F

    move-result v0

    float-to-int v0, v0

    add-int/2addr v0, p2

    iget-object p2, p0, Lyg/c;->a:Lkg/b;

    invoke-virtual {p2}, Lkg/b;->j()I

    move-result p2

    if-lt v0, p2, :cond_5

    iget-object p2, p0, Lyg/c;->a:Lkg/b;

    invoke-virtual {p2}, Lkg/b;->j()I

    move-result p2

    add-int/lit8 v0, p2, -0x1

    :cond_5
    new-instance p2, Ldg/s;

    invoke-virtual {p1}, Ldg/s;->c()F

    move-result p1

    int-to-float v0, v0

    invoke-direct {p2, p1, v0}, Ldg/s;-><init>(FF)V

    if-eqz p3, :cond_6

    move-object v9, p2

    goto :goto_4

    :cond_6
    move-object v11, p2

    move-object v9, v1

    goto :goto_5

    :cond_7
    move-object v9, v1

    :goto_4
    move-object v11, v3

    :goto_5
    new-instance p1, Lyg/c;

    iget-object v7, p0, Lyg/c;->a:Lkg/b;

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Lyg/c;-><init>(Lkg/b;Ldg/s;Ldg/s;Ldg/s;Ldg/s;)V

    return-object p1
.end method

.method b()Ldg/s;
    .locals 1

    iget-object v0, p0, Lyg/c;->c:Ldg/s;

    return-object v0
.end method

.method c()Ldg/s;
    .locals 1

    iget-object v0, p0, Lyg/c;->e:Ldg/s;

    return-object v0
.end method

.method d()I
    .locals 1

    iget v0, p0, Lyg/c;->g:I

    return v0
.end method

.method e()I
    .locals 1

    iget v0, p0, Lyg/c;->i:I

    return v0
.end method

.method f()I
    .locals 1

    iget v0, p0, Lyg/c;->f:I

    return v0
.end method

.method g()I
    .locals 1

    iget v0, p0, Lyg/c;->h:I

    return v0
.end method

.method h()Ldg/s;
    .locals 1

    iget-object v0, p0, Lyg/c;->b:Ldg/s;

    return-object v0
.end method

.method i()Ldg/s;
    .locals 1

    iget-object v0, p0, Lyg/c;->d:Ldg/s;

    return-object v0
.end method
