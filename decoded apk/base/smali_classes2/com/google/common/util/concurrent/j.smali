.class public final Lcom/google/common/util/concurrent/j;
.super Lcom/google/common/util/concurrent/a$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/util/concurrent/a$j<",
        "TV;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/util/concurrent/a$j;-><init>()V

    return-void
.end method

.method public static C()Lcom/google/common/util/concurrent/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/util/concurrent/j<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/common/util/concurrent/j;

    invoke-direct {v0}, Lcom/google/common/util/concurrent/j;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/common/util/concurrent/a;->A(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public B(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/google/common/util/concurrent/a;->B(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic isCancelled()Z
    .locals 1

    invoke-super {p0}, Lcom/google/common/util/concurrent/a$j;->isCancelled()Z

    move-result v0

    return v0
.end method
