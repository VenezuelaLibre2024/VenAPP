.class final Lhg/b;
.super Lhg/g;
.source "SourceFile"


# instance fields
.field private final c:I

.field private final d:I


# direct methods
.method constructor <init>(Lhg/g;II)V
    .locals 0

    invoke-direct {p0, p1}, Lhg/g;-><init>(Lhg/g;)V

    iput p2, p0, Lhg/b;->c:I

    iput p3, p0, Lhg/b;->d:I

    return-void
.end method


# virtual methods
.method public c(Lkg/a;[B)V
    .locals 5

    iget v0, p0, Lhg/b;->d:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    const/16 v2, 0x3e

    const/16 v3, 0x1f

    if-eqz v1, :cond_0

    if-ne v1, v3, :cond_3

    if-gt v0, v2, :cond_3

    :cond_0
    const/4 v4, 0x5

    invoke-virtual {p1, v3, v4}, Lkg/a;->c(II)V

    if-le v0, v2, :cond_1

    add-int/lit8 v2, v0, -0x1f

    const/16 v3, 0x10

    invoke-virtual {p1, v2, v3}, Lkg/a;->c(II)V

    goto :goto_2

    :cond_1
    if-nez v1, :cond_2

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v0, -0x1f

    :goto_1
    invoke-virtual {p1, v2, v4}, Lkg/a;->c(II)V

    :cond_3
    :goto_2
    iget v2, p0, Lhg/b;->c:I

    add-int/2addr v2, v1

    aget-byte v2, p2, v2

    const/16 v3, 0x8

    invoke-virtual {p1, v2, v3}, Lkg/a;->c(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhg/b;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhg/b;->c:I

    iget v2, p0, Lhg/b;->d:I

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
