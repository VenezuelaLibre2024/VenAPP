.class public final Lcom/facebook/internal/n$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/n$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/internal/n$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/facebook/internal/n$b;
    .locals 5

    invoke-static {}, Lcom/facebook/internal/n$b;->values()[Lcom/facebook/internal/n$b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v3}, Lcom/facebook/internal/n$b;->h(Lcom/facebook/internal/n$b;)I

    move-result v4

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_1
    sget-object p1, Lcom/facebook/internal/n$b;->Unknown:Lcom/facebook/internal/n$b;

    return-object p1
.end method
