.class final Lfh/f$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh/f$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Ldh/h;

.field private final b:I

.field private final c:I

.field private final d:I

.field final synthetic e:Lfh/f$c;


# direct methods
.method constructor <init>(Lfh/f$c;Ldh/h;III)V
    .locals 0

    iput-object p1, p0, Lfh/f$c$a;->e:Lfh/f$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfh/f$c$a;->a:Ldh/h;

    iput p3, p0, Lfh/f$c$a;->b:I

    iput p4, p0, Lfh/f$c$a;->c:I

    iput p5, p0, Lfh/f$c$a;->d:I

    return-void
.end method

.method static synthetic a(Lfh/f$c$a;)Ldh/h;
    .locals 0

    iget-object p0, p0, Lfh/f$c$a;->a:Ldh/h;

    return-object p0
.end method

.method static synthetic b(Lfh/f$c$a;Ldh/j;)I
    .locals 0

    invoke-direct {p0, p1}, Lfh/f$c$a;->f(Ldh/j;)I

    move-result p0

    return p0
.end method

.method static synthetic c(Lfh/f$c$a;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lfh/f$c$a;->d(Lkg/a;)V

    return-void
.end method

.method private d(Lkg/a;)V
    .locals 4

    iget-object v0, p0, Lfh/f$c$a;->a:Ldh/h;

    invoke-virtual {v0}, Ldh/h;->h()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lkg/a;->c(II)V

    iget v0, p0, Lfh/f$c$a;->d:I

    if-lez v0, :cond_0

    invoke-direct {p0}, Lfh/f$c$a;->e()I

    move-result v0

    iget-object v1, p0, Lfh/f$c$a;->a:Ldh/h;

    iget-object v2, p0, Lfh/f$c$a;->e:Lfh/f$c;

    invoke-static {v2}, Lfh/f$c;->a(Lfh/f$c;)Ldh/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldh/h;->i(Ldh/j;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lkg/a;->c(II)V

    :cond_0
    iget-object v0, p0, Lfh/f$c$a;->a:Ldh/h;

    sget-object v1, Ldh/h;->ECI:Ldh/h;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lfh/f$c$a;->e:Lfh/f$c;

    iget-object v0, v0, Lfh/f$c;->c:Lfh/f;

    invoke-static {v0}, Lfh/f;->c(Lfh/f;)Lkg/h;

    move-result-object v0

    iget v1, p0, Lfh/f$c$a;->c:I

    invoke-virtual {v0, v1}, Lkg/h;->e(I)I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lkg/a;->c(II)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lfh/f$c$a;->d:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lfh/f$c$a;->e:Lfh/f$c;

    iget-object v0, v0, Lfh/f$c;->c:Lfh/f;

    invoke-static {v0}, Lfh/f;->b(Lfh/f;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lfh/f$c$a;->b:I

    iget v2, p0, Lfh/f$c$a;->d:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lfh/f$c$a;->a:Ldh/h;

    iget-object v2, p0, Lfh/f$c$a;->e:Lfh/f$c;

    iget-object v2, v2, Lfh/f$c;->c:Lfh/f;

    invoke-static {v2}, Lfh/f;->c(Lfh/f;)Lkg/h;

    move-result-object v2

    iget v3, p0, Lfh/f$c$a;->c:I

    invoke-virtual {v2, v3}, Lkg/h;->d(I)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lfh/c;->c(Ljava/lang/String;Ldh/h;Lkg/a;Ljava/nio/charset/Charset;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private e()I
    .locals 4

    iget-object v0, p0, Lfh/f$c$a;->a:Ldh/h;

    sget-object v1, Ldh/h;->BYTE:Ldh/h;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lfh/f$c$a;->e:Lfh/f$c;

    iget-object v0, v0, Lfh/f$c;->c:Lfh/f;

    invoke-static {v0}, Lfh/f;->c(Lfh/f;)Lkg/h;

    move-result-object v0

    iget-object v1, p0, Lfh/f$c$a;->e:Lfh/f$c;

    iget-object v1, v1, Lfh/f$c;->c:Lfh/f;

    invoke-static {v1}, Lfh/f;->b(Lfh/f;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lfh/f$c$a;->b:I

    iget v3, p0, Lfh/f$c$a;->d:I

    add-int/2addr v3, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lfh/f$c$a;->c:I

    invoke-virtual {v0, v1, v2}, Lkg/h;->c(Ljava/lang/String;I)[B

    move-result-object v0

    array-length v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lfh/f$c$a;->d:I

    :goto_0
    return v0
.end method

.method private f(Ldh/j;)I
    .locals 7

    iget-object v0, p0, Lfh/f$c$a;->a:Ldh/h;

    invoke-virtual {v0, p1}, Ldh/h;->i(Ldh/j;)I

    move-result p1

    const/4 v0, 0x4

    add-int/2addr p1, v0

    sget-object v1, Lfh/f$a;->b:[I

    iget-object v2, p0, Lfh/f$c$a;->a:Ldh/h;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_7

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_5

    const/4 v5, 0x3

    if-eq v1, v5, :cond_2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x5

    if-eq v1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x8

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lfh/f$c$a;->e()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    goto :goto_0

    :cond_2
    iget v1, p0, Lfh/f$c$a;->d:I

    div-int/lit8 v6, v1, 0x3

    mul-int/lit8 v6, v6, 0xa

    add-int/2addr p1, v6

    rem-int/2addr v1, v5

    if-ne v1, v2, :cond_3

    goto :goto_0

    :cond_3
    if-ne v1, v4, :cond_4

    const/4 v0, 0x7

    goto :goto_0

    :cond_4
    move v0, v3

    goto :goto_0

    :cond_5
    iget v0, p0, Lfh/f$c$a;->d:I

    div-int/lit8 v1, v0, 0x2

    mul-int/lit8 v1, v1, 0xb

    add-int/2addr p1, v1

    rem-int/2addr v0, v4

    if-ne v0, v2, :cond_6

    const/4 v3, 0x6

    :cond_6
    add-int/2addr p1, v3

    goto :goto_1

    :cond_7
    iget v0, p0, Lfh/f$c$a;->d:I

    mul-int/lit8 v0, v0, 0xd

    :goto_0
    add-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method private g(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    if-lt v2, v3, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7e

    if-le v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    goto :goto_2

    :cond_1
    :goto_1
    const/16 v2, 0x2e

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lfh/f$c$a;->a:Ldh/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfh/f$c$a;->a:Ldh/h;

    sget-object v2, Ldh/h;->ECI:Ldh/h;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lfh/f$c$a;->e:Lfh/f$c;

    iget-object v1, v1, Lfh/f$c;->c:Lfh/f;

    invoke-static {v1}, Lfh/f;->c(Lfh/f;)Lkg/h;

    move-result-object v1

    iget v2, p0, Lfh/f$c$a;->c:I

    invoke-virtual {v1, v2}, Lkg/h;->d(I)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lfh/f$c$a;->e:Lfh/f$c;

    iget-object v1, v1, Lfh/f$c;->c:Lfh/f;

    invoke-static {v1}, Lfh/f;->b(Lfh/f;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lfh/f$c$a;->b:I

    iget v3, p0, Lfh/f$c$a;->d:I

    add-int/2addr v3, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lfh/f$c$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
