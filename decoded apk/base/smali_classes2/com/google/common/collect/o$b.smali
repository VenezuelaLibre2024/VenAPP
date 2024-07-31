.class final Lcom/google/common/collect/o$b;
.super Lcom/google/common/collect/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final d:I


# direct methods
.method constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/common/collect/o;-><init>(Lcom/google/common/collect/o$a;)V

    iput p1, p0, Lcom/google/common/collect/o$b;->d:I

    return-void
.end method


# virtual methods
.method public d(II)Lcom/google/common/collect/o;
    .locals 0

    return-object p0
.end method

.method public e(JJ)Lcom/google/common/collect/o;
    .locals 0

    return-object p0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lcom/google/common/collect/o;"
        }
    .end annotation

    return-object p0
.end method

.method public g(ZZ)Lcom/google/common/collect/o;
    .locals 0

    return-object p0
.end method

.method public h(ZZ)Lcom/google/common/collect/o;
    .locals 0

    return-object p0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/o$b;->d:I

    return v0
.end method
