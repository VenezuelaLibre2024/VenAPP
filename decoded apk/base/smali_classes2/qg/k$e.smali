.class final Lqg/k$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:[B


# direct methods
.method constructor <init>(Lqg/k$b;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lqg/k$b;->b(Lqg/k$b;)Lqg/k$c;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lqg/k$b;->c(Lqg/k$b;)Lqg/k$d;

    move-result-object v4

    sget-object v5, Lqg/k$d;->C40:Lqg/k$d;

    const/4 v6, 0x0

    if-eq v4, v5, :cond_0

    invoke-static {p1}, Lqg/k$b;->c(Lqg/k$b;)Lqg/k$d;

    move-result-object v4

    sget-object v5, Lqg/k$d;->TEXT:Lqg/k$d;

    if-eq v4, v5, :cond_0

    invoke-static {p1}, Lqg/k$b;->c(Lqg/k$b;)Lqg/k$d;

    move-result-object v4

    sget-object v5, Lqg/k$d;->X12:Lqg/k$d;

    if-ne v4, v5, :cond_1

    :cond_0
    invoke-virtual {p1}, Lqg/k$b;->o()Lqg/k$d;

    move-result-object v4

    sget-object v5, Lqg/k$d;->ASCII:Lqg/k$d;

    if-eq v4, v5, :cond_1

    const/16 v4, 0xfe

    invoke-static {v4}, Lqg/k$b;->h(I)[B

    move-result-object v4

    invoke-static {v4, v1}, Lqg/k$e;->c([BLjava/util/List;)I

    move-result v4

    add-int/2addr v4, v6

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_0
    move-object v5, p1

    :goto_1
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lqg/k$b;->m()[B

    move-result-object v7

    invoke-static {v7, v1}, Lqg/k$e;->c([BLjava/util/List;)I

    move-result v7

    add-int/2addr v4, v7

    invoke-static {v5}, Lqg/k$b;->d(Lqg/k$b;)Lqg/k$b;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v5}, Lqg/k$b;->u()Lqg/k$d;

    move-result-object v7

    invoke-virtual {v5}, Lqg/k$b;->s()Lqg/k$d;

    move-result-object v8

    if-eq v7, v8, :cond_5

    :cond_2
    invoke-virtual {v5}, Lqg/k$b;->s()Lqg/k$d;

    move-result-object v7

    sget-object v8, Lqg/k$d;->B256:Lqg/k$d;

    if-ne v7, v8, :cond_4

    const/16 v7, 0xf9

    if-gt v4, v7, :cond_3

    int-to-byte v7, v4

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    invoke-interface {v1, v6, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    rem-int/lit16 v8, v4, 0xfa

    int-to-byte v8, v8

    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    invoke-interface {v1, v6, v8}, Ljava/util/List;->add(ILjava/lang/Object;)V

    div-int/lit16 v8, v4, 0xfa

    add-int/2addr v8, v7

    int-to-byte v7, v8

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    invoke-interface {v1, v6, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x2

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {v5}, Lqg/k$b;->q()[B

    move-result-object v4

    invoke-static {v4, v1}, Lqg/k$e;->c([BLjava/util/List;)I

    move v4, v6

    :cond_5
    invoke-static {v5}, Lqg/k$b;->d(Lqg/k$b;)Lqg/k$b;

    move-result-object v5

    goto :goto_1

    :cond_6
    invoke-static {v0}, Lqg/k$c;->i(Lqg/k$c;)I

    move-result v4

    const/4 v5, 0x5

    if-ne v4, v5, :cond_7

    const/16 v4, 0xec

    invoke-static {v4}, Lqg/k$b;->h(I)[B

    move-result-object v4

    invoke-static {v4, v1}, Lqg/k$e;->c([BLjava/util/List;)I

    goto :goto_3

    :cond_7
    invoke-static {v0}, Lqg/k$c;->i(Lqg/k$c;)I

    move-result v4

    const/4 v5, 0x6

    if-ne v4, v5, :cond_8

    const/16 v4, 0xed

    invoke-static {v4}, Lqg/k$b;->h(I)[B

    move-result-object v4

    invoke-static {v4, v1}, Lqg/k$e;->c([BLjava/util/List;)I

    :cond_8
    :goto_3
    invoke-virtual {v0}, Lkg/n;->f()I

    move-result v0

    if-lez v0, :cond_9

    const/16 v0, 0xe8

    invoke-static {v0}, Lqg/k$b;->h(I)[B

    move-result-object v0

    invoke-static {v0, v1}, Lqg/k$e;->c([BLjava/util/List;)I

    :cond_9
    move v0, v6

    :goto_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_a

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v1, v4, v5}, Lqg/k$e;->a(Ljava/util/List;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_a
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lqg/k$b;->r(I)I

    move-result p1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p1, :cond_b

    const/16 v0, -0x7f

    :goto_5
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p1, :cond_c

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lqg/k$e;->d(I)I

    move-result v0

    int-to-byte v0, v0

    goto :goto_5

    :cond_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, p0, Lqg/k$e;->a:[B

    :goto_6
    iget-object p1, p0, Lqg/k$e;->a:[B

    array-length v0, p1

    if-ge v6, v0, :cond_d

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    aput-byte v0, p1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_d
    return-void
.end method

.method static a(Ljava/util/List;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Byte;",
            ">;II)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    add-int v1, p1, v0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    const/16 v3, 0xff

    and-int/2addr v2, v3

    add-int/lit8 v4, v1, 0x1

    mul-int/lit16 v4, v4, 0x95

    rem-int/2addr v4, v3

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v2, v4

    if-gt v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit16 v2, v2, -0x100

    :goto_1
    int-to-byte v2, v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-interface {p0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method static c([BLjava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/List<",
            "Ljava/lang/Byte;",
            ">;)I"
        }
    .end annotation

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget-byte v1, p0, v0

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p1, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    array-length p0, p0

    return p0
.end method

.method private static d(I)I
    .locals 1

    mul-int/lit16 p0, p0, 0x95

    rem-int/lit16 p0, p0, 0xfd

    add-int/lit8 p0, p0, 0x1

    add-int/lit16 p0, p0, 0x81

    const/16 v0, 0xfe

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit16 p0, p0, -0xfe

    :goto_0
    return p0
.end method


# virtual methods
.method public b()[B
    .locals 1

    iget-object v0, p0, Lqg/k$e;->a:[B

    return-object v0
.end method
