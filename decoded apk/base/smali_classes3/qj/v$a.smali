.class final Lqj/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljj/e<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lqj/v;


# direct methods
.method constructor <init>(Lqj/v;)V
    .locals 0

    iput-object p1, p0, Lqj/v$a;->a:Lqj/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lqj/v$a;->a:Lqj/v;

    iget-object v0, v0, Lqj/v;->b:Ljj/e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The zipper returned a null value"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
