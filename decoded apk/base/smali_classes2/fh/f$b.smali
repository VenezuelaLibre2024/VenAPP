.class final Lfh/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Ldh/h;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Lfh/f$b;

.field private final f:I

.field final synthetic g:Lfh/f;


# direct methods
.method private constructor <init>(Lfh/f;Ldh/h;IIILfh/f$b;Ldh/j;)V
    .locals 5

    iput-object p1, p0, Lfh/f$b;->g:Lfh/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfh/f$b;->a:Ldh/h;

    iput p3, p0, Lfh/f$b;->b:I

    sget-object v0, Ldh/h;->BYTE:Ldh/h;

    if-eq p2, v0, :cond_1

    if-nez p6, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p6, Lfh/f$b;->c:I

    goto :goto_1

    :cond_1
    :goto_0
    move v1, p4

    :goto_1
    iput v1, p0, Lfh/f$b;->c:I

    iput p5, p0, Lfh/f$b;->d:I

    iput-object p6, p0, Lfh/f$b;->e:Lfh/f$b;

    const/4 v2, 0x0

    if-eqz p6, :cond_2

    iget v3, p6, Lfh/f$b;->f:I

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    const/4 v4, 0x1

    if-ne p2, v0, :cond_3

    if-nez p6, :cond_3

    if-nez v1, :cond_4

    :cond_3
    if-eqz p6, :cond_5

    iget v0, p6, Lfh/f$b;->c:I

    if-eq v1, v0, :cond_5

    :cond_4
    move v2, v4

    :cond_5
    const/4 v0, 0x4

    if-eqz p6, :cond_6

    iget-object p6, p6, Lfh/f$b;->a:Ldh/h;

    if-ne p2, p6, :cond_6

    if-eqz v2, :cond_7

    :cond_6
    invoke-virtual {p2, p7}, Ldh/h;->i(Ldh/j;)I

    move-result p6

    add-int/2addr p6, v0

    add-int/2addr v3, p6

    :cond_7
    sget-object p6, Lfh/f$a;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, p6, p2

    if-eq p2, v4, :cond_e

    const/4 p6, 0x2

    if-eq p2, p6, :cond_c

    const/4 p7, 0x3

    if-eq p2, p7, :cond_9

    if-eq p2, v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-static {p1}, Lfh/f;->c(Lfh/f;)Lkg/h;

    move-result-object p2

    invoke-static {p1}, Lfh/f;->b(Lfh/f;)Ljava/lang/String;

    move-result-object p1

    add-int/2addr p5, p3

    invoke-virtual {p1, p3, p5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, p4}, Lkg/h;->c(Ljava/lang/String;I)[B

    move-result-object p1

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x8

    add-int/2addr v3, p1

    if-eqz v2, :cond_f

    add-int/lit8 v3, v3, 0xc

    goto :goto_5

    :cond_9
    if-ne p5, v4, :cond_a

    goto :goto_3

    :cond_a
    if-ne p5, p6, :cond_b

    const/4 v0, 0x7

    goto :goto_3

    :cond_b
    const/16 v0, 0xa

    :goto_3
    add-int/2addr v3, v0

    goto :goto_5

    :cond_c
    if-ne p5, v4, :cond_d

    const/4 p1, 0x6

    goto :goto_4

    :cond_d
    const/16 p1, 0xb

    :goto_4
    add-int/2addr v3, p1

    goto :goto_5

    :cond_e
    add-int/lit8 v3, v3, 0xd

    :cond_f
    :goto_5
    iput v3, p0, Lfh/f$b;->f:I

    return-void
.end method

.method synthetic constructor <init>(Lfh/f;Ldh/h;IIILfh/f$b;Ldh/j;Lfh/f$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lfh/f$b;-><init>(Lfh/f;Ldh/h;IIILfh/f$b;Ldh/j;)V

    return-void
.end method

.method static synthetic a(Lfh/f$b;)I
    .locals 0

    iget p0, p0, Lfh/f$b;->d:I

    return p0
.end method

.method static synthetic b(Lfh/f$b;)I
    .locals 0

    iget p0, p0, Lfh/f$b;->c:I

    return p0
.end method

.method static synthetic c(Lfh/f$b;)Ldh/h;
    .locals 0

    iget-object p0, p0, Lfh/f$b;->a:Ldh/h;

    return-object p0
.end method

.method static synthetic d(Lfh/f$b;)I
    .locals 0

    iget p0, p0, Lfh/f$b;->f:I

    return p0
.end method

.method static synthetic e(Lfh/f$b;)Lfh/f$b;
    .locals 0

    iget-object p0, p0, Lfh/f$b;->e:Lfh/f$b;

    return-object p0
.end method

.method static synthetic f(Lfh/f$b;)I
    .locals 0

    iget p0, p0, Lfh/f$b;->b:I

    return p0
.end method
