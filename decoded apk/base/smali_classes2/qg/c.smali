.class Lqg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqg/g;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Lqg/h;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)I
    .locals 1

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    sub-int p4, v0, p4

    invoke-virtual {p2, p4, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    iget p2, p1, Lqg/h;->f:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lqg/h;->f:I

    invoke-virtual {p1}, Lqg/h;->c()C

    move-result p2

    invoke-virtual {p0, p2, p3}, Lqg/c;->c(CLjava/lang/StringBuilder;)I

    move-result p2

    invoke-virtual {p1}, Lqg/h;->k()V

    return p2
.end method

.method private static e(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    mul-int/lit16 v1, v1, 0x640

    const/4 v2, 0x1

    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    mul-int/lit8 v3, v3, 0x28

    add-int/2addr v1, v3

    const/4 v3, 0x2

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    add-int/2addr v1, p0

    add-int/2addr v1, v2

    div-int/lit16 p0, v1, 0x100

    int-to-char p0, p0

    rem-int/lit16 v1, v1, 0x100

    int-to-char v1, v1

    new-instance v4, Ljava/lang/String;

    new-array v3, v3, [C

    aput-char p0, v3, v0

    aput-char v1, v3, v2

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([C)V

    return-object v4
.end method

.method static h(Lqg/h;Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-static {p1}, Lqg/c;->e(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqg/h;->s(Ljava/lang/String;)V

    const/4 p0, 0x0

    const/4 v0, 0x3

    invoke-virtual {p1, p0, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public a(Lqg/h;)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :cond_0
    invoke-virtual {p1}, Lqg/h;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lqg/h;->c()C

    move-result v1

    iget v2, p1, Lqg/h;->f:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p1, Lqg/h;->f:I

    invoke-virtual {p0, v1, v0}, Lqg/c;->c(CLjava/lang/StringBuilder;)I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v4, 0x3

    div-int/2addr v2, v4

    const/4 v5, 0x2

    mul-int/2addr v2, v5

    invoke-virtual {p1}, Lqg/h;->a()I

    move-result v6

    add-int/2addr v6, v2

    invoke-virtual {p1, v6}, Lqg/h;->q(I)V

    invoke-virtual {p1}, Lqg/h;->g()Lqg/l;

    move-result-object v2

    invoke-virtual {v2}, Lqg/l;->a()I

    move-result v2

    sub-int/2addr v2, v6

    invoke-virtual {p1}, Lqg/h;->i()Z

    move-result v6

    if-nez v6, :cond_3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    rem-int/2addr v7, v4

    if-ne v7, v5, :cond_2

    if-eq v2, v5, :cond_2

    :cond_1
    :goto_0
    invoke-direct {p0, p1, v0, v6, v1}, Lqg/c;->b(Lqg/h;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)I

    move-result v1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    rem-int/2addr v5, v4

    if-ne v5, v3, :cond_4

    if-gt v1, v4, :cond_1

    if-eq v2, v3, :cond_4

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    rem-int/2addr v1, v4

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lqg/h;->d()Ljava/lang/String;

    move-result-object v1

    iget v2, p1, Lqg/h;->f:I

    invoke-virtual {p0}, Lqg/c;->f()I

    move-result v3

    invoke-static {v1, v2, v3}, Lqg/j;->n(Ljava/lang/CharSequence;II)I

    move-result v1

    invoke-virtual {p0}, Lqg/c;->f()I

    move-result v2

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lqg/h;->o(I)V

    :cond_4
    invoke-virtual {p0, p1, v0}, Lqg/c;->g(Lqg/h;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method c(CLjava/lang/StringBuilder;)I
    .locals 4

    const/4 v0, 0x1

    const/16 v1, 0x20

    if-ne p1, v1, :cond_0

    const/4 p1, 0x3

    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v0

    :cond_0
    const/16 v2, 0x30

    if-lt p1, v2, :cond_1

    const/16 v3, 0x39

    if-gt p1, v3, :cond_1

    sub-int/2addr p1, v2

    add-int/lit8 p1, p1, 0x4

    :goto_1
    int-to-char p1, p1

    goto :goto_0

    :cond_1
    const/16 v2, 0x41

    if-lt p1, v2, :cond_2

    const/16 v3, 0x5a

    if-gt p1, v3, :cond_2

    sub-int/2addr p1, v2

    add-int/lit8 p1, p1, 0xe

    goto :goto_1

    :cond_2
    const/4 v2, 0x2

    if-ge p1, v1, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v2

    :cond_3
    const/16 v1, 0x2f

    if-gt p1, v1, :cond_4

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, -0x21

    :goto_3
    int-to-char p1, p1

    goto :goto_2

    :cond_4
    const/16 v1, 0x40

    if-gt p1, v1, :cond_5

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, -0x3a

    add-int/lit8 p1, p1, 0xf

    goto :goto_3

    :cond_5
    const/16 v1, 0x5f

    if-gt p1, v1, :cond_6

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, -0x5b

    add-int/lit8 p1, p1, 0x16

    goto :goto_3

    :cond_6
    const/16 v0, 0x7f

    if-gt p1, v0, :cond_7

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, -0x60

    goto :goto_3

    :cond_7
    const-string v0, "\u0001\u001e"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, -0x80

    int-to-char p1, p1

    invoke-virtual {p0, p1, p2}, Lqg/c;->c(CLjava/lang/StringBuilder;)I

    move-result p1

    add-int/2addr p1, v2

    return p1
.end method

.method d(Lqg/h;)V
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p1, Lqg/h;->f:I

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lqg/h;->i()Z

    move-result v4

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Lqg/h;->c()C

    move-result v3

    iget v4, p1, Lqg/h;->f:I

    add-int/2addr v4, v6

    iput v4, p1, Lqg/h;->f:I

    invoke-virtual {p0, v3, v0}, Lqg/c;->c(CLjava/lang/StringBuilder;)I

    move-result v3

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    rem-int/2addr v4, v5

    if-nez v4, :cond_0

    iget v1, p1, Lqg/h;->f:I

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eq v2, v4, :cond_4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    div-int/2addr v4, v5

    const/4 v7, 0x2

    mul-int/2addr v4, v7

    invoke-virtual {p1}, Lqg/h;->a()I

    move-result v8

    add-int/2addr v8, v4

    add-int/2addr v8, v6

    invoke-virtual {p1, v8}, Lqg/h;->q(I)V

    invoke-virtual {p1}, Lqg/h;->g()Lqg/l;

    move-result-object v4

    invoke-virtual {v4}, Lqg/l;->a()I

    move-result v4

    sub-int/2addr v4, v8

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    rem-int/2addr v8, v5

    if-ne v8, v7, :cond_2

    if-ne v4, v7, :cond_3

    :cond_2
    if-ne v8, v6, :cond_4

    if-gt v3, v5, :cond_3

    if-eq v4, v6, :cond_4

    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    iput v1, p1, Lqg/h;->f:I

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_5

    const/16 v1, 0xe6

    invoke-virtual {p1, v1}, Lqg/h;->r(C)V

    :cond_5
    invoke-virtual {p0, p1, v0}, Lqg/c;->g(Lqg/h;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public f()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method g(Lqg/h;Ljava/lang/StringBuilder;)V
    .locals 6

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x3

    div-int/2addr v0, v1

    const/4 v2, 0x2

    mul-int/2addr v0, v2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    rem-int/2addr v3, v1

    invoke-virtual {p1}, Lqg/h;->a()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {p1, v4}, Lqg/h;->q(I)V

    invoke-virtual {p1}, Lqg/h;->g()Lqg/l;

    move-result-object v0

    invoke-virtual {v0}, Lqg/l;->a()I

    move-result v0

    sub-int/2addr v0, v4

    const/4 v4, 0x0

    const/16 v5, 0xfe

    if-ne v3, v2, :cond_2

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Lqg/c;->h(Lqg/h;Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lqg/h;->i()Z

    move-result p2

    if-eqz p2, :cond_7

    :cond_1
    :goto_1
    invoke-virtual {p1, v5}, Lqg/h;->r(C)V

    goto :goto_4

    :cond_2
    const/4 v2, 0x1

    if-ne v0, v2, :cond_5

    if-ne v3, v2, :cond_5

    :goto_2
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lt v0, v1, :cond_3

    invoke-static {p1, p2}, Lqg/c;->h(Lqg/h;Ljava/lang/StringBuilder;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lqg/h;->i()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1, v5}, Lqg/h;->r(C)V

    :cond_4
    iget p2, p1, Lqg/h;->f:I

    sub-int/2addr p2, v2

    iput p2, p1, Lqg/h;->f:I

    goto :goto_4

    :cond_5
    if-nez v3, :cond_8

    :goto_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lt v2, v1, :cond_6

    invoke-static {p1, p2}, Lqg/c;->h(Lqg/h;Ljava/lang/StringBuilder;)V

    goto :goto_3

    :cond_6
    if-gtz v0, :cond_1

    invoke-virtual {p1}, Lqg/h;->i()Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_1

    :cond_7
    :goto_4
    invoke-virtual {p1, v4}, Lqg/h;->o(I)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected case. Please report!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method