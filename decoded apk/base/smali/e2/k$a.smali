.class public Le2/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Le2/k$a;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le2/k$a;->b:Ljava/util/List;

    const/4 v0, 0x1

    iput v0, p0, Le2/k$a;->c:I

    return-void
.end method


# virtual methods
.method public varargs a([I)Le2/k$a;
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    iget v3, p0, Le2/k$a;->a:I

    or-int/2addr v2, v3

    iput v2, p0, Le2/k$a;->a:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public varargs b([Ljava/lang/String;)Le2/k$a;
    .locals 1

    iget-object v0, p0, Le2/k$a;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public c()Le2/k;
    .locals 4

    new-instance v0, Le2/k;

    iget v1, p0, Le2/k$a;->a:I

    iget-object v2, p0, Le2/k$a;->b:Ljava/util/List;

    iget v3, p0, Le2/k$a;->c:I

    invoke-direct {v0, v1, v2, v3}, Le2/k;-><init>(ILjava/util/List;I)V

    return-object v0
.end method

.method public d(I)Le2/k$a;
    .locals 0

    iput p1, p0, Le2/k$a;->c:I

    return-object p0
.end method