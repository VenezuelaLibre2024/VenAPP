.class final Lfh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfh/f$c;,
        Lfh/f$b;,
        Lfh/f$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Lkg/h;

.field private final d:Ldh/f;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZLdh/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfh/f;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lfh/f;->b:Z

    new-instance p3, Lkg/h;

    const/4 v0, -0x1

    invoke-direct {p3, p1, p2, v0}, Lkg/h;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;I)V

    iput-object p3, p0, Lfh/f;->c:Lkg/h;

    iput-object p4, p0, Lfh/f;->d:Ldh/f;

    return-void
.end method

.method static synthetic a(Lfh/f;)Ldh/f;
    .locals 0

    iget-object p0, p0, Lfh/f;->d:Ldh/f;

    return-object p0
.end method

.method static synthetic b(Lfh/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfh/f;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lfh/f;)Lkg/h;
    .locals 0

    iget-object p0, p0, Lfh/f;->c:Lkg/h;

    return-object p0
.end method

.method static synthetic d(Lfh/f;)Z
    .locals 0

    iget-boolean p0, p0, Lfh/f;->b:Z

    return p0
.end method

.method static i(Ljava/lang/String;Ldh/j;Ljava/nio/charset/Charset;ZLdh/f;)Lfh/f$c;
    .locals 1

    new-instance v0, Lfh/f;

    invoke-direct {v0, p0, p2, p3, p4}, Lfh/f;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZLdh/f;)V

    invoke-virtual {v0, p1}, Lfh/f;->h(Ldh/j;)Lfh/f$c;

    move-result-object p0

    return-object p0
.end method

.method static k(Ldh/h;)I
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lfh/f$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v0, 0x2

    if-eq v1, v0, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v0, 0x4

    if-ne v1, v0, :cond_1

    return v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return v0

    :cond_3
    return v2

    :cond_4
    return v0
.end method

.method static l(Lfh/f$d;)Ldh/j;
    .locals 1

    sget-object v0, Lfh/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/16 p0, 0x28

    :goto_0
    invoke-static {p0}, Ldh/j;->i(I)Ldh/j;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0x1a

    goto :goto_0

    :cond_1
    const/16 p0, 0x9

    goto :goto_0
.end method

.method static m(Ldh/j;)Lfh/f$d;
    .locals 2

    invoke-virtual {p0}, Ldh/j;->j()I

    move-result v0

    const/16 v1, 0x9

    if-gt v0, v1, :cond_0

    sget-object p0, Lfh/f$d;->SMALL:Lfh/f$d;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldh/j;->j()I

    move-result p0

    const/16 v0, 0x1a

    if-gt p0, v0, :cond_1

    sget-object p0, Lfh/f$d;->MEDIUM:Lfh/f$d;

    goto :goto_0

    :cond_1
    sget-object p0, Lfh/f$d;->LARGE:Lfh/f$d;

    :goto_0
    return-object p0
.end method

