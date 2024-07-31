.class final Lm8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/i;


# instance fields
.field private final a:[Lg8/b;

.field private final b:[J


# direct methods
.method public constructor <init>([Lg8/b;[J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/b;->a:[Lg8/b;

    iput-object p2, p0, Lm8/b;->b:[J

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 2

    iget-object v0, p0, Lm8/b;->b:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, v1}, Lt8/r0;->e([JJZZ)I

    move-result p1

    iget-object p2, p0, Lm8/b;->b:[J

    array-length p2, p2

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public h(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm8/b;->b:[J

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, p2, v1, v2}, Lt8/r0;->i([JJZZ)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_1

    iget-object p2, p0, Lm8/b;->a:[Lg8/b;

    aget-object p1, p2, p1

    sget-object p2, Lg8/b;->C:Lg8/b;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public i(I)J
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v2}, Lt8/a;->a(Z)V

    iget-object v2, p0, Lm8/b;->b:[J

    array-length v2, v2

    if-ge p1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-static {v0}, Lt8/a;->a(Z)V

    iget-object v0, p0, Lm8/b;->b:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Lm8/b;->b:[J

    array-length v0, v0

    return v0
.end method
