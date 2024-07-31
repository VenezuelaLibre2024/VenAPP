.class Lcom/google/common/collect/o$a;
.super Lcom/google/common/collect/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/common/collect/o;-><init>(Lcom/google/common/collect/o$a;)V

    return-void
.end method


# virtual methods
.method public d(II)Lcom/google/common/collect/o;
    .locals 0

    invoke-static {p1, p2}, Lhb/e;->e(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/common/collect/o$a;->k(I)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method

.method public e(JJ)Lcom/google/common/collect/o;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lhb/g;->a(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/common/collect/o$a;->k(I)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
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

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/common/collect/o$a;->k(I)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method

.method public g(ZZ)Lcom/google/common/collect/o;
    .locals 0

    invoke-static {p1, p2}, Lhb/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/common/collect/o$a;->k(I)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method

.method public h(ZZ)Lcom/google/common/collect/o;
    .locals 0

    invoke-static {p2, p1}, Lhb/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/common/collect/o$a;->k(I)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method k(I)Lcom/google/common/collect/o;
    .locals 0

    if-gez p1, :cond_0

    invoke-static {}, Lcom/google/common/collect/o;->a()Lcom/google/common/collect/o;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    invoke-static {}, Lcom/google/common/collect/o;->b()Lcom/google/common/collect/o;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/common/collect/o;->c()Lcom/google/common/collect/o;

    move-result-object p1

    :goto_0
    return-object p1
.end method
