.class final La8/f$d;
.super Lq8/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private h:I


# direct methods
.method public constructor <init>(Lv7/d1;[I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lq8/c;-><init>(Lv7/d1;[I)V

    const/4 v0, 0x0

    aget p2, p2, v0

    invoke-virtual {p1, p2}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq8/c;->e(Lt6/u1;)I

    move-result p1

    iput p1, p0, La8/f$d;->h:I

    return-void
.end method


# virtual methods
.method public g(JJJLjava/util/List;[Lx7/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;[",
            "Lx7/o;",
            ")V"
        }
    .end annotation

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget p3, p0, La8/f$d;->h:I

    invoke-virtual {p0, p3, p1, p2}, Lq8/c;->j(IJ)Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    iget p3, p0, Lq8/c;->b:I

    add-int/lit8 p3, p3, -0x1

    :goto_0
    if-ltz p3, :cond_2

    invoke-virtual {p0, p3, p1, p2}, Lq8/c;->j(IJ)Z

    move-result p4

    if-nez p4, :cond_1

    iput p3, p0, La8/f$d;->h:I

    return-void

    :cond_1
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public h()I
    .locals 1

    iget v0, p0, La8/f$d;->h:I

    return v0
.end method

.method public m()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public t()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
