.class final Lqg/o;
.super Lqg/c;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqg/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqg/h;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :cond_0
    invoke-virtual {p1}, Lqg/h;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lqg/h;->c()C

    move-result v1

    iget v2, p1, Lqg/h;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p1, Lqg/h;->f:I

    invoke-virtual {p0, v1, v0}, Lqg/o;->c(CLjava/lang/StringBuilder;)I

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    rem-int/lit8 v1, v1, 0x3

    if-nez v1, :cond_0

    invoke-static {p1, v0}, Lqg/c;->h(Lqg/h;Ljava/lang/StringBuilder;)V

    invoke-virtual {p1}, Lqg/h;->d()Ljava/lang/String;

    move-result-object v1

    iget v2, p1, Lqg/h;->f:I

    invoke-virtual {p0}, Lqg/o;->f()I

    move-result v3

    invoke-static {v1, v2, v3}, Lqg/j;->n(Ljava/lang/CharSequence;II)I

    move-result v1

    invoke-virtual {p0}, Lqg/o;->f()I

    move-result v2

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lqg/h;->o(I)V

    :cond_1
    invoke-virtual {p0, p1, v0}, Lqg/o;->g(Lqg/h;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method c(CLjava/lang/StringBuilder;)I
    .locals 3

    const/16 v0, 0xd

    const/4 v1, 0x1

    if-eq p1, v0, :cond_5

    const/16 v0, 0x20

    if-eq p1, v0, :cond_4

    const/16 v0, 0x2a

    if-eq p1, v0, :cond_3

    const/16 v0, 0x3e

    if-eq p1, v0, :cond_2

    const/16 v0, 0x30

    if-lt p1, v0, :cond_0

    const/16 v2, 0x39

    if-gt p1, v2, :cond_0

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x4

    :goto_0
    int-to-char p1, p1

    goto :goto_1

    :cond_0
    const/16 v0, 0x41

    if-lt p1, v0, :cond_1

    const/16 v2, 0x5a

    if-gt p1, v2, :cond_1

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0xe

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lqg/j;->e(C)V

    goto :goto_2

    :cond_2
    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    const/4 p1, 0x3

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    return v1
.end method

.method public f()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method g(Lqg/h;Ljava/lang/StringBuilder;)V
    .locals 2

    invoke-virtual {p1}, Lqg/h;->p()V

    invoke-virtual {p1}, Lqg/h;->g()Lqg/l;

    move-result-object v0

    invoke-virtual {v0}, Lqg/l;->a()I

    move-result v0

    invoke-virtual {p1}, Lqg/h;->a()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    iget v1, p1, Lqg/h;->f:I

    sub-int/2addr v1, p2

    iput v1, p1, Lqg/h;->f:I

    invoke-virtual {p1}, Lqg/h;->f()I

    move-result p2

    const/4 v1, 0x1

    if-gt p2, v1, :cond_0

    if-gt v0, v1, :cond_0

    invoke-virtual {p1}, Lqg/h;->f()I

    move-result p2

    if-eq p2, v0, :cond_1

    :cond_0
    const/16 p2, 0xfe

    invoke-virtual {p1, p2}, Lqg/h;->r(C)V

    :cond_1
    invoke-virtual {p1}, Lqg/h;->e()I

    move-result p2

    if-gez p2, :cond_2

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lqg/h;->o(I)V

    :cond_2
    return-void
.end method
