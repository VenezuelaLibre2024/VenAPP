.class Lcom/google/common/collect/k$c;
.super Lcom/google/common/collect/k$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/k;->Z()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/k<",
        "TK;TV;>.e<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/common/collect/k;


# direct methods
.method constructor <init>(Lcom/google/common/collect/k;)V
    .locals 1

    iput-object p1, p0, Lcom/google/common/collect/k$c;->e:Lcom/google/common/collect/k;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/k$e;-><init>(Lcom/google/common/collect/k;Lcom/google/common/collect/k$a;)V

    return-void
.end method


# virtual methods
.method c(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/common/collect/k$c;->e:Lcom/google/common/collect/k;

    invoke-static {v0, p1}, Lcom/google/common/collect/k;->k(Lcom/google/common/collect/k;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
