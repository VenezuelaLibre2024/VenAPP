.class final Lg8/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lg8/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLcom/google/common/collect/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/google/common/collect/w<",
            "Lg8/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg8/g$b;->a:J

    iput-object p3, p0, Lg8/g$b;->b:Lcom/google/common/collect/w;

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 2

    iget-wide v0, p0, Lg8/g$b;->a:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public h(J)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lg8/g$b;->a:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Lg8/g$b;->b:Lcom/google/common/collect/w;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public i(I)J
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lt8/a;->a(Z)V

    iget-wide v0, p0, Lg8/g$b;->a:J

    return-wide v0
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
