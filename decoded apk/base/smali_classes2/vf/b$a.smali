.class public Lvf/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvf/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lvf/b$a;->a:I

    return-void
.end method


# virtual methods
.method public a()Lvf/b;
    .locals 7

    new-instance v6, Lvf/b;

    iget v1, p0, Lvf/b$a;->a:I

    iget-boolean v2, p0, Lvf/b$a;->b:Z

    iget-object v3, p0, Lvf/b$a;->c:Ljava/util/concurrent/Executor;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lvf/b;-><init>(IZLjava/util/concurrent/Executor;Lvf/d;Lvf/e;)V

    return-object v6
.end method

.method public varargs b(I[I)Lvf/b$a;
    .locals 2

    iput p1, p0, Lvf/b$a;->a:I

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_0

    aget v0, p2, p1

    iget v1, p0, Lvf/b$a;->a:I

    or-int/2addr v0, v1

    iput v0, p0, Lvf/b$a;->a:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method