.method static n(C)Z
    .locals 1

    invoke-static {p0}, Lfh/c;->p(I)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static o(C)Z
    .locals 0

    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lfh/c;->s(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static p(C)Z
    .locals 1

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method e([[[Lfh/f$b;ILfh/f$b;)V
    .locals 2

    invoke-static {p3}, Lfh/f$b;->a(Lfh/f$b;)I

    move-result v0

    add-int/2addr p2, v0

    aget-object p1, p1, p2

    invoke-static {p3}, Lfh/f$b;->b(Lfh/f$b;)I

    move-result p2

    aget-object p1, p1, p2

    invoke-static {p3}, Lfh/f$b;->c(Lfh/f$b;)Ldh/h;

    move-result-object p2

    invoke-static {p2}, Lfh/f;->k(Ldh/h;)I

    move-result p2

    aget-object v0, p1, p2

    if-eqz v0, :cond_0

    invoke-static {v0}, Lfh/f$b;->d(Lfh/f$b;)I

    move-result v0

    invoke-static {p3}, Lfh/f$b;->d(Lfh/f$b;)I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    aput-object p3, p1, p2

    :cond_1
    return-void
.end method

.method f(Ldh/j;[[[Lfh/f$b;ILfh/f$b;)V
    .locals 16

    move-object/from16 v9, p0

    move-object/from16 v10, p2

    move/from16 v11, p3

    iget-object v0, v9, Lfh/f;->c:Lkg/h;

    invoke-virtual {v0}, Lkg/h;->g()I

    move-result v0

    iget-object v1, v9, Lfh/f;->c:Lkg/h;

    invoke-virtual {v1}, Lkg/h;->f()I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v2, v9, Lfh/f;->c:Lkg/h;

    iget-object v3, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v3, v11}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v2, v3, v1}, Lkg/h;->a(CI)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v12, v0

    move v13, v1

    :goto_1
    if-ge v13, v12, :cond_2

    iget-object v0, v9, Lfh/f;->c:Lkg/h;

    iget-object v1, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1, v13}, Lkg/h;->a(CI)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v14, Lfh/f$b;

    sget-object v2, Ldh/h;->BYTE:Ldh/h;

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v3, p3

    move v4, v13

    move-object/from16 v6, p4

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v8}, Lfh/f$b;-><init>(Lfh/f;Ldh/h;IIILfh/f$b;Ldh/j;Lfh/f$a;)V

    invoke-virtual {v9, v10, v11, v14}, Lfh/f;->e([[[Lfh/f$b;ILfh/f$b;)V

    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_2
    sget-object v2, Ldh/h;->KANJI:Ldh/h;

    iget-object v0, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v9, v2, v0}, Lfh/f;->g(Ldh/h;C)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v12, Lfh/f$b;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v0, v12

    move-object/from16 v1, p0

    move/from16 v3, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v8}, Lfh/f$b;-><init>(Lfh/f;Ldh/h;IIILfh/f$b;Ldh/j;Lfh/f$a;)V

    invoke-virtual {v9, v10, v11, v12}, Lfh/f;->e([[[Lfh/f$b;ILfh/f$b;)V

    :cond_3
    iget-object v0, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v12

    sget-object v2, Ldh/h;->ALPHANUMERIC:Ldh/h;

    iget-object v0, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v9, v2, v0}, Lfh/f;->g(Ldh/h;C)Z

    move-result v0

    const/4 v13, 0x2

    const/4 v14, 0x1

    if-eqz v0, :cond_6

    new-instance v15, Lfh/f$b;

    const/4 v4, 0x0

    add-int/lit8 v0, v11, 0x1

    if-ge v0, v12, :cond_5

    iget-object v1, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v9, v2, v0}, Lfh/f;->g(Ldh/h;C)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move v5, v13

    goto :goto_3

    :cond_5
    :goto_2
    move v5, v14

    :goto_3
    const/4 v8, 0x0

    move-object v0, v15

    move-object/from16 v1, p0

    move/from16 v3, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v8}, Lfh/f$b;-><init>(Lfh/f;Ldh/h;IIILfh/f$b;Ldh/j;Lfh/f$a;)V

    invoke-virtual {v9, v10, v11, v15}, Lfh/f;->e([[[Lfh/f$b;ILfh/f$b;)V

    :cond_6
    sget-object v2, Ldh/h;->NUMERIC:Ldh/h;

    iget-object v0, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v9, v2, v0}, Lfh/f;->g(Ldh/h;C)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v15, Lfh/f$b;

    const/4 v4, 0x0

    add-int/lit8 v0, v11, 0x1

    if-ge v0, v12, :cond_a

    iget-object v1, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v9, v2, v0}, Lfh/f;->g(Ldh/h;C)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v0, v11, 0x2

    if-ge v0, v12, :cond_9

    iget-object v1, v9, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v9, v2, v0}, Lfh/f;->g(Ldh/h;C)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    const/4 v0, 0x3

    move v5, v0

    goto :goto_6

    :cond_9
    :goto_4
    move v5, v13

    goto :goto_6

    :cond_a
    :goto_5
    move v5, v14

    :goto_6
    const/4 v8, 0x0

    move-object v0, v15

    move-object/from16 v1, p0

    move/from16 v3, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v8}, Lfh/f$b;-><init>(Lfh/f;Ldh/h;IIILfh/f$b;Ldh/j;Lfh/f$a;)V

    invoke-virtual {v9, v10, v11, v15}, Lfh/f;->e([[[Lfh/f$b;ILfh/f$b;)V

    :cond_b
    return-void
.end method

.method g(Ldh/h;C)Z
    .locals 2

    sget-object v0, Lfh/f$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0

    :cond_1
    invoke-static {p2}, Lfh/f;->p(C)Z

    move-result p1

    return p1

    :cond_2
    invoke-static {p2}, Lfh/f;->n(C)Z

    move-result p1

    return p1

    :cond_3
    invoke-static {p2}, Lfh/f;->o(C)Z

    move-result p1

    return p1
.end method

.method h(Ldh/j;)Lfh/f$c;
    .locals 8

    if-nez p1, :cond_3

    const/4 p1, 0x3

    new-array v0, p1, [Ldh/j;

    sget-object v1, Lfh/f$d;->SMALL:Lfh/f$d;

    invoke-static {v1}, Lfh/f;->l(Lfh/f$d;)Ldh/j;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lfh/f$d;->MEDIUM:Lfh/f$d;

    invoke-static {v1}, Lfh/f;->l(Lfh/f$d;)Ldh/j;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lfh/f$d;->LARGE:Lfh/f$d;

    invoke-static {v1}, Lfh/f;->l(Lfh/f$d;)Ldh/j;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    new-array v1, p1, [Lfh/f$c;

    aget-object v5, v0, v2

    invoke-virtual {p0, v5}, Lfh/f;->j(Ldh/j;)Lfh/f$c;

    move-result-object v5

    aput-object v5, v1, v2

    aget-object v5, v0, v3

    invoke-virtual {p0, v5}, Lfh/f;->j(Ldh/j;)Lfh/f$c;

    move-result-object v5

    aput-object v5, v1, v3

    aget-object v3, v0, v4

    invoke-virtual {p0, v3}, Lfh/f;->j(Ldh/j;)Lfh/f$c;

    move-result-object v3

    aput-object v3, v1, v4

    const v3, 0x7fffffff

    const/4 v4, -0x1

    :goto_0
    if-ge v2, p1, :cond_1

    aget-object v5, v1, v2

    invoke-virtual {v5}, Lfh/f$c;->c()I

    move-result v5

    aget-object v6, v0, v2

    iget-object v7, p0, Lfh/f;->d:Ldh/f;

    invoke-static {v5, v6, v7}, Lfh/c;->v(ILdh/j;Ldh/f;)Z

    move-result v6

    if-eqz v6, :cond_0

    if-ge v5, v3, :cond_0

    move v4, v2

    move v3, v5

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-ltz v4, :cond_2

    aget-object p1, v1, v4

    return-object p1

    :cond_2
    new-instance p1, Ldg/v;

    const-string v0, "Data too big for any version"

    invoke-direct {p1, v0}, Ldg/v;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {p0, p1}, Lfh/f;->j(Ldh/j;)Lfh/f$c;

    move-result-object v0

    invoke-virtual {v0}, Lfh/f$c;->c()I

    move-result v1

    invoke-virtual {v0}, Lfh/f$c;->e()Ldh/j;

    move-result-object v2

    invoke-static {v2}, Lfh/f;->m(Ldh/j;)Lfh/f$d;

    move-result-object v2

    invoke-static {v2}, Lfh/f;->l(Lfh/f$d;)Ldh/j;

    move-result-object v2

    iget-object v3, p0, Lfh/f;->d:Ldh/f;

    invoke-static {v1, v2, v3}, Lfh/c;->v(ILdh/j;Ldh/f;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    new-instance v0, Ldg/v;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Data too big for version"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ldg/v;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method j(Ldh/j;)Lfh/f$c;
    .locals 11

    iget-object v0, p0, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lfh/f;->c:Lkg/h;

    invoke-virtual {v2}, Lkg/h;->g()I

    move-result v2

    const/4 v3, 0x3

    new-array v3, v3, [I

    const/4 v4, 0x2

    const/4 v5, 0x4

    aput v5, v3, v4

    const/4 v4, 0x1

    aput v2, v3, v4

    const/4 v2, 0x0

    aput v1, v3, v2

    const-class v1, Lfh/f$b;

    invoke-static {v1, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[[Lfh/f$b;

    const/4 v3, 0x0

    invoke-virtual {p0, p1, v1, v2, v3}, Lfh/f;->f(Ldh/j;[[[Lfh/f$b;ILfh/f$b;)V

    :goto_0
    if-gt v4, v0, :cond_3

    move v3, v2

    :goto_1
    iget-object v6, p0, Lfh/f;->c:Lkg/h;

    invoke-virtual {v6}, Lkg/h;->g()I

    move-result v6

    if-ge v3, v6, :cond_2

    move v6, v2

    :goto_2
    if-ge v6, v5, :cond_1

    aget-object v7, v1, v4

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    if-eqz v7, :cond_0

    if-ge v4, v0, :cond_0

    invoke-virtual {p0, p1, v1, v4, v7}, Lfh/f;->f(Ldh/j;[[[Lfh/f$b;ILfh/f$b;)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    const v4, 0x7fffffff

    move v7, v2

    move v6, v4

    move v4, v3

    :goto_3
    iget-object v8, p0, Lfh/f;->c:Lkg/h;

    invoke-virtual {v8}, Lkg/h;->g()I

    move-result v8

    if-ge v7, v8, :cond_6

    move v8, v2

    :goto_4
    if-ge v8, v5, :cond_5

    aget-object v9, v1, v0

    aget-object v9, v9, v7

    aget-object v9, v9, v8

    if-eqz v9, :cond_4

    invoke-static {v9}, Lfh/f$b;->d(Lfh/f$b;)I

    move-result v10

    if-ge v10, v6, :cond_4

    invoke-static {v9}, Lfh/f$b;->d(Lfh/f$b;)I

    move-result v6

    move v3, v7

    move v4, v8

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    if-ltz v3, :cond_7

    new-instance v2, Lfh/f$c;

    aget-object v0, v1, v0

    aget-object v0, v0, v3

    aget-object v0, v0, v4

    invoke-direct {v2, p0, p1, v0}, Lfh/f$c;-><init>(Lfh/f;Ldh/j;Lfh/f$b;)V

    return-object v2

    :cond_7
    new-instance p1, Ldg/v;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Internal error: failed to encode \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfh/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ldg/v;-><init>(Ljava/lang/String;)V

    throw p1
.end method
