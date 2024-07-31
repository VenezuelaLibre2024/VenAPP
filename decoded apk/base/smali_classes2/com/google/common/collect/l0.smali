.class public abstract Lcom/google/common/collect/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/l0$d;,
        Lcom/google/common/collect/l0$e;,
        Lcom/google/common/collect/l0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K0:",
        "Ljava/lang/Object;",
        "V0:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/collect/l0$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/l0;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/common/collect/l0$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/l0$e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/google/common/collect/l0;->b(I)Lcom/google/common/collect/l0$e;

    move-result-object v0

    return-object v0
.end method

.method public static b(I)Lcom/google/common/collect/l0$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/collect/l0$e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "expectedKeys"

    invoke-static {p0, v0}, Lcom/google/common/collect/i;->b(ILjava/lang/String;)I

    new-instance v0, Lcom/google/common/collect/l0$a;

    invoke-direct {v0, p0}, Lcom/google/common/collect/l0$a;-><init>(I)V

    return-object v0
.end method

.method public static c()Lcom/google/common/collect/l0$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/l0$e<",
            "Ljava/lang/Comparable;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/r0;->c()Lcom/google/common/collect/r0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/collect/l0;->d(Ljava/util/Comparator;)Lcom/google/common/collect/l0$e;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/util/Comparator;)Lcom/google/common/collect/l0$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K0:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TK0;>;)",
            "Lcom/google/common/collect/l0$e<",
            "TK0;>;"
        }
    .end annotation

    invoke-static {p0}, Leb/o;->o(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/common/collect/l0$b;

    invoke-direct {v0, p0}, Lcom/google/common/collect/l0$b;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method
